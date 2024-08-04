
package net.mcreator.craftnoyaiba.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnoyaiba.procedures.BasicNichirinSwordEntitySwingsItemProcedure;

import java.util.List;

public class SpecialThunderNichirinItem extends SwordItem {
	public SpecialThunderNichirinItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A7e\u25C6 \u00A7fA Nichirin Blade accomodating \u00A7l\u00A7eThunder Breathing"));
		list.add(Component.literal("\u00A7e\u25C6 \u00A7b+2 Thunder Breathing Affinity"));
		list.add(Component.literal("\u00A77\u2662 Unrefined"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			BasicNichirinSwordEntitySwingsItemProcedure.execute(entity);
	}
}
