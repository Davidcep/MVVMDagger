package es.test.testing.inject.main

import dagger.Subcomponent
import dagger.android.AndroidInjector
import es.test.testing.MainActivity
import es.test.testing.inject.scope.ActivityScope

@Subcomponent
@ActivityScope
interface MainComponent: AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory: AndroidInjector.Factory<MainActivity>
}