package me.nickotato.noscreenshake.gui;

import me.nickotato.noscreenshake.config.NoScreenShakeConfig;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class NoScreenShakeGui extends GuiScreen {
    private GuiButton toggleEnable;

    @Override
    public void initGui() {
        toggleEnable = new GuiButton(0, width/2 - 100, height/2 - 10, "Enabled: " + NoScreenShakeConfig.enabled);
        buttonList.add(toggleEnable);
    }

    @Override
    public void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            NoScreenShakeConfig.enabled = !NoScreenShakeConfig.enabled;
            NoScreenShakeConfig.save();
            button.displayString = "Enabled: " + NoScreenShakeConfig.enabled;
        }
    }
}
