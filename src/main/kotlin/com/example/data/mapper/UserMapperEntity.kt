package com.example.data.mapper

import com.example.data.dto.UserDto
import com.example.data.entities.UserEntity

fun UserDto.toUserEntity() =
    UserEntity {
        userId = this@toUserEntity.userId
        username = this@toUserEntity.userName
        userPassword = this@toUserEntity.userPassword
        userPhone = this@toUserEntity.userPhone
        userAddress = this@toUserEntity.userAddress
        userSalt = this@toUserEntity.userSalt
//        userRegister = this@toUserEntity.userRegister.stringToLocalDateTime()
    }