package com.github.imalwayscoding.aimbot.util

import com.github.imalwayscoding.aimbot.commands.KommandStartAimBot
import org.bukkit.entity.Player

object Whiler {

    fun whiler(player: Player, target: Player) {
        while (!KommandStartAimBot.aimBotMap.contains(player)) {
            player.location.direction.x = target.location.x
            player.location.direction.y = target.location.y
            player.location.direction.z = target.location.y
        }
    }

}