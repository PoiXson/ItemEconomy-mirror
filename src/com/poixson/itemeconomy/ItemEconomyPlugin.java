package com.poixson.itemeconomy;

import java.util.concurrent.atomic.AtomicReference;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

import com.poixson.itemeconomy.commands.Commands;
import com.poixson.tools.xJavaPlugin;


public class ItemEconomyPlugin extends xJavaPlugin {
	@Override public int getSpigotPluginID() { return 0; }
	@Override public int getBStatsID() {       return 21299;  }
	public static final String CHAT_PREFIX = ChatColor.DARK_AQUA+"[Economy] "+ChatColor.WHITE;

	protected final AtomicReference<Commands> commands = new AtomicReference<Commands>(null);



	public ItemEconomyPlugin() {
		super(ItemEconomyPlugin.class);
	}



	@Override
	public void onEnable() {
		super.onEnable();
		// commands
		{
			final Commands commands = new Commands(this);
			final Commands previous = this.commands.getAndSet(commands);
			if (previous != null)
				previous.close();
		}
		// save
		this.setConfigChanged();
		this.saveConfigs();
	}

	@Override
	public void onDisable() {
		super.onDisable();
		// commands
		{
			final Commands commands = this.commands.getAndSet(null);
			if (commands != null)
				commands.close();
		}
	}



	// -------------------------------------------------------------------------------
	// configs



	@Override
	protected void loadConfigs() {
		super.loadConfigs();
		// config.yml
		final FileConfiguration cfg = this.getConfig();
		this.config.set(cfg);
		this.configDefaults(cfg);
		cfg.options().copyDefaults(true);
	}
	@Override
	protected void configDefaults(final FileConfiguration cfg) {
		super.configDefaults(cfg);
//TODO
	}



}
