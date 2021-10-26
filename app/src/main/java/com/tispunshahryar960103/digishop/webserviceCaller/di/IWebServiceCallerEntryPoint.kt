package com.tispunshahryar960103.digishop.webserviceCaller.di

import com.tispunshahryar960103.digishop.webserviceCaller.WebServiceCaller
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface IWebServiceCallerEntryPoint {


    fun provideWebServiceCaller(): WebServiceCaller


}