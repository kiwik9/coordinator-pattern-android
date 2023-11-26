package com.kiwik.cordinatorpatternandroid.features.auth.register.navigator

import com.kiwik.cordinatorpatternandroid.R

sealed class RegisterRoutes(val id: Int) {
    object Register : RegisterRoutes(R.id.loginFragment)
    object ForgotPassword : RegisterRoutes(R.id.registerFragment)
}
