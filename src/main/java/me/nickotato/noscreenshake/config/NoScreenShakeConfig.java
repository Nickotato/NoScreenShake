package me.nickotato.noscreenshake.config;

import me.nickotato.noscreenshake.NoScreenShake;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

/**
 * The main Config entrypoint that extends the Config type and inits the config options.
 * See <a href="https://docs.polyfrost.cc/oneconfig/config/adding-options">this link</a> for more config Options
 */
public class NoScreenShakeConfig extends Config {
    @Switch(
            name = "Enable No Screen Shake",
            description = "Completely enables or disables the mod."
    )
    public static boolean enabled = true;

    public NoScreenShakeConfig() {
        super(new Mod(NoScreenShake.NAME, ModType.UTIL_QOL), NoScreenShake.MODID + ".json");
        initialize();
    }
}

