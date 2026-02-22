package me.nickotato.noscreenshake;

import me.nickotato.noscreenshake.config.NoScreenShakeConfig;
import me.nickotato.noscreenshake.handler.KeyHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = NoScreenShake.MODID, name = NoScreenShake.NAME, version = NoScreenShake.VERSION)
public class NoScreenShake {

    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    @Mod.Instance(MODID)
    public static NoScreenShake INSTANCE; // Adds the instance of the mod, so we can access other variables.
//    public static NoScreenShakeConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
//        config = new NoScreenShakeConfig();
//        CommandManager.INSTANCE.registerCommand(new NoScreenShakeCommand());
//        FMLCommonHandler.instance().bus().register(new KeyHandler());
        KeyHandler.init();
        MinecraftForge.EVENT_BUS.register(new KeyHandler());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File configFile = new File(event.getModConfigurationDirectory(), NoScreenShake.MODID + ".cfg");
        NoScreenShakeConfig.init(configFile);
    }
}
