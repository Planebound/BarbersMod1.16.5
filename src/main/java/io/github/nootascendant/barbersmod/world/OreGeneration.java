package io.github.nootascendant.barbersmod.world;

import io.github.nootascendant.barbersmod.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

	public static void generateOres(final BiomeLoadingEvent event) {
			if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.BARBRO_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.BLYTE_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.ELYSIUM_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.HANNASSE_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.JESSENE_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.JOCK_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.KEZITE_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.KNIGHTSTONE_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.LEONIUM_ORE.get().defaultBlockState(), 3, 15, 30, 5);
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
						BlockInit.SEBATINE_ORE.get().defaultBlockState(), 3, 15, 30, 5);
			}
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, 
			int minHeight, int maxHeight, int perChunk) {
		settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
				.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
				.squared().count(perChunk));
	}
}
