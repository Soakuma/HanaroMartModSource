package net.pinne.hanaromart.init;

import net.pinne.hanaromart.world.inventory.CashierMachineGUIMenu;
import net.pinne.hanaromart.HanaroMartMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class HanaroMartModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HanaroMartMod.MODID);
	public static final RegistryObject<MenuType<CashierMachineGUIMenu>> CASHIER_MACHINE_GUI = REGISTRY.register("cashier_machine_gui", () -> IForgeMenuType.create(CashierMachineGUIMenu::new));
}
