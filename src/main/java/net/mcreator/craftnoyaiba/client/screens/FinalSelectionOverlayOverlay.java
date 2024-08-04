
package net.mcreator.craftnoyaiba.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnoyaiba.procedures.ShowCompletedFinalSelection2Procedure;
import net.mcreator.craftnoyaiba.procedures.ShowCompletedFinalSelection1Procedure;
import net.mcreator.craftnoyaiba.procedures.FinalSelectionOverlayDisplayOverlayIngameProcedure;
import net.mcreator.craftnoyaiba.procedures.FinalSelectionGoalNew2Procedure;
import net.mcreator.craftnoyaiba.procedures.FinalSelectionGoalFirstProcedure;
import net.mcreator.craftnoyaiba.procedures.FinalSelectionGoal4Procedure;
import net.mcreator.craftnoyaiba.procedures.FinalSelectionGoal3Procedure;
import net.mcreator.craftnoyaiba.procedures.FinalSelectionGoal2Procedure;
import net.mcreator.craftnoyaiba.procedures.FinalSelectionGoal1Procedure;

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
		if (FinalSelectionOverlayDisplayOverlayIngameProcedure.execute(entity)) {
			if (FinalSelectionGoalFirstProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						FinalSelectionGoal1Procedure.execute(entity), 9, 11, -1, false);
			if (ShowCompletedFinalSelection1Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						FinalSelectionGoal4Procedure.execute(), 9, 11, -1, false);
			if (ShowCompletedFinalSelection2Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						FinalSelectionGoal3Procedure.execute(), 9, 27, -1, false);
			if (FinalSelectionGoalNew2Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						FinalSelectionGoal2Procedure.execute(), 9, 27, -1, false);
		}
	}
}
