package net.pearstone.moreores.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AspectOfTheEndItem extends Item {

    public AspectOfTheEndItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {

            ThrownEnderpearl enderpearl = new ThrownEnderpearl(level, player);

            enderpearl.setPos(player.position().x + player.getLookAngle().x,
                    player.position().y + player.getLookAngle().y + 1.5,
                    player.position().z + player.getLookAngle().z);

            enderpearl.setDeltaMovement(player.getLookAngle().x * 1.5, player.getLookAngle().y * 1.5, player.getLookAngle().z * 1.5);
            level.addFreshEntity(enderpearl);

            player.getCooldowns().addCooldown(this, 60 ); // 20 ticks = 1 second
        }

        return super.use(level, player, hand);
    }
}
