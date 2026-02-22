package me.nickotato.noscreenshake.handler;

import me.nickotato.noscreenshake.gui.NoScreenShakeGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class KeyHandler {
    private static final KeyBinding OPEN_CONFIG = new KeyBinding(
            "Open NoScreenShake Config",
            Keyboard.KEY_K,
            "No Screen Shake"
    );

    public static void init() {
        ClientRegistry.registerKeyBinding(OPEN_CONFIG);

    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (OPEN_CONFIG.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new NoScreenShakeGui());
        }
    }
}
