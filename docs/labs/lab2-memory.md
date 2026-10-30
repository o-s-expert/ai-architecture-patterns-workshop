# Lab 2: Memory

<span class="lab-meta">Duration: 25 minutes · Enterprise Java · LangChain4j · CDI</span>

## Introduction

LLMs are stateless: each request contains everything the model knows about the conversation. This lab adds memory so the application can hold a coherent multi-turn dialogue, and ensures that different users never share each other's context.

**Objective:** Introduce conversational memory, context management, and session isolation.

## Learning objectives

By the end of this lab you will be able to:

- Distinguish model context from application-managed conversational state
- Configure a bounded chat memory
- Isolate memory per user or session
- Reason about context window limits and cost

## Architectural concept

**Model context** is the text sent to the model in a single request, bounded by the context window. **Conversational state** is what your application stores between requests and selects into that context. Memory components decide what to retain (for example, the last N messages), while session identifiers decide *whose* memory to use.

```text
Request + session id → Memory store → Context window → LLM → Response → Memory update
```

## Prerequisites

- Completed [Lab 1](lab1-hello-world.md)
- Familiarity with CDI scopes (request, session, application)

## Step-by-step implementation

1. **Choose a memory strategy** — for example a sliding window of recent messages.
2. **Identify the session** — define how a memory identifier is derived per user.
3. **Wire memory into the service** — combine the chat model with the memory store.
4. **Verify isolation** — confirm two sessions do not share context.

!!! note "Implementation pending"
    The Java sources for this lab are not available yet. Detailed instructions, code listings, and commands will be added once the lab implementation is verified against the actual dependencies and framework APIs.

## Running the lab

!!! note "Implementation pending"
    Run instructions will be documented after the lab code is added to the repository.

## Expected results

The assistant should reference earlier turns of the same session and remain unaware of other sessions. Verified transcripts will be added after implementation.

!!! note "Implementation pending"
    Verified sample output will be published with the implementation.

## Architectural trade-offs

- **Context size vs. cost:** retaining more history increases tokens, latency, and cost.
- **Storage:** in-memory storage is simple but not durable or cluster-safe.
- **Privacy:** stored conversations may contain sensitive data and need retention policies.

## Further reading

- [LangChain4j documentation](https://docs.langchain4j.dev/)
- [Jakarta CDI specification](https://jakarta.ee/specifications/cdi/)

---

[Continue to Lab 3](lab3-annotations.md)
