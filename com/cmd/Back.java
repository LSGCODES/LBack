package com.cmd;

import com.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Back implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(!(sender instanceof Player)) return false;
        Player player = (Player)sender;

        if(command.getName().equalsIgnoreCase("back")) {
            if(!Main.instance.back.containsKey(player)) {
                player.sendMessage("§cVocê não tem um local de morte para voltar...");
                return true;
            }

            player.teleport(Main.instance.back.get(player));
            player.sendMessage("§aVocê voltou até seu último local de morte.");
            Main.instance.back.remove(player);

        }
        return false;
    }
}
