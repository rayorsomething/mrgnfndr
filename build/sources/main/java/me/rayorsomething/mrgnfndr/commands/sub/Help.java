package me.rayorsomething.mrgnfndr.commands.sub;

import me.rayorsomething.mrgnfndr.Main;
import net.minecraft.command.ICommandSender;

//Taken from Mindlessly
public class Help implements Subcommand {
    @Override
    public String getCommandName() {
        return "help";
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public String getCommandUsage() {
        return "";
    }

    @Override
    public String getCommandDescription() {
        return "Sends the help message";
    }

    @Override
    public boolean processCommand(ICommandSender sender, String[] args) {
        Main.commandManager.sendHelp(sender);
        return true;
    }
}