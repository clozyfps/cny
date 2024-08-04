
package net.mcreator.craftnoyaiba.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MainOverlayOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);

		if (

		MainOverlayDisplayOverlayIngame2Procedure.execute(entity)

		) {

			if (

			BreatheBar0Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_00.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (

			BreatheBar1Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_0.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (

			BreatheBar2Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_1.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (

			BreatheBar3Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_2.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (

			BreatheBar4Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_3.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (

			BreatheBar5Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_4.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (

			BreatheBar7Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_full.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}
			if (

			BreatheBar6Procedure.execute(entity)

			) {
				event.getGuiGraphics().blit(new ResourceLocation("craftnoyaiba:textures/screens/slayer_ui_5.png"), 6, h / 2 + -85, 0, 0, 176, 166, 176, 166);
			}

		}

		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}

}
