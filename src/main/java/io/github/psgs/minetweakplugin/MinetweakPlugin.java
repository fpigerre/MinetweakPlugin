package io.github.psgs.minetweakplugin;

import org.minetweak.event.plugin.PluginEnableEvent;
import org.minetweak.plugins.Plugin;
import org.minetweak.util.TweakLogger;

public class MinetweakPlugin {

    @Plugin.Instance
    public static MinetweakPlugin instance;

    @Plugin.Logger
    public TweakLogger logger;

    @Plugin.Handler
    public void onEnable(PluginEnableEvent event) {
        logger.info("Successfully Enabled");
    }
}