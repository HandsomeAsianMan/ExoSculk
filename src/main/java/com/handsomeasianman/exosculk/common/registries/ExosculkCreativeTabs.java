package com.handsomeasianman.exosculk.common.registries;

import com.handsomeasianman.exosculk.common.Exosculk;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExosculkCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Exosculk.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXOSCULK_TAB = CREATIVE_MODE_TABS.register("exosculk_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ExosculkItems.SCULK_SWORD.get()))
                    .title(Component.translatable("creativetab.exosculk_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ExosculkItems.BIOLOGICAL_VOID_MATTER.get());

                        pOutput.accept(ExosculkItems.SCULK_AXE.get());
                        pOutput.accept(ExosculkItems.SCULK_PICKAXE.get());
                        pOutput.accept(ExosculkItems.SCULK_SWORD.get());
                        pOutput.accept(ExosculkItems.SCULK_SHOVEL.get());
                        pOutput.accept(ExosculkItems.SCULK_HOE.get());
                        pOutput.accept(ExosculkItems.EXOSCULK_AXE.get());
                        pOutput.accept(ExosculkItems.EXOSCULK_PICKAXE.get());
                        pOutput.accept(ExosculkItems.EXOSCULK_SWORD.get());
                        pOutput.accept(ExosculkItems.EXOSCULK_SHOVEL.get());
                        pOutput.accept(ExosculkItems.EXOSCULK_HOE.get());
                        pOutput.accept(ExosculkItems.EXOTECH_AXE.get());
                        pOutput.accept(ExosculkItems.EXOTECH_PICKAXE.get());
                        pOutput.accept(ExosculkItems.EXOTECH_SWORD.get());
                        pOutput.accept(ExosculkItems.EXOTECH_SHOVEL.get());
                        pOutput.accept(ExosculkItems.EXOTECH_HOE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
