package com.giwon.hometemplate.features.project.service

import com.giwon.hometemplate.features.project.dto.ProjectResponse
import com.giwon.hometemplate.features.project.parser.ProjectParser
import com.giwon.hometemplate.features.project.repository.ProjectRepository
import org.springframework.stereotype.Service

@Service
class ProjectService(
    private val projectRepository: ProjectRepository,
    private val projectParser: ProjectParser,
) {
    fun getProjectsByEmail(email: String): List<ProjectResponse> =
        projectRepository.findProjectsByEmail(email)
            .map(projectParser::toResponse)
}
