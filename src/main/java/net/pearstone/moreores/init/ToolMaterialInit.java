package net.pearstone.moreores.init;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.pearstone.moreores.BaseToolMaterial;
import net.pearstone.moreores.item.ModItems;

public final class ToolMaterialInit {
    public static final Tier MITHRIL = new BaseToolMaterial(2f, 14, 2, 6f, 300, () ->
        Ingredient.of(ModItems.MITHRIL_INGOT.get()));
    public static final Tier RUBY = new BaseToolMaterial(3f, 14, 3, 6f, 1000, () ->
            Ingredient.of(ModItems.RUBY.get()));
    public static final Tier COBALT = new BaseToolMaterial(3f, 14, 4, 6f, 1794, () ->
            Ingredient.of(ModItems.COBALT.get()));

    private ToolMaterialInit() {

    }


}
