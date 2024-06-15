package com.poixson.itemeconomy.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.poixson.itemeconomy.ItemEconomyPlugin;
import com.poixson.tools.commands.pxnCommandRoot;


public class Command_Balance extends pxnCommandRoot {

	protected final ItemEconomyPlugin plugin;



	public Command_Balance(final ItemEconomyPlugin plugin) {
		super(
			plugin,
			"itemeconomy", // namespace
			"Display your financial balance.", // desc
			null, // usage
			"itemeconomy.cmd.balance", // perm
			new String[] { // labels
				"balance", "bal",
				"money"
			}
		);
		this.plugin = plugin;
	}



	@Override
	public boolean onCommand(final CommandSender sender,
			final Command command, final String label, final String[] args) {
return false;
	}
/*
		final Player player = (sender instanceof Player ? (Player)sender : null);
		final int num_args = args.length;
		final EconManager economy = this.plugin.getEconomy();
		// own balance
		if (num_args == 0) {
			if (player == null
			|| !player.hasPermission("itemeconomy.cmd.balance.top"))
				return false;
			final double amount = economy.getBalance(player);
			final String amount_formatted = economy.format(amount);
			sender.sendMessage(String.format(
				" %sBalance: %s%s",
				ChatColor.DARK_AQUA,
				(amount > 0.0 ? ChatColor.GREEN : ChatColor.RED),
				amount_formatted
			));
		} else
		// top player balances
		if (num_args == 1
		&& "top".equals(args[0])) {
			if (player != null && !player.hasPermission("itemeconomy.cmd.balance.top"))
				return false;
			final StringBuilder msg = new StringBuilder();
			msg.append('\n').append(ChatColor.GOLD)
				.append("Top Balances\n============\n");
			for (final PlayerEconDAO dao : economy.getTopBalances()) {
				final double amount = dao.amount.get();
				msg.append(' ')
					.append(ChatColor.DARK_AQUA)
					.append(dao.player_name).append(": ")
					.append(amount > 0.0 ? ChatColor.GREEN : ChatColor.RED)
					.append(economy.format(amount))
					.append('\n');
			}
			msg.append(' ');
			sender.sendMessage(msg.toString());
		// other player balance
		} else {
			if (player != null
			&& !player.hasPermission("itemeconomy.cmd.balance.others"))
				return false;
			for (final String name : args) {
				@SuppressWarnings("deprecation")
				final OfflinePlayer p = Bukkit.getOfflinePlayer(name);
				if (p != null) {
					final double amount = economy.getBalance(p);
					final String amount_formatted = economy.format(amount);
					sender.sendMessage(String.format(
						" %s%s: %s%s",
						ChatColor.DARK_AQUA,
						name,
						(amount > 0.0 ? ChatColor.GREEN : ChatColor.RED),
						amount_formatted
					));
				}
			}
		}
		return true;
*/



}
