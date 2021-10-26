package com.tispunshahryar960103.digishop.di.module

import com.tispunshahryar960103.digishop.models.IMessageResponseListener
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

/*@Module
@InstallIn(FragmentComponent::class)*/
abstract class IMessageResponseListenerModule {

   // @Binds
    abstract fun provideIMessengerListener(iMessageResponseListenerImpl: IMessageResponseListenerImpl):IMessageResponseListener<Any>



}