package net.natureprairies.world.biome;

import net.minecraft.util.Identifier;
import net.natureprairies.NaturesPrairies;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(NaturesPrairies.MODID, "lavender_fields"), 6));
    }
}
