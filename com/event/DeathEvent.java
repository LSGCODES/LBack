package com.event;

import com.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener {

    @EventHandler
    void onBack(PlayerDeathEvent e) {
        Player p = e.getEntity().getPlayer();
        if(!Main.instance.back.containsKey(p)) {
            Main.instance.back.put(p, p.getLocation());

        }

    }

}
