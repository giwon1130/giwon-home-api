package com.giwon.hometemplate.features.project.repository

import com.giwon.hometemplate.features.project.model.Project
import org.springframework.stereotype.Repository

@Repository
class ProjectRepository {
    private val projects = listOf(
        Project(
            id = "PROJECT-001",
            name = "Emergency Room Service",
            status = "LIVE",
            category = "Public Data / GIS",
            summary = "공공 응급의료 API와 PostGIS 기반 반경 조회를 이용해 주변 응급실 병상 현황을 지도와 리스트로 제공하는 서비스",
            liveUrl = null,
            repositoryUrl = "https://github.com/giwon1130/emergency-room-backend",
            docsUrl = "https://github.com/giwon1130/emergency-room-frontend",
            tags = listOf("React", "Kotlin", "Spring Boot", "PostGIS", "Redis", "Leaflet")
        ),
        Project(
            id = "PROJECT-002",
            name = "Home Service Hub",
            status = "BUILDING",
            category = "Portfolio / Platform",
            summary = "여러 개인 프로젝트와 공개 저장소를 한 곳에서 소개하고 연결하는 공개용 허브 서비스",
            liveUrl = null,
            repositoryUrl = "https://github.com/giwon1130/giwon-home-api",
            docsUrl = "https://github.com/giwon1130/giwon-home",
            tags = listOf("React", "Vite", "Kotlin", "Spring Boot")
        ),
        Project(
            id = "PROJECT-003",
            name = "AI Assistant API",
            status = "BUILDING",
            category = "Productivity / AI",
            summary = "아침 브리핑, 일정 요약, 아이디어 정리를 제공하는 개인용 AI 비서 API",
            liveUrl = null,
            repositoryUrl = "https://github.com/giwon1130/giwon-assistant-api",
            docsUrl = "https://www.notion.so/dev-giwon/ce2318d46f3a4b66894ad04d1b20d986",
            tags = listOf("Kotlin", "Spring Boot", "OpenAI", "Automation", "Calendar")
        ),
        Project(
            id = "PROJECT-004",
            name = "HomeHarmony",
            status = "BUILDING",
            category = "Housing / Decision Support",
            summary = "입지, 예산, 출퇴근 기준을 함께 비교해 주거 선택을 돕는 프론트엔드 MVP",
            liveUrl = null,
            repositoryUrl = "https://github.com/giwon1130/HomeHarmony",
            docsUrl = null,
            tags = listOf("React", "TypeScript", "Vite", "Housing", "Comparison")
        ),
    )

    fun findAll(): List<Project> = projects
}
