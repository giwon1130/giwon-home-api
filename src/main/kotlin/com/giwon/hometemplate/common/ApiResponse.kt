package com.giwon.hometemplate.common

data class ApiResponse<T>(
    val success: Boolean,
    val data: T? = null,
    val message: String? = null,
)
