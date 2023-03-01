package com.muteprevention;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MutePreventionPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MutePreventionPlugin.class);
		RuneLite.main(args);
	}
}