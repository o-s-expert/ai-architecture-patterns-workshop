# Lab 4: RAG

<span class="lab-meta">Duration: 45 minutes · Enterprise Java · LangChain4j · CDI</span>

## Introduction

Models do not know your private or recent data. Retrieval-Augmented Generation (RAG) supplies relevant information at question time so answers are grounded in your own content.

**Objective:** Introduce Retrieval-Augmented Generation and external knowledge retrieval.

## Learning objectives

By the end of this lab you will be able to:

- Explain the RAG flow end to end
- Describe documents, embeddings, and vector similarity
- Retrieve relevant content for a query
- Produce grounded responses and recognize their limits

## Architectural concept

RAG splits knowledge access from generation. Documents are split into segments and converted to **embeddings**. At query time the question is embedded, **vector similarity** finds the closest segments, and these are added to the prompt as context.

```text
User Query → Retrieval → Relevant Context → LLM → Response
```

## Prerequisites

- Completed [Lab 3](lab3-annotations.md)
- A small set of business documents to index

## Step-by-step implementation

1. **Prepare documents** — choose and load source content.
2. **Create embeddings** — convert segments into vectors and store them.
3. **Configure retrieval** — select how many and which segments to return.
4. **Augment the prompt** — combine the retrieved context with the user query.

!!! note "Implementation pending"
    The Java sources for this lab are not available yet. Detailed instructions, code listings, and commands will be added once the lab implementation is verified against the actual dependencies and framework APIs.

## Running the lab

!!! note "Implementation pending"
    Run instructions will be documented after the lab code is added to the repository.

## Expected results

Answers should reflect the indexed content and avoid unsupported claims. Verified examples will be added after implementation.

!!! note "Implementation pending"
    Verified sample output will be published with the implementation.

## Architectural trade-offs

- **Quality of retrieval:** poor chunking or ranking leads to poor answers.
- **Freshness:** the index must be updated as source content changes.
- **Infrastructure:** vector storage adds operational components.

## Further reading

- [LangChain4j RAG](https://docs.langchain4j.dev/tutorials/rag/)
- [Gemini embeddings](https://ai.google.dev/gemini-api/docs/embeddings)

---

[Continue to Lab 5](lab5-planning.md)
