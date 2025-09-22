package dev.daniboy.donutcore.gui.impl;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.function.Function;
import java.util.stream.Stream;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemFlag;
import java.util.stream.Collectors;
import java.util.List;
import org.bukkit.Material;
import dev.daniboy.donutcore.utils.Hex;
import dev.daniboy.donutcore.gui.WrappedClickEvent;
import java.util.Iterator;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import java.util.HashMap;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.inventory.ItemStack;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.gui.AbstractGui;

public class HelpGUI extends AbstractGui
{
    private final Map<Player, Object[]> opened;
    private final Map<Integer, String> slotHelpCommandMap;
    private final DonutCore plugin;
    private String title;
    private int size;
    private final Map<Integer, ItemStack> items;
    private static int 6lAgMf2qc9 = 0;
    private transient int eSeMJsajxU = 1307732325;
    private static byte[] vinpiloltu;
    private static String[] nothing_to_see_here;
    
    public HelpGUI(final DonutCore plugin, final int n) {
        final int n2 = 0x7D0257B3 ^ 0x590E2A07;
        super(plugin, 1156425752);
    Label_0086:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 2057413859: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 34451631: {}
                case 98047872: {
                    break Label_0086;
                }
            }
        }
        final int n3 = 0x376F73A0 ^ (0x495F13EF ^ (Integer.parseInt("346814195") ^ n));
        this.opened = (Map<Player, Object[]>)new HashMap();
        this.slotHelpCommandMap = (Map<Integer, String>)new HashMap();
        this.items = (Map<Integer, ItemStack>)new HashMap();
        this.plugin = plugin;
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0x69ABEAAE ^ (0x5AA9DAC8 ^ (0x65E405CE ^ (this.eSeMJsajxU ^ n)));
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, this.size, this.title);
        final int n3 = 0x1C843A9F ^ n2;
        final Iterator iterator = this.items.entrySet().iterator();
        int n4 = 0x33B7E03 ^ n3;
        while ((iterator.hasNext() ? 1 : 0) != (0x49DF9996 ^ n4)) {
            final int n5 = 0x7335826A ^ n4;
            final Map.Entry entry = (Map.Entry)iterator.next();
            final int n6 = 0x2D601C2D ^ n5;
            inventory.setItem((int)entry.getKey(), (ItemStack)entry.getValue());
            int n7 = 0x447EBC19 ^ n6;
            Label_0291: {
            Label_0284:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                        case 1787179757: {
                            continue;
                        }
                        case 44726311: {
                            break Label_0284;
                        }
                        case 1375294561: {
                            break Label_0291;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
                n7 ^= 0x7F4B8711;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 112372059) {
                        throw null;
                    }
                    throw new IOException();
                }
                catch (final IOException ex) {
                    int n8 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n7)) {
                        case 1710876361: {
                            n8 = (0x528636CC ^ n7);
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case -814242608: {
                            n8 = (0x67D7FE8F ^ n7);
                            break;
                        }
                    }
                    n4 = (0x37E69383 ^ n8);
                    continue;
                }
            }
            break;
        }
        final int n9 = 0x4ED146EB ^ n4;
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 111015563) {
            wcdoexwoampjcxjs(n9, 150429935);
            throw new IllegalAccessException();
        }
    Label_0455:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                case 1188771874: {
                    continue;
                }
                case 111015563: {}
                case 1862741966: {
                    break Label_0455;
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
        return inventory;
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        final int n2 = 0x1F011385 ^ (0x67D2A078 ^ (0x18A23344 ^ (this.eSeMJsajxU ^ n)));
        final int slot$2125716982 = wrappedClickEvent.getSlot$2125716982(2104088370);
        final int n3 = 0x136B03CC ^ n2;
        final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
        int n4 = 0x408584FF ^ n3;
        Label_0192: {
            if ((this.isInGUI$652632361(player$624284539, 901967400) ? 1 : 0) != (0xD880059 ^ n4)) {
                final int n5 = 0x38A0303A ^ n4;
                final String s = (String)this.slotHelpCommandMap.get((Object)slot$2125716982);
                final int n6 = 0x72A0F69D ^ n5;
                if (s != null) {
                    player$624284539.performCommand(s);
                }
                else {
                    final int n7 = 0x78783A10 ^ n6;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 199415293) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                case 952602758: {
                                    continue;
                                }
                                case 199415293: {}
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            }
            else {
                Label_0247: {
                Label_0240:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 1489083208: {
                                continue;
                            }
                            case 171412772: {
                                break Label_0240;
                            }
                            case 1629586930: {
                                break Label_0247;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n4 ^= 0x65685D14;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 187882533) {
                    wcdoexwoampjcxjs(n4, 841921840);
                    throw new IOException();
                }
            Label_0308:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                        case 796767344: {
                            break Label_0192;
                        }
                        case 983208575: {
                            continue;
                        }
                        case 187882533: {
                            break Label_0308;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }
    
    public void loadHelpConfigValues$1430792781(final int n) {
        final int n2 = 0x33C523D5 ^ (0x5AF9A5A7 ^ (0xC83BE04 ^ (this.eSeMJsajxU ^ n)));
        final FileConfiguration helpGuiConfig$689393799 = this.plugin.getHelpGuiConfig$689393799(1284949057);
        final int n3 = 0x770DC673 ^ n2;
        this.title = Hex.hex(helpGuiConfig$689393799.getString(rsumticnwh(gpikuwzqzkrnwer(), n3)));
        final int n4 = 0x519BA120 ^ n3;
        this.size = helpGuiConfig$689393799.getInt(rsumticnwh(hbcfhdpfxiyaoca(), n4));
        final int n5 = 0x9F6AD22 ^ n4;
        final ConfigurationSection configurationSection = helpGuiConfig$689393799.getConfigurationSection(rsumticnwh(otfieflgpucrlug(), n5));
        int n6 = 0x6B8FCA34 ^ n5;
        Label_1536: {
            if (configurationSection != null) {
                final int n7 = 0x543EAB8 ^ n6;
                final Iterator iterator = configurationSection.getKeys((boolean)((byte)(0x4F1ED0B2 ^ n7) != 0)).iterator();
                int wcdoexwoampjcxjs = 0x27C0737B ^ n7;
            Label_0233:
                while ((iterator.hasNext() ? 1 : 0) != (0x68DEA3C9 ^ wcdoexwoampjcxjs)) {
                    final int n8 = 0x101DD7DD ^ wcdoexwoampjcxjs;
                    final String s = (String)iterator.next();
                    final int n9 = 0x5C4CB12D ^ n8;
                    final String s2 = "help_gui.items." + s;
                    final int n10 = 0x756906A2 ^ n9;
                    final String hex = Hex.hex(helpGuiConfig$689393799.getString(s2 + "display_name"));
                    final int n11 = 0x5E475E4F ^ n10;
                    final Material material = Material.getMaterial(helpGuiConfig$689393799.getString(s2 + "material"));
                    final int n12 = 0x5A5B68C0 ^ n11;
                    final Stream stream = helpGuiConfig$689393799.getStringList(s2 + "lore").stream();
                    final Function function = Hex::hex;
                    final int n13 = 0x30BC9F15 ^ n12;
                    final Stream map = stream.map(function);
                    final int n14 = 0x457B2EA1 ^ n13;
                    final List lore = (List)map.collect(Collectors.toList());
                    final int n15 = 0x1F3F28B9 ^ n14;
                    final int int1 = helpGuiConfig$689393799.getInt(s2 + "slot");
                    final int n16 = 0x1C605419 ^ n15;
                    final ItemStack itemStack = new ItemStack(material);
                    final int n17 = 0x4DDEC4E5 ^ n16;
                    final ItemMeta itemMeta = itemStack.getItemMeta();
                    final int n18 = 0x52428291 ^ n17;
                    int n28;
                    if (itemMeta != null) {
                        final int n19 = 0x64963B44 ^ n18;
                        itemMeta.setDisplayName(hex);
                        final int n20 = 0x3F819B38 ^ n19;
                        itemMeta.setLore(lore);
                        final int n21 = 0x3BDBA5D2 ^ n20;
                        final ItemMeta itemMeta2 = itemMeta;
                        final ItemFlag[] array = new ItemFlag[(byte)(0x5C327BDB ^ n21)];
                        array[(byte)(0x5C327BDA ^ n21)] = ItemFlag.HIDE_ATTRIBUTES;
                        itemMeta2.addItemFlags(array);
                        final int n22 = 0x39E35D47 ^ n21;
                        final ItemMeta itemMeta3 = itemMeta;
                        final ItemFlag[] array2 = new ItemFlag[(byte)(0x65D1269C ^ n22)];
                        array2[(byte)(0x65D1269D ^ n22)] = ItemFlag.HIDE_DESTROYS;
                        itemMeta3.addItemFlags(array2);
                        final int n23 = 0x264C9091 ^ n22;
                        final ItemMeta itemMeta4 = itemMeta;
                        final ItemFlag[] array3 = new ItemFlag[(byte)(0x439DB60D ^ n23)];
                        array3[(byte)(0x439DB60C ^ n23)] = ItemFlag.HIDE_ENCHANTS;
                        itemMeta4.addItemFlags(array3);
                        final int n24 = 0x596765ED ^ n23;
                        final ItemMeta itemMeta5 = itemMeta;
                        final ItemFlag[] array4 = new ItemFlag[(byte)(0x1AFAD3E0 ^ n24)];
                        array4[(byte)(0x1AFAD3E1 ^ n24)] = ItemFlag.HIDE_PLACED_ON;
                        itemMeta5.addItemFlags(array4);
                        final int n25 = 0x39A01048 ^ n24;
                        final ItemMeta itemMeta6 = itemMeta;
                        final ItemFlag[] array5 = new ItemFlag[(byte)(0x235AC3A8 ^ n25)];
                        array5[(byte)(0x235AC3A9 ^ n25)] = ItemFlag.HIDE_POTION_EFFECTS;
                        itemMeta6.addItemFlags(array5);
                        final int n26 = 0x25011247 ^ n25;
                        final ItemMeta itemMeta7 = itemMeta;
                        final ItemFlag[] array6 = new ItemFlag[(byte)(0x65BD1EF ^ n26)];
                        array6[(byte)(0x65BD1EE ^ n26)] = ItemFlag.HIDE_UNBREAKABLE;
                        itemMeta7.addItemFlags(array6);
                        final int n27 = 0x24FCBF ^ n26;
                        itemStack.setItemMeta(itemMeta);
                        n28 = (0x56F4EC0D ^ n27);
                    }
                    else {
                        final int wcdoexwoampjcxjs2 = wcdoexwoampjcxjs(n18, 1545852867);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wcdoexwoampjcxjs2) != 195893263) {
                            throw new IllegalAccessException();
                        }
                        n28 = (0x305668EB ^ wcdoexwoampjcxjs2);
                    }
                    this.items.put((Object)int1, (Object)itemStack);
                    int n29 = 0x1696656C ^ n28;
                    int n32;
                    if ((helpGuiConfig$689393799.contains(s2 + "command") ? 1 : 0) != (0x461DA430 ^ n29)) {
                        final int n30 = 0x1E933107 ^ n29;
                        final String string = helpGuiConfig$689393799.getString(s2 + "command");
                        final int n31 = 0x7357AF1 ^ n30;
                        this.slotHelpCommandMap.put((Object)int1, (Object)string);
                        n32 = (0x511FBA50 ^ n31);
                    }
                    else {
                        Label_1604: {
                        Label_1596:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n29)) {
                                    case 498767521: {
                                        continue;
                                    }
                                    case 131672064: {
                                        break Label_1596;
                                    }
                                    case 1528347600: {
                                        break Label_1604;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            n29 ^= 0x782B0E11;
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n29) != 143251369) {
                            throw new IllegalAccessException();
                        }
                        n32 = (0x3092FFB7 ^ n29);
                    }
                    final int wcdoexwoampjcxjs3 = wcdoexwoampjcxjs(n32, 1361040885);
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wcdoexwoampjcxjs3) != 159061764) {
                            throw null;
                        }
                        throw new RuntimeException();
                    }
                    catch (final RuntimeException ex) {
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(wcdoexwoampjcxjs3)) {
                            default: {
                                throw new IOException("Error in hash");
                            }
                            case 2120818952: {
                                wcdoexwoampjcxjs = (0xAE30266 ^ wcdoexwoampjcxjs3);
                                break;
                            }
                            case -35912934: {
                                wcdoexwoampjcxjs = wcdoexwoampjcxjs(wcdoexwoampjcxjs3, 1519756836);
                                break;
                            }
                        }
                    Label_1824:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wcdoexwoampjcxjs)) {
                                case 1088083563: {
                                    continue Label_0233;
                                }
                                case 1386060981: {
                                    continue;
                                }
                                case 81479372: {
                                    break Label_1824;
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                        wcdoexwoampjcxjs ^= 0x6DF0858E;
                        continue;
                    }
                    throw new IllegalAccessException();
                }
                Label_1280: {
                Label_1272:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wcdoexwoampjcxjs)) {
                            case 2058120396: {
                                continue;
                            }
                            case 187643275: {
                                break Label_1272;
                            }
                            case 1418181986: {
                                break Label_1280;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    wcdoexwoampjcxjs ^= 0x124DAC80;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wcdoexwoampjcxjs) != 226268942) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wcdoexwoampjcxjs)) {
                            case 2121945817: {
                                continue;
                            }
                            case 226268942: {}
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
                else {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wcdoexwoampjcxjs)) {
                            case 596689099: {
                                continue;
                            }
                            case 226268942: {}
                            case 326978315: {
                                break Label_1536;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
            }
            else {
                Label_1468: {
                Label_1460:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 233031792: {
                                continue;
                            }
                            case 1370670: {
                                break Label_1460;
                            }
                            case 176092502: {
                                break Label_1468;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n6 ^= 0x3A1FBFCF;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 159421295) {
                    wcdoexwoampjcxjs(n6, 1722432857);
                    throw new IllegalAccessException();
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                        case 642407347: {
                            continue;
                        }
                        case 159421295: {}
                        case 2086907737: {
                            break Label_1536;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0x6F9D0C2B ^ (0x34761EF4 ^ (0x6F064E3C ^ (this.eSeMJsajxU ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x5FD97158 ^ (0x4B39D499 ^ (0x2DDFED04 ^ (this.eSeMJsajxU ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x7BB6358D ^ (0x7591C492 ^ (0xA9117B5 ^ (this.eSeMJsajxU ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (HelpGUI.nothing_to_see_here = new String[18])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpGUI.vinpiloltu = ffwjngpxjouqwja();
        HelpGUI.6lAgMf2qc9 = (0x4D130B0D ^ new Random(2255647273756019779L).nextInt());
    }
    
    public static String rsumticnwh(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= HelpGUI.vinpiloltu[i % HelpGUI.vinpiloltu.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] ffwjngpxjouqwja() {
        return new byte[] { 74, 3, 96, 1, 71, 107, 93, 45, 82, 106, 37, 43, 61, 38, 97, 43, 12, 67, 20, 3, 21, 52, 80, 73, 79, 55, 23, 77, 46, 1, 82, 7, 71, 50, 78, 114, 67, 64, 24, 117, 32, 8, 80, 17, 18, 25, 61, 97, 4, 51, 122, 61, 72, 117, 37, 66, 73, 72, 45, 42, 118, 78, 39, 83, 125, 50, 42, 60, 5, 45, 103, 58, 21, 108, 56, 44, 56, 10, 106, 125, 26, 127, 34, 42, 69, 71, 44, 39, 92 };
    }
    
    private static byte[] otfieflgpucrlug() {
        return new byte[] { -127, -54, 87, 93, 112, 60, 108, 120, 98, 47, 19, 67, 9, 118, 83, 111, 53, 26, 33, 27, 34, 105, 103, 15, 126, 107, 39, 21, 24, 69 };
    }
    
    private static byte[] hbcfhdpfxiyaoca() {
        return new byte[] { -126, -53, 83, 93, 112, 63, 106, 118, 96, 44, 18, 71, 9, 118, 80, 105, 59, 24, 34, 26, 38, 115, 103, 17, 120, 122, 37, 30 };
    }
    
    private static byte[] gpikuwzqzkrnwer() {
        return new byte[] { -122, -52, 84, 91, 113, 60, 104, 113, 106, 46, 23, 68, 9, 115, 87, 108, 57, 26, 44, 25, 39, 112, 100, 18, 121, 113, 34, 17, 22, 80 };
    }
    
    private static int wcdoexwoampjcxjs(final int n, final int n2) {
        return n2 ^ n;
    }
}
