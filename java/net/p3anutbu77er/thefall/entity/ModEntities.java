package net.p3anutbu77er.thefall.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.p3anutbu77er.thefall.TheFall;
import net.p3anutbu77er.thefall.entity.custom.AgronomistDwarfEntity;

public class ModEntities {

    public static final EntityType<AgronomistDwarfEntity> AGRONOMISTDWARF = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TheFall.MOD_ID, "agronomistdwarf"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, AgronomistDwarfEntity::new)
                    .dimensions(EntityDimensions.fixed(0.50f, 1.0f)).build());

    public static void registerModEntities() {
        TheFall.LOGGER.info("Registering Mod Entities for " + TheFall.MOD_ID);
    }
}
