package com.vera.betterplayermodels.mixin;

import com.vera.betterplayermodels.BetterPlayerModels;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class BetterPlayerModelsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		BetterPlayerModels.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
