package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class XPress3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "";
			entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AbilityThree = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
