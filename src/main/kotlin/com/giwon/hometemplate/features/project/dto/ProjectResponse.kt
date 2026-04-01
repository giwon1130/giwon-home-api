package com.giwon.hometemplate.features.project.dto

data class ProjectResponse(
    val id: String,
    val name: String,
    val status: String,
    val category: String,
    val summary: String,
    val primaryUrl: String,
    val repositoryUrl: String?,
    val tags: List<String>,
)
