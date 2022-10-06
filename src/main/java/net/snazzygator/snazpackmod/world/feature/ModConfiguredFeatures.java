package net.snazzygator.snazpackmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.snazzygator.snazpackmod.block.ModBlocks;
import net.snazzygator.snazpackmod.block.custom.SerpentberryBushBlock;

import java.util.List;
import java.util.Random;


public class ModConfiguredFeatures {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WILD_BLUEGRASS =
            FeatureUtils.register("wild_bluegrass", Feature.RANDOM_PATCH,
                    FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WILD_BLUEGRASS_PLANT.get()
                                    .defaultBlockState())),
                            List.of(Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT)));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WILD_CUCUMBER =
            FeatureUtils.register("wild_cucumber", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WILD_CUCUMBER_PLANT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_SERPENTBERRY_BUSH =
            FeatureUtils.register("patch_serpentberry_bush", Feature.RANDOM_PATCH,
                    FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SERPENTBERRY_BUSH.get()
                                    .defaultBlockState().setValue(SerpentberryBushBlock.AGE, 3))),
                            List.of(Blocks.GRASS_BLOCK, Blocks.SAND, Blocks.MOSS_BLOCK)));

}