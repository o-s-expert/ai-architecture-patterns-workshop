# Next Steps

After the five labs, continue with the framework capabilities used along the way and with further architecture patterns.

## Framework capabilities

Declarative **AI Services** are a framework feature, not a separate lab. You used them in Labs 1 and 2, and they appear in every lab. An AI service is an interface whose methods represent interactions with an LLM; the framework supplies the implementation, and CDI integration makes it an injectable component.

| Capability | Purpose |
|---|---|
| AI Services | Declare model interactions as interfaces |
| `@SystemMessage` | Standing instructions for the model |
| `@UserMessage` | Marks the user input of a method |
| `@V` | Binds a method parameter to a template variable in a prompt |
| `@MemoryId` | Selects the conversation memory for a call (Lab 2) |
| `@RegisterAIService` | Registers an interface as a CDI AI service (LangChain4j CDI) |
| `@Tool` | Exposes an application method the model may request |
| CDI integration | Injection, scopes, and producers for AI components |

Trade-offs to keep in mind:

- **Productivity vs. transparency:** less boilerplate, but the generated implementation hides details.
- **Prompt location:** prompts in annotations are easy to find but harder to change at runtime.
- **Tool safety:** tools execute real code; restrict and validate what the model can invoke.

- [LangChain4j AI Services](https://docs.langchain4j.dev/tutorials/ai-services/)
- [LangChain4j tools](https://docs.langchain4j.dev/tutorials/tools/)

## Additional architecture patterns

### Advanced RAG and Vector Databases

Lab 3 uses a local embedding model and an in-memory store. To see how the same architecture extends to persistent enterprise data, read [Introduction to Retrieval-Augmented Generation with Java and MongoDB](https://foojay.io/today/introduction-to-retrieval-augmented-generation-with-java-and-mongodb/), which builds an HR policy RAG application with Java, LangChain4j, CDI, and MongoDB Atlas. It is optional reading; it does not replace or extend the Lab 3 exercise.

### Reflection

Lab 4 implements evaluation and refinement loops: a reviewer critiques a draft against criteria and the generator revises it, within a Java-enforced limit. Extensions include deterministic validators, scoring models, and dedicated evaluator pipelines. See [Lab 4](labs/lab4-reflection.md).

### Explicit Planning

[Lab 5](labs/lab5-planning.md) uses model-directed tool calling: the model picks the next tool one step at a time. A plan-first architecture would instead generate a structured plan, validate it, request approval if needed, execute approved steps deterministically, observe the results, and re-plan when necessary. Lab 5 does not implement these stages.

### ReAct

Dynamic reasoning and tool execution based on observations. The model alternates between reasoning, calling a tool, and observing the result. Lab 5 is already a ReAct-like loop in this sense; richer ReAct designs add explicit reasoning traces and stronger guardrails.

- [ReAct paper](https://arxiv.org/abs/2210.03629)

### Multi-Agent Architectures

Coordinate specialized agents across responsibilities and domains, for example a planner, a researcher using RAG ([Lab 3](labs/lab3-rag.md)), and a reviewer. Isolated memory ([Lab 2](labs/lab2-memory.md)) and explicit contracts between agents keep systems understandable.

- [LangChain4j agents](https://docs.langchain4j.dev/tutorials/agents/)

### Model Context Protocol (MCP)

Standardize access to external tools, resources, and capabilities. MCP is an **integration protocol**, not an autonomous planning pattern, not a higher autonomy level: it defines how tools and data are exposed, and can be used by simple assistants or by advanced agents alike. It complements tool calling.

- [Model Context Protocol](https://modelcontextprotocol.io/)

## Further resources

- [LangChain4j documentation](https://docs.langchain4j.dev/)
- [Workshop repository](https://github.com/O-S-Expert/ai-architecture-patterns-workshop)
