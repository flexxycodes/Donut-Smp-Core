package dev.daniboy.donutcore.gui.impl;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.ChatColor;
import java.util.Collections;
import dev.daniboy.donutcore.gui.WrappedClickEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;
import com.sk89q.worldguard.protection.managers.RegionManager;
import org.bukkit.World;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import org.bukkit.Material;
import java.io.IOException;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import java.util.ArrayList;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import java.util.TreeMap;
import com.sk89q.worldguard.WorldGuard;
import dev.daniboy.donutcore.utils.Hex;
import java.util.HashMap;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.DonutCore;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import org.bukkit.inventory.ItemStack;
import dev.daniboy.donutcore.manager.TeleportManager;
import dev.daniboy.donutcore.database.SQLiteManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.gui.AbstractGui;

public class SpawnGUI extends AbstractGui
{
    private final Map<Player, Object[]> opened;
    private final FileConfiguration afkSpawnGuiConfig;
    private final String guiTitle;
    private final SQLiteManager sqLiteManager;
    private final TeleportManager teleportManager;
    private final Map<Integer, ItemStack> SpawnItems;
    private final RegionContainer regionContainer;
    private static int YgrU5KeNrN = 0;
    private transient int MrS68agYfe = 1977242075;
    private static String[] nothing_to_see_here;
    
