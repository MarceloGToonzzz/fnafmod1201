package net.mcreator.fnafmod.mixins;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;

import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Mixin(CreativeModeTab.class)
public class BuildCreativeTabMixin {

    @Shadow
    private Collection<ItemStack> displayItems;
    @Shadow
    private Set<ItemStack> displayItemsSearchTab;

    private Collection<ItemStack> newDisplayItems;
    private Collection<ItemStack> newDisplayItemsSearchTab;

    @Inject(method = "buildContents", at = @At("RETURN"))
    private void fnaf_mod$buildContents(CreativeModeTab.ItemDisplayParameters parameters, CallbackInfo ci) {
        CreativeModeTab tab = (CreativeModeTab) (Object) this;
        if (false) {
	        newDisplayItems = new ArrayList<>();
	        newDisplayItemsSearchTab = new ArrayList<>();
	
	        if (tab == FnafModModTabs.FNAF_DECOR.get()) {
	
	            displayItems.add(FnafModModItems.FREDDY_PLUSHIE.get().getDefaultInstance());
	
	            displayItems = newDisplayItems;
	        }
        }
    }


}