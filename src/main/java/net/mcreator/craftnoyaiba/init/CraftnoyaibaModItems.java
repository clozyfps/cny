
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnoyaiba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.craftnoyaiba.item.ZohakutenArmorItem;
import net.mcreator.craftnoyaiba.item.YellowLongItem;
import net.mcreator.craftnoyaiba.item.YellowItem;
import net.mcreator.craftnoyaiba.item.UpperMoonOneArmorItem;
import net.mcreator.craftnoyaiba.item.TrainingSwordItem;
import net.mcreator.craftnoyaiba.item.ThunderNichirinSwordItem;
import net.mcreator.craftnoyaiba.item.ThunderNichirinItem;
import net.mcreator.craftnoyaiba.item.TestItem;
import net.mcreator.craftnoyaiba.item.StoneHashiraItem;
import net.mcreator.craftnoyaiba.item.SpecialThunderNichirinItem;
import net.mcreator.craftnoyaiba.item.SoundNichirinSwordItem;
import net.mcreator.craftnoyaiba.item.SoundNichirinRegularItem;
import net.mcreator.craftnoyaiba.item.SoundHashiraItem;
import net.mcreator.craftnoyaiba.item.SmallGourdItem;
import net.mcreator.craftnoyaiba.item.RuiArmorItem;
import net.mcreator.craftnoyaiba.item.RifleItem;
import net.mcreator.craftnoyaiba.item.RedLongItem;
import net.mcreator.craftnoyaiba.item.RedItem;
import net.mcreator.craftnoyaiba.item.PurpleLongItem;
import net.mcreator.craftnoyaiba.item.PurpleItem;
import net.mcreator.craftnoyaiba.item.PistolItem;
import net.mcreator.craftnoyaiba.item.PinkLongItem;
import net.mcreator.craftnoyaiba.item.PinkItem;
import net.mcreator.craftnoyaiba.item.MuzanArmorItem;
import net.mcreator.craftnoyaiba.item.MuzanArmorCloaklessItem;
import net.mcreator.craftnoyaiba.item.MoonNichirinItem;
import net.mcreator.craftnoyaiba.item.MediumGourdItem;
import net.mcreator.craftnoyaiba.item.KhakkharaItem;
import net.mcreator.craftnoyaiba.item.KaigakuArmorItem;
import net.mcreator.craftnoyaiba.item.GreenLongItem;
import net.mcreator.craftnoyaiba.item.GreenItem;
import net.mcreator.craftnoyaiba.item.FlameNichirinItem;
import net.mcreator.craftnoyaiba.item.DemonSlayerUniformLongItem;
import net.mcreator.craftnoyaiba.item.DemonSlayerUniformItem;
import net.mcreator.craftnoyaiba.item.CrimsonOreItem;
import net.mcreator.craftnoyaiba.item.CrimsonIronSandItem;
import net.mcreator.craftnoyaiba.item.BrownLongItem;
import net.mcreator.craftnoyaiba.item.BrownItem;
import net.mcreator.craftnoyaiba.item.BlueLongItem;
import net.mcreator.craftnoyaiba.item.BlueItem;
import net.mcreator.craftnoyaiba.item.BloodItem;
import net.mcreator.craftnoyaiba.item.BladeItem;
import net.mcreator.craftnoyaiba.item.BigGourdItem;
import net.mcreator.craftnoyaiba.item.BasicNichirinSwordItem;
import net.mcreator.craftnoyaiba.CraftnoyaibaMod;

