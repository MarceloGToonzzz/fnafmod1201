
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.fnafmod.FnafModMod;

public class FnafModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, FnafModMod.MODID);
	public static final RegistryObject<PaintingVariant> PARTY_MURAL = REGISTRY.register("party_mural", () -> new PaintingVariant(96, 64));
}
