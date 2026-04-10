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
            .andExpect(jsonPath("$.data[0].repositoryUrl").value("https://github.com/giwon1130/emergency-room-backend"))
            .andExpect(jsonPath("$.data[0].docsUrl").value("https://github.com/giwon1130/emergency-room-frontend"))
            .andExpect(jsonPath("$.data[1].liveUrl").value("http://localhost:4173"))
            .andExpect(jsonPath("$.data[2].name").value("AI Assistant API"))
            .andExpect(jsonPath("$.data[2].liveUrl").value("http://localhost:4173/assistant"))
            .andExpect(jsonPath("$.data[2].repositoryUrl").value("https://github.com/giwon1130/giwon-assistant-api"))
            .andExpect(jsonPath("$.data[3].name").value("HomeHarmony"))
            .andExpect(jsonPath("$.data[3].liveUrl").value("http://127.0.0.1:4174"))
            .andExpect(jsonPath("$.data[3].repositoryUrl").value("https://github.com/giwon1130/HomeHarmony"))
            .andExpect(jsonPath("$.data[4].name").value("TripMemo"))
            .andExpect(jsonPath("$.data[4].repositoryUrl").value("https://github.com/giwon1130/TripMemo"))
            .andExpect(jsonPath("$.data[5].name").value("RouteOps"))
            .andExpect(jsonPath("$.data[5].repositoryUrl").value("https://github.com/giwon1130/route-ops-api"))
            .andExpect(jsonPath("$.data[5].docsUrl").value("https://github.com/giwon1130/route-ops-web"))
            .andExpect(jsonPath("$.data[6].name").value("MetroPulse"))
            .andExpect(jsonPath("$.data[6].repositoryUrl").value("https://github.com/giwon1130/metro-pulse-backend"))
            .andExpect(jsonPath("$.data[7].name").value("ShelterNow"))
            .andExpect(jsonPath("$.data[7].repositoryUrl").value("https://github.com/giwon1130/shelter-now-backend"))
            .andExpect(jsonPath("$.data[8].name").value("SignalDesk"))
            .andExpect(jsonPath("$.data[8].headline").value("한국·미국 시장 시그널을 웹과 모바일로 함께 읽는 개인용 시장 인텔리전스 허브"))
            .andExpect(jsonPath("$.data[8].liveUrl").value("http://localhost:4180"))
            .andExpect(jsonPath("$.data[8].repositoryUrl").value("https://github.com/giwon1130/signal-desk"))
            .andExpect(jsonPath("$.data[8].docsUrl").value("https://github.com/giwon1130/signal-desk-web"))
    }
}
