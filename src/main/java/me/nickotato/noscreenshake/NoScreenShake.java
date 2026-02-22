package me.nickotato.noscreenshake;

import me.nickotato.noscreenshake.command.NoScreenShakeCommand;
import me.nickotato.noscreenshake.config.NoScreenShakeConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import net.minecraftforge.fml.common.Mod;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 * @see InitializationEvent
 */
@Mod(modid = NoScreenShake.MODID, name = NoScreenShake.NAME, version = NoScreenShake.VERSION)
public class NoScreenShake {

    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    @Mod.Instance(MODID)
    public static NoScreenShake INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static NoScreenShakeConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new NoScreenShakeConfig();
        CommandManager.INSTANCE.registerCommand(new NoScreenShakeCommand());
    }
}
