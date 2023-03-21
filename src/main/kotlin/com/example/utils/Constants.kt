package com.example.utils

object Constants {
    const val DATABASE_URL = "jdbc:mysql://localhost:3306/pharmacy_manage"
    const val DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver"
    const val DATABASE_USER = "root"
    const val DATABASE_PASSWORD = "ghgh"

    const val SALTED_HASH_ALGORITHM = "SHA1PRNG"

    /**
     * Jwt
     */
    val SECRET = System.getenv("JWT_SECRET") ?: "JWT_SECRET"
    const val ISSUER = "http://127.0.0.1:8080"
    const val AUDIENCE = "http://127.0.0.1:8080/pharmacy_manage"
    const val REALM = "Access to notes"
    const val REFRESH_TOKEN_EXPIRE_DATE = (365L * 1000L * 60L * 60L * 24L)
}