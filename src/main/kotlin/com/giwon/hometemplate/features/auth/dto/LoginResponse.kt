package com.giwon.hometemplate.features.auth.dto

data class LoginResponse(
    val token: String,
    val user: AuthUserResponse,
)

data class AuthUserResponse(
    val email: String,
    val name: String,
)
