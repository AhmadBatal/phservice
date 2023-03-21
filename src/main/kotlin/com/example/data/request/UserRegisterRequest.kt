package com.example.data.request

data class UserRegisterRequest(
    val username: String,
    val password: String,
    val userPhone: String,
    val userAddress: String
)