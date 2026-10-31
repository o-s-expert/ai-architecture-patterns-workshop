/**
 * Lab 5 - Planning and tool execution: AI-driven customer support.
 *
 * <p>Scenario: a customer asks to cancel an order. Resolving it takes dependent steps:
 * look up the customer by email, find the active order, cancel it, and report the result.
 *
 * <p>{@link os.expert.lab5.CustomerResolutionAgent} is a declarative LangChain4j AI Service
 * registered with {@code @RegisterAIService} and integrated through CDI.
 * {@link os.expert.lab5.EnterpriseTools} exposes deterministic Java operations as
 * {@code @Tool} methods. The model selects which tool to call next and receives each
 * result, a ReAct-like tool-calling loop run by LangChain4j.
 *
 * <p>This is model-directed tool calling, not explicit planning: there is no separate plan,
 * plan validation, or plan executor. The system prompt describes a workflow but does not
 * enforce it.
 *
 * <p>The tools are mocks. Production code must authenticate callers, authorize operations,
 * verify order ownership, validate arguments, and guard against duplicate cancellations;
 * a prompt is not a security boundary.
 *
 * <p>Entry point: {@link os.expert.lab5.AgentMain}.
 */
package os.expert.lab5;
