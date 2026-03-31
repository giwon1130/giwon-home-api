# Home Backend Template

Kotlin + Spring Boot starter template for personal backend services.

## Stack
- Kotlin 1.9
- Spring Boot 3.3
- Gradle (Kotlin DSL)
- JUnit 5

## Quick Start
1. Copy env sample.
2. Run local profile.

```bash
cp .env.example .env
./gradlew bootRun --args='--spring.profiles.active=local'
```

## Commands
```bash
./gradlew test
./gradlew build
./gradlew bootRun
```

## Project Structure
```
src/main/kotlin/com/giwon/hometemplate
├── HomeBackendTemplateApplication.kt
├── common/
└── features/
    ├── auth/
    ├── project/
    └── health/
```

## Next Extensions
- Add `bootstrap/` configs (security, db, swagger)
- Add domain folders under `features/<domain>`
- Add Flyway migrations under `src/main/resources/db/migration`
