package dev.daniboy.donutcore.utils;

import java.io.InputStream;
import org.bukkit.util.io.BukkitObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;
import java.io.OutputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import java.io.ByteArrayOutputStream;
import org.bukkit.inventory.ItemStack;

public class ItemStackSerializer
{
    public static String serializeItemStack(final ItemStack itemStack) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (final BukkitObjectOutputStream bukkitObjectOutputStream = new BukkitObjectOutputStream((OutputStream)byteArrayOutputStream)) {
            bukkitObjectOutputStream.writeObject((Object)itemStack);
        }
        return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
    }
    
    public static ItemStack deserializeItemStack(final String s) throws IOException, ClassNotFoundException {
        try (final BukkitObjectInputStream bukkitObjectInputStream = new BukkitObjectInputStream((InputStream)new ByteArrayInputStream(Base64.getDecoder().decode(s)))) {
            return (ItemStack)bukkitObjectInputStream.readObject();
        }
    }
}
