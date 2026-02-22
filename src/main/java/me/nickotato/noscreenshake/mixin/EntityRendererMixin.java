package me.nickotato.noscreenshake.mixin;

import me.nickotato.noscreenshake.config.NoScreenShakeConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin {
    @Redirect(method = "setupCameraTransform", at = @At(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;viewBobbing:Z", ordinal = 0))
    private boolean noScreenShake(GameSettings instance) {
        if (Minecraft.getMinecraft().currentScreen != null) return false;
        return instance.viewBobbing && !NoScreenShakeConfig.enabled;
    }
}
