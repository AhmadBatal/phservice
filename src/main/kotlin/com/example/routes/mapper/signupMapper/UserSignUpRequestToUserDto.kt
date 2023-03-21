package com.example.routes.mapper.signupMapper

import com.example.data.dto.UserDto
import com.example.data.request.UserRegisterRequest
import com.example.utils.generateSaltedHash

fun UserRegisterRequest.userRequestToDto(): UserDto {
    val saltedHash = password.generateSaltedHash()
    return UserDto(
        userId = 0,
        userName = username,
        userPassword = saltedHash.hash,
        userPhone = userPhone,
        userAddress = userAddress,
        userSalt = saltedHash.salt
    )
}