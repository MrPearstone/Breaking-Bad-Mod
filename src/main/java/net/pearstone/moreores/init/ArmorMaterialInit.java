package net.pearstone.moreores.init;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.pearstone.moreores.BaseArmorMaterial;
import net.pearstone.moreores.MoreOres;
import net.pearstone.moreores.item.ModItems;

public class ArmorMaterialInit {

    public static final ArmorMaterial MITHRIL = new BaseArmorMaterial(9, new int[] {210, 246, 274, 180}, new int[] {2, 5, 6, 2}, 0f, 0f,
            MoreOres.MOD_ID + ":mithril", SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get()));
    public static final ArmorMaterial RUBY = new BaseArmorMaterial(9, new int[] {401, 450, 497, 342}, new int[] {3, 5, 7, 3}, 0f, 1f,
        MoreOres.MOD_ID + ":ruby", SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(ModItems.RUBY.get()));
    public static final ArmorMaterial COBALT = new BaseArmorMaterial(10, new int[] {449, 503, 556, 393}, new int[] {3, 6, 8, 3}, 1f, 1f,
            MoreOres.MOD_ID + ":cobalt", SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(ModItems.COBALT.get()));

    private ArmorMaterialInit() {

    }
}
