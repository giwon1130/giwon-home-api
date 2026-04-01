package com.giwon.hometemplate.features.project.controller

import com.giwon.hometemplate.common.ApiResponse
import com.giwon.hometemplate.features.project.dto.ProjectResponse
import com.giwon.hometemplate.features.project.service.ProjectService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/projects")
class ProjectController(
    private val projectService: ProjectService,
) {
    @GetMapping
    fun getProjects(): ResponseEntity<ApiResponse<List<ProjectResponse>>> =
        ResponseEntity.ok(ApiResponse(success = true, data = projectService.getProjects()))
}
