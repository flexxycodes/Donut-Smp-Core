package dev.daniboy.donutcore.config;

import lombok.Generated;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.IOException;
import java.io.File;
import dev.daniboy.donutcore.DonutCore;
import java.util.Collections;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.utils.ActionBar;
import org.bukkit.entity.Player;
import dev.daniboy.donutcore.utils.Replaceable;
import dev.daniboy.donutcore.utils.Hex;
import java.util.Arrays;
import java.util.List;
import org.bukkit.configuration.file.FileConfiguration;

public enum MessagesConfig implements Config
{
    ONLYPLAYERS("only-players", new String[] { "Only players can use this command!" }), 
    PLAYERNOTFOUND("player-not-found", new String[] { "&cPlayer not found!" }), 
    NOPERMISSION("no-permission", new String[] { "&cYou don't have permission to use this command!" }), 
    MESSAGEENABLED("msg-enabled", new String[] { "&aYou've turned on private messages." }), 
    MESSAGEDISABLE("msg-disable", new String[] { "&cYou've turned off private messages." }), 
    NOMESSAGEREICIVED("no-msg-received", new String[] { "&cYou have no one to talk to." }), 
    MESSAGEDISABLED("msg-disabled", new String[] { "&cThat player has messaging disabled." }), 
    NIGHTVISIONENABLED("nightvision-enabled", new String[] { "&aNight vision enabled!" }), 
    NIGHTVISIONDISABLED("nightvision-disabled", new String[] { "&cNight vision disabled!" }), 
    INVALIDSPAWNNUMBER("invalid-spawn-number", new String[] { "&cInvalid Spawn number!" }), 
    PROVIDEAFKNUMBER("provide-afk-number", new String[] { "&cPlease provide a valid AFK number!" }), 
    PROVIDESPAWNNUMBER("provide-spawn-number", new String[] { "&cPlease provide a valid Spawn number!" }), 
    SPAWNPOINTSET("spawn-point-set", new String[] { "&aSpawn point set!" }), 
    AFKPOINTSET("afk-point-set", new String[] { "&aAFK point set!" }), 
    SPAWNNOTSET("spawn-not-set", new String[] { "&cSpawn location is not set!" }), 
    TELEPORTCOUNTDOWN("teleport-countdown", new String[] { "&7You will be teleported in #00C6F9%countdown% &7seconds" }), 
    TELEPORTING("teleporting-afk", new String[] { "&aTeleporting..." }), 
    TELEPORTCANCELLED("teleport-cancelled", new String[] { "&cTeleport cancelled!" }), 
    INVALIDBILLFORDITEMS("invalid-required-billford-items", new String[] { "&cYou do not have all the required contents." }), 
    BILLFORDTRADESUCCESS("billford-trade-success", new String[] { "&aTrade successful!" }), 
    CRITMULTIPLIERCOOLDOWN("crit-multiplier-cooldown", new String[] { "&cYou can use CritMultiplier again in %cooldown% seconds!" }), 
    STRENGHRODCOOLDOWN("strength-rod-cooldown", new String[] { "&cYou can use StrengthRod again in %cooldown% seconds!" }), 
    CRITMULTIPLER("crit-multiplier-actionbar", new String[] { "&cCritMultiplier Activated! %countdown% seconds left" }), 
    STRENGHRODACTIONBAR("strength-rod-actionbar", new String[] { "&cStrengthRod Activated! %countdown% seconds left" }), 
    CRITMULTIPLERACTIVE("crit-multiplier-active", new String[] { "&cCritMultiplier is already active!" }), 
    STRENGHRODACTIVE("strength-rod-active", new String[] { "&cStrengthRod is already active!" }), 
    NOBILLFORDITEMS("no-billford-items", new String[] { "&cNo items added to the trade!" }), 
    RELOAD("reload", new String[] { "&aPlugin reloaded!" }), 
    CANTMESSAGEYOURSELF("cant-message-yourself", new String[] { "&cYou can't message yourself!" }), 
    SAVINGCRITMULTIPLER("saving-crit-multiplier", new String[] { "&aCritMultiplier saved!" }), 
    SAVINGSRENGTHROD("saving-strength-rod", new String[] { "&aStrengthRod saved!" }), 
    SAVINGTRADEITEMS("saving-trade-item", new String[] { "&aItems saved!" }), 
    PAYMENTSUCCESS("payment-success", new String[] { "&7You payed #37BFF9%player% #00FC00$%amount%&7." }), 
    PAYMENTREICVED("payment_received", new String[] { "#37BFF9%player% &7payed you #00FC00$%amount%&7." }), 
    DONOTHAVEENOUGH("insufficient_funds", new String[] { "&cYou do not have enough money." }), 
    INVALIDAMOUNT("invalid_amount", new String[] { "&cPlease enter a valid amount." }), 
    PAYMENT_ENABLED("payment-enabled", new String[] { "&aYour payments are now enabled." }), 
    SPAWNLOCATIONSET("spawn-location-set", new String[] { "&aSpawn location set!" }), 
    PAYMENT_DISABLED("payment-disabled", new String[] { "&cYour payments are now disabled." }), 
    PAYMENT_DISABLED_OTHER("payment-disabled-other", new String[] { "&cPlayer has payments disabled!" }), 
    DISCORD("discord-message", new String[] { """
                                              &f
                                              #00c1fe\u1d0a\u1d0f\u026a\u0274 \u1d1b\u029c\u1d07 \u1d05\u1d0f\u0274\u1d1c\u1d1bs\u1d0d\u1d18 \u1d05\u026as\u1d04\u1d0f\u0280\u1d05 \u1d04\u1d0f\u1d0d\u1d0d\u1d1c\u0274\u026a\u1d1b\u028f!
                                              &#00c1fe\u25cf &f&ndiscord.gg/donutsmp
                                              &f""" }), 
    STORE("store-message", new String[] { """
                                          &f
                                          #00c1fe\u1d20\u026as\u026a\u1d1b \u1d1b\u029c\u1d07 \u1d05\u1d0f\u0274\u1d1c\u1d1bs\u1d0d\u1d18 s\u1d1b\u1d0f\u0280\u1d07
                                          #00c1fe\u25cf &f&nhttps://store.donutsmp.net
                                          &f""" }), 
    BALANCEMESSAGE("balance-message", new String[] { "#37BFF9%player% &7has #00FC00$%amount%." }), 
    SPAWNISFULL("spawn-is-full", new String[] { "&cAll spawn points are full!" });
    