public class CraftnoyaibaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftnoyaibaMod.MODID);
	public static final RegistryObject<Item> BASIC_NICHIRIN_SWORD = REGISTRY.register("basic_nichirin_sword", () -> new BasicNichirinSwordItem());
	public static final RegistryObject<Item> JIGORO_KUWAJIMA_SPAWN_EGG = REGISTRY.register("jigoro_kuwajima_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.JIGORO_KUWAJIMA, -2171275, -1, new Item.Properties()));
	public static final RegistryObject<Item> KAIGAKU_HUMAN_SPAWN_EGG = REGISTRY.register("kaigaku_human_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.KAIGAKU_HUMAN, -16777216, -8998192, new Item.Properties()));
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> THUNDER_NICHIRIN_SWORD = REGISTRY.register("thunder_nichirin_sword", () -> new ThunderNichirinSwordItem());
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood", () -> new BloodItem());
	public static final RegistryObject<Item> DEMON_SLAYER_UNIFORM_CHESTPLATE = REGISTRY.register("demon_slayer_uniform_chestplate", () -> new DemonSlayerUniformItem.Chestplate());
	public static final RegistryObject<Item> DEMON_SLAYER_UNIFORM_LEGGINGS = REGISTRY.register("demon_slayer_uniform_leggings", () -> new DemonSlayerUniformItem.Leggings());
	public static final RegistryObject<Item> BLADE = REGISTRY.register("blade", () -> new BladeItem());
	public static final RegistryObject<Item> WISTERIA = block(CraftnoyaibaModBlocks.WISTERIA);
	public static final RegistryObject<Item> DEMON_SPAWN_POINT = block(CraftnoyaibaModBlocks.DEMON_SPAWN_POINT);
	public static final RegistryObject<Item> KIRIYA_UBUYASHIKI_SPAWN_EGG = REGISTRY.register("kiriya_ubuyashiki_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.KIRIYA_UBUYASHIKI, -8363899, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> KANATA_UBUYASHIKI_SPAWN_EGG = REGISTRY.register("kanata_ubuyashiki_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.KANATA_UBUYASHIKI, -8363899, -1, new Item.Properties()));
	public static final RegistryObject<Item> MUZAN_SPAWN_POINT = block(CraftnoyaibaModBlocks.MUZAN_SPAWN_POINT);
	public static final RegistryObject<Item> RIFLE = REGISTRY.register("rifle", () -> new RifleItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> KHAKKHARA = REGISTRY.register("khakkhara", () -> new KhakkharaItem());
	public static final RegistryObject<Item> TRAINING_SWORD = REGISTRY.register("training_sword", () -> new TrainingSwordItem());
	public static final RegistryObject<Item> SPECIAL_THUNDER_NICHIRIN = REGISTRY.register("special_thunder_nichirin", () -> new SpecialThunderNichirinItem());
	public static final RegistryObject<Item> FLAMING_THUNDER_GOD_SPAWN_EGG = REGISTRY.register("flaming_thunder_god_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.FLAMING_THUNDER_GOD, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SOUND_NICHIRIN_SWORD = REGISTRY.register("sound_nichirin_sword", () -> new SoundNichirinSwordItem());
	public static final RegistryObject<Item> ZENITSU_AGATSUMA_SPAWN_EGG = REGISTRY.register("zenitsu_agatsuma_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.ZENITSU_AGATSUMA, -14541, -1, new Item.Properties()));
	public static final RegistryObject<Item> PILLAR_MIDDLE = block(CraftnoyaibaModBlocks.PILLAR_MIDDLE);
	public static final RegistryObject<Item> PILLAR_BLOCK_BOTTOM = block(CraftnoyaibaModBlocks.PILLAR_BLOCK_BOTTOM);
	public static final RegistryObject<Item> PILLAR_BLOCK_TOP = block(CraftnoyaibaModBlocks.PILLAR_BLOCK_TOP);
	public static final RegistryObject<Item> UPPER_MOON_ONE_ARMOR_CHESTPLATE = REGISTRY.register("upper_moon_one_armor_chestplate", () -> new UpperMoonOneArmorItem.Chestplate());
	public static final RegistryObject<Item> UPPER_MOON_ONE_ARMOR_LEGGINGS = REGISTRY.register("upper_moon_one_armor_leggings", () -> new UpperMoonOneArmorItem.Leggings());
	public static final RegistryObject<Item> TATAMI_1 = block(CraftnoyaibaModBlocks.TATAMI_1);
	public static final RegistryObject<Item> TATAMI_2 = block(CraftnoyaibaModBlocks.TATAMI_2);
	public static final RegistryObject<Item> CRIMSON_ORE = REGISTRY.register("crimson_ore", () -> new CrimsonOreItem());
	public static final RegistryObject<Item> CRIMSON_IRON_SAND = REGISTRY.register("crimson_iron_sand", () -> new CrimsonIronSandItem());
	public static final RegistryObject<Item> BASIC_DEMON_SPAWN_EGG = REGISTRY.register("basic_demon_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.BASIC_DEMON, -7110795, -4342853, new Item.Properties()));
	public static final RegistryObject<Item> SWORDSMITH_SPAWN_EGG = REGISTRY.register("swordsmith_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.SWORDSMITH, -1, -2221542, new Item.Properties()));
	public static final RegistryObject<Item> SMALL_GOURD = REGISTRY.register("small_gourd", () -> new SmallGourdItem());
	public static final RegistryObject<Item> MEDIUM_GOURD = REGISTRY.register("medium_gourd", () -> new MediumGourdItem());
	public static final RegistryObject<Item> BIG_GOURD = REGISTRY.register("big_gourd", () -> new BigGourdItem());
	public static final RegistryObject<Item> HAND_DEMON_SPAWN_EGG = REGISTRY.register("hand_demon_spawn_egg", () -> new ForgeSpawnEggItem(CraftnoyaibaModEntities.HAND_DEMON, -9066915, -5877423, new Item.Properties()));
	public static final RegistryObject<Item> PURPLE_LONG_CHESTPLATE = REGISTRY.register("purple_long_chestplate", () -> new PurpleLongItem.Chestplate());
	public static final RegistryObject<Item> PURPLE_LONG_LEGGINGS = REGISTRY.register("purple_long_leggings", () -> new PurpleLongItem.Leggings());
	public static final RegistryObject<Item> BROWN_CHESTPLATE = REGISTRY.register("brown_chestplate", () -> new BrownItem.Chestplate());
	public static final RegistryObject<Item> BROWN_LEGGINGS = REGISTRY.register("brown_leggings", () -> new BrownItem.Leggings());
	public static final RegistryObject<Item> BLUE_CHESTPLATE = REGISTRY.register("blue_chestplate", () -> new BlueItem.Chestplate());
	public static final RegistryObject<Item> BLUE_LEGGINGS = REGISTRY.register("blue_leggings", () -> new BlueItem.Leggings());
	public static final RegistryObject<Item> SOUND_HASHIRA_HELMET = REGISTRY.register("sound_hashira_helmet", () -> new SoundHashiraItem.Helmet());
	public static final RegistryObject<Item> SOUND_HASHIRA_CHESTPLATE = REGISTRY.register("sound_hashira_chestplate", () -> new SoundHashiraItem.Chestplate());
	public static final RegistryObject<Item> SOUND_HASHIRA_LEGGINGS = REGISTRY.register("sound_hashira_leggings", () -> new SoundHashiraItem.Leggings());
	public static final RegistryObject<Item> RED_CHESTPLATE = REGISTRY.register("red_chestplate", () -> new RedItem.Chestplate());
	public static final RegistryObject<Item> RED_LEGGINGS = REGISTRY.register("red_leggings", () -> new RedItem.Leggings());
	public static final RegistryObject<Item> RED_LONG_CHESTPLATE = REGISTRY.register("red_long_chestplate", () -> new RedLongItem.Chestplate());
	public static final RegistryObject<Item> RED_LONG_LEGGINGS = REGISTRY.register("red_long_leggings", () -> new RedLongItem.Leggings());
	public static final RegistryObject<Item> KAIGAKU_ARMOR_CHESTPLATE = REGISTRY.register("kaigaku_armor_chestplate", () -> new KaigakuArmorItem.Chestplate());
	public static final RegistryObject<Item> KAIGAKU_ARMOR_LEGGINGS = REGISTRY.register("kaigaku_armor_leggings", () -> new KaigakuArmorItem.Leggings());
	public static final RegistryObject<Item> PINK_CHESTPLATE = REGISTRY.register("pink_chestplate", () -> new PinkItem.Chestplate());
	public static final RegistryObject<Item> PINK_LEGGINGS = REGISTRY.register("pink_leggings", () -> new PinkItem.Leggings());
	public static final RegistryObject<Item> BROWN_LONG_CHESTPLATE = REGISTRY.register("brown_long_chestplate", () -> new BrownLongItem.Chestplate());
	public static final RegistryObject<Item> BROWN_LONG_LEGGINGS = REGISTRY.register("brown_long_leggings", () -> new BrownLongItem.Leggings());
	public static final RegistryObject<Item> YELLOW_LONG_CHESTPLATE = REGISTRY.register("yellow_long_chestplate", () -> new YellowLongItem.Chestplate());
	public static final RegistryObject<Item> YELLOW_LONG_LEGGINGS = REGISTRY.register("yellow_long_leggings", () -> new YellowLongItem.Leggings());
	public static final RegistryObject<Item> YELLOW_CHESTPLATE = REGISTRY.register("yellow_chestplate", () -> new YellowItem.Chestplate());
	public static final RegistryObject<Item> YELLOW_LEGGINGS = REGISTRY.register("yellow_leggings", () -> new YellowItem.Leggings());
	public static final RegistryObject<Item> PURPLE_CHESTPLATE = REGISTRY.register("purple_chestplate", () -> new PurpleItem.Chestplate());
	public static final RegistryObject<Item> PURPLE_LEGGINGS = REGISTRY.register("purple_leggings", () -> new PurpleItem.Leggings());
	public static final RegistryObject<Item> DEMON_SLAYER_UNIFORM_LONG_CHESTPLATE = REGISTRY.register("demon_slayer_uniform_long_chestplate", () -> new DemonSlayerUniformLongItem.Chestplate());
	public static final RegistryObject<Item> DEMON_SLAYER_UNIFORM_LONG_LEGGINGS = REGISTRY.register("demon_slayer_uniform_long_leggings", () -> new DemonSlayerUniformLongItem.Leggings());
	public static final RegistryObject<Item> STONE_HASHIRA_CHESTPLATE = REGISTRY.register("stone_hashira_chestplate", () -> new StoneHashiraItem.Chestplate());
	public static final RegistryObject<Item> STONE_HASHIRA_LEGGINGS = REGISTRY.register("stone_hashira_leggings", () -> new StoneHashiraItem.Leggings());
	public static final RegistryObject<Item> PINK_LONG_CHESTPLATE = REGISTRY.register("pink_long_chestplate", () -> new PinkLongItem.Chestplate());
	public static final RegistryObject<Item> PINK_LONG_LEGGINGS = REGISTRY.register("pink_long_leggings", () -> new PinkLongItem.Leggings());
	public static final RegistryObject<Item> GREEN_CHESTPLATE = REGISTRY.register("green_chestplate", () -> new GreenItem.Chestplate());
	public static final RegistryObject<Item> GREEN_LEGGINGS = REGISTRY.register("green_leggings", () -> new GreenItem.Leggings());
	public static final RegistryObject<Item> GREEN_LONG_CHESTPLATE = REGISTRY.register("green_long_chestplate", () -> new GreenLongItem.Chestplate());
	public static final RegistryObject<Item> GREEN_LONG_LEGGINGS = REGISTRY.register("green_long_leggings", () -> new GreenLongItem.Leggings());
	public static final RegistryObject<Item> BLUE_LONG_CHESTPLATE = REGISTRY.register("blue_long_chestplate", () -> new BlueLongItem.Chestplate());
	public static final RegistryObject<Item> BLUE_LONG_LEGGINGS = REGISTRY.register("blue_long_leggings", () -> new BlueLongItem.Leggings());
	public static final RegistryObject<Item> ZOHAKUTEN_ARMOR_CHESTPLATE = REGISTRY.register("zohakuten_armor_chestplate", () -> new ZohakutenArmorItem.Chestplate());
	public static final RegistryObject<Item> ZOHAKUTEN_ARMOR_LEGGINGS = REGISTRY.register("zohakuten_armor_leggings", () -> new ZohakutenArmorItem.Leggings());
	public static final RegistryObject<Item> RUI_ARMOR_CHESTPLATE = REGISTRY.register("rui_armor_chestplate", () -> new RuiArmorItem.Chestplate());
	public static final RegistryObject<Item> RUI_ARMOR_LEGGINGS = REGISTRY.register("rui_armor_leggings", () -> new RuiArmorItem.Leggings());
	public static final RegistryObject<Item> MUZAN_ARMOR_CHESTPLATE = REGISTRY.register("muzan_armor_chestplate", () -> new MuzanArmorItem.Chestplate());
	public static final RegistryObject<Item> MUZAN_ARMOR_LEGGINGS = REGISTRY.register("muzan_armor_leggings", () -> new MuzanArmorItem.Leggings());
	public static final RegistryObject<Item> MUZAN_ARMOR_CLOAKLESS_CHESTPLATE = REGISTRY.register("muzan_armor_cloakless_chestplate", () -> new MuzanArmorCloaklessItem.Chestplate());
	public static final RegistryObject<Item> SOUND_NICHIRIN_REGULAR = REGISTRY.register("sound_nichirin_regular", () -> new SoundNichirinRegularItem());
	public static final RegistryObject<Item> MOON_NICHIRIN = REGISTRY.register("moon_nichirin", () -> new MoonNichirinItem());
	public static final RegistryObject<Item> FLAME_NICHIRIN = REGISTRY.register("flame_nichirin", () -> new FlameNichirinItem());
	public static final RegistryObject<Item> THUNDER_NICHIRIN = REGISTRY.register("thunder_nichirin", () -> new ThunderNichirinItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
