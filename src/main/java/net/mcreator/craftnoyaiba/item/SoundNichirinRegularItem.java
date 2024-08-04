
package net.mcreator.craftnoyaiba.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SoundNichirinRegularItem extends SwordItem {
	public SoundNichirinRegularItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
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
		list.add(Component.literal("\u00A7e\u25C6 \u00A7fA Nichirin Blade accomodating \u00A7l\u00A76Sound Breathing"));
		list.add(Component.literal("\u00A7e\u25C6 \u00A7b+1 Sound Breathing Affinity"));
		list.add(Component.literal("\u00A77\u2662 Unrefined"));
	}
}
