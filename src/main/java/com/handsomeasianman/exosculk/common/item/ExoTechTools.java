package com.handsomeasianman.exosculk.common.item;

import net.minecraft.world.item.*;


public class ExoTechTools {
    public static class ExoTechHoe extends HoeItem {
        public ExoTechHoe(Properties pProperties) {
            super(ExosculkTiers.EXOTECH, -15, 0.0F, pProperties);
        }
    }

    public static class ExoTechPickaxe extends PickaxeItem {
        public ExoTechPickaxe(Properties pProperties) {
            super(ExosculkTiers.EXOTECH, -5, -2.8F, pProperties);
        }
    }

    public static class ExoTechAxe extends AxeItem {
        public ExoTechAxe(Properties pProperties) {
            super(ExosculkTiers.EXOTECH, 15.0F, -3.0F, pProperties);
        }
    }

    public static class ExoTechSword extends SwordItem {
        public ExoTechSword(Properties pProperties) {
            super(ExosculkTiers.EXOTECH, 10, -2.4F, pProperties);
        }
    }

    public static class ExoTechShovel extends ShovelItem {
        public ExoTechShovel(Properties pProperties) {
            super(ExosculkTiers.EXOTECH, 0.0F, -3.0F, pProperties);
        }
    }
}
