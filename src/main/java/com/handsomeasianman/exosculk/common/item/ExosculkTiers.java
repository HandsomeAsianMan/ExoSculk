package com.handsomeasianman.exosculk.common.item;

import com.handsomeasianman.exosculk.common.Exosculk;
import com.handsomeasianman.exosculk.common.ExosculkTags;
import com.handsomeasianman.exosculk.common.registries.ExosculkItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ExosculkTiers {
    public static final Tier SCULK = TierSortingRegistry.registerTier(new ForgeTier(4, 5144, 12.0F, 5.0F, 20,
            Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ExosculkItems.BIOLOGICAL_VOID_MATTER.get())),
            new ResourceLocation(Exosculk.MOD_ID, "sculk"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier EXOSCULK = TierSortingRegistry.registerTier(new ForgeTier(5, -1, 15.0F, 10.0F, 25,
            ExosculkTags.Blocks.NEEDS_EXOSCULK_TOOL, () -> Ingredient.of(ExosculkItems.BIOLOGICAL_VOID_MATTER.get())),
            new ResourceLocation(Exosculk.MOD_ID, "exotech"), List.of(SCULK), List.of());

    public static final Tier EXOTECH = TierSortingRegistry.registerTier(new ForgeTier(6, -1, 25.0F, 20.0F, 50,
            ExosculkTags.Blocks.NEEDS_EXOTECH_TOOL, () -> Ingredient.of(ExosculkItems.BIOLOGICAL_VOID_MATTER.get())),
            new ResourceLocation(Exosculk.MOD_ID, "ascended_exosculk"), List.of(EXOSCULK), List.of());

}
