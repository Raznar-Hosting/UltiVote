package dev.radiance.ultivote.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Vote implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender != null) {
            player.sendMessage(Messages.voteMsg);
        } else {
            Bukkit.getLogger().info(Messages.voteMsg);
        }
        return false;
    }
}