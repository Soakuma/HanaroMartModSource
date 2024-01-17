package net.pinne.hanaromart.init;

import net.pinne.hanaromart.block.entity.CashierMachineBlockEntity;
import net.pinne.hanaromart.HanaroMartMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class HanaroMartModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HanaroMartMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CASHIER_MACHINE = register("cashier_machine", HanaroMartModBlocks.CASHIER_MACHINE, CashierMachineBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
