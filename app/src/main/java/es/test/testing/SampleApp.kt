package es.test.testing

import es.test.testing.base.BaseApplication
import es.test.testing.inject.DaggerAppComponent

class SampleApp: BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.factory().create(this).inject(this)
    }
}