package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftnoyaiba.network.CraftnoyaibaModVariables;

import javax.annotation.Nullable;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class EquipSwordProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem()) {
			if (!(entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).equipped) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "swordsheathing"))));
						}
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.equipped = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).EquippedSword).getItem())) {
			if ((entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftnoyaibaModVariables.PlayerVariables())).equipped) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftnoyaiba", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftnoyaiba", "swordsheathing"))));
						}
					}
				}
				{
					boolean _setval = false;
					entity.getCapability(CraftnoyaibaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.equipped = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
