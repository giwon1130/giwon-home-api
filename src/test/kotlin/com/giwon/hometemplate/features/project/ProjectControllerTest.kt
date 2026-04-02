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
            .andExpect(jsonPath("$.data.length()").value(5))
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
    }
}
