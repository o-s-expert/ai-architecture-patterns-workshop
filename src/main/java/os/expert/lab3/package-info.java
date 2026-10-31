/**
 * Lab 3 - Retrieval-Augmented Generation (RAG) with declarative AI Services.
 *
 * <p>Use case: an HR policy assistant that answers employee questions, such as
 * the hardware stipend limit, from a 2026 policy document instead of from the
 * model's general knowledge.
 *
 * <p>RAG has two phases:
 * <ul>
 *   <li><b>Ingestion</b> - {@link os.expert.lab3.RagMain} splits the policy and embeds each
 *       segment with a local embedding model into an in-memory embedding store.</li>
 *   <li><b>Retrieval and generation</b> - on each question the named retriever embeds the
 *       query, finds similar segments, and the retrieved context is injected into the prompt
 *       sent to Google Gemini.</li>
 * </ul>
 *
 * <p>{@link os.expert.lab3.RagArchitectureFactory} produces the infrastructure as CDI beans:
 * the local embedding model, the in-memory embedding store, and a {@code ContentRetriever}
 * named {@code hrPolicyRetriever}.
 *
 * <p>{@link os.expert.lab3.HRPolicyAgent} is registered declaratively with
 * {@code @RegisterAIService(contentRetrieverName = "hrPolicyRetriever")}. The LangChain4j CDI
 * extension assembles the AI Service from the Gemini chat model and the retriever whose CDI
 * name matches. A mismatched name is not reported as an error; the service is created without
 * retrieval.
 *
 * <p>Grounding limits: retrieval can miss relevant text, {@code minScore} is a similarity
 * threshold and not a correctness probability, and prompt rules guide but do not guarantee
 * model behavior.
 *
 * <p>Entry point: {@link os.expert.lab3.RagMain}.
 *
 * @see <a href="https://foojay.io/today/introduction-to-retrieval-augmented-generation-with-java-and-mongodb/">
 *      Additional reading: RAG with Java and MongoDB</a>
 */
package os.expert.lab3;
