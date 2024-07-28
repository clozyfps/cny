package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class DefenseDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7lDefense: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).DefenseStat) + " ["
				+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).DefenseMastery) + "/"
				+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).DefenseMasteryCap) + "]";
	}
}
