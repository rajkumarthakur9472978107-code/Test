package com.yourname.geyserwrapper;

import org.bukkit.plugin.java.JavaPlugin;

public class GeyserWrapper extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("GeyserWrapper enabled — checking for Geyser library...");

        try {
            Class<?> clazz = Class.forName("org.geysermc.platform.spigot.GeyserSpigotBootstrap");
            getLogger().info("✔ Geyser library found: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            getLogger().warning("✖ Geyser library NOT found!");
            getLogger().warning("Put geyser-spigot.jar inside plugins/ folder.");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("GeyserWrapper disabled.");
    }
}
