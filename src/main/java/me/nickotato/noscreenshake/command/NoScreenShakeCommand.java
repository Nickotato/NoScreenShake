package me.nickotato.noscreenshake.command;

import me.nickotato.noscreenshake.NoScreenShake;
import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;

/**
 * An example command implementing the Command api of OneConfig.
 * Registered in ExampleMod.java with `CommandManager.INSTANCE.registerCommand(new ExampleCommand());`
 *
 * @see Command
 * @see Main
 * @see NoScreenShake
 */
@Command(value = NoScreenShake.MODID, description = "Access the " + NoScreenShake.NAME + " GUI.")
public class NoScreenShakeCommand {
    @Main
    private void handle() {
        NoScreenShake.config.openGui();
    }
}