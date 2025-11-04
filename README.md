## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.


Documentation: Folder Structure

Purpose:
Provide a clear, concise overview of the repository layout so contributors and users can quickly find source code, tests, documentation, configuration, and build artifacts.

What to include in this section:
- A short description of the role/purpose of each top-level folder and notable files.
- A minimal visual tree showing the main folders (helps quick scanning).
- Notes about where to run/build/test the project and any important files (e.g., entrypoints, config templates).
- Any folders that are generated (build, dist) and should be ignored by version control.
- Links to deeper documentation (e.g., docs/, API reference) or contribution guidelines.

Suggested template (replace placeholders with project-specific names and descriptions):
- src/ or backend/        — server-side source code and services; entrypoint: <file>
- frontend/               — client-side UI source; build instructions: <command>
- tests/                  — unit and integration tests; run: <test command>
- docs/                   — design docs, API reference, user guides
- scripts/                — helper scripts for setup, migrations, deployments
- data/ or fixtures/      — sample datasets, test fixtures (if applicable)
- config/                 — configuration files and examples (.env.example)
- build/ or dist/         — generated artifacts (do not commit)
- .github/                — CI workflows and issue/PR templates
- README.md, LICENSE      — project overview and licensing

Minimal example tree to include (optional):
/ (project root)
├─ backend/          # API, server-side code
├─ frontend/         # client application
├─ tests/            # test suites
├─ docs/             # documentation
├─ scripts/          # helper utilities
└─ README.md

Guidelines:
- Keep the folder descriptions short (1–2 lines each).
- Update this section whenever the repository layout changes.
- Point to more detailed docs for complex areas (e.g., CONTRIBUTING.md, docs/architecture.md).
-->
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
