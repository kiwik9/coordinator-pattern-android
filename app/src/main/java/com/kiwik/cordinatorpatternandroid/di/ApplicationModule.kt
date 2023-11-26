package com.kiwik.cordinatorpatternandroid.di

import android.content.Context
import com.kiwik.cordinatorpatternandroid.navigation.MainNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun provideMainNavigator(
        @ApplicationContext context: Context,
    ): MainNavigator {
        return MainNavigator(context)
    }
}
