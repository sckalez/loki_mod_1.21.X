package net.loki.lokimod;

import net.fabricmc.api.ModInitializer;

import net.loki.lokimod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LokiMod implements ModInitializer {
	public static final String MOD_ID = "lokimod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}