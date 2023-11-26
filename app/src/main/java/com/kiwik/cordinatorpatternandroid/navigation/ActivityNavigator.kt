package com.kiwik.cordinatorpatternandroid.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kiwik.cordinatorpatternandroid.databinding.ActivityBaseFeatureBinding
import com.kiwik.cordinatorpatternandroid.utils.FeatureActivityCoordinator

open class ActivityNavigator<N : FeatureActivityCoordinator> : AppCompatActivity() {

    private lateinit var binding: ActivityBaseFeatureBinding
    private lateinit var navigator: N

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseFeatureBinding.inflate(layoutInflater)
        init()
        setContentView(binding.root)
    }

    fun setNavigator(navigator: N) {
        this.navigator = navigator
        navigator.setUpGraph(activity = this)
    }

    open fun init() {}
}
