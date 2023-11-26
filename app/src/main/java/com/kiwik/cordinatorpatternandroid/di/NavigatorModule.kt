package com.kiwik.cordinatorpatternandroid.di

import com.kiwik.cordinatorpatternandroid.features.auth.navigator.AuthNavigator
import com.kiwik.cordinatorpatternandroid.features.auth.register.navigator.RegisterNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigatorModule {
    @Provides
    @Singleton
    fun provideAuthNavigator() = AuthNavigator()

    @Provides
    @Singleton
    fun provideRegisterNavigator() = RegisterNavigator()
}
