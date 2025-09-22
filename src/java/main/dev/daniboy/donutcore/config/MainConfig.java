package dev.daniboy.donutcore.config;

import java.util.Arrays;
import java.util.List;

@ConfigClass("config.yml")
public class MainConfig implements Config
{
    @ConfigSection(value = "PluginSettings", comments = { " ", " ========================================", " Plugin Settings", " ========================================", " " })
    public static class PluginSettings
    {
        @ConfigValue(path = "License-key", comments = { "License Settings", "Please go on https://discord.gg/pikzstudios and open a ticket to get your license key!" }, inline = true)
        public static String LICENSE_KEY;
        @ConfigValue(path = "billford-reset-timer", comments = { "Billford Reset Timer", "The duration in seconds that the billford items have to switch" }, inline = true)
        public static int BILLFORD_RESET_TIMER;
        
        static {
            PluginSettings.LICENSE_KEY = "license key here";
            PluginSettings.BILLFORD_RESET_TIMER = 172800;
        }
    }
    
    @ConfigSection(value = "BillfordSettings", comments = { " ", " ========================================", " Billford Settings", " ========================================", " " })
    public static class BillfordSettings
    {
        @ConfigValue(path = "billford-interval", comments = { "The amount of time in seconds that billford trade choice has to change." }, inline = true)
        public static int BILLFORDINTERVAL;
        @ConfigValue(path = "billford-trade-choice", comments = { "The custom item that billford trade choice has to change.", "Currently there is only critmultiplier and strengthrod" }, inline = true)
        public static String BILLFORDTRADECHOICE;
        
        static {
            BillfordSettings.BILLFORDINTERVAL = 30;
            BillfordSettings.BILLFORDTRADECHOICE = "critmultiplier";
        }
    }
    
    @ConfigSection(value = "Features", comments = { " ", " ========================================", " Features Settings", " ========================================", " " })
    public static class Features
    {
        @ConfigValue(path = "rules", comments = { "Enable or disable rules feature" }, inline = true)
        public static boolean RULES;
        @ConfigValue(path = "help", comments = { "Enable or disable help feature" }, inline = true)
        public static boolean HELP;
        @ConfigValue(path = "media", comments = { "Enable or disable media feature" }, inline = true)
        public static boolean MEDIA;
        @ConfigValue(path = "nightvision", comments = { "Enable or disable night vision feature" }, inline = true)
        public static boolean NIGHTVISION;
        @ConfigValue(path = "spawn", comments = { "Enable or disable spawn feature" }, inline = true)
        public static boolean SPAWN;
        @ConfigValue(path = "afk", comments = { "Enable or disable AFK feature" }, inline = true)
        public static boolean AFK;
        @ConfigValue(path = "billford", comments = { "Enable or disable Billford feature" }, inline = true)
        public static boolean BILLFORD;
        @ConfigValue(path = "economy", comments = { "Enable or disable Economy feature" }, inline = true)
        public static boolean ECONOMY;
        
        static {
            Features.RULES = true;
            Features.HELP = true;
            Features.MEDIA = true;
            Features.NIGHTVISION = true;
            Features.SPAWN = true;
            Features.AFK = true;
            Features.BILLFORD = true;
            Features.ECONOMY = true;
        }
    }
    
    @ConfigSection(value = "Teleport", comments = { " ", " ========================================", " Teleport Settings", " ========================================", " " })
    public static class Teleport
    {
        @ConfigValue(path = "countdown-duration", comments = { "Duration of the teleport countdown in seconds" }, inline = true)
        public static int COUNTDOWN_DURATION;
        
        static {
            Teleport.COUNTDOWN_DURATION = 5;
        }
    }
    
    @ConfigSection(value = "Spawn", comments = { " ", " ========================================", " Spawn Settings", " ========================================", " " })
    public static class Spawn
    {
        @ConfigValue(path = "spawn_on_firstjoin", comments = { "Spawn on first join" }, inline = true)
        public static boolean ON_FIRSTJOIN;
        @ConfigValue(path = "spawn_on_death", comments = { "Spawn on death" }, inline = true)
        public static boolean ON_DEATH;
        
        static {
            Spawn.ON_FIRSTJOIN = false;
            Spawn.ON_DEATH = false;
        }
    }
    
    @ConfigSection(value = "double-jump", comments = { " ", " ========================================", " Double Jump Settings", " ========================================", " " })
    public static class DoubleJump
    {
        @ConfigValue(path = "jump-multiplier", comments = { "How much the jump must be multiplied by." }, inline = true)
        public static Double JUMP_MULTIPLIED;
        @ConfigValue(path = "double-jump-allowed-regions", comments = { "The regions double jump must work in." }, inline = true)
        public static List<String> ALLOWED_REGIONS;
        
        static {
            DoubleJump.JUMP_MULTIPLIED = 2.0;
            DoubleJump.ALLOWED_REGIONS = (List<String>)Arrays.asList((Object[])new String[] { "afk", "spawn" });
        }
    }
    
    @ConfigSection(value = "Chat", comments = { " ", " ========================================", " Chat Settings", " ========================================", " " })
    public static class Chat
    {
        @ConfigValue(path = "reply_format", comments = { "Format for reply messages" }, inline = true)
        public static String REPLY_FORMAT;
        @ConfigValue(path = "reply_sent", comments = { "Format for sent reply messages" }, inline = true)
        public static String REPLY_SENT;
        @ConfigValue(path = "msg_to_format", comments = { "Format for messages sent to another player" }, inline = true)
        public static String MSG_TO_FORMAT;
        @ConfigValue(path = "msg_from_format", comments = { "Format for messages received from another player" }, inline = true)
        public static String MSG_FROM_FORMAT;
        @ConfigValue(path = "msg_toggle_on", comments = { "Message when private messages are enabled" }, inline = true)
        public static String MSG_TOGGLE_ON;
        @ConfigValue(path = "msg_toggle_off", comments = { "Message when private messages are disabled" }, inline = true)
        public static String MSG_TOGGLE_OFF;
        
        static {
            Chat.REPLY_FORMAT = "#00C6F9YOU &7-> #00C6F9%receiver%: &f%message%";
            Chat.REPLY_SENT = "#00C6F9YOU &7-> #00C6F9%receiver%: &f%message%";
            Chat.MSG_TO_FORMAT = "#00C6F9YOU &7-> #00C6F9%receiver%: &f%message%";
            Chat.MSG_FROM_FORMAT = "#00C6F9%sender% &7-> #00C6F9YOU: &f%message%";
            Chat.MSG_TOGGLE_ON = "&aPrivate messages are now enabled.";
            Chat.MSG_TOGGLE_OFF = "&cPrivate messages are now disabled.";
        }
    }
    
    @ConfigSection(value = "SpawnAFK", comments = { " ", " ========================================", " Spawn AFK Settings", " ========================================", " " })
    public static class SpawnAFK
    {
        @ConfigValue(path = "new_donut_spawn_afk", comments = { "Enable or disable new donut spawn AFK" }, inline = true)
        public static boolean NEW_DONUT_SPAWN_AFK;
        
        static {
            SpawnAFK.NEW_DONUT_SPAWN_AFK = true;
        }
    }
}
