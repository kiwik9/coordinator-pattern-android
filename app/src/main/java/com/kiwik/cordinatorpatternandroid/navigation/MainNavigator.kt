package com.kiwik.cordinatorpatternandroid.navigation

import android.content.Context
import com.kiwik.cordinatorpatternandroid.features.auth.AuthActivity
import com.kiwik.cordinatorpatternandroid.features.business.BusinessActivity
import com.kiwik.cordinatorpatternandroid.features.user.UserActivity
import com.kiwik.cordinatorpatternandroid.utils.RootNavigator
import javax.inject.Inject

class MainNavigator @Inject constructor(
    context: Context,
) : RootNavigator(context) {

    fun navigateToAuth(removeAllStack: Boolean = false) {
        startFeatureActivity(AuthActivity::class.java, removeAllStack)
    }

    fun navigateToUser(removeAllStack: Boolean = false) {
        startFeatureActivity(UserActivity::class.java, removeAllStack)
    }

    fun navigateToBusiness(removeAllStack: Boolean = false) {
        startFeatureActivity(BusinessActivity::class.java, removeAllStack)
    }
}
