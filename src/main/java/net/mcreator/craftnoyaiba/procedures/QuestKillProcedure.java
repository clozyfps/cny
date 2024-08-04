package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class QuestKillProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof BasicDemonEntity) {
			if ((sourceentity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craftnoyaiba:the_final_selection"))) {
				if ((sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).FinalSelectionProgress1 < 15) {
					{
						double _setval = (sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).FinalSelectionProgress1 + 1;
						sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FinalSelectionProgress1 = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			}
		}
		if (entity instanceof HandDemonEntity) {
			if ((sourceentity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craftnoyaiba:the_final_selection"))) {
				if (!(sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).HandDemonQuest) {
					{
						boolean _setval = true;
						sourceentity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HandDemonQuest = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			}
		}
	}
}
