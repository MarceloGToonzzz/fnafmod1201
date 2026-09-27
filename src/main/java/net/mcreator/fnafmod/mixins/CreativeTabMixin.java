/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.fnafmod as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.fnafmod.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModTabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Mixin(CreativeModeTab.class)
public class CreativeTabMixin {
	

    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 9;

    @Shadow
    private Collection<ItemStack> displayItems;
    @Shadow
    private Set<ItemStack> displayItemsSearchTab;

    private Collection<ItemStack> newDisplayItems;
    private Collection<ItemStack> newDisplayItemsSearchTab;

    @Inject(method = "buildContents", at = @At("RETURN"))
    private void fnaf_mod$buildContents(CreativeModeTab.ItemDisplayParameters parameters, CallbackInfo ci) {
        CreativeModeTab tab = (CreativeModeTab) (Object) this;

        newDisplayItems = new ArrayList<>();
        newDisplayItemsSearchTab = new ArrayList<>();

        if (tab == FnafModModTabs.SUITS.get()) {

            newDisplayItems.add(FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_BOOTS.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.SPRING_LOCK_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPRING_LOCK_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPRING_LOCK_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPRING_LOCK_SUIT_BOOTS.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GLITCHTRAP_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GLITCHTRAP_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GLITCHTRAP_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GLITCHTRAP_SUIT_BOOTS.get().getDefaultInstance());

            newDisplayItems.add(FnafModModItems.FREDDY_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDDY_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDDY_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDDY_SUIT_BOOTS.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.YELLOW_BEAR_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.YELLOW_BEAR_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.YELLOW_BEAR_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.YELLOW_BEAR_SUIT_BOOTS.get().getDefaultInstance());

            newDisplayItems.add(FnafModModItems.BONNIE_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.BONNIE_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.BONNIE_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.BONNIE_SUIT_BOOTS.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CHICA_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CHICA_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CHICA_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CHICA_SUIT_BOOTS.get().getDefaultInstance());

            newDisplayItems.add(FnafModModItems.FOXY_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FOXY_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FOXY_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FOXY_SUIT_BOOTS.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPARKY_SUIT_HELMET.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPARKY_SUIT_CHESTPLATE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPARKY_SUIT_LEGGINGS.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPARKY_SUIT_BOOTS.get().getDefaultInstance());

            displayItems = newDisplayItems;
            displayItemsSearchTab = new HashSet<>(newDisplayItemsSearchTab);
        }
    }
}
