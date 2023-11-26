package com.kiwik.cordinatorpatternandroid.features.auth.navigator

import com.kiwik.cordinatorpatternandroid.R

sealed class AuthRoutes(val id: Int) {
    object Login : AuthRoutes(R.id.loginFragment)
    object Register : AuthRoutes(R.id.registerFragment)
}
