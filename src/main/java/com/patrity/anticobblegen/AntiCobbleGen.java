package com.patrity.anticobblegen;

import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCobbleGen extends JavaPlugin {

    public static AntiCobbleGen SINGLETON;

    @Override
    public void onEnable() {
        // Plugin startup logic
        AntiCobbleGen.SINGLETON = this;
        getServer().getPluginManager().registerEvents(new BlockForm(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
