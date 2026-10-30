# Lab 5: Planning

<span class="lab-meta">Duration: 45 minutes · Enterprise Java · LangChain4j · CDI</span>

## Introduction

Complex goals require multiple steps. In the Planning pattern, the model proposes a plan while your application remains in control of execution.

**Objective:** Introduce the Planning architecture pattern.

## Learning objectives

By the end of this lab you will be able to:

- Explain the Planning pattern and its components
- Define a structured plan representation
- Validate LLM-generated plans before execution
- Execute validated plans with deterministic code

## Architectural concept

The model is used to *decide* what to do; ordinary code is used to *do* it. A plan is structured data, checked against business rules, and executed by a deterministic executor.

```text
User Goal → AI Planner → Structured Plan → Validation → Deterministic Executor → Result
```

!!! warning
    LLM-generated plans must be validated before execution. Never execute model output directly.

## Prerequisites

- Completed [Lab 4](lab4-rag.md)
- Understanding of the tools and services from earlier labs

## Step-by-step implementation

1. **Define the plan model** — describe steps and allowed actions as structured types.
2. **Generate the plan** — ask the planner to return the structure.
3. **Validate** — check actions, parameters, and policies.
4. **Execute** — run validated steps deterministically and report the result.

!!! note "Implementation pending"
    The Java sources for this lab are not available yet. Detailed instructions, code listings, and commands will be added once the lab implementation is verified against the actual dependencies and framework APIs.

## Running the lab

!!! note "Implementation pending"
    Run instructions will be documented after the lab code is added to the repository.

## Expected results

A goal should produce a validated plan and a deterministic execution result; invalid plans should be rejected. Verified results will be documented later.

!!! note "Implementation pending"
    Verified sample output will be published with the implementation.

## Architectural trade-offs

- **Control vs. flexibility:** strict validation limits what the model can do but increases safety.
- **Failure handling:** plans can be wrong, incomplete, or unsafe; define retries and fallbacks.
- **Complexity:** planning adds components compared with a single prompt.

## Further reading

- [LangChain4j documentation](https://docs.langchain4j.dev/)
- [Next Steps](../next-steps.md)

---

[Continue to Next Steps](../next-steps.md)
