package com.github.imalwayscoding.aimbot.commands

import com.github.imalwayscoding.aimbot.util.Whiler
import com.github.noonmaru.kommand.KommandBuilder
import com.github.noonmaru.kommand.argument.player
import org.bukkit.entity.Player

object KommandStartAimBot {

    val aimBotMap = hashMapOf<Player, Player>()

    fun register(builder: KommandBuilder) {
        builder.apply {
            require { this is Player }
            then("player" to player()) {
                executes {
                    val player = it.sender as Player
                    val target = it.parseArgument<Player>("player")

                    aimBotMap[player] = target

                    Whiler.whiler(player, target)
                }
            }
        }
    }

}