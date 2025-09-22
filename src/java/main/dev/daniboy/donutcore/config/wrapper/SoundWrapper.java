package dev.daniboy.donutcore.config.wrapper;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.Sound;

public class SoundWrapper
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
    private Sound sound;
    private int volume;
    private int pitch;
    
    public SoundWrapper(final Sound sound, final int volume, final int pitch) {
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
    }
    
    public void play(final Player player) {
        player.playSound(player.getLocation(), this.sound, (float)this.volume, (float)this.pitch);
    }
    
    public void play(final Location location) {
        location.getWorld().playSound(location, this.sound, (float)this.volume, (float)this.pitch);
    }
    
    public Sound getSound() {
        return this.sound;
    }
    
    public void setSound(final Sound sound) {
        this.sound = sound;
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(final int volume) {
        this.volume = volume;
    }
    
    public int getPitch() {
        return this.pitch;
    }
    
    public void setPitch(final int pitch) {
        this.pitch = pitch;
    }
}
