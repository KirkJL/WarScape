package com.WarScape;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("WarScape")
public interface WarScapeConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greetings",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}
}
