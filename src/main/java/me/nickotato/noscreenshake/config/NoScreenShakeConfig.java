package me.nickotato.noscreenshake.config;

import me.nickotato.noscreenshake.NoScreenShake;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class NoScreenShakeConfig {
    private static Configuration config;

    public static boolean enabled = true;

    public static void init(File configFile) {
        config = new Configuration(configFile);

        try {
            config.load();
            enabled = config.getBoolean(
                    "enabled",
                    Configuration.CATEGORY_GENERAL,
                    true,
                    "Completely enables or disables the mod."
            );
        } catch (Exception e) {
            System.err.println("Failed to load config for " + NoScreenShake.NAME);
            e.printStackTrace();
        } finally {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }

    public static void save() {
        if (config == null) return; // safety check

        config.get(Configuration.CATEGORY_GENERAL, "enabled", enabled)
                .set(enabled); // update the value in the config object
        config.save(); // write to disk
    }
}
