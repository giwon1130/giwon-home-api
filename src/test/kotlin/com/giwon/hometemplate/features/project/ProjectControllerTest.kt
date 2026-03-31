package com.giwon.hometemplate.features.project

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
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
    fun `projects endpoint returns unauthorized without token`() {
        mockMvc.perform(get("/api/projects"))
            .andExpect(status().isUnauthorized)
            .andExpect(jsonPath("$.success").value(false))
    }

    @Test
    fun `projects endpoint returns project list with valid token`() {
        val loginResult = mockMvc.perform(
            post("/api/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {"email":"demo@home.io","password":"home1234"}
                """.trimIndent()),
        )
            .andExpect(status().isOk)
            .andReturn()

        val payload = objectMapper.readTree(loginResult.response.contentAsString)
        val token = payload.path("data").path("token").asText()

        mockMvc.perform(
            get("/api/projects")
                .header(HttpHeaders.AUTHORIZATION, "Bearer $token"),
        )
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.success").value(true))
            .andExpect(jsonPath("$.data.length()").value(3))
            .andExpect(jsonPath("$.data[0].id").value("PJT-001"))
    }
}
