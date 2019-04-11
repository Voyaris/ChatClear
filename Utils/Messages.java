package de.Flubbii.Plugin.Utils;

import org.bukkit.configuration.file.FileConfiguration;

public class Messages {
	private static FileConfiguration cfg = Config.cfg;

	public static void create() {
		if (cfg.getString("Config.Permission.Command") == null) {
			cfg.set("Config.Permission.Command", "ChatClear.Use");
		}
		if (cfg.getString("Config.Permission.ByPass") == null) {
			cfg.set("Config.Permission.ByPass", "ChatClear.ByPass");
		}
		if (cfg.getString("Config.Prefix") == null) {
			cfg.set("Config.Prefix", "&8[&eChatClear&8]&7");
		}
		if (cfg.getString("Config.Message.1") == null) {
			cfg.set("Config.Message.1", "%Prefix% The chat was cleared by &a%who%&7.");
		}
		if (cfg.getString("Config.Message.2") == null) {
			cfg.set("Config.Message.2", "%Prefix% Reason: &e%Reason%");
		}
		if (cfg.getString("Config.NoPermission") == null) {
			cfg.set("Config.NoPermission", "%Prefix% &cYou don't have the permission to use this command.");
		}
		Config.save();
	}

	public static String getMessage(String Nachricht) {
		return cfg.getString("Config." + Nachricht).replaceAll("&", "§");
	}
}
