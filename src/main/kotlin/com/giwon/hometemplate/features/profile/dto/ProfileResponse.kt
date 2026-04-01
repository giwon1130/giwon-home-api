package com.giwon.hometemplate.features.profile.dto

data class ProfileResponse(
    val name: String,
    val title: String,
    val summary: String,
    val strengths: List<String>,
    val links: Map<String, String>,
)
