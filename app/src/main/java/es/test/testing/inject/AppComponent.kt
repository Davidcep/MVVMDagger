package es.test.testing.inject

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import es.test.testing.SampleApp
import javax.inject.Singleton

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    AppBinder::class
])
@Singleton
interface AppComponent: AndroidInjector<SampleApp> {

    @Component.Factory
    interface Factory: AndroidInjector.Factory<SampleApp>
}