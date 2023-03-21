package com.example.data.tables

import com.example.data.entities.UserEntity
import org.ktorm.schema.Table
import org.ktorm.schema.datetime
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object UserTable : Table<UserEntity>("user") {
    val userId = int("id").bindTo { it.userId }.primaryKey()
    val userName = varchar("name").bindTo { it.username }
    val userPassword = varchar("password").bindTo { it.userPassword }
    val userSalt = varchar("salt").bindTo { it.userSalt }
    val userPhone = varchar("phone").bindTo { it.userPhone }
    val userAddress = varchar("adress").bindTo { it.userAddress }
    val userRegister = datetime("register").bindTo { it.userRegister }
}