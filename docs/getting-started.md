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
| Java Development Kit (JDK) | Compile and run the labs. Use the version specified in the project build files once available. |
| Apache Maven | Build and dependency management |
| IntelliJ IDEA (or another Java IDE) | Development environment |
| Git | Clone the repository |
| Google Gemini API | The LLM provider used by the labs |

The labs use **LangChain4j** and **CDI**; their dependencies are managed by Maven and require no separate installation.

## 3. Clone the repository

```bash
git clone https://github.com/O-S-Expert/ai-architecture-patterns-workshop.git
cd ai-architecture-patterns-workshop
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
    Do not place your API key in source files, configuration committed to Git, or screenshots. Use environment variables.

## 6. Configure environment variables

=== "macOS / Linux"

    ```bash
    export GEMINI_API_KEY="YOUR_API_KEY"
    ```

=== "Windows PowerShell"

    ```powershell
    $env:GEMINI_API_KEY = "YOUR_API_KEY"
    ```

These settings apply to the current terminal session. If you start the application from IntelliJ IDEA, define the variable in the run configuration as well.

## 7. Verify the environment

Check the installed tools:

```bash
java -version
mvn -version
git --version
```

Confirm the key is set (without printing it):

```bash
test -n "$GEMINI_API_KEY" && echo "GEMINI_API_KEY is set"
```

!!! note "Pending"
    Verification of the application itself (build commands, endpoints, and sample calls) depends on Java code that has not been added yet and will be documented with Lab 1.

## 8. Troubleshooting

| Symptom | Suggestion |
|---|---|
| `java` or `mvn` not found | Verify installation and that the tools are on your `PATH`. |
| API key not detected | Set it in the same terminal or IDE run configuration used to start the app. |
| Authentication or quota errors | Check the key in Google AI Studio and review rate limits. |
| Corporate proxy or firewall | Ensure access to Google's API endpoints. |

## 9. Continue to Lab 1

Once your environment is ready, continue to [Lab 1: Hello World](labs/lab1-hello-world.md), or review the [Labs overview](labs/index.md).
