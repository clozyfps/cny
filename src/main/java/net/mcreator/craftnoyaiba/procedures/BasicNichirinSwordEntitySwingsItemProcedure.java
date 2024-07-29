package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

public class BasicNichirinSwordEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomarm = 0;
		entity.getPersistentData().putDouble("swingtimer", 10);
		{
			double _setval = 15;
			entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ActiveLimbTimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		randomarm = Mth.nextInt(RandomSource.create(), 1, 2);
		if (randomarm == 1) {
			{
				String _setval = "Right Arm";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ActiveLimbTarget = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (randomarm == 2) {
			{
				String _setval = "Left Arm";
				entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ActiveLimbTarget = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
