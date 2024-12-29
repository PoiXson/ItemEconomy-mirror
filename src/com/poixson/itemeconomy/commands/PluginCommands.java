package com.poixson.itemeconomy.commands;

import java.io.Closeable;

import com.poixson.itemeconomy.ItemEconomyPlugin;


public class Commands implements Closeable {

	protected final Command_Balance cmd_balance; // /balance



	public Commands(final ItemEconomyPlugin plugin) {
		this.cmd_balance = new Command_Balance(plugin);
	}



	@Override
	public void close() {
		this.cmd_balance.close();
	}



}
