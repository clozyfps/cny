package net.mcreator.craftnoyaiba.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnoyaiba.world.inventory.UniformTypeSelectorMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class UniformTypeSelectorScreen extends AbstractContainerScreen<UniformTypeSelectorMenu> {
	private final static HashMap<String, Object> guistate = UniformTypeSelectorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_normal;
	Button button_unique;

	public UniformTypeSelectorScreen(UniformTypeSelectorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftnoyaiba:textures/screens/uniform_type_selector.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_normal = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_type_selector.button_normal"), e -> {
		}).bounds(this.leftPos + -73, this.topPos + 61, 56, 20).build();
		guistate.put("button:button_normal", button_normal);
		this.addRenderableWidget(button_normal);
		button_unique = Button.builder(Component.translatable("gui.craftnoyaiba.uniform_type_selector.button_unique"), e -> {
		}).bounds(this.leftPos + 17, this.topPos + 61, 56, 20).build();
		guistate.put("button:button_unique", button_unique);
		this.addRenderableWidget(button_unique);
	}
}
