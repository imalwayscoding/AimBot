package com.github.imalwayscoding.aimbot.commands

import com.github.noonmaru.kommand.KommandBuilder
import org.bukkit.entity.Player

object KommandStopAimBot {

    fun register(builder: KommandBuilder) {
        builder.apply {
            require { this is Player }
            executes {
                val player = it.sender as Player

                KommandStartAimBot.aimBotMap.minus(player)
            }
        }
    }

}