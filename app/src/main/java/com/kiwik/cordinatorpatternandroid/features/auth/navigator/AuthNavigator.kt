package com.kiwik.cordinatorpatternandroid.features.auth.navigator

import android.content.Intent
import com.kiwik.cordinatorpatternandroid.R
import com.kiwik.cordinatorpatternandroid.features.user.UserActivity
import com.kiwik.cordinatorpatternandroid.utils.FeatureActivityCoordinator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthNavigator @Inject constructor() : FeatureActivityCoordinator() {

    override var navHos = R.id.nav_host_fragment
    override var graphId = R.navigation.auth_graph
    override val startDestination = AuthRoutes.Login.id

    fun goToRegister() {
        navigate(AuthRoutes.Register.id)
    }

    fun navigateToLogin() {
        navigate(AuthRoutes.Login.id)
    }

    fun navigateToUser() {
        val intent = Intent(activity, UserActivity::class.java)
        activity?.startActivity(intent)
    }
}
