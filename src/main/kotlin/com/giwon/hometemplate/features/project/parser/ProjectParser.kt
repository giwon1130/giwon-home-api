package com.giwon.hometemplate.features.project.parser

import com.giwon.hometemplate.features.project.dto.ProjectResponse
import com.giwon.hometemplate.features.project.model.Project
import org.springframework.stereotype.Component

@Component
class ProjectParser {
    fun toResponse(project: Project): ProjectResponse =
        ProjectResponse(
            id = project.id,
            name = project.name,
            status = project.status,
            category = project.category,
            summary = project.summary,
            primaryUrl = project.primaryUrl,
            repositoryUrl = project.repositoryUrl,
            tags = project.tags,
        )
}
