package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class FinalSelectionGoal1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7lDefeat Demons: [" + (entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).FinalSelectionProgress1 + "/15]";
	}
}
