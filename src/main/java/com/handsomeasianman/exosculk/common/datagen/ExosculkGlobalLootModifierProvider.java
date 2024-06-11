package com.handsomeasianman.exosculk.common.datagen;

import com.handsomeasianman.exosculk.common.Exosculk;
import com.handsomeasianman.exosculk.common.loot.AddItemModifier;
import com.handsomeasianman.exosculk.common.registries.ExosculkItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;


public class ExosculkGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ExosculkGlobalLootModifierProvider(PackOutput output) {
        super(output, Exosculk.MOD_ID);
    }

    @Override
    protected void start() {
        add("biological_void_matter_from_warden", new AddItemModifier(new LootItemCondition[] {new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build()}, ExosculkItems.BIOLOGICAL_VOID_MATTER.get()));
    }
}
