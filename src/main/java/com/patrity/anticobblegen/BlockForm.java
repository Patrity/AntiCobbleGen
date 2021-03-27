package com.patrity.anticobblegen;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;

/*
 * @project AntiCobbleGen
 * @author Patrity - https://github.com/Patrity
 * Created on - 3/26/2021
 */
public class BlockForm implements Listener {

    @EventHandler
    public void onBlockFormEvent(BlockFormEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onLiquidSpread(BlockFromToEvent event) {
        if (event.getToBlock().getType() == Material.WATER || event.getToBlock().getType() == Material.LAVA) {
            event.setCancelled(true);
        }
    }
}
