package me.john000708.barrels.listeners;

import me.john000708.barrels.Barrels;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

/**
 * Created by John on 10.05.2016.
 */
public class DisplayListener implements Listener {
	
    public DisplayListener() {
        Bukkit.getPluginManager().registerEvents(this, Barrels.plugin);
    }

    @EventHandler
    public void onPickpup(PlayerPickupItemEvent e) {
        if (!e.getItem().hasMetadata("no_pickup") && e.getItem().getItemStack().hasItemMeta() && e.getItem().getItemStack().getItemMeta().hasDisplayName() && e.getItem().getItemStack().getItemMeta().getDisplayName().startsWith("�6�lB4R3L - �eITEM")) {
        	e.setCancelled(true);
        	e.getItem().remove();
        }
    }

    @EventHandler
    public void onInventoryPickup(InventoryPickupItemEvent e) {
        if (!e.getItem().hasMetadata("no_pickup") && e.getItem().getItemStack().hasItemMeta() && e.getItem().getItemStack().getItemMeta().hasDisplayName() && e.getItem().getItemStack().getItemMeta().getDisplayName().startsWith("�6�lB4R3L - �eITEM")) {
        	e.setCancelled(true);
        	e.getItem().remove();
        }
    }
}
