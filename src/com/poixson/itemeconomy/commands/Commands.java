package com.poixson.itemeconomy.commands;

import com.poixson.itemeconomy.ItemEconomyPlugin;
import com.poixson.tools.commands.xCMD_Handler;


public class Commands extends xCMD_Handler {

	protected final Command_Balance cmd_balance;



	public Commands(final ItemEconomyPlugin plugin) {
		super(plugin);
		this.addCommand(this.cmd_balance = new Command_Balance(plugin));
	}



}
