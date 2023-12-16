package com.mysticsbiomes.common.block;

import com.mysticsbiomes.common.block.entity.MysticSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MysticStandingSignBlock extends StandingSignBlock {

    public MysticStandingSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MysticSignBlockEntity(pos, state);
    }

}