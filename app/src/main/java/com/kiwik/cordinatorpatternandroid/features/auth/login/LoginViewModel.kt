package com.kiwik.cordinatorpatternandroid.features.auth.login

import androidx.lifecycle.ViewModel
import com.kiwik.cordinatorpatternandroid.features.auth.navigator.AuthNavigator
import com.kiwik.cordinatorpatternandroid.navigation.MainNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val mainNavigator: MainNavigator,
    private val authNavigator: AuthNavigator,
) : ViewModel() {

    fun goToUser() {
        mainNavigator.navigateToUser(removeAllStack = true)
    }

    fun goToBusiness() {
        mainNavigator.navigateToBusiness(removeAllStack = true)
    }

    fun goToRegister() {
        authNavigator.goToRegister()
    }
}
