package net.pinne.hanaromart.init;

import net.pinne.hanaromart.HanaroMartMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class HanaroMartModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HanaroMartMod.MODID);
	public static final RegistryObject<SoundEvent> CASH = REGISTRY.register("cash", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hanaro_mart", "cash")));
}
