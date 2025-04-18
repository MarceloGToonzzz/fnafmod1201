package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fnafmod.world.inventory.PartySystemMenu;
import net.mcreator.fnafmod.procedures.PartyListProcedure;
import net.mcreator.fnafmod.procedures.AWChiGuiProcedure;
import net.mcreator.fnafmod.procedures.ASprGuiProcedure;
import net.mcreator.fnafmod.procedures.AMangGUIProcedure;
import net.mcreator.fnafmod.procedures.AFredbGuiProcedure;
import net.mcreator.fnafmod.procedures.AFredGuiProcedure;
import net.mcreator.fnafmod.network.PartySystemButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PartySystemScreen extends AbstractContainerScreen<PartySystemMenu> {
	private final static HashMap<String, Object> guistate = PartySystemMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_reset;
	ImageButton imagebutton_adventure_withered_chica_icon;
	ImageButton imagebutton_adventure_freddy_icon;
	ImageButton imagebutton_adventure_mangle_icon;
	ImageButton imagebutton_adventure_springtrap_icon;
	ImageButton imagebutton_adventure_fredbear_icon;

	public PartySystemScreen(PartySystemMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 122;
		this.imageHeight = 66;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/screens/party_system.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.fnaf_mod.party_system.label_select_a_party_member"), 4, 4, -12829636, false);
		guiGraphics.drawString(this.font,

				PartyListProcedure.execute(entity), 66, 47, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_reset = Button.builder(Component.translatable("gui.fnaf_mod.party_system.button_reset"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(0, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 42, 51, 20).build();
		guistate.put("button:button_reset", button_reset);
		this.addRenderableWidget(button_reset);
		imagebutton_adventure_withered_chica_icon = new ImageButton(this.leftPos + 33, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_adventure_withered_chica_icon.png"), 16, 32, e -> {
			if (AWChiGuiProcedure.execute(entity)) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(1, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = AWChiGuiProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_adventure_withered_chica_icon", imagebutton_adventure_withered_chica_icon);
		this.addRenderableWidget(imagebutton_adventure_withered_chica_icon);
		imagebutton_adventure_freddy_icon = new ImageButton(this.leftPos + 15, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_adventure_freddy_icon.png"), 16, 32, e -> {
			if (AFredGuiProcedure.execute(entity)) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(2, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = AFredGuiProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_adventure_freddy_icon", imagebutton_adventure_freddy_icon);
		this.addRenderableWidget(imagebutton_adventure_freddy_icon);
		imagebutton_adventure_mangle_icon = new ImageButton(this.leftPos + 51, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_adventure_mangle_icon.png"), 16, 32, e -> {
			if (AMangGUIProcedure.execute(entity)) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(3, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = AMangGUIProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_adventure_mangle_icon", imagebutton_adventure_mangle_icon);
		this.addRenderableWidget(imagebutton_adventure_mangle_icon);
		imagebutton_adventure_springtrap_icon = new ImageButton(this.leftPos + 69, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_adventure_springtrap_icon.png"), 16, 32, e -> {
			if (ASprGuiProcedure.execute(entity)) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(4, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ASprGuiProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_adventure_springtrap_icon", imagebutton_adventure_springtrap_icon);
		this.addRenderableWidget(imagebutton_adventure_springtrap_icon);
		imagebutton_adventure_fredbear_icon = new ImageButton(this.leftPos + 87, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("fnaf_mod:textures/screens/atlas/imagebutton_adventure_fredbear_icon.png"), 16, 32, e -> {
			if (AFredbGuiProcedure.execute(entity)) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySystemButtonMessage(5, x, y, z));
				PartySystemButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = AFredbGuiProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_adventure_fredbear_icon", imagebutton_adventure_fredbear_icon);
		this.addRenderableWidget(imagebutton_adventure_fredbear_icon);
	}
}
