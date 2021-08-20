package io.github.nootascendant.barbersmod.core.init;

import io.github.nootascendant.barbersmod.BarbersMod;
import io.github.nootascendant.barbersmod.common.items.SpecialFoods;
import io.github.nootascendant.barbersmod.common.items.SummoningTotem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			BarbersMod.MOD_ID);	
	
	//crystal items
	public static final RegistryObject<Item> BARBRO_CRYSTALS = ITEMS.register("barbro_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<Item> BLYTE_CRYSTALS = ITEMS.register("blyte_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<Item> ELYSIUM_CRYSTALS = ITEMS.register("elysium_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<Item> HANNASSE_CRYSTALS = ITEMS.register("hannasse_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<Item> JESSENE_CRYSTALS = ITEMS.register("jessene_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<Item> JOCK_CRYSTALS = ITEMS.register("jock_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<Item> KEZITE_CRYSTALS = ITEMS.register("kezite_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));	
	public static final RegistryObject<Item> KNIGHTSTONE_CRYSTALS = ITEMS.register("knightstone_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));	
	public static final RegistryObject<Item> LEONIUM_CRYSTALS = ITEMS.register("leonium_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));	
	public static final RegistryObject<Item> SEBATINE_CRYSTALS = ITEMS.register("sebatine_crystals", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	
	//crystal ore block items
	public static final RegistryObject<BlockItem> BARBRO_ORE = ITEMS.register("barbro_ore", 
			() -> new BlockItem(BlockInit.BARBRO_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> BLYTE_ORE = ITEMS.register("blyte_ore", 
			() -> new BlockItem(BlockInit.BLYTE_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> ELYSIUM_ORE = ITEMS.register("elysium_ore", 
			() -> new BlockItem(BlockInit.ELYSIUM_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> HANNASSE_ORE = ITEMS.register("hannasse_ore", 
			() -> new BlockItem(BlockInit.HANNASSE_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> JESSENE_ORE = ITEMS.register("jessene_ore", 
			() -> new BlockItem(BlockInit.JESSENE_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> JOCK_ORE = ITEMS.register("jock_ore", 
			() -> new BlockItem(BlockInit.JOCK_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> KEZITE_ORE = ITEMS.register("kezite_ore", 
			() -> new BlockItem(BlockInit.KEZITE_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> KNIGHTSTONE_ORE = ITEMS.register("knightstone_ore", 
			() -> new BlockItem(BlockInit.KNIGHTSTONE_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> LEONIUM_ORE = ITEMS.register("leonium_ore", 
			() -> new BlockItem(BlockInit.LEONIUM_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	public static final RegistryObject<BlockItem> SEBATINE_ORE = ITEMS.register("sebatine_ore", 
			() -> new BlockItem(BlockInit.SEBATINE_ORE.get(), new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)));
	
	//advanced items
	public static final RegistryObject<SummoningTotem> SUMMONING_TOTEM = ITEMS.register("summoning_totem", 
			() -> new SummoningTotem(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)
					.stacksTo(1)
					.rarity(Rarity.EPIC)));
	
	//misc items
	public static final RegistryObject<Item> IMBUED_BERRY = ITEMS.register("imbued_berry", 
			() -> new Item(new Item.Properties().tab(BarbersMod.BARBERS_MOD_GROUP)
					.food(SpecialFoods.IMBUED_BERRY)));
}
