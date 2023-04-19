package hoods.com.jetshopping

import android.app.Application

class JetShoppingApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}