package com.github.imalwayscoding.aimbot.commands

import com.github.noonmaru.kommand.KommandBuilder
import org.bukkit.entity.Player

object KommandShowAimBotUser {

    fun register(builder: KommandBuilder) {
        builder.apply {
            require { this is Player }
            executes {
                val player = it.sender as Player
                player.sendMessage("===============")
                for (map in KommandStartAimBot.aimBotMap) {
                    player.sendMessage("사용 유저: ${map.key.name} 대상 유저: ${map.value.name}")
                }
                player.sendMessage("===============")
            }
        }
    }

}