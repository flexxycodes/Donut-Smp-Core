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
import java.util.Iterator;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.bukkit.Material;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.Bukkit;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import java.util.ArrayList;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import org.bukkit.Location;
import java.util.TreeMap;
import com.sk89q.worldguard.WorldGuard;
import dev.daniboy.donutcore.utils.Hex;
import java.util.HashMap;
import dev.daniboy.donutcore.DonutCore;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import org.bukkit.inventory.ItemStack;
import dev.daniboy.donutcore.manager.TeleportManager;
import dev.daniboy.donutcore.database.SQLiteManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.gui.AbstractGui;

public class AfkGUI extends AbstractGui
{
    private final Map<Player, Object[]> opened;
    private final FileConfiguration afkSpawnGuiConfig;
    private final String guiTitle;
    private final SQLiteManager sqLiteManager;
    private final TeleportManager teleportManager;
    private final Map<Integer, ItemStack> afkItems;
    private final RegionContainer regionContainer;
    private static int 6Mktfpr5ue = 0;
    private transient int NV6ekYepud = 1500772219;
    private static byte[] gkmsdlfhnn;
    private static String[] nothing_to_see_here;
    
    public AfkGUI(final DonutCore donutCore, final SQLiteManager sqLiteManager, final TeleportManager teleportManager, final int n) {
        final int n2 = 0x343B7AA7 ^ 0x87296C4;
        super(donutCore, 1156425752);
        blbquqyvjqgjhvwn(n2, 1299619068);
        final int n3 = 0x6427A7E0 ^ (0xBE5E4AC ^ (Integer.parseInt("50176990") ^ n));
        this.opened = (Map<Player, Object[]>)new HashMap();
        this.afkItems = (Map<Integer, ItemStack>)new HashMap();
        this.afkSpawnGuiConfig = donutCore.getafkSpawnGuiConfig$23715181(125321510);
        this.guiTitle = Hex.hex(this.afkSpawnGuiConfig.getString("afk_gui.title"));
        this.regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
        this.sqLiteManager = sqLiteManager;
        this.teleportManager = teleportManager;
    }
    
