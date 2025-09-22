package dev.daniboy.donutcore.config.typeadapters;

import org.bukkit.configuration.ConfigurationSection;

public interface FieldAdapter
{
    boolean isInstance(final Object p0);
    
    void setValue(final ConfigurationSection p0, final String p1, final Object p2);
    
    Object getValue(final ConfigurationSection p0, final String p1);
}
