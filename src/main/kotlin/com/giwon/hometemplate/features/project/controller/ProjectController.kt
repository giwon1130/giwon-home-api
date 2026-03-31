package com.giwon.hometemplate.features.project.controller

import com.giwon.hometemplate.common.ApiResponse
import com.giwon.hometemplate.features.auth.service.AuthService
import com.giwon.hometemplate.features.project.dto.ProjectResponse
import com.giwon.hometemplate.features.project.service.ProjectService
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/projects")
class ProjectController(
    private val authService: AuthService,
    private val projectService: ProjectService,
) {
    @GetMapping
    fun getProjects(
        @RequestHeader(value = HttpHeaders.AUTHORIZATION, required = false) authorization: String?,
    ): ResponseEntity<ApiResponse<List<ProjectResponse>>> {
        val email = authService.resolveEmailFromAuthorizationHeader(authorization)
            ?: return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(ApiResponse(success = false, message = "Unauthorized"))

        val projects = projectService.getProjectsByEmail(email)
        return ResponseEntity.ok(ApiResponse(success = true, data = projects))
    }
}
