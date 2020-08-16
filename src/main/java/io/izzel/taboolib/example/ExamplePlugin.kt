package io.izzel.taboolib.example

import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.module.inject.TInject

object ExamplePlugin : Plugin() {

    override fun onLoad() {
        // override onLoad()
    }

    override fun onEnable() {
        // override onEnable()
    }

    override fun onDisable() {
        // override onDisable()
    }

    override fun getTabooLibVersion(): Double {
        return 5.34;
    }
}
