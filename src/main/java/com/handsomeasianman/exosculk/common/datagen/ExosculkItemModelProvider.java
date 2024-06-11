package com.handsomeasianman.exosculk.common.datagen;

import com.handsomeasianman.exosculk.common.Exosculk;
import com.handsomeasianman.exosculk.common.registries.ExosculkItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ExosculkItemModelProvider extends ItemModelProvider {
    public ExosculkItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Exosculk.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ExosculkItems.BIOLOGICAL_VOID_MATTER);
        handheldItem(ExosculkItems.SCULK_SWORD);
        handheldItem(ExosculkItems.SCULK_SHOVEL);
        handheldItem(ExosculkItems.SCULK_PICKAXE);
        handheldItem(ExosculkItems.SCULK_AXE);
        handheldItem(ExosculkItems.SCULK_HOE);
        handheldItem(ExosculkItems.EXOSCULK_SHOVEL);
        handheldItem(ExosculkItems.EXOSCULK_SWORD);
        handheldItem(ExosculkItems.EXOSCULK_PICKAXE);
        handheldItem(ExosculkItems.EXOSCULK_AXE);
        handheldItem(ExosculkItems.EXOSCULK_HOE);
        handheldItem(ExosculkItems.EXOTECH_SWORD);
        handheldItem(ExosculkItems.EXOTECH_SHOVEL);
        handheldItem(ExosculkItems.EXOTECH_PICKAXE);
        handheldItem(ExosculkItems.EXOTECH_AXE);
        handheldItem(ExosculkItems.EXOTECH_HOE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Exosculk.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Exosculk.MOD_ID, "item/" + item.getId().getPath()));
    }
}
