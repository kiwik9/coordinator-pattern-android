package com.kiwik.cordinatorpatternandroid.features.auth

import com.kiwik.cordinatorpatternandroid.features.auth.navigator.AuthNavigator
import com.kiwik.cordinatorpatternandroid.navigation.ActivityNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AuthActivity : ActivityNavigator<AuthNavigator>() {
    @Inject
    lateinit var authNavigator: AuthNavigator
    override fun init() {
        setNavigator(authNavigator)
    }
}
