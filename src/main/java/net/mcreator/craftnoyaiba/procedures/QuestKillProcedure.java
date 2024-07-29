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

private static void execute(
@Nullable Event event,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (entity instanceof BasicDemonEntity) {if ((sourceentity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craftnoyaiba:the_final_selection"))) {if (<15) {}}}if (entity instanceof HandDemonEntity) {if ((sourceentity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craftnoyaiba:the_final_selection"))) {if (!) {}}}
}
}
