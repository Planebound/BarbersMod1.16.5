package io.github.nootascendant.barbersmod.core.init;

import io.github.nootascendant.barbersmod.BarbersMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			BarbersMod.MOD_ID);
	
	public static final RegistryObject<Block> BARBRO_ORE = BLOCKS.register("barbro_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> BLYTE_ORE = BLOCKS.register("blyte_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> ELYSIUM_ORE = BLOCKS.register("elysium_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> HANNASSE_ORE = BLOCKS.register("hannasse_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> JESSENE_ORE = BLOCKS.register("jessene_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> JOCK_ORE = BLOCKS.register("jock_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> KEZITE_ORE = BLOCKS.register("kezite_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> KNIGHTSTONE_ORE = BLOCKS.register("knightstone_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> LEONIUM_ORE = BLOCKS.register("leonium_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> SEBATINE_ORE = BLOCKS.register("sebatine_ore", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.CHAIN)
					.requiresCorrectToolForDrops()));
	
}
