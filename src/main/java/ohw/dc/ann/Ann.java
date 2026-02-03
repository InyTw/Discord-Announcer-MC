package ohw.dc.ann;

import org.bukkit.plugin.java.JavaPlugin;

public class Ann extends JavaPlugin {
    private static Ann instance;
    private String latestMsg = "等待公告中...";
    private DiscordHandler discordHandler;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        discordHandler = new DiscordHandler();
        discordHandler.startBot();

        if (getServer().getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new PapiExpansion(this).register();
        }
    }

    @Override
    public void onDisable() {
        if (discordHandler != null) discordHandler.stopBot();
    }

    public static Ann getInstance() { return instance; }
    public String getLatestMsg() { return latestMsg; }
    public void setLatestMsg(String msg) { this.latestMsg = msg; }
}