package com.kiwik.cordinatorpatternandroid.utils

import android.content.Context
import android.content.Intent

open class RootNavigator(
    private val context: Context,
) {
    fun startFeatureActivity(activity: Class<*>, removeAll: Boolean) {
        val intent = Intent(context, activity)
        if (removeAll) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        context.startActivity(intent)
    }
}
