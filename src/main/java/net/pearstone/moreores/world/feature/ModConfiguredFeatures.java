package net.pearstone.moreores.world.feature;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pearstone.moreores.MoreOres;
import net.pearstone.moreores.block.ModBlocks;
import org.checkerframework.checker.units.qual.C;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MoreOres.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MITHRIL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MITHRIL_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> VOIDSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.VOIDSTONE_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> SULFUR_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.SULFUR_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> COBALT_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.COBALT_ORE.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MITHRIL_ORE = CONFIGURED_FEATURES.register("mithril_ore",
        () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MITHRIL_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(), 6)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 5)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> VOIDSTONE_ORE = CONFIGURED_FEATURES.register("voidstone_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(VOIDSTONE_ORES.get(), 3)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SULFUR_ORE = CONFIGURED_FEATURES.register("sulfur_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SULFUR_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> COBALT_ORE = CONFIGURED_FEATURES.register("cobalt_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(COBALT_ORES.get(), 5)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
