# Lab 3: Annotations

<span class="lab-meta">Duration: 25 minutes · Enterprise Java · LangChain4j · CDI</span>

## Introduction

Manual prompt assembly quickly becomes repetitive. This lab introduces declarative AI services, where an interface describes the desired behavior and the framework supplies the implementation.

**Objective:** Introduce declarative LangChain4j AI services and their integration with CDI.

## Learning objectives

By the end of this lab you will be able to:

- Describe what an AI service is and when to use it
- Express prompts declaratively
- Understand annotation-based configuration
- Introduce tool integration for calling application code

## Architectural concept

An **AI service** is an interface whose methods represent interactions with an LLM. Annotations define system and user prompts, and tools expose application methods the model may request. Integrating the service with CDI makes it an injectable component alongside the rest of the application.

```text
Injected AI service interface → Generated implementation → Prompt + tools → LLM
```

## Prerequisites

- Completed [Lab 2](lab2-memory.md)
- Understanding of Java interfaces and annotations

## Step-by-step implementation

1. **Verify dependencies** — confirm which LangChain4j and CDI integration modules and APIs are available.
2. **Define an AI service interface** — declare methods and prompts.
3. **Register the service with CDI** — make it injectable.
4. **Add a tool** — expose a simple application method to the model.

!!! note "Implementation pending"
    The Java sources for this lab are not available yet. Detailed instructions, code listings, and commands will be added once the lab implementation is verified against the actual dependencies and framework APIs.

## Running the lab

!!! note "Implementation pending"
    Run instructions will be documented after the lab code is added to the repository.

## Expected results

The declarative service should return model responses without hand-written prompt plumbing. Results will be documented after the integration is verified.

!!! note "Implementation pending"
    Verified sample output will be published with the implementation.

## Architectural trade-offs

- **Productivity vs. transparency:** less boilerplate, but the generated implementation hides details.
- **Prompt location:** prompts in annotations are easy to find but harder to change at runtime.
- **Tool safety:** tools execute real code; restrict and validate what the model can invoke.

## Further reading

- [LangChain4j AI Services](https://docs.langchain4j.dev/tutorials/ai-services/)
- [LangChain4j tools](https://docs.langchain4j.dev/tutorials/tools/)

---

[Continue to Lab 4](lab4-rag.md)
