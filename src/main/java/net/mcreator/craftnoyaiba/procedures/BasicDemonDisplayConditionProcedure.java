package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.Entity;

public class BasicDemonDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("demonlook") == 3) {
			return true;
		}
		return false;
	}
}
