package net.pinne.hanaromart.init;

import net.pinne.hanaromart.block.CashierMachineBlock;
import net.pinne.hanaromart.HanaroMartMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class HanaroMartModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HanaroMartMod.MODID);
	public static final RegistryObject<Block> CASHIER_MACHINE = REGISTRY.register("cashier_machine", () -> new CashierMachineBlock());
}
