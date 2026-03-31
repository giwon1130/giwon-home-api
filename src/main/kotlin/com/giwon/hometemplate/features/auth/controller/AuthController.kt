package com.giwon.hometemplate.features.auth.controller

import com.giwon.hometemplate.common.ApiResponse
import com.giwon.hometemplate.features.auth.dto.LoginRequest
import com.giwon.hometemplate.features.auth.dto.LoginResponse
import com.giwon.hometemplate.features.auth.service.AuthService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController(
    private val authService: AuthService,
) {
    @PostMapping("/login")
    fun login(
        @Valid @RequestBody request: LoginRequest,
    ): ResponseEntity<ApiResponse<LoginResponse>> {
        val result = authService.login(email = request.email, password = request.password)
            ?: return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(ApiResponse(success = false, message = "Invalid email or password"))

        return ResponseEntity.ok(ApiResponse(success = true, data = result))
    }
}
