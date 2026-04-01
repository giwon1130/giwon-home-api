# Home Backend Template

공개용 프로젝트 허브와 자기소개 페이지를 위한 Kotlin + Spring Boot 백엔드입니다.

## Stack
- Kotlin 1.9
- Spring Boot 3.3
- Gradle (Kotlin DSL)
- JUnit 5

## What Included
- `GET /api/profile`: 공개 프로필 정보 제공
- `GET /api/projects`: 공개 프로젝트 카탈로그 제공
- 기존 로그인 API는 템플릿 용도로 유지
- Feature modules use `controller -> service -> parser -> repository` layering

## Quick Start
1. Copy env sample.
2. Run local profile.

```bash
cp .env.example .env
./gradlew bootRun --args='--spring.profiles.active=local'
```

Server default: `http://localhost:8081`

## API
### 1) Profile
```bash
curl http://localhost:8081/api/profile
```

### 2) Get Projects
```bash
curl http://localhost:8081/api/projects
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
    │   ├── controller/
    │   ├── service/
    │   ├── parser/
    │   ├── repository/
    │   ├── model/
    │   └── dto/
    ├── project/
    │   ├── controller/
    │   ├── service/
    │   ├── parser/
    │   ├── repository/
    │   ├── model/
    │   └── dto/
    └── health/
```

## Notes
- This template uses in-memory repositories for demo speed.
- 공개 허브/포트폴리오용 API를 먼저 제공하는 구조다.

## Next Extensions
- profile/projects 데이터를 파일 또는 DB로 분리
- 대표 프로젝트 정렬/필터 추가
- 공개 링크 외에 상세 설명 페이지 추가
