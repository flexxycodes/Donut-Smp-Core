package dev.daniboy.donutcore.utils;

import java.util.HashMap;
import org.bukkit.profile.PlayerTextures;
import org.bukkit.inventory.meta.ItemMeta;
import java.net.MalformedURLException;
import java.net.URL;
import org.bukkit.Bukkit;
import java.util.UUID;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerProfile;
import java.util.Map;

public class UpperItemUtils
{
    private static Map<String, PlayerProfile> caching;
    
    public static ItemBuilder skullTexture(final ItemBuilder itemBuilder, final String s) {
        final SkullMeta itemMeta = (SkullMeta)itemBuilder.getItemMeta();
        PlayerProfile playerProfile;
        if (UpperItemUtils.caching.containsKey((Object)s)) {
            playerProfile = (PlayerProfile)UpperItemUtils.caching.get((Object)s);
        }
        else {
            playerProfile = Bukkit.createPlayerProfile(UUID.randomUUID());
            final PlayerTextures textures = playerProfile.getTextures();
            try {
                textures.setSkin(new URL(s));
            }
            catch (final MalformedURLException ex) {
                ex.printStackTrace();
            }
            playerProfile.setTextures(textures);
            playerProfile.isComplete();
            UpperItemUtils.caching.put((Object)s, (Object)playerProfile);
        }
        itemMeta.setOwnerProfile(playerProfile);
        itemBuilder.setItemMeta((ItemMeta)itemMeta);
        return itemBuilder;
    }
    
    static {
        UpperItemUtils.caching = (Map<String, PlayerProfile>)new HashMap();
    }
}
