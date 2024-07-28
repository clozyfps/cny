
package net.mcreator.craftnoyaiba.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BigGourdItem extends Item {
	public BigGourdItem() {
		super(new Item.Properties().durability(15).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SmallGourdRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}