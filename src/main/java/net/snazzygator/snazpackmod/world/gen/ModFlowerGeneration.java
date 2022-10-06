package net.snazzygator.snazpackmod.world.gen;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.snazzygator.snazpackmod.world.feature.ModPlacedFeatures;

import java.util.List;
import java.util.Set;

public class ModFlowerGeneration {
    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(event.getName().equals(Biomes.TAIGA.location()) || event.getName().equals(Biomes.OLD_GROWTH_PINE_TAIGA.location()) ||
                event.getName().equals(Biomes.OLD_GROWTH_SPRUCE_TAIGA.location())) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.BLUEGRASS_PLACED);
        }
        if(event.getName().equals(Biomes.SWAMP.location()) || event.getName().equals(Biomes.JUNGLE.location()) ||
                event.getName().equals(Biomes.SPARSE_JUNGLE.location()) || event.getName().equals(Biomes.RIVER.location())) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.CUCUMBER_PLACED);
        }
        if (event.getName().equals(Biomes.SWAMP.location()) || event.getName().equals(Biomes.BEACH.location()) ||
                event.getName().equals(Biomes.LUSH_CAVES.location()) || event.getName().equals(Biomes.STONY_SHORE.location())) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.SERPENTBERRY_PLACED);
        }
    }
}