# 🤖 DiscordAnnouncerMC

![Banner](https://media.discordapp.net/attachments/1438001402537447614/1468308210338234580/DiscordAnnouncerMC-Banner_3000_x_1000_.png?ex=69838c15&is=69823a95&hm=7eab030c047bd9bba5dc72697bea2be421c733a00aa637b1c8bc407d7ebabd4a&=&format=webp&quality=lossless&width=1872&height=624)

![Minecraft Version](https://img.shields.io/badge/Minecraft-1.8.8%20--%201.21-green?style=for-the-badge&logo=minecraft)
![Java Version](https://img.shields.io/badge/Java-17%20%2F%2021-orange?style=for-the-badge&logo=openjdk)
![Platform](https://img.shields.io/badge/Platform-Spigot%20%2F%20Paper-gold?style=for-the-badge)

這是一款輕量化、高效能的 Minecraft 插件，能將 Discord 的訊息即時同步至遊戲內公告，並完美支援 PlaceholderAPI。

---

## ✨ 功能亮點

* **即時同步**：透過 JDA (Java Discord API) 實現秒級延遲的訊息傳遞。
* **變數支援**：完整整合 **PlaceholderAPI**，讓公告訊息動態化。
* **高效穩定**：採用異步處理訊息，絕不影響伺服器 TPS。
* **相容性強**：支援從經典的 1.8.8 到最新的 Minecraft 版本。
* **陰影依賴**：所有程式庫（JDA, OkHttp）皆已封裝，不與其他插件衝突。

---

## 🛠️ 安裝步驟

1.  **下載插件**：將 [DiscordAnnouncerMC-1.0.jar](https://www.spigotmc.org/resources/discordannouncermc.132339/) 放入伺服器的 `plugins` 資料夾
2.  **獲取 Token**：前往 [Discord Developer Portal](https://discord.com/developers/applications) 創建機器人並取得 **Bot Token**
3.  **初次啟動**：重啟伺服器以生成 `config.yml`
4.  **配置檔案**：
    * 使用支援 **UTF-8** 的編輯器（如 VS Code）打開 `config.yml`
    * 填入您的 `Bot-Token` 與 `Channel-ID`
5.  **正式運作**：再次重啟伺服器
6.  **指令使用**：
    * 請安裝 [DecentHolograms](https://www.spigotmc.org/resources/decentholograms-1-8-1-21-11-papi-support-no-dependencies.96927/)
    * 重啟伺服器後，到你想要的位置使用 `/hologram create discord_announcement %Discord_ann%` 設定
      **恭喜完成**

---

## ⚙️ 配置文件預覽 (config.yml)

```yaml
# DiscordAnnouncerMC 核心設定
bot:
  token: "YOUR_DISCORD_BOT_TOKEN_HERE"
  channel_id: "123456789012345678"

# 遊戲內顯示格式
# 支援文字顏色代碼 (&) 與 PlaceholderAPI 變數
format: "&b[Discord] &f%player_name%: &7%message%"
