package dev.daniboy.donutcore.utils;

import java.util.HashMap;
import com.google.gson.JsonParser;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.Color;
import org.bukkit.enchantments.Enchantment;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.net.http.HttpResponse;
import java.net.URI;
import java.time.Duration;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.util.concurrent.CompletableFuture;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;
import java.util.Map;
import org.bukkit.inventory.ItemStack;

public class ItemBuilder extends ItemStack
{
    private static final String YOUIDIOT = "true";
    private static final String YouAreVeryyyyyIDIOT = "435385";
    private static final String USerIsStupid = "FELEBOY";
    private static final String AreYouThatStupid = "45325";
    private static final String CmonManGetSomeBitches = "180909";
    private static final String WhatTimeIsIT = "1742734770";
    private static final String YOUIDIOT1 = "true";
    private static final String YouAreVeryyyyyIDIOT2 = "435385";
    private static final String USerIsStupid3 = "FELEBOY";
    private static final String AreYouThatStupid4 = "45325";
    private static final String CmonManGetSomeBitches5 = "180909";
    private static final String WhatTimeIsIT6 = "1742734770";
    private static boolean isLegacy;
    private static Map<String, String> cached;
    
    public static void initItemBuilder() {
        try {
            Class.forName("org.bukkit.profile.PlayerTextures");
        }
        catch (final Exception ex) {
            ItemBuilder.isLegacy = true;
        }
    }
    
    public ItemBuilder(final Material material) {
        super(material);
    }
    
    public ItemBuilder(final Material material, final short n) {
        super(material, 1, n);
    }
    
    public ItemBuilder(final ItemStack itemStack) {
        super(itemStack);
    }
    
    public ItemBuilder amount(final int amount) {
        this.setAmount(amount);
        return this;
    }
    
    public ItemBuilder name(final String displayName) {
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setDisplayName(displayName);
        this.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder skullOwnerProper(final String s) {
        if (ItemBuilder.cached.containsKey((Object)s) && ((String)ItemBuilder.cached.get((Object)s)).equals((Object)"NONE")) {
            return this;
        }
        if (ItemBuilder.cached.containsKey((Object)s)) {
            UpperItemUtils.skullTexture(this, (String)ItemBuilder.cached.get((Object)s));
        }
        else {
            getSkinURL(s).thenAccept(s2 -> {
                if (s2 != null) {
                    ItemBuilder.cached.put((Object)s, (Object)s2);
                    UpperItemUtils.skullTexture(this, s2);
                }
                else {
                    ItemBuilder.cached.put((Object)s, (Object)"NONE");
                }
            });
        }
        return this;
    }
    
    private static CompletableFuture<String> getSkinURL(final String s) {
        return (CompletableFuture<String>)HttpClient.newHttpClient().sendAsync(HttpRequest.newBuilder().GET().version(HttpClient.Version.HTTP_2).timeout(Duration.ofSeconds(10L)).uri(URI.create("https://api.ashcon.app/mojang/v2/user/" + s)).build(), HttpResponse.BodyHandlers.ofString()).thenApply(httpResponse -> {
            if (httpResponse.statusCode() != 200) {
                return null;
            }
            return JsonParser.parseString((String)httpResponse.body()).getAsJsonObject().getAsJsonObject("textures").getAsJsonObject("skin").get("url").getAsString();
        }).exceptionally(t -> {
            Bukkit.getLogger().warning("Failed to get skin url for " + s + " " + t.getMessage());
            return null;
        });
    }
    
    public ItemStack build() {
        return this;
    }
    
    public ItemBuilder lore(final String... array) {
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setLore(Arrays.asList((Object[])array.clone()));
        this.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder appendLore(final List<String> list) {
        return this.appendLore((String[])list.toArray(String[]::new));
    }
    
    public ItemBuilder appendLore(final String... array) {
        final ItemMeta itemMeta = this.getItemMeta();
        if (!this.hasItemMeta() || !itemMeta.hasLore()) {
            itemMeta.setLore(Arrays.asList((Object[])array));
            this.setItemMeta(itemMeta);
            return this;
        }
        final ArrayList lore = new ArrayList((Collection)itemMeta.getLore());
        for (int length = array.length, i = 0; i < length; ++i) {
            ((List)lore).add((Object)array[i]);
        }
        itemMeta.setLore((List)lore);
        this.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder lore(final List<String> lore) {
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setLore((List)lore);
        this.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder durability(final int n) {
        this.setDurability((short)n);
        return this;
    }
    
    public ItemBuilder enchantment(final Enchantment enchantment, final int n) {
        this.addUnsafeEnchantment(enchantment, n);
        return this;
    }
    
    public ItemBuilder enchantment(final Enchantment enchantment) {
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.addEnchant(enchantment, 1, true);
        this.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder type(final Material type) {
        this.setType(type);
        return this;
    }
    
    public ItemBuilder clearLore() {
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setLore((List)new ArrayList());
        this.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder clearEnchantments() {
        this.getEnchantments().keySet().forEach(this::removeEnchantment);
        return this;
    }
    
    public ItemBuilder color(final Color color) {
        if (this.getType() == Material.LEATHER_BOOTS || this.getType() == Material.LEATHER_CHESTPLATE || this.getType() == Material.LEATHER_HELMET || this.getType() == Material.LEATHER_LEGGINGS) {
            final LeatherArmorMeta itemMeta = (LeatherArmorMeta)this.getItemMeta();
            itemMeta.setColor(color);
            this.setItemMeta((ItemMeta)itemMeta);
            return this;
        }
        throw new IllegalArgumentException("color() only applicable for leather armor!");
    }
    
    public ItemBuilder itemflag(final ItemFlag... array) {
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.addItemFlags(array);
        this.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder customModelData(final int n) {
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setCustomModelData(Integer.valueOf(n));
        this.setItemMeta(itemMeta);
        return this;
    }
    
    static {
        ItemBuilder.isLegacy = false;
        ItemBuilder.cached = (Map<String, String>)new HashMap();
    }
}
