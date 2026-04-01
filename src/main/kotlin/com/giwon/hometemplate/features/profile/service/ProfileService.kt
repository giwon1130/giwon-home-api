package com.giwon.hometemplate.features.profile.service

import com.giwon.hometemplate.features.profile.dto.ProfileResponse
import org.springframework.stereotype.Service

@Service
class ProfileService {
    fun getProfile(): ProfileResponse =
        ProfileResponse(
            name = "임기원",
            title = "대량 데이터 처리와 서비스 운영을 함께 설계하는 백엔드 엔지니어",
            summary = "Kotlin, Spring Boot, PostgreSQL/PostGIS, Redis, Kafka 기반 환경에서 조회 성능 개선, 비동기 처리 구조 설계, 운영 안정화 작업을 수행해왔습니다.",
            strengths = listOf(
                "대량 데이터 처리와 조회 성능 개선",
                "비동기 처리 구조 설계와 운영 안정화",
                "GIS 및 위치 기반 데이터 서비스 개발",
                "기존 시스템을 모던 스택으로 전환하는 백엔드 리빌드"
            ),
            links = mapOf(
                "github" to "https://github.com/giwon1130",
                "portfolio" to "https://www.notion.so/dev-giwon/ce2318d46f3a4b66894ad04d1b20d986",
                "blog" to "https://dduckddack-2.tistory.com"
            )
        )
}
