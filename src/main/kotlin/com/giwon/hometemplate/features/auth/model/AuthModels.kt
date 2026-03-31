package com.giwon.hometemplate.features.auth.model

import java.time.Instant

data class UserCredential(
    val email: String,
    val password: String,
    val name: String,
)

data class AuthToken(
    val token: String,
    val email: String,
    val issuedAt: Instant,
)
