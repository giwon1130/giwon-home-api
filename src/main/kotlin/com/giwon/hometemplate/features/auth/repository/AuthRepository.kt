package com.giwon.hometemplate.features.auth.repository

import com.giwon.hometemplate.features.auth.model.AuthToken
import com.giwon.hometemplate.features.auth.model.UserCredential
import org.springframework.stereotype.Repository
import java.util.concurrent.ConcurrentHashMap

@Repository
class AuthRepository {
    private val users = listOf(
        UserCredential(email = "demo@home.io", password = "home1234", name = "Home Demo"),
    )
    private val tokenByEmail = ConcurrentHashMap<String, AuthToken>()
    private val emailByToken = ConcurrentHashMap<String, String>()

    fun findUserByEmail(email: String): UserCredential? =
        users.firstOrNull { it.email.equals(email, ignoreCase = true) }

    fun saveToken(authToken: AuthToken) {
        tokenByEmail[authToken.email] = authToken
        emailByToken[authToken.token] = authToken.email
    }

    fun findEmailByToken(token: String): String? = emailByToken[token]
}
