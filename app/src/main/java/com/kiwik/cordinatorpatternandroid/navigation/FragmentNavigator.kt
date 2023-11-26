package com.kiwik.cordinatorpatternandroid.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment
import com.kiwik.cordinatorpatternandroid.databinding.FragmentBaseFeatureBinding
import com.kiwik.cordinatorpatternandroid.utils.FeatureFragmentCoordinator

open class FragmentNavigator<N : FeatureFragmentCoordinator> : AppCompatDialogFragment() {

    lateinit var binding: FragmentBaseFeatureBinding
    private lateinit var navigator: N

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBaseFeatureBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    fun setNavigator(navigator: N) {
        this.navigator = navigator
        navigator.setUpGraph(activity = this)
    }

    open fun init() {}
}
