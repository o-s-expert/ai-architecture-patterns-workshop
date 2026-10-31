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

### Reflection

Use evaluation and refinement loops to improve generated outputs: a model (or a separate evaluator) critiques a draft against criteria, and the result is revised. It builds on [Lab 1](labs/lab1-hello-world.md) services and [Lab 5](labs/lab5-planning.md) validation.

### ReAct

Dynamic reasoning and tool execution based on observations. The model alternates between reasoning, calling a tool, and observing the result. It builds on tool calling, but gives the model more autonomy than a fixed plan from Lab 5, so guardrails matter.

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
