package com.tispunshahryar960103.digishop.ui.main.home.di

import com.tispunshahryar960103.digishop.ui.main.home.IHomeView
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
abstract class IHomeViewModule {


    @Binds
    @FragmentScoped
    abstract fun provideIHomeView(iHomeViewImpl: IHomeViewImpl):IHomeView<Any>


}