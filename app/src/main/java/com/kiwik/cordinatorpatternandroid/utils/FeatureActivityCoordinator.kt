package com.kiwik.cordinatorpatternandroid.utils

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

abstract class FeatureActivityCoordinator {

    private var navController: NavController? = null
    var activity: AppCompatActivity? = null

    abstract val navHos: Int
    abstract val graphId: Int
    abstract val startDestination: Int

    fun setUpGraph(activity: AppCompatActivity) {
        this.activity = activity
        val navHostFragment =
            activity.supportFragmentManager.findFragmentById(navHos) as NavHostFragment
        navController = navHostFragment.navController
        val navGraph = navController?.navInflater?.inflate(graphId)
        navGraph?.setStartDestination(startDestination)
        if (navGraph != null) {
            navController?.graph = navGraph
        }
    }

    fun stop() {
        activity?.finish()
    }

    fun navigate(id: Int) {
        navController?.navigate(id)
    }

    fun navigateToFeature(clazz: Class<*>) {
        val intent = Intent(activity, clazz)
        activity?.startActivity(intent)
    }
}
