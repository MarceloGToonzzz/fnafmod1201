package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.world.inventory.GenCreativeConfigGUIMenu;
import net.mcreator.fnafmod.procedures.GenLeverDownReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeLeverAutoReturnProcedure;
import net.mcreator.fnafmod.procedures.GenCreativeAccessLevelReturnProcedure;
import net.mcreator.fnafmod.network.GenCreativeConfigGUIButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GenCreativeConfigGUIScreen extends AbstractContainerScreen<GenCreativeConfigGUIMenu> {
	private final static HashMap<String, Object> guistate = GenCreativeConfigGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox PowerCycle;
	EditBox BreakerDrain;
	EditBox DoorDrainInput;
	EditBox LightDrainInput;
	Button button_apply;
	Button button_empty;
	Button button_empty1;

	public GenCreativeConfigGUIScreen(GenCreativeConfigGUIMenu container, Inventory inventory, Component text) {
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
		PowerCycle.render(guiGraphics, mouseX, mouseY, partialTicks);
		BreakerDrain.render(guiGraphics, mouseX, mouseY, partialTicks);
		DoorDrainInput.render(guiGraphics, mouseX, mouseY, partialTicks);
		LightDrainInput.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/generatorcreativebase.png"), this.leftPos + 6, this.topPos + -29, 0, 0, 166, 214, 166, 214);

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
		if (PowerCycle.isFocused())
			return PowerCycle.keyPressed(key, b, c);
		if (BreakerDrain.isFocused())
			return BreakerDrain.keyPressed(key, b, c);
		if (DoorDrainInput.isFocused())
			return DoorDrainInput.keyPressed(key, b, c);
		if (LightDrainInput.isFocused())
			return LightDrainInput.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		PowerCycle.tick();
		BreakerDrain.tick();
		DoorDrainInput.tick();
		LightDrainInput.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String PowerCycleValue = PowerCycle.getValue();
		String BreakerDrainValue = BreakerDrain.getValue();
		String DoorDrainInputValue = DoorDrainInput.getValue();
		String LightDrainInputValue = LightDrainInput.getValue();
		super.resize(minecraft, width, height);
		PowerCycle.setValue(PowerCycleValue);
		BreakerDrain.setValue(BreakerDrainValue);
		DoorDrainInput.setValue(DoorDrainInputValue);
		LightDrainInput.setValue(LightDrainInputValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.label_generator_auto_cycle"), 36, 62, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.label_0off"), 42, 72, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.label_1auto_off"), 42, 82, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.label_2both"), 42, 92, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.label_3auto_on"), 42, 102, -3407872, false);
		guiGraphics.drawString(this.font,

				GenCreativeLeverAutoReturnProcedure.execute(world, x, y, z), 93, 62, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.label_access_level"), 36, 115, -6750055, false);
		guiGraphics.drawString(this.font,

				GenCreativeAccessLevelReturnProcedure.execute(world, x, y, z), 105, 115, -6750055, false);
	}

	@Override
	public void init() {
		super.init();
		PowerCycle = new EditBox(this.font, this.leftPos + 34, this.topPos + -1, 118, 18, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.PowerCycle")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.PowerCycle").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.PowerCycle").getString());
				else
					setSuggestion(null);
			}
		};
		PowerCycle.setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.PowerCycle").getString());
		PowerCycle.setMaxLength(32767);
		guistate.put("text:PowerCycle", PowerCycle);
		this.addWidget(this.PowerCycle);
		BreakerDrain = new EditBox(this.font, this.leftPos + 34, this.topPos + 19, 118, 18, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.BreakerDrain")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.BreakerDrain").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.BreakerDrain").getString());
				else
					setSuggestion(null);
			}
		};
		BreakerDrain.setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.BreakerDrain").getString());
		BreakerDrain.setMaxLength(32767);
		guistate.put("text:BreakerDrain", BreakerDrain);
		this.addWidget(this.BreakerDrain);
		DoorDrainInput = new EditBox(this.font, this.leftPos + 25, this.topPos + 128, 118, 18, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.DoorDrainInput")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.DoorDrainInput").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.DoorDrainInput").getString());
				else
					setSuggestion(null);
			}
		};
		DoorDrainInput.setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.DoorDrainInput").getString());
		DoorDrainInput.setMaxLength(32767);
		guistate.put("text:DoorDrainInput", DoorDrainInput);
		this.addWidget(this.DoorDrainInput);
		LightDrainInput = new EditBox(this.font, this.leftPos + 25, this.topPos + 148, 118, 18, Component.translatable("gui.fnaf_mod.gen_creative_config_gui.LightDrainInput")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.LightDrainInput").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.LightDrainInput").getString());
				else
					setSuggestion(null);
			}
		};
		LightDrainInput.setSuggestion(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.LightDrainInput").getString());
		LightDrainInput.setMaxLength(32767);
		guistate.put("text:LightDrainInput", LightDrainInput);
		this.addWidget(this.LightDrainInput);
		button_apply = Button.builder(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.button_apply"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GenCreativeConfigGUIButtonMessage(0, x, y, z));
				GenCreativeConfigGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 167, 51, 20).build();
		guistate.put("button:button_apply", button_apply);
		this.addRenderableWidget(button_apply);
		button_empty = Button.builder(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.button_empty"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GenCreativeConfigGUIButtonMessage(1, x, y, z));
				GenCreativeConfigGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 80, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.fnaf_mod.gen_creative_config_gui.button_empty1"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new GenCreativeConfigGUIButtonMessage(2, x, y, z));
				GenCreativeConfigGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 108, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
