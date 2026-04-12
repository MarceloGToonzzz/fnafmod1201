package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.GeneratorCreativeGUIMenu;
import net.mcreator.fnafmod.procedures.LightDrainReturnProcedure;
import net.mcreator.fnafmod.procedures.GenLeverUpReturnProcedure;
import net.mcreator.fnafmod.procedures.GenLeverDownReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativePowerReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeLeverAutoReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeDrainRateReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeDrainFrequencyReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeAccessLevelReturnProcedure;
import net.mcreator.fnafmod.procedures.DoorDrainReturnProcedure;
import net.mcreator.fnafmod.network.GeneratorCreativeGUIButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GeneratorCreativeGUIScreen extends AbstractContainerScreen<GeneratorCreativeGUIMenu> {
	private final static HashMap<String, Object> guistate = GeneratorCreativeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_genleverbutton;

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

		if (GenLeverUpReturnProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/genleverdown.png"), this.leftPos + 114, this.topPos + 67, 0, 0, 32, 44, 32, 44);
		}
		if (GenLeverDownReturnProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/genleverup.png"), this.leftPos + 114, this.topPos + 67, 0, 0, 32, 44, 32, 44);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.generator_creative_gui.label_doors"), 28, 131, -16711936, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.generator_creative_gui.label_lights"), 28, 145, -16724992, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.generator_creative_gui.label_access"), 81, 129, -3407668, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.generator_creative_gui.label_auto"), 81, 147, -6750055, false);
		guiGraphics.drawString(this.font,

				LightDrainReturnProcedure.execute(world, x, y, z), 61, 145, -16724992, false);
		guiGraphics.drawString(this.font,

				DoorDrainReturnProcedure.execute(world, x, y, z), 61, 131, -16711936, false);
		guiGraphics.drawString(this.font,

				GenCreativeLeverAutoReturnProcedure.execute(world, x, y, z), 109, 147, -6750055, false);
		guiGraphics.drawString(this.font,

				GenCreativeAccessLevelReturnProcedure.execute(world, x, y, z), 112, 136, -3407668, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_genleverbutton = new ImageButton(this.leftPos + 114, this.topPos + 67, 32, 44, 0, 0, 44, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_genleverbutton.png"), 32, 88, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorCreativeGUIButtonMessage(0, x, y, z));
				GeneratorCreativeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_genleverbutton", imagebutton_genleverbutton);
		this.addRenderableWidget(imagebutton_genleverbutton);
	}
}
