package dev.daniboy.donutcore.gui.impl;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.IOException;
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
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.inventory.ItemStack;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.gui.AbstractGui;

public class RulesGUI extends AbstractGui
{
    private final Map<Player, Object[]> opened;
    private final Map<Integer, String> slotRulesCommandMap;
    private final DonutCore plugin;
    private String title;
    private int size;
    private final Map<Integer, ItemStack> items;
    private static int ihz4GhIM0J = 0;
    private transient int 1SGelhQcn1 = 28756755;
    private static byte[] qmphhugeeh;
    private static String[] nothing_to_see_here;
    
    public RulesGUI(final DonutCore plugin, final int n) {
        final int n2 = 0x74D42BB9 ^ 0x71901DC9;
        super(plugin, 1156425752);
    Label_0075:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 1661369476: {
                    continue;
                }
                case 82835021: {}
                case 691907912: {
                    break Label_0075;
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
        int n3 = 0xA38C491 ^ (0x21D5210A ^ (Integer.parseInt("2082587670") ^ n));
        Label_0155: {
        Label_0148:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                    case 1878882723: {
                        continue;
                    }
                    case 84994481: {
                        break Label_0148;
                    }
                    case 587390516: {
                        break Label_0155;
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
            }
            n3 ^= 0x1F3990D3;
        }
        this.opened = (Map<Player, Object[]>)new HashMap();
        this.slotRulesCommandMap = (Map<Integer, String>)new HashMap();
        this.items = (Map<Integer, ItemStack>)new HashMap();
        this.plugin = plugin;
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0x3A822B6F ^ (0x332716FE ^ (0x76CE3538 ^ (this.1SGelhQcn1 ^ n)));
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, this.size, this.title);
        final int n3 = 0x41ABD25A ^ n2;
        final Iterator iterator = this.items.entrySet().iterator();
        int rseyqugetnctdjqz = 0x5636C1CF ^ n3;
        while ((iterator.hasNext() ? 1 : 0) != (0x7B5AC368 ^ rseyqugetnctdjqz)) {
            final int n4 = 0x3EAD7877 ^ rseyqugetnctdjqz;
            final Map.Entry entry = (Map.Entry)iterator.next();
            final int n5 = 0x3E24792 ^ n4;
            inventory.setItem((int)entry.getKey(), (ItemStack)entry.getValue());
            int n6 = 0x610120AC ^ n5;
            Label_0427: {
            Label_0420:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                        case 1421013557: {
                            continue;
                        }
                        case 196627819: {
                            break Label_0420;
                        }
                        case 1712631136: {
                            break Label_0427;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
                n6 ^= 0x33C9C32F;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 141326582) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    int n7 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n6)) {
                        case -1494681488: {
                            n7 = (0x2BF5AAB0 ^ n6);
                            break;
                        }
                        case -476259936: {
                            n7 = (0x235B2E8A ^ n6);
                            break;
                        }
                        default: {
                            throw new RuntimeException("Error in hash");
                        }
                    }
                    rseyqugetnctdjqz = rseyqugetnctdjqz(n7, 1148352214);
                    continue;
                }
            }
            throw new IllegalAccessException();
        }
        Label_0291: {
        Label_0284:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz)) {
                    case 340613723: {
                        continue;
                    }
                    case 251634115: {
                        break Label_0284;
                    }
                    case 1145588523: {
                        break Label_0291;
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
            }
            rseyqugetnctdjqz ^= 0x41493A25;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz) == 8816918) {
            return inventory;
        }
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz)) {
                case 1721495940: {
                    continue;
                }
                case 8816918: {}
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        final int n2 = 0x149C24DD ^ (0x7E1DE2A3 ^ (0xB8803B2 ^ (this.1SGelhQcn1 ^ n)));
        final int slot$2125716982 = wrappedClickEvent.getSlot$2125716982(2104088370);
        final int n3 = 0x6180BF9A ^ n2;
        final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
        final int n4 = 0x63866E5D ^ n3;
        Label_0192: {
            if ((this.isInGUI$652632361(player$624284539, 901967400) ? 1 : 0) != (0x4E32232E ^ n4)) {
                final int n5 = 0x62F45041 ^ n4;
                final String s = (String)this.slotRulesCommandMap.get((Object)slot$2125716982);
                int n6 = 0x2B2F1EBA ^ n5;
                if (s != null) {
                    player$624284539.performCommand(s);
                }
                else {
                    Label_0247: {
                    Label_0240:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                case 567037721: {
                                    continue;
                                }
                                case 124440862: {
                                    break Label_0240;
                                }
                                case 202593607: {
                                    break Label_0247;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        n6 ^= 0x6B366C21;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 49315607) {
                        rseyqugetnctdjqz(n6, 822861912);
                        throw new RuntimeException();
                    }
                Label_0316:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 942093420: {
                                break Label_0192;
                            }
                            case 1568990944: {
                                continue;
                            }
                            case 49315607: {
                                break Label_0316;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
            else {
                final int rseyqugetnctdjqz = rseyqugetnctdjqz(n4, 886547424);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz) != 236770154) {
                    throw new RuntimeException();
                }
                rseyqugetnctdjqz(rseyqugetnctdjqz, 586468384);
            }
        }
    }
    
    public void loadRulesConfigValues$113812495(final int n) {
        final int n2 = 0x548297BE ^ (0x72806350 ^ (0x38FEB9E9 ^ (this.1SGelhQcn1 ^ n)));
        final FileConfiguration rulesGuiConfig$546180320 = this.plugin.getRulesGuiConfig$546180320(482433505);
        final int n3 = 0x626C580 ^ n2;
        this.title = Hex.hex(rulesGuiConfig$546180320.getString(zkdbypvnci(jtoneooecgdcygw(), n3)));
        final int n4 = 0x21F6F49E ^ n3;
        this.size = rulesGuiConfig$546180320.getInt(zkdbypvnci(stickxxmddzvthu(), n4));
        final int n5 = 0x4DF0BFF5 ^ n4;
        final ConfigurationSection configurationSection = rulesGuiConfig$546180320.getConfigurationSection(zkdbypvnci(qrkeabyodrcjflb(), n5));
        int n6 = 0x26220EBA ^ n5;
        if (configurationSection != null) {
            final int n7 = 0x613F440D ^ n6;
            final Iterator iterator = configurationSection.getKeys((boolean)((byte)(0x65869D42 ^ n7) != 0)).iterator();
            int n8 = 0x6F47C8B8 ^ n7;
            while ((iterator.hasNext() ? 1 : 0) != (0xAC155FA ^ n8)) {
                final int n9 = 0x4DED47E4 ^ n8;
                final String s = (String)iterator.next();
                final int n10 = 0x65619564 ^ n9;
                final String s2 = "rules_gui.items." + s;
                final int n11 = 0x4CFECF88 ^ n10;
                final String hex = Hex.hex(rulesGuiConfig$546180320.getString(s2 + "display_name"));
                final int n12 = 0x1A2DEBFB ^ n11;
                final Material material = Material.getMaterial(rulesGuiConfig$546180320.getString(s2 + "material"));
                final int n13 = 0x36604D9C ^ n12;
                final List lore = (List)rulesGuiConfig$546180320.getStringList(s2 + "lore").stream().map(Hex::hex).collect(Collectors.toList());
                final int n14 = 0x5828217C ^ n13;
                final int int1 = rulesGuiConfig$546180320.getInt(s2 + "slot");
                final int n15 = 0x73F7D5B7 ^ n14;
                final ItemStack itemStack = new ItemStack(material);
                final int n16 = 0x23665D4C ^ n15;
                final ItemMeta itemMeta = itemStack.getItemMeta();
                int n17 = 0x5D4DAD34 ^ n16;
                int rseyqugetnctdjqz;
                if (itemMeta != null) {
                    final int n18 = 0xBFDCA40 ^ n17;
                    itemMeta.setDisplayName(hex);
                    final int n19 = 0x3323C5B7 ^ n18;
                    itemMeta.setLore(lore);
                    final int n20 = 0x68DBA89 ^ n19;
                    final ItemMeta itemMeta2 = itemMeta;
                    final ItemFlag[] array = new ItemFlag[(byte)(0x29595F59 ^ n20)];
                    array[(byte)(0x29595F58 ^ n20)] = ItemFlag.HIDE_ATTRIBUTES;
                    itemMeta2.addItemFlags(array);
                    final int n21 = 0x7CAFAD30 ^ n20;
                    final ItemMeta itemMeta3 = itemMeta;
                    final ItemFlag[] array2 = new ItemFlag[(byte)(0x55F6F269 ^ n21)];
                    array2[(byte)(0x55F6F268 ^ n21)] = ItemFlag.HIDE_DESTROYS;
                    itemMeta3.addItemFlags(array2);
                    final int n22 = 0x64C84BDC ^ n21;
                    final ItemMeta itemMeta4 = itemMeta;
                    final ItemFlag[] array3 = new ItemFlag[(byte)(0x313EB9B5 ^ n22)];
                    array3[(byte)(0x313EB9B4 ^ n22)] = ItemFlag.HIDE_ENCHANTS;
                    itemMeta4.addItemFlags(array3);
                    final int n23 = 0x5B41DB3B ^ n22;
                    final ItemMeta itemMeta5 = itemMeta;
                    final ItemFlag[] array4 = new ItemFlag[(byte)(0x6A7F628E ^ n23)];
                    array4[(byte)(0x6A7F628F ^ n23)] = ItemFlag.HIDE_PLACED_ON;
                    itemMeta5.addItemFlags(array4);
                    final int n24 = 0x225432E0 ^ n23;
                    final ItemMeta itemMeta6 = itemMeta;
                    final ItemFlag[] array5 = new ItemFlag[(byte)(0x482B506E ^ n24)];
                    array5[(byte)(0x482B506F ^ n24)] = ItemFlag.HIDE_POTION_EFFECTS;
                    itemMeta6.addItemFlags(array5);
                    final int n25 = 0x50877296 ^ n24;
                    final ItemMeta itemMeta7 = itemMeta;
                    final ItemFlag[] array6 = new ItemFlag[(byte)(0x18AC22F8 ^ n25)];
                    array6[(byte)(0x18AC22F9 ^ n25)] = ItemFlag.HIDE_UNBREAKABLE;
                    itemMeta7.addItemFlags(array6);
                    final int n26 = 0x7ED30734 ^ n25;
                    itemStack.setItemMeta(itemMeta);
                    rseyqugetnctdjqz = (0x5BE39052 ^ n26);
                }
                else {
                    Label_1640: {
                    Label_1632:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                case 865553196: {
                                    continue;
                                }
                                case 212152995: {
                                    break Label_1632;
                                }
                                case 1989319768: {
                                    break Label_1640;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        n17 ^= 0x19DE6CC7;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 213633927) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                case 1747511002: {
                                    continue;
                                }
                                case 213633927: {}
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                    }
                    else {
                        rseyqugetnctdjqz = rseyqugetnctdjqz(n17, 860369790);
                    }
                }
                this.items.put((Object)int1, (Object)itemStack);
                final int n27 = 0x17D46151 ^ rseyqugetnctdjqz;
                int rseyqugetnctdjqz2;
                if ((rulesGuiConfig$546180320.contains(s2 + "command") ? 1 : 0) != (0x2A48D4CE ^ n27)) {
                    final int n28 = 0xF975A0A ^ n27;
                    final String string = rulesGuiConfig$546180320.getString(s2 + "command");
                    final int n29 = 0x544C1638 ^ n28;
                    this.slotRulesCommandMap.put((Object)int1, (Object)string);
                    rseyqugetnctdjqz2 = (0x1E37244 ^ n29);
                }
                else {
                    final int n30 = 0x218686FF ^ n27;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n30) != 115324144) {
                        throw new IOException();
                    }
                    rseyqugetnctdjqz2 = rseyqugetnctdjqz(n30, 2076096649);
                }
                Label_1356: {
                Label_1348:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz2)) {
                            case 69925238: {
                                continue;
                            }
                            case 165328564: {
                                break Label_1348;
                            }
                            case 405025874: {
                                break Label_1356;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    rseyqugetnctdjqz2 ^= 0x358CDD0;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz2) != 253607793) {
                            throw null;
                        }
                        throw new IOException();
                    }
                    catch (final IOException ex) {
                        int rseyqugetnctdjqz3 = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(rseyqugetnctdjqz2)) {
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case -392188390: {
                                rseyqugetnctdjqz3 = (0x237C6ACB ^ rseyqugetnctdjqz2);
                                break;
                            }
                            case -1723778237: {
                                rseyqugetnctdjqz3 = rseyqugetnctdjqz(rseyqugetnctdjqz2, 222804064);
                                break;
                            }
                        }
                        n8 = (0x74AECAF2 ^ rseyqugetnctdjqz3);
                        continue;
                    }
                }
                break;
            }
            final int rseyqugetnctdjqz4 = rseyqugetnctdjqz(n8, 1444576716);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz4) != 65585459) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rseyqugetnctdjqz4)) {
                        case 927077766: {
                            continue;
                        }
                        case 65585459: {}
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
        }
        else {
            Label_1264: {
            Label_1256:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                        case 2007555744: {
                            continue;
                        }
                        case 74333955: {
                            break Label_1256;
                        }
                        case 2012814550: {
                            break Label_1264;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n6 ^= 0x401A320F;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 83743599) {
                throw new IOException();
            }
            rseyqugetnctdjqz(n6, 446381960);
        }
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0x6D9388FB ^ (0x5C0EF37A ^ (0x7C2C7ECA ^ (this.1SGelhQcn1 ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x74FE4DAF ^ (0x61822061 ^ (0x3EF5DDF2 ^ (this.1SGelhQcn1 ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x2C12F0CD ^ (0x1F1DCF8C ^ (0x19BB2743 ^ (this.1SGelhQcn1 ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (RulesGUI.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        RulesGUI.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
        RulesGUI.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
        RulesGUI.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        RulesGUI.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
        RulesGUI.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        RulesGUI.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
        RulesGUI.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
        RulesGUI.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        RulesGUI.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
        RulesGUI.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
        RulesGUI.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
        RulesGUI.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
        RulesGUI.qmphhugeeh = sylqbmvzlwxyqpy();
        RulesGUI.ihz4GhIM0J = (0x5E09C5B0 ^ new Random(8039635429122645555L).nextInt());
    }
    
    public static String zkdbypvnci(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= RulesGUI.qmphhugeeh[i % RulesGUI.qmphhugeeh.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] sylqbmvzlwxyqpy() {
        return new byte[] { 66, 111, 75, 6, 14, 72, 62, 11, 95, 43, 88, 8, 118, 53, 9, 20, 16, 100, 122, 21, 18, 48, 51, 27, 88, 71, 87, 43, 35, 109, 77, 12, 2, 45, 44, 94, 76, 28, 63, 92, 30, 85, 55, 71, 3, 123, 61, 47 };
    }
    
    private static byte[] jtoneooecgdcygw() {
        return new byte[] { -115, -93, 122, 76, 55, 8, 12, 87, 102, 122, 105, 72, 71, 82, 48, 70, 34, 33, 67, 72, 35, 45, 2, 87, 97, 27, 101, 111, 26, 53, 124, 90 };
    }
    
    private static byte[] stickxxmddzvthu() {
        return new byte[] { -115, -88, 125, 77, 61, 13, 7, 94, 106, 124, 105, 67, 64, 83, 58, 67, 41, 40, 79, 78, 35, 38, 5, 81, 107, 30, 110, 104, 22, 58 };
    }
    
    private static byte[] qrkeabyodrcjflb() {
        return new byte[] { -119, -88, 123, 66, 61, 5, 9, 87, 102, 123, 96, 75, 64, 89, 49, 68, 32, 40, 79, 68, 34, 40, 0, 74, 111, 3, 110, 123, 27, 48, 123, 76 };
    }
    
    private static int rseyqugetnctdjqz(final int n, final int n2) {
        return n2 ^ n;
    }
}
