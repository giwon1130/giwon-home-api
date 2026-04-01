package com.giwon.hometemplate.features.profile

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
class ProfileControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `profile endpoint returns public profile`() {
        mockMvc.perform(get("/api/profile"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.success").value(true))
            .andExpect(jsonPath("$.data.name").value("임기원"))
            .andExpect(jsonPath("$.data.links.github").value("https://github.com/giwon1130"))
    }
}
