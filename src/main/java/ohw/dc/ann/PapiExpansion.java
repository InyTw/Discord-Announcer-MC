package ohw.dc.ann;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PapiExpansion extends PlaceholderExpansion {
    private final Ann plugin;

    public PapiExpansion(Ann plugin) {
        this.plugin = plugin;
    }

    @Override public @NotNull String getIdentifier() { return "discord"; } // 這裡決定了 %discord_...
    @Override public @NotNull String getAuthor() { return "OHW"; }
    @Override public @NotNull String getVersion() { return "1.0"; }
    @Override public boolean persist() { return true; }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String params) {
        if (params.equalsIgnoreCase("ann")) {
            return plugin.getLatestMsg();
        }
        return null;
    }
}