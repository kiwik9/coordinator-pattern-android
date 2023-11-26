package com.kiwik.cordinatorpatternandroid.utils

import android.content.Intent
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

abstract class FeatureFragmentCoordinator {

    private var navController: NavController? = null
    var activity: AppCompatDialogFragment? = null

    abstract val navHos: Int
    abstract val graphId: Int
    abstract val startDestination: Int

    fun setUpGraph(activity: AppCompatDialogFragment) {
        // Todo: como hacer para registrar un nuevo graph destro de otro graph
        this.activity = activity
        val navHostFragment =
            activity.childFragmentManager.findFragmentById(navHos) as NavHostFragment
        navController = navHostFragment.navController
        val navGraph = navController?.navInflater?.inflate(graphId)
        navGraph?.setStartDestination(startDestination)
        if (navGraph != null) {
            navController?.graph = navGraph
        }
    }

    fun stop() {
        activity?.dismiss()
    }

    fun navigate(id: Int) {
        navController?.navigate(id)
    }

    fun navigateToFeature(clazz: Class<*>) {
        val intent = Intent(activity?.requireContext(), clazz)
        activity?.startActivity(intent)
    }
}
