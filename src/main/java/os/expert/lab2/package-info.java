/**
 * Lab 2 - Conversational Memory and Session Isolation.
 *
 * <p>LLM requests are stateless: the model does not remember earlier calls. Conversational
 * memory is context managed by the application and supplied with each request.
 *
 * <ul>
 *   <li>{@link dev.langchain4j.service.MemoryId} on {@link os.expert.lab2.SessionAwareAgent}
 *       selects the conversation, isolating sessions from each other.</li>
 *   <li>A {@link dev.langchain4j.memory.chat.ChatMemoryProvider} creates one
 *       {@link dev.langchain4j.memory.chat.MessageWindowChatMemory} per session ID;
 *       AI Services caches it for later calls.</li>
 *   <li>{@link os.expert.lab2.SessionAgentFactory} is a CDI bean whose producer method builds
 *       the AI service from the injected chat model.</li>
 *   <li>{@link os.expert.lab2.AgentApp} is the Java SE entry point; it starts Weld SE and runs
 *       {@link os.expert.lab2.ChatEndpoint}.</li>
 * </ul>
 *
 * <p>Lifecycle and limitations: memory is bounded by a message window, held in the JVM, lost
 * on restart, and not safe by itself for concurrent calls sharing one session ID. A session ID
 * is not an authorization mechanism.
 *
 * <p>The Java application controls the execution flow; the model only generates responses.
 */
package os.expert.lab2;
