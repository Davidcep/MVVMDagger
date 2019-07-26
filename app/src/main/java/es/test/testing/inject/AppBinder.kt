package es.test.testing.inject

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import es.test.testing.MainActivity
import es.test.testing.inject.main.MainComponent
import es.test.testing.inject.scope.ActivityScope

@Module(subcomponents = [
    MainComponent::class
])
abstract class AppBinder {

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun provideMainActivity(factory: MainComponent.Factory): AndroidInjector.Factory<out Activity>
}