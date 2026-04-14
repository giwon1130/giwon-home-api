package com.giwon.hometemplate.features.project.repository

import com.giwon.hometemplate.features.project.config.PublicProjectUrlProperties
import com.giwon.hometemplate.features.project.model.Project
import org.springframework.stereotype.Repository

@Repository
class ProjectRepository(
    private val publicProjectUrlProperties: PublicProjectUrlProperties,
) {
    private val projects = listOf(
        Project(
            id = "PROJECT-001",
            name = "Emergency Room Service",
            status = "LIVE",
            category = "Public Data / GIS",
            headline = "가까운 응급실 병상 현황을 지도와 반경 조회로 빠르게 찾는 응급 의료 탐색 서비스",
            summary = "공공 응급의료 API와 PostGIS 기반 반경 조회를 이용해 주변 응급실 병상 현황을 지도와 리스트로 제공하는 서비스",
            liveUrl = publicProjectUrlProperties.emergencyRoom,
            repositoryUrl = "https://github.com/giwon1130/emergency-room-backend",
            docsUrl = "https://github.com/giwon1130/emergency-room-frontend",
            tags = listOf("React", "Kotlin", "Spring Boot", "PostGIS", "Redis", "Leaflet")
        ),
        Project(
            id = "PROJECT-002",
            name = "Home Service Hub",
            status = "BUILDING",
            category = "Portfolio / Platform",
            headline = null,
            summary = "여러 개인 프로젝트와 공개 저장소를 한 곳에서 소개하고 연결하는 공개용 허브 서비스",
            liveUrl = publicProjectUrlProperties.home,
            repositoryUrl = "https://github.com/giwon1130/giwon-home-api",
            docsUrl = "https://github.com/giwon1130/giwon-home",
            tags = listOf("React", "Vite", "Kotlin", "Spring Boot")
        ),
        Project(
            id = "PROJECT-003",
            name = "AI Assistant API",
            status = "BUILDING",
            category = "Productivity / AI",
            headline = null,
            summary = "아침 브리핑 자동 생성, 뉴스/날씨 요약, 아이디어 저장과 브리핑 이력 관리를 제공하는 개인용 AI 비서 API",
            liveUrl = publicProjectUrlProperties.assistant,
            repositoryUrl = "https://github.com/giwon1130/giwon-assistant-api",
            docsUrl = "https://www.notion.so/dev-giwon/ce2318d46f3a4b66894ad04d1b20d986",
            tags = listOf("Kotlin", "Spring Boot", "OpenAI", "Automation", "Calendar", "RSS", "JPA", "Scheduler")
        ),
        Project(
            id = "PROJECT-004",
            name = "HomeHarmony",
            status = "BUILDING",
            category = "Housing / Decision Support",
            headline = "직주근접, 예산, 가족형 기준을 한 화면에서 비교하는 주거 선택 프론트엔드 MVP",
            summary = "직주근접·예산·가족형 추천 모드와 생활권 추천 점수를 함께 제공하는 주거 선택 프론트엔드 MVP",
            liveUrl = publicProjectUrlProperties.homeHarmony,
            repositoryUrl = "https://github.com/giwon1130/HomeHarmony",
            docsUrl = null,
            tags = listOf("React", "TypeScript", "Vite", "Leaflet", "Housing", "Comparison", "Scoring", "Recommendation")
        ),
        Project(
            id = "PROJECT-005",
            name = "TripMemo",
            status = "BUILDING",
            category = "Travel / Memo",
            headline = null,
            summary = "여행(trip), 장소, 메모를 함께 묶고 검색·필터·대시보드·타임라인 조회를 제공하는 여행 기록 서비스 백엔드",
            liveUrl = null,
            repositoryUrl = "https://github.com/giwon1130/TripMemo",
            docsUrl = null,
            tags = listOf("Java", "Spring Boot", "Spring Security", "PostgreSQL", "JWT", "Travel", "Dashboard", "Search")
        ),
        Project(
            id = "PROJECT-006",
            name = "RouteOps",
            status = "BUILDING",
            category = "Mobility / Operations AI",
            headline = "수요, 차량, 재배치 추천을 지도 중심으로 보는 호출형 이동 서비스 운영 콘솔",
            summary = "호출형 이동 서비스 운영자를 위해 권역 수요, 차량 상태, 재배치 추천, 시나리오 기반 운영 브리핑을 지도 중심으로 제공하는 DRT 운영 콘솔",
            liveUrl = publicProjectUrlProperties.routeOps,
            repositoryUrl = "https://github.com/giwon1130/route-ops-api",
            docsUrl = "https://github.com/giwon1130/route-ops-web",
            tags = listOf("Kotlin", "Spring Boot", "React", "Vite", "Leaflet", "DRT", "Operations", "Simulation", "AI")
        ),
        Project(
            id = "PROJECT-007",
            name = "MetroPulse",
            status = "BUILDING",
            category = "Transit / Public Data",
            headline = "실시간 도착정보와 시간대 혼잡도를 함께 읽는 지하철 이동 판단 서비스",
            summary = "실시간 지하철 도착정보 OpenAPI와 30분 단위 평균 혼잡도, 환승역 다중 노선 표시, 지하철 노선도 스타일 탐색, 노선별·방향별 도착 보드, 전체 역 마스터 확장 구조를 함께 제공하는 교통 서비스",
            liveUrl = publicProjectUrlProperties.metroPulse,
            repositoryUrl = "https://github.com/giwon1130/metro-pulse-backend",
            docsUrl = "https://github.com/giwon1130/metro-pulse-frontend",
            tags = listOf("Kotlin", "Spring Boot", "React", "Vite", "Transit", "OpenAPI", "Congestion")
        ),
        Project(
            id = "PROJECT-008",
            name = "ShelterNow",
            status = "BUILDING",
            category = "Safety / Public Data",
            headline = "현재 위치 기준으로 대피소와 쉼터를 지도에서 빠르게 찾는 공공 안전 서비스",
            summary = "현재 위치 기준으로 가까운 무더위쉼터, 한파쉼터, 민방위대피소, 임시주거시설을 탐색하고 운영 상태 필터, 거리/수용인원 정렬, Leaflet 지도 탐색, 전국 주요 도시 샘플 데이터를 함께 제공하는 공공 안전 서비스",
            liveUrl = publicProjectUrlProperties.shelterNow,
            repositoryUrl = "https://github.com/giwon1130/shelter-now-backend",
            docsUrl = "https://github.com/giwon1130/shelter-now-frontend",
            tags = listOf("Kotlin", "Spring Boot", "React", "Vite", "Safety", "Shelter", "Public Data", "GIS")
        ),
        Project(
            id = "PROJECT-009",
            name = "SignalDesk",
            status = "LIVE",
            category = "Finance / Market Intelligence",
            headline = "한국·미국 시장 시그널과 Pizza·Bar 실험 대체지표를 웹·모바일로 함께 읽는 개인용 시장 인텔리전스 허브",
            summary = "한국/미국 시장을 분리해 지수 차트, 수급, 공포지표, 뉴스 군집화, 포트폴리오, AI 추천, 모의투자와 함께 Pentagon Pizza Index, Policy Buzz, Bar Counter-Signal 같은 실험 대체지표까지 웹과 모바일 컴패니언 앱으로 제공하는 시장 인텔리전스 서비스",
            liveUrl = publicProjectUrlProperties.signalDesk,
            repositoryUrl = "https://github.com/giwon1130/signal-desk",
            docsUrl = "https://github.com/giwon1130/signal-desk-web",
            tags = listOf("Kotlin", "Spring Boot", "React", "Expo", "Finance", "Market Data", "AI", "Mobile")
        ),
    )

    fun findAll(): List<Project> = projects
}
