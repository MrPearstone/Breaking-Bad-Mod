package net.pearstone.moreores;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class BaseToolMaterial implements Tier {

    private final float attackDamageBonus, speed;
    private final int enchantAbility, harvestLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public BaseToolMaterial(float attackDamageBonus, int enchantAbility, int harvestLevel, float speed, int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamageBonus = attackDamageBonus;
        this.speed = speed;
        this. enchantAbility = enchantAbility;
        this. harvestLevel = harvestLevel;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return this.durability;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantAbility;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