    public SpawnGUI(final DonutCore donutCore, final SQLiteManager sqLiteManager, final TeleportManager teleportManager, final int n) {
        final int n2 = 0xAB61297 ^ 0x3017FA6F;
        super(donutCore, 1156425752);
    Label_0086:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 1173110255: {
                    continue;
                }
                default: {
                    throw new IllegalAccessException();
                }
                case 1151649376: {}
                case 26839489: {
                    break Label_0086;
                }
            }
        }
        final int n3 = 0x835E5B7 ^ (0x1D0421DF ^ (Integer.parseInt("565161028") ^ n));
        final int n4 = 0x6A1ADC8E ^ dpkxpdajfbbcxwly(n3, 722212480);
        this.opened = (Map<Player, Object[]>)new HashMap();
        this.SpawnItems = (Map<Integer, ItemStack>)new HashMap();
        this.afkSpawnGuiConfig = donutCore.getafkSpawnGuiConfig$23715181(125321510);
        this.guiTitle = Hex.hex(this.afkSpawnGuiConfig.getString("spawn_gui.title"));
        this.regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
        this.sqLiteManager = sqLiteManager;
        this.teleportManager = teleportManager;
    }
    
    public void loadSpawnConfigValues$882403349(final int n) {
        final int n2 = 0x38688809 ^ (0x4D497F7B ^ (0x71BD50FF ^ (this.MrS68agYfe ^ n)));
        final Map<Integer, Location> spawnNumber$1518350224 = this.sqLiteManager.getSpawnNumber$1518350224();
        final int n3 = 0x506AA23E ^ n2;
        final TreeMap treeMap = new TreeMap((Map)spawnNumber$1518350224);
        final int n4 = 0x67834EC ^ n3;
        final int int1 = this.afkSpawnGuiConfig.getInt(ykfmtnwufp(gyltdhcxjmbdfjp(), bfodvaubpfprqhm(), n4));
        final int n5 = 0x73D0BC27 ^ n4;
        this.setConfigurableItem$1462918240((byte)(0x42490637 ^ n5), ykfmtnwufp(ohzkjnlpcsjqoof(), bfodvaubpfprqhm(), n5), 976741356);
        final int n6 = 0x2AEA91FB ^ n5;
        this.setConfigurableItem$1462918240((byte)(0x68A397CD ^ n6), ykfmtnwufp(snmjhffhvshwwcl(), bfodvaubpfprqhm(), n6), 976741356);
        final int n7 = 0x5DB34E60 ^ n6;
        this.setConfigurableItem$1462918240((byte)(0x3510D9AE ^ n7), ykfmtnwufp(lzsbtrmuzskzidt(), bfodvaubpfprqhm(), n7), 976741356);
        final int n8 = 0x20B6A365 ^ n7;
        final Iterator iterator = treeMap.entrySet().iterator();
        int n9 = 0x594B47A1 ^ n8;
    Label_0274:
        while ((iterator.hasNext() ? 1 : 0) != (0x4CED3D58 ^ n9)) {
            final int n10 = 0x3269F6E8 ^ n9;
            final Map.Entry entry = (Map.Entry)iterator.next();
            final int n11 = 0x5DF987C0 ^ n10;
            final int intValue = (int)entry.getKey();
            final int n12 = 0x68EBC0CC ^ n11;
            final Location location = (Location)entry.getValue();
            final int n13 = 0xF2802D8 ^ n12;
            final World world = Bukkit.getWorld(ykfmtnwufp(dwourgfhyqvsedb(), bfodvaubpfprqhm(), n13));
            final int n14 = 0x2B376E5D ^ n13;
            System.out.println("Spawn World: " + String.valueOf((Object)world));
            final int n15 = 0x4307E710 ^ n14;
            final RegionManager value = this.regionContainer.get(BukkitAdapter.adapt(world));
            final int n16 = 0x42290388 ^ n15;
            final ArrayList list = new ArrayList();
            final int n17 = 0x6E256BFF ^ n16;
            final Iterator iterator2 = value.getApplicableRegions(BukkitAdapter.asBlockVector(location)).iterator();
            int dpkxpdajfbbcxwly = 0x7A28EB43 ^ n17;
        Label_0584:
            while ((iterator2.hasNext() ? 1 : 0) != (0x7AAA841D ^ dpkxpdajfbbcxwly)) {
                final int n18 = 0x9D7FEE6 ^ dpkxpdajfbbcxwly;
                final ProtectedRegion protectedRegion = (ProtectedRegion)iterator2.next();
                final int n19 = 0x7F4BF4D ^ n18;
                final Iterator iterator3 = Bukkit.getOnlinePlayers().iterator();
                int dpkxpdajfbbcxwly2 = 0x2FFFF4BB ^ n19;
                int n23 = 0;
                Block_7: {
                Label_0824_Outer:
                    while (true) {
                    Label_0824:
                        while (true) {
                            int n21 = 0;
                            Label_1226: {
                                if ((iterator3.hasNext() ? 1 : 0) != (0x5B76310D ^ dpkxpdajfbbcxwly2)) {
                                    final int n20 = 0x1EE273C5 ^ dpkxpdajfbbcxwly2;
                                    final Player player = (Player)iterator3.next();
                                    n21 = (0x31AB9F8C ^ n20);
                                    if ((protectedRegion.contains(BukkitAdapter.asBlockVector(player.getLocation())) ? 1 : 0) == (0x743FDD44 ^ n21)) {
                                        break Label_1226;
                                    }
                                    final int n22 = 0x71C2B225 ^ n21;
                                    list.add((Object)player.getName());
                                    n23 = (0x59FDCBC4 ^ n22);
                                }
                                else {
                                    Label_0884: {
                                    Label_0876:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly2)) {
                                                case 1196946722: {
                                                    continue Label_0824_Outer;
                                                }
                                                case 20227199: {
                                                    break Label_0876;
                                                }
                                                case 1558139856: {
                                                    break Label_0884;
                                                }
                                                default: {
                                                    throw new RuntimeException();
                                                }
                                            }
                                        }
                                        dpkxpdajfbbcxwly2 ^= 0x564A799A;
                                    }
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly2) != 161792408) {
                                        break;
                                    }
                                    Label_1012: {
                                    Label_1004:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly2)) {
                                                case 1719136232: {
                                                    continue Label_0824_Outer;
                                                }
                                                case 161792408: {
                                                    break Label_1004;
                                                }
                                                case 1795949549: {
                                                    break Label_1012;
                                                }
                                                default: {
                                                    throw new RuntimeException();
                                                }
                                            }
                                        }
                                        dpkxpdajfbbcxwly2 ^= 0x47C295B1;
                                    }
                                    final int n24 = 0x1EB43105 ^ dpkxpdajfbbcxwly2;
                                    try {
                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n24) != 55672265) {
                                            throw null;
                                        }
                                        throw new IllegalAccessException();
                                    }
                                    catch (final IllegalAccessException ex) {
                                        int dpkxpdajfbbcxwly3 = 0;
                                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n24)) {
                                            case 1431663033: {
                                                dpkxpdajfbbcxwly3 = dpkxpdajfbbcxwly(n24, 217647045);
                                                break;
                                            }
                                            default: {
                                                throw new IOException("Error in hash");
                                            }
                                            case -1571331814: {
                                                dpkxpdajfbbcxwly3 = (0x721945D1 ^ n24);
                                                break;
                                            }
                                        }
                                        dpkxpdajfbbcxwly = dpkxpdajfbbcxwly(dpkxpdajfbbcxwly3, 1559834095);
                                        continue Label_0584;
                                    }
                                }
                                final int n25 = 0x6C08DCE ^ n23;
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n25) != 265554687) {
                                        throw null;
                                    }
                                    throw new IOException();
                                }
                                catch (final IOException ex2) {
                                    int dpkxpdajfbbcxwly4 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n25)) {
                                        default: {
                                            throw new RuntimeException("Error in hash");
                                        }
                                        case -704558246: {
                                            dpkxpdajfbbcxwly4 = (0x4E623089 ^ n25);
                                            break;
                                        }
                                        case -743948109: {
                                            dpkxpdajfbbcxwly4 = dpkxpdajfbbcxwly(n25, 1859588596);
                                            break;
                                        }
                                    }
                                    dpkxpdajfbbcxwly2 = dpkxpdajfbbcxwly(dpkxpdajfbbcxwly4, 1339304175);
                                    continue Label_0824_Outer;
                                }
                            }
                            n23 = (0x7F89E9C6 ^ n21);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n23) != 112266765) {
                                break Block_7;
                            }
                        Label_1296:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n23)) {
                                    case 1392771251: {
                                        continue Label_0824;
                                    }
                                    case 363115606: {
                                        continue Label_0824_Outer;
                                    }
                                    case 112266765: {
                                        break Label_1296;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            n23 ^= 0x57B69027;
                            continue Label_0824;
                        }
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly2)) {
                            case 1977663212: {
                                continue;
                            }
                            case 161792408: {}
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
                dpkxpdajfbbcxwly(n23, 1060376340);
                throw new RuntimeException();
            }
            int dpkxpdajfbbcxwly5 = dpkxpdajfbbcxwly(dpkxpdajfbbcxwly, 891123113);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly5) == 175385595) {
                Label_1456: {
                Label_1448:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly5)) {
                            case 700747773: {
                                continue;
                            }
                            case 175385595: {
                                break Label_1448;
                            }
                            case 747774109: {
                                break Label_1456;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    dpkxpdajfbbcxwly5 ^= 0x4F0B74F;
                }
                final ArrayList lore = new ArrayList();
                final int n26 = 0x5D2DFA55 ^ dpkxpdajfbbcxwly5;
                ItemStack itemStack;
                ItemMeta itemMeta;
                int n34;
                if (list.size() >= int1) {
                    final int n27 = 0x2A8E53C1 ^ n26;
                    itemStack = new ItemStack(Material.REDSTONE_BLOCK, intValue);
                    final int n28 = 0x6EEA982E ^ n27;
                    itemMeta = itemStack.getItemMeta();
                    final int n29 = 0x728891E2 ^ n28;
                    final String hex = Hex.hex(this.afkSpawnGuiConfig.getString(ykfmtnwufp(mydzzdeerlhjzrr(), bfodvaubpfprqhm(), n29)));
                    final int n30 = 0x58ECDED6 ^ n29;
                    final List<String> hex2 = Hex.hex((List<String>)this.afkSpawnGuiConfig.getStringList(ykfmtnwufp(lfctgucmtdncbkp(), bfodvaubpfprqhm(), n30)));
                    final int n31 = 0x4509D480 ^ n30;
                    itemMeta.setDisplayName(hex);
                    final int n32 = 0x27DED942 ^ n31;
                    lore.addAll((Collection)hex2);
                    final int n33 = 0x590ED2E8 ^ (0x253CDCDF ^ n32);
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n33) != 112584135) {
                            throw null;
                        }
                        throw new IOException();
                    }
                    catch (final IOException ex3) {
                        int dpkxpdajfbbcxwly6 = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n33)) {
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case 880401411: {
                                dpkxpdajfbbcxwly6 = (0x19BA7AFE ^ n33);
                                break;
                            }
                            case -506690406: {
                                dpkxpdajfbbcxwly6 = dpkxpdajfbbcxwly(n33, 588042733);
                                break;
                            }
                        }
                        n34 = (0x5F083188 ^ dpkxpdajfbbcxwly6);
                    }
                }
                else {
                    int dpkxpdajfbbcxwly7 = dpkxpdajfbbcxwly(n26, 499858100);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly7) != 109639795) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly7)) {
                                case 2041839404: {
                                    continue;
                                }
                                case 109639795: {}
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                    }
                    else {
                        Label_1800: {
                        Label_1792:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly7)) {
                                    case 1436583020: {
                                        continue;
                                    }
                                    case 109639795: {
                                        break Label_1792;
                                    }
                                    case 627577658: {
                                        break Label_1800;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            dpkxpdajfbbcxwly7 ^= 0x1D0861A7;
                        }
                        itemStack = new ItemStack(Material.ITEM_FRAME, intValue);
                        final int n35 = 0x7DBFF4C ^ dpkxpdajfbbcxwly7;
                        itemMeta = itemStack.getItemMeta();
                        final int n36 = 0x52ED400B ^ n35;
                        final String hex3 = Hex.hex(this.afkSpawnGuiConfig.getString(ykfmtnwufp(fjrfomupuoryjny(), bfodvaubpfprqhm(), n36)).replace((CharSequence)ykfmtnwufp(hujjvlxdtgrdhuu(), bfodvaubpfprqhm(), n36), (CharSequence)String.valueOf(intValue)));
                        final int n37 = 0x73F12A6C ^ n36;
                        itemMeta.setDisplayName(hex3);
                        final int n38 = 0x339ED2DC ^ n37;
                        final Iterator iterator4 = this.afkSpawnGuiConfig.getStringList(ykfmtnwufp(obcafpuosywllbp(), bfodvaubpfprqhm(), n38)).iterator();
                        int dpkxpdajfbbcxwly8 = 0xEDFB692 ^ n38;
                        while ((iterator4.hasNext() ? 1 : 0) != (0xD2F16D8 ^ dpkxpdajfbbcxwly8)) {
                            final int n39 = 0x29CDB5E7 ^ dpkxpdajfbbcxwly8;
                            final String s = (String)iterator4.next();
                            final int n40 = 0x2D1D9C37 ^ n39;
                            final String replace = s.replace((CharSequence)ykfmtnwufp(mbuopjqomboemvw(), bfodvaubpfprqhm(), n40), (CharSequence)String.valueOf(list.size()));
                            final int n41 = 0x141C569F ^ n40;
                            final String replace2 = replace.replace((CharSequence)ykfmtnwufp(cplsvzmhegspcbh(), bfodvaubpfprqhm(), n41), (CharSequence)String.valueOf(int1));
                            final int n42 = 0x3978B0C3 ^ n41;
                            lore.add((Object)Hex.hex(replace2));
                            int n43 = 0x1FD8FD95 ^ n42;
                            Label_2284: {
                            Label_2276:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n43)) {
                                        case 1357371182: {
                                            continue;
                                        }
                                        case 47328374: {
                                            break Label_2276;
                                        }
                                        case 1889628640: {
                                            break Label_2284;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                n43 ^= 0x40D902C4;
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n43) != 259707443) {
                                        throw null;
                                    }
                                    throw new RuntimeException();
                                }
                                catch (final RuntimeException ex4) {
                                    int dpkxpdajfbbcxwly9 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n43)) {
                                        case 172506306: {
                                            dpkxpdajfbbcxwly9 = dpkxpdajfbbcxwly(n43, 1791043099);
                                            break;
                                        }
                                        case -590270421: {
                                            dpkxpdajfbbcxwly9 = (0x50120786 ^ n43);
                                            break;
                                        }
                                        default: {
                                            throw new IOException("Error in hash");
                                        }
                                    }
                                    dpkxpdajfbbcxwly8 = dpkxpdajfbbcxwly(dpkxpdajfbbcxwly9, 648492891);
                                    continue;
                                }
                            }
                            break;
                        }
                        final int n44 = 0x1AF3D1AA ^ dpkxpdajfbbcxwly8;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n44) != 238802352) {
                            dpkxpdajfbbcxwly(n44, 593427684);
                            throw new RuntimeException();
                        }
                        n34 = (0x37E1B784 ^ n44);
                    }
                }
                itemMeta.setLore((List)lore);
                final int n45 = 0x5C1582DE ^ n34;
                itemStack.setItemMeta(itemMeta);
                final int n46 = 0x79A2FF9E ^ n45;
                this.SpawnItems.put((Object)(intValue - (byte)(0x58A0DB7 ^ n46)), (Object)itemStack);
                int n47 = 0x391147E ^ n46;
                Label_2756: {
                Label_2748:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n47)) {
                            case 1820065237: {
                                continue;
                            }
                            case 96038448: {
                                break Label_2748;
                            }
                            case 1563221907: {
                                break Label_2756;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    n47 ^= 0x404DDF69;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n47) != 138962561) {
                            throw null;
                        }
                        throw new IOException();
                    }
                    catch (final IOException ex5) {
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n47)) {
                            case 850801930: {
                                n9 = dpkxpdajfbbcxwly(n47, 1386866015);
                                break;
                            }
                            case 556725363: {
                                n9 = dpkxpdajfbbcxwly(n47, 1893399920);
                                break;
                            }
                            default: {
                                throw new IOException("Error in hash");
                            }
                        }
                    Label_2880:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                case 1359865921: {
                                    continue Label_0274;
                                }
                                case 1987311862: {
                                    continue;
                                }
                                case 145637699: {
                                    break Label_2880;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        n9 ^= 0x58121EA6;
                        continue;
                    }
                }
                break;
            }
        Label_3033:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly5)) {
                    case 74302584: {
                        continue;
                    }
                    case 175385595: {}
                    default: {
                        break Label_3033;
                    }
                }
            }
            throw new RuntimeException();
        }
        Label_2956: {
        Label_2948:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                    case 1091202293: {
                        continue;
                    }
                    case 84666935: {
                        break Label_2948;
                    }
                    case 1188725203: {
                        break Label_2956;
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
            }
            n9 ^= 0x308D5E87;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 16432608) {
            throw new RuntimeException();
        }
    Label_3032:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                case 1991301414: {
                    continue;
                }
                case 16432608: {}
                case 1030951060: {
                    break Label_3032;
                }
                default: {
                    throw new RuntimeException();
                }
            }
        }
    }
    
    private void setConfigurableItem$1462918240(final int n, final String s, final int n2) {
        final int n3 = 0x7565A344 ^ (0x73BE59A2 ^ (0x1F83F4C9 ^ (this.MrS68agYfe ^ n2)));
        final Material material = Material.getMaterial(this.afkSpawnGuiConfig.getString(s + ".material", ykfmtnwufp(lilsyazzcypyova(), bfodvaubpfprqhm(), n3)));
        final int n4 = 0x1A4FEF21 ^ n3;
        final String hex = Hex.hex(this.afkSpawnGuiConfig.getString(s + ".display_name", ykfmtnwufp(xksuucngejrdzom(), bfodvaubpfprqhm(), n4)));
        final int n5 = 0x76407DE2 ^ n4;
        final List<String> hex2 = Hex.hex((List<String>)this.afkSpawnGuiConfig.getStringList(s + ".lore"));
        final int n6 = 0x2056B679 ^ n5;
        final ItemStack itemStack = new ItemStack(material);
        final int n7 = 0x49E7C6CA ^ n6;
        final ItemMeta itemMeta = itemStack.getItemMeta();
        final int n8 = 0x79A2A347 ^ n7;
        if (itemMeta != null) {
            itemMeta.setDisplayName(hex);
            itemMeta.setLore((List)hex2);
            itemStack.setItemMeta(itemMeta);
        }
        else {
            final int n9 = 0x6874986E ^ n8;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 152935115) {
            Label_0468:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                        case 869510936: {
                            continue;
                        }
                        case 152935115: {}
                        default: {
                            break Label_0468;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        this.SpawnItems.put((Object)n, (Object)itemStack);
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0x8BEC68C ^ (0x53660263 ^ (0x6C2ED4E1 ^ (this.MrS68agYfe ^ n)));
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, (int)(byte)(0x3EBA29B5 ^ n2), this.guiTitle);
        final int n3 = 0x38BB8055 ^ n2;
        this.loadSpawnConfigValues$882403349(870176311);
        final int n4 = 0x35A5DDE1 ^ n3;
        final Iterator iterator = this.SpawnItems.entrySet().iterator();
        int dpkxpdajfbbcxwly = 0x15C83F28 ^ n4;
        while ((iterator.hasNext() ? 1 : 0) != (0x266C4B1F ^ dpkxpdajfbbcxwly)) {
            final int n5 = 0x107A958D ^ dpkxpdajfbbcxwly;
            final Map.Entry entry = (Map.Entry)iterator.next();
            final int n6 = 0x25461D60 ^ n5;
            inventory.setItem((int)entry.getKey(), (ItemStack)entry.getValue());
            final int n7 = 0x7352B08D ^ (0x14CDB678 ^ n6);
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 38992242) {
                    throw null;
                }
                throw new RuntimeException();
            }
            catch (final RuntimeException ex) {
                int dpkxpdajfbbcxwly2 = 0;
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n7)) {
                    case -1501681605: {
                        dpkxpdajfbbcxwly2 = dpkxpdajfbbcxwly(n7, 321184495);
                        break;
                    }
                    case -1061470261: {
                        dpkxpdajfbbcxwly2 = (0x1FFC4011 ^ n7);
                        break;
                    }
                    default: {
                        throw new RuntimeException("Error in hash");
                    }
                }
                dpkxpdajfbbcxwly = dpkxpdajfbbcxwly(dpkxpdajfbbcxwly2, 1099394295);
            }
        }
        Label_0320: {
        Label_0312:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly)) {
                    case 1306634161: {
                        continue;
                    }
                    case 175241184: {
                        break Label_0312;
                    }
                    case 195432071: {
                        break Label_0320;
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
            }
            dpkxpdajfbbcxwly ^= 0x2113171B;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly) == 117924156) {
            dpkxpdajfbbcxwly(dpkxpdajfbbcxwly, 842704685);
            return inventory;
        }
        dpkxpdajfbbcxwly(dpkxpdajfbbcxwly, 1158067900);
        throw new IllegalAccessException();
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        final int n2 = 0x3E6D67BC ^ (0x5C2F652 ^ (0x1168E26B ^ (this.MrS68agYfe ^ n)));
        final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
        final int n3 = 0x5EF7F4A3 ^ n2;
        final ItemStack itemStack$386585608 = wrappedClickEvent.getItemStack$386585608(389697697);
        int n4 = 0x30601E37 ^ n3;
        if (itemStack$386585608 != null) {
            final int n5 = 0x5B248F8 ^ n4;
            if (itemStack$386585608.getType() != Material.AIR) {
                final int dpkxpdajfbbcxwly = dpkxpdajfbbcxwly(n5, 445634834);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly) != 43434653) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly)) {
                            case 776926308: {
                                continue;
                            }
                            case 43434653: {}
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
                else {
                    int n6 = 0x2B2CD6AF ^ dpkxpdajfbbcxwly;
                    if (wrappedClickEvent.getSlot$2125716982(2104088370) == (byte)(0x479C0899 ^ n6)) {
                        final int n7 = 0x120B9F85 ^ n6;
                        final ArrayList list = new ArrayList(this.sqLiteManager.getSpawnNumber$1518350224().values());
                        final int n8 = 0x2D2331D0 ^ n7;
                        Label_0757: {
                            int n15;
                            if ((((List)list).isEmpty() ? 1 : 0) == (0x78B4A6FD ^ n8)) {
                                final int n9 = 0xAEB5C72 ^ n8;
                                Collections.shuffle((List)list);
                                final int n10 = 0x71A38B4E ^ n9;
                                final Location location = (Location)((List)list).get((int)(byte)(0x3FC71C1 ^ n10));
                                final int n11 = 0x62655449 ^ n10;
                                player$624284539.closeInventory();
                                final int n12 = 0x5F83680E ^ n11;
                                this.teleportManager.teleportWithCountdown$168586022(player$624284539, location, 1255099300);
                                final int n13 = 0x47520D0E ^ (0x74D7A3ED ^ n12);
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n13) != 174441740) {
                                        throw null;
                                    }
                                    throw new RuntimeException();
                                }
                                catch (final RuntimeException ex) {
                                    int dpkxpdajfbbcxwly2 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n13)) {
                                        default: {
                                            throw new IOException("Error in hash");
                                        }
                                        case -2114281214: {
                                            dpkxpdajfbbcxwly2 = dpkxpdajfbbcxwly(n13, 1023307235);
                                            break;
                                        }
                                        case 1828657960: {
                                            dpkxpdajfbbcxwly2 = (0x615EDAA6 ^ n13);
                                            break;
                                        }
                                    }
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly2)) {
                                            case 1644805777: {
                                                continue;
                                            }
                                            case 45495080: {}
                                            case 1596405876: {
                                                break Label_0757;
                                            }
                                            default: {
                                                throw new RuntimeException();
                                            }
                                        }
                                    }
                                    return;
                                }
                            }
                            else {
                                final int n14 = 0x488207C9 ^ n8;
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14) != 225044578) {
                                    throw new RuntimeException();
                                }
                                n15 = (0x17A98D29 ^ n14);
                            }
                            player$624284539.sendMessage(ykfmtnwufp(cudpjabnqmyjhsg(), bfodvaubpfprqhm(), n15));
                        }
                        return;
                    }
                    Label_0812: {
                    Label_0804:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                case 1604248031: {
                                    continue;
                                }
                                case 180229977: {
                                    break Label_0804;
                                }
                                case 1706629972: {
                                    break Label_0812;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        n6 ^= 0x6C04FE07;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) == 75003499) {
                        final int n16 = 0x5F33E953 ^ n6;
                        Label_1802: {
                            if ((itemStack$386585608.hasItemMeta() ? 1 : 0) != (0x74AB1FFC ^ n16)) {
                                int n17 = 0x3030D14E ^ n16;
                                if ((itemStack$386585608.getItemMeta().hasDisplayName() ? 1 : 0) != (0x449BCEB2 ^ n17)) {
                                    final int n18 = 0xEEE9B7D ^ n17;
                                    final String displayName = itemStack$386585608.getItemMeta().getDisplayName();
                                    final int n19 = 0x2A7E190D ^ n18;
                                    final String stripColor = ChatColor.stripColor(displayName);
                                    final int n20 = 0x4C953FAF ^ n19;
                                    final String replaceAll = stripColor.replaceAll(ykfmtnwufp(dnmrbteuhdttone(), bfodvaubpfprqhm(), n20), ykfmtnwufp(tncwsexqdnmyban(), bfodvaubpfprqhm(), n20));
                                    int n21 = 0x12F2C921 ^ n20;
                                    if ((replaceAll.isEmpty() ? 1 : 0) == (0x3E6CBA4C ^ n21)) {
                                        final int n22 = 0x782F3198 ^ n21;
                                        final int int1 = Integer.parseInt(replaceAll);
                                        final int n23 = 0x15E9FE24 ^ n22;
                                        final Map<Integer, Location> spawnNumber$1518350224 = this.sqLiteManager.getSpawnNumber$1518350224();
                                        final int n24 = 0x5DC71406 ^ n23;
                                        final Location location2 = (Location)spawnNumber$1518350224.get((Object)int1);
                                        final int n25 = 0x77D85BBE ^ n24;
                                        if (location2 != null) {
                                            final int n26 = 0x6EC24689 ^ n25;
                                            player$624284539.closeInventory();
                                            int n27 = 0x2742FD59 ^ n26;
                                            this.teleportManager.teleportWithCountdown$168586022(player$624284539, location2, 1255099300);
                                            Label_1592: {
                                            Label_1584:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n27)) {
                                                        case 935740223: {
                                                            continue;
                                                        }
                                                        case 224893731: {
                                                            break Label_1584;
                                                        }
                                                        case 1231566915: {
                                                            break Label_1592;
                                                        }
                                                        default: {
                                                            throw new RuntimeException();
                                                        }
                                                    }
                                                }
                                                n27 ^= 0x6DBD11D8;
                                                try {
                                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n27) != 87608052) {
                                                        throw null;
                                                    }
                                                    throw new IllegalAccessException();
                                                }
                                                catch (final IllegalAccessException ex2) {
                                                    int dpkxpdajfbbcxwly3 = 0;
                                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n27)) {
                                                        case -331054590: {
                                                            dpkxpdajfbbcxwly3 = dpkxpdajfbbcxwly(n27, 682318365);
                                                            break;
                                                        }
                                                        default: {
                                                            throw new IOException("Error in hash");
                                                        }
                                                        case 1477259691: {
                                                            dpkxpdajfbbcxwly3 = (0x1E226C68 ^ n27);
                                                            break;
                                                        }
                                                    }
                                                    dpkxpdajfbbcxwly(dpkxpdajfbbcxwly3, 1194297159);
                                                    return;
                                                }
                                            }
                                        }
                                        int n28 = 0x4793AD33 ^ n25;
                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) != 141228888) {
                                            while (true) {
                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28)) {
                                                    case 1031741385: {
                                                        continue;
                                                    }
                                                    case 141228888: {}
                                                    default: {
                                                        throw new RuntimeException();
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            Label_1768: {
                                            Label_1760:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28)) {
                                                        case 2021325631: {
                                                            continue;
                                                        }
                                                        case 141228888: {
                                                            break Label_1760;
                                                        }
                                                        case 509007046: {
                                                            break Label_1768;
                                                        }
                                                        default: {
                                                            throw new RuntimeException();
                                                        }
                                                    }
                                                }
                                                n28 ^= 0x20240307;
                                            }
                                            player$624284539.sendMessage(ykfmtnwufp(xjjdxvuzhgpzubr(), bfodvaubpfprqhm(), n28));
                                        }
                                    }
                                    else {
                                        Label_1496: {
                                        Label_1488:
                                            while (true) {
                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n21)) {
                                                    case 1578191606: {
                                                        continue;
                                                    }
                                                    case 150115999: {
                                                        break Label_1488;
                                                    }
                                                    case 95601938: {
                                                        break Label_1496;
                                                    }
                                                    default: {
                                                        throw new RuntimeException();
                                                    }
                                                }
                                            }
                                            n21 ^= 0x739BC23F;
                                        }
                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n21) != 118437033) {
                                            dpkxpdajfbbcxwly(n21, 15750990);
                                            throw new RuntimeException();
                                        }
                                        dpkxpdajfbbcxwly(n21, 2147169641);
                                    }
                                }
                                else {
                                    Label_1308: {
                                    Label_1300:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                                case 590823149: {
                                                    continue;
                                                }
                                                case 82683107: {
                                                    break Label_1300;
                                                }
                                                case 537809856: {
                                                    break Label_1308;
                                                }
                                                default: {
                                                    throw new RuntimeException();
                                                }
                                            }
                                        }
                                        n17 ^= 0x56C6102;
                                    }
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 265266578) {
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                                case 213799947: {
                                                    continue;
                                                }
                                                case 265266578: {}
                                                default: {
                                                    throw new RuntimeException();
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                                case 96752941: {
                                                    continue;
                                                }
                                                case 265266578: {}
                                                case 1786917270: {
                                                    break Label_1802;
                                                }
                                                default: {
                                                    throw new RuntimeException();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                final int dpkxpdajfbbcxwly4 = dpkxpdajfbbcxwly(n16, 1497950433);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(dpkxpdajfbbcxwly4) != 149521195) {
                                    dpkxpdajfbbcxwly(dpkxpdajfbbcxwly4, 1625610272);
                                    throw new RuntimeException();
                                }
                            }
                        }
                        return;
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 1499275228: {
                                continue;
                            }
                            case 75003499: {}
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
        else {
            Label_0176: {
            Label_0168:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                        case 1022118984: {
                            continue;
                        }
                        case 266451286: {
                            break Label_0168;
                        }
                        case 725212436: {
                            break Label_0176;
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
                n4 ^= 0x62BD9CE9;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 21924327) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                        case 598502903: {
                            continue;
                        }
                        case 21924327: {}
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
    
    public void removeSpawnItem(final int n) {
        this.SpawnItems.remove((Object)(n - (byte)(0xC3BB784 ^ (0x4F8C08 ^ (0x246970C2 ^ (0x78D71607 ^ this.MrS68agYfe))))));
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0xD040945 ^ (0x78024903 ^ (0x66CC9F13 ^ (this.MrS68agYfe ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x46463453 ^ (0xE678154 ^ (0x24153C2B ^ (this.MrS68agYfe ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x1A0DCA3 ^ (0x5864C8E5 ^ (0x35BC69A ^ (this.MrS68agYfe ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (SpawnGUI.nothing_to_see_here = new String[18])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnGUI.YgrU5KeNrN = (0x6DB87942 ^ new Random(-4487970365578537263L).nextInt());
    }
    
    public static String ykfmtnwufp(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] bfodvaubpfprqhm() {
        return new byte[] { 12, 85, 120, 77, 75, 66, 46, 99, 38, 56, 41, 63, 10, 94, 65, 115, 50, 3, 56, 88, 114, 15, 79, 43, 75, 14, 76, 34, 42, 107, 59, 78, 25, 42, 94, 79, 86, 47, 77, 7, 52, 4, 47, 96, 76, 120, 66, 31, 25, 49, 23 };
    }
    
    private static byte[] mydzzdeerlhjzrr() {
        return new byte[] { -57, -98, 77, 9, 122, 3, 25, 53, 31, 122, 29, 100, 61, 48, 112, 35, 5, 79, 13, 5, 71, 22, 126, 119, 124, 88, 117, 111, 30, 46, 12, 19, 40, 124, 105, 15, 99, 126, 120, 66, 5, 70, 24, 121, 117, 41, 118, 67, 46, 115, 38, 75, 98, 45, 120, 30, 119, 96, 82, 72, 15, 112, 6, 94, 106, 25, 68, 102 };
    }
    
    private static byte[] obcafpuosywllbp() {
        return new byte[] { -60, -100, 73, 14, 122, 1, 28, 48, 16, 121, 24, 97, 59, 50, 115, 38, 4, 64, 9, 1, 67, 18, 125, 106, 125, 72, 125, 115, 27, 47, 9, 18, 47, 67, 111, 19, 103, 115, 127, 71, 2, 87 };
    }
    
    private static byte[] lfctgucmtdncbkp() {
        return new byte[] { -64, -102, 74, 14, 121, 0, 25, 51, 30, 118, 27, 97, 56, 49, 115, 38, 5, 71, 0, 8, 64, 17, 125, 118, 121, 93, 123, 107, 18, 34, 9, 18, 43, 123, 108, 4, 97, 123, 117, 76, 6, 71, 29, 126, 126, 38, 117, 65, 33, 122, 37, 89 };
    }
    
    private static byte[] mbuopjqomboemvw() {
        return new byte[] { -61, -100, 79, 95, 121, 0, 25, 57, 22, 104, 31, 113, 61, 9, 115, 54, 4, 64, 9, 75 };
    }
    
    private static byte[] ohzkjnlpcsjqoof() {
        return new byte[] { -61, -101, 73, 12, 123, 10, 31, 59, 20, 120, 24, 96, 59, 51, 113, 44, 3, 79, 10, 6, 67, 16, 126, 123, 123, 87, 125, 120, 24, 55, 10, 32, 40, 104, 110, 22, 103, 113, 127, 85, 5, 106, 30, 51, 124, 50, 115, 84, 43, 105, 38, 74 };
    }
    
    private static byte[] cplsvzmhegspcbh() {
        return new byte[] { -57, -102, 73, 92, 127, 29, 23, 52, 17, 117, 25, 81, 62, 26, 115, 38, 4, 85, 13, 17, 67, 94, 123, 107, 114, 75, 123, 50 };
    }
    
    private static byte[] snmjhffhvshwwcl() {
        return new byte[] { -61, -99, 77, 11, 126, 7, 31, 53, 18, 127, 24, 102, 63, 52, 116, 33, 3, 65, 12, 1, 67, 22, 122, 109, 126, 75, 125, 116, 30, 44, 10, 23 };
    }
    
    private static byte[] lzsbtrmuzskzidt() {
        return new byte[] { -54, -109, 72, 12, 114, 4, 25, 49, 20, 119, 16, 97, 56, 56, 119, 35, 1, 68, 0, 8, 66, 19, 118, 115, 124, 88, 126, 98, 19, 47, 9, 40, 47, 109, 109, 28, 110, 113, 125, 80, 13, 109, 24, 50, 126, 50, 123, 93, 43, 103, 33, 76 };
    }
    
    private static byte[] fjrfomupuoryjny() {
        return new byte[] { -61, -101, 75, 10, 126, 3, 24, 54, 17, 123, 24, 96, 57, 53, 116, 37, 4, 66, 15, 5, 67, 16, 124, 108, 126, 79, 122, 119, 29, 40, 10, 17, 42, 65, 107, 16, 96, 122, 122, 94, 5, 80 };
    }
    
    private static byte[] hujjvlxdtgrdhuu() {
        return new byte[] { -61, -101, 75, 92, 126, 29, 24, 34, 17, 97, 24, 108, 57, 15, 116, 48, 4, 18 };
    }
    
    private static byte[] gyltdhcxjmbdfjp() {
        return new byte[] { -54, -103, 74, 15, 126, 10, 28, 54, 22, 119, 26, 99, 59, 52, 121, 38, 6, 70, 0, 2, 64, 16, 122, 126, 121, 91, 124, 98, 25, 6, 10, 11, 33, 116, 106, 30, 110, 101, 127, 83, 1, 78, 29, 39 };
    }
    
    private static byte[] dwourgfhyqvsedb() {
        return new byte[] { -61, -101, 77, 45, 120, 1, 22, 59, 30, 127, 24, 96 };
    }
    
    private static byte[] xksuucngejrdzom() {
        return new byte[] { -61, -99, 79, 63, 114, 17, 25, 48, 31, 109, 24, 125, 61, 4, 120, 49, 5, 22, 1, 34, 67, 89, 120, 112, 114, 93 };
    }
    
    private static byte[] lilsyazzcypyova() {
        return new byte[] { -61, -109, 76, 46, 121, 37, 22, 24, 17, 67, 24, 67 };
    }
    
    private static byte[] xjjdxvuzhgpzubr() {
        return new byte[] { -57, -102, 75, 42, 115, 7, 27, 52, 18, 122, 25, 98, 62, 70, 116, 54, 4, 88, 13, 1, 65, 85, 119, 106, 126, 24, 120, 121, 26, 55, 15, 2, 44, 63, 104, 29, 99, 112, 126, 70, 12, 95, 26, 50, 120, 99 };
    }
    
    private static byte[] dnmrbteuhdttone() {
        return new byte[] { -59, -98, 64, 35, 115, 45, 25, 103, 23, 34, 29, 62, 63, 59 };
    }
    
    private static byte[] tncwsexqdnmyban() {
        return new byte[0];
    }
    
    private static byte[] cudpjabnqmyjhsg() {
        return new byte[] { -60, -100, 76, 52, 127, 31, 23, 119, 23, 125, 31, 123, 61, 11, 115, 61, 6, 92, 14, 78, 70, 72, 123, 118, 114, 83, 125, 122, 28, 43, 12, 9, 43, 51, 106, 31, 96, 111, 121, 81, 0, 95, 22, 56, 125, 47, 116, 73, 46, 105, 37, 80, 97, 103 };
    }
    
    private static int dpkxpdajfbbcxwly(final int n, final int n2) {
        return n ^ n2;
    }
}
