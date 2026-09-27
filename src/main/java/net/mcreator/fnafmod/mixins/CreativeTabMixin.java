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
        }
        else if (tab == FnafModModTabs.FNAF_MOBS.get()) {
            newDisplayItems.add(FnafModModItems.FREDBEAR_ANIMATRONIC_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEAR_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPRING_BONNIE_ANIMATRONIC_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPRING_BONNIE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GLITCH_BONNIE_ANIMATRONIC_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.STATUE_FREDDY_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.EVIL_FREDDY_ITEM_SPAWN.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDDY.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GOLDEN_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.YELLOWBEAR.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.ENDO.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.BONNIE_SPAWN.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.STATUE_BONNIE_SPAWN.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.EVIL_BONNIE.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.BONNIE.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.STATUE_CHICA_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.EVIL_CHICA_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CHICA.get().getDefaultInstance());

            newDisplayItems.add(FnafModModItems.FOXY_SPAWN.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.STATUE_FOXY_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.EVIL_FOXY_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FOXY.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PHANTOM_CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.WITHERED_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.UNWITHERED_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEARS_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PHANTOM_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.WITHERED_GOLDEN_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SHADOW_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.WITHERED_BONNIE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.UNWITHERED_BONNIE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEARS_BONNIE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.WITHERED_CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.UNWITHERED_CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEARS_CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.WITHERED_FOXY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.UNWITHERED_FOXY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEARS_FOXY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PHANTOM_FOXY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEARS_MONTY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEARS_FETCH.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.ENDO_02_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.TOY_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.TOY_BONNIE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.TOY_CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SHADOW_BONNIE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.BB_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PHANTOM_BB_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.JJ_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.TOY_FOXY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.MANGLE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PHANTOM_MANGLE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PUPPET_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PHANTOM_PUPPET_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.NIGHTMARE_FREDDY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_FREDDY_STATUE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_FREDBEAR_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_FREDBEAR_STATUE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.NIGHTMARE_BONNIE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_BONNIE_STATUE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.JACK_O_BONNIE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_CHICA_STATUE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.JACK_O_CHICA_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.NIGHTMARE_FOXY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_FOXY_STATUE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_MANGLE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PLUSHTRAP_TOY_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PLUSHTRAP_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARIONNE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.NIGHTMARE_BB_SPAWN_ITEM.get().getDefaultInstance());

            newDisplayItems.add(FnafModModItems.CIRCUS_BABY_STATUE_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.BARRY_POLAR_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.WALLY_WALRUS_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.PUFFY_PUFFINS_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.HAZY_REINDEER_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GUS_PUG_SPAWN_ITEM.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.SITTING_FREDBEAR_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SITTING_SPRING_BONNIE_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDDLES_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.SPRINGLOCKED_ZOMBIE_FREDBEAR_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPRING_LOCKED_ZOMBIE_SPRING_BONNIE_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CRYING_CHILD_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

            newDisplayItems.add(FnafModModItems.FREDDY_CUT_OUT_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.BONNIE_CUT_OUT_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.CHICA_CUT_OUT_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FOXY_CUT_OUT_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());
            newDisplayItems.add(FnafModModItems.FREDBEAR_CUT_OUT_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.SPRING_BONNIE_CUT_OUT_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(FnafModModItems.GLITCH_BONNIE_CUT_OUT_SPAWN_EGG.get().getDefaultInstance());
            newDisplayItems.add(Items.AIR.getDefaultInstance());

        }
        else {
            newDisplayItems = displayItems;
            newDisplayItemsSearchTab = displayItemsSearchTab;
        }

        displayItems = newDisplayItems;
        displayItemsSearchTab = new HashSet<>(newDisplayItemsSearchTab);
    }
}
