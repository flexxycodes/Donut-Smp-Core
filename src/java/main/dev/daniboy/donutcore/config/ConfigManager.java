package dev.daniboy.donutcore.config;

import lombok.Generated;
import java.util.Iterator;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Collection;
import java.util.Arrays;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import dev.daniboy.donutcore.config.typeadapters.LongAdapter;
import dev.daniboy.donutcore.config.typeadapters.StringAdapter;
import dev.daniboy.donutcore.config.typeadapters.ListAdapter;
import dev.daniboy.donutcore.config.typeadapters.IntegerAdapter;
import dev.daniboy.donutcore.config.typeadapters.DoubleAdapter;
import dev.daniboy.donutcore.config.typeadapters.BooleanAdapter;
import java.util.concurrent.ConcurrentHashMap;
import dev.daniboy.donutcore.config.typeadapters.FieldAdapter;
import java.util.List;
import org.bukkit.configuration.file.FileConfiguration;
import java.util.Map;
import dev.daniboy.donutcore.DonutCore;

public class ConfigManager
{
    private final DonutCore plugin;
    private Map<String, FileConfiguration> configMap;
    private List<FieldAdapter> adapters;
    private List<Class<? extends Config>> configs;
    
    public ConfigManager(final DonutCore plugin) {
        this.configMap = (Map<String, FileConfiguration>)new ConcurrentHashMap();
        this.adapters = (List<FieldAdapter>)Lists.newArrayList((Object[])new FieldAdapter[] { new BooleanAdapter(), new DoubleAdapter(), new IntegerAdapter(), new ListAdapter<Object>(), new StringAdapter(), new LongAdapter() });
        this.configs = (List<Class<? extends Config>>)new ArrayList();
        this.plugin = plugin;
    }
    
    public void reload() {
        this.configs.forEach(this::initReflectConfig);
    }
    
    public void register(final Class<? extends Config> clazz) {
        this.configs.add((Object)clazz);
        this.initReflectConfig(clazz);
    }
    
    private void initReflectConfig(final Class<? extends Config> clazz) {
        final String value = clazz.getAnnotation(ConfigClass.class).value();
        final File file = new File(this.plugin.getDataFolder().toURI());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (value.contains((CharSequence)"/")) {
            final File file2 = new File(this.plugin.getDataFolder(), value.split("/")[0]);
            if (!file2.exists()) {
                file2.mkdirs();
            }
        }
        final File file3 = new File(this.plugin.getDataFolder(), value);
        if (!file3.exists()) {
            try {
                file3.createNewFile();
            }
            catch (final IOException ex) {
                throw new RuntimeException((Throwable)ex);
            }
        }
        final YamlConfiguration loadConfiguration = YamlConfiguration.loadConfiguration(file3);
        this.analyzeFields(value, clazz, (ConfigurationSection)loadConfiguration);
        final ArrayList list = new ArrayList((Collection)Arrays.stream((Object[])clazz.getDeclaredClasses()).toList());
        Collections.reverse((List)list);
        for (final Class clazz2 : (Class[])((List)list).toArray((Object[])new Class[0])) {
            final ConfigSection configSection = clazz2.getAnnotation(ConfigSection.class);
            if (configSection != null) {
                final ConfigurationSection configurationSection = (((FileConfiguration)loadConfiguration).get(configSection.value()) == null) ? ((FileConfiguration)loadConfiguration).createSection(configSection.value()) : ((FileConfiguration)loadConfiguration).getConfigurationSection(configSection.value());
                final String[] comments = configSection.comments();
                if (comments.length != 0) {
                    ((FileConfiguration)loadConfiguration).setComments(configSection.value(), Arrays.stream((Object[])comments).toList());
                }
                this.analyzeFields(value, clazz2, configurationSection);
            }
        }
        try {
            ((FileConfiguration)loadConfiguration).save(file3);
        }
        catch (final IOException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public void analyzeFields(final String s, final Class clazz, final ConfigurationSection configurationSection) {
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (int length = declaredFields.length, i = 0; i < length; ++i) {
            final Field field = declaredFields[i];
            field.setAccessible(true);
            field.getType();
            Object value;
            try {
                value = field.get((Object)null);
            }
            catch (final IllegalAccessException ex) {
                throw new RuntimeException((Throwable)ex);
            }
            if (value == null) {
                System.out.println("ERROR WHILE PARSING THE " + s + ".yml CLASS");
            }
            else {
                final ConfigValue configValue = (ConfigValue)field.getAnnotation((Class)ConfigValue.class);
                Object[] array = null;
                boolean inline = false;
                String s3;
                if (configValue == null) {
                    final StringBuilder sb = new StringBuilder();
                    for (final String s2 : field.getName().split("_")) {
                        sb.append(Character.toUpperCase(s2.charAt(0))).append(s2.substring(1).toLowerCase());
                    }
                    s3 = sb.toString();
                }
                else {
                    inline = configValue.inline();
                    s3 = configValue.path();
                    array = (Object[])((configValue.comments().length == 0) ? null : configValue.comments());
                }
                if (configurationSection.get(s3) == null) {
                    for (final FieldAdapter fieldAdapter : this.adapters) {
                        if (fieldAdapter.isInstance(value)) {
                            fieldAdapter.setValue(configurationSection, s3, value);
                            break;
                        }
                    }
                }
                else {
                    for (final FieldAdapter fieldAdapter2 : this.adapters) {
                        if (fieldAdapter2.isInstance(value)) {
                            try {
                                field.set((Object)null, fieldAdapter2.getValue(configurationSection, s3));
                                break;
                            }
                            catch (final IllegalAccessException ex2) {
                                throw new RuntimeException((Throwable)ex2);
                            }
                        }
                    }
                }
                if (array != null) {
                    if (inline) {
                        configurationSection.setInlineComments(s3, Arrays.stream(array).toList());
                    }
                    else {
                        configurationSection.setComments(s3, Arrays.stream(array).toList());
                    }
                }
            }
        }
    }
    
    @Generated
    public Map<String, FileConfiguration> getConfigMap() {
        return this.configMap;
    }
}
