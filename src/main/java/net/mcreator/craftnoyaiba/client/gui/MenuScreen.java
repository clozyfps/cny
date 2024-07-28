package net.mcreator.craftnoyaiba.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnoyaiba.world.inventory.MenuMenu;
import net.mcreator.craftnoyaiba.procedures.StrengthDisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.LevelDisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.DefenseDisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.BreatheDisplayConditionProcedure;
import net.mcreator.craftnoyaiba.procedures.BreathDisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.BloodUIDisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.BloodDisplayProcedure;
import net.mcreator.craftnoyaiba.procedures.AgilityDisplayProcedure;
import net.mcreator.craftnoyaiba.network.MenuButtonMessage;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MenuScreen extends AbstractContainerScreen<MenuMenu> {
	private final static HashMap<String, Object> guistate = MenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ssl;

	public MenuScreen(MenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftnoyaiba:textures/screens/menu.png");

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

		guiGraphics.blit(new ResourceLocation("craftnoyaiba:textures/screens/box.png"), this.leftPos + 179, this.topPos + 7, 0, 0, 17, 17, 17, 17);

		guiGraphics.blit(new ResourceLocation("craftnoyaiba:textures/screens/menunew.png"), this.leftPos + -217, this.topPos + -38, 0, 0, 427, 240, 427, 240);

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				LevelDisplayProcedure.execute(entity), -118, 34, -1, false);
		guiGraphics.drawString(this.font,

				StrengthDisplayProcedure.execute(entity), -118, 52, -1, false);
		guiGraphics.drawString(this.font,

				DefenseDisplayProcedure.execute(entity), -118, 70, -1, false);
		guiGraphics.drawString(this.font,

				AgilityDisplayProcedure.execute(entity), -118, 88, -1, false);
		if (BreatheDisplayConditionProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					BreathDisplayProcedure.execute(entity), -118, 106, -1, false);
		if (BloodUIDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					BloodDisplayProcedure.execute(entity), -118, 106, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_ssl = new PlainTextButton(this.leftPos + 181, this.topPos + 9, 46, 20, Component.translatable("gui.craftnoyaiba.menu.button_ssl"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(0, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_ssl", button_ssl);
		this.addRenderableWidget(button_ssl);
	}
}
