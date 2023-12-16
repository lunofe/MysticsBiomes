package com.mysticsbiomes.init;

import com.mysticsbiomes.MysticsBiomes;
import com.mysticsbiomes.common.block.*;
import com.mysticsbiomes.common.block.state.MysticBlockSetTypes;
import com.mysticsbiomes.common.block.state.MysticWoodTypes;
import com.mysticsbiomes.common.world.feature.MysticTreeFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.mysticsbiomes.common.block.BlockTemplate.*;

public class MysticBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MysticsBiomes.modId);

    // strawberry fields
    public static final RegistryObject<Block> STRAWBERRY_BLOSSOMS = BLOCKS.register("strawberry_blossoms", () -> leaves(SoundType.AZALEA_LEAVES));
    public static final RegistryObject<Block> STRAWBERRY_SAPLING = BLOCKS.register("strawberry_sapling", () -> new GrowingSaplingBlock(new GrowingSaplingBlock.TreeGrower(MysticTreeFeatures.STRAWBERRY_TREE), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> STRIPPED_STRAWBERRY_LOG = BLOCKS.register("stripped_strawberry_log", () -> strippedLog(MapColor.COLOR_PINK));
    public static final RegistryObject<Block> STRAWBERRY_LOG = BLOCKS.register("strawberry_log", () -> log(STRIPPED_STRAWBERRY_LOG.get(), MapColor.TERRACOTTA_PINK, MapColor.COLOR_PINK));
    public static final RegistryObject<Block> STRIPPED_STRAWBERRY_WOOD = BLOCKS.register("stripped_strawberry_wood", () -> strippedLog(MapColor.COLOR_PINK));
    public static final RegistryObject<Block> STRAWBERRY_WOOD = BLOCKS.register("strawberry_wood", () -> log(STRIPPED_STRAWBERRY_WOOD.get(), MapColor.TERRACOTTA_PINK, MapColor.TERRACOTTA_PINK));
    public static final RegistryObject<Block> STRAWBERRY_PLANKS = BLOCKS.register("strawberry_planks", () -> planks(MapColor.COLOR_PINK));
    public static final RegistryObject<Block> STRAWBERRY_STAIRS = BLOCKS.register("strawberry_stairs", () -> stairs(STRAWBERRY_PLANKS.get()));
    public static final RegistryObject<Block> STRAWBERRY_SLAB = BLOCKS.register("strawberry_slab", () -> slab(STRAWBERRY_PLANKS.get()));
    public static final RegistryObject<Block> STRAWBERRY_FENCE = BLOCKS.register("strawberry_fence", () -> fence(STRAWBERRY_PLANKS.get()));
    public static final RegistryObject<Block> STRAWBERRY_FENCE_GATE = BLOCKS.register("strawberry_fence_gate", () -> fenceGate(STRAWBERRY_PLANKS.get(), MysticWoodTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_BUTTON = BLOCKS.register("strawberry_button", () -> button(MysticBlockSetTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_PRESSURE_PLATE = BLOCKS.register("strawberry_pressure_plate", () -> pressurePlate(STRAWBERRY_PLANKS.get(), MysticBlockSetTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_TRAPDOOR = BLOCKS.register("strawberry_trapdoor", () -> trapdoor(STRAWBERRY_PLANKS.get(), MysticBlockSetTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_DOOR = BLOCKS.register("strawberry_door", () -> door(STRAWBERRY_PLANKS.get(), MysticBlockSetTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_SIGN = BLOCKS.register("strawberry_sign", () -> sign(STRAWBERRY_PLANKS.get(), MysticWoodTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_WALL_SIGN = BLOCKS.register("strawberry_wall_sign", () -> wallSign(STRAWBERRY_SIGN.get(), MysticWoodTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_HANGING_SIGN = BLOCKS.register("strawberry_hanging_sign", () -> hangingSign(STRAWBERRY_PLANKS.get(), MysticWoodTypes.STRAWBERRY));
    public static final RegistryObject<Block> STRAWBERRY_WALL_HANGING_SIGN = BLOCKS.register("strawberry_wall_hanging_sign", () -> wallHangingSign(STRAWBERRY_HANGING_SIGN.get(), MysticWoodTypes.STRAWBERRY));

    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush", () -> new StrawberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> STRAWBERRY_CAKE = BLOCKS.register("strawberry_cake", () -> new StrawberryCakeBlock(BlockBehaviour.Properties.of().forceSolidOn().strength(0.5F).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE = BLOCKS.register("strawberry_candle_cake", () ->  new StrawberryCandleCakeBlock(Blocks.CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_WHITE = BLOCKS.register("strawberry_candle_cake_white", () -> new StrawberryCandleCakeBlock(Blocks.WHITE_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_ORANGE = BLOCKS.register("strawberry_candle_cake_orange", () -> new StrawberryCandleCakeBlock(Blocks.ORANGE_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_MAGENTA = BLOCKS.register("strawberry_candle_cake_magenta", () -> new StrawberryCandleCakeBlock(Blocks.MAGENTA_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_LIGHT_BLUE = BLOCKS.register("strawberry_candle_cake_light_blue", () -> new StrawberryCandleCakeBlock(Blocks.LIGHT_BLUE_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_YELLOW = BLOCKS.register("strawberry_candle_cake_yellow", () -> new StrawberryCandleCakeBlock(Blocks.YELLOW_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_LIME = BLOCKS.register("strawberry_candle_cake_lime", () -> new StrawberryCandleCakeBlock(Blocks.LIME_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_PINK = BLOCKS.register("strawberry_candle_cake_pink", () -> new StrawberryCandleCakeBlock(Blocks.PINK_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_GRAY = BLOCKS.register("strawberry_candle_cake_gray", () -> new StrawberryCandleCakeBlock(Blocks.GRAY_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_LIGHT_GRAY = BLOCKS.register("strawberry_candle_cake_light_gray", () -> new StrawberryCandleCakeBlock(Blocks.LIGHT_GRAY_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_CYAN = BLOCKS.register("strawberry_candle_cake_cyan", () -> new StrawberryCandleCakeBlock(Blocks.CYAN_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_PURPLE = BLOCKS.register("strawberry_candle_cake_purple", () -> new StrawberryCandleCakeBlock(Blocks.PURPLE_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_BLUE = BLOCKS.register("strawberry_candle_cake_blue", () -> new StrawberryCandleCakeBlock(Blocks.BLUE_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_BROWN = BLOCKS.register("strawberry_candle_cake_brown", () -> new StrawberryCandleCakeBlock(Blocks.BROWN_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_GREEN = BLOCKS.register("strawberry_candle_cake_green", () -> new StrawberryCandleCakeBlock(Blocks.GREEN_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_RED = BLOCKS.register("strawberry_candle_cake_red", () -> new StrawberryCandleCakeBlock(Blocks.RED_CANDLE));
    public static final RegistryObject<Block> STRAWBERRY_CANDLE_CAKE_BLACK = BLOCKS.register("strawberry_candle_cake_black", () -> new StrawberryCandleCakeBlock(Blocks.BLACK_CANDLE));

    public static final RegistryObject<Block> POTTED_STRAWBERRY_SAPLING = BLOCKS.register("potted_strawberry_sapling", () -> potted(STRAWBERRY_SAPLING.get()));

    // bamboo blossom forest
    public static final RegistryObject<Block> PINK_CHERRY_BLOSSOMS = BLOCKS.register("pink_cherry_blossoms", () -> leaves("cherry", SoundType.CHERRY_LEAVES));
    public static final RegistryObject<Block> PINK_CHERRY_BLOSSOM_SAPLING = BLOCKS.register("pink_cherry_blossom_sapling", () -> new GrowingSaplingBlock(new GrowingSaplingBlock.TreeGrower(MysticTreeFeatures.PINK_CHERRY_TREE), BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING)));
    public static final RegistryObject<Block> WHITE_CHERRY_BLOSSOMS = BLOCKS.register("white_cherry_blossoms", () -> leaves("cherry", SoundType.CHERRY_LEAVES));
    public static final RegistryObject<Block> WHITE_CHERRY_BLOSSOM_SAPLING = BLOCKS.register("white_cherry_blossom_sapling", () -> new GrowingSaplingBlock(new GrowingSaplingBlock.TreeGrower(MysticTreeFeatures.WHITE_CHERRY_TREE), BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING)));

    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = BLOCKS.register("stripped_cherry_log", () -> strippedLog(MapColor.COLOR_MAGENTA));
    public static final RegistryObject<Block> CHERRY_LOG = BLOCKS.register("cherry_log", () -> log(STRIPPED_CHERRY_LOG.get(), MapColor.TERRACOTTA_BROWN, MapColor.COLOR_MAGENTA));
    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD = BLOCKS.register("stripped_cherry_wood", () -> strippedLog(MapColor.COLOR_MAGENTA));
    public static final RegistryObject<Block> CHERRY_WOOD = BLOCKS.register("cherry_wood", () -> log(STRIPPED_CHERRY_WOOD.get(), MapColor.TERRACOTTA_BROWN, MapColor.TERRACOTTA_BROWN));
    public static final RegistryObject<Block> CHERRY_PLANKS = BLOCKS.register("cherry_planks", () -> planks(MapColor.COLOR_MAGENTA));
    public static final RegistryObject<Block> CHERRY_STAIRS = BLOCKS.register("cherry_stairs", () -> stairs(CHERRY_PLANKS.get()));
    public static final RegistryObject<Block> CHERRY_SLAB = BLOCKS.register("cherry_slab", () -> slab(CHERRY_PLANKS.get()));
    public static final RegistryObject<Block> CHERRY_FENCE = BLOCKS.register("cherry_fence", () -> fence(CHERRY_PLANKS.get()));
    public static final RegistryObject<Block> CHERRY_FENCE_GATE = BLOCKS.register("cherry_fence_gate", () -> fenceGate(CHERRY_PLANKS.get(), MysticWoodTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_BUTTON = BLOCKS.register("cherry_button", () -> button(MysticBlockSetTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_PRESSURE_PLATE = BLOCKS.register("cherry_pressure_plate", () -> pressurePlate(CHERRY_PLANKS.get(), MysticBlockSetTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_TRAPDOOR = BLOCKS.register("cherry_trapdoor", () -> trapdoor(CHERRY_PLANKS.get(), MysticBlockSetTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_DOOR = BLOCKS.register("cherry_door", () -> door(CHERRY_PLANKS.get(), MysticBlockSetTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_SIGN = BLOCKS.register("cherry_sign", () -> sign(CHERRY_PLANKS.get(), MysticWoodTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = BLOCKS.register("cherry_wall_sign", () -> wallSign(CHERRY_SIGN.get(), MysticWoodTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_HANGING_SIGN = BLOCKS.register("cherry_hanging_sign", () -> hangingSign(CHERRY_PLANKS.get(), MysticWoodTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_WALL_HANGING_SIGN = BLOCKS.register("cherry_wall_hanging_sign", () -> wallHangingSign(CHERRY_HANGING_SIGN.get(), MysticWoodTypes.CHERRY));

    public static final RegistryObject<Block> BUDDING_PEONY_LEAVES = BLOCKS.register("budding_peony_leaves", () -> leaves(SoundType.GRASS));
    public static final RegistryObject<Block> PEONY_LEAVES = BLOCKS.register("peony_leaves", () -> leaves(SoundType.GRASS));
    public static final RegistryObject<Block> PEONY_BUSH = BLOCKS.register("peony_bush", () -> new GrowingBushBlock(new GrowingBushBlock.TreeGrower(MysticTreeFeatures.PEONY_BUSH), BlockBehaviour.Properties.copy(Blocks.AZALEA)));

    public static final RegistryObject<Block> POTTED_PINK_CHERRY_BLOSSOM_SAPLING = BLOCKS.register("potted_pink_cherry_blossom_sapling", () -> potted(PINK_CHERRY_BLOSSOM_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WHITE_CHERRY_BLOSSOM_SAPLING = BLOCKS.register("potted_white_cherry_blossom_sapling", () -> potted(WHITE_CHERRY_BLOSSOM_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_PEONY_BUSH = BLOCKS.register("potted_peony_bush", () -> potted(PEONY_BUSH.get()));

    // lavender meadow
    public static final RegistryObject<Block> JACARANDA_BLOSSOMS = BLOCKS.register("jacaranda_blossoms", () -> leaves("jacaranda", SoundType.AZALEA_LEAVES));
    public static final RegistryObject<Block> JACARANDA_LEAVES = BLOCKS.register("jacaranda_leaves", () -> leaves(SoundType.AZALEA_LEAVES));
    public static final RegistryObject<Block> JACARANDA_SAPLING = BLOCKS.register("jacaranda_sapling", () -> new GrowingSaplingBlock(new GrowingSaplingBlock.TreeGrower(MysticTreeFeatures.JACARANDA_TREE), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> STRIPPED_JACARANDA_LOG = BLOCKS.register("stripped_jacaranda_log", () -> strippedLog(MapColor.COLOR_PURPLE));
    public static final RegistryObject<Block> JACARANDA_LOG = BLOCKS.register("jacaranda_log", () -> log(STRIPPED_JACARANDA_LOG.get(), MapColor.TERRACOTTA_PURPLE, MapColor.COLOR_PURPLE));
    public static final RegistryObject<Block> STRIPPED_JACARANDA_WOOD = BLOCKS.register("stripped_jacaranda_wood", () -> strippedLog(MapColor.COLOR_PURPLE));
    public static final RegistryObject<Block> JACARANDA_WOOD = BLOCKS.register("jacaranda_wood", () -> log(STRIPPED_JACARANDA_WOOD.get(), MapColor.TERRACOTTA_PURPLE, MapColor.TERRACOTTA_PURPLE));
    public static final RegistryObject<Block> JACARANDA_PLANKS = BLOCKS.register("jacaranda_planks", () -> planks(MapColor.COLOR_PURPLE));
    public static final RegistryObject<Block> JACARANDA_STAIRS = BLOCKS.register("jacaranda_stairs", () -> stairs(JACARANDA_PLANKS.get()));
    public static final RegistryObject<Block> JACARANDA_SLAB = BLOCKS.register("jacaranda_slab", () -> slab(JACARANDA_PLANKS.get()));
    public static final RegistryObject<Block> JACARANDA_FENCE = BLOCKS.register("jacaranda_fence", () -> fence(JACARANDA_PLANKS.get()));
    public static final RegistryObject<Block> JACARANDA_FENCE_GATE = BLOCKS.register("jacaranda_fence_gate", () -> fenceGate(JACARANDA_PLANKS.get(), MysticWoodTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_BUTTON = BLOCKS.register("jacaranda_button", () -> button(MysticBlockSetTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_PRESSURE_PLATE = BLOCKS.register("jacaranda_pressure_plate", () -> pressurePlate(JACARANDA_PLANKS.get(), MysticBlockSetTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_TRAPDOOR = BLOCKS.register("jacaranda_trapdoor", () -> trapdoor(JACARANDA_PLANKS.get(), MysticBlockSetTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_DOOR = BLOCKS.register("jacaranda_door", () -> door(JACARANDA_PLANKS.get(), MysticBlockSetTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_SIGN = BLOCKS.register("jacaranda_sign", () -> sign(JACARANDA_PLANKS.get(), MysticWoodTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_WALL_SIGN = BLOCKS.register("jacaranda_wall_sign", () -> wallSign(JACARANDA_SIGN.get(), MysticWoodTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_HANGING_SIGN = BLOCKS.register("jacaranda_hanging_sign", () -> hangingSign(JACARANDA_PLANKS.get(), MysticWoodTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_WALL_HANGING_SIGN = BLOCKS.register("jacaranda_wall_hanging_sign", () -> wallHangingSign(JACARANDA_HANGING_SIGN.get(), MysticWoodTypes.JACARANDA));

    public static final RegistryObject<Block> LAVENDER = BLOCKS.register("lavender", () -> new LavenderFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).offsetType(BlockBehaviour.OffsetType.XZ).noCollission().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> BUTTERFLY_NEST = BLOCKS.register("butterfly_nest", () -> new ButterflyNestBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.5F).sound(SoundType.FLOWERING_AZALEA).noOcclusion().ignitedByLava()));
    public static final RegistryObject<Block> CHRYSALIS = BLOCKS.register("chrysalis", () -> new ChrysalisBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> POTTED_JACARANDA_SAPLING = BLOCKS.register("potted_jacaranda_sapling", () -> potted(JACARANDA_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_LAVENDER = BLOCKS.register("potted_lavender", () -> potted(LAVENDER.get()));

    // autumnal grove
    public static final RegistryObject<Block> MAPLE_LEAVES = BLOCKS.register("maple_leaves", () -> leaves("normal", SoundType.GRASS));
    public static final RegistryObject<Block> MAPLE_SAPLING = BLOCKS.register("maple_sapling", () -> new GrowingSaplingBlock(new GrowingSaplingBlock.TreeGrower(MysticTreeFeatures.MAPLE_TREE), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ORANGE_MAPLE_LEAVES = BLOCKS.register("orange_maple_leaves", () -> leaves("orange", SoundType.GRASS));
    public static final RegistryObject<Block> ORANGE_MAPLE_SAPLING = BLOCKS.register("orange_maple_sapling", () -> new GrowingSaplingBlock(new GrowingSaplingBlock.TreeGrower(MysticTreeFeatures.ORANGE_MAPLE_TREE), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> YELLOW_MAPLE_LEAVES = BLOCKS.register("yellow_maple_leaves", () -> leaves("yellow", SoundType.GRASS));
    public static final RegistryObject<Block> YELLOW_MAPLE_SAPLING = BLOCKS.register("yellow_maple_sapling", () -> new GrowingSaplingBlock(new GrowingSaplingBlock.TreeGrower(MysticTreeFeatures.YELLOW_MAPLE_TREE), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = BLOCKS.register("stripped_maple_log", () -> strippedLog(MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> MAPLE_LOG = BLOCKS.register("maple_log", () -> log(STRIPPED_MAPLE_LOG.get(), MapColor.TERRACOTTA_BROWN, MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> WHITE_MAPLE_LOG = BLOCKS.register("white_maple_log", () -> log(STRIPPED_MAPLE_LOG.get(), MapColor.TERRACOTTA_WHITE, MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = BLOCKS.register("stripped_maple_wood", () -> strippedLog(MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> MAPLE_WOOD = BLOCKS.register("maple_wood", () -> log(STRIPPED_MAPLE_WOOD.get(), MapColor.TERRACOTTA_BROWN, MapColor.TERRACOTTA_BROWN));
    public static final RegistryObject<Block> WHITE_MAPLE_WOOD = BLOCKS.register("white_maple_wood", () -> log(STRIPPED_MAPLE_WOOD.get(), MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_WHITE));
    public static final RegistryObject<Block> MAPLE_PLANKS = BLOCKS.register("maple_planks", () -> planks(MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> MAPLE_STAIRS = BLOCKS.register("maple_stairs", () -> stairs(MAPLE_PLANKS.get()));
    public static final RegistryObject<Block> MAPLE_SLAB = BLOCKS.register("maple_slab", () -> slab(MAPLE_PLANKS.get()));
    public static final RegistryObject<Block> MAPLE_FENCE = BLOCKS.register("maple_fence", () -> fence(MAPLE_PLANKS.get()));
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = BLOCKS.register("maple_fence_gate", () -> fenceGate(MAPLE_PLANKS.get(), MysticWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_BUTTON = BLOCKS.register("maple_button", () -> button(MysticBlockSetTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = BLOCKS.register("maple_pressure_plate", () -> pressurePlate(MAPLE_PLANKS.get(), MysticBlockSetTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = BLOCKS.register("maple_trapdoor", () -> trapdoor(MAPLE_PLANKS.get(), MysticBlockSetTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_DOOR = BLOCKS.register("maple_door", () -> door(MAPLE_PLANKS.get(), MysticBlockSetTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_sign", () -> sign(MAPLE_PLANKS.get(), MysticWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign", () -> wallSign(MAPLE_SIGN.get(), MysticWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_HANGING_SIGN = BLOCKS.register("maple_hanging_sign", () -> hangingSign(MAPLE_PLANKS.get(), MysticWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_HANGING_SIGN = BLOCKS.register("maple_wall_hanging_sign", () -> wallHangingSign(MAPLE_HANGING_SIGN.get(), MysticWoodTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_LEAF_PILE = BLOCKS.register("maple_leaf_pile", () -> new LeafPileBlock("normal", BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).noCollission().noOcclusion().replaceable().strength(0.1F).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ORANGE_MAPLE_LEAF_PILE = BLOCKS.register("orange_maple_leaf_pile", () -> new LeafPileBlock("orange", BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).noCollission().noOcclusion().replaceable().strength(0.1F).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_MAPLE_LEAF_PILE = BLOCKS.register("yellow_maple_leaf_pile", () -> new LeafPileBlock("yellow", BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).noCollission().noOcclusion().replaceable().strength(0.1F).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SPICED_PUMPKIN = BLOCKS.register("spiced_pumpkin", () -> new SpicedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)));
    public static final RegistryObject<Block> CARVED_SPICED_PUMPKIN = BLOCKS.register("carved_spiced_pumpkin", () -> new EquipableCarvedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.CARVED_PUMPKIN)));
    public static final RegistryObject<Block> SPICED_JACK_O_LANTERN = BLOCKS.register("spiced_jack_o_lantern", () -> new CarvedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.JACK_O_LANTERN)));
    public static final RegistryObject<Block> SPICED_PUMPKIN_STEM_ATTACHED = BLOCKS.register("spiced_pumpkin_stem_attached", () -> new AttachedStemBlock((StemGrownBlock)SPICED_PUMPKIN.get(), MysticItems.SPICED_PUMPKIN_SEEDS, BlockBehaviour.Properties.copy(Blocks.ATTACHED_PUMPKIN_STEM)));
    public static final RegistryObject<Block> SPICED_PUMPKIN_STEM = BLOCKS.register("spiced_pumpkin_stem", () -> new StemBlock((StemGrownBlock)SPICED_PUMPKIN.get(), MysticItems.SPICED_PUMPKIN_SEEDS, BlockBehaviour.Properties.copy(Blocks.PUMPKIN_STEM)));

    public static final RegistryObject<Block> POTTED_MAPLE_SAPLING = BLOCKS.register("potted_maple_sapling", () -> potted(MAPLE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_ORANGE_MAPLE_SAPLING = BLOCKS.register("potted_orange_maple_sapling", () -> potted(ORANGE_MAPLE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_YELLOW_MAPLE_SAPLING = BLOCKS.register("potted_yellow_maple_sapling", () -> potted(YELLOW_MAPLE_SAPLING.get()));

}