package com.github.imalwayscoding.aimbot

import com.github.imalwayscoding.aimbot.commands.KommandShowAimBotUser
import com.github.imalwayscoding.aimbot.commands.KommandStartAimBot
import com.github.imalwayscoding.aimbot.commands.KommandStopAimBot
import com.github.noonmaru.kommand.kommand
import org.bukkit.plugin.java.JavaPlugin

class AimBotPlugin : JavaPlugin() {

    override fun onEnable() {
        registerCommands()
        logger.info("AimBotPlugin Enabled. Plugin By IlyLine.")
    }

    fun registerCommands() = kommand {
        register("startaimbot") {
            KommandStartAimBot.register(this)
        }
        register("stopaimbot") {
            KommandStopAimBot.register(this)
        }
        register("showaimbotuser") {
            KommandShowAimBotUser.register(this)
        }
    }

}