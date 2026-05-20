package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.ToyMovementMenu;
import net.mcreator.fnafmod.procedures.CheckToyMovementEntityPosProcedure;
import net.mcreator.fnafmod.network.ToyMovementButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ToyMovementScreen extends AbstractContainerScreen<ToyMovementMenu> {
	private final static HashMap<String, Object> guistate = ToyMovementMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_party_selector_done_button;
	ImageButton imagebutton_toy_movement_button_off;
	ImageButton imagebutton_toy_movement_button_on;

	public ToyMovementScreen(ToyMovementMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 75;
		this.imageHeight = 74;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/screens/toy_movement.png");

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

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/toy_movement_gui.png"), this.leftPos + 0, this.topPos + -1, 0, 0, 75, 75, 75, 75);

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
		imagebutton_party_selector_done_button = new ImageButton(this.leftPos + 5, this.topPos + 48, 65, 19, 0, 0, 19, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_party_selector_done_button.png"), 65, 38, e -> {
		});
		guistate.put("button:imagebutton_party_selector_done_button", imagebutton_party_selector_done_button);
		this.addRenderableWidget(imagebutton_party_selector_done_button);
		imagebutton_toy_movement_button_off = new ImageButton(this.leftPos + 76, this.topPos + 2, 65, 19, 0, 0, 19, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_toy_movement_button_off.png"), 65, 38, e -> {
			if (CheckToyMovementEntityPosProcedure.execute(world, x, y, z)) {
				FnafModMod.PACKET_HANDLER.sendToServer(new ToyMovementButtonMessage(1, x, y, z));
				ToyMovementButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = CheckToyMovementEntityPosProcedure.execute(world, x, y, z);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_toy_movement_button_off", imagebutton_toy_movement_button_off);
		this.addRenderableWidget(imagebutton_toy_movement_button_off);
		imagebutton_toy_movement_button_on = new ImageButton(this.leftPos + 76, this.topPos + 22, 65, 19, 0, 0, 19, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_toy_movement_button_on.png"), 65, 38, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new ToyMovementButtonMessage(2, x, y, z));
				ToyMovementButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_toy_movement_button_on", imagebutton_toy_movement_button_on);
		this.addRenderableWidget(imagebutton_toy_movement_button_on);
	}
}
