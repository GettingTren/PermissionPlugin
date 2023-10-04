package me.ilgroggo.permissionsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){

            Player p = (Player) commandSender;

            if(p.hasPermission("permission.commands.test")){
                p.sendMessage(ChatColor.GREEN + "You have the permission to run this command, great!");
            }else{
                p.sendMessage(ChatColor.RED + "You DONT have the permission to run this command.");
            }


        }


        return true;
    }
}
