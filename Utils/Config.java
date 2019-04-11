package de.Flubbii.Plugin.Utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	private static File File = new File("plugins/ChatClear", "Config.yml");
	public static FileConfiguration cfg = YamlConfiguration.loadConfiguration(File);

	public static void save() {
		try {
			cfg.save(File);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
