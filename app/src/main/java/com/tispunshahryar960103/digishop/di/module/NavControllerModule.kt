package com.tispunshahryar960103.digishop.di.module

import android.app.Activity
import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.tispunshahryar960103.digishop.MainActivity
import com.tispunshahryar960103.digishop.R
import com.tispunshahryar960103.digishop.di.qualifier.QualifierNavControllerForFragmentContainer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Scope

@Module
@InstallIn(ActivityComponent::class)
class NavControllerModule {





    /*@Provides
    @QualifierNavControllerForFragmentContainer
   @ActivityScoped
    fun provideNavController(@ActivityContext mainActivity: Context): NavController {
        return Navigation.findNavController(mainActivity as Activity,R.id.fragmentContainerView)
    }*/

}