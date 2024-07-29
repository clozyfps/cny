package net.mcreator.craftnoyaiba.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class BasicDemonOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("demonlook", (Mth.nextInt(RandomSource.create(), 1, 3)));
		entity.getPersistentData().putDouble("resistance", (Mth.nextInt(RandomSource.create(), 1, 2)));
		entity.getPersistentData().putDouble("strength", (Mth.nextInt(RandomSource.create(), 1, 3)));
		if (entity.getPersistentData().getDouble("resistance") == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 99999, Mth.nextInt(RandomSource.create(), 0, 2)));
		}
		if (entity.getPersistentData().getDouble("strength") == 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 99999, Mth.nextInt(RandomSource.create(), 0, 3)));
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + Mth.nextInt(RandomSource.create(), 0, 100)));
	}
}
