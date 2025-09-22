package dev.daniboy.donutcore.gui.impl.billford;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.config.MessagesConfig;
import java.util.Optional;
import java.io.IOException;
import dev.daniboy.donutcore.gui.WrappedClickEvent;
import dev.daniboy.donutcore.utils.ItemBuilder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import dev.daniboy.donutcore.utils.Hex;
import org.bukkit.inventory.Inventory;
import java.util.concurrent.ConcurrentHashMap;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.DonutCore;
import dev.daniboy.donutcore.gui.AbstractGui;

public class BillfordEditorGUI extends AbstractGui
{
    private final DonutCore plugin;
    private final Map<Player, Object[]> opened;
    private final FileConfiguration billfordGuiConfig;
    private static int OZDKSqGQRu = 0;
    private transient int GpfyIGQz2I = 229386958;
    private static byte[] idtlsfkpfs;
    private static String[] nothing_to_see_here;
    
    public BillfordEditorGUI(final DonutCore plugin, final int n) {
        super(plugin, 1156425752);
        int n2 = 0x24FE1B12 ^ (0x10E858CF ^ (Integer.parseInt("1293729235") ^ n));
    Label_0107:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 1704230817: {
                    continue;
                }
                case 133172013: {
                    n2 ^= 0x45FE57EF;
                }
                case 1313152594: {
                    break Label_0107;
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
        this.opened = (Map<Player, Object[]>)new ConcurrentHashMap();
        this.plugin = plugin;
        this.billfordGuiConfig = plugin.getBillfordGuiConfig$756205206(1840850862);
    }
    
    @Override
    public Inventory generateInventory$919822562(final Player player, final Object[] array, final int n) {
        final int n2 = 0x5513236F ^ (0x7FBA567D ^ (0x56ED6558 ^ (this.GpfyIGQz2I ^ n)));
        final String hex = Hex.hex(this.billfordGuiConfig.getString(ehnlorxodz(gnehcrifmrxfquf(), n2)));
        final int n3 = 0x19479A79 ^ n2;
        final Inventory inventory = Bukkit.createInventory((InventoryHolder)null, (int)(byte)(0x568C0231 ^ n3), hex);
        final int n4 = 0x628E9AE1 ^ n3;
        final ItemStack item$305086769 = this.createItem$305086769(Material.BLAZE_POWDER, ehnlorxodz(ovuuaikotcpeysp(), n4), 411645963);
        final int n5 = 0x25BCAB89 ^ n4;
        final ItemStack item$305086770 = this.createItem$305086769(Material.BLAZE_ROD, ehnlorxodz(aaqcnkhsenseelc(), n5), 411645963);
        final int n6 = 0x48F8BB23 ^ n5;
        final ItemStack item$305086771 = this.createItem$305086769(Material.BLACK_STAINED_GLASS, ehnlorxodz(prrpsgaqrrmptqq(), n6), 411645963);
        final int n7 = 0x76C87434 ^ n6;
        final ItemStack item$305086772 = this.createItem$305086769(Material.CRAFTING_TABLE, ehnlorxodz(kcoaspnpdhqxmxj(), n7), 411645963);
        final int n8 = 0x484876A9 ^ n7;
        inventory.setItem((int)(byte)(0x67C68ADA ^ n8), item$305086769);
        final int n9 = 0x33FAFFF ^ n8;
        inventory.setItem((int)(byte)(0x64F92521 ^ n9), item$305086770);
        final int n10 = 0x204B5136 ^ n9;
        inventory.setItem((int)(byte)(0x44B27407 ^ n10), item$305086771);
        inventory.setItem((int)(byte)(0x68622577 ^ (0x2CD0515E ^ n10)), item$305086772);
        return inventory;
    }
    
    private ItemStack createItem$305086769(final Material material, final String s, final int n) {
        final int n2 = 0x4FAF2FB3 ^ (0x71F8720D ^ (0x15B3A89C ^ (this.GpfyIGQz2I ^ n)));
        return new ItemBuilder(new ItemStack(material)).name(Hex.hex(this.billfordGuiConfig.getString("billford_gui.billfordeditor_gui." + s))).build();
    }
    
    @Override
    public void click$2048279449(final WrappedClickEvent wrappedClickEvent, final int n) {
        final int n2 = 0x7C785D55 ^ (0x653DCB50 ^ (0x2BAB53D2 ^ (this.GpfyIGQz2I ^ n)));
        final int slot$2125716982 = wrappedClickEvent.getSlot$2125716982(2104088370);
        final int n3 = 0x6B3B997B ^ n2;
        final Player player$624284539 = wrappedClickEvent.getPlayer$624284539(1206635844);
        final int n4 = 0xD103D8C ^ n3;
        final ItemStack cursor$1334603673 = wrappedClickEvent.getCursor$1334603673(89939990);
        final int n5 = 0x15E1D4BE ^ n4;
        Label_1262: {
            int oomlyrufewuxlagd5 = 0;
            if (slot$2125716982 == (byte)(0x4C3AD2EA ^ n5)) {
                int n6 = 0x2E6FAD7A ^ n5;
                this.plugin.getBillfordEditorItemsGui$131132968(11136247).open$967512435(player$624284539, new Object[(byte)(0x62557FA1 ^ n6)], 1892453237);
                Label_1024: {
                Label_1016:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 2046176269: {
                                continue;
                            }
                            case 243647762: {
                                break Label_1016;
                            }
                            case 275579784: {
                                break Label_1024;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n6 ^= 0x5A148578;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 218099269) {
                            throw null;
                        }
                        throw new IOException();
                    }
                    catch (final IOException ex) {
                        int n7 = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n6)) {
                            default: {
                                throw new RuntimeException("Error in hash");
                            }
                            case 1665273827: {
                                n7 = (0x4136DB30 ^ n6);
                                break;
                            }
                            case -1039149367: {
                                n7 = (0x151F6015 ^ n6);
                                break;
                            }
                        }
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                case 2111857182: {
                                    continue;
                                }
                                case 132605621: {}
                                case 464876329: {
                                    break Label_1262;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        return;
                    }
                }
            }
            else {
                final int n8 = 0x78E02448 ^ n5;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 107481446) {
                    oomlyrufewuxlagd(n8, 1763030780);
                    throw new IOException();
                }
                final int oomlyrufewuxlagd = oomlyrufewuxlagd(n8, 725204243);
                int oomlyrufewuxlagd3;
                if (slot$2125716982 == (byte)(0x1FE34B9F ^ oomlyrufewuxlagd)) {
                    final int n9 = 0x23872E94 ^ oomlyrufewuxlagd;
                    if (cursor$1334603673 != null) {
                        final int n10 = 0x7919F7FE ^ n9;
                        if (cursor$1334603673.getType() != Material.AIR) {
                            final int n11 = 0x79A2B8A7 ^ n10;
                            this.saveTradeChoice$1897065175(Optional.empty(), cursor$1334603673, 902243137);
                            final int n12 = 0x558CA575 ^ n11;
                            this.plugin.saveBillfordGuiConfig$978105170(1372127931);
                            int n13 = 0x471B0BBC ^ n12;
                            MessagesConfig.SAVINGTRADEITEMS.send((CommandSender)player$624284539);
                            Label_0396: {
                            Label_0388:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n13)) {
                                        case 564738869: {
                                            continue;
                                        }
                                        case 162311927: {
                                            break Label_0388;
                                        }
                                        case 895642487: {
                                            break Label_0396;
                                        }
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                                n13 ^= 0x54CF7A84;
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n13) != 224855719) {
                                        throw null;
                                    }
                                    throw new IOException();
                                }
                                catch (final IOException ex2) {
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n13)) {
                                        case -544100285: {
                                            break;
                                        }
                                        default: {
                                            throw new IOException("Error in hash");
                                        }
                                        case -734007293: {
                                            break;
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                        final int oomlyrufewuxlagd2 = oomlyrufewuxlagd(n10, 561058879);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(oomlyrufewuxlagd2) != 30941488) {
                            throw new IOException();
                        }
                        oomlyrufewuxlagd3 = (0x49CAA336 ^ oomlyrufewuxlagd2);
                    }
                    else {
                        final int n14 = 0x4F2FE970 ^ n9;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14) != 258085706) {
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14)) {
                                    case 1893830255: {
                                        continue;
                                    }
                                    case 258085706: {}
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                        else {
                            oomlyrufewuxlagd3 = oomlyrufewuxlagd(n14, 1586342279);
                        }
                    }
                }
                else {
                    final int n15 = 0x7E030F5A ^ oomlyrufewuxlagd;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15) != 228779142) {
                        oomlyrufewuxlagd(n15, 1009714357);
                        throw new IOException();
                    }
                    oomlyrufewuxlagd3 = (0x4C266139 ^ n15);
                }
                if (slot$2125716982 == (byte)(0x2DC625E8 ^ oomlyrufewuxlagd3)) {
                    final int n16 = 0x7EFE2D4D ^ oomlyrufewuxlagd3;
                    MessagesConfig.SAVINGCRITMULTIPLER.send((CommandSender)player$624284539);
                    int n17 = 0x7A0AEC93 ^ n16;
                    this.saveTradeChoice$1897065175(Optional.of((Object)ehnlorxodz(jhdmtoaqkdiowqc(), n17)), (ItemStack)null, 902243137);
                    Label_0812: {
                    Label_0804:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17)) {
                                case 796548983: {
                                    continue;
                                }
                                case 265466628: {
                                    break Label_0804;
                                }
                                case 1417696857: {
                                    break Label_0812;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        n17 ^= 0x347B889B;
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 146694088) {
                                throw null;
                            }
                            throw new IOException();
                        }
                        catch (final IOException ex3) {
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n17)) {
                                default: {
                                    throw new RuntimeException("Error in hash");
                                }
                                case -848013495: {
                                    break;
                                }
                                case -364157648: {
                                    break;
                                }
                            }
                            return;
                        }
                    }
                }
                final int oomlyrufewuxlagd4 = oomlyrufewuxlagd(oomlyrufewuxlagd3, 1329214246);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(oomlyrufewuxlagd4) != 264769249) {
                    oomlyrufewuxlagd(oomlyrufewuxlagd4, 1060329130);
                    throw new IOException();
                }
                oomlyrufewuxlagd5 = oomlyrufewuxlagd(oomlyrufewuxlagd4, 410176684);
            }
            if (slot$2125716982 == (byte)(0x7A8EDA66 ^ oomlyrufewuxlagd5)) {
                final int n18 = 0x3CBDC614 ^ oomlyrufewuxlagd5;
                MessagesConfig.SAVINGSRENGTHROD.send((CommandSender)player$624284539);
                this.saveTradeChoice$1897065175(Optional.of((Object)ehnlorxodz(wyywzpcpfnvcpii(), 0x55500DCA ^ n18)), (ItemStack)null, 902243137);
            }
            else {
                final int oomlyrufewuxlagd6 = oomlyrufewuxlagd(oomlyrufewuxlagd5, 1816230154);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(oomlyrufewuxlagd6) != 204626496) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(oomlyrufewuxlagd6)) {
                            case 603085873: {
                                continue;
                            }
                            case 204626496: {}
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void saveTradeChoice$1897065175(final Optional optional, final Optional<String> optional2, final ItemStack itemStack) {
        final ItemStack itemStack2 = (ItemStack)(0x914767A ^ (0x66F2CD69 ^ (0x37774D55 ^ (this.GpfyIGQz2I ^ itemStack))));
        optional.ifPresentOrElse(s -> this.billfordGuiConfig.set(ehnlorxodz(lzddgxccwahjdsr(), 0x28B8F1F9 ^ (0x8D1D9F6 ^ (0x4229D3CC ^ this.GpfyIGQz2I))), (Object)s), () -> this.billfordGuiConfig.set(ehnlorxodz(nsjrsefqwcndbyy(), 0x634701E3 ^ (0x2E9AD418 ^ (0x79EE34F6 ^ this.GpfyIGQz2I))), (Object)optional2));
    }
    
    private void saveTradeChoice(final ItemStack itemStack) {
        this.billfordGuiConfig.set(ehnlorxodz(zzchixicfzafbuz(), 0x10E0C044 ^ (0x1C4FD6FA ^ (0x70CE31B5 ^ this.GpfyIGQz2I))), (Object)itemStack);
    }
    
    @Override
    public boolean isInGUI$652632361(final Player player, final int n) {
        final int n2 = 0x576B9713 ^ (0x1C5C0885 ^ (0x5C0F2EAA ^ (this.GpfyIGQz2I ^ n)));
        return this.opened.containsKey((Object)player);
    }
    
    @Override
    public void remove$1734529989(final Player player, final int n) {
        final int n2 = 0x5EDD341 ^ (0x7DB04EC1 ^ (0x1ED68D92 ^ (this.GpfyIGQz2I ^ n)));
        this.opened.remove((Object)player);
    }
    
    @Override
    public void addToOpened$232106327(final Player player, final Object[] array, final int n) {
        final int n2 = 0x30DA14A8 ^ (0x2436E482 ^ (0x39987723 ^ (this.GpfyIGQz2I ^ n)));
        this.opened.put((Object)player, (Object)array);
    }
    
    static {
        (BillfordEditorGUI.nothing_to_see_here = new String[18])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BillfordEditorGUI.idtlsfkpfs = zxpnxoncbbedjns();
        BillfordEditorGUI.OZDKSqGQRu = (0xDBAF10C6 ^ new Random(-8359423772121303346L).nextInt());
    }
    
    public static String ehnlorxodz(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= BillfordEditorGUI.idtlsfkpfs[i % BillfordEditorGUI.idtlsfkpfs.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] zxpnxoncbbedjns() {
        return new byte[] { 52, 111, 38, 102, 100, 68, 15, 77, 81, 51, 106, 120, 90, 119, 78, 64, 70, 28, 51, 96, 107, 35, 38, 17, 96, 91, 88, 121, 34, 110, 2, 98, 71, 33, 63, 113, 47, 109, 28, 99, 19, 61, 23, 30, 71, 23, 90, 38, 16, 66, 35, 83, 47, 113, 100, 19, 12, 90, 57, 40, 76, 96, 112, 50, 13, 41, 103, 24, 28, 77, 29, 11, 79, 65, 61, 48, 87, 6, 103, 84, 89, 125, 50, 20, 30, 11, 43, 21, 116, 85, 8, 119, 48, 21, 35, 56 };
    }
    
    private static byte[] nsjrsefqwcndbyy() {
        return new byte[] { -5, -91, 30, 52, 92, 27, 61, 24, 102, 109, 91, 43, 98, 40, 118, 4, 116, 65, 4, 13, 90, 113, 30, 84, 88, 4, 106, 110, 21, 40, 51, 37, 127, 112, 7, 35, 29, 49, 43, 14, 34, 107, 47, 70, 127, 78, 104, 118, 39, 19, 18, 3 };
    }
    
    private static byte[] lzddgxccwahjdsr() {
        return new byte[] { -5, -93, 31, 52, 84, 26, 56, 24, 101, 110, 89, 39, 106, 40, 121, 5, 127, 76, 2, 12, 82, 116, 22, 83, 87, 11, 108, 102, 17, 35, 50, 32, 112, 119, 6, 33, 30, 59, 37, 12, 35, 105, 32, 79, 115, 73, 105, 118, 32, 17, 20, 1 };
    }
    
    private static byte[] aaqcnkhsenseelc() {
        return new byte[] { -8, -87, 17, 35, 83, 7, 57, 8, 104, 100, 83, 33, 108, 39, 121, 2, 113, 77, 1, 43, 92, 122, 17, 66, 86, 65, 97, 47, 27, 48, 52, 38, 112, 103, 8, 36, 29, 53, 43, 44, 36, 100, 33, 72, 126, 72, 99, 116 };
    }
    
    private static byte[] gnehcrifmrxfquf() {
        return new byte[] { -5, -93, 21, 60, 83, 25, 61, 24, 96, 111, 91, 45, 105, 32, 121, 6, 116, 65, 2, 15, 90, 119, 21, 92, 87, 6, 106, 110, 19, 60, 51, 56, 116, 117, 8, 41, 29, 50, 45, 60, 34, 124, 36, 66, 112, 70, 104, 123, 33, 27, 18, 20, 28, 38, 83, 85, 62, 60, 8, 127, 125, 38, 67, 99, 58, 51, 85, 85, 45, 20, 44, 76, 124, 21, 10, 97 };
    }
    
    private static byte[] prrpsgaqrrmptqq() {
        return new byte[] { -5, -92, 31, 48, 83, 25, 59, 31, 98, 90, 91, 37, 99, 52, 121, 28, 114, 71 };
    }
    
    private static byte[] ovuuaikotcpeysp() {
        return new byte[] { -14, -89, 20, 48, 92, 3, 59, 16, 103, 127, 93, 39, 111, 58, 123, 24, 114, 94, 11, 62, 89, 102, 30, 72, 84, 6, 110, 36, 21, 46, 55, 119, 114, 113, 11, 46, 23, 41, 46, 38, 43, 100, 35, 75, 113, 86, 109, 122, 37, 27, 22, 10, 27, 34 };
    }
    
    private static byte[] kcoaspnpdhqxmxj() {
        return new byte[] { -3, -87, 17, 61, 93, 18, 55, 26, 103, 98, 83, 38, 98, 41, 119, 13, 127, 88, 4, 60, 92, 68, 31, 65, 88, 22, 110, 43, 27, 52 };
    }
    
    private static byte[] jhdmtoaqkdiowqc() {
        return new byte[] { -4, -87, 23, 55, 84, 7, 63, 28, 100, 113, 83, 36, 104, 50, 127, 28, 126, 93, 5, 48, 90, 97, 22, 76, 80, 10, 109, 42, 27, 45 };
    }
    
    private static byte[] wyywzpcpfnvcpii() {
        return new byte[] { -7, -94, 19, 39, 81, 9, 56, 15, 98, 101, 88, 35, 104, 37, 119, 3, 118, 71, 0, 32, 94, 126, 19, 76 };
    }
    
    private static byte[] zzchixicfzafbuz() {
        return new byte[] { -7, -89, 19, 61, 82, 27, 56, 16, 101, 108, 93, 43, 99, 46, 120, 5, 119, 76, 0, 8, 94, 125, 16, 82, 87, 3, 108, 100, 21, 47, 59, 38, 113, 119, 14, 33, 28, 63, 41, 5, 37, 104, 32, 71, 115, 75, 109, 122, 41, 23, 21, 1 };
    }
    
    private static int oomlyrufewuxlagd(final int n, final int n2) {
        return n ^ n2;
    }
}
