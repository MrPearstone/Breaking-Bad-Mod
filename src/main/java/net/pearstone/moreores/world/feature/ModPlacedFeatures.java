package net.pearstone.moreores.world.feature;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pearstone.moreores.MoreOres;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
        DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MoreOres.MOD_ID);

    public static final RegistryObject<PlacedFeature> MITHRIL_ORE_PLACED = PLACED_FEATURES.register("mithril_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.MITHRIL_ORE.getHolder().get(),
                    commonOrePlacement(9, // Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> SILVER_ORE_PLACED = PLACED_FEATURES.register("silver_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(),
                    commonOrePlacement(5, // Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(),
                    commonOrePlacement(5, // Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> VOIDSTONE_ORE_PLACED = PLACED_FEATURES.register("voidstone_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.VOIDSTONE_ORE.getHolder().get(),
                    commonOrePlacement(5, // Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> SULFUR_ORE_PLACED = PLACED_FEATURES.register("sulfur_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SULFUR_ORE.getHolder().get(),
                    commonOrePlacement(10, // Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_PLACED = PLACED_FEATURES.register("cobalt_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(),
                    commonOrePlacement(5, // Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}