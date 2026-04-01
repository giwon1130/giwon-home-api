package com.giwon.hometemplate.features.profile.controller

import com.giwon.hometemplate.common.ApiResponse
import com.giwon.hometemplate.features.profile.dto.ProfileResponse
import com.giwon.hometemplate.features.profile.service.ProfileService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/profile")
class ProfileController(
    private val profileService: ProfileService,
) {
    @GetMapping
    fun getProfile(): ResponseEntity<ApiResponse<ProfileResponse>> =
        ResponseEntity.ok(ApiResponse(success = true, data = profileService.getProfile()))
}