    public void loadAfkConfigValues$568738828(final int n) {
        final int n2 = 0x1464E4CE ^ (0x32720E91 ^ (0x646752F8 ^ (this.NV6ekYepud ^ n)));
        final Map<Integer, Location> afkNumber$322438506 = this.sqLiteManager.getAfkNumber$322438506();
        final int n3 = 0x23393588 ^ n2;
        final TreeMap treeMap = new TreeMap((Map)afkNumber$322438506);
        final int n4 = 0x29B8CB39 ^ n3;
        final int int1 = this.afkSpawnGuiConfig.getInt(cbnglzggvx(tuevegopvisgnxa(), n4));
        final int n5 = 0x7C52F3C7 ^ n4;
        this.setConfigurableItem$596163210((byte)(0x16480C04 ^ n5), cbnglzggvx(kpdvzpjmzjrajkk(), n5), 709598146);
        final int n6 = 0x5BCEF604 ^ n5;
        this.setConfigurableItem$596163210((byte)(0x4D86FA01 ^ n6), cbnglzggvx(idhmvgougwzxygz(), n6), 709598146);
        final int n7 = 0x1D71B9FE ^ n6;
        this.setConfigurableItem$596163210((byte)(0x50F743FC ^ n7), cbnglzggvx(ovvgivfpfvrmpnm(), n7), 709598146);
        final int n8 = 0x9BBBB6C ^ n7;
        final Iterator iterator = treeMap.entrySet().iterator();
        int blbquqyvjqgjhvwn = 0x55373426 ^ n8;
        while ((iterator.hasNext() ? 1 : 0) != (0xC7BCC84 ^ blbquqyvjqgjhvwn)) {
            final int n9 = 0x43AC1521 ^ blbquqyvjqgjhvwn;
            final Map.Entry entry = (Map.Entry)iterator.next();
            final int n10 = 0x5D88567D ^ n9;
            final int intValue = (int)entry.getKey();
            final int n11 = 0x719F6DC6 ^ n10;
            final Location location = (Location)entry.getValue();
            final int n12 = 0x4A61189B ^ n11;
            final RegionManager value = this.regionContainer.get(BukkitAdapter.adapt(location.getWorld()));
            final int n13 = 0x63728F61 ^ n12;
            final ArrayList list = new ArrayList();
            final int n14 = 0x1E20B05D ^ n13;
            Iterator iterator2;
            int blbquqyvjqgjhvwn2 = 0;
            int n23 = 0;
        Label_1282:
            for (iterator2 = value.getApplicableRegions(BukkitAdapter.asBlockVector(location)).iterator(), blbquqyvjqgjhvwn2 = (0x3085FF14 ^ n14); (iterator2.hasNext() ? 1 : 0) != (0x64763AAD ^ blbquqyvjqgjhvwn2); blbquqyvjqgjhvwn2 = blbquqyvjqgjhvwn(n23, 1174799439)) {
                final int n15 = 0x60F226D0 ^ blbquqyvjqgjhvwn2;
                final ProtectedRegion protectedRegion = (ProtectedRegion)iterator2.next();
                final int n16 = 0x15BEBCDE ^ n15;
                final Iterator iterator3 = Bukkit.getOnlinePlayers().iterator();
                int n17 = 0x4A23ED91 ^ n16;
            Label_0972_Outer:
                while (true) {
                    int n21 = 0;
                    Label_1128: {
                        if ((iterator3.hasNext() ? 1 : 0) != (0x5B194D32 ^ n17)) {
                            final int n18 = 0x75610DD5 ^ n17;
                            final Player player = (Player)iterator3.next();
                            final int n19 = 0x7235B11D ^ n18;
                            if ((protectedRegion.contains(BukkitAdapter.asBlockVector(player.getLocation())) ? 1 : 0) != (0x5C4DF1FA ^ n19)) {
                                final int n20 = 0x49505471 ^ n19;
                                list.add((Object)player.getName());
                                n21 = (0x34F2E436 ^ n20);
                            }
                            else {
                                final int n22 = 0x76E4AA5F ^ n19;
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n22) != 44567334) {
                                    blbquqyvjqgjhvwn(n22, 457517536);
                                    throw new IllegalAccessException();
                                }
                                n21 = (0xB461A18 ^ n22);
                            }
                        }
                        else {
                            Label_0892: {
                            Label_0884:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                        case 1519003342: {
                                            continue Label_0972_Outer;
                                        }
                                        case 8478345: {
                                            break Label_0884;
                                        }
                                        case 1341042699: {
                                            break Label_0892;
                                        }
                                        default: {
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                                n17 ^= 0xA0B1A43;
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 219404408) {
                                blbquqyvjqgjhvwn(n17, 1627268404);
                                throw new IllegalAccessException();
                            }
                        Label_0972:
                            while (true) {
                                Label_0964: {
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                            case 77245717: {
                                                continue Label_0972_Outer;
                                            }
                                            case 219404408: {
                                                break Label_0964;
                                            }
                                            case 1321265830: {
                                                break Label_0972;
                                            }
                                            default: {
                                                throw new IllegalAccessException();
                                            }
                                        }
                                    }
                                    Label_1028: {
                                    Label_1020:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                                case 1787589610: {
                                                    continue Label_0972_Outer;
                                                }
                                                case 156217067: {
                                                    break Label_1020;
                                                }
                                                case 1854414701: {
                                                    break Label_1028;
                                                }
                                                default: {
                                                    throw new IllegalAccessException();
                                                }
                                            }
                                        }
                                        n17 ^= 0x7C8AA843;
                                        try {
                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 70006883) {
                                                throw null;
                                            }
                                            throw new RuntimeException();
                                        }
                                        catch (final RuntimeException ex) {
                                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n17)) {
                                                default: {
                                                    throw new IllegalAccessException("Error in hash");
                                                }
                                                case 427577265: {
                                                    n23 = blbquqyvjqgjhvwn(n17, 23050004);
                                                    break;
                                                }
                                                case 302867683: {
                                                    n23 = blbquqyvjqgjhvwn(n17, 1076990590);
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break Label_1128;
                                }
                                n17 ^= 0xEB776C4;
                                continue Label_0972;
                            }
                        }
                    }
                    Label_1184: {
                    Label_1176:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n21)) {
                                case 1638584041: {
                                    continue;
                                }
                                case 29339313: {
                                    break Label_1176;
                                }
                                case 2070509015: {
                                    break Label_1184;
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                        n21 ^= 0x20C8A6C5;
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n21) != 18180135) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        }
                        catch (final IllegalAccessException ex2) {
                            int n24 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n21)) {
                                default: {
                                    throw new IllegalAccessException("Error in hash");
                                }
                                case -1556183752: {
                                    n24 = blbquqyvjqgjhvwn(n21, 1255264413);
                                    break;
                                }
                                case 155139008: {
                                    n24 = blbquqyvjqgjhvwn(n21, 1603397442);
                                    break;
                                }
                            }
                            n17 = (0x5AF4D08 ^ n24);
                            continue;
                        }
                    }
                    break Label_1282;
                }
            }
            final int blbquqyvjqgjhvwn3 = blbquqyvjqgjhvwn(blbquqyvjqgjhvwn2, 2040284333);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn3) != 167135690) {
                blbquqyvjqgjhvwn(blbquqyvjqgjhvwn3, 738593861);
            }
            else {
                final int blbquqyvjqgjhvwn4 = blbquqyvjqgjhvwn(blbquqyvjqgjhvwn3, 318967028);
                final ArrayList lore = new ArrayList();
                final int n25 = 0x40A6DE30 ^ blbquqyvjqgjhvwn4;
                int n35 = 0;
                Label_2668: {
                    ItemStack itemStack = null;
                    ItemMeta itemMeta = null;
                    int n34 = 0;
                    Label_2450: {
                        if (list.size() >= int1) {
                            final int n26 = 0x3A79C0D2 ^ n25;
                            itemStack = new ItemStack(Material.REDSTONE_BLOCK, intValue);
                            final int n27 = 0x6A09DE5D ^ n26;
                            itemMeta = itemStack.getItemMeta();
                            final int n28 = 0x3BCE5D90 ^ n27;
                            final String hex = Hex.hex(this.afkSpawnGuiConfig.getString(cbnglzggvx(ukafbobzrkfoenm(), n28)));
                            final int n29 = 0x6D5F515D ^ n28;
                            final List<String> hex2 = Hex.hex((List<String>)this.afkSpawnGuiConfig.getStringList(cbnglzggvx(mknkyepdbbmmsmx(), n29)));
                            final int n30 = 0x6C430DAC ^ n29;
                            itemMeta.setDisplayName(hex);
                            final int n31 = 0x6A2FA476 ^ n30;
                            lore.addAll((Collection)hex2);
                            int n32 = 0x7D26A4E0 ^ n31;
                            Label_1628: {
                            Label_1620:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n32)) {
                                        case 953357185: {
                                            continue;
                                        }
                                        case 76230616: {
                                            break Label_1620;
                                        }
                                        case 358767307: {
                                            break Label_1628;
                                        }
                                        default: {
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                                n32 ^= 0x513014E7;
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n32) != 259810964) {
                                        throw null;
                                    }
                                    throw new IOException();
                                }
                                catch (final IOException ex3) {
                                    int n33 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n32)) {
                                        case -2139895415: {
                                            n33 = (0x17BFAC8B ^ n32);
                                            break;
                                        }
                                        default: {
                                            throw new RuntimeException("Error in hash");
                                        }
                                        case 379927259: {
                                            n33 = (0x456572E1 ^ n32);
                                            break;
                                        }
                                    }
                                    n34 = (0x614A1D8D ^ n33);
                                    break Label_2450;
                                }
                            }
                        }
                        n35 = (0x251F66B1 ^ n25);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n35) != 267182866) {
                            break Label_2668;
                        }
                        Label_1800: {
                        Label_1792:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n35)) {
                                    case 98917759: {
                                        continue;
                                    }
                                    case 267182866: {
                                        break Label_1792;
                                    }
                                    case 104620099: {
                                        break Label_1800;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            n35 ^= 0x2CA1A487;
                        }
                        itemStack = new ItemStack(Material.ITEM_FRAME, intValue);
                        final int n36 = 0x3F798F76 ^ n35;
                        itemMeta = itemStack.getItemMeta();
                        final int n37 = 0x1627F14F ^ n36;
                        final String hex3 = Hex.hex(this.afkSpawnGuiConfig.getString(cbnglzggvx(wamgnouvlafbztv(), n37)).replace((CharSequence)cbnglzggvx(isngerraxqehdlo(), n37), (CharSequence)String.valueOf(intValue)));
                        final int n38 = 0x2361BAC0 ^ n37;
                        itemMeta.setDisplayName(hex3);
                        final int n39 = 0xA76A238 ^ n38;
                        final Iterator iterator4 = this.afkSpawnGuiConfig.getStringList(cbnglzggvx(qbzzdihdtdtstgt(), n39)).iterator();
                        int blbquqyvjqgjhvwn5 = 0x42361622 ^ n39;
                    Label_2013:
                        while ((iterator4.hasNext() ? 1 : 0) != (0x58E1E11 ^ blbquqyvjqgjhvwn5)) {
                            final int n40 = 0x4678CE4C ^ blbquqyvjqgjhvwn5;
                            final String s = (String)iterator4.next();
                            final int n41 = 0x6443DE8C ^ n40;
                            final String replace = s.replace((CharSequence)cbnglzggvx(yngexuuzyluppzl(), n41), (CharSequence)String.valueOf(list.size()));
                            final int n42 = 0x70DB1DA3 ^ n41;
                            final String replace2 = replace.replace((CharSequence)cbnglzggvx(hbsbwaznpwyocrq(), n42), (CharSequence)String.valueOf(int1));
                            final int n43 = 0x1EC544DF ^ n42;
                            lore.add((Object)Hex.hex(replace2));
                            final int blbquqyvjqgjhvwn6 = blbquqyvjqgjhvwn(0x51432E48 ^ n43, 409812900);
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn6) != 8188249) {
                                    throw null;
                                }
                                throw new IOException();
                            }
                            catch (final IOException ex4) {
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(blbquqyvjqgjhvwn6)) {
                                    case 69874184: {
                                        blbquqyvjqgjhvwn5 = (0x448BC1E4 ^ blbquqyvjqgjhvwn6);
                                        break;
                                    }
                                    case -356167797: {
                                        blbquqyvjqgjhvwn5 = blbquqyvjqgjhvwn(blbquqyvjqgjhvwn6, 961949268);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                }
                            Label_2344:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn5)) {
                                        case 2078671299: {
                                            continue Label_2013;
                                        }
                                        case 658676237: {
                                            continue;
                                        }
                                        case 64774849: {
                                            break Label_2344;
                                        }
                                        default: {
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                                blbquqyvjqgjhvwn5 ^= 0x418099B4;
                                continue;
                            }
                            break;
                        }
                        Label_2420: {
                        Label_2412:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn5)) {
                                    case 1408768212: {
                                        continue;
                                    }
                                    case 87374241: {
                                        break Label_2412;
                                    }
                                    case 141303254: {
                                        break Label_2420;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            blbquqyvjqgjhvwn5 ^= 0x60C9FAE;
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn5) != 55204385) {
                            throw new IllegalAccessException();
                        }
                        n34 = (0x45794988 ^ blbquqyvjqgjhvwn5);
                    }
                    itemMeta.setLore((List)lore);
                    final int n44 = 0x3EEFDF8F ^ n34;
                    itemStack.setItemMeta(itemMeta);
                    final int n45 = 0x6C2C4ECE ^ n44;
                    this.afkItems.put((Object)(intValue - (byte)(0x14385977 ^ n45)), (Object)itemStack);
                    final int n46 = 0x17ED92BE ^ (0x70DB333 ^ n45);
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n46) != 76215731) {
                            throw null;
                        }
                        throw new RuntimeException();
                    }
                    catch (final RuntimeException ex5) {
                        int n47 = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n46)) {
                            case -2144559544: {
                                n47 = (0x657521DD ^ n46);
                                break;
                            }
                            default: {
                                throw new IOException("Error in hash");
                            }
                            case 650364888: {
                                n47 = (0x71A8CAEF ^ n46);
                                break;
                            }
                        }
                        blbquqyvjqgjhvwn = blbquqyvjqgjhvwn(n47, 2030796432);
                        continue;
                    }
                }
                blbquqyvjqgjhvwn(n35, 1522317360);
            }
            throw new IllegalAccessException();
        }
        final int blbquqyvjqgjhvwn7 = blbquqyvjqgjhvwn(blbquqyvjqgjhvwn, 862564062);
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn7) == 171155868) {
            return;
        }
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn7)) {
                case 1694522621: {
                    continue;
                }
                case 171155868: {}
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
    }
    
    private void setConfigurableItem$596163210(final int n, final String s, final int n2) {
        final int n3 = 0x54AA284D ^ (0x1717CF2F ^ (0x6F409B81 ^ (this.NV6ekYepud ^ n2)));
        final Material material = Material.getMaterial(this.afkSpawnGuiConfig.getString(s + ".material", cbnglzggvx(oyawokyyjqettbg(), n3)));
        final int n4 = 0x269AD755 ^ n3;
        final String hex = Hex.hex(this.afkSpawnGuiConfig.getString(s + ".display_name", cbnglzggvx(bjhwlzbmggpqrvo(), n4)));
        final int n5 = 0x27B3052B ^ n4;
        final List<String> hex2 = Hex.hex((List<String>)this.afkSpawnGuiConfig.getStringList(s + ".lore"));
        final int n6 = 0x41380C4A ^ n5;
        final ItemStack itemStack = new ItemStack(material);
        final int n7 = 0x3EBE98F2 ^ n6;
        final ItemMeta itemMeta = itemStack.getItemMeta();
        int n8 = 0x76236AD3 ^ n7;
        Label_0341: {
            if (itemMeta == null) {
                Label_0444: {
                Label_0436:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                            case 315332059: {
                                continue;
                            }
                            case 227753741: {
                                break Label_0436;
                            }
                            case 896405110: {
                                break Label_0444;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n8 ^= 0x4E9B065;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) == 100619684) {
                    break Label_0341;
                }
                blbquqyvjqgjhvwn(n8, 1389474373);
                throw new IllegalAccessException();
            }
            itemMeta.setDisplayName(hex);
            itemMeta.setLore((List)hex2);
            itemStack.setItemMeta(itemMeta);
        }
        this.afkItems.put((Object)n, (Object)itemStack);
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0x6274D17A ^ (0x2145BF7F ^ (0x4082C99C ^ (this.NV6ekYepud ^ n)));
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, (int)(byte)(0x2653835F ^ n2), this.guiTitle);
        final int n3 = 0x16A753AC ^ n2;
        this.loadAfkConfigValues$568738828(1586297296);
        final int n4 = 0x207D60C7 ^ n3;
        final Iterator iterator = this.afkItems.entrySet().iterator();
        int blbquqyvjqgjhvwn = 0x4A46E6EF ^ n4;
        while ((iterator.hasNext() ? 1 : 0) != (0x5ACF56ED ^ blbquqyvjqgjhvwn)) {
            final int n5 = 0x16BDC8DF ^ blbquqyvjqgjhvwn;
            final Map.Entry entry = (Map.Entry)iterator.next();
            final int n6 = 0x15CE6469 ^ n5;
            inventory.setItem((int)entry.getKey(), (ItemStack)entry.getValue());
            int n7 = 0x3278DAB5 ^ n6;
            Label_0316: {
            Label_0308:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                        case 340997168: {
                            continue;
                        }
                        case 13341705: {
                            break Label_0308;
                        }
                        case 1825568023: {
                            break Label_0316;
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
                n7 ^= 0xD6829C7;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 116209427) {
                        throw null;
                    }
                    throw new IOException();
                }
                catch (final IOException ex) {
                    int blbquqyvjqgjhvwn2 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n7)) {
                        case 895502667: {
                            blbquqyvjqgjhvwn2 = (0x68AFCF4B ^ n7);
                            break;
                        }
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case -1304675606: {
                            blbquqyvjqgjhvwn2 = blbquqyvjqgjhvwn(n7, 1480868159);
                            break;
                        }
                    }
                    blbquqyvjqgjhvwn = blbquqyvjqgjhvwn(blbquqyvjqgjhvwn2, 1422692495);
                    continue;
                }
            }
            break;
        }
        Label_0468: {
        Label_0460:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn)) {
                    case 1403952885: {
                        continue;
                    }
                    case 267510436: {
                        break Label_0460;
                    }
                    case 1757421771: {
                        break Label_0468;
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
            }
            blbquqyvjqgjhvwn ^= 0x4A445549;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn) == 870278) {
            blbquqyvjqgjhvwn(blbquqyvjqgjhvwn, 240782072);
            return inventory;
        }
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn)) {
                case 1909684369: {
                    continue;
                }
                case 870278: {}
                default: {
                    throw new RuntimeException();
                }
            }
        }
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        final int n2 = 0x54270746 ^ (0x4F876422 ^ (0x3DC4FF16 ^ (this.NV6ekYepud ^ n)));
        final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
        final int n3 = 0x52D19D65 ^ n2;
        final ItemStack itemStack$386585608 = wrappedClickEvent.getItemStack$386585608(389697697);
        final int n4 = 0x5ED8CE72 ^ n3;
        if (itemStack$386585608 != null) {
            final int n5 = 0x4035F1AC ^ n4;
            if (itemStack$386585608.getType() != Material.AIR) {
                final int n6 = 0x6319F916 ^ n5;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 54330822) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 1576016457: {
                                continue;
                            }
                            case 54330822: {}
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
                else {
                    int n7 = 0x627659A0 ^ n6;
                    if (wrappedClickEvent.getSlot$2125716982(2104088370) == (byte)(0x704655CF ^ n7)) {
                        final int n8 = 0x24F9056B ^ n7;
                        final ArrayList list = new ArrayList(this.sqLiteManager.getAfkNumber$322438506().values());
                        final int n9 = 0x11487EB ^ n8;
                        if ((((List)list).isEmpty() ? 1 : 0) == (0x55ABD77E ^ n9)) {
                            final int n10 = 0x608AA180 ^ n9;
                            Collections.shuffle((List)list);
                            final int n11 = 0x3D4B84A9 ^ n10;
                            final Location location = (Location)((List)list).get((int)(byte)(0x86AF257 ^ n11));
                            final int n12 = 0x2526ECA3 ^ n11;
                            player$624284539.closeInventory();
                            final int n13 = 0x22575EE ^ n12;
                            this.teleportManager.teleportWithCountdown$168586022(player$624284539, location, 1255099300);
                            final int n14 = 0x59294A8C ^ (0x1EC9F321 ^ n13);
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14) != 176906443) {
                                    throw null;
                                }
                                throw new RuntimeException();
                            }
                            catch (final RuntimeException ex) {
                                int blbquqyvjqgjhvwn = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n14)) {
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                    case 489666090: {
                                        blbquqyvjqgjhvwn = blbquqyvjqgjhvwn(n14, 929824879);
                                        break;
                                    }
                                    case 1146000827: {
                                        blbquqyvjqgjhvwn = (0x1C40241D ^ n14);
                                        break;
                                    }
                                }
                                blbquqyvjqgjhvwn(blbquqyvjqgjhvwn, 1232338076);
                                return;
                            }
                        }
                        final int blbquqyvjqgjhvwn2 = blbquqyvjqgjhvwn(n9, 992284463);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn2) != 104115602) {
                            throw new IllegalAccessException();
                        }
                        player$624284539.sendMessage(cbnglzggvx(qyhckvnagwbenbs(), 0x2528CCA6 ^ blbquqyvjqgjhvwn2));
                        return;
                    }
                    Label_0492: {
                    Label_0484:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                case 1694411856: {
                                    continue;
                                }
                                case 159921882: {
                                    break Label_0484;
                                }
                                case 349660440: {
                                    break Label_0492;
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                        n7 ^= 0x2711B5C7;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) == 154801465) {
                        final int blbquqyvjqgjhvwn3 = blbquqyvjqgjhvwn(n7, 1819757715);
                        if ((itemStack$386585608.hasItemMeta() ? 1 : 0) != (0x3B20ACAA ^ blbquqyvjqgjhvwn3)) {
                            final int n15 = 0x5A7A5645 ^ blbquqyvjqgjhvwn3;
                            if ((itemStack$386585608.getItemMeta().hasDisplayName() ? 1 : 0) != (0x615AFAEF ^ n15)) {
                                final int n16 = 0x376FA822 ^ n15;
                                final String displayName = itemStack$386585608.getItemMeta().getDisplayName();
                                final int n17 = 0x5A8EC220 ^ n16;
                                final String stripColor = ChatColor.stripColor(displayName);
                                final int n18 = 0x37F43057 ^ n17;
                                final String replaceAll = stripColor.replaceAll(cbnglzggvx(phbmunmabuqgnlj(), n18), cbnglzggvx(ibffkwvlilihegt(), n18));
                                int n19 = 0x7F4B8DBF ^ n18;
                                if ((replaceAll.isEmpty() ? 1 : 0) == (0x44042D05 ^ n19)) {
                                    final int n20 = 0x2CDC192C ^ n19;
                                    final int int1 = Integer.parseInt(replaceAll);
                                    final int n21 = 0x765B7CE2 ^ n20;
                                    final Map<Integer, Location> afkNumber$322438506 = this.sqLiteManager.getAfkNumber$322438506();
                                    final int n22 = 0x277F8B27 ^ n21;
                                    final Location location2 = (Location)afkNumber$322438506.get((Object)int1);
                                    final int n23 = 0x64766FB1 ^ n22;
                                    if (location2 != null) {
                                        final int n24 = 0x4C47FFF5 ^ n23;
                                        player$624284539.closeInventory();
                                        int n25 = 0x554932F1 ^ n24;
                                        this.teleportManager.teleportWithCountdown$168586022(player$624284539, location2, 1255099300);
                                        Label_0996: {
                                        Label_0988:
                                            while (true) {
                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n25)) {
                                                    case 462230290: {
                                                        continue;
                                                    }
                                                    case 79706136: {
                                                        break Label_0988;
                                                    }
                                                    case 360526603: {
                                                        break Label_0996;
                                                    }
                                                    default: {
                                                        throw new IllegalAccessException();
                                                    }
                                                }
                                            }
                                            n25 ^= 0x368AA94F;
                                            try {
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n25) != 217895332) {
                                                    throw null;
                                                }
                                                throw new RuntimeException();
                                            }
                                            catch (final RuntimeException ex2) {
                                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n25)) {
                                                    default: {
                                                        throw new IOException("Error in hash");
                                                    }
                                                    case -1871298381: {
                                                        break;
                                                    }
                                                    case -504224902: {
                                                        break;
                                                    }
                                                }
                                                return;
                                            }
                                        }
                                    }
                                    final int blbquqyvjqgjhvwn4 = blbquqyvjqgjhvwn(n23, 1977372343);
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn4) != 237535219) {
                                        throw new IllegalAccessException();
                                    }
                                    player$624284539.sendMessage(cbnglzggvx(xabpfmhngjrlrnp(), 0x58A84465 ^ blbquqyvjqgjhvwn4));
                                }
                                else {
                                    Label_1328: {
                                    Label_1320:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n19)) {
                                                case 819564551: {
                                                    continue;
                                                }
                                                case 63460157: {
                                                    break Label_1320;
                                                }
                                                case 471696095: {
                                                    break Label_1328;
                                                }
                                                default: {
                                                    throw new IllegalAccessException();
                                                }
                                            }
                                        }
                                        n19 ^= 0x6022152E;
                                    }
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n19) != 101329141) {
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n19)) {
                                                case 1447821004: {
                                                    continue;
                                                }
                                                case 101329141: {}
                                                default: {
                                                    throw new IllegalAccessException();
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        blbquqyvjqgjhvwn(n19, 1214431625);
                                    }
                                }
                            }
                            else if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(0x6FF31FD7 ^ n15) != 208216757) {
                                throw new IllegalAccessException();
                            }
                        }
                        else {
                            final int n26 = 0x69E5706F ^ blbquqyvjqgjhvwn3;
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n26) != 6228344) {
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n26)) {
                                        case 664868132: {
                                            continue;
                                        }
                                        case 6228344: {}
                                        default: {
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                            }
                            else {
                                blbquqyvjqgjhvwn(n26, 1048651111);
                            }
                        }
                        return;
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                            case 51240334: {
                                continue;
                            }
                            case 154801465: {}
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
            }
        }
        else {
            final int blbquqyvjqgjhvwn5 = blbquqyvjqgjhvwn(n4, 416191937);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(blbquqyvjqgjhvwn5) != 17289445) {
                blbquqyvjqgjhvwn(blbquqyvjqgjhvwn5, 1227425942);
                throw new IllegalAccessException();
            }
        }
    }
    
    public void removeAfkItem(final int n) {
        this.afkItems.remove((Object)(n - (byte)(0xB63C875 ^ (0xB37CECB ^ (0x3A18B071 ^ (0x462AF6FB ^ this.NV6ekYepud))))));
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0x622DC015 ^ (0x6D9F51F1 ^ (0x4A60826E ^ (this.NV6ekYepud ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x30859CEB ^ (0x2DCE9BF5 ^ (0x8B92156 ^ (this.NV6ekYepud ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x141FDEF3 ^ (0x1372421 ^ (0x2FF7DBE7 ^ (this.NV6ekYepud ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (AfkGUI.nothing_to_see_here = new String[15])[0] = "\u2804\u2804\u2804\u28b0\u28e7\u28fc\u28ef\u2804\u28f8\u28e0\u28f6\u28f6\u28e6\u28fe\u2804\u2804\u2804\u2804\u2840\u2804\u2880\u28ff\u28ff\u2804\u2804\u2804\u28b8\u2847\u2804\u2804";
        AfkGUI.nothing_to_see_here[1] = "\u2804\u2804\u2804\u28fe\u28ff\u283f\u283f\u2836\u283f\u28bf\u28ff\u28ff\u28ff\u28ff\u28e6\u28e4\u28c4\u2880\u2845\u28a0\u28fe\u28db\u2849\u2804\u2804\u2804\u2838\u2880\u28ff\u2804";
        AfkGUI.nothing_to_see_here[2] = "\u2804\u2804\u2880\u284b\u28e1\u28f4\u28f6\u28f6\u2840\u2804\u2804\u2819\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28f4\u28ff\u28ff\u28ff\u2883\u28e4\u28c4\u28c0\u28e5\u28ff\u28ff\u2804";
        AfkGUI.nothing_to_see_here[3] = "\u2804\u2804\u28b8\u28c7\u283b\u28ff\u28ff\u28ff\u28e7\u28c0\u2880\u28e0\u284c\u28bb\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28ff\u28ff\u28ff\u2804";
        AfkGUI.nothing_to_see_here[4] = "\u2804\u2880\u28b8\u28ff\u28f7\u28e4\u28e4\u28e4\u28ec\u28d9\u28db\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u28ff\u28ff\u284d\u2804\u2804\u2880\u28e4\u28c4\u2809\u280b\u28f0";
        AfkGUI.nothing_to_see_here[5] = "\u2804\u28fc\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u2887\u28ff\u28ff\u2877\u2836\u2836\u28bf\u28ff\u28ff\u2807\u2880\u28e4";
        AfkGUI.nothing_to_see_here[6] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u2847\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28f6\u28e5\u28f4\u28ff\u2857";
        AfkGUI.nothing_to_see_here[7] = "\u2880\u2808\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u285f\u2804";
        AfkGUI.nothing_to_see_here[8] = "\u28b8\u28ff\u28e6\u28cc\u28db\u28fb\u28ff\u28ff\u28e7\u2819\u281b\u281b\u286d\u2805\u2812\u2826\u282d\u28ed\u287b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2804";
        AfkGUI.nothing_to_see_here[9] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2846\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2839\u2808\u288b\u28fd\u28ff\u28ff\u28ff\u28ff\u28f5\u28fe\u2803\u2804";
        AfkGUI.nothing_to_see_here[10] = "\u2804\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2804\u28f4\u28ff\u28f6\u28c4\u2804\u28f4\u28f6\u2804\u2880\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2804\u2804";
        AfkGUI.nothing_to_see_here[11] = "\u2804\u2804\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2844\u28bb\u28ff\u28ff\u28ff\u2804\u28ff\u28ff\u2840\u28fe\u28ff\u28ff\u28ff\u28ff\u28db\u281b\u2801\u2804\u2804\u2804";
        AfkGUI.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2808\u281b\u28bf\u28ff\u28ff\u28ff\u2801\u281e\u28bf\u28ff\u28ff\u2844\u28bf\u28ff\u2847\u28f8\u28ff\u28ff\u283f\u281b\u2801\u2804\u2804\u2804\u2804\u2804";
        AfkGUI.nothing_to_see_here[13] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2809\u283b\u28ff\u28ff\u28fe\u28e6\u2859\u283b\u28f7\u28fe\u28ff\u2803\u283f\u280b\u2801\u2804\u2804\u2804\u2804\u2804\u2880\u28e0\u28f4";
        AfkGUI.nothing_to_see_here[14] = "\u28ff\u28ff\u28ff\u28f6\u28f6\u28ee\u28e5\u28d2\u2832\u28ae\u28dd\u287f\u28ff\u28ff\u2846\u28ff\u287f\u2803\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28e0\u28f4\u28ff\u28ff\u28ff";
        AfkGUI.gkmsdlfhnn = lyxnvmwrgttgjrx();
        AfkGUI.6Mktfpr5ue = (0x3935A12F ^ new Random(454226240799652523L).nextInt());
    }
    
    public static String cbnglzggvx(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= AfkGUI.gkmsdlfhnn[i % AfkGUI.gkmsdlfhnn.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] lyxnvmwrgttgjrx() {
        return new byte[] { 19, 70, 65, 41, 24, 101, 38, 117, 17, 25, 82, 21, 120, 42, 11, 74, 40, 81, 127, 26, 39, 83, 121, 60, 39, 120, 104, 9, 31, 15, 12, 127, 8, 117, 15, 88, 90, 71, 90, 14, 4, 98, 66, 47, 124, 102, 94, 35, 15, 91, 91, 2, 70, 22, 12, 79, 18, 71, 41, 11, 49, 9, 61, 66, 5, 31, 117, 51, 101, 96, 104, 21, 8, 51, 80, 41, 88, 5, 68, 125, 9, 12, 100, 44, 67, 41, 4, 3, 3, 46, 41, 39, 28, 24, 89, 117, 5, 112, 62, 46, 107, 68, 46, 77, 3, 80, 94, 53, 52, 55, 117, 59, 16, 120, 108, 86, 116 };
    }
    
    private static byte[] ukafbobzrkfoenm() {
        return new byte[] { -37, -118, 119, 126, 41, 49, 19, 41, 32, 112, 97, 68, 78, 110, 57, 22, 31, 78, 73, 68, 17, 4, 72, 118, 18, 63, 89, 83, 44, 88, 58, 55, 58, 37, 56, 27, 108, 7, 108, 22, 53, 52, 119, 113, 77, 35, 109, 101, 57, 6, 105, 86, 113, 94, 58, 35, 36, 31, 24, 88, 4, 83, 12, 17 };
    }
    
    private static byte[] qbzzdihdtdtstgt() {
        return new byte[] { -36, -117, 113, 123, 42, 55, 21, 46, 36, 127, 99, 64, 72, 108, 57, 23, 27, 79, 74, 66, 22, 7, 73, 100, 21, 19, 91, 85, 42, 89, 61, 63, 56, 35 };
    }
    
    private static byte[] hbsbwaznpwyocrq() {
        return new byte[] { -36, -115, 119, 58, 32, 59, 23, 35, 34, 81, 99, 126, 78, 108, 51, 21, 25, 7, 76, 83, 22, 2, 79, 120, 31, 56, 89, 27 };
    }
    
    private static byte[] tuevegopvisgnxa() {
        return new byte[] { -36, -114, 121, 120, 41, 54, 18, 45, 36, 115, 99, 69, 64, 111, 58, 22, 28, 76, 74, 66, 22, 5, 65, 116, 22, 18, 92, 74, 42, 86, 61, 41, 48, 60, 62, 8, 110, 6, 111, 72 };
    }
    
    private static byte[] kpdvzpjmzjrajkk() {
        return new byte[] { -34, -114, 114, 112, 42, 51, 18, 40, 41, 117, 101, 65, 64, 109, 59, 23, 30, 71, 76, 79, 20, 10, 75, 111, 19, 37, 80, 101, 40, 76, 52, 44, 56, 38, 57, 5, 105, 47, 105, 87, 54, 32, 118, 107, 68, 58, 105, 103 };
    }
    
    private static byte[] yngexuuzyluppzl() {
        return new byte[] { -37, -113, 119, 61, 47, 34, 20, 42, 34, 78, 100, 90, 73, 120, 60, 10, 27, 17, 73, 9 };
    }
    
    private static byte[] mknkyepdbbmmsmx() {
        return new byte[] { -36, -117, 112, 113, 44, 50, 23, 43, 40, 118, 99, 64, 73, 102, 63, 18, 25, 74, 70, 71, 22, 0, 72, 125, 19, 57, 89, 80, 38, 94, 61, 52, 57, 41, 59, 27, 107, 1, 99, 16, 53, 60, 115, 121, 72, 37, 111, 115 };
    }
    
    private static byte[] idhmvgougwzxygz() {
        return new byte[] { -36, -118, 113, 120, 46, 58, 23, 43, 33, 114, 99, 65, 72, 111, 61, 26, 25, 74, 79, 79, 22, 6, 73, 103 };
    }
    
    private static byte[] wamgnouvlafbztv() {
        return new byte[] { -36, -127, 116, 126, 33, 53, 16, 38, 36, 127, 99, 74, 77, 105, 50, 21, 30, 71, 74, 66, 22, 13, 76, 97, 30, 17, 94, 95, 42, 87, 61, 42, 61, 38 };
    }
    
    private static byte[] isngerraxqehdlo() {
        return new byte[] { -36, -127, 116, 58, 33, 61, 16, 56, 36, 77, 99, 79, 77, 121, 50, 14, 30, 76 };
    }
    
    private static byte[] ovvgivfpfvrmpnm() {
        return new byte[] { -36, -118, 116, 112, 43, 59, 20, 46, 34, 118, 99, 65, 77, 103, 56, 27, 26, 79, 76, 68, 22, 5, 76, 124, 20, 52, 90, 102, 44, 79, 61, 45, 61, 42, 60, 5, 104, 40, 105, 95, 53, 35, 119, 101, 79, 49, 108, 100 };
    }
    
    private static byte[] bjhwlzbmggpqrvo() {
        return new byte[] { -36, -116, 117, 85, 43, 56, 20, 33, 38, 75, 99, 85, 76, 126, 56, 6, 26, 67, 72, 103, 22, 7, 77, 105, 20, 37 };
    }
    
    private static byte[] oyawokyyjqettbg() {
        return new byte[] { -33, -119, 119, 74, 44, 8, 18, 12, 32, 101, 96, 96 };
    }
    
    private static byte[] phbmunmabuqgnlj() {
        return new byte[] { -44, -128, 116, 66, 47, 15, 20, 118, 37, 13, 107, 25, 72, 64 };
    }
    
    private static byte[] ibffkwvlilihegt() {
        return new byte[0];
    }
    
    private static byte[] xabpfmhngjrlrnp() {
        return new byte[] { -36, -127, 120, 93, 47, 48, 16, 39, 38, 12, 99, 93, 65, 112, 60, 16, 30, 6, 72, 91, 22, 75, 64, 103, 16, 36, 94, 68, 40, 26, 61, 33, 49, 47, 56, 30, 108, 16, 109, 95, 53, 116 };
    }
    
    private static byte[] qyhckvnagwbenbs() {
        return new byte[] { -36, -117, 119, 94, 41, 61, 19, 96, 37, 75, 99, 65, 78, 120, 58, 93, 29, 20, 75, 70, 22, 8, 79, 107, 22, 59, 93, 79, 43, 28, 61, 44, 62, 58, 62, 14, 111, 27, 110, 81, 53, 49, 116, 116, 77, 61, 107, 115, 59, 70 };
    }
    
    private static int blbquqyvjqgjhvwn(final int n, final int n2) {
        return n ^ n2;
    }
}
