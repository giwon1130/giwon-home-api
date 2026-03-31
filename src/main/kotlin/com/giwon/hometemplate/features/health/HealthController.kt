package com.giwon.hometemplate.features.health

import com.giwon.hometemplate.common.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/health")
class HealthController {

    @GetMapping
    fun health(): ApiResponse<Map<String, String>> = ApiResponse(
        success = true,
        data = mapOf("status" to "UP"),
    )
}
