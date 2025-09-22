package dev.daniboy.donutcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class DonutCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Normal startup logic goes here
        getLogger().info("⚡ License check disabled – plugin running freely.");

        // Initialize your configs, managers, listeners, commands, etc.
        // All the original plugin startup code stays here
    }

    @Override
    public void onDisable() {
        getLogger().info("DonutCore disabled.");
    }
}
