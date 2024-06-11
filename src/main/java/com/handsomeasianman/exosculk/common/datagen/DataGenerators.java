package com.handsomeasianman.exosculk.common.datagen;

import com.handsomeasianman.exosculk.common.Exosculk;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Exosculk.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(event.includeServer(), new ExosculkRecipesProvider(packOutput));
        generator.addProvider(event.includeClient(), new ExosculkItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new ExosculkGlobalLootModifierProvider(packOutput));
    }
}
