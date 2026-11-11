---
title: Model Providers
hide:
  - toc
---

<h1 class="os-sr-only">Model Providers</h1>

<div class="os-prov-hero" markdown="0">
<div class="os-prov-hero-text">
<p class="os-eyebrow">Model Providers</p>
<h1>Choose Your AI Provider</h1>
<p class="os-tagline">One workshop. Five labs. Multiple providers.</p>
<p>Configure your preferred AI provider once and use the same Enterprise Java architecture throughout the workshop.</p>
</div>
<img class="os-prov-hero-art" src="../assets/images/providers/hero-java-to-cloud.svg" alt="Illustration: a laptop running an Enterprise Java application connected to a cloud AI provider" width="360" height="200">
</div>

<div class="os-prov-grid" markdown="0">
<a class="os-prov-card" href="gemini/">
<img class="os-logo" src="../assets/images/providers/gemini.svg" alt="Google Gemini logo" width="40" height="40">
<strong>Google Gemini</strong>
<span class="os-desc">The original workshop provider, with cloud-hosted models and Gemini API integration.</span>
<span class="os-pill">Cloud</span><span class="os-more">Configure →</span>
</a>
<a class="os-prov-card" href="openai/">
<img class="os-logo" src="../assets/images/providers/openai.svg" alt="OpenAI logo" width="40" height="40">
<strong>OpenAI</strong>
<span class="os-desc">Use the OpenAI API with LangChain4j.</span>
<span class="os-pill">Cloud</span><span class="os-more">Configure →</span>
</a>
<a class="os-prov-card" href="anthropic/">
<img class="os-logo" src="../assets/images/providers/claude.svg" alt="Claude logo" width="40" height="40">
<strong>Anthropic Claude</strong>
<span class="os-desc">Use Anthropic's API with LangChain4j.</span>
<span class="os-pill">Cloud</span><span class="os-more">Configure →</span>
</a>
<a class="os-prov-card" href="openai-compatible/">
<img class="os-logo" src="../assets/images/providers/openai-compatible.svg" alt="Generic integration icon" width="40" height="40">
<strong>OpenAI-Compatible APIs</strong>
<span class="os-desc">Connect to other services exposing compatible chat-completion interfaces.</span>
<span class="os-pill compat">Compatible</span><span class="os-more">Configure →</span>
</a>
<a class="os-prov-card" href="ollama/">
<img class="os-logo" src="../assets/images/providers/ollama.svg" alt="Ollama logo" width="40" height="40">
<strong>Local Models (Ollama)</strong>
<span class="os-desc">Run supported models locally without purchasing cloud API credits.</span>
<span class="os-pill local">Local</span><span class="os-more">Configure →</span>
</a>
</div>

## Which option is right for you?

<div class="os-prov-table" markdown="block">

| Provider | Best for | API key required? | Tool calling | Cost profile |
|---|---|---|---|---|
| [Google Gemini](gemini.md) | The verified default path | Yes (`GEMINI_API_KEY`) | Model-dependent; verified for Lab 5 with the configured model | Cloud API; check Google's current terms and quotas |
| [OpenAI](openai.md) | Participants with OpenAI API access | Yes (`OPENAI_API_KEY`) | Model-dependent; not yet tested here | Cloud API billing, separate from ChatGPT |
| [Anthropic Claude](anthropic.md) | Participants with Anthropic API access | Yes (`ANTHROPIC_API_KEY`) | Verified for Labs 1 to 5 with current Claude models | Cloud API billing, separate from Claude subscriptions |
| [OpenAI-Compatible APIs](openai-compatible.md) | Gateways and hosted or self-hosted compatible services | Usually; depends on the service | Varies by service and model | Depends on the service |
| [Local Models (Ollama)](ollama.md) | Offline work, no cloud inference charges | No | Only for models that support tools; not yet tested here | No cloud charges; requires adequate hardware |

</div>

Tool calling matters most for [Lab 5](../labs/lab5-planning.md). Always confirm that your chosen model supports it before you rely on it.

## How it works

<ol class="os-prov-steps">
<li><b>1</b><strong>Choose Provider</strong>Set <code>workshop.ai.provider</code></li>
<li><b>2</b><strong>Configure Credentials</strong>Add variables to <code>.env</code></li>
<li><b>3</b><strong>Test Connection</strong>Run <code>ProviderConnectionCheck</code></li>
<li><b>4</b><strong>Start Lab 1</strong>No Java changes needed</li>
</ol>

<div class="os-prov-notice" markdown="block" role="note">
**Important**

ChatGPT, Claude, and GitHub Copilot subscriptions do not automatically provide API access for custom Java applications. Verify your API access, available credits, and model capabilities before starting the labs.

Local models can remove cloud inference charges but still require adequate hardware.
</div>

## How provider selection works

The lab code never names a provider. It only injects LangChain4j AI Services, and the LangChain4j CDI extension builds **one** `ChatModel` bean from configuration.

`src/main/resources/META-INF/microprofile-config.properties` contains only the selector:

```properties
workshop.ai.provider=gemini
smallrye.config.locations=config/providers/${workshop.ai.provider}.properties
```

`smallrye.config.locations` loads exactly one file from `config/providers/`, so exactly one `ChatModel` is configured. To switch provider, set `WORKSHOP_AI_PROVIDER` in your `.env` (or the environment) and add that provider's variables:

```dotenv
WORKSHOP_AI_PROVIDER=openai
OPENAI_API_KEY=your-key
OPENAI_MODEL=your-model-id
```

No Java class changes. Run everything from the repository root, because the path is relative to the working directory.

!!! warning "Provider-specific properties"
    Each file sets only properties its model builder supports. An unknown property makes startup fail. For example, `return-thinking` and `send-thinking` exist only for Gemini, so they live only in `gemini.properties`.

## Next

- Pick a guide above, then run the [connection test](../getting-started.md#7-test-the-connection).
- Then continue to [Lab 1](../labs/lab1-hello-world.md).
