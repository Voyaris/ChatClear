package de.Flubbii.Plugin.Main;

import org.bukkit.plugin.java.JavaPlugin;

import de.Flubbii.Plugin.Command.ChatClear;
import de.Flubbii.Plugin.Utils.Config;
import de.Flubbii.Plugin.Utils.Messages;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		super.onEnable();
		Config.save();
		Messages.create();
		getCommand("chatclear").setExecutor(new ChatClear());
	}
}
