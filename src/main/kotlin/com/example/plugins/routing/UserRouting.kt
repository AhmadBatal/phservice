package com.example.plugins.routing

import com.example.routes.userRoute.*
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.userConfigRouting() {
    routing {
        getSecretInfoRoute()
        signUpRoute()
        signInRoute()
        deleteUserRoute()
        updatePasswordRoute()
        authenticateRoute()
    }
}
