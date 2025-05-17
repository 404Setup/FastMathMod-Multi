package org.elias.fastmath;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(SuperFastMath.MOD_ID)
public class SuperFastMath {
    public static final String MOD_ID = "superfastmath";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public SuperFastMath(FMLJavaModLoadingContext context) {
        LOGGER.info("SuperFastMath initialized");
    }
}