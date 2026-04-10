package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.GeneratorCreativeGUIMenu;
import net.mcreator.fnafmod.procedures.GenCreativePowerReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeDrainRateReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeDrainFrequencyReturnProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GeneratorCreativeGUIScreen extends AbstractContainerScreen<GeneratorCreativeGUIMenu> {
	private final static HashMap<String, Object> guistate = GeneratorCreativeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GeneratorCreativeGUIScreen(GeneratorCreativeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/generatorcreativebase.png"), this.leftPos + 6, this.topPos + -29, 0, 0, 166, 214, 166, 214);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.generator_creative_gui.label_sgygf"), 34, 3, -26368, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.generator_creative_gui.label_drain"), 34, 15, -3381760, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.generator_creative_gui.label_idk_yet"), 34, 27, -26368, false);
		guiGraphics.drawString(this.font,

				GenCreativePowerReturnProcedure.execute(world, x, y, z), 85, 3, -26368, false);
		guiGraphics.drawString(this.font,

				GenCreativeDrainRateReturnProcedure.execute(world, x, y, z), 80, 15, -3381760, false);
		guiGraphics.drawString(this.font,

				GenCreativeDrainFrequencyReturnProcedure.execute(world, x, y, z), 83, 27, -26368, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
