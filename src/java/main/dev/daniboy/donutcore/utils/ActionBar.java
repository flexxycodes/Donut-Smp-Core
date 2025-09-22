package dev.daniboy.donutcore.utils;

import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.entity.Player;

public class ActionBar
{
    private static final String Builtbybit = "true";
    private static final String YourUserID = "435385";
    private static final String YourUsername = "FELEBOY";
    private static final String ResourceID = "45325";
    private static final String Version = "180909";
    private static final String TimeWhenDownloaded = "1742734770";
    private static final String idkwhattocallthis = "1a7a0449b3a5efe1fab86880a27c5029";
    
    public static void sendActionBar(final Player player, final String s) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(s));
    }
}
