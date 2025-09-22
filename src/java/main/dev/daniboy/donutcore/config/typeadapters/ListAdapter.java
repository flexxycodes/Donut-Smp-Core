package dev.daniboy.donutcore.config.typeadapters;

import org.bukkit.configuration.ConfigurationSection;
import java.util.List;

public class ListAdapter<T> implements FieldAdapter
{
    @Override
    public boolean isInstance(final Object o) {
        return o instanceof List;
    }
    
    @Override
    public void setValue(final ConfigurationSection configurationSection, final String s, final Object o) {
        configurationSection.set(s, o);
    }
    
    @Override
    public Object getValue(final ConfigurationSection configurationSection, final String s) {
        return configurationSection.getList(s);
    }
}
