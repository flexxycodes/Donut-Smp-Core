package dev.daniboy.donutcore.config;

import org.bukkit.Sound;
import dev.daniboy.donutcore.config.wrapper.SoundWrapper;

@ConfigClass("sounds.yml")
public class SoundConfig implements Config
{
    @ConfigValue(path = "no-permission")
    public static SoundWrapper NOPERMISSION;
    @ConfigValue(path = "open-inventory")
    public static SoundWrapper OPENINVENTORY;
    @ConfigValue(path = "crit-multiplier-active")
    public static SoundWrapper CRITMULTIPLIERACTIVE;
    @ConfigValue(path = "strength-rod-active")
    public static SoundWrapper STRENGTHRODACTIVE;
    @ConfigValue(path = "critmultipler-cooldown")
    public static SoundWrapper CRITMULTIPLIERCOOLDOWN;
    @ConfigValue(path = "strength-rod-cooldown")
    public static SoundWrapper STRENGTHRODCOOLDOWN;
    @ConfigValue(path = "crit-multiplier-activated")
    public static SoundWrapper CRITMULTIPLIERACTIVATED;
    @ConfigValue(path = "strenth-rod-activated")
    public static SoundWrapper STRENGTHRODACTIVATED;
    @ConfigValue(path = "spawn-set")
    public static SoundWrapper SPAWNSET;
    @ConfigValue(path = "spawn-deleted")
    public static SoundWrapper SPAWNDELETED;
    @ConfigValue(path = "afk-deleted")
    public static SoundWrapper AFKDELETED;
    @ConfigValue(path = "afk-set")
    public static SoundWrapper AFKSET;
    @ConfigValue(path = "spawn-not-set")
    public static SoundWrapper SPAWNNOTSET;
    @ConfigValue(path = "afk-not-set")
    public static SoundWrapper AFKNOTSET;
    @ConfigValue(path = "teleport-countdown")
    public static SoundWrapper TELEPORTCOUNTDOWN;
    @ConfigValue(path = "teleport-complete")
    public static SoundWrapper TELEPORTCOMPLETE;
    @ConfigValue(path = "teleport-cancel")
    public static SoundWrapper TELEPORTCANCEL;
    @ConfigValue(path = "billford-trade-success")
    public static SoundWrapper TRADESUCCESS;
    @ConfigValue(path = "invalid-billford-items")
    public static SoundWrapper TRADEFAIL;
    
    static {
        SoundConfig.NOPERMISSION = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.OPENINVENTORY = new SoundWrapper(Sound.BLOCK_CHEST_OPEN, 1, 1);
        SoundConfig.CRITMULTIPLIERACTIVE = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.STRENGTHRODACTIVE = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.CRITMULTIPLIERCOOLDOWN = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.STRENGTHRODCOOLDOWN = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.CRITMULTIPLIERACTIVATED = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.STRENGTHRODACTIVATED = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.SPAWNSET = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.SPAWNDELETED = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.AFKDELETED = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.AFKSET = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.SPAWNNOTSET = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.AFKNOTSET = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.TELEPORTCOUNTDOWN = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.TELEPORTCOMPLETE = new SoundWrapper(Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
        SoundConfig.TELEPORTCANCEL = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
        SoundConfig.TRADESUCCESS = new SoundWrapper(Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        SoundConfig.TRADEFAIL = new SoundWrapper(Sound.ENTITY_VILLAGER_NO, 1, 1);
    }
}
