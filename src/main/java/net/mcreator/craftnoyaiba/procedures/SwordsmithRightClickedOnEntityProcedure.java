package net.mcreator.craftnoyaiba.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnoyaiba.init.CraftnoyaibaModItems;

public class SwordsmithRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!((sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftnoyaibaModItems.CRIMSON_ORE.get())) : false)
				&& (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftnoyaibaModItems.CRIMSON_IRON_SAND.get())) : false))) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(("<" + entity.getDisplayName().getString() + ">" + " You need [" + "\u00A7l1" + "\u00A7r]" + " Crimson Ore, and [" + "\u00A7l1" + "\u00A7r]" + " Crimson Iron Sand for me to make a sword.")), false);
		} else if ((sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftnoyaibaModItems.CRIMSON_ORE.get())) : false)
				&& (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftnoyaibaModItems.CRIMSON_IRON_SAND.get())) : false)) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + ">" + " Here ya go!")), false);
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CraftnoyaibaModItems.CRIMSON_ORE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CraftnoyaibaModItems.CRIMSON_IRON_SAND.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
