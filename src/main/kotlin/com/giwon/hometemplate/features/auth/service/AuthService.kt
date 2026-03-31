package com.giwon.hometemplate.features.auth.service

import com.giwon.hometemplate.features.auth.dto.LoginResponse
import com.giwon.hometemplate.features.auth.model.AuthToken
import com.giwon.hometemplate.features.auth.parser.AuthParser
import com.giwon.hometemplate.features.auth.repository.AuthRepository
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.UUID

@Service
class AuthService(
    private val authRepository: AuthRepository,
    private val authParser: AuthParser,
) {
    fun login(email: String, password: String): LoginResponse? {
        val user = authRepository.findUserByEmail(email) ?: return null
        if (user.password != password) return null

        val authToken = AuthToken(
            token = UUID.randomUUID().toString(),
            email = user.email,
            issuedAt = Instant.now(),
        )
        authRepository.saveToken(authToken)

        return authParser.toLoginResponse(user, authToken)
    }

    fun resolveEmailFromAuthorizationHeader(authorization: String?): String? {
        if (authorization.isNullOrBlank()) return null
        val prefix = "Bearer "
        if (!authorization.startsWith(prefix)) return null

        val token = authorization.removePrefix(prefix).trim()
        if (token.isBlank()) return null

        return authRepository.findEmailByToken(token)
    }
}
