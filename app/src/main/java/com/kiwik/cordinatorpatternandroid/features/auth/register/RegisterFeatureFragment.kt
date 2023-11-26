package com.kiwik.cordinatorpatternandroid.features.auth.register

import com.kiwik.cordinatorpatternandroid.features.auth.register.navigator.RegisterNavigator
import com.kiwik.cordinatorpatternandroid.navigation.FragmentNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RegisterFeatureFragment : FragmentNavigator<RegisterNavigator>() {

    @Inject
    lateinit var navigator: RegisterNavigator
    override fun init() {
        setNavigator(navigator)
    }
}