    private static FileConfiguration config;
    private final String path;
    private List<String> message;
    
    private MessagesConfig(final String path, final String[] array) {
        this.path = path;
        this.message = (List<String>)Arrays.stream((Object[])array).toList();
    }
    
    public List<String> getMessage() {
        return Hex.hex(this.message);
    }
    
    public String getSingleMessage() {
        return (String)this.getMessage().get(0);
    }
    
    public String getSingleMessage(final String... array) {
        return (String)this.getMessage(array).get(0);
    }
    
    public List<String> getMessage(final String... array) {
        return Hex.hex(this.getMessage(), Replaceable.inst(array));
    }
    
    public void sendActionBar(final Player player) {
        final String singleMessage = this.getSingleMessage();
        if (singleMessage.isEmpty()) {
            return;
        }
        ActionBar.sendActionBar(player, singleMessage);
    }
    
    public void sendActionBar(final Player player, final String... array) {
        final String singleMessage = this.getSingleMessage(array);
        if (singleMessage.isEmpty()) {
            return;
        }
        ActionBar.sendActionBar(player, singleMessage);
    }
    
    public void send(final CommandSender commandSender) {
        final List<String> message = this.getMessage();
        if (message.isEmpty()) {
            return;
        }
        commandSender.sendMessage((String[])message.toArray(String[]::new));
    }
    
    public void send(final CommandSender commandSender, final String... array) {
        final List<String> message = this.getMessage(array);
        if (message.isEmpty()) {
            return;
        }
        commandSender.sendMessage((String[])message.toArray(String[]::new));
        this.sendActionBar((Player)commandSender, array);
    }
    
    public void load() {
        if (MessagesConfig.config.get(this.path) == null) {
            if (this.message.size() == 1) {
                MessagesConfig.config.set(this.path, this.message.get(0));
            }
            else {
                MessagesConfig.config.set(this.path, (Object)this.message);
            }
        }
        else if (MessagesConfig.config.get(this.path) instanceof List) {
            this.message = (List<String>)MessagesConfig.config.getStringList(this.path);
        }
        else {
            this.message = (List<String>)Collections.singletonList((Object)MessagesConfig.config.getString(this.path));
        }
    }
    
    public static void loadAll(final DonutCore donutCore) {
        final File dataFolder = donutCore.getDataFolder();
        if (!dataFolder.exists()) {
            dataFolder.mkdirs();
        }
        final File file = new File(dataFolder, "message.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        MessagesConfig.config = (FileConfiguration)YamlConfiguration.loadConfiguration(file);
        final MessagesConfig[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            values[i].load();
        }
        try {
            MessagesConfig.config.save(file);
        }
        catch (final IOException ex2) {
            ex2.printStackTrace();
        }
    }
    
    @Generated
    public static FileConfiguration getConfig() {
        return MessagesConfig.config;
    }
}
