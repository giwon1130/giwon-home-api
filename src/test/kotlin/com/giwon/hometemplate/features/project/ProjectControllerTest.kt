package com.giwon.hometemplate.features.project

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class ProjectControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Autowired
    lateinit var objectMapper: ObjectMapper

    @Test
    fun `projects endpoint returns public project list`() {
        mockMvc.perform(get("/api/projects"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.success").value(true))
            .andExpect(jsonPath("$.data.length()").value(9))
            .andExpect(jsonPath("$.data[0].id").value("PROJECT-001"))
            .andExpect(jsonPath("$.data[0].category").value("Public Data / GIS"))
            .andExpect(jsonPath("$.data[0].headline").value("가까운 응급실 병상 현황을 지도와 반경 조회로 빠르게 찾는 응급 의료 탐색 서비스"))
            .andExpect(jsonPath("$.data[0].liveUrl").value("http://localhost:4178"))
            .andExpect(jsonPath("$.data[0].repositoryUrl").value("https://github.com/giwon1130/emergency-room-backend"))
            .andExpect(jsonPath("$.data[0].docsUrl").value("https://github.com/giwon1130/emergency-room-frontend"))
            .andExpect(jsonPath("$.data[1].liveUrl").value("http://localhost:4173"))
            .andExpect(jsonPath("$.data[2].name").value("AI Assistant API"))
            .andExpect(jsonPath("$.data[2].liveUrl").value("http://localhost:4173/assistant"))
            .andExpect(jsonPath("$.data[2].repositoryUrl").value("https://github.com/giwon1130/giwon-assistant-api"))
            .andExpect(jsonPath("$.data[3].name").value("HomeHarmony"))
            .andExpect(jsonPath("$.data[3].headline").value("직주근접, 예산, 가족형 기준을 한 화면에서 비교하는 주거 선택 프론트엔드 MVP"))
            .andExpect(jsonPath("$.data[3].liveUrl").value("http://127.0.0.1:4179"))
            .andExpect(jsonPath("$.data[3].repositoryUrl").value("https://github.com/giwon1130/HomeHarmony"))
            .andExpect(jsonPath("$.data[4].name").value("TripMemo"))
            .andExpect(jsonPath("$.data[4].repositoryUrl").value("https://github.com/giwon1130/TripMemo"))
            .andExpect(jsonPath("$.data[5].name").value("RouteOps"))
            .andExpect(jsonPath("$.data[5].headline").value("수요, 차량, 재배치 추천을 지도 중심으로 보는 호출형 이동 서비스 운영 콘솔"))
            .andExpect(jsonPath("$.data[5].liveUrl").value("http://localhost:4174"))
            .andExpect(jsonPath("$.data[5].repositoryUrl").value("https://github.com/giwon1130/route-ops-api"))
            .andExpect(jsonPath("$.data[5].docsUrl").value("https://github.com/giwon1130/route-ops-web"))
            .andExpect(jsonPath("$.data[6].name").value("MetroPulse"))
            .andExpect(jsonPath("$.data[6].headline").value("실시간 도착정보와 시간대 혼잡도를 함께 읽는 지하철 이동 판단 서비스"))
            .andExpect(jsonPath("$.data[6].liveUrl").value("http://localhost:4175"))
            .andExpect(jsonPath("$.data[6].repositoryUrl").value("https://github.com/giwon1130/metro-pulse-backend"))
            .andExpect(jsonPath("$.data[7].name").value("ShelterNow"))
            .andExpect(jsonPath("$.data[7].headline").value("현재 위치 기준으로 대피소와 쉼터를 지도에서 빠르게 찾는 공공 안전 서비스"))
            .andExpect(jsonPath("$.data[7].liveUrl").value("http://localhost:4177"))
            .andExpect(jsonPath("$.data[7].repositoryUrl").value("https://github.com/giwon1130/shelter-now-backend"))
            .andExpect(jsonPath("$.data[8].name").value("SignalDesk"))
            .andExpect(jsonPath("$.data[8].headline").value("한국·미국 시장 시그널과 Pizza·Bar 실험 대체지표를 웹·모바일로 함께 읽는 개인용 시장 인텔리전스 허브"))
            .andExpect(jsonPath("$.data[8].liveUrl").value("http://localhost:4180"))
            .andExpect(jsonPath("$.data[8].repositoryUrl").value("https://github.com/giwon1130/signal-desk"))
            .andExpect(jsonPath("$.data[8].docsUrl").value("https://github.com/giwon1130/signal-desk-web"))
    }
}
