package dev.daniboy.donutcore.gui.impl.billford;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import java.util.stream.IntStream;
import dev.daniboy.donutcore.gui.WrappedClickEvent;
import dev.daniboy.donutcore.utils.ItemBuilder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import dev.daniboy.donutcore.utils.Hex;
import org.bukkit.inventory.Inventory;
import java.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.gui.AbstractGui;

public class BillfordEditorItemsGUI extends AbstractGui
{
    private final SQLiteManager sqLiteManager;
    private final Map<Player, Object[]> opened;
    private final FileConfiguration billfordGuiConfig;
    private static int rXPoBoOB2j = 0;
    private transient int SmuOPKaG9X = 1475056846;
    private static String qmwwieyewj;
    private static String[] nothing_to_see_here;
    
    public BillfordEditorItemsGUI(final DonutCore donutCore, final SQLiteManager sqLiteManager, final int n) {
        final int n2 = 0x1362FFBC ^ 0x2B0FE2B5;
        super(donutCore, 1156425752);
        vamqxfvfrewlrclb(n2, 1375702595);
        int n3 = 0xC64C220 ^ (0x2DA270C4 ^ (Integer.parseInt("529235807") ^ n));
    Label_0122:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                case 1750884385: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 403264883: {
                    break Label_0122;
                }
                case 210474189: {
                    n3 ^= 0x3FCBC7C;
                    break Label_0122;
                }
            }
        }
        this.opened = (Map<Player, Object[]>)new ConcurrentHashMap();
        this.sqLiteManager = sqLiteManager;
        this.billfordGuiConfig = donutCore.getBillfordGuiConfig$756205206(1840850862);
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0x19FE3952 ^ (0x6ED36E00 ^ (0x115C7CB3 ^ (this.SmuOPKaG9X ^ n)));
        final String string = this.billfordGuiConfig.getString(kqwurrinug(shgjygmeykiymsc(), n2));
        final int n3 = 0x404A7EC5 ^ n2;
        final String hex = Hex.hex(this.billfordGuiConfig.getString(kqwurrinug(axrrtuayapejjti(), n3)));
        final int n4 = 0x12035E15 ^ n3;
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, (int)(byte)(0x40069AF5 ^ n4), string);
        final int n5 = 0x315EBE0F ^ n4;
        final ItemBuilder itemBuilder = new ItemBuilder(new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        final String kqwurrinug = kqwurrinug(juflggcjwzvnwey(), n5);
        final int n6 = 0x20A20FAB ^ n5;
        final ItemBuilder name = itemBuilder.name(kqwurrinug);
        final String[] array2 = new String[(byte)(0x51FA2B4B ^ n6)];
        array2[(byte)(0x51FA2B4A ^ n6)] = hex;
        final int n7 = 0xD4A4F5F ^ n6;
        final ItemBuilder lore = name.lore(array2);
        final int n8 = 0x4D98EE1B ^ n7;
        final ItemStack build = lore.build();
        final int n9 = 0x5905CAC1 ^ n8;
        final int[] array3 = new int[(byte)(0x482D40C6 ^ n9)];
        array3[(byte)(0x482D40CF ^ n9)] = (byte)(0x482D40C6 ^ n9);
        array3[(byte)(0x482D40CE ^ n9)] = (byte)(0x482D40C5 ^ n9);
        array3[(byte)(0x482D40CD ^ n9)] = (byte)(0x482D40C4 ^ n9);
        array3[(byte)(0x482D40CC ^ n9)] = (byte)(0x482D40C3 ^ n9);
        array3[(byte)(0x482D40CB ^ n9)] = (byte)(0x482D40C2 ^ n9);
        array3[(byte)(0x482D40CA ^ n9)] = (byte)(0x482D40C1 ^ n9);
        array3[(byte)(0x482D40C9 ^ n9)] = (byte)(0x482D40C0 ^ n9);
        array3[(byte)(0x482D40C8 ^ n9)] = (byte)(0x482D40DF ^ n9);
        array3[(byte)(0x482D40C7 ^ n9)] = (byte)(0x482D40DE ^ n9);
        final int[] array4 = array3;
        final int n10 = 0x5BE4443D ^ n9;
        final Map<Integer, ItemStack> allBillfordItems$1462928060 = this.sqLiteManager.getAllBillfordItems$1462928060();
        final int n11 = 0xA667F8C ^ n10;
        int i = (byte)(0x19AF7B7E ^ n11);
        int n12 = 0x6FD9469D ^ n11;
        while (i < array4.length) {
            final int n13 = 0x2856B4A0 ^ n12;
            final ItemStack itemStack = (ItemStack)allBillfordItems$1462928060.getOrDefault((Object)i, (Object)build);
            final int n14 = 0x5B72200B ^ n13;
            inventory.setItem(array4[i], itemStack);
            int n15 = 0x53E6E60B ^ n14;
            i += (0x56B44F42 ^ n15);
            Label_0787: {
            Label_0780:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15)) {
                        case 1859449808: {
                            continue;
                        }
                        case 134024997: {
                            break Label_0780;
                        }
                        case 66760468: {
                            break Label_0787;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n15 ^= 0x51D9AE96;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15) != 116851930) {
                        throw null;
                    }
                    throw new IOException();
                }
                catch (final IOException ex) {
                    int vamqxfvfrewlrclb = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n15)) {
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case 997133992: {
                            vamqxfvfrewlrclb = (0x1899D98C ^ n15);
                            break;
                        }
                        case 1214205537: {
                            vamqxfvfrewlrclb = vamqxfvfrewlrclb(n15, 922734997);
                            break;
                        }
                    }
                    n12 = (0x698205BA ^ vamqxfvfrewlrclb);
                    continue;
                }
            }
            throw new IOException();
        }
        final int n16 = 0x32D8A7C6 ^ n12;
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16) != 85069321) {
            vamqxfvfrewlrclb(n16, 207404906);
            throw new IOException();
        }
        vamqxfvfrewlrclb(n16, 1379005468);
        return inventory;
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        Label_2225: {
            Label_2171: {
                int vamqxfvfrewlrclb = 0;
            Label_0918_Outer:
                while (true) {
                    final int n2 = 0xABBDA76 ^ (0x1FFA3039 ^ (0x6C1A4A39 ^ (this.SmuOPKaG9X ^ n)));
                    final int slot$2125716982 = wrappedClickEvent.getSlot$2125716982(2104088370);
                    final int n3 = 0x32710D54 ^ n2;
                    final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
                    final int n4 = 0x1F624778 ^ n3;
                    final ItemStack itemStack$386585608 = wrappedClickEvent.getItemStack$386585608(389697697);
                    final int n5 = 0x30258697 ^ n4;
                    final ItemStack cursor$1334603673 = wrappedClickEvent.getCursor$1334603673(89939990);
                    final int n6 = 0x130EBC65 ^ n5;
                    final int[] array = new int[(byte)(0x3DCCAE0F ^ n6)];
                    array[(byte)(0x3DCCAE06 ^ n6)] = (byte)(0x3DCCAE0F ^ n6);
                    array[(byte)(0x3DCCAE07 ^ n6)] = (byte)(0x3DCCAE0C ^ n6);
                    array[(byte)(0x3DCCAE04 ^ n6)] = (byte)(0x3DCCAE0D ^ n6);
                    array[(byte)(0x3DCCAE05 ^ n6)] = (byte)(0x3DCCAE0A ^ n6);
                    array[(byte)(0x3DCCAE02 ^ n6)] = (byte)(0x3DCCAE0B ^ n6);
                    array[(byte)(0x3DCCAE03 ^ n6)] = (byte)(0x3DCCAE08 ^ n6);
                    array[(byte)(0x3DCCAE00 ^ n6)] = (byte)(0x3DCCAE09 ^ n6);
                    array[(byte)(0x3DCCAE01 ^ n6)] = (byte)(0x3DCCAE16 ^ n6);
                    array[(byte)(0x3DCCAE0E ^ n6)] = (byte)(0x3DCCAE17 ^ n6);
                    final int[] array2 = array;
                    final int n7 = 0x64B0758D ^ n6;
                    final int orElse = IntStream.range((int)(byte)(0x597CDB8B ^ n7), array2.length).filter(n2 -> {
                        final int n3 = 0x6BE8B357 ^ (0x1398A187 ^ (0x2D92185 ^ BillfordEditorItemsGUI.rXPoBoOB2j));
                        byte b = 0;
                        Label_0269: {
                            if (array2[n2] == slot$2125716982) {
                                final int n4 = 0x619A03B2 ^ n3;
                                b = (byte)(0x61605132 ^ n4);
                                final int vamqxfvfrewlrclb = vamqxfvfrewlrclb(n4, 965074057);
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vamqxfvfrewlrclb) != 205298301) {
                                        throw null;
                                    }
                                    throw new RuntimeException();
                                }
                                catch (final RuntimeException ex) {
                                    int vamqxfvfrewlrclb2 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(vamqxfvfrewlrclb)) {
                                        case -1351316624: {
                                            vamqxfvfrewlrclb2 = vamqxfvfrewlrclb(vamqxfvfrewlrclb, 1006943793);
                                            break;
                                        }
                                        case -953389614: {
                                            vamqxfvfrewlrclb2 = (0x710FA2E5 ^ vamqxfvfrewlrclb);
                                            break;
                                        }
                                        default: {
                                            throw new RuntimeException("Error in hash");
                                        }
                                    }
                                Label_0188:
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vamqxfvfrewlrclb2)) {
                                            case 859099976: {
                                                continue;
                                            }
                                            case 20288034: {
                                                break Label_0188;
                                            }
                                            default: {
                                                throw new RuntimeException();
                                            }
                                            case 809962029: {
                                                break Label_0269;
                                            }
                                        }
                                    }
                                    return b != 0;
                                }
                            }
                            final int n5 = 0x5360507A ^ n3;
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) == 33175132) {
                                b = (byte)(0x3A118D3 ^ (0x503B1A28 ^ n5));
                                return b != 0;
                            }
                            throw new RuntimeException();
                        }
                        return b != 0;
                    }).findFirst().orElse((int)(byte)(0xA6832474 ^ n7));
                    int n8 = 0x1BFAF92D ^ n7;
                    Label_2020: {
                    Label_0918:
                        while (true) {
                        Label_0683:
                            while (true) {
                                Label_2226: {
                                    Label_1929: {
                                        try {
                                            if (orElse != (byte)(0xBD79DD59 ^ n8)) {
                                                n8 ^= 0x2F97DFC6;
                                                if ((wrappedClickEvent.isRightClick$1018531030(695466385) ? 1 : 0) != (0x6D11FD60 ^ n8)) {
                                                    n8 ^= 0x620FCC53;
                                                    if (itemStack$386585608 == null) {
                                                        break Label_2226;
                                                    }
                                                    n8 ^= 0x6A87DABB;
                                                    if (itemStack$386585608.getType() != Material.AIR) {
                                                        n8 ^= 0x1E71C6E1;
                                                        if (itemStack$386585608.getType() != Material.GRAY_STAINED_GLASS_PANE) {
                                                            n8 ^= 0x306BEB3C;
                                                            wrappedClickEvent.getInventory$1458066743(1496261850).setItem(slot$2125716982, new ItemStack(Material.AIR));
                                                            n8 ^= 0x3720AA3B;
                                                            this.sqLiteManager.removeBillfordItem$1762603750(itemStack$386585608, 413646439);
                                                            break Label_0683;
                                                        }
                                                    Label_0976:
                                                        while (true) {
                                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                                case 499377226: {
                                                                    continue Label_0918_Outer;
                                                                }
                                                                case 1158163: {
                                                                    n8 ^= 0x75E7E8D0;
                                                                }
                                                                case 372822359: {
                                                                    break Label_0976;
                                                                }
                                                                default: {
                                                                    throw new IOException();
                                                                }
                                                            }
                                                        }
                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 188645657) {
                                                        Label_1096:
                                                            while (true) {
                                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                                    case 1529685371: {
                                                                        continue Label_0918_Outer;
                                                                    }
                                                                    case 188645657: {
                                                                        break Label_1096;
                                                                    }
                                                                    default: {
                                                                        throw new IOException();
                                                                    }
                                                                }
                                                            }
                                                            n8 ^= 0x7F5A3FE6;
                                                            throw new IOException();
                                                        }
                                                    Label_1036:
                                                        while (true) {
                                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                                case 1493298925: {
                                                                    break Label_0918;
                                                                }
                                                                case 806533236: {
                                                                    continue Label_0918_Outer;
                                                                }
                                                                case 188645657: {
                                                                    break Label_1036;
                                                                }
                                                                default: {
                                                                    throw new IOException();
                                                                }
                                                            }
                                                        }
                                                        n8 ^= 0x38F1B1B0;
                                                        break Label_0918;
                                                    }
                                                    else {
                                                        n8 ^= 0x5BEB1A54;
                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 150899432) {
                                                        Label_1420:
                                                            while (true) {
                                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                                    case 1600402916: {
                                                                        continue Label_0918_Outer;
                                                                    }
                                                                    case 150899432: {
                                                                        break Label_1420;
                                                                    }
                                                                    default: {
                                                                        throw new IOException();
                                                                    }
                                                                }
                                                            }
                                                            n8 ^= 0x4F270B83;
                                                            throw new IOException();
                                                        }
                                                        n8 = vamqxfvfrewlrclb(n8, 399408733);
                                                    }
                                                }
                                                else {
                                                    n8 = vamqxfvfrewlrclb(n8, 244904500);
                                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 14282299) {
                                                        n8 ^= 0x12DCF50B;
                                                        throw new IOException();
                                                    }
                                                Label_1552:
                                                    while (true) {
                                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                            case 77817414: {
                                                                break Label_0683;
                                                            }
                                                            case 1149416690: {
                                                                continue Label_0918_Outer;
                                                            }
                                                            case 14282299: {
                                                                break Label_1552;
                                                            }
                                                            default: {
                                                                throw new IOException();
                                                            }
                                                        }
                                                    }
                                                    n8 ^= 0x4A3580D5;
                                                }
                                                if (itemStack$386585608 != null) {
                                                    n8 ^= 0x3E8CA90B;
                                                    if (itemStack$386585608.getType() != Material.GRAY_STAINED_GLASS_PANE) {
                                                        break Label_1929;
                                                    }
                                                    n8 ^= 0x6058E693;
                                                    if (cursor$1334603673 != null) {
                                                        n8 ^= 0x5D837551;
                                                        if (cursor$1334603673.getType() != Material.AIR) {
                                                            n8 ^= 0x746241E1;
                                                            final ItemStack clone = cursor$1334603673.clone();
                                                            n8 ^= 0x182BCAB1;
                                                            wrappedClickEvent.getInventory$1458066743(1496261850).setItem(slot$2125716982, clone);
                                                            n8 ^= 0x67134E61;
                                                            player$624284539.setItemOnCursor(new ItemStack(Material.AIR));
                                                            n8 ^= 0x3CC0A20E;
                                                            this.sqLiteManager.saveBillfordItems$48192890(orElse, clone, 1564110674);
                                                            n8 ^= 0x2B8FA67E;
                                                        }
                                                        else {
                                                            n8 = vamqxfvfrewlrclb(n8, 1780851410);
                                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 227478900) {
                                                                n8 ^= 0x319BEDC5;
                                                                throw new IOException();
                                                            }
                                                            n8 = vamqxfvfrewlrclb(n8, 1982882707);
                                                        }
                                                    }
                                                    else {
                                                        n8 = vamqxfvfrewlrclb(n8, 487497029);
                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 237387396) {
                                                        Label_1312:
                                                            while (true) {
                                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                                    case 1465359047: {
                                                                        continue Label_0918_Outer;
                                                                    }
                                                                    case 237387396: {
                                                                        break Label_1312;
                                                                    }
                                                                    default: {
                                                                        throw new IOException();
                                                                    }
                                                                }
                                                            }
                                                            n8 ^= 0x1B33A703;
                                                            throw new IOException();
                                                        }
                                                        n8 = vamqxfvfrewlrclb(n8, 1553475925);
                                                    }
                                                }
                                                else {
                                                    n8 ^= 0x3B58C8F6;
                                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 77224082) {
                                                        n8 ^= 0x63B1BD28;
                                                        throw new IOException();
                                                    }
                                                    n8 = vamqxfvfrewlrclb(n8, 605696894);
                                                }
                                            }
                                            else {
                                            Label_1164:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                        case 1369540126: {
                                                            continue Label_0918_Outer;
                                                        }
                                                        case 14918055: {
                                                            n8 ^= 0x3CDEDFC3;
                                                        }
                                                        case 1274826778: {
                                                            break Label_1164;
                                                        }
                                                        default: {
                                                            throw new IOException();
                                                        }
                                                    }
                                                }
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 80483499) {
                                                    n8 ^= 0xF0D073A;
                                                    throw new IOException();
                                                }
                                            Label_1232:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                                        case 1858555529: {
                                                            break Label_0918;
                                                        }
                                                        case 481506723: {
                                                            continue Label_0918_Outer;
                                                        }
                                                        case 80483499: {
                                                            break Label_1232;
                                                        }
                                                        default: {
                                                            throw new IOException();
                                                        }
                                                    }
                                                }
                                                n8 ^= 0x48A6896C;
                                            }
                                            break Label_2020;
                                        }
                                        catch (final Exception ex) {
                                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n8)) {
                                                case 227247049: {
                                                    break Label_2171;
                                                }
                                                case 2029095320: {
                                                    vamqxfvfrewlrclb(n8, 1571959727);
                                                }
                                                case -342977608: {}
                                                case 751787075: {}
                                                case 1545482922: {
                                                    break Label_2171;
                                                }
                                                case -1153040181: {
                                                    vamqxfvfrewlrclb(n8, 633651845);
                                                }
                                                case 338761010: {
                                                    break Label_2171;
                                                }
                                                case 1465756225: {
                                                    vamqxfvfrewlrclb(n8, 2017966036);
                                                }
                                                case -196106934: {
                                                    break Label_2171;
                                                }
                                                case -1182714800: {
                                                    vamqxfvfrewlrclb(n8, 1167860758);
                                                }
                                                case 1306819593: {}
                                                case -549360821: {
                                                    break Label_2171;
                                                }
                                                default: {
                                                    throw new IllegalAccessException("Error in hash");
                                                }
                                                case 1754262275: {
                                                    vamqxfvfrewlrclb(n8, 1069416444);
                                                }
                                                case -451189901: {}
                                                case 890368194: {
                                                    break Label_2171;
                                                }
                                            }
                                        }
                                    }
                                    vamqxfvfrewlrclb = vamqxfvfrewlrclb(n8, 196734716);
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vamqxfvfrewlrclb) != 122349805) {
                                        break;
                                    }
                                    n8 = vamqxfvfrewlrclb(vamqxfvfrewlrclb, 712490111);
                                    continue Label_0918;
                                }
                                final int n9 = 0x5A10A23E ^ n8;
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 80505319) {
                                    vamqxfvfrewlrclb(n9, 609970514);
                                    throw new IOException();
                                }
                                n8 = (0x7CB21C8C ^ n9);
                                continue Label_0683;
                            }
                            final int vamqxfvfrewlrclb2 = vamqxfvfrewlrclb(n8, 1525275718);
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vamqxfvfrewlrclb2) != 170955527) {
                                    throw null;
                                }
                                throw new RuntimeException();
                            }
                            catch (final RuntimeException ex2) {
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(vamqxfvfrewlrclb2)) {
                                    default: {
                                        throw new IOException("Error in hash");
                                    }
                                    case 844464449: {
                                        n8 = (0x7C7DA380 ^ vamqxfvfrewlrclb2);
                                        break;
                                    }
                                    case -1078728423: {
                                        n8 = (0x6DC16E8B ^ vamqxfvfrewlrclb2);
                                        break;
                                    }
                                }
                            Label_2412:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                        case 390039845: {
                                            continue Label_0918;
                                            continue Label_0918;
                                        }
                                        case 604465485: {
                                            continue Label_0918_Outer;
                                        }
                                        case 248179746: {
                                            break Label_2412;
                                        }
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                                n8 ^= 0x6CC967A1;
                                continue Label_0918;
                            }
                            break;
                        }
                        throw new IOException();
                    }
                    final int vamqxfvfrewlrclb3 = vamqxfvfrewlrclb(n8, 82534303);
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vamqxfvfrewlrclb3) != 17380967) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    }
                    catch (final IllegalAccessException ex3) {
                        int n10 = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(vamqxfvfrewlrclb3)) {
                            default: {
                                throw new IOException("Error in hash");
                            }
                            case -48175830: {
                                n10 = (0xF0168BC ^ vamqxfvfrewlrclb3);
                                break;
                            }
                            case -1867948879: {
                                n10 = (0x62B05F8F ^ vamqxfvfrewlrclb3);
                                break;
                            }
                        }
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                case 820345403: {
                                    continue Label_0918_Outer;
                                }
                                case 205570133: {}
                                case 466825516: {
                                    break Label_2225;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        return;
                    }
                    break Label_2171;
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vamqxfvfrewlrclb)) {
                        case 1251093482: {
                            continue;
                        }
                        case 122349805: {}
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
            final Exception ex;
            Bukkit.getLogger().severe("An error occurred while handling click event: " + ex.getMessage());
        }
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0x901D249 ^ (0x5C1BC27A ^ (0x1BBE3741 ^ (this.SmuOPKaG9X ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x39E403E0 ^ (0x4D24F23D ^ (0x59679479 ^ (this.SmuOPKaG9X ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x7FEDD05A ^ (0x12CE0F05 ^ (0x7E296EC8 ^ (this.SmuOPKaG9X ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (BillfordEditorItemsGUI.nothing_to_see_here = new String[15])[0] = "\u2804\u2804\u2804\u28b0\u28e7\u28fc\u28ef\u2804\u28f8\u28e0\u28f6\u28f6\u28e6\u28fe\u2804\u2804\u2804\u2804\u2840\u2804\u2880\u28ff\u28ff\u2804\u2804\u2804\u28b8\u2847\u2804\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[1] = "\u2804\u2804\u2804\u28fe\u28ff\u283f\u283f\u2836\u283f\u28bf\u28ff\u28ff\u28ff\u28ff\u28e6\u28e4\u28c4\u2880\u2845\u28a0\u28fe\u28db\u2849\u2804\u2804\u2804\u2838\u2880\u28ff\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[2] = "\u2804\u2804\u2880\u284b\u28e1\u28f4\u28f6\u28f6\u2840\u2804\u2804\u2819\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28f4\u28ff\u28ff\u28ff\u2883\u28e4\u28c4\u28c0\u28e5\u28ff\u28ff\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[3] = "\u2804\u2804\u28b8\u28c7\u283b\u28ff\u28ff\u28ff\u28e7\u28c0\u2880\u28e0\u284c\u28bb\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28ff\u28ff\u28ff\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[4] = "\u2804\u2880\u28b8\u28ff\u28f7\u28e4\u28e4\u28e4\u28ec\u28d9\u28db\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u28ff\u28ff\u284d\u2804\u2804\u2880\u28e4\u28c4\u2809\u280b\u28f0";
        BillfordEditorItemsGUI.nothing_to_see_here[5] = "\u2804\u28fc\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u2887\u28ff\u28ff\u2877\u2836\u2836\u28bf\u28ff\u28ff\u2807\u2880\u28e4";
        BillfordEditorItemsGUI.nothing_to_see_here[6] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u2847\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28f6\u28e5\u28f4\u28ff\u2857";
        BillfordEditorItemsGUI.nothing_to_see_here[7] = "\u2880\u2808\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u285f\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[8] = "\u28b8\u28ff\u28e6\u28cc\u28db\u28fb\u28ff\u28ff\u28e7\u2819\u281b\u281b\u286d\u2805\u2812\u2826\u282d\u28ed\u287b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[9] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2846\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2839\u2808\u288b\u28fd\u28ff\u28ff\u28ff\u28ff\u28f5\u28fe\u2803\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[10] = "\u2804\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2804\u28f4\u28ff\u28f6\u28c4\u2804\u28f4\u28f6\u2804\u2880\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2804\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[11] = "\u2804\u2804\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2844\u28bb\u28ff\u28ff\u28ff\u2804\u28ff\u28ff\u2840\u28fe\u28ff\u28ff\u28ff\u28ff\u28db\u281b\u2801\u2804\u2804\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2808\u281b\u28bf\u28ff\u28ff\u28ff\u2801\u281e\u28bf\u28ff\u28ff\u2844\u28bf\u28ff\u2847\u28f8\u28ff\u28ff\u283f\u281b\u2801\u2804\u2804\u2804\u2804\u2804";
        BillfordEditorItemsGUI.nothing_to_see_here[13] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2809\u283b\u28ff\u28ff\u28fe\u28e6\u2859\u283b\u28f7\u28fe\u28ff\u2803\u283f\u280b\u2801\u2804\u2804\u2804\u2804\u2804\u2880\u28e0\u28f4";
        BillfordEditorItemsGUI.nothing_to_see_here[14] = "\u28ff\u28ff\u28ff\u28f6\u28f6\u28ee\u28e5\u28d2\u2832\u28ae\u28dd\u287f\u28ff\u28ff\u2846\u28ff\u287f\u2803\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28e0\u28f4\u28ff\u28ff\u28ff";
        BillfordEditorItemsGUI.qmwwieyewj = ByteBuffer.wrap(cvubukqqjzvpzgw()).asCharBuffer().toString();
        BillfordEditorItemsGUI.rXPoBoOB2j = (0x63D9E747 ^ new Random(-1776266254713068085L).nextInt());
    }
    
    public static String kqwurrinug(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = BillfordEditorItemsGUI.qmwwieyewj.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] juflggcjwzvnwey() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 0, 0 };
    }
    
    private static byte[] shgjygmeykiymsc() {
        return new byte[] { 0, 0, 0, 42, 0, 0, 0, 1 };
    }
    
    private static byte[] axrrtuayapejjti() {
        return new byte[] { 0, 0, 0, 52, 0, 0, 0, 43 };
    }
    
    private static byte[] cvubukqqjzvpzgw() {
        return new byte[] { 49, 25, 51, 82, 55, 91, 49, 88, 57, 93, 48, 85, 48, 88, 50, 67, 52, 93, 49, 111, 51, 87, 55, 71, 49, 93, 57, 31, 48, 81, 48, 94, 50, 93, 52, 85, 49, 86, 51, 95, 55, 64, 49, 80, 57, 84, 48, 87, 48, 94, 50, 69, 52, 86, 49, 66, 51, 89, 55, 70, 49, 81, 57, 92, 48, 64, 48, 104, 50, 86, 52, 76, 49, 89, 51, 30, 55, 70, 49, 93, 57, 69, 48, 95, 48, 82, 49, 81, 55, 95, 49, 92, 57, 84, 49, 95, 49, 92, 55, 68, 49, 84, 57, 103, 49, 94, 49, 70, 55, 95, 49, 30, 57, 90, 49, 80, 49, 95, 55, 90, 49, 86, 57, 87, 49, 75, 49, 87, 55, 83, 49, 84, 57, 81, 49, 77, 49, 92, 55, 68, 49, 89, 57, 76, 49, 92, 49, 94, 55, 69, 49, 111, 57, 95, 49, 76, 49, 90, 55, 24, 49, 87, 57, 84, 49, 88, 49, 64, 55, 69, 49, 29, 57, 72, 49, 88, 49, 93, 55, 83, 49, 29, 57, 84, 49, 86, 49, 65, 55, 83 };
    }
    
    private static int vamqxfvfrewlrclb(final int n, final int n2) {
        return n2 ^ n;
    }
}
