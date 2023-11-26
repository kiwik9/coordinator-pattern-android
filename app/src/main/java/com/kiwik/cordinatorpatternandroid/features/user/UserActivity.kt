package com.kiwik.cordinatorpatternandroid.features.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kiwik.cordinatorpatternandroid.R

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_feature)
    }
}