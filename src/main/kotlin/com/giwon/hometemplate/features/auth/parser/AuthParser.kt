package com.giwon.hometemplate.features.auth.parser

import com.giwon.hometemplate.features.auth.dto.AuthUserResponse
import com.giwon.hometemplate.features.auth.dto.LoginResponse
import com.giwon.hometemplate.features.auth.model.AuthToken
import com.giwon.hometemplate.features.auth.model.UserCredential
import org.springframework.stereotype.Component

@Component
class AuthParser {
    fun toLoginResponse(user: UserCredential, authToken: AuthToken): LoginResponse =
        LoginResponse(
            token = authToken.token,
            user = AuthUserResponse(
                email = user.email,
                name = user.name,
            ),
        )
}
