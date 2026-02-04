# 🤖 DiscordAnnouncerMC

![Banner](https://media.discordapp.net/attachments/1438001402537447614/1468308210338234580/DiscordAnnouncerMC-Banner_3000_x_1000_.png?ex=69838c15&is=69823a95&hm=7eab030c047bd9bba5dc72697bea2be421c733a00aa637b1c8bc407d7ebabd4a&=&format=webp&quality=lossless&width=1872&height=624)

![Minecraft [Version](https://img.shields.io/badge/Minecraft-1.8.8%20--%201.21-green?style=for-the-badge&logo=minecraft)
![Java Version](https://img.shields.io/badge/Java-17%20%2F%2021-orange?style=for-the-badge&logo=openjdk)
![Platform](https://img.shields.io/badge/Platform-Spigot%20%2F%20Paper-gold?style=for-the-badge)
This is a lightweight, high-performance Minecraft plugin that instantly syncs Discord messages to in-game announcements and perfectly supports the Placeholder API.

---

## ✨ Key Features

* **Real-time Synchronization**: Achieves message delivery with sub-second latency via JDA (Java Discord API).
* **Variable Support**: Fully integrated with **Placeholder API**, enabling dynamic announcement messages.
* **High Efficiency and Stability**: Utilizes asynchronous message processing, ensuring no impact on server TPS.
* **Strong Compatibility**: Supports versions from the classic 1.8.8 to the latest Minecraft.
* **Shadow Dependencies**: All libraries (JDA, OkHttp) are encapsulated, preventing conflicts with other plugins.

---

## 🛠️ Installation Steps
1. **Download Plugin**: Place [DiscordAnnouncerMC-1.0.jar](https://www.spigotmc.org/resources/discordannouncermc.132339/) into the server's `plugins` folder.
2. **Obtain Token**: Go to the [Discord Developer Portal](https://discord.com/developers/applications) to create a bot and obtain a **Bot Token**.
3. **Initial Startup**: Restart the server to generate `config.yml`.
4. **Configuration File**:
* Open `config.yml` using an editor that supports **UTF-8** (such as VS Code).
* Enter your `Bot-Token` and `Channel-ID`.
5. **Startup**: Restart the server again.
6. **Command Usage**:
* Please install [DecentHolograms](https://www.spigotmc.org/resources/decentholograms-1-8-1-21-11-papi-support-no-dependencies.96927/)
* After restarting the server, go to your desired location and use `/hologram create discord_announcement %Discord_ann%` to set it up.
**Congratulations on completion!**
---
## ⚙️ Configuration file preview (config.yml)

```yaml
# DiscordAnnouncerMC core settings
bot:
token: "YOUR_DISCORD_BOT_TOKEN_HERE"
channel_id: "123456789012345678"
# In-game display format
# Support for text color codes (&) and PlaceholderAPI variables
format: "&b[Discord] &f%player_name%: &7%message%"
