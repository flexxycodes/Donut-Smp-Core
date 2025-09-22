package dev.daniboy.donutcore.config.typeadapters;

import org.bukkit.configuration.ConfigurationSection;

public class LongAdapter implements FieldAdapter
{
    @Override
    public boolean isInstance(final Object o) {
        return o instanceof Long;
    }
    
    @Override
    public void setValue(final ConfigurationSection configurationSection, final String s, final Object o) {
        configurationSection.set(s, o);
    }
    
    @Override
    public Object getValue(final ConfigurationSection configurationSection, final String s) {
        return configurationSection.getLong(s);
    }
}
