package com.kiwik.cordinatorpatternandroid.features.auth.register.navigator

import com.kiwik.cordinatorpatternandroid.R
import com.kiwik.cordinatorpatternandroid.utils.FeatureFragmentCoordinator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegisterNavigator @Inject constructor() : FeatureFragmentCoordinator() {

    override var navHos = R.id.nav_host_child_fragment
    override var graphId = R.navigation.register_navigation
    override val startDestination = RegisterRoutes.Register.id

    fun goToForgotPassword() {
        navigate(RegisterRoutes.ForgotPassword.id)
    }
}
