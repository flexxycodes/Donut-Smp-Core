package dev.daniboy.donutcore.listener;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldguard.WorldGuard;
import org.bukkit.event.player.PlayerRespawnEvent;
import java.util.Iterator;
import java.util.Map;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.plugin.Plugin;
import org.bukkit.Location;
import org.bukkit.event.EventPriority;
import dev.daniboy.donutcore.config.MainConfig;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryCloseEvent;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.gui.impl.SpawnGUI;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.event.Listener;

public class PlayerListener implements Listener
{
    private final DonutCore plugin;
    private final SpawnGUI spawnGUI;
    private final SQLiteManager sqLiteManager;
    private static int WyyHu8EqkF = 0;
    private transient int 6o9XbmDlpF = 1982864312;
    private static byte[] fwablzzmpp;
    private static String[] nothing_to_see_here;
    
    public PlayerListener(final DonutCore plugin, final SpawnGUI spawnGUI, final SQLiteManager sqLiteManager, final int n) {
        final int n2 = 0x51947C97 ^ 0x3F241373;
        hexptuzeegejvbte(n2, 891817762);
        int n3 = 0x4BB3396F ^ (0x5A48D5C2 ^ (Integer.parseInt("1435864693") ^ n));
    Label_0114:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                case 2112746173: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 1286793633: {
                    break Label_0114;
                }
                case 24600807: {
                    n3 ^= 0x1D9DDEF0;
                    break Label_0114;
                }
            }
        }
        this.plugin = plugin;
        this.spawnGUI = spawnGUI;
        this.sqLiteManager = sqLiteManager;
    }
    
    @EventHandler
    public void onInventoryClose(final InventoryCloseEvent inventoryCloseEvent) {
        final int n = 0x4021BF48 ^ (0x6879C75D ^ (0x94B07D1 ^ this.6o9XbmDlpF));
        final Player player = Bukkit.getPlayer(inventoryCloseEvent.getPlayer().getUniqueId());
        final int n2 = 0x536C96A6 ^ n;
        if (player != null) {
            this.plugin.clean$2056612436(player, 350447023);
        }
        else if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte(n2, 595136486)) != 194178048) {
            throw new RuntimeException();
        }
    }
    
    @EventHandler
    public void onQuit(final PlayerQuitEvent playerQuitEvent) {
        final int n = 0x34F28F27 ^ (0x5A34B81D ^ (0x1B8699BB ^ this.6o9XbmDlpF));
        this.plugin.clean$2056612436(playerQuitEvent.getPlayer(), 350447023);
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(final PlayerJoinEvent playerJoinEvent) {
        final int n = 0x1CB87ACD ^ (0x39FA782C ^ (0x286DF76B ^ this.6o9XbmDlpF));
        final Player player = playerJoinEvent.getPlayer();
        final int n2 = 0x1CE90C9A ^ n;
        Label_0111: {
            if ((player.hasPlayedBefore() ? 1 : 0) == (0x184DD71F ^ n2)) {
                final int n3 = 0x227C842B ^ n2;
                if ((MainConfig.Spawn.ON_FIRSTJOIN ? 1 : 0) != (0x3A315334 ^ n3)) {
                    this.teleportToSpawn$423737497(player, 1990303607);
                }
                else {
                    final int n4 = 0x381F858C ^ n3;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 34335586) {
                        throw new IOException();
                    }
                Label_0272:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 864060533: {
                                break Label_0111;
                            }
                            case 2041573260: {
                                continue;
                            }
                            case 34335586: {
                                break Label_0272;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
            }
            else {
                final int n5 = 0x28FFFC9B ^ n2;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 240715005) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                            case 1115430869: {
                                continue;
                            }
                            case 240715005: {}
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
                else {
                    hexptuzeegejvbte(n5, 340055966);
                }
            }
        }
    }
    
    private void teleportToSpawn$423737497(final Player player, final int n) {
        final int n2 = 0x70F14B0 ^ (0x245336C1 ^ (0x177C3742 ^ (this.6o9XbmDlpF ^ n)));
        final Map<Integer, Location> spawnNumber$1518350224 = this.sqLiteManager.getSpawnNumber$1518350224();
        final int n3 = 0x2D38CF97 ^ n2;
        if (spawnNumber$1518350224 != null) {
            int n4 = 0x2C683B04 ^ n3;
            if ((spawnNumber$1518350224.isEmpty() ? 1 : 0) == (0x4A5A50D8 ^ n4)) {
                Label_0259: {
                Label_0252:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 1135241230: {
                                continue;
                            }
                            case 964344: {
                                break Label_0252;
                            }
                            case 524425196: {
                                break Label_0259;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n4 ^= 0x44825FDE;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 214078403) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 91959754: {
                                continue;
                            }
                            case 214078403: {}
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
                else {
                    Label_0379: {
                    Label_0372:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                                case 1166207076: {
                                    continue;
                                }
                                case 214078403: {
                                    break Label_0372;
                                }
                                case 734603746: {
                                    break Label_0379;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        n4 ^= 0x76FF8469;
                    }
                    final Iterator iterator = spawnNumber$1518350224.values().iterator();
                    int hexptuzeegejvbte = 0x5298BA93 ^ n4;
                Label_0412:
                    while ((iterator.hasNext() ? 1 : 0) != (0x2ABF31FC ^ hexptuzeegejvbte)) {
                        final int n5 = 0x32C55AC2 ^ hexptuzeegejvbte;
                        final Location location = (Location)iterator.next();
                        final int n6 = 0x38950A58 ^ n5;
                        if ((this.isSpawnFull$339080362(location, 220528071) ? 1 : 0) == (0x20EF6166 ^ n6)) {
                            Bukkit.getScheduler().runTaskLater((Plugin)this.plugin, () -> {
                                final int n = 0x6DB2B94F ^ (0x735A57C2 ^ (0x6C01B5D7 ^ PlayerListener.WyyHu8EqkF));
                                player.teleport(location);
                            }, 3L);
                            return;
                        }
                        final int n7 = 0x7FFE8A6A ^ n6;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 137554038) {
                            throw new IOException();
                        }
                        int hexptuzeegejvbte2 = hexptuzeegejvbte(n7, 327476805);
                        Label_0656: {
                        Label_0648:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte2)) {
                                    case 901423860: {
                                        continue;
                                    }
                                    case 73434408: {
                                        break Label_0648;
                                    }
                                    case 1614454876: {
                                        break Label_0656;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            hexptuzeegejvbte2 ^= 0x3E39004;
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte2) != 167092147) {
                                    throw null;
                                }
                                throw new IOException();
                            }
                            catch (final IOException ex) {
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(hexptuzeegejvbte2)) {
                                    case 2075454058: {
                                        hexptuzeegejvbte = (0x7469AE9D ^ hexptuzeegejvbte2);
                                        break;
                                    }
                                    case -390896127: {
                                        hexptuzeegejvbte = hexptuzeegejvbte(hexptuzeegejvbte2, 101277456);
                                        break;
                                    }
                                    default: {
                                        throw new RuntimeException("Error in hash");
                                    }
                                }
                            Label_0776:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte)) {
                                        case 1331913550: {
                                            continue Label_0412;
                                        }
                                        case 337579148: {
                                            continue;
                                        }
                                        case 42749820: {
                                            break Label_0776;
                                        }
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                                hexptuzeegejvbte ^= 0x11A0022C;
                                continue;
                            }
                        }
                        break;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(0x34CD013E ^ hexptuzeegejvbte) != 184360965) {
                        throw new IOException();
                    }
                    MessagesConfig.SPAWNISFULL.send((CommandSender)player);
                    return;
                }
            }
        }
        else {
            final int n8 = 0x6DFA2A4A ^ n3;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 114554074) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                        case 865653365: {
                            continue;
                        }
                        case 114554074: {}
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
        }
        MessagesConfig.SPAWNNOTSET.send((CommandSender)player);
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerRespawn(final PlayerRespawnEvent playerRespawnEvent) {
        final int n = 0x2B547A1 ^ (0x7DF1E37D ^ (0x4FD5877C ^ this.6o9XbmDlpF));
        if ((MainConfig.Spawn.ON_DEATH ? 1 : 0) != (0x391A0DAF ^ n)) {
            final int n2 = 0x307C82EF ^ n;
            final Player player = playerRespawnEvent.getPlayer();
            final int n3 = 0x629F0388 ^ n2;
            final Location respawnLocationForPlayer$982970030 = this.getRespawnLocationForPlayer$982970030(player, 766339543);
            int n4 = 0x2D0DDF48 ^ n3;
            if (respawnLocationForPlayer$982970030 != null) {
                playerRespawnEvent.setRespawnLocation(respawnLocationForPlayer$982970030);
                Bukkit.getScheduler().runTaskLater((Plugin)this.plugin, () -> {
                    final int n = 0x776DD23E ^ (0xE3E98FF ^ (0x15FE2EAC ^ PlayerListener.WyyHu8EqkF));
                    player.teleport(respawnLocationForPlayer$982970030);
                }, 3L);
            }
            else {
                Label_0252: {
                Label_0244:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 810272159: {
                                continue;
                            }
                            case 158934844: {
                                break Label_0244;
                            }
                            case 1844088128: {
                                break Label_0252;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n4 ^= 0x26D22640;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 172680194) {
                    hexptuzeegejvbte(n4, 642304321);
                    throw new IOException();
                }
            }
        }
        else {
            final int n5 = 0x4E227BF9 ^ n;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 117248638) {
                hexptuzeegejvbte(n5, 827771607);
                throw new IOException();
            }
            hexptuzeegejvbte(n5, 1374221768);
        }
    }
    
    private Location getRespawnLocationForPlayer$982970030(final Player player, final int n) {
        final int n2 = 0x3C088A5C ^ (0x24C1CA1A ^ (0x72FD16BF ^ (this.6o9XbmDlpF ^ n)));
        final Map<Integer, Location> spawnNumber$1518350224 = this.sqLiteManager.getSpawnNumber$1518350224();
        final int n3 = 0x3D261907 ^ n2;
        if (spawnNumber$1518350224 != null) {
            final int n4 = 0xA52A7F6 ^ n3;
            if ((spawnNumber$1518350224.isEmpty() ? 1 : 0) == (0x7966AFD0 ^ n4)) {
                int n5 = 0x6C6E3B75 ^ n4;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 146836215) {
                    hexptuzeegejvbte(n5, 1647822536);
                    throw new RuntimeException();
                }
                Label_0196: {
                Label_0188:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                            case 15247262: {
                                continue;
                            }
                            case 146836215: {
                                break Label_0188;
                            }
                            case 2087246938: {
                                break Label_0196;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    n5 ^= 0x2E9BF47F;
                }
                final Iterator iterator = spawnNumber$1518350224.values().iterator();
                int n6 = 0x2EE1A26E ^ n5;
                while ((iterator.hasNext() ? 1 : 0) != (0x1572C2B4 ^ n6)) {
                    final int n7 = 0x1A2B5557 ^ n6;
                    final Location location = (Location)iterator.next();
                    final int n8 = 0x68DAC2D6 ^ n7;
                    if ((this.isSpawnFull$339080362(location, 220528071) ? 1 : 0) == (0x67835535 ^ n8)) {
                        return location;
                    }
                    final int n9 = 0x72FF6A6F ^ n8;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) == 161525698) {
                        int hexptuzeegejvbte = hexptuzeegejvbte(n9, 533703837);
                        Label_0424: {
                        Label_0416:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte)) {
                                    case 1474160580: {
                                        continue;
                                    }
                                    case 79422690: {
                                        break Label_0416;
                                    }
                                    case 312501207: {
                                        break Label_0424;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            hexptuzeegejvbte ^= 0x2165002A;
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte) != 82810189) {
                                    throw null;
                                }
                                throw new IllegalAccessException();
                            }
                            catch (final IllegalAccessException ex) {
                                int hexptuzeegejvbte2 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(hexptuzeegejvbte)) {
                                    case 1588895593: {
                                        hexptuzeegejvbte2 = hexptuzeegejvbte(hexptuzeegejvbte, 175506781);
                                        break;
                                    }
                                    case -630884045: {
                                        hexptuzeegejvbte2 = (0x5AEC3996 ^ hexptuzeegejvbte);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                }
                                n6 = (0x34D25404 ^ hexptuzeegejvbte2);
                                continue;
                            }
                        }
                        throw new RuntimeException();
                    }
                    throw new RuntimeException();
                }
                final int n10 = 0x3668AA9C ^ n6;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10) == 67308247) {
                    hexptuzeegejvbte(n10, 1292084353);
                    return null;
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                        case 1078754970: {
                            continue;
                        }
                        case 67308247: {}
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
        else if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(0x718BDFB0 ^ n3) != 43243683) {
            throw new RuntimeException();
        }
        return null;
    }
    
    private boolean isSpawnFull$339080362(final Location location, final int n) {
        final int n2 = 0x34F3B836 ^ (0x30749469 ^ (0x6A391AC3 ^ (this.6o9XbmDlpF ^ n)));
        final RegionContainer regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
        final int n3 = 0x7F56F304 ^ n2;
        final RegionManager value = regionContainer.get(BukkitAdapter.adapt(location.getWorld()));
        final int n4 = 0x6A306523 ^ n3;
        if (value == null) {
            return (byte)(0x65D3ED50 ^ (0x1AA49E23 ^ n4)) != 0;
        }
        final int hexptuzeegejvbte = hexptuzeegejvbte(n4, 100671843);
        Label_1474: {
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte) != 190273416) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte)) {
                        case 1396569565: {
                            continue;
                        }
                        case 190273416: {}
                        default: {
                            break Label_1474;
                        }
                    }
                }
            }
            else {
                final int hexptuzeegejvbte2 = hexptuzeegejvbte(hexptuzeegejvbte, 888353484);
                int n5 = (byte)(0x4D8460DC ^ hexptuzeegejvbte2);
                final int n6 = 0x2BEB8221 ^ hexptuzeegejvbte2;
                final Iterator iterator = value.getApplicableRegions(BukkitAdapter.asBlockVector(location)).iterator();
                int hexptuzeegejvbte3 = 0x2006BAC0 ^ n6;
            Label_0808_Outer:
                while ((iterator.hasNext() ? 1 : 0) != (0x4669583D ^ hexptuzeegejvbte3)) {
                    final int n7 = 0x241CC808 ^ hexptuzeegejvbte3;
                    final ProtectedRegion protectedRegion = (ProtectedRegion)iterator.next();
                    final int n8 = 0x13AA3A41 ^ n7;
                    final Iterator iterator2 = Bukkit.getOnlinePlayers().iterator();
                    int n9 = 0x1CB9B513 ^ n8;
                    while ((iterator2.hasNext() ? 1 : 0) != (0x6D661F67 ^ n9)) {
                        final int n10 = 0x52914113 ^ n9;
                        final Player player = (Player)iterator2.next();
                        int n11 = 0x3CA92B69 ^ n10;
                        int n13;
                        if ((protectedRegion.contains(BukkitAdapter.asBlockVector(player.getLocation())) ? 1 : 0) != (0x35E751D ^ n11)) {
                            final int n12 = 0x17B0769D ^ n11;
                            n5 += (0x14EE0381 ^ n12);
                            n13 = (0x213035DE ^ n12);
                        }
                        else {
                            Label_0564: {
                            Label_0556:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11)) {
                                        case 2056459887: {
                                            continue Label_0808_Outer;
                                        }
                                        case 52989589: {
                                            break Label_0556;
                                        }
                                        case 456580219: {
                                            break Label_0564;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                n11 ^= 0xA640C1A;
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11) != 31540039) {
                                throw new RuntimeException();
                            }
                            n13 = (0x3CE44F59 ^ n11);
                        }
                        final int hexptuzeegejvbte4 = hexptuzeegejvbte(n13, 1543456184);
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(hexptuzeegejvbte4) != 90226348) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        }
                        catch (final IllegalAccessException ex) {
                            int n14 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(hexptuzeegejvbte4)) {
                                case 1896587059: {
                                    n14 = (0x7C09D61C ^ hexptuzeegejvbte4);
                                    break;
                                }
                                case 1440820537: {
                                    n14 = (0x3894805D ^ hexptuzeegejvbte4);
                                    break;
                                }
                                default: {
                                    throw new IOException("Error in hash");
                                }
                            }
                            n9 = (0x7F4EBA9D ^ n14);
                            continue Label_0808_Outer;
                        }
                        break;
                    }
                    Label_0740: {
                    Label_0732:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                case 904412127: {
                                    continue Label_0808_Outer;
                                }
                                case 66433457: {
                                    break Label_0732;
                                }
                                case 101338581: {
                                    break Label_0740;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        n9 ^= 0x2EA0E608;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 55689345) {
                        hexptuzeegejvbte(n9, 1481584691);
                        throw new RuntimeException();
                    }
                Label_0808:
                    while (true) {
                        Label_0800: {
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                    case 942877124: {
                                        continue Label_0808_Outer;
                                    }
                                    case 55689345: {
                                        break Label_0800;
                                    }
                                    case 1515940694: {
                                        break Label_0808;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            Label_0864: {
                            Label_0856:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                        case 1643140027: {
                                            continue Label_0808_Outer;
                                        }
                                        case 117923425: {
                                            break Label_0856;
                                        }
                                        case 589303920: {
                                            break Label_0864;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                n9 ^= 0x16DA9941;
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 80532129) {
                                        throw null;
                                    }
                                    throw new RuntimeException();
                                }
                                catch (final RuntimeException ex2) {
                                    int n15 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n9)) {
                                        case 255610379: {
                                            n15 = (0x62B119FE ^ n9);
                                            break;
                                        }
                                        case 1440904216: {
                                            n15 = (0x9EADEBC ^ n9);
                                            break;
                                        }
                                        default: {
                                            throw new IllegalAccessException("Error in hash");
                                        }
                                    }
                                    hexptuzeegejvbte3 = hexptuzeegejvbte(n15, 1161807874);
                                    continue Label_0808_Outer;
                                }
                            }
                            break;
                        }
                        n9 ^= 0x5FA02EAD;
                        continue Label_0808;
                    }
                }
                final int n16 = 0x5714EAAD ^ hexptuzeegejvbte3;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16) == 31692938) {
                    final int hexptuzeegejvbte5 = hexptuzeegejvbte(n16, 1729784316);
                    final int int1 = this.plugin.getafkSpawnGuiConfig$23715181(125321510).getInt(pkyoclpqtm(rlcabcpfpdrrjer(), hexptuzeegejvbte5));
                    int n17 = 0x4AE06B58 ^ hexptuzeegejvbte5;
                    if (n5 >= int1) {
                        int n18 = 0x400E7F50 ^ n17;
                        final byte b = (byte)(0x7C89CF65 ^ n18);
                        Label_1120: {
                        Label_1112:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n18)) {
                                    case 951406487: {
                                        continue;
                                    }
                                    case 21724504: {
                                        break Label_1112;
                                    }
                                    case 853397725: {
                                        break Label_1120;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            n18 ^= 0x11480912;
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n18) != 78060869) {
                                    throw null;
                                }
                                throw new IllegalAccessException();
                            }
                            catch (final IllegalAccessException ex3) {
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n18)) {
                                    case 1846424499: {
                                        hexptuzeegejvbte(n18, 2051385570);
                                        break;
                                    }
                                    case -961003406: {
                                        hexptuzeegejvbte(n18, 1330865818);
                                        break;
                                    }
                                    default: {
                                        throw new RuntimeException("Error in hash");
                                    }
                                }
                                return b != 0;
                            }
                        }
                    }
                    Label_1272: {
                    Label_1264:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                case 205613099: {
                                    continue;
                                }
                                case 88529379: {
                                    break Label_1264;
                                }
                                case 1274656811: {
                                    break Label_1272;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        n17 ^= 0x301CFBA0;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 141356789) {
                        hexptuzeegejvbte(n17, 387089096);
                        throw new RuntimeException();
                    }
                Label_1344:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                            case 2126591678: {
                                continue;
                            }
                            case 141356789: {
                                break Label_1344;
                            }
                            case 840945693: {
                                return (byte)(0x32CE5D32 ^ n17) != 0;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    n17 ^= 0x3E5516A6;
                    final byte b = (byte)(0x32CE5D32 ^ n17);
                    return b != 0;
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16)) {
                        case 886099150: {
                            continue;
                        }
                        case 31692938: {}
                        default: {
                            break Label_1474;
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }
    
    static {
        (PlayerListener.nothing_to_see_here = new String[15])[0] = "\u2804\u2804\u2804\u28b0\u28e7\u28fc\u28ef\u2804\u28f8\u28e0\u28f6\u28f6\u28e6\u28fe\u2804\u2804\u2804\u2804\u2840\u2804\u2880\u28ff\u28ff\u2804\u2804\u2804\u28b8\u2847\u2804\u2804";
        PlayerListener.nothing_to_see_here[1] = "\u2804\u2804\u2804\u28fe\u28ff\u283f\u283f\u2836\u283f\u28bf\u28ff\u28ff\u28ff\u28ff\u28e6\u28e4\u28c4\u2880\u2845\u28a0\u28fe\u28db\u2849\u2804\u2804\u2804\u2838\u2880\u28ff\u2804";
        PlayerListener.nothing_to_see_here[2] = "\u2804\u2804\u2880\u284b\u28e1\u28f4\u28f6\u28f6\u2840\u2804\u2804\u2819\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28f4\u28ff\u28ff\u28ff\u2883\u28e4\u28c4\u28c0\u28e5\u28ff\u28ff\u2804";
        PlayerListener.nothing_to_see_here[3] = "\u2804\u2804\u28b8\u28c7\u283b\u28ff\u28ff\u28ff\u28e7\u28c0\u2880\u28e0\u284c\u28bb\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28ff\u28ff\u28ff\u2804";
        PlayerListener.nothing_to_see_here[4] = "\u2804\u2880\u28b8\u28ff\u28f7\u28e4\u28e4\u28e4\u28ec\u28d9\u28db\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u28ff\u28ff\u284d\u2804\u2804\u2880\u28e4\u28c4\u2809\u280b\u28f0";
        PlayerListener.nothing_to_see_here[5] = "\u2804\u28fc\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u2887\u28ff\u28ff\u2877\u2836\u2836\u28bf\u28ff\u28ff\u2807\u2880\u28e4";
        PlayerListener.nothing_to_see_here[6] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u2847\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28f6\u28e5\u28f4\u28ff\u2857";
        PlayerListener.nothing_to_see_here[7] = "\u2880\u2808\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u285f\u2804";
        PlayerListener.nothing_to_see_here[8] = "\u28b8\u28ff\u28e6\u28cc\u28db\u28fb\u28ff\u28ff\u28e7\u2819\u281b\u281b\u286d\u2805\u2812\u2826\u282d\u28ed\u287b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2804";
        PlayerListener.nothing_to_see_here[9] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2846\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2839\u2808\u288b\u28fd\u28ff\u28ff\u28ff\u28ff\u28f5\u28fe\u2803\u2804";
        PlayerListener.nothing_to_see_here[10] = "\u2804\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2804\u28f4\u28ff\u28f6\u28c4\u2804\u28f4\u28f6\u2804\u2880\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2804\u2804";
        PlayerListener.nothing_to_see_here[11] = "\u2804\u2804\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2844\u28bb\u28ff\u28ff\u28ff\u2804\u28ff\u28ff\u2840\u28fe\u28ff\u28ff\u28ff\u28ff\u28db\u281b\u2801\u2804\u2804\u2804";
        PlayerListener.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2808\u281b\u28bf\u28ff\u28ff\u28ff\u2801\u281e\u28bf\u28ff\u28ff\u2844\u28bf\u28ff\u2847\u28f8\u28ff\u28ff\u283f\u281b\u2801\u2804\u2804\u2804\u2804\u2804";
        PlayerListener.nothing_to_see_here[13] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2809\u283b\u28ff\u28ff\u28fe\u28e6\u2859\u283b\u28f7\u28fe\u28ff\u2803\u283f\u280b\u2801\u2804\u2804\u2804\u2804\u2804\u2880\u28e0\u28f4";
        PlayerListener.nothing_to_see_here[14] = "\u28ff\u28ff\u28ff\u28f6\u28f6\u28ee\u28e5\u28d2\u2832\u28ae\u28dd\u287f\u28ff\u28ff\u2846\u28ff\u287f\u2803\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28e0\u28f4\u28ff\u28ff\u28ff";
        PlayerListener.fwablzzmpp = thkkjbdxozlobvp();
        PlayerListener.WyyHu8EqkF = (0xF5B4C7C6 ^ new Random(1700577311106956874L).nextInt());
    }
    
    public static String pkyoclpqtm(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= PlayerListener.fwablzzmpp[i % PlayerListener.fwablzzmpp.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] thkkjbdxozlobvp() {
        return new byte[] { 124, 124, 99, 61, 47, 49, 60, 66, 30, 101, 73, 73, 37, 110, 101, 44, 81, 101, 98, 45, 95 };
    }
    
    private static byte[] rlcabcpfpdrrjer() {
        return new byte[] { -77, -70, 91, 120, 26, 112, 11, 27, 40, 42, 120, 30, 29, 7, 80, 122, 102, 40, 84, 124, 110, 107, 68, 56, 8, 127, 6, 124, 116, 121, 84, 0, 113, 127, 91, 53, 27, 16, 83, 63, 28, 20, 68, 57 };
    }
    
    private static int hexptuzeegejvbte(final int n, final int n2) {
        return n2 ^ n;
    }
}
