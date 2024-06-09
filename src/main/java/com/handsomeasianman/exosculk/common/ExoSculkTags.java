package com.handsomeasianman.exosculk.common;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;


public class ExoSculkTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_EXOTECH_TOOL = tag("needs_exotech_tool");
        public static final TagKey<Block> NEEDS_ASCENDED_EXOSCULK_TOOL = tag("needs_ascended_exosculk_tool");


        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ExoSculk.MOD_ID, name));
        }
    }
}
