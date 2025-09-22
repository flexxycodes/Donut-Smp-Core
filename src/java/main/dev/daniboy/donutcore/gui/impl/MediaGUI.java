package dev.daniboy.donutcore.gui.impl;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.Color;
import org.bukkit.inventory.meta.LeatherArmorMeta;
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

public class MediaGUI extends AbstractGui
{
    private final Map<Player, Object[]> opened;
    private final Map<Integer, String> slotMediaCommandMap;
    private final DonutCore plugin;
    private String title;
    private int size;
    private final Map<Integer, ItemStack> items;
    private static int YdbcE8YRJ4 = 0;
    private transient int ZO0bVNNKeV = 1998519904;
    private static byte[] lqklwylrhp;
    private static String[] nothing_to_see_here;
    
    public MediaGUI(final DonutCore plugin, final int n) {
        final int n2 = 0x6A63F975 ^ 0x5586ECD;
        super(plugin, 1156425752);
    Label_0075:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 833994656: {
                    continue;
                }
                case 126032591: {}
                case 1144497204: {
                    break Label_0075;
                }
                default: {
                    throw new IOException();
                }
            }
        }
        int n3 = 0x50FD3FFF ^ (0x7188C59D ^ (Integer.parseInt("746332289") ^ n));
        Label_0155: {
        Label_0148:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                    case 1470870233: {
                        continue;
                    }
                    case 254465826: {
                        break Label_0148;
                    }
                    case 1140816545: {
                        break Label_0155;
                    }
                    default: {
                        throw new IOException();
                    }
                }
            }
            n3 ^= 0x189645A;
        }
        this.opened = (Map<Player, Object[]>)new HashMap();
        this.slotMediaCommandMap = (Map<Integer, String>)new HashMap();
        this.items = (Map<Integer, ItemStack>)new HashMap();
        this.plugin = plugin;
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0xEBF0662 ^ (0x328D4F4A ^ (0x2C20B5C ^ (this.ZO0bVNNKeV ^ n)));
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, this.size, this.title);
        final int n3 = 0x43AD427F ^ n2;
        final Iterator iterator = this.items.entrySet().iterator();
        int sakplmsmaqzgezwi = 0x59316523 ^ n3;
        while ((iterator.hasNext() ? 1 : 0) != (0x43CC8318 ^ sakplmsmaqzgezwi)) {
            final int n4 = 0x7F1C912D ^ sakplmsmaqzgezwi;
            final Map.Entry entry = (Map.Entry)iterator.next();
            final int n5 = 0x15381E58 ^ n4;
            inventory.setItem((int)entry.getKey(), (ItemStack)entry.getValue());
            int n6 = 0x26119518 ^ n5;
            Label_0291: {
            Label_0284:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                        case 1571183719: {
                            continue;
                        }
                        case 250844843: {
                            break Label_0284;
                        }
                        case 200876956: {
                            break Label_0291;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n6 ^= 0x3DF3C26B;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 15999616) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    int sakplmsmaqzgezwi2 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n6)) {
                        case -1873618703: {
                            sakplmsmaqzgezwi2 = sakplmsmaqzgezwi(n6, 1182646259);
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case -121277342: {
                            sakplmsmaqzgezwi2 = (0x2B6F4A61 ^ n6);
                            break;
                        }
                    }
                    sakplmsmaqzgezwi = sakplmsmaqzgezwi(sakplmsmaqzgezwi2, 935028725);
                    continue;
                }
            }
            break;
        }
        final int n7 = 0x1F0058D0 ^ sakplmsmaqzgezwi;
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) == 63747359) {
        Label_0508:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                    case 1287168767: {
                        continue;
                    }
                    case 63747359: {
                        break Label_0508;
                    }
                    default: {
                        throw new IOException();
                    }
                    case 575891618: {
                        break Label_0508;
                    }
                }
            }
            return inventory;
        }
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                case 1363842121: {
                    continue;
                }
                case 63747359: {}
                default: {
                    throw new IOException();
                }
            }
        }
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        final int n2 = 0x54E70A3C ^ (0x1C5971A ^ (0x7F843DD6 ^ (this.ZO0bVNNKeV ^ n)));
        final int slot$2125716982 = wrappedClickEvent.getSlot$2125716982(2104088370);
        final int n3 = 0x2414F59B ^ n2;
        final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
        final int n4 = 0x77F471C7 ^ n3;
        if ((this.isInGUI$652632361(player$624284539, 901967400) ? 1 : 0) != (0x20772DED ^ n4)) {
            final int n5 = 0x45B818C9 ^ n4;
            final String s = (String)this.slotMediaCommandMap.get((Object)slot$2125716982);
            int n6 = 0x6D68A90F ^ n5;
            if (s != null) {
                player$624284539.performCommand(s);
            }
            else {
                Label_0291: {
                Label_0284:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 785381730: {
                                continue;
                            }
                            case 12891700: {
                                break Label_0284;
                            }
                            case 1912651200: {
                                break Label_0291;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n6 ^= 0xCB4E959;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 64109065) {
                    throw new IllegalAccessException();
                }
            }
        }
        else {
            final int n7 = 0x6CE3B3FD ^ n4;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 73383595) {
                sakplmsmaqzgezwi(n7, 2000292);
                throw new IllegalAccessException();
            }
        }
    }
    
    public void loadMediaConfigValues$2120577358(final int n) {
        final int n2 = 0x61601407 ^ (0x33B20C62 ^ (0x3AEECE05 ^ (this.ZO0bVNNKeV ^ n)));
        final FileConfiguration mediaGuiConfig$1766465157 = this.plugin.getMediaGuiConfig$1766465157(1842172223);
        final int n3 = 0x59D2362D ^ n2;
        this.title = Hex.hex(mediaGuiConfig$1766465157.getString(kfvgbegqsn(slttdlewzoswtou(), n3)));
        final int n4 = 0x7B0E5716 ^ n3;
        this.size = mediaGuiConfig$1766465157.getInt(kfvgbegqsn(elfpupqufxcfcfk(), n4));
        final int n5 = 0x160931FF ^ n4;
        final ConfigurationSection configurationSection = mediaGuiConfig$1766465157.getConfigurationSection(kfvgbegqsn(mdxbijkapwjzcho(), n5));
        final int n6 = 0x79431983 ^ n5;
        if (configurationSection != null) {
            final int n7 = 0x4A2F580C ^ n6;
            final Iterator iterator = configurationSection.getKeys((boolean)((byte)(0x52E65EAD ^ n7) != 0)).iterator();
            int sakplmsmaqzgezwi = 0x5C188AF9 ^ n7;
        Label_0233:
            while ((iterator.hasNext() ? 1 : 0) != (0xEFED454 ^ sakplmsmaqzgezwi)) {
                final int n8 = 0x30986C3D ^ sakplmsmaqzgezwi;
                final String s = (String)iterator.next();
                final int n9 = 0x1F16A5AD ^ n8;
                final String s2 = "media_gui.items." + s;
                final int n10 = 0x1685332C ^ n9;
                final String hex = Hex.hex(mediaGuiConfig$1766465157.getString(s2 + "display_name"));
                final int n11 = 0x247F6D30 ^ n10;
                final Material material = Material.getMaterial(mediaGuiConfig$1766465157.getString(s2 + "material"));
                final int n12 = 0x39D0F83E ^ n11;
                final List lore = (List)mediaGuiConfig$1766465157.getStringList(s2 + "lore").stream().map(Hex::hex).collect(Collectors.toList());
                final int n13 = 0x59901DA2 ^ n12;
                final int int1 = mediaGuiConfig$1766465157.getInt(s2 + "slot");
                final int n14 = 0x2C53FF69 ^ n13;
                final ItemStack itemStack = new ItemStack(material);
                final int n15 = 0x2CB1BAAB ^ n14;
                final ItemMeta itemMeta = itemStack.getItemMeta();
                final int n16 = 0x6858F2B2 ^ n15;
                int sakplmsmaqzgezwi4;
                if (itemMeta != null) {
                    final int n17 = 0x3064C7B5 ^ n16;
                    itemMeta.setDisplayName(hex);
                    final int n18 = 0x6063E371 ^ n17;
                    itemMeta.setLore(lore);
                    final int n19 = 0x5F4F776B ^ n18;
                    int sakplmsmaqzgezwi2;
                    if (((itemMeta instanceof LeatherArmorMeta) ? 1 : 0) != (0x1438429B ^ n19)) {
                        final int n20 = 0x2B01BED ^ n19;
                        if ((mediaGuiConfig$1766465157.contains(s2 + "color") ? 1 : 0) != (0x16885976 ^ n20)) {
                            final int n21 = 0x599940F9 ^ n20;
                            final String[] split = mediaGuiConfig$1766465157.getString(s2 + "color").split(kfvgbegqsn(jlnkurhyyaiburg(), n21));
                            final int n22 = 0x67A6E71A ^ n21;
                            ((LeatherArmorMeta)itemMeta).setColor(Color.fromRGB(Integer.parseInt(split[(byte)(0x28B7FE95 ^ n22)]), Integer.parseInt(split[(byte)(0x28B7FE94 ^ n22)]), Integer.parseInt(split[(byte)(0x28B7FE97 ^ n22)])));
                            final int n23 = 0x240D79BB ^ n22;
                            final ItemMeta itemMeta2 = itemMeta;
                            final ItemFlag[] array = new ItemFlag[(byte)(0xCBA872F ^ n23)];
                            array[(byte)(0xCBA872E ^ n23)] = ItemFlag.HIDE_DYE;
                            itemMeta2.addItemFlags(array);
                            final int n24 = 0x7A5A40D6 ^ n23;
                            final ItemMeta itemMeta3 = itemMeta;
                            final ItemFlag[] array2 = new ItemFlag[(byte)(0x76E0C7F9 ^ n24)];
                            array2[(byte)(0x76E0C7F8 ^ n24)] = ItemFlag.HIDE_ATTRIBUTES;
                            itemMeta3.addItemFlags(array2);
                            final int n25 = 0x40122156 ^ n24;
                            final ItemMeta itemMeta4 = itemMeta;
                            final ItemFlag[] array3 = new ItemFlag[(byte)(0x36F2E6AF ^ n25)];
                            array3[(byte)(0x36F2E6AE ^ n25)] = ItemFlag.HIDE_DESTROYS;
                            itemMeta4.addItemFlags(array3);
                            final int n26 = 0x7FB07EB9 ^ n25;
                            final ItemMeta itemMeta5 = itemMeta;
                            final ItemFlag[] array4 = new ItemFlag[(byte)(0x49429816 ^ n26)];
                            array4[(byte)(0x49429817 ^ n26)] = ItemFlag.HIDE_ENCHANTS;
                            itemMeta5.addItemFlags(array4);
                            final int n27 = 0xDD5D088 ^ n26;
                            final ItemMeta itemMeta6 = itemMeta;
                            final ItemFlag[] array5 = new ItemFlag[(byte)(0x4497489E ^ n27)];
                            array5[(byte)(0x4497489F ^ n27)] = ItemFlag.HIDE_PLACED_ON;
                            itemMeta6.addItemFlags(array5);
                            final int n28 = 0x65955A59 ^ n27;
                            final ItemMeta itemMeta7 = itemMeta;
                            final ItemFlag[] array6 = new ItemFlag[(byte)(0x210212C7 ^ n28)];
                            array6[(byte)(0x210212C6 ^ n28)] = ItemFlag.HIDE_POTION_EFFECTS;
                            itemMeta7.addItemFlags(array6);
                            final int n29 = 0x12864EC2 ^ n28;
                            final ItemMeta itemMeta8 = itemMeta;
                            final ItemFlag[] array7 = new ItemFlag[(byte)(0x33845C05 ^ n29)];
                            array7[(byte)(0x33845C04 ^ n29)] = ItemFlag.HIDE_UNBREAKABLE;
                            itemMeta8.addItemFlags(array7);
                            sakplmsmaqzgezwi2 = (0x41E65B9C ^ n29);
                        }
                        else {
                            final int n30 = 0x51680395 ^ n20;
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n30) != 188938231) {
                                sakplmsmaqzgezwi(n30, 1345533459);
                                throw new IOException();
                            }
                            sakplmsmaqzgezwi2 = sakplmsmaqzgezwi(n30, 897736059);
                        }
                    }
                    else {
                        final int sakplmsmaqzgezwi3 = sakplmsmaqzgezwi(n19, 522919814);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(sakplmsmaqzgezwi3) != 91590523) {
                            throw new IOException();
                        }
                        sakplmsmaqzgezwi2 = (0x79715A85 ^ sakplmsmaqzgezwi3);
                    }
                    itemStack.setItemMeta(itemMeta);
                    sakplmsmaqzgezwi4 = (0x506DDB1 ^ sakplmsmaqzgezwi2);
                }
                else {
                    final int n31 = 0x76967145 ^ n16;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n31) != 82720572) {
                        sakplmsmaqzgezwi(n31, 2050296961);
                        throw new IOException();
                    }
                    sakplmsmaqzgezwi4 = sakplmsmaqzgezwi(n31, 444775000);
                }
                this.items.put((Object)int1, (Object)itemStack);
                final int n32 = 0x2AC462C8 ^ sakplmsmaqzgezwi4;
                int sakplmsmaqzgezwi5;
                if ((mediaGuiConfig$1766465157.contains(s2 + "command") ? 1 : 0) != (0x5DA0B8E1 ^ n32)) {
                    final int n33 = 0x3BCF85D8 ^ n32;
                    final String string = mediaGuiConfig$1766465157.getString(s2 + "command");
                    final int n34 = 0x6A012918 ^ n33;
                    this.slotMediaCommandMap.put((Object)int1, (Object)string);
                    sakplmsmaqzgezwi5 = (0x20D4CC03 ^ n34);
                }
                else {
                    final int n35 = 0x62F78B23 ^ n32;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n35) != 179882768) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n35)) {
                                case 1733203880: {
                                    continue;
                                }
                                case 179882768: {}
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                    }
                    else {
                        sakplmsmaqzgezwi5 = sakplmsmaqzgezwi(n35, 334359520);
                    }
                }
                Label_1984: {
                Label_1976:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(sakplmsmaqzgezwi5)) {
                            case 1257318930: {
                                continue;
                            }
                            case 111816315: {
                                break Label_1976;
                            }
                            case 1714599548: {
                                break Label_1984;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    sakplmsmaqzgezwi5 ^= 0x7E3B4253;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(sakplmsmaqzgezwi5) != 266029499) {
                            throw null;
                        }
                        throw new IOException();
                    }
                    catch (final IOException ex) {
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(sakplmsmaqzgezwi5)) {
                            default: {
                                throw new RuntimeException("Error in hash");
                            }
                            case -1371836999: {
                                sakplmsmaqzgezwi = (0x223AD049 ^ sakplmsmaqzgezwi5);
                                break;
                            }
                            case -1811098742: {
                                sakplmsmaqzgezwi = sakplmsmaqzgezwi(sakplmsmaqzgezwi5, 1165764495);
                                break;
                            }
                        }
                    Label_2116:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(sakplmsmaqzgezwi)) {
                                case 702180254: {
                                    continue Label_0233;
                                }
                                case 1209780078: {
                                    continue;
                                }
                                case 242989025: {
                                    break Label_2116;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        sakplmsmaqzgezwi ^= 0x190369AA;
                        continue;
                    }
                }
                throw new IOException();
            }
            final int sakplmsmaqzgezwi6 = sakplmsmaqzgezwi(sakplmsmaqzgezwi, 376392174);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(sakplmsmaqzgezwi6) != 261765385) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(sakplmsmaqzgezwi6)) {
                        case 927589436: {
                            continue;
                        }
                        case 261765385: {}
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
        }
        else {
            final int n36 = 0x7C7904AE ^ n6;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n36) != 51734349) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n36)) {
                        case 1263092132: {
                            continue;
                        }
                        case 51734349: {}
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0x13C22C38 ^ (0x3EC8983A ^ (0x82040AE ^ (this.ZO0bVNNKeV ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x2A5578E8 ^ (0x314C73C1 ^ (0x4AF9E396 ^ (this.ZO0bVNNKeV ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x69DCA512 ^ (0x2B5AC15D ^ (0x6DB71927 ^ (this.ZO0bVNNKeV ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (MediaGUI.nothing_to_see_here = new String[15])[0] = " \u2801\u287c\u280b\u2800\u28c6\u2800\u2800\u28f0\u28ff\u28eb\u28fe\u28bf\u28ff\u28ff\u280d\u28a0\u2820\u2800\u2800\u2880\u2830\u28be\u28fa\u28fb\u28ff\u28ff\u28ff\u28f7\u2840\u2800";
        MediaGUI.nothing_to_see_here[1] = "\u28e5\u2800\u2800\u2800\u2801\u2800\u2820\u28bb\u28ac\u2801\u28e0\u28fe\u281b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2810\u2831\u280f\u2849\u2819\u28ff\u28ff\u2847\u2800";
        MediaGUI.nothing_to_see_here[2] = "\u28b3\u2800\u28b0\u2856\u2800\u2800\u2808\u2800\u28fa\u28b0\u28ff\u28bb\u28fe\u28f6\u28ff\u28ff\u28f6\u28f6\u28e4\u28e4\u28f4\u28fe\u28ff\u28f7\u28fc\u2846\u28b8\u28ff\u28e7\u2800";
        MediaGUI.nothing_to_see_here[3] = "\u2808\u2800\u281c\u2808\u28c0\u28d4\u28e6\u28a8\u28ff\u28ff\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c5\u28fc\u281b\u28b9\u2800";
        MediaGUI.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u288b\u287f\u287f\u28ef\u28ed\u285f\u28df\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2858\u2800";
        MediaGUI.nothing_to_see_here[5] = "\u2840\u2810\u2800\u2800\u2800\u28ff\u28ef\u287f\u28ff\u28ff\u28ff\u28ef\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28c9\u28bd\u28ff\u2846\u2800\u2800";
        MediaGUI.nothing_to_see_here[6] = "\u28b3\u2800\u2804\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2819\u2809\u2809\u2809\u281b\u28fb\u289b\u28ff\u281b\u2803\u2800\u2810\u281b\u283b\u28ff\u2847\u2800\u2800";
        MediaGUI.nothing_to_see_here[7] = "\u28fe\u2804\u2800\u2800\u28b8\u28ff\u28ff\u287f\u281f\u281b\u2801\u2880\u2800\u2880\u2844\u28c0\u28e0\u28fe\u28ff\u28ff\u2860\u28f4\u28ce\u28c0\u28e0\u28e0\u28ff\u2847\u2800\u2800";
        MediaGUI.nothing_to_see_here[8] = "\u28e7\u2800\u28f4\u28c4\u28fd\u28ff\u28ff\u28ff\u28f6\u28f6\u28d6\u28f6\u28ec\u28fe\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800";
        MediaGUI.nothing_to_see_here[9] = "\u28ff\u28f6\u28c8\u286f\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28f9\u28a7\u28ff\u28ff\u28ff\u28c4\u2819\u28bf\u28ff\u28ff\u28ff\u2807\u2800\u2800";
        MediaGUI.nothing_to_see_here[10] = "\u2839\u28ff\u28ff\u28e7\u288c\u28bd\u28fb\u28bf\u28ef\u28ff\u28ff\u28ff\u28ff\u281f\u28e0\u2858\u283f\u281f\u281b\u281b\u281f\u281b\u28e7\u2848\u283b\u28fe\u28ff\u2800\u2800\u2800";
        MediaGUI.nothing_to_see_here[11] = "\u2800\u2808\u2809\u28f7\u287f\u28fd\u2836\u287e\u28bf\u28ff\u28ff\u28ff\u2883\u28e4\u28ff\u28f7\u28e4\u28e4\u28c4\u28c4\u28e0\u28fc\u287f\u28b7\u2880\u28ff\u284f\u2800\u2800\u2800";
        MediaGUI.nothing_to_see_here[12] = "\u2800\u2800\u2880\u28ff\u28f7\u280c\u28c8\u28cf\u28dd\u283d\u287f\u28f7\u28fe\u28cf\u28c0\u28c9\u28c9\u28c0\u28c0\u28c0\u28e0\u28e0\u28c4\u2878\u28fe\u28ff\u2803\u2800\u2800\u2800";
        MediaGUI.nothing_to_see_here[13] = "\u2800\u28f0\u287f\u28ff\u28e7\u2850\u2804\u2831\u28ff\u28fa\u28fd\u289f\u28ff\u28ff\u28bf\u28ff\u28cd\u2809\u2880\u28c0\u28d0\u28fc\u28ef\u2857\u281f\u284f\u2800\u2800\u2800\u2800";
        MediaGUI.nothing_to_see_here[14] = "\u28f0\u28ff\u2800\u28ff\u28ff\u28f4\u2840\u2802\u2818\u28b9\u28ed\u2842\u285a\u283f\u28bf\u28ff\u28ff\u28ff\u287f\u28bf\u28bf\u287f\u283f\u2881\u28f4\u28ff\u28f7\u28f6\u28e6\u28e4";
        MediaGUI.lqklwylrhp = remzwujrifdtldr();
        MediaGUI.YdbcE8YRJ4 = (0x1232205D ^ new Random(289962747667210150L).nextInt());
    }
    
    public static String kfvgbegqsn(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= MediaGUI.lqklwylrhp[i % MediaGUI.lqklwylrhp.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] remzwujrifdtldr() {
        return new byte[] { 12, 47, 28, 59, 89, 74, 22, 122, 125, 86, 61, 17, 60, 114, 79, 84, 30, 21, 29, 49, 108, 20, 111, 122, 84, 16, 75, 124, 75, 21, 92, 23, 75, 68, 63, 17, 50, 74, 71, 52, 105, 48, 71, 29, 5, 113, 110, 88, 48, 110, 48, 98, 107, 75, 49, 117, 10 };
    }
    
    private static byte[] mdxbijkapwjzcho() {
        return new byte[] { -61, -26, 47, 96, 109, 27, 39, 38, 68, 15, 12, 70, 15, 27, 123, 7, 47, 88, 36, 104, 93, 12, 92, 37, 96, 80, 122, 33, 114, 72, 109, 82 };
    }
    
    private static byte[] elfpupqufxcfcfk() {
        return new byte[] { -64, -32, 44, 99, 105, 23, 35, 39, 76, 8, 15, 64, 12, 24, 127, 11, 43, 89, 44, 111, 94, 10, 95, 60, 100, 65, 126, 63, 122, 71 };
    }
    
    private static byte[] slttdlewzoswtou() {
        return new byte[] { -64, -31, 44, 99, 96, 23, 37, 42, 74, 13, 12, 64, 9, 20, 119, 0, 42, 87, 47, 105, 92, 15, 86, 54, 103, 77, 124, 58, 122, 73, 105, 75 };
    }
    
    private static byte[] jlnkurhyyaiburg() {
        return new byte[] { -61, -29, 46, 33 };
    }
    
    private static int sakplmsmaqzgezwi(final int n, final int n2) {
        return n2 ^ n;
    }
}
