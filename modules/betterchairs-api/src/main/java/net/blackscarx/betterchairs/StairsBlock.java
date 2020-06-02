package net.blackscarx.betterchairs;

import org.bukkit.Material;

public enum StairsBlock {

    ACACIA("acacia_stairs"),
    BIRCH_WOOD("birch_wood_stairs"),
    BRICK("brick_stairs"),
    COBBLESTONE("cobblestone_stairs"),
    DARK_OAK("dark_oak_stairs"),
    JUNGLE_WOOD("jungle_wood_stairs"),
    NETHER_BRICK("nether_brick_stairs"),
    QUARTZ("quartz_stairs"),
    RED_SANDSTONE("red_sandstone_stairs"),
    SANDSTONE("sandstone_stairs"),
    SMOOTH("smooth_stairs"),
    SPRUCE_WOOD("spruce_wood_stairs"),
    WOOD("wood_stairs"),
    PURPUR_STAIRS("purpur_stairs"),
    OAK_STAIRS("oak_stairs"),
    STONE_BRICK_STAIRS("stone_brick_stairs"),
    SPRUCE_STAIRS("spruce_stairs"),
    BIRCH_STAIRS("birch_stairs"),
    JUNGLE_STAIRS("jungle_stairs"),
    PRISMARINE_STAIRS("prismarine_stairs"),
    PRISMARINE_BRICK_STAIRS("prismarine_brick_stairs"),
    DARK_PRISMARINE_STAIRS("dark_prismarine_stairs"),
    POLISHED_GRANITE_STAIRS("polished_granite_stairs"),
    SMOOTH_RED_SANDSTONE_STAIRS("smooth_red_sandstone_stairs"),
    MOSSY_STONE_BRICK_STAIRS("mossy_stone_brick_stairs"),
    POLISHED_DIORITE_STAIRS("polished_diorite_stairs"),
    MOSSY_COBBLESTONE_STAIRS("mossy_cobblestone_stairs"),
    END_STONE_BRICK_STAIRS("end_stone_brick_stairs"),
    STONE_STAIRS("stone_stairs"),
    SMOOTH_SANDSTONE_STAIRS("smooth_sandstone_stairs"),
    SMOOTH_QUARTZ_STAIRS("smooth_quartz_stairs"),
    GRANITE_STAIRS("granite_stairs"),
    ANDESITE_STAIRS("andesite_stairs"),
    RED_NETHER_BRICK_STAIRS("red_nether_brick_stairs"),
    POLISHED_ANDESITE_STAIRS("polished_andesite_stairs"),
    DIORITE_STAIRS("diorite_stairs");

    final private String name;

    StairsBlock(String name) {
        this.name = name;
    }

    public static String from(Material stair) {
        for (StairsBlock stairs : values()) {
            if (stairs.getName().equalsIgnoreCase(stair.name())) {
                return stairs.getName();
            }
        }
        return "null";
    }

    public String getName() {
        return name;
    }

}
