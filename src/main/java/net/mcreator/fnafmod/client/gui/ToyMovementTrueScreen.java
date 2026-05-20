package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.ToyMovementTrueMenu;
import net.mcreator.fnafmod.network.ToyMovementTrueButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ToyMovementTrueScreen extends AbstractContainerScreen<ToyMovementTrueMenu> {
	private final static HashMap<String, Object> guistate = ToyMovementTrueMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_party_selector_done_button;
	ImageButton imagebutton_toy_movement_button;

	public ToyMovementTrueScreen(ToyMovementTrueMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 75;
		this.imageHeight = 74;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/screens/toy_movement_true.png");

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

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/toy_movement_button_off.png"), this.leftPos + 5, this.topPos + 25, 0, 0, 65, 19, 65, 19);

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/toy_movement_button_on.png"), this.leftPos + 5, this.topPos + 25, 0, 0, 65, 19, 65, 19);

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
		imagebutton_toy_movement_button = new ImageButton(this.leftPos + 5, this.topPos + 25, 65, 19, 0, 0, 19, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_toy_movement_button.png"), 65, 38, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new ToyMovementTrueButtonMessage(1, x, y, z));
				ToyMovementTrueButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_toy_movement_button", imagebutton_toy_movement_button);
		this.addRenderableWidget(imagebutton_toy_movement_button);
	}
}
