/**
 * Lab 4 - Reflection architecture: generate, evaluate, refine.
 *
 * <p>The book recommendation use case runs a bounded feedback loop. A generator
 * ({@link os.expert.lab4.RecommendationGenerator}) drafts recommendations and
 * refines them from feedback; a reviewer ({@link os.expert.lab4.RecommendationReviewer})
 * evaluates them against quality criteria. Both are CDI-managed LangChain4j AI
 * Services backed by Google Gemini and exchange structured Java records.
 *
 * <p>{@link os.expert.lab4.ReflectionService} keeps the control flow deterministic:
 * it enforces the refinement limit, returns approved results, and fails explicitly
 * otherwise. {@link os.expert.lab4.ReflectionApp} is the standalone entry point.
 *
 * <p>Trade-offs: each iteration adds latency and cost, and an LLM evaluator is a
 * probabilistic judge, not factual verification.
 */
package os.expert.lab4;
