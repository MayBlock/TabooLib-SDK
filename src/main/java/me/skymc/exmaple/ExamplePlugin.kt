package me.skymc.exmaple

import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.loader.PluginRedefine
import io.izzel.taboolib.module.inject.TInject
import io.izzel.taboolib.module.locale.logger.TLogger

@Plugin.Version(5.3) // The TabooLib dependency version (required)
object ExamplePlugin : PluginRedefine() {

    override fun onLoading() {
        // override onLoad()
    }

    override fun onStarting() {
        // override onEnable()
    }

    override fun onStopping() {
        // override onDisable()
    }

    override fun onActivated() {
        // when the server is fully started
    }
}
