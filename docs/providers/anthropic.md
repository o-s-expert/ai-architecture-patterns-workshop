# Anthropic Claude

!!! note "Tested"
    The connection check and Labs 1 to 5 were run against `claude-opus-5-5`, `claude-sonnet-5-5` and `claude-haiku-5-5`, one run per lab and model, with LangChain4j 1.22.0 and the lab code as published in these pages. Model output varies between runs; re-check after changing the model or library version.

## 1. Why choose this provider?

- You already have Anthropic **API** access and credits.
- You want to run the same labs with a Claude model.

A Claude subscription does not automatically provide Anthropic API credits.

## 2. Requirements

- An Anthropic API key with available credits.
- A Claude model id available to your account. No default is set because ids change; use one from Anthropic's current model list that supports tool use.

## 3. Maven dependency

Already in `pom.xml` (managed by the LangChain4j BOM, 1.22.0):

```xml
<dependency>
    <groupId>dev.langchain4j</groupId>
    <artifactId>langchain4j-anthropic</artifactId>
</dependency>
```

## 4. Environment variables

```dotenv
WORKSHOP_AI_PROVIDER=anthropic
ANTHROPIC_API_KEY=your-anthropic-api-key
ANTHROPIC_MODEL=your-model-id
```

## 5. MicroProfile Config configuration

`config/providers/anthropic.properties` uses `AnthropicChatModel`:

```properties
dev.langchain4j.cdi.plugin.chat-model.class=dev.langchain4j.model.anthropic.AnthropicChatModel
dev.langchain4j.cdi.plugin.chat-model.config.api-key=${ANTHROPIC_API_KEY}
dev.langchain4j.cdi.plugin.chat-model.config.model-name=${ANTHROPIC_MODEL}
dev.langchain4j.cdi.plugin.chat-model.config.max-tokens=2048
dev.langchain4j.cdi.plugin.chat-model.config.max-retries=0
dev.langchain4j.cdi.plugin.chat-model.config.timeout=PT60S
```

`max-tokens` caps the response length; raise it if answers are truncated.

No `temperature` is set on purpose: current Claude models reject sampling parameters (`temperature`, `top_p`, `top_k`) with `400 invalid_request_error: temperature is deprecated for this model`.

## 6. Test the connection

```bash
mvn -q compile
mvn exec:java -Dexec.mainClass=os.expert.setup.ProviderConnectionCheck
```

This confirms basic inference only. See [Getting Started](../getting-started.md#7-test-the-connection).

## 7. Known limitations

- **Structured output (Labs 1, 4):** no JSON-schema mode is enabled here, so LangChain4j relies on prompt-based JSON. Verify with your model.
- **Tool calling (Lab 5):** model-dependent; verify the multi-step flow. Gemini's thought-signature properties do not apply to Claude and are not included.

## 8. Troubleshooting

| Symptom | Suggestion |
|---|---|
| Startup fails with an unresolvable property | `ANTHROPIC_API_KEY` or `ANTHROPIC_MODEL` is not set. |
| HTTP 400 `temperature is deprecated for this model` | A sampling parameter was added to the properties file; remove it. |
| HTTP 401 | Invalid key. |
| HTTP 404 / model not found | The model id is wrong or unavailable to your account. |
| HTTP 429 or credit errors | Rate limit or no credits; check Anthropic billing. |
| Truncated answers | Increase `max-tokens`. |

## 9. Return to Lab 1

[Continue to Lab 1](../labs/lab1-hello-world.md) or [choose another provider](index.md).
