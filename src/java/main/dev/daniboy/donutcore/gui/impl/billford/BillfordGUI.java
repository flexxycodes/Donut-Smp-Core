package dev.daniboy.donutcore.gui.impl.billford;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Arrays;
import org.bukkit.inventory.PlayerInventory;
import java.util.Iterator;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.gui.WrappedClickEvent;
import dev.daniboy.donutcore.billford.items.StrengthRod;
import dev.daniboy.donutcore.billford.items.CritMultiplier;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import org.bukkit.Material;
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.inventory.ItemStack;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import dev.daniboy.donutcore.utils.Hex;
import java.util.HashMap;
import org.bukkit.configuration.file.FileConfiguration;
import dev.daniboy.donutcore.DonutCore;
import dev.daniboy.donutcore.database.SQLiteManager;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.gui.AbstractGui;

public class BillfordGUI extends AbstractGui
{
    private final Map<Player, Object[]> opened;
    private final SQLiteManager sqLiteManager;
    private final String anvilDisplayName;
    private final DonutCore plugin;
    private final FileConfiguration billfordGuiConfig;
    private static int teQksBq9uU = 0;
    private transient int btIRYCzsco = 32407622;
    private static byte[] yauzbgmfnf;
    private static String[] nothing_to_see_here;
    
    public BillfordGUI(final DonutCore plugin, final SQLiteManager sqLiteManager, final int n) {
        super(plugin, 1156425752);
        final int n2 = 0x5EBD9E4A ^ (0x69D2C0E ^ (Integer.parseInt("256402438") ^ n));
        final int n3 = 0x60685796 ^ bynukygzdcwuqufw(n2, 916206225);
        this.opened = (Map<Player, Object[]>)new HashMap();
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
        this.billfordGuiConfig = plugin.getBillfordGuiConfig$756205206(1840850862);
        this.anvilDisplayName = Hex.hex(this.billfordGuiConfig.getString("billford_gui.anvil.display_name"));
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0x11F2E7EA ^ (0x585B92CD ^ (0x47C28921 ^ (this.btIRYCzsco ^ n)));
        final String hex = Hex.hex(this.billfordGuiConfig.getString(jrfprvwezs(kqhbctgmyhicqto(), n2)));
        final int n3 = 0x3A3BA173 ^ n2;
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, (int)(byte)(0x16F0390E ^ n3), hex);
        final int n4 = 0x1C4A6197 ^ n3;
        final Map<Integer, ItemStack> allBillfordItems$1462928060 = this.sqLiteManager.getAllBillfordItems$1462928060();
        int n5 = 0x666060E8 ^ n4;
        if (allBillfordItems$1462928060 != null) {
            int n6 = 0x4B0B89B7 ^ n5;
            if ((allBillfordItems$1462928060.isEmpty() ? 1 : 0) == (0x27D1B1F0 ^ n6)) {
                Label_0399: {
                Label_0392:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 537817874: {
                                continue;
                            }
                            case 220622608: {
                                break Label_0392;
                            }
                            case 1811309633: {
                                break Label_0399;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n6 ^= 0xC14BD0;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 196133774) {
                    bynukygzdcwuqufw(n6, 1890974443);
                    throw new IOException();
                }
                final int n7 = 0x3097CDD7 ^ n6;
                this.populateSavedItems$2133869943(inventory, (ItemStack[])allBillfordItems$1462928060.values().toArray((Object[])new ItemStack[(byte)(0x178737F7 ^ n7)]), 1851252250);
                final int n8 = 0x61D255D0 ^ n7;
                this.fillEmptySlots$1205928634(inventory, this.createFillItem$419675493(889953558), 1232501387);
                final int n9 = 0x34836E5E ^ n8;
                inventory.setItem((int)(byte)(0x42D60C6E ^ n9), this.createTradeButton$1802623419(2034338071));
                inventory.setItem((int)(byte)(0x166783BC ^ (0x54B18FDC ^ n9)), this.createTradeChoiceItem$1296355453(1548095980));
                return inventory;
            }
        }
        else {
            Label_0263: {
            Label_0256:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                        case 1207952416: {
                            continue;
                        }
                        case 48669139: {
                            break Label_0256;
                        }
                        case 758979947: {
                            break Label_0263;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n5 ^= 0x7C20B179;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 15038738) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                        case 1717466116: {
                            continue;
                        }
                        case 15038738: {}
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
            else {
                bynukygzdcwuqufw(n5, 2112351229);
            }
        }
        MessagesConfig.NOBILLFORDITEMS.send((CommandSender)player);
        return null;
    }
    
    private void populateSavedItems$2133869943(final Inventory inventory, final ItemStack[] array, final int n) {
        final int n2 = 0x74D1F2CC ^ (0x1A3D8E6 ^ (0x7811F11B ^ (this.btIRYCzsco ^ n)));
        final int[] array2 = new int[(byte)(0x181205AA ^ n2)];
        array2[(byte)(0x181205A3 ^ n2)] = (byte)(0x181205A9 ^ n2);
        array2[(byte)(0x181205A2 ^ n2)] = (byte)(0x181205A8 ^ n2);
        array2[(byte)(0x181205A1 ^ n2)] = (byte)(0x181205AF ^ n2);
        array2[(byte)(0x181205A0 ^ n2)] = (byte)(0x181205B0 ^ n2);
        array2[(byte)(0x181205A7 ^ n2)] = (byte)(0x181205B7 ^ n2);
        array2[(byte)(0x181205A6 ^ n2)] = (byte)(0x181205B6 ^ n2);
        array2[(byte)(0x181205A5 ^ n2)] = (byte)(0x181205BF ^ n2);
        array2[(byte)(0x181205A4 ^ n2)] = (byte)(0x181205BE ^ n2);
        array2[(byte)(0x181205AB ^ n2)] = (byte)(0x181205BD ^ n2);
        final int[] array3 = array2;
        final int n3 = 0x394E8181 ^ n2;
        int i = (byte)(0x215C8422 ^ n3);
        int n4 = 0x565AE7A1 ^ n3;
    Label_0648_Outer:
        while (i < array3.length) {
            final int n5 = 0x33DB046D ^ n4;
            if (i < array.length) {
                final int n6 = 0x1352012F ^ n5;
                final ItemStack clone = array[i].clone();
                final int n7 = 0x2B0C189B ^ n6;
                final ItemMeta itemMeta = clone.getItemMeta();
                final int n8 = 0x32C792F ^ n7;
                while (true) {
                    int bynukygzdcwuqufw = 0;
                    Label_0490: {
                        int n12 = 0;
                        Label_0465: {
                            int n10;
                            if (itemMeta != null) {
                                final int n9 = 0x23BBEECB ^ n8;
                                final List lore = itemMeta.getLore();
                                n10 = (0x614E8862 ^ n9);
                                if (lore != null) {
                                    final int n11 = 0x65CD4DCE ^ n10;
                                    itemMeta.setLore(lore);
                                    n12 = (0x6ED801FF ^ n11);
                                    break Label_0465;
                                }
                            }
                            else {
                                bynukygzdcwuqufw = bynukygzdcwuqufw(n8, 112601119);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw) != 178303684) {
                                    bynukygzdcwuqufw(bynukygzdcwuqufw, 1722326732);
                                    throw new IOException();
                                }
                            Label_1000:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw)) {
                                        case 1047316400: {
                                            break Label_0490;
                                        }
                                        case 543349030: {
                                            continue Label_0648_Outer;
                                        }
                                        case 178303684: {
                                            break Label_1000;
                                        }
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                                bynukygzdcwuqufw ^= 0x58636116;
                                break Label_0490;
                            }
                            Label_0704: {
                            Label_0696:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                        case 1376755468: {
                                            continue Label_0648_Outer;
                                        }
                                        case 115286208: {
                                            break Label_0696;
                                        }
                                        case 476252871: {
                                            break Label_0704;
                                        }
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                                n10 ^= 0x268AD3D7;
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10) != 98845477) {
                                throw new IOException();
                            }
                            n12 = (0x2D9F9FE6 ^ n10);
                        }
                        clone.setItemMeta(itemMeta);
                        bynukygzdcwuqufw = (0x17356391 ^ n12);
                    }
                    inventory.setItem(array3[i], clone);
                    final int n13 = 0xD6D5ED6 ^ bynukygzdcwuqufw;
                    i += (0x2C1710AB ^ n13);
                    final int n14 = 0x4DF81421 ^ n13;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14) != 230652194) {
                            throw null;
                        }
                        throw new IOException();
                    }
                    catch (final IOException ex) {
                        int bynukygzdcwuqufw2 = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n14)) {
                            default: {
                                throw new RuntimeException("Error in hash");
                            }
                            case -1027692248: {
                                bynukygzdcwuqufw2 = (0x71E9B145 ^ n14);
                                break;
                            }
                            case 259531867: {
                                bynukygzdcwuqufw2 = bynukygzdcwuqufw(n14, 139550955);
                                break;
                            }
                        }
                        n4 = (0x1EB807E3 ^ bynukygzdcwuqufw2);
                        continue Label_0648_Outer;
                    }
                    continue;
                }
            }
            final int n15 = 0x432F7AF4 ^ n5;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15) == 124976314) {
            Label_0860:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15)) {
                        case 1213576037: {
                            continue;
                        }
                        case 124976314: {}
                        case 423223661: {
                            break Label_0860;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                return;
            }
        Label_1011:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15)) {
                    case 1927338613: {
                        continue;
                    }
                    case 124976314: {}
                    default: {
                        break Label_1011;
                    }
                }
            }
            throw new IOException();
        }
        final int bynukygzdcwuqufw3 = bynukygzdcwuqufw(n4, 1914457622);
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw3) != 80252833) {
            throw new IOException();
        }
        bynukygzdcwuqufw(bynukygzdcwuqufw3, 2055822760);
    }
    
    private ItemStack createFillItem$419675493(final int n) {
        final int n2 = 0x53556958 ^ (0x3DE00E73 ^ (0xEBBFE53 ^ (this.btIRYCzsco ^ n)));
        final Material material = Material.getMaterial(this.billfordGuiConfig.getString(jrfprvwezs(caktjqkdwbhquox(), n2)));
        final int n3 = 0x310C152D ^ n2;
        return this.createItem$1585078124(material, Hex.hex(this.billfordGuiConfig.getString(jrfprvwezs(gschxkxebhpjugu(), n3))), (List)this.billfordGuiConfig.getStringList(jrfprvwezs(uytnckohxjsowui(), 0x1CF86ABD ^ n3)).stream().map(Hex::hex).collect(Collectors.toList()), 940461645);
    }
    
    private void fillEmptySlots$1205928634(final Inventory inventory, final ItemStack itemStack, final int n) {
        final int n2 = 0x5B61B51C ^ (0x217B7B46 ^ (0x14C96053 ^ (this.btIRYCzsco ^ n)));
        final int[] array = new int[(byte)(0x5C83D403 ^ n2)];
        array[(byte)(0x5C83D40A ^ n2)] = (byte)(0x5C83D400 ^ n2);
        array[(byte)(0x5C83D40B ^ n2)] = (byte)(0x5C83D401 ^ n2);
        array[(byte)(0x5C83D408 ^ n2)] = (byte)(0x5C83D406 ^ n2);
        array[(byte)(0x5C83D409 ^ n2)] = (byte)(0x5C83D419 ^ n2);
        array[(byte)(0x5C83D40E ^ n2)] = (byte)(0x5C83D41E ^ n2);
        array[(byte)(0x5C83D40F ^ n2)] = (byte)(0x5C83D41F ^ n2);
        array[(byte)(0x5C83D40C ^ n2)] = (byte)(0x5C83D416 ^ n2);
        array[(byte)(0x5C83D40D ^ n2)] = (byte)(0x5C83D417 ^ n2);
        array[(byte)(0x5C83D402 ^ n2)] = (byte)(0x5C83D414 ^ n2);
        IntStream.range((int)(byte)(0x32A0474E ^ (0x6E239344 ^ n2)), inventory.getSize()).forEach(n -> {
            final int n2 = 0x4EA0C490 ^ (0x791C6073 ^ (0x7B6BFF48 ^ BillfordGUI.teQksBq9uU));
            Label_0101: {
                if ((Arrays.stream(array).noneMatch(n2 -> {
                    final int n3 = 0x596D82D5 ^ (0x4B39D6CF ^ (0x2B63DC43 ^ BillfordGUI.teQksBq9uU));
                    if (n2 == n) {
                        int n4 = 0x798A6235 ^ n3;
                        final byte b = (byte)(0x3A756AA3 ^ n4);
                        Label_0159: {
                        Label_0140:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                                    case 1149828257: {
                                        continue;
                                    }
                                    case 21185772: {
                                        break Label_0140;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                    case 2059843887: {
                                        break Label_0159;
                                    }
                                }
                            }
                            n4 ^= 0x67541A57;
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 74487803) {
                                    throw null;
                                }
                                throw new IOException();
                            }
                            catch (final IOException ex) {
                                int n5 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n4)) {
                                    case 266364763: {
                                        n5 = bynukygzdcwuqufw(n4, 113001275);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                    case -385120342: {
                                        n5 = bynukygzdcwuqufw(n4, 979451685);
                                        break;
                                    }
                                }
                                bynukygzdcwuqufw(n5, 1004211497);
                                return b != 0;
                            }
                        }
                        final int n6;
                        return (byte)(0x7CAD3C6A ^ n6) != 0;
                    }
                    final int n7 = 0x6F5FCEE3 ^ n3;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) == 108506144) {
                        final int n6 = 0x500DFA1E ^ n7;
                        return (byte)(0x7CAD3C6A ^ n6) != 0;
                    }
                    throw new RuntimeException();
                    int n6 = 0;
                    final byte b = (byte)(0x7CAD3C6A ^ n6);
                    return b != 0;
                }) ? 1 : 0) == (0x361FDB65 ^ n2)) {
                    final int n3 = 0x651066CC ^ n2;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) == 15608952) {
                    Label_0172:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                case 1364180598: {
                                    break Label_0101;
                                }
                                case 1283080083: {
                                    continue;
                                }
                                case 15608952: {
                                    break Label_0172;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        return;
                    }
                Label_0240:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 221681189: {
                                continue;
                            }
                            case 15608952: {}
                            default: {
                                break Label_0240;
                            }
                        }
                    }
                    throw new RuntimeException();
                }
                inventory.setItem(n, itemStack);
            }
        });
    }
    
    private ItemStack createTradeButton$1802623419(final int n) {
        return this.createItem$1585078124(Material.ANVIL, this.anvilDisplayName, (List)this.billfordGuiConfig.getStringList(jrfprvwezs(qdqljusprapszdk(), 0x5DDF9A62 ^ (0x59FFC402 ^ (0x7AB252C4 ^ (this.btIRYCzsco ^ n))))).stream().map(Hex::hex).collect(Collectors.toList()), 940461645);
    }
    
    private ItemStack createTradeChoiceItem$1296355453(final int n) {
        final int n2 = 0x745C10FC ^ (0x6ED5DCF7 ^ (0x6D99A0E4 ^ (this.btIRYCzsco ^ n)));
        final String string = this.billfordGuiConfig.getString(jrfprvwezs(kcsccavmyqyjyqr(), n2));
        int n3 = 0x1E572F97 ^ n2;
        if (string == null) {
            return null;
        }
        Label_0140: {
        Label_0132:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                    case 220738909: {
                        continue;
                    }
                    case 124543281: {
                        break Label_0132;
                    }
                    case 275684543: {
                        break Label_0140;
                    }
                    default: {
                        throw new IOException();
                    }
                }
            }
            n3 ^= 0x3B57F9C;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) == 105608634) {
            final int bynukygzdcwuqufw = bynukygzdcwuqufw(n3, 1383353060);
            final String lowerCase = string.toLowerCase();
            byte b = (byte)(0xE019989B ^ bynukygzdcwuqufw);
            int bynukygzdcwuqufw2 = 0;
            Label_0601: {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(lowerCase.hashCode() ^ bynukygzdcwuqufw)) {
                    default: {
                        bynukygzdcwuqufw2 = bynukygzdcwuqufw(bynukygzdcwuqufw, 237919691);
                        break;
                    }
                    case 257692586: {
                        final int n4 = 0x3162C09 ^ bynukygzdcwuqufw;
                        if ((lowerCase.equals((Object)jrfprvwezs(zzblahrdofaruiw(), n4)) ? 1 : 0) != (0x1CF04B6D ^ n4)) {
                            final int n5 = 0x15EE1B62 ^ n4;
                            b = (byte)(0x91E500F ^ n5);
                            final int bynukygzdcwuqufw3 = bynukygzdcwuqufw(n5, 533154703);
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw3) != 205829009) {
                                    throw null;
                                }
                                throw new IOException();
                            }
                            catch (final IOException ex) {
                                int bynukygzdcwuqufw4 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(bynukygzdcwuqufw3)) {
                                    case 1299135899: {
                                        bynukygzdcwuqufw4 = (0x590A63DB ^ bynukygzdcwuqufw3);
                                        break;
                                    }
                                    default: {
                                        throw new IOException("Error in hash");
                                    }
                                    case -1228350464: {
                                        bynukygzdcwuqufw4 = bynukygzdcwuqufw(bynukygzdcwuqufw3, 645832680);
                                        break;
                                    }
                                }
                                bynukygzdcwuqufw2 = (0x216FBEC7 ^ bynukygzdcwuqufw4);
                                break;
                            }
                        }
                        bynukygzdcwuqufw2 = (0x6830E11E ^ n4);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw2) != 37043966) {
                            bynukygzdcwuqufw(bynukygzdcwuqufw2, 1706544614);
                            throw new IOException();
                        }
                    Label_0396:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw2)) {
                                case 287317836: {
                                    continue;
                                }
                                case 37043966: {
                                    break Label_0396;
                                }
                                case 570864345: {
                                    break Label_0601;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        bynukygzdcwuqufw2 ^= 0x650890DC;
                        break;
                    }
                    case 90986899: {
                        int bynukygzdcwuqufw5 = bynukygzdcwuqufw(bynukygzdcwuqufw, 997183212);
                        if ((lowerCase.equals((Object)jrfprvwezs(xvzjojliqwawxox(), bynukygzdcwuqufw5)) ? 1 : 0) != (0x2489A988 ^ bynukygzdcwuqufw5)) {
                            final int n6 = 0x4EFAB8A6 ^ bynukygzdcwuqufw5;
                            b = (byte)(0x6A73112F ^ n6);
                            bynukygzdcwuqufw2 = (0x7BBB2B81 ^ n6);
                            break;
                        }
                        Label_0700: {
                        Label_0692:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw5)) {
                                    case 52601397: {
                                        continue;
                                    }
                                    case 113941758: {
                                        break Label_0692;
                                    }
                                    case 822064833: {
                                        break Label_0700;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            bynukygzdcwuqufw5 ^= 0x1769664A;
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw5) != 75735399) {
                            throw new IOException();
                        }
                        bynukygzdcwuqufw2 = (0x2228F56D ^ bynukygzdcwuqufw5);
                        break;
                    }
                }
            }
            final int n7;
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(b ^ bynukygzdcwuqufw2)) {
                default: {
                    n7 = (0x3B184F8F ^ bynukygzdcwuqufw2);
                    break;
                }
                case 41148537: {
                    Label_0804: {
                    Label_0796:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw2)) {
                                case 1643010196: {
                                    continue;
                                }
                                case 41148539: {
                                    break Label_0796;
                                }
                                case 327176441: {
                                    break Label_0804;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        bynukygzdcwuqufw2 ^= 0x7FFAA835;
                    }
                    final ItemStack itemStack = new CritMultiplier(this.plugin, 1399757288);
                    Label_0884: {
                    Label_0876:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw2)) {
                                case 1904723512: {
                                    continue;
                                }
                                case 92377656: {
                                    break Label_0876;
                                }
                                case 317719828: {
                                    break Label_0884;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        bynukygzdcwuqufw2 ^= 0x1FFEB11E;
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw2) != 209450243) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        }
                        catch (final IllegalAccessException ex2) {
                            int n8 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(bynukygzdcwuqufw2)) {
                                case -1906238429: {
                                    n8 = (0x5C7AD5C0 ^ bynukygzdcwuqufw2);
                                    break;
                                }
                                default: {
                                    throw new IllegalAccessException("Error in hash");
                                }
                                case -1650054552: {
                                    n8 = (0x3E023309 ^ bynukygzdcwuqufw2);
                                    break;
                                }
                            }
                            bynukygzdcwuqufw(n8, 537394177);
                            return itemStack;
                        }
                    }
                }
                case 41148539: {
                    final int bynukygzdcwuqufw6 = bynukygzdcwuqufw(bynukygzdcwuqufw2, 423180706);
                    final ItemStack itemStack = new StrengthRod(this.plugin, 1546977824);
                    final int bynukygzdcwuqufw7 = bynukygzdcwuqufw(bynukygzdcwuqufw6, 1430348151);
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw7) != 92660604) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    }
                    catch (final IllegalAccessException ex3) {
                        int bynukygzdcwuqufw8 = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(bynukygzdcwuqufw7)) {
                            case 156392874: {
                                bynukygzdcwuqufw8 = (0x4CE76FEB ^ bynukygzdcwuqufw7);
                                break;
                            }
                            case -310176814: {
                                bynukygzdcwuqufw8 = bynukygzdcwuqufw(bynukygzdcwuqufw7, 1350387236);
                                break;
                            }
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                        }
                        bynukygzdcwuqufw(bynukygzdcwuqufw8, 8138267);
                        return itemStack;
                    }
                    break;
                }
            }
            return this.billfordGuiConfig.getItemStack(jrfprvwezs(fqnzoshfhqeopmq(), n7));
        }
        throw new IOException();
    }
    
    private ItemStack createItem$1585078124(final Material material, final Material displayName, final String lore, final List<String> list) {
        final int n = (int)(0x5824255 ^ (0x6C0404F5 ^ (0x4653F5A8 ^ (this.btIRYCzsco ^ list))));
        final ItemStack itemStack = new ItemStack(material);
        final int n2 = 0x2E90EAFF ^ n;
        final ItemMeta itemMeta = itemStack.getItemMeta();
        int n3 = 0x51E8DD0E ^ n2;
        if (itemMeta == null) {
            Label_0228: {
            Label_0220:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 1257004676: {
                            continue;
                        }
                        case 97723473: {
                            break Label_0220;
                        }
                        case 1805228981: {
                            break Label_0228;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
                n3 ^= 0x55EFC42F;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) == 141376814) {
                bynukygzdcwuqufw(n3, 1294231458);
                return itemStack;
            }
            throw new IllegalAccessException();
        }
        itemMeta.setDisplayName((String)displayName);
        itemMeta.setLore((List)lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        final int n2 = 0x50F3896E ^ (0x7400E6F3 ^ (0x3A84BFAB ^ (this.btIRYCzsco ^ n)));
        final int slot$2125716982 = wrappedClickEvent.getSlot$2125716982(2104088370);
        final int n3 = 0x41E93C60 ^ n2;
        final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
        final int n4 = 0x35109CF9 ^ n3;
        if (slot$2125716982 == (byte)(0x76BFFB84 ^ n4)) {
            final int n5 = 0x22EDECD7 ^ n4;
            final ItemStack[] array = (ItemStack[])this.sqLiteManager.getAllBillfordItems$1462928060().values().toArray((Object[])new ItemStack[(byte)(0x54521744 ^ n5)]);
            final int n6 = 0x8DFAD28 ^ n5;
            if ((this.hasRequiredItems$1947537244(player$624284539, array, 311290208) ? 1 : 0) != (0x5C8DBA6C ^ n6)) {
                int n7 = 0x389C4B52 ^ n6;
                this.processTrade$1665015831(player$624284539, wrappedClickEvent.getInventory$1458066743(1496261850).getItem((int)(byte)(0x6411F127 ^ n7)), array, 544018113);
                Label_0527: {
                Label_0508:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                            case 27285076: {
                                continue;
                            }
                            case 31631225: {
                                break Label_0508;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                            case 294982746: {
                                break Label_0527;
                            }
                        }
                    }
                    n7 ^= 0x77722EFE;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 93426407) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    }
                    catch (final IllegalAccessException ex) {
                        int bynukygzdcwuqufw = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n7)) {
                            case -332169285: {
                                bynukygzdcwuqufw = bynukygzdcwuqufw(n7, 531830477);
                                break;
                            }
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case -1692467712: {
                                bynukygzdcwuqufw = (0x7156A6FA ^ n7);
                                break;
                            }
                        }
                        bynukygzdcwuqufw(bynukygzdcwuqufw, 1775910810);
                        return;
                    }
                }
            }
            else {
                final int n8 = 0x7678ADA0 ^ n6;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 54195438) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                            case 251877188: {
                                continue;
                            }
                            case 54195438: {}
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
                else {
                    bynukygzdcwuqufw(n8, 1415385319);
                }
            }
            MessagesConfig.INVALIDBILLFORDITEMS.send((CommandSender)player$624284539);
            SoundConfig.TRADEFAIL.play(player$624284539);
            return;
        }
        final int n9 = 0x4641EB25 ^ n4;
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) == 250376350) {
            return;
        }
    Label_0519:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                case 18079663: {
                    continue;
                }
                case 250376350: {}
                default: {
                    break Label_0519;
                }
            }
        }
        throw new IllegalAccessException();
    }
    
    private boolean hasRequiredItems$1947537244(final Player player, final ItemStack[] array, final int n) {
        final int n2 = 0x77A64406 ^ (0x49D0CCBE ^ (0x3F73239A ^ (this.btIRYCzsco ^ n)));
        final HashMap hashMap = new HashMap();
        final int n3 = 0x5EE3C0FE ^ n2;
        final int length = array.length;
        int i = (byte)(0x364D8234 ^ n3);
        int bynukygzdcwuqufw = 0x338E00BE ^ n3;
        while (i < length) {
            final int n4 = 0x29715667 ^ bynukygzdcwuqufw;
            final ItemStack itemStack = array[i];
            final int n5 = 0x65A2CCF4 ^ n4;
            ((Map)hashMap).merge((Object)itemStack, (Object)itemStack.getAmount(), Integer::sum);
            final int n6 = 0x68853277 ^ n5;
            i += (0x21952A6F ^ n6);
            final int bynukygzdcwuqufw2 = bynukygzdcwuqufw(n6, 198991644);
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw2) != 32405957) {
                    throw null;
                }
                throw new RuntimeException();
            }
            catch (final RuntimeException ex) {
                int bynukygzdcwuqufw3 = 0;
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(bynukygzdcwuqufw2)) {
                    default: {
                        throw new IllegalAccessException("Error in hash");
                    }
                    case 1380690833: {
                        bynukygzdcwuqufw3 = (0x28BC7D10 ^ bynukygzdcwuqufw2);
                        break;
                    }
                    case 777961849: {
                        bynukygzdcwuqufw3 = bynukygzdcwuqufw(bynukygzdcwuqufw2, 658427981);
                        break;
                    }
                }
                bynukygzdcwuqufw = bynukygzdcwuqufw(bynukygzdcwuqufw3, 121015016);
            }
        }
        final int n7 = 0x2FF9CF8 ^ bynukygzdcwuqufw;
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) == 113793974) {
            final int n8 = 0x79F336AE ^ n7;
            final Iterator iterator = ((Map)hashMap).entrySet().iterator();
            int bynukygzdcwuqufw4 = 0x1494812E ^ n8;
        Label_0279:
            while ((iterator.hasNext() ? 1 : 0) != (0x6A5BA9F2 ^ bynukygzdcwuqufw4)) {
                final int n9 = 0x691C059 ^ bynukygzdcwuqufw4;
                final Map.Entry entry = (Map.Entry)iterator.next();
                final int n10 = 0x1020BF37 ^ n9;
                if ((this.hasEnoughItems$1827087114(player, (ItemStack)entry.getKey(), (int)entry.getValue(), 845668809) ? 1 : 0) == (0x7CEAD69C ^ n10)) {
                    return (byte)(0x4D32EBB7 ^ (0x31D83D2B ^ n10)) != 0;
                }
                final int bynukygzdcwuqufw5 = bynukygzdcwuqufw(n10, 444632731);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw5) != 107900135) {
                    bynukygzdcwuqufw(bynukygzdcwuqufw5, 1309920379);
                    throw new IOException();
                }
                int n11 = 0x3FFE8C11 ^ bynukygzdcwuqufw5;
                Label_0532: {
                Label_0524:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11)) {
                            case 1187677727: {
                                continue;
                            }
                            case 227541886: {
                                break Label_0524;
                            }
                            case 1633706869: {
                                break Label_0532;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n11 ^= 0x7002633E;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11) != 9710411) {
                            throw null;
                        }
                        throw new IOException();
                    }
                    catch (final IOException ex2) {
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n11)) {
                            case 1286977857: {
                                bynukygzdcwuqufw4 = bynukygzdcwuqufw(n11, 803700771);
                                break;
                            }
                            case -842384077: {
                                bynukygzdcwuqufw4 = (0x7FC870AD ^ n11);
                                break;
                            }
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                        }
                    Label_0652:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw4)) {
                                case 1058049563: {
                                    continue Label_0279;
                                }
                                case 241917693: {
                                    continue;
                                }
                                case 101328363: {
                                    break Label_0652;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        bynukygzdcwuqufw4 ^= 0x6C2A9EF9;
                        continue;
                    }
                }
                break;
            }
            Label_0720: {
            Label_0712:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw4)) {
                        case 2065201219: {
                            continue;
                        }
                        case 236057375: {
                            break Label_0712;
                        }
                        case 431219525: {
                            break Label_0720;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                bynukygzdcwuqufw4 ^= 0x50C31A1;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw4) == 129620087) {
            Label_0780:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw4)) {
                        case 484177076: {
                            continue;
                        }
                        case 129620087: {
                            break Label_0780;
                        }
                        case 1568956268: {
                            return (byte)(0x2AD3F72 ^ bynukygzdcwuqufw4) != 0;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                bynukygzdcwuqufw4 ^= 0x6DFAA720;
                return (byte)(0x2AD3F72 ^ bynukygzdcwuqufw4) != 0;
            }
        }
        throw new IOException();
    }
    
    private void processTrade$1665015831(final Player player, final ItemStack itemStack, final ItemStack[] array, final int n) {
        int n2 = 0x5297CDFE ^ (0x74A5CB6A ^ (0x3E76E108 ^ (this.btIRYCzsco ^ n)));
        if (itemStack != null) {
            final int n3 = 0x109381B7 ^ n2;
            final int length = array.length;
            int i = (byte)(0x539C6862 ^ n3);
            int n4 = 0x501CFD9F ^ n3;
        Label_0082:
            while (i < length) {
                final int n5 = 0x797E9377 ^ n4;
                final ItemStack itemStack2 = array[i];
                final int n6 = 0x6EB48B43 ^ n5;
                this.removeItems$1198590671(player, itemStack2, 401241792);
                final int n7 = 0x9D0EAA6 ^ n6;
                i += (0x1D9A676E ^ n7);
                final int bynukygzdcwuqufw = bynukygzdcwuqufw(n7, 2144500401);
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw) != 241949590) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(bynukygzdcwuqufw)) {
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case -1855835021: {
                            n4 = bynukygzdcwuqufw(bynukygzdcwuqufw, 658209075);
                            break;
                        }
                        case 306245363: {
                            n4 = bynukygzdcwuqufw(bynukygzdcwuqufw, 928981603);
                            break;
                        }
                    }
                Label_0320:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 501307200: {
                                continue Label_0082;
                            }
                            case 247246489: {
                                continue;
                            }
                            case 81616489: {
                                break Label_0320;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n4 ^= 0x5697AA40;
                    continue;
                }
                break;
            }
            int n8 = 0x65E647FD ^ n4;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 107434118) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                        case 1943996923: {
                            continue;
                        }
                        case 107434118: {}
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
            else {
                Label_0464: {
                Label_0456:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                            case 424364671: {
                                continue;
                            }
                            case 107434118: {
                                break Label_0456;
                            }
                            case 1540452314: {
                                break Label_0464;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n8 ^= 0x49EB13E5;
                }
                final PlayerInventory inventory = player.getInventory();
                final ItemStack[] array2 = new ItemStack[(byte)(0x2F8DC1E4 ^ n8)];
                array2[(byte)(0x2F8DC1E5 ^ n8)] = itemStack.clone();
                inventory.addItem(array2);
                final int n9 = 0x3F608BF7 ^ n8;
                MessagesConfig.BILLFORDTRADESUCCESS.send((CommandSender)player);
                final int n10 = 0x469C4B0B ^ n9;
                SoundConfig.TRADESUCCESS.play(player);
                final int n11 = 0x342FF363 ^ n10;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11) != 244815762) {
                        throw null;
                    }
                    throw new IOException();
                }
                catch (final IOException ex2) {
                    int n12 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n11)) {
                        case 318215123: {
                            n12 = (0x6A35BB8F ^ n11);
                            break;
                        }
                        case -2107968583: {
                            n12 = (0x38201782 ^ n11);
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                    }
                    bynukygzdcwuqufw(n12, 1509945334);
                    return;
                }
            }
        }
        Label_0736: {
        Label_0728:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                    case 1251323487: {
                        continue;
                    }
                    case 32413187: {
                        break Label_0728;
                    }
                    case 1430745547: {
                        break Label_0736;
                    }
                    default: {
                        throw new IOException();
                    }
                }
            }
            n2 ^= 0x7B488D08;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2) != 218786603) {
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                    case 1866028111: {
                        continue;
                    }
                    case 218786603: {}
                    default: {
                        throw new IOException();
                    }
                }
            }
        }
        else {
            bynukygzdcwuqufw(n2, 386805152);
            MessagesConfig.NOBILLFORDITEMS.send((CommandSender)player);
        }
    }
    
    private void removeItems$1198590671(final Player player, final ItemStack itemStack, final int n) {
        final int n2 = 0x22BE2A75 ^ (0x452FDB10 ^ (0x4D875918 ^ (this.btIRYCzsco ^ n)));
        int amount = itemStack.getAmount();
        final int n3 = 0xBF53741 ^ n2;
        final ItemStack[] contents = player.getInventory().getContents();
        final int n4 = 0x46C3EE1D ^ n3;
        int i = (byte)(0xBEC0769 ^ n4);
        int n5 = 0x1582D119 ^ n4;
        int n24 = 0;
    Label_0760:
        while (true) {
            while (i < contents.length) {
                int n6 = 0x73D42EAF ^ n5;
                Label_0638: {
                    if (amount > (0x6DBAF8DF ^ n6)) {
                        final int n7 = 0x5CB67F89 ^ n6;
                        final ItemStack itemStack2 = contents[i];
                        final int n8 = 0x6111CA52 ^ n7;
                        int bynukygzdcwuqufw5 = 0;
                        Label_1825: {
                            if (itemStack2 != null) {
                                int n9 = 0x35FBB12E ^ n8;
                                if (itemStack2.getType() == itemStack.getType()) {
                                    final int n10 = 0x367E2E85 ^ n9;
                                    byte equals = (byte)(0x5398D2AF ^ n10);
                                    final int n11 = 0x601747C7 ^ n10;
                                    int n14 = 0;
                                    Label_1181: {
                                        int bynukygzdcwuqufw = 0;
                                        Label_1101: {
                                            if ((itemStack.hasItemMeta() ? 1 : 0) != (0x338F9568 ^ n11)) {
                                                bynukygzdcwuqufw = (0x138C6058 ^ n11);
                                                if ((itemStack2.hasItemMeta() ? 1 : 0) != (0x2003F530 ^ bynukygzdcwuqufw)) {
                                                    final int n12 = 0x5D640727 ^ bynukygzdcwuqufw;
                                                    equals = (byte)(itemStack2.getItemMeta().equals((Object)itemStack.getItemMeta()) ? 1 : 0);
                                                    final int n13 = 0x7CD613DA ^ n12;
                                                    try {
                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n13) != 26657281) {
                                                            throw null;
                                                        }
                                                        throw new RuntimeException();
                                                    }
                                                    catch (final RuntimeException ex) {
                                                        int bynukygzdcwuqufw2 = 0;
                                                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n13)) {
                                                            default: {
                                                                throw new IOException("Error in hash");
                                                            }
                                                            case 227479144: {
                                                                bynukygzdcwuqufw2 = bynukygzdcwuqufw(n13, 394676101);
                                                                break;
                                                            }
                                                            case 1444493010: {
                                                                bynukygzdcwuqufw2 = (0x5CF48092 ^ n13);
                                                                break;
                                                            }
                                                        }
                                                        n14 = bynukygzdcwuqufw(bynukygzdcwuqufw2, 1297517137);
                                                        break Label_1181;
                                                    }
                                                    break Label_0638;
                                                }
                                                Label_0928: {
                                                Label_0920:
                                                    while (true) {
                                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw)) {
                                                            case 804928009: {
                                                                continue;
                                                            }
                                                            case 235375374: {
                                                                break Label_0920;
                                                            }
                                                            case 302305595: {
                                                                break Label_0928;
                                                            }
                                                            default: {
                                                                throw new IllegalAccessException();
                                                            }
                                                        }
                                                    }
                                                    bynukygzdcwuqufw ^= 0x648B3BC4;
                                                }
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw) != 80303216) {
                                                    while (true) {
                                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw)) {
                                                            case 868136273: {
                                                                continue;
                                                            }
                                                            case 80303216: {}
                                                            default: {
                                                                throw new IllegalAccessException();
                                                            }
                                                        }
                                                    }
                                                }
                                                else {
                                                Label_0988:
                                                    while (true) {
                                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw)) {
                                                            case 1361368014: {
                                                                continue;
                                                            }
                                                            case 80303216: {
                                                                break Label_0988;
                                                            }
                                                            case 768149477: {
                                                                break Label_1101;
                                                            }
                                                            default: {
                                                                throw new IllegalAccessException();
                                                            }
                                                        }
                                                    }
                                                    bynukygzdcwuqufw ^= 0x3A21FAE3;
                                                }
                                            }
                                            else {
                                                final int bynukygzdcwuqufw3 = bynukygzdcwuqufw(n11, 56830734);
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw3) != 248152073) {
                                                    throw new IllegalAccessException();
                                                }
                                                bynukygzdcwuqufw = bynukygzdcwuqufw(bynukygzdcwuqufw3, 1313180273);
                                            }
                                        }
                                        if ((itemStack.hasItemMeta() ? 1 : 0) == (0x7EA93417 ^ bynukygzdcwuqufw)) {
                                            final int n15 = 0x58DA814B ^ bynukygzdcwuqufw;
                                            if ((itemStack2.hasItemMeta() ? 1 : 0) == (0x2673B55C ^ n15)) {
                                                final int n16 = 0x2B8A9BDE ^ n15;
                                                equals = (byte)(0xDF92E83 ^ n16);
                                                n14 = (0x5698029B ^ n16);
                                            }
                                            else {
                                                final int bynukygzdcwuqufw4 = bynukygzdcwuqufw(n15, 878427121);
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw4) != 53317191) {
                                                    throw new IllegalAccessException();
                                                }
                                                n14 = bynukygzdcwuqufw(bynukygzdcwuqufw4, 1229529780);
                                            }
                                        }
                                        else {
                                            Label_1384: {
                                            Label_1376:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw)) {
                                                        case 736523958: {
                                                            continue;
                                                        }
                                                        case 90679877: {
                                                            break Label_1376;
                                                        }
                                                        case 2143496220: {
                                                            break Label_1384;
                                                        }
                                                        default: {
                                                            throw new IllegalAccessException();
                                                        }
                                                    }
                                                }
                                                bynukygzdcwuqufw ^= 0x3735EF8F;
                                            }
                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw) != 245342442) {
                                                bynukygzdcwuqufw(bynukygzdcwuqufw, 2026260959);
                                                throw new IllegalAccessException();
                                            }
                                            n14 = bynukygzdcwuqufw(bynukygzdcwuqufw, 318633857);
                                        }
                                    }
                                    if (equals != (0x5B612C19 ^ n14)) {
                                        int n17 = 0x4932A3BA ^ n14;
                                        if (itemStack2.getAmount() > amount) {
                                            final int n18 = 0x273C8161 ^ n17;
                                            itemStack2.setAmount(itemStack2.getAmount() - amount);
                                            final int n19 = 0x41D7784F ^ n18;
                                            amount = (byte)(0x74B8768D ^ n19);
                                            final int n20 = 0x761A2D2E ^ n19;
                                            try {
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n20) != 41432906) {
                                                    throw null;
                                                }
                                                throw new RuntimeException();
                                            }
                                            catch (final RuntimeException ex2) {
                                                int n21 = 0;
                                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n20)) {
                                                    default: {
                                                        throw new RuntimeException("Error in hash");
                                                    }
                                                    case 353557784: {
                                                        n21 = (0x74EAC3F3 ^ n20);
                                                        break;
                                                    }
                                                    case 874364129: {
                                                        n21 = (0x50CB2FCC ^ n20);
                                                        break;
                                                    }
                                                }
                                                bynukygzdcwuqufw5 = (0x167A1A4A ^ n21);
                                                break Label_1825;
                                            }
                                        }
                                        else {
                                            Label_1476: {
                                            Label_1468:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                                        case 1172301163: {
                                                            continue;
                                                        }
                                                        case 58848280: {
                                                            break Label_1468;
                                                        }
                                                        case 616914973: {
                                                            break Label_1476;
                                                        }
                                                        default: {
                                                            throw new IllegalAccessException();
                                                        }
                                                    }
                                                }
                                                n17 ^= 0x2FD2319;
                                            }
                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 5406214) {
                                                bynukygzdcwuqufw(n17, 569655037);
                                                throw new IllegalAccessException();
                                            }
                                            final int bynukygzdcwuqufw6 = bynukygzdcwuqufw(n17, 1691868624);
                                            amount -= itemStack2.getAmount();
                                            final int n22 = 0x33BA443B ^ bynukygzdcwuqufw6;
                                            contents[i] = null;
                                            bynukygzdcwuqufw5 = (0x27F1B74B ^ n22);
                                            break Label_1825;
                                        }
                                    }
                                    else {
                                        final int bynukygzdcwuqufw7 = bynukygzdcwuqufw(n14, 1399751172);
                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw7) == 126794548) {
                                            bynukygzdcwuqufw5 = (0x683D2C07 ^ bynukygzdcwuqufw7);
                                            break Label_1825;
                                        }
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw7)) {
                                                case 1992562134: {
                                                    continue;
                                                }
                                                case 126794548: {}
                                                default: {
                                                    throw new IllegalAccessException();
                                                }
                                            }
                                        }
                                    }
                                }
                                else {
                                    Label_0492: {
                                    Label_0484:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                                case 929242137: {
                                                    continue;
                                                }
                                                case 91221367: {
                                                    break Label_0484;
                                                }
                                                case 52049968: {
                                                    break Label_0492;
                                                }
                                                default: {
                                                    throw new IllegalAccessException();
                                                }
                                            }
                                        }
                                        n9 ^= 0x84A2022;
                                    }
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 75401187) {
                                        bynukygzdcwuqufw(n9, 1559645775);
                                        throw new IllegalAccessException();
                                    }
                                    bynukygzdcwuqufw5 = (0xD9E5E12 ^ n9);
                                    break Label_1825;
                                }
                            }
                            final int bynukygzdcwuqufw8 = bynukygzdcwuqufw(n8, 837007121);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw8) != 232678774) {
                                bynukygzdcwuqufw(bynukygzdcwuqufw8, 1352951890);
                                throw new IllegalAccessException();
                            }
                            bynukygzdcwuqufw5 = bynukygzdcwuqufw(bynukygzdcwuqufw8, 30177295);
                        }
                        i += (0x6032821B ^ bynukygzdcwuqufw5);
                        Label_1892: {
                        Label_1884:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw5)) {
                                    case 697274750: {
                                        continue;
                                    }
                                    case 174177312: {
                                        break Label_1884;
                                    }
                                    case 1436634278: {
                                        break Label_1892;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            bynukygzdcwuqufw5 ^= 0x1E0ACE33;
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw5) != 76377527) {
                                    throw null;
                                }
                                throw new IllegalAccessException();
                            }
                            catch (final IllegalAccessException ex3) {
                                int n23 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(bynukygzdcwuqufw5)) {
                                    case -238919349: {
                                        n23 = bynukygzdcwuqufw(bynukygzdcwuqufw5, 2020714706);
                                        break;
                                    }
                                    case 1069201890: {
                                        n23 = bynukygzdcwuqufw(bynukygzdcwuqufw5, 1103016903);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                }
                                n5 = (0x1827328B ^ n23);
                                continue;
                            }
                        }
                        throw new IllegalAccessException();
                    }
                }
                Label_0692: {
                Label_0684:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 929757213: {
                                continue;
                            }
                            case 77213578: {
                                break Label_0684;
                            }
                            case 1416290535: {
                                break Label_0692;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n6 ^= 0x1B631CB5;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) == 105274452) {
                Label_0752:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 1710471827: {
                                continue;
                            }
                            case 105274452: {
                                break Label_0752;
                            }
                            case 249878019: {
                                break Label_0760;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n6 ^= 0x58F462F;
                    player.getInventory().setContents(contents);
                    player.updateInventory();
                    return;
                }
            Label_1990:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                        case 1492311539: {
                            continue;
                        }
                        case 105274452: {}
                        default: {
                            break Label_1990;
                        }
                    }
                }
                throw new IllegalAccessException();
            }
            n24 = (0x7D931E71 ^ n5);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n24) == 29085820) {
                final int n6 = 0x10AB6A44 ^ n24;
                continue Label_0760;
            }
            break;
        }
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n24)) {
                case 200540241: {
                    continue;
                }
                case 29085820: {}
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
    }
    
    private boolean hasEnoughItems$1827087114(final Player player, final ItemStack itemStack, final int n, final int n2) {
        final int n3 = 0x778C72C2 ^ (0x22390205 ^ (0x4EF89C03 ^ (this.btIRYCzsco ^ n2)));
        int n4 = (byte)(0x520C0D85 ^ n3);
        final int n5 = 0x305DB13D ^ n3;
        final ItemStack[] contents = player.getInventory().getContents();
        final int length = contents.length;
        int i = (byte)(0x6251BCB8 ^ n5);
        int n6 = 0x21DF2940 ^ n5;
    Label_1591_Outer:
        while (i < length) {
            final int n7 = 0x59339217 ^ n6;
            final ItemStack itemStack2 = contents[i];
            final int n8 = 0x6CA2CFC2 ^ n7;
            while (true) {
                int n21 = 0;
                Label_1428: {
                    Label_0430: {
                        if (itemStack2 == null) {
                            break Label_0430;
                        }
                        final int n9 = 0x41584C93 ^ n8;
                        if (itemStack2.getType() == itemStack.getType()) {
                            final int n10 = 0x45DCD35B ^ n9;
                            byte equals = (byte)(0x729B57E5 ^ n10);
                            final int n11 = 0x77E716B5 ^ n10;
                            int bynukygzdcwuqufw2 = 0;
                            Label_1030: {
                                int bynukygzdcwuqufw3;
                                if ((itemStack.hasItemMeta() ? 1 : 0) != (0x57C4150 ^ n11)) {
                                    final int n12 = 0x3E5C8D8D ^ n11;
                                    if ((itemStack2.hasItemMeta() ? 1 : 0) != (0x3B20CCDD ^ n12)) {
                                        final int n13 = 0x37BE6F8 ^ n12;
                                        equals = (byte)(itemStack2.getItemMeta().equals((Object)itemStack.getItemMeta()) ? 1 : 0);
                                        final int bynukygzdcwuqufw = bynukygzdcwuqufw(n13, 1826605379);
                                        try {
                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw) != 62991377) {
                                                throw null;
                                            }
                                            throw new IllegalAccessException();
                                        }
                                        catch (final IllegalAccessException ex) {
                                            int n14 = 0;
                                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(bynukygzdcwuqufw)) {
                                                case -1540941006: {
                                                    n14 = (0x653B7041 ^ bynukygzdcwuqufw);
                                                    break;
                                                }
                                                default: {
                                                    throw new IOException("Error in hash");
                                                }
                                                case -1199296096: {
                                                    n14 = (0x26AF1513 ^ bynukygzdcwuqufw);
                                                    break;
                                                }
                                            }
                                            bynukygzdcwuqufw2 = (0x3774867 ^ n14);
                                            break Label_1030;
                                        }
                                        break Label_0430;
                                    }
                                    final int n15 = 0x1CB17C4B ^ n12;
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15) != 212492723) {
                                        throw new RuntimeException();
                                    }
                                    bynukygzdcwuqufw3 = bynukygzdcwuqufw(n15, 636649354);
                                }
                                else {
                                    final int bynukygzdcwuqufw4 = bynukygzdcwuqufw(n11, 2009060324);
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw4) != 240819967) {
                                        throw new RuntimeException();
                                    }
                                    bynukygzdcwuqufw3 = (0x70A05DA8 ^ bynukygzdcwuqufw4);
                                }
                                if ((itemStack.hasItemMeta() ? 1 : 0) == (0x263CF1C ^ bynukygzdcwuqufw3)) {
                                    int n16 = 0x408F27EB ^ bynukygzdcwuqufw3;
                                    if ((itemStack2.hasItemMeta() ? 1 : 0) == (0x42ECE8F7 ^ n16)) {
                                        final int n17 = 0x5D4828E6 ^ n16;
                                        equals = (byte)(0x1FA4C010 ^ n17);
                                        bynukygzdcwuqufw2 = (0x2D6C1B51 ^ n17);
                                    }
                                    else {
                                        Label_1208: {
                                        Label_1200:
                                            while (true) {
                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16)) {
                                                    case 1312684333: {
                                                        continue Label_1591_Outer;
                                                    }
                                                    case 28000690: {
                                                        break Label_1200;
                                                    }
                                                    case 1192592186: {
                                                        break Label_1208;
                                                    }
                                                    default: {
                                                        throw new RuntimeException();
                                                    }
                                                }
                                            }
                                            n16 ^= 0x61425B94;
                                        }
                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16) != 86136865) {
                                            while (true) {
                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16)) {
                                                    case 1241818489: {
                                                        continue Label_1591_Outer;
                                                    }
                                                    case 86136865: {}
                                                    default: {
                                                        throw new RuntimeException();
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            bynukygzdcwuqufw2 = bynukygzdcwuqufw(n16, 291924003);
                                        }
                                    }
                                }
                                else {
                                    final int n18 = 0x4D85A6F8 ^ bynukygzdcwuqufw3;
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n18) != 181281487) {
                                        throw new RuntimeException();
                                    }
                                    bynukygzdcwuqufw2 = (0x7D2EB2A4 ^ n18);
                                }
                            }
                            if (equals != (0x32C8DB40 ^ bynukygzdcwuqufw2)) {
                                final int n19 = 0x294A2C75 ^ bynukygzdcwuqufw2;
                                n4 += itemStack2.getAmount();
                                final int n20 = 0x347874EC ^ n19;
                                if (n4 >= n) {
                                    return (byte)(0x4E66D602 ^ (0x619C55DA ^ n20)) != 0;
                                }
                                n21 = (0x90E70E1 ^ n20);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n21) == 192590280) {
                                Label_1420:
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n21)) {
                                            case 1059484576: {
                                                continue Label_1591_Outer;
                                            }
                                            case 192590280: {
                                                break Label_1420;
                                            }
                                            case 439654595: {
                                                break Label_1428;
                                            }
                                            default: {
                                                throw new RuntimeException();
                                            }
                                        }
                                    }
                                    n21 ^= 0x40F01AE5;
                                    break Label_1428;
                                }
                            }
                            else {
                                final int bynukygzdcwuqufw5 = bynukygzdcwuqufw(bynukygzdcwuqufw2, 2125621095);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw5) != 70090993) {
                                    throw new RuntimeException();
                                }
                                n21 = bynukygzdcwuqufw(bynukygzdcwuqufw5, 712922618);
                                break Label_1428;
                            }
                        }
                        else {
                            final int bynukygzdcwuqufw6 = bynukygzdcwuqufw(n9, 452787637);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw6) != 144381758) {
                                throw new RuntimeException();
                            }
                            n21 = bynukygzdcwuqufw(bynukygzdcwuqufw6, 1270845654);
                            break Label_1428;
                        }
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n21)) {
                                case 1094743578: {
                                    continue Label_1591_Outer;
                                }
                                case 192590280: {}
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                    }
                    final int bynukygzdcwuqufw7 = bynukygzdcwuqufw(n8, 712291739);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw7) != 51388411) {
                        bynukygzdcwuqufw(bynukygzdcwuqufw7, 269635125);
                        throw new RuntimeException();
                    }
                    n21 = (0x3A6F946B ^ bynukygzdcwuqufw7);
                }
                i += (0x6604E9DC ^ n21);
                final int n22 = 0x7D379FCD ^ n21;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n22) != 78884748) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex2) {
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n22)) {
                        case -644108160: {
                            n6 = (0x19CCF939 ^ n22);
                            break;
                        }
                        default: {
                            throw new RuntimeException("Error in hash");
                        }
                        case 272783146: {
                            n6 = (0x40F7C5CC ^ n22);
                            break;
                        }
                    }
                Label_1580:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 1857407114: {
                                continue Label_1591_Outer;
                            }
                            case 909787910: {
                                continue Label_1591_Outer;
                            }
                            case 47158473: {
                                break Label_1580;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    n6 ^= 0x41711AD1;
                    continue Label_1591_Outer;
                }
                continue;
            }
        }
        final int bynukygzdcwuqufw8 = bynukygzdcwuqufw(n6, 766125902);
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw8) == 90666084) {
            final int bynukygzdcwuqufw9 = bynukygzdcwuqufw(bynukygzdcwuqufw8, 1068482700);
            if (n4 >= n) {
                int n23 = 0x39949108 ^ bynukygzdcwuqufw9;
                final byte b = (byte)(0x681FE333 ^ n23);
                Label_0656: {
                Label_0648:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n23)) {
                            case 562495955: {
                                continue;
                            }
                            case 163422255: {
                                break Label_0648;
                            }
                            case 526817699: {
                                break Label_0656;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    n23 ^= 0x48C05E41;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n23) != 263282641) {
                            throw null;
                        }
                        throw new RuntimeException();
                    }
                    catch (final RuntimeException ex3) {
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n23)) {
                            case 117304217: {
                                break;
                            }
                            case 1766754656: {
                                bynukygzdcwuqufw(n23, 815809834);
                                break;
                            }
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                        }
                        return b != 0;
                    }
                }
            }
            final int bynukygzdcwuqufw10 = bynukygzdcwuqufw(bynukygzdcwuqufw9, 1108268124);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw10) != 97706464) {
                bynukygzdcwuqufw(bynukygzdcwuqufw10, 1610388965);
                throw new RuntimeException();
            }
            final byte b = (byte)(0x4BD6B7F3 ^ bynukygzdcwuqufw(bynukygzdcwuqufw10, 1481838997));
            return b != 0;
        }
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(bynukygzdcwuqufw8)) {
                case 1189029579: {
                    continue;
                }
                case 90666084: {}
                default: {
                    throw new RuntimeException();
                }
            }
        }
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0x6CF6D699 ^ (0x325DCD3E ^ (0x4D20C2D3 ^ (this.btIRYCzsco ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x3B82ABB5 ^ (0x75A78BCB ^ (0xFF961EB ^ (this.btIRYCzsco ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x3C6CDB34 ^ (0x35235687 ^ (0x28B79B5A ^ (this.btIRYCzsco ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (BillfordGUI.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        BillfordGUI.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        BillfordGUI.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordGUI.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        BillfordGUI.yauzbgmfnf = isphmvmtsbkzozl();
        BillfordGUI.teQksBq9uU = (0xFABC7512 ^ new Random(7838706670558687627L).nextInt());
    }
    
    public static String jrfprvwezs(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= BillfordGUI.yauzbgmfnf[i % BillfordGUI.yauzbgmfnf.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] isphmvmtsbkzozl() {
        return new byte[] { 80, 18, 106, 72, 105, 101, 13, 19, 114, 26, 83, 25, 116, 56, 49, 18, 56, 1, 86, 46, 82, 85, 26, 48, 66, 24, 75, 44, 43, 21, 105, 67, 98, 38, 113 };
    }
    
    private static byte[] kqhbctgmyhicqto() {
        return new byte[] { -103, -40, 91, 31, 93, 60, 63, 70, 75, 65, 102, 78, 65, 99, 1, 82, 1, 92, 97, 68, 99, 7, 46, 117, 112, 72, 114, 53, 30, 80, 92, 30, 82, 96, 72, 5, 37, 58 };
    }
    
    private static byte[] caktjqkdwbhquox() {
        return new byte[] { -103, -38, 94, 26, 93, 58, 52, 74, 66, 65, 100, 75, 68, 99, 7, 89, 13, 85, 97, 70, 102, 2, 46, 115, 123, 68, 123, 53, 28, 71, 89, 30, 84, 115, 68, 12, 37, 2, 124, 48, 81, 79, 42, 34, 42, 9, 46, 110, 8, 104, 36, 96, 52, 18, 25, 0, 97, 88, 4, 29, 33, 31, 28, 112 };
    }
    
    private static byte[] gschxkxebhpjugu() {
        return new byte[] { -101, -33, 89, 27, 94, 52, 57, 75, 65, 67, 97, 76, 69, 96, 9, 84, 12, 86, 99, 67, 97, 3, 45, 125, 118, 69, 120, 55, 25, 64, 88, 29, 90, 126, 69, 15, 39, 7, 123, 49, 82, 65, 39, 35, 41, 11, 43, 105, 9, 98, 42, 101, 53, 22, 27, 16, 102, 71, 7, 27, 44, 6, 31, 65, 39, 52, 114, 52, 30, 40, 100, 68 };
    }
    
    private static byte[] uytnckohxjsowui() {
        return new byte[] { -104, -39, 94, 31, 90, 56, 52, 75, 68, 66, 103, 74, 71, 99, 8, 84, 14, 81, 98, 68, 97, 6, 35, 113, 116, 69, 127, 55, 24, 71, 80, 30, 84, 126, 69, 9, 33, 1, 113, 52, 83, 77, 39, 34, 41, 10, 32, 110, 14, 105, 38, 98, 50, 16, 23, 3 };
    }
    
    private static byte[] qdqljusprapszdk() {
        return new byte[] { -100, -35, 83, 28, 93, 58, 56, 77, 67, 71, 97, 79, 77, 97, 5, 86, 13, 87, 103, 64, 96, 2, 35, 115, 118, 71, 126, 48, 26, 69, 91, 29, 91, 102, 69, 15, 39, 52, 121, 118, 87, 81, 42, 43, 46, 23, 44, 35 };
    }
    
    private static byte[] fqnzoshfhqeopmq() {
        return new byte[] { -103, -36, 82, 25, 89, 56, 56, 75, 70, 65, 98, 71, 71, 103, 5, 85, 12, 81, 97, 64, 106, 1, 42, 113, 119, 69, 127, 53, 26, 89, 90, 1, 86, 114, 69, 0, 37, 62, 112, 5, 85, 90, 38, 46, 46, 11, 40, 37, 11, 98, 38, 104 };
    }
    
    private static byte[] zzblahrdofaruiw() {
        return new byte[] { -102, -43, 95, 14, 89, 40, 52, 88, 69, 75, 107, 66, 65, 111, 8, 95, 1, 94, 98, 100, 103, 15, 42, 109 };
    }
    
    private static byte[] kcsccavmyqyjyqr() {
        return new byte[] { -97, -34, 94, 19, 92, 56, 52, 75, 71, 71, 98, 76, 64, 110, 4, 84, 1, 81, 99, 64, 99, 1, 46, 124, 119, 69, 114, 54, 30, 80, 88, 2, 86, 126, 68, 0, 43, 59, 125, 7, 84, 93, 39, 35, 47, 8, 32, 41, 13, 99, 35, 110 };
    }
    
    private static byte[] xvzjojliqwawxox() {
        return new byte[] { -104, -36, 89, 27, 89, 38, 59, 74, 74, 88, 98, 71, 68, 125, 0, 72, 8, 77, 96, 118, 97, 21, 42, 109, 116, 65, 115, 127, 26, 84 };
    }
    
    private static int bynukygzdcwuqufw(final int n, final int n2) {
        return n2 ^ n;
    }
}
