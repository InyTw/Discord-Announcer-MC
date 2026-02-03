package ohw.dc.ann;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.jetbrains.annotations.NotNull;

public class DiscordHandler extends ListenerAdapter {
    private JDA jda;

    public void startBot() {
        String token = Ann.getInstance().getConfig().getString("token");
        try {
            jda = JDABuilder.createDefault(token)
                    .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                    .addEventListeners(this)
                    .build();
        } catch (Exception e) {
            Ann.getInstance().getLogger().severe("Discord 啟動失敗: " + e.getMessage());
        }
    }

    public void stopBot() {
        if (jda != null) jda.shutdownNow();
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String channelId = Ann.getInstance().getConfig().getString("channel-id");
        if (event.getChannel().getId().equals(channelId) && !event.getAuthor().isBot()) {
            String content = event.getMessage().getContentDisplay();
            Ann.getInstance().setLatestMsg(content);
        }
    }
}