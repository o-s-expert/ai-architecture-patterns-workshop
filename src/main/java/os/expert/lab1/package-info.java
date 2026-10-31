/**
 * Lab 1 - Your First AI Application: Book Recommendations.
 *
 * <p>Given a book the reader has finished, the application asks Gemini for up to three
 * follow-up books and prints them.
 *
 * <ul>
 *   <li>Deterministic DAG execution: the Java code defines every step; the model only
 *       generates content.</li>
 *   <li>CDI-managed AI service: {@link os.expert.lab1.NextReadBookService} is an interface
 *       whose implementation LangChain4j CDI generates.</li>
 *   <li>Gemini integration: the chat model is registered from MicroProfile Config.</li>
 *   <li>Structured output: the response is mapped to {@link os.expert.lab1.NextReadBooks},
 *       {@link os.expert.lab1.Recommendation}, and {@link os.expert.lab1.Book}.</li>
 *   <li>Probabilistic output within a predefined workflow: recommendations may vary between
 *       runs, and they are not verified against a catalog.</li>
 * </ul>
 *
 * <p>Entry point: {@link os.expert.lab1.BookApp}.
 */
package os.expert.lab1;
