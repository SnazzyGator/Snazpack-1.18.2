package net.snazzygator.snazpackmod.entity.client.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snazzygator.snazpackmod.SnazpackMod;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SnazpackMod.MOD_ID);
    
    // ENTITIES
    public static RegistryObject<SoundEvent> LITTLEGATOR_SQUEAK = registerSoundEvent("littlegator_squeak");
    public static RegistryObject<SoundEvent> LITTLEGATOR_SCREAM = registerSoundEvent("littlegator_scream");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(SnazpackMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
