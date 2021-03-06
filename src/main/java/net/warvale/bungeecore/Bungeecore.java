package net.warvale.bungeecore;


import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class Bungeecore extends Plugin{
    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new MSGCommand());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new ReplyCommand());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new AlertCommand());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new StaffChatCommand());
    }
}
