package me.skymc.exmaple.listener

import io.izzel.taboolib.module.inject.TListener
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

/**
 * @Author sky
 * @Since 2019-08-31 23:53
 */
@TListener
class ExampleListener : Listener {

    @EventHandler
    fun onBreak(e: BlockBreakEvent) {
        if (e.block.type == Material.DIRT) {
            e.player.sendMessage("break!")
        }
    }
}
