package com.example.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("id") val userId: Int,
    @SerialName("name") val userName: String,
    @SerialName("password") val userPassword: String,
    @SerialName("salt") val userSalt: String,
    @SerialName("phone") val userPhone: String,
    @SerialName("adress") val userAddress: String
)