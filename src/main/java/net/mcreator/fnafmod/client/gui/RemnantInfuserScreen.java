package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.RemnantInfuserMenu;
import net.mcreator.fnafmod.procedures.Remnant1Procedure;
import net.mcreator.fnafmod.procedures.Remant3Procedure;
import net.mcreator.fnafmod.procedures.Remant2Procedure;
import net.mcreator.fnafmod.procedures.Progress6Procedure;
import net.mcreator.fnafmod.procedures.Progress5Procedure;
import net.mcreator.fnafmod.procedures.Progress4Procedure;
import net.mcreator.fnafmod.procedures.Progress3Procedure;
import net.mcreator.fnafmod.procedures.Progress2Procedure;
import net.mcreator.fnafmod.procedures.Progress1Procedure;
import net.mcreator.fnafmod.procedures.DarkRemnant3Procedure;
import net.mcreator.fnafmod.procedures.DarkRemnant2Procedure;
import net.mcreator.fnafmod.procedures.DarkRemnant1Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RemnantInfuserScreen extends AbstractContainerScreen<RemnantInfuserMenu> {
	private final static HashMap<String, Object> guistate = RemnantInfuserMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RemnantInfuserScreen(RemnantInfuserMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/screens/remnant_infuser.png");

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
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/remnant_infuser_bbackground.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (Remnant1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/energy_low.png"), this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Remant2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/energy_2.png"), this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Remant3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/energy_full.png"), this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/progress_1.png"), this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/progress_2nd.png"), this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/progress_3rd.png"), this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/progress_2nd_to_last.png"), this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/progress_last.png"), this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/progress_full.png"), this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (DarkRemnant3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/darkremnant.png"), this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (DarkRemnant2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/darkremnant2.png"), this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (DarkRemnant1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/darkremnantlow.png"), this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
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
	}

	@Override
	public void init() {
		super.init();
	}
}
