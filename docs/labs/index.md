# Labs

Five hands-on labs build on a shared scenario and project structure. All exercises use **Enterprise Java, LangChain4j, and CDI**, and are intended to share the same application context.

## Learning progression

**LLM Integration → Memory → Declarative AI Services → RAG → Planning**

## Overview

| Lab | Focus | Duration | Prerequisite |
|---|---|---|---|
| [Lab 1: Hello World](lab1-hello-world.md) | Connect Java to an LLM with CDI | 20 minutes | [Getting Started](../getting-started.md) |
| [Lab 2: Memory](lab2-memory.md) | Conversational memory and session isolation | 25 minutes | Lab 1 |
| [Lab 3: Annotations](lab3-annotations.md) | Declarative AI services, prompts, and tools | 25 minutes | Lab 2 |
| [Lab 4: RAG](lab4-rag.md) | Retrieval-Augmented Generation | 45 minutes | Lab 3 |
| [Lab 5: Planning](lab5-planning.md) | Generate, validate, and execute plans | 45 minutes | Lab 4 |

## Purpose and outcomes

### Lab 1: Hello World

Establish the model integration boundary and a simple, deterministic DAG workflow. *Outcome:* a CDI-managed AI service that returns structured recommendations, with the Java application controlling the execution path.

### Lab 2: Memory

Provide application-managed conversational context per session. *Outcome:* a conversation-aware assistant with bounded, session-isolated chat memory.

### Lab 3: Annotations

Replace manual prompt code with declarative services. *Outcome:* an injectable AI service with prompts and tools.

### Lab 4: RAG

Ground answers in business knowledge. *Outcome:* retrieval of relevant context to improve responses.

### Lab 5: Planning

Combine AI reasoning with deterministic control. *Outcome:* validated structured plans executed safely.

## Recommended order

Complete the labs sequentially; each one extends the previous. Total estimated time: about 160 minutes of lab work within the four-hour workshop.

!!! note
    The Java implementations are not yet available. Each lab page currently describes the concept and structure; code and verified results will be added later.
