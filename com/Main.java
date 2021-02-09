package com;

import com.cmd.Back;
import com.event.DeathEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Main extends JavaPlugin {
    public static Main instance;
    public HashMap<Player, Location> back = new HashMap<>();

    @Override
    public void onEnable() {
        instance = this;

        CommandExecutor();
        ListenerExecutor();
        CommandSender iniciar = Bukkit.getConsoleSender();

        iniciar.sendMessage("§a[LBack] foi iniciado com sucesso.");
    }

    public void CommandExecutor() {

        getCommand("back").setExecutor(new Back());

    }

    public void ListenerExecutor() {

        Bukkit.getPluginManager().registerEvents(new DeathEvent(), this);

    }
}
