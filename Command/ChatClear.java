package de.Flubbii.Plugin.Command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Flubbii.Plugin.Utils.Messages;

public class ChatClear implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		if (cs instanceof Player) {
			Player p = (Player) cs;
			if (p.hasPermission(Messages.getMessage("Permission.Command"))) {
				if (args.length == 0) {
					for (Player all : Bukkit.getOnlinePlayers()) {
						if (!all.hasPermission(Messages.getMessage("Permission.ByPass"))) {
							for (int i = 0; i <= 200; i++) {
								all.sendMessage("");
							}
						}
						all.sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", p.getName()));
					}
					Bukkit.getConsoleSender().sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", p.getName()));
				} else {
					String Message = "";
					for (int i = 0; i < args.length; i++) {
						Message += args[i] + " ";
					}
					for (Player all : Bukkit.getOnlinePlayers()) {
						if (!all.hasPermission(Messages.getMessage("Permission.ByPass"))) {
							for (int i = 0; i <= 200; i++) {
								all.sendMessage("");
							}
						}
						all.sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", p.getName()));
						all.sendMessage(Messages.getMessage("Message.2").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%Reason%", ChatColor.translateAlternateColorCodes('&', Message)));
					}
					Bukkit.getConsoleSender().sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", p.getName()));
					Bukkit.getConsoleSender().sendMessage(Messages.getMessage("Message.2").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%Reason%", ChatColor.translateAlternateColorCodes('&', Message)));
				}
			} else {
				p.sendMessage(Messages.getMessage("NoPermission").replace("%Prefix%", Messages.getMessage("Prefix")));
			}
		} else {
			if (args.length == 0) {
				for (Player all : Bukkit.getOnlinePlayers()) {
					if (!all.hasPermission(Messages.getMessage("Permission.ByPass"))) {
						for (int i = 0; i <= 200; i++) {
							all.sendMessage("");
						}
					}
					all.sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", cs.getName()));
				}
				Bukkit.getConsoleSender().sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", cs.getName()));
			} else {
				String Message = "";
				for (int i = 0; i < args.length; i++) {
					Message += args[i] + " ";
				}
				for (Player all : Bukkit.getOnlinePlayers()) {
					if (!all.hasPermission(Messages.getMessage("Permission.ByPass"))) {
						for (int i = 0; i <= 200; i++) {
							all.sendMessage("");
						}
					}
					all.sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", cs.getName()));
					all.sendMessage(Messages.getMessage("Message.2").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%Reason%", ChatColor.translateAlternateColorCodes('&', Message)));
				}
				Bukkit.getConsoleSender().sendMessage(Messages.getMessage("Message.1").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%who%", cs.getName()));
				Bukkit.getConsoleSender().sendMessage(Messages.getMessage("Message.2").replace("%Prefix%", Messages.getMessage("Prefix")).replace("%Reason%", ChatColor.translateAlternateColorCodes('&', Message)));
			}
		}
		return false;
	}
}
