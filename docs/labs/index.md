# Labs

Five hands-on labs build one progression: **DAG → Memory → RAG → Reflection → Planning**. All exercises use **Enterprise Java, LangChain4j, CDI, and Google Gemini**.

Each lab gives step-by-step instructions so you create every required Java source file yourself. The instructor's reference implementations are not published; the tutorials contain the complete code you need.

## Overview

| Lab | Duration | Problem | Architectural learning objective |
|---|---|---|---|
| [Lab 1 — DAG: AI Book Recommendations](lab1-hello-world.md) | 20 min | Recommend what to read next without a hand-curated catalog | A deterministic Java workflow that integrates probabilistic model output |
| [Lab 2 — Conversational Memory](lab2-memory.md) | 25 min | LLM calls forget earlier requests, and users must not see each other's context | Application-managed context and session isolation |
| [Lab 3 — Retrieval-Augmented Generation](lab3-rag.md) | 45 min | Models do not know your private or recent documents | External knowledge, retrieval, and grounding |
| [Lab 4 — Reflection Architecture](lab4-reflection.md) | 30 min | A single draft is unchecked and may miss criteria | Generate, evaluate, and refine with bounded iteration |
| [Lab 5 — Planning Architecture](lab5-planning.md) | 40 min | Multi-step goals need more than one prompt | Model-directed tool calling with Java-implemented enterprise tools; explicit plan-first design as a next step |

Total lab time is about 160 minutes within the four-hour workshop.

## Learning progression

The order is an educational progression, not a strict ranking of AI autonomy. Memory and RAG manage **context**. Reflection adds **feedback-driven iteration**. Lab 5 adds **model-directed tool selection**. See the [homepage diagram](../index.md#architecture-progression).

## Recommended order

Complete the labs sequentially; each one builds on the previous. Annotations and declarative AI Services are used throughout and summarized in [Next Steps](../next-steps.md).

!!! note "Tutorial status"
    All five labs are complete step-by-step tutorials. Lab 5 implements model-directed tool calling (a ReAct-like loop), not a full plan-first architecture.
