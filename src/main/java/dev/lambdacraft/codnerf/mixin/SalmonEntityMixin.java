package dev.lambdacraft.codnerf.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SalmonEntity;
import net.minecraft.entity.passive.SchoolingFishEntity;

import net.minecraft.world.World;

@Mixin(SalmonEntity.class)
public abstract class SalmonEntityMixin extends SchoolingFishEntity {
  public SalmonEntityMixin(EntityType<? extends SchoolingFishEntity> type, World world) {
    super(type, world);
    // TODO Auto-generated constructor stub
  }

  @Inject(at = @At("HEAD"), method = "getMaxGroupSize", cancellable = true)
  public void getMaxGroupSize(CallbackInfoReturnable<Integer> info) {
    info.setReturnValue(3);
  }
}