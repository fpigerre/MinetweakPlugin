package io.github.psgs.minetweakplugin;

import org.minetweak.chat.TextColor;
import org.minetweak.command.CommandExecutor;
import org.minetweak.command.CommandSender;

public class MinetweakCommand extends CommandExecutor {

    @Override
    public void executeCommand(CommandSender sender, String overallCommand, String[] args) {

        if (overallCommand.equalsIgnoreCase("minetweak")) {
            sender.sendMessage(TextColor.RED + " ------ " + TextColor.GOLD + "Minetweak" + " ------ ");
            sender.sendMessage(TextColor.AQUA + "Hey! Right now, you're using a plugin made with the Minetweak API!");
            sender.sendMessage(TextColor.AQUA + "Minetweak allows server owners and developers to interact with a minecraft server");
            sender.sendMessage(TextColor.AQUA + "in ways that have never been seen before!");
            sender.sendMessage(TextColor.AQUA + "Minetweak also supports Bukkit plugins, so you can still use all the plugins you're used to.");

        } else {

            if (args[0].equalsIgnoreCase("developers")) {
                sender.sendMessage(TextColor.RED + " ------ " + TextColor.GOLD + "Minetweak" + " ------ ");
                sender.sendMessage(TextColor.AQUA + "Minetweak Developers and Notable Contributors:");
                sender.sendMessage(TextColor.AQUA + "Logan - Logan Gorence - Developer and Founder");
                sender.sendMessage(TextColor.AQUA + "kaendfinger - Kenneth Endfinger - Developer and Project Manager");
                sender.sendMessage(TextColor.AQUA + "samrg472 - Developer and Contributor");
                sender.sendMessage(TextColor.AQUA + "Neil5043 - Wiki and Issue Manager");
                sender.sendMessage(TextColor.AQUA + "psgs - Developer and Training Manager");
                sender.sendMessage(TextColor.AQUA + "Neil5043 - Wiki Contributor");
            }
        }
    }
}
