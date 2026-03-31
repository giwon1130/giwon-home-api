package com.giwon.hometemplate.features.project.repository

import com.giwon.hometemplate.features.project.model.Project
import org.springframework.stereotype.Repository

@Repository
class ProjectRepository {
    private val projectsByEmail = mapOf(
        "demo@home.io" to listOf(
            Project(id = "PJT-001", name = "Weather Alert Dashboard", status = "ACTIVE"),
            Project(id = "PJT-002", name = "Local News Summarizer", status = "PLANNING"),
            Project(id = "PJT-003", name = "Notification Sender", status = "DONE"),
        ),
    )

    fun findProjectsByEmail(email: String): List<Project> = projectsByEmail[email].orEmpty()
}
