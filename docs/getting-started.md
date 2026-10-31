# Getting Started

Prepare your environment before starting the labs. This takes about 15–20 minutes.

## 1. Workshop prerequisites

- Working knowledge of Java and object-oriented design
- Basic familiarity with Maven and Git
- A Google account to obtain a Gemini API key
- A stable internet connection

## 2. Required software

| Tool | Purpose |
|---|---|
| Java Development Kit (JDK) | Java 21 or newer is required to compile and run the labs. |
| Apache Maven | Build and dependency management |
| IntelliJ IDEA (or another Java IDE) | Development environment |
| Git | Clone the repository |
| Google Gemini API | The LLM provider used by the labs |

The labs use **LangChain4j** and **CDI**; their dependencies are managed by Maven and require no separate installation.

## 3. Clone the repository

```bash
git clone https://github.com/O-S-Expert/ai-architecture-patterns-workshop.git
cd ai-architecture-patterns-workshop
mvn clean install
```

## 4. Open the project in IntelliJ IDEA

1. Choose **File → Open** and select the repository folder.
2. Let the IDE import the Maven project once the Java build is available.
3. Configure the project SDK to your installed JDK.

## 5. Obtain a Gemini API key

1. Open [Google AI Studio](https://aistudio.google.com/api-keys).
2. Sign in with your Google account.
3. Create an API key and copy it.

Eligible participants can use Gemini's free API tier without a credit card, subject to provider availability and rate limits.

!!! warning "Never commit credentials"
    Do not place your API key in source files, configuration committed to Git, or screenshots. Keep it in the git-ignored `.env` file or in environment variables.

## 6. Configure the API key

Copy the template and set your key in the local `.env` file at the repository root. It is ignored by Git.

```bash
cp .env.example .env
# edit .env:
# GEMINI_API_KEY=your-gemini-api-key
```

SmallRye Config reads `.env` from the working directory, so start the application from the repository root. A real `GEMINI_API_KEY` environment variable, if set, takes precedence over the file.

## 7. Verify the environment

Check the installed tools:

```bash
java -version
mvn -version
git --version
```

Build the project:

```bash
mvn clean verify
```

Run **Lab 0**, a configuration check, from IntelliJ IDEA: open `os.expert.lab0.App` and run its `main` method (working directory: the repository root). It starts Weld SE, registers `AssistantService`, and asks Gemini two questions. The first answer should be *Paris*.

!!! note
    Lab 0 uses `gemini-3.5-flash`, configured in `src/main/resources/META-INF/microprofile-config.properties`. If a model returns HTTP 404 or times out, pick another model available to your key.

## 8. Troubleshooting

| Symptom | Suggestion |
|---|---|
| `java` or `mvn` not found | Verify installation and that the tools are on your `PATH`. |
| API key not detected | Check `.env` exists in the repository root and the app is started from that directory. |
| HTTP 404 for a model | The model is unavailable to your key; change `model-name` in `microprofile-config.properties`. |
| HTTP 429/503 or request timeout | Rate limit or high demand; retry later or use another model. |
| Authentication or quota errors | Check the key in Google AI Studio and review rate limits. |
| Corporate proxy or firewall | Ensure access to Google's API endpoints. |

## 9. Continue to Lab 1

Once your environment is ready, continue to [Lab 1: Hello World](labs/lab1-hello-world.md), or review the [Labs overview](labs/index.md).
