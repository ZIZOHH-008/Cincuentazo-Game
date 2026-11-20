# AGENTS.md

## Project shape
- Single Maven module; use `./mvnw` (wrapper pins Maven 3.8.5), not a system `mvn`. `README.md` is the Spanish assignment/user-story spec, not setup docs.
- JavaFX 21.0.6, compiler source/target 9. Module name and root package are both `org.example.CincuentazoGame`; code is under `src/main/java/org/example/CincuentazoGame/{Controllers,Models,Views}`.
- Startup path: `Launcher.main()` -> `Application.launch(WelcomeView.class)` -> `/org/example/CincuentazoGame/WelcomeView.fxml`. Only that FXML exists (currently an empty `AnchorPane`); views/controllers are empty, and `Game` orchestration is stubs (`Deck`/`Hand` have partial implementations).
- `module-info.java` opens `Views` to `javafx.graphics` and `Controllers` to `javafx.fxml`; keep those when adding FXML controllers. FXML lives under `src/main/resources/org/example/CincuentazoGame/` and is loaded via absolute `/org/example/...` resource paths.

## Commands / gotchas
- `./mvnw test` compiles but silently runs 0 JUnit 5 tests: Surefire resolves to 2.12.4 (JUnit 3 provider) while the pom declares JUnit Jupiter 5.12.1. Run tests with `./mvnw org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test` (add `-Dtest=ClassName` for one test).
- `./mvnw javafx:run` currently fails with `java.lang.module.FindException: Module org.example._0azo not found`: the pom `<mainClass>` still references the pre-rename module. Correct value: `org.example.CincuentazoGame/org.example.CincuentazoGame.Views.WelcomeView` (or `.../Launcher`).
- No CI, lint, formatter, codegen, or pre-commit config exists; verification is compile via `./mvnw test` plus the explicit Surefire invocation above.
