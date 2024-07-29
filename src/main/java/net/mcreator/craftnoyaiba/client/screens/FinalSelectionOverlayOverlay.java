
package net.mcreator.craftnoyaiba.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FinalSelectionOverlayOverlay {

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

		if (

		FinalSelectionOverlayDisplayOverlayIngameProcedure.execute(entity)

		) {

			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					FinalSelectionGoal1Procedure.execute(), 9, 11, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					FinalSelectionGoal2Procedure.execute(), 9, 27, -1, false);
			if (

			ShowCompletedFinalSelection1Procedure.execute()

			)
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						FinalSelectionGoal4Procedure.execute(), 9, 11, -1, false);
			if (

			ShowCompletedFinalSelection2Procedure.execute()

			)
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						FinalSelectionGoal3Procedure.execute(), 9, 27, -1, false);

		}

	}

}
