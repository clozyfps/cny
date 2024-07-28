package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class BloodDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7l\u00A7cBlood: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).Blood);
	}
}
