package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.GeneratorBreakerSwitchesMenu;
import net.mcreator.fnafmod.procedures.BreakerCheckAllProcedure;
import net.mcreator.fnafmod.procedures.BreakerCheck9Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck8Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck7Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck6Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck5Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck4Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck3Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck2Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck1Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck16Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck15Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck14Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck13Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck12Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck11Procedure;
import net.mcreator.fnafmod.procedures.BreakerCheck10Procedure;
import net.mcreator.fnafmod.network.GeneratorBreakerSwitchesButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GeneratorBreakerSwitchesScreen extends AbstractContainerScreen<GeneratorBreakerSwitchesMenu> {
	private final static HashMap<String, Object> guistate = GeneratorBreakerSwitchesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_generatorswitchbutton;
	ImageButton imagebutton_generatorswitchbutton1;
	ImageButton imagebutton_generatorswitchbutton2;
	ImageButton imagebutton_generatorswitchbutton3;
	ImageButton imagebutton_generatorswitchbutton4;
	ImageButton imagebutton_generatorswitchbutton5;
	ImageButton imagebutton_generatorswitchbutton6;
	ImageButton imagebutton_generatorswitchbutton7;
	ImageButton imagebutton_generatorswitchbutton8;
	ImageButton imagebutton_generatorswitchbutton9;
	ImageButton imagebutton_generatorswitchbutton10;
	ImageButton imagebutton_generatorswitchbutton11;
	ImageButton imagebutton_generatorswitchbutton12;
	ImageButton imagebutton_generatorswitchbutton13;
	ImageButton imagebutton_generatorswitchbutton14;
	ImageButton imagebutton_generatorswitchbutton15;

	public GeneratorBreakerSwitchesScreen(GeneratorBreakerSwitchesMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/generatorbreakerswitches.png"), this.leftPos + 15, this.topPos + -20, 0, 0, 144, 192, 144, 192);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 4, 0, 0, 24, 12, 24, 12);

		if (BreakerCheck1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 4, 0, 0, 24, 12, 24, 12);
		}

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 22, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 40, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 58, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 76, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 94, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 112, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 39, this.topPos + 130, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 4, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 22, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 40, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 58, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 76, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 94, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 112, 0, 0, 24, 12, 24, 12);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchoff.png"), this.leftPos + 111, this.topPos + 130, 0, 0, 24, 12, 24, 12);

		if (BreakerCheck2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 4, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 22, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 22, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 40, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 40, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 58, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 76, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 94, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 112, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck15Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 39, this.topPos + 130, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 58, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 76, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 94, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 112, 0, 0, 24, 12, 24, 12);
		}
		if (BreakerCheck16Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerswitchon.png"), this.leftPos + 111, this.topPos + 130, 0, 0, 24, 12, 24, 12);
		}

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerredstoneoff.png"), this.leftPos + 69, this.topPos + 118, 0, 0, 36, 18, 36, 18);

		if (BreakerCheckAllProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/breakerredstoneon.png"), this.leftPos + 69, this.topPos + 118, 0, 0, 36, 18, 36, 18);
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
		imagebutton_generatorswitchbutton = new ImageButton(this.leftPos + 39, this.topPos + 4, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(0, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton", imagebutton_generatorswitchbutton);
		this.addRenderableWidget(imagebutton_generatorswitchbutton);
		imagebutton_generatorswitchbutton1 = new ImageButton(this.leftPos + 111, this.topPos + 4, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton1.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(1, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton1", imagebutton_generatorswitchbutton1);
		this.addRenderableWidget(imagebutton_generatorswitchbutton1);
		imagebutton_generatorswitchbutton2 = new ImageButton(this.leftPos + 39, this.topPos + 22, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton2.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(2, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton2", imagebutton_generatorswitchbutton2);
		this.addRenderableWidget(imagebutton_generatorswitchbutton2);
		imagebutton_generatorswitchbutton3 = new ImageButton(this.leftPos + 111, this.topPos + 22, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton3.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(3, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton3", imagebutton_generatorswitchbutton3);
		this.addRenderableWidget(imagebutton_generatorswitchbutton3);
		imagebutton_generatorswitchbutton4 = new ImageButton(this.leftPos + 39, this.topPos + 40, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton4.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(4, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton4", imagebutton_generatorswitchbutton4);
		this.addRenderableWidget(imagebutton_generatorswitchbutton4);
		imagebutton_generatorswitchbutton5 = new ImageButton(this.leftPos + 111, this.topPos + 40, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton5.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(5, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton5", imagebutton_generatorswitchbutton5);
		this.addRenderableWidget(imagebutton_generatorswitchbutton5);
		imagebutton_generatorswitchbutton6 = new ImageButton(this.leftPos + 111, this.topPos + 58, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton6.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(6, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton6", imagebutton_generatorswitchbutton6);
		this.addRenderableWidget(imagebutton_generatorswitchbutton6);
		imagebutton_generatorswitchbutton7 = new ImageButton(this.leftPos + 39, this.topPos + 58, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton7.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(7, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton7", imagebutton_generatorswitchbutton7);
		this.addRenderableWidget(imagebutton_generatorswitchbutton7);
		imagebutton_generatorswitchbutton8 = new ImageButton(this.leftPos + 39, this.topPos + 76, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton8.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(8, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton8", imagebutton_generatorswitchbutton8);
		this.addRenderableWidget(imagebutton_generatorswitchbutton8);
		imagebutton_generatorswitchbutton9 = new ImageButton(this.leftPos + 111, this.topPos + 76, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton9.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(9, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton9", imagebutton_generatorswitchbutton9);
		this.addRenderableWidget(imagebutton_generatorswitchbutton9);
		imagebutton_generatorswitchbutton10 = new ImageButton(this.leftPos + 39, this.topPos + 94, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton10.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(10, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton10", imagebutton_generatorswitchbutton10);
		this.addRenderableWidget(imagebutton_generatorswitchbutton10);
		imagebutton_generatorswitchbutton11 = new ImageButton(this.leftPos + 111, this.topPos + 94, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton11.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(11, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton11", imagebutton_generatorswitchbutton11);
		this.addRenderableWidget(imagebutton_generatorswitchbutton11);
		imagebutton_generatorswitchbutton12 = new ImageButton(this.leftPos + 39, this.topPos + 112, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton12.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(12, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton12", imagebutton_generatorswitchbutton12);
		this.addRenderableWidget(imagebutton_generatorswitchbutton12);
		imagebutton_generatorswitchbutton13 = new ImageButton(this.leftPos + 111, this.topPos + 112, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton13.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(13, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton13", imagebutton_generatorswitchbutton13);
		this.addRenderableWidget(imagebutton_generatorswitchbutton13);
		imagebutton_generatorswitchbutton14 = new ImageButton(this.leftPos + 39, this.topPos + 130, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton14.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(14, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton14", imagebutton_generatorswitchbutton14);
		this.addRenderableWidget(imagebutton_generatorswitchbutton14);
		imagebutton_generatorswitchbutton15 = new ImageButton(this.leftPos + 111, this.topPos + 130, 24, 12, 0, 0, 12, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_generatorswitchbutton15.png"), 24, 24, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GeneratorBreakerSwitchesButtonMessage(15, x, y, z));
				GeneratorBreakerSwitchesButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_generatorswitchbutton15", imagebutton_generatorswitchbutton15);
		this.addRenderableWidget(imagebutton_generatorswitchbutton15);
	}
}
