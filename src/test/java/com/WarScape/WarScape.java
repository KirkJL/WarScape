package com.WarScape;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class WarScape
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(WarScapePlugin.class);
		RuneLite.main(args);
	}
}