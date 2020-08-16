package io.izzel.taboolib.example

import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.module.inject.TInject

@Plugin(depend = 5.34)
object ExamplePlugin {

    @Plugin.Loading
    fun onLoad() {
        // override onLoad()
    }

    @Plugin.Starting
    fun onEnable() {
        // override onEnable()
    }

    @Plugin.Stopping
    fun onDisable() {
        // override onDisable()
    }
}
