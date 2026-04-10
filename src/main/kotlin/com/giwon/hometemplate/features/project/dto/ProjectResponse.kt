package com.giwon.hometemplate.features.project.dto

data class ProjectResponse(
    val id: String,
    val name: String,
    val status: String,
    val category: String,
    val headline: String?,
    val summary: String,
    val liveUrl: String?,
    val repositoryUrl: String?,
    val docsUrl: String?,
    val tags: List<String>,
)
