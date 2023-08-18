package net.kai.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.kai.tutorialmod.item.ModItemGroups;
import net.kai.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("sup bitches");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	} //yea
}