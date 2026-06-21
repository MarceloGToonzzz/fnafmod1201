package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.PartySystemMenu;
import net.mcreator.fnafmod.network.PartySystemButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PartySystemScreen extends AbstractContainerScreen<PartySystemMenu> {
	private final static HashMap<String, Object> guistate = PartySystemMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_party_selector_reset_button;
	ImageButton imagebutton_party_selector_done_button;
	ImageButton imagebutton_party_selector_slot_button;

	public PartySystemScreen(PartySystemMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 294;
		this.imageHeight = 122;
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

		guiGraphics.blit(new ResourceLocation("fnaf_mod:textures/screens/party_selector_page_1.png"), this.leftPos + 68, this.topPos + 0, 0, 0, 226, 122, 226, 122);

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
		imagebutton_party_selector_reset_button = new ImageButton(this.leftPos + 224, this.topPos + 74, 65, 19, 0, 0, 19, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_party_selector_reset_button.png"), 65, 38, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(0, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_party_selector_reset_button", imagebutton_party_selector_reset_button);
		this.addRenderableWidget(imagebutton_party_selector_reset_button);
		imagebutton_party_selector_done_button = new ImageButton(this.leftPos + 224, this.topPos + 95, 65, 19, 0, 0, 19, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_party_selector_done_button.png"), 65, 38, e -> {
		});
		guistate.put("button:imagebutton_party_selector_done_button", imagebutton_party_selector_done_button);
		this.addRenderableWidget(imagebutton_party_selector_done_button);
		imagebutton_party_selector_slot_button = new ImageButton(this.leftPos + 75, this.topPos + 7, 144, 108, 0, 0, 108, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_party_selector_slot_button.png"), 144, 216, e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(2, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_party_selector_slot_button", imagebutton_party_selector_slot_button);
		this.addRenderableWidget(imagebutton_party_selector_slot_button);
	}
}
