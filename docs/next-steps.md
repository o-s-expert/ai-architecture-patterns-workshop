# Next Steps

After the five labs, these patterns extend what you built. Each builds on or complements the concepts of integration, memory, declarative services, retrieval, and planning.

## Reflection

Use evaluation and refinement loops to improve generated outputs: a model (or a separate evaluator) critiques a draft against criteria, and the result is revised. It builds on [Lab 3](labs/lab3-annotations.md) services and [Lab 5](labs/lab5-planning.md) validation.

## ReAct

Dynamic reasoning and tool execution based on observations. The model alternates between reasoning, calling a tool, and observing the result. It extends the tool integration of Lab 3, but gives the model more autonomy than a fixed plan from Lab 5, so guardrails matter.

- [ReAct paper](https://arxiv.org/abs/2210.03629)

## Multi-Agent Architectures

Coordinate specialized agents across responsibilities and domains, for example a planner, a researcher using RAG ([Lab 4](labs/lab4-rag.md)), and a reviewer. Isolated memory ([Lab 2](labs/lab2-memory.md)) and explicit contracts between agents keep systems understandable.

- [LangChain4j agents](https://docs.langchain4j.dev/tutorials/agents/)

## Model Context Protocol (MCP)

Standardize access to external tools, resources, and capabilities. MCP is an **integration protocol**, not a higher autonomy level: it defines how tools and data are exposed, and can be used by simple assistants or by advanced agents alike. It complements the tool concepts from Lab 3.

- [Model Context Protocol](https://modelcontextprotocol.io/)

## Further resources

- [LangChain4j documentation](https://docs.langchain4j.dev/)
- [Workshop repository](https://github.com/O-S-Expert/ai-architecture-patterns-workshop)
