package net.snazzygator.snazpackmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> BLUEGRASS_PLACED = PlacementUtils.register("bluegrass_placed",
            ModConfiguredFeatures.WILD_BLUEGRASS, RarityFilter.onAverageOnceEvery(20),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> CUCUMBER_PLACED = PlacementUtils.register("cucumber_placed",
            ModConfiguredFeatures.WILD_CUCUMBER, RarityFilter.onAverageOnceEvery(20),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
}