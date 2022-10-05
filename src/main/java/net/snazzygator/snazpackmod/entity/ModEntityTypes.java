package net.snazzygator.snazpackmod.entity;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snazzygator.snazpackmod.SnazpackMod;
import net.snazzygator.snazpackmod.entity.custom.GeetEntity;
import net.snazzygator.snazpackmod.entity.custom.LittlegatorEntity;

public class ModEntityTypes extends Mob {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, SnazpackMod.MOD_ID);

    public static final RegistryObject<EntityType<LittlegatorEntity>> LITTLEGATOR =
            ENTITY_TYPES.register("littlegator",
                    () -> EntityType.Builder.of(LittlegatorEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(SnazpackMod.MOD_ID, "littlegator").toString()));

    public static final RegistryObject<EntityType<GeetEntity>> GEET =
            ENTITY_TYPES.register("geet",
                    () -> EntityType.Builder.of(GeetEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.8f)
                            .build(new ResourceLocation(SnazpackMod.MOD_ID, "geet").toString()));

    protected ModEntityTypes(EntityType<? extends Mob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}