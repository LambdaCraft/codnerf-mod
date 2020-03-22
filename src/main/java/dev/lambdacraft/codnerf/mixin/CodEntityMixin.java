package dev.lambdacraft.codnerf.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CodEntity;
import net.minecraft.entity.passive.SchoolingFishEntity;

import net.minecraft.world.World;

@Mixin(CodEntity.class)
public abstract class CodEntityMixin extends SchoolingFishEntity {
  public CodEntityMixin(EntityType<? extends SchoolingFishEntity> type, World world) {
    super(type, world);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int getMaxGroupSize() {
    return 3;
  }
}