package net.mcreator.craftnoyaiba.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnoyaiba.world.inventory.UniformSelectorMenu;
import net.mcreator.craftnoyaiba.network.UniformSelectorButtonMessage;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class UniformSelectorScreen extends AbstractContainerScreen<UniformSelectorMenu> {
	private final static HashMap<String, Object> guistate = UniformSelectorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_black;
	Button button_black1;
	Button button_black2;
	Button button_black3;
	Button button_black4;
	Button button_green;
	Button button_brown;

	public UniformSelectorScreen(UniformSelectorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftnoyaiba:textures/screens/uniform_selector.png");

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.craftnoyaiba.uniform_selector.label_sslwhat_color_uniform"), -64, 160, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_black = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_selector.button_black"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UniformSelectorButtonMessage(0, x, y, z));
				UniformSelectorButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -19, this.topPos + -2, 51, 20).build();
		guistate.put("button:button_black", button_black);
		this.addRenderableWidget(button_black);
		button_black1 = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_selector.button_black1"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UniformSelectorButtonMessage(1, x, y, z));
				UniformSelectorButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -19, this.topPos + 25, 51, 20).build();
		guistate.put("button:button_black1", button_black1);
		this.addRenderableWidget(button_black1);
		button_black2 = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_selector.button_black2"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UniformSelectorButtonMessage(2, x, y, z));
				UniformSelectorButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -19, this.topPos + 52, 51, 20).build();
		guistate.put("button:button_black2", button_black2);
		this.addRenderableWidget(button_black2);
		button_black3 = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_selector.button_black3"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UniformSelectorButtonMessage(3, x, y, z));
				UniformSelectorButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -19, this.topPos + 79, 51, 20).build();
		guistate.put("button:button_black3", button_black3);
		this.addRenderableWidget(button_black3);
		button_black4 = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_selector.button_black4"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UniformSelectorButtonMessage(4, x, y, z));
				UniformSelectorButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -19, this.topPos + 106, 51, 20).build();
		guistate.put("button:button_black4", button_black4);
		this.addRenderableWidget(button_black4);
		button_green = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_selector.button_green"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UniformSelectorButtonMessage(5, x, y, z));
				UniformSelectorButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + -19, this.topPos + 133, 51, 20).build();
		guistate.put("button:button_green", button_green);
		this.addRenderableWidget(button_green);
		button_brown = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_selector.button_brown"), e -> {
			if (true) {
				CraftnoyaibaMod.PACKET_HANDLER.sendToServer(new UniformSelectorButtonMessage(6, x, y, z));
				UniformSelectorButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + -19, this.topPos + -29, 51, 20).build();
		guistate.put("button:button_brown", button_brown);
		this.addRenderableWidget(button_brown);
	}
}
