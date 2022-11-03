package mopi.gpuenhanced;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class GpuEnhancedPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GpuEnhancedPlugin.class);
		RuneLite.main(args);
	}
}