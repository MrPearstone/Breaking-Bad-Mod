package net.pearstone.moreores.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pearstone.moreores.MoreOres;
import net.pearstone.moreores.init.ArmorMaterialInit;
import net.pearstone.moreores.init.ToolMaterialInit;
import net.pearstone.moreores.item.custom.AspectOfTheEndItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreOres.MOD_ID);

    // Items
    public static final RegistryObject<Item> MITHRIL = ITEMS.register("mithril",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> VOIDSTONE = ITEMS.register("voidstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> VOIDSTONE_HANDLE = ITEMS.register("voidstone_handle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> TRANSMISSION_TUNER = ITEMS.register("transmission_tuner",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> ASPECT_OF_THE_END = ITEMS.register("aspect_of_the_end",
            () -> new AspectOfTheEndItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));

    // Tools
    public static final RegistryObject<SwordItem> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ToolMaterialInit.MITHRIL, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.MITHRIL, 1,-2.8f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ToolMaterialInit.MITHRIL, 6, -3.1f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ShovelItem> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ToolMaterialInit.MITHRIL, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ToolMaterialInit.MITHRIL, -2, -1f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ToolMaterialInit.RUBY, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.RUBY, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ToolMaterialInit.RUBY, 5, -3, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ToolMaterialInit.RUBY, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ToolMaterialInit.RUBY, -3, 0, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new SwordItem(ToolMaterialInit.COBALT, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.COBALT, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe",
            () -> new AxeItem(ToolMaterialInit.COBALT, 5, -3, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(ToolMaterialInit.COBALT, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<HoeItem> COBALT_HOE = ITEMS.register("cobalt_hoe",
            () -> new HoeItem(ToolMaterialInit.COBALT, -3, 0, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ArmorItem(ArmorMaterialInit.MITHRIL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.MITHRIL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(ArmorMaterialInit.MITHRIL, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(ArmorMaterialInit.MITHRIL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> COBALT_HELMET = ITEMS.register("cobalt_helmet",
            () -> new ArmorItem(ArmorMaterialInit.COBALT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.COBALT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings",
            () -> new ArmorItem(ArmorMaterialInit.COBALT, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));
    public static final RegistryObject<ArmorItem> COBALT_BOOTS = ITEMS.register("cobalt_boots",
            () -> new ArmorItem(ArmorMaterialInit.COBALT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MOREORES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
