package dev.daniboy.donutcore.gui;

import java.util.HashMap;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.event.Listener;

public abstract class AbstractGui implements Listener
{
    private DonutCore plugin;
    private static final long COOLDOWN_TIME = 80L;
    private static Map<Player, Long> cooldown;
    private static boolean alreadyRegistered;
    private static int mAQBQ1Bl0Q = 0;
    private transient int pFoQXZjfFn = 1358901432;
    private static String[] nothing_to_see_here;
    
    public AbstractGui(final DonutCore plugin, final int n) {
        final int n2 = 0x4FCF1668 ^ (0x43B9DF43 ^ (Integer.parseInt("508377695") ^ n));
        this.plugin = plugin;
        if (!AbstractGui.alreadyRegistered) {
            plugin.getServer().getPluginManager().registerEvents((Listener)new Listener(559738319) {
                private static int gk0SK4TZCJ = 0;
                private transient int M9leZ09Lfl = 779194110;
                private static byte[] xypdsgrhsz;
                private static String[] nothing_to_see_here;
                
                {
                Label_0079:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                            case 1343982098: {
                                continue;
                            }
                            case 237374735: {}
                            case 140946685: {
                                break Label_0079;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    final int n3 = 0xA052D70 ^ (0x6ADF926E ^ (Integer.parseInt("873583094") ^ n));
                    mautwkanmholxstu(n3, 967708275);
                }
                
                @EventHandler
                public void onQuit(final PlayerQuitEvent playerQuitEvent) {
                    final int n = 0x5E9C536F ^ (0x3C7080E5 ^ (0x7123BD87 ^ this.M9leZ09Lfl));
                    AbstractGui.cooldown.remove((Object)playerQuitEvent.getPlayer());
                }
                
                static {
                    (AbstractGui$1.nothing_to_see_here = new String[17])[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
                    AbstractGui$1.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
                    AbstractGui$1.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
                    AbstractGui$1.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
                    AbstractGui$1.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
                    AbstractGui$1.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
                    AbstractGui$1.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
                    AbstractGui$1.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
                    AbstractGui$1.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
                    AbstractGui$1.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
                    AbstractGui$1.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
                    AbstractGui$1.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
                    AbstractGui$1.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
                    AbstractGui$1.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
                    AbstractGui$1.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
                    AbstractGui$1.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
                    AbstractGui$1.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
                    AbstractGui$1.xypdsgrhsz = uzvhbeenofnitcz();
                    AbstractGui$1.gk0SK4TZCJ = (0x676F1D22 ^ new Random(6156919113051281710L).nextInt());
                }
                
                public static String dqixzmuqpk(final byte[] array, final int n) {
                    final byte[] bytes = Integer.toString(n).getBytes();
                    for (int i = 0; i < array.length; ++i) {
                        final int n2 = i;
                        array[n2] ^= bytes[i % bytes.length];
                        final int n3 = i;
                        array[n3] ^= AbstractGui$1.xypdsgrhsz[i % AbstractGui$1.xypdsgrhsz.length];
                    }
                    return new String(array, StandardCharsets.UTF_16);
                }
                
                private static byte[] uzvhbeenofnitcz() {
                    return new byte[] { 12, 117, 77, 87, 90, 6, 53 };
                }
                
                private static int mautwkanmholxstu(final int n, final int n2) {
                    return n ^ n2;
                }
            }, (Plugin)plugin);
            AbstractGui.alreadyRegistered = true;
        }
        plugin.getServer().getPluginManager().registerEvents((Listener)new Listener(2134997498) {
            private static int lesWFrMTkw = 0;
            private transient int 7BsJtnHcDH = 341326511;
            private static String[] nothing_to_see_here;
            
            {
            Label_0079:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                        case 1372121244: {
                            continue;
                        }
                        case 56976105: {}
                        case 1448908645: {
                            break Label_0079;
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
                final int n3 = 0x5758F2FD ^ (0x4CF54A6D ^ (Integer.parseInt("447466087") ^ n));
                iwizunndidujyoaw(n3, 784758801);
            }
            
            @EventHandler
            public void onInvClick(final InventoryClickEvent inventoryClickEvent) {
                final int n = 0x6D6FCB0F ^ (0x6CFF0ECD ^ (0x7B859E3E ^ this.7BsJtnHcDH));
                final Player player = (Player)inventoryClickEvent.getWhoClicked();
                final int n2 = 0x185B3DE0 ^ n;
                final Inventory clickedInventory = inventoryClickEvent.getClickedInventory();
                final int n3 = 0x56B1CF1F ^ n2;
                final ItemStack currentItem = inventoryClickEvent.getCurrentItem();
                final int n4 = 0x5BBA21D8 ^ n3;
                final ClickType click = inventoryClickEvent.getClick();
                final int n5 = 0x4452A865 ^ n4;
                final int slot = inventoryClickEvent.getSlot();
                final int n6 = 0x15988C39 ^ n5;
                final ItemStack cursor = inventoryClickEvent.getCursor();
                final int n7 = 0xF68CC5E ^ n6;
                if ((AbstractGui.this.isInGUI$652632361(player, 901967400) ? 1 : 0) == (0x36AB7BD3 ^ n7)) {
                    return;
                }
                final int n8 = 0x54CF716F ^ n7;
                Label_0931: {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 245479080) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                case 482053356: {
                                    continue;
                                }
                                case 245479080: {}
                                default: {
                                    break Label_0931;
                                }
                            }
                        }
                    }
                    else {
                        int iwizunndidujyoaw = iwizunndidujyoaw(n8, 486778448);
                        int iwizunndidujyoaw2;
                        if ((inventoryClickEvent.getClick().isKeyboardClick() ? 1 : 0) != (0x7F67ACEC ^ iwizunndidujyoaw)) {
                            final int n9 = 0x7E52E47F ^ iwizunndidujyoaw;
                            if (((clickedInventory instanceof PlayerInventory) ? 1 : 0) == (0x1354893 ^ n9)) {
                                inventoryClickEvent.setCancelled((boolean)((byte)(0x3110D36D ^ (0x30259BFF ^ n9)) != 0));
                                player.updateInventory();
                                return;
                            }
                            final int n10 = 0x60EF4251 ^ n9;
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10) != 227939597) {
                                iwizunndidujyoaw(n10, 126720113);
                                throw new RuntimeException();
                            }
                            iwizunndidujyoaw2 = (0x33673237 ^ n10);
                        }
                        else {
                            Label_0379: {
                            Label_0372:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(iwizunndidujyoaw)) {
                                        case 971934734: {
                                            continue;
                                        }
                                        case 114860142: {
                                            break Label_0372;
                                        }
                                        case 1396086751: {
                                            break Label_0379;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                iwizunndidujyoaw ^= 0x36973440;
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(iwizunndidujyoaw) != 256011837) {
                                throw new RuntimeException();
                            }
                            iwizunndidujyoaw2 = iwizunndidujyoaw(iwizunndidujyoaw, 458072153);
                        }
                        if (((clickedInventory instanceof PlayerInventory) ? 1 : 0) != (0x52BD38F5 ^ iwizunndidujyoaw2)) {
                            final int n11 = 0x4389B595 ^ iwizunndidujyoaw2;
                            if ((inventoryClickEvent.getClick().isShiftClick() ? 1 : 0) != (0x11348D60 ^ n11)) {
                                inventoryClickEvent.setCancelled((boolean)((byte)(0x1C92ADA ^ (0x10FDA7BB ^ n11)) != 0));
                                player.updateInventory();
                            }
                            else {
                                final int n12 = 0x17FA4507 ^ n11;
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n12) != 107076910) {
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n12)) {
                                            case 255401743: {
                                                continue;
                                            }
                                            case 107076910: {}
                                            default: {
                                                throw new RuntimeException();
                                            }
                                        }
                                    }
                                }
                                else {
                                    iwizunndidujyoaw(n12, 1014114945);
                                }
                            }
                            return;
                        }
                        Label_0691: {
                        Label_0684:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(iwizunndidujyoaw2)) {
                                    case 472925840: {
                                        continue;
                                    }
                                    case 5164263: {
                                        break Label_0684;
                                    }
                                    case 1237740698: {
                                        break Label_0691;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            iwizunndidujyoaw2 ^= 0x1A7CCE96;
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(iwizunndidujyoaw2) == 217548190) {
                            inventoryClickEvent.setCancelled((boolean)((byte)(0x4423C04F ^ (0xCE2362D ^ iwizunndidujyoaw2)) != 0));
                            player.updateInventory();
                            AbstractGui.resetCooldown$164070003(player, 893517380);
                            AbstractGui.this.click$2048279449(new WrappedClickEvent(player, clickedInventory, currentItem, click, slot, cursor, 2028190499), 1729596340);
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
            
            static {
                (AbstractGui$2.nothing_to_see_here = new String[15])[0] = " \u2801\u287c\u280b\u2800\u28c6\u2800\u2800\u28f0\u28ff\u28eb\u28fe\u28bf\u28ff\u28ff\u280d\u28a0\u2820\u2800\u2800\u2880\u2830\u28be\u28fa\u28fb\u28ff\u28ff\u28ff\u28f7\u2840\u2800";
                AbstractGui$2.nothing_to_see_here[1] = "\u28e5\u2800\u2800\u2800\u2801\u2800\u2820\u28bb\u28ac\u2801\u28e0\u28fe\u281b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2810\u2831\u280f\u2849\u2819\u28ff\u28ff\u2847\u2800";
                AbstractGui$2.nothing_to_see_here[2] = "\u28b3\u2800\u28b0\u2856\u2800\u2800\u2808\u2800\u28fa\u28b0\u28ff\u28bb\u28fe\u28f6\u28ff\u28ff\u28f6\u28f6\u28e4\u28e4\u28f4\u28fe\u28ff\u28f7\u28fc\u2846\u28b8\u28ff\u28e7\u2800";
                AbstractGui$2.nothing_to_see_here[3] = "\u2808\u2800\u281c\u2808\u28c0\u28d4\u28e6\u28a8\u28ff\u28ff\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c5\u28fc\u281b\u28b9\u2800";
                AbstractGui$2.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u288b\u287f\u287f\u28ef\u28ed\u285f\u28df\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2858\u2800";
                AbstractGui$2.nothing_to_see_here[5] = "\u2840\u2810\u2800\u2800\u2800\u28ff\u28ef\u287f\u28ff\u28ff\u28ff\u28ef\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28c9\u28bd\u28ff\u2846\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[6] = "\u28b3\u2800\u2804\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2819\u2809\u2809\u2809\u281b\u28fb\u289b\u28ff\u281b\u2803\u2800\u2810\u281b\u283b\u28ff\u2847\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[7] = "\u28fe\u2804\u2800\u2800\u28b8\u28ff\u28ff\u287f\u281f\u281b\u2801\u2880\u2800\u2880\u2844\u28c0\u28e0\u28fe\u28ff\u28ff\u2860\u28f4\u28ce\u28c0\u28e0\u28e0\u28ff\u2847\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[8] = "\u28e7\u2800\u28f4\u28c4\u28fd\u28ff\u28ff\u28ff\u28f6\u28f6\u28d6\u28f6\u28ec\u28fe\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[9] = "\u28ff\u28f6\u28c8\u286f\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28f9\u28a7\u28ff\u28ff\u28ff\u28c4\u2819\u28bf\u28ff\u28ff\u28ff\u2807\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[10] = "\u2839\u28ff\u28ff\u28e7\u288c\u28bd\u28fb\u28bf\u28ef\u28ff\u28ff\u28ff\u28ff\u281f\u28e0\u2858\u283f\u281f\u281b\u281b\u281f\u281b\u28e7\u2848\u283b\u28fe\u28ff\u2800\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[11] = "\u2800\u2808\u2809\u28f7\u287f\u28fd\u2836\u287e\u28bf\u28ff\u28ff\u28ff\u2883\u28e4\u28ff\u28f7\u28e4\u28e4\u28c4\u28c4\u28e0\u28fc\u287f\u28b7\u2880\u28ff\u284f\u2800\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[12] = "\u2800\u2800\u2880\u28ff\u28f7\u280c\u28c8\u28cf\u28dd\u283d\u287f\u28f7\u28fe\u28cf\u28c0\u28c9\u28c9\u28c0\u28c0\u28c0\u28e0\u28e0\u28c4\u2878\u28fe\u28ff\u2803\u2800\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[13] = "\u2800\u28f0\u287f\u28ff\u28e7\u2850\u2804\u2831\u28ff\u28fa\u28fd\u289f\u28ff\u28ff\u28bf\u28ff\u28cd\u2809\u2880\u28c0\u28d0\u28fc\u28ef\u2857\u281f\u284f\u2800\u2800\u2800\u2800";
                AbstractGui$2.nothing_to_see_here[14] = "\u28f0\u28ff\u2800\u28ff\u28ff\u28f4\u2840\u2802\u2818\u28b9\u28ed\u2842\u285a\u283f\u28bf\u28ff\u28ff\u28ff\u287f\u28bf\u28bf\u287f\u283f\u2881\u28f4\u28ff\u28f7\u28f6\u28e6\u28e4";
                AbstractGui$2.lesWFrMTkw = (0xEF7D1F69 ^ new Random(6075255617052050649L).nextInt());
            }
            
            public static String zvjpwsdqzq(final byte[] array, final byte[] array2, final int n) {
                final byte[] bytes = Integer.toString(n).getBytes();
                for (int i = 0; i < array.length; ++i) {
                    final int n2 = i;
                    array[n2] ^= bytes[i % bytes.length];
                    final int n3 = i;
                    array[n3] ^= array2[i % array2.length];
                }
                return new String(array, StandardCharsets.UTF_16);
            }
            
            private static byte[] wkgrlkeklsmtfdk() {
                return new byte[] { 25, 15, 74, 42, 48, 77, 70, 71, 119, 18, 76, 32, 61, 59, 112, 77, 77, 119, 114, 109, 71, 105, 114, 7, 22, 29, 77, 114, 48, 68, 20, 74, 15, 34, 89, 125, 124, 32, 120, 56, 36, 14, 53, 34, 81, 77, 8, 37, 117, 3, 115 };
            }
            
            private static int iwizunndidujyoaw(final int n, final int n2) {
                return n ^ n2;
            }
        }, (Plugin)plugin);
    }
    
    public static boolean resetCooldown$164070003(final Player player, final int n) {
        int n2 = 0x5F1A4A4E ^ (0xDE7DF3D ^ (0x43EBF05A ^ (AbstractGui.mAQBQ1Bl0Q ^ n)));
        if ((AbstractGui.cooldown.containsKey((Object)player) ? 1 : 0) == (0x490D0F70 ^ n2)) {
            final int n3 = 0x43DFEC51 ^ n2;
            AbstractGui.cooldown.put((Object)player, (Object)(System.currentTimeMillis() + 80L));
            return (byte)(0x49318961 ^ (0x43E36A41 ^ n3)) != 0;
        }
        Label_0171: {
        Label_0164:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                    case 1611555944: {
                        continue;
                    }
                    case 227083492: {
                        break Label_0164;
                    }
                    case 1887825700: {
                        break Label_0171;
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
            }
            n2 ^= 0x6F17773;
        }
        Label_0499: {
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2) != 184117113) {
                nnpqjysqusysoxda(n2, 462393974);
            }
            else {
                final int n4 = 0x67488A05 ^ n2;
                final long currentTimeMillis = System.currentTimeMillis();
                final int n5 = 0x204AF046 ^ n4;
                final long longValue = (long)AbstractGui.cooldown.get((Object)player);
                int n6 = 0x4DE8EE24 ^ n5;
                if (lcmp(currentTimeMillis, longValue) > (0x4516EC64 ^ n6)) {
                    final int n7 = 0x3DD59DA3 ^ n6;
                    AbstractGui.cooldown.put((Object)player, (Object)(System.currentTimeMillis() + 80L));
                    return (byte)(0x45CE16D6 ^ (0x3D0D6710 ^ n7)) != 0;
                }
                Label_0399: {
                Label_0392:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 1095635375: {
                                continue;
                            }
                            case 98316055: {
                                break Label_0392;
                            }
                            case 1268676225: {
                                break Label_0399;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    n6 ^= 0x6FC51EDC;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) == 49974423) {
                    return (byte)(0x7579562 ^ nnpqjysqusysoxda(n6, 763652058)) != 0;
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                        case 137164439: {
                            continue;
                        }
                        case 49974423: {}
                        default: {
                            break Label_0499;
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }
    
    public abstract void click$2048279449(final WrappedClickEvent p0, final int p1);
    
    public DonutCore plugin() {
        final int n = 0x38F3E943 ^ (0x38CD5BEA ^ (0x1E440AC ^ this.pFoQXZjfFn));
        return this.plugin;
    }
    
    public abstract boolean isInGUI$652632361(final Player p0, final int p1);
    
    public abstract void remove$1734529989(final Player p0, final int p1);
    
    public void open$967512435(final Player player, final Object[] array, final int n) {
        final int n2 = 0x57805664 ^ (0x28FE18E4 ^ (0x1006A260 ^ (this.pFoQXZjfFn ^ n)));
        final Inventory generateInventory$919822562 = this.generateInventory$919822562(player, array, 1501979845);
        final int n3 = 0x360AAEDA ^ n2;
        if (generateInventory$919822562 == null) {
            return;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(nnpqjysqusysoxda(n3, 717277932)) != 164212032) {
            throw new IllegalAccessException();
        }
        player.openInventory(generateInventory$919822562);
        this.addToOpened$232106327(player, array, 1698934540);
    }
    
    public DonutCore getPlugin() {
        final int n = 0x4A9828C3 ^ (0x4E9F5871 ^ (0x4D7EE45A ^ this.pFoQXZjfFn));
        return this.plugin;
    }
    
    public abstract void addToOpened$232106327(final Player p0, final Object[] p1, final int p2);
    
    public abstract Inventory generateInventory$919822562(final Player p0, final Object[] p1, final int p2);
    
    static {
        (AbstractGui.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        AbstractGui.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        AbstractGui.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        AbstractGui.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        final int n = 0x364E245F ^ (0x3D2F5B44 ^ Integer.parseInt("508377695"));
        AbstractGui.mAQBQ1Bl0Q = (0x59969161 ^ new Random(-7024061260094216563L).nextInt());
        final int n2 = 0x1B74D28B ^ n;
        AbstractGui.cooldown = (Map<Player, Long>)new HashMap();
        AbstractGui.alreadyRegistered = ((byte)(0x39B57DC1 ^ (0x37EDEA0E ^ n2)) != 0);
    }
    
    public static String gzrkyvwnni(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] jzgysaumokpiyvw() {
        return new byte[] { 29, 10, 125, 120, 10, 68, 112, 50, 82, 33, 89, 36, 26, 48, 48, 108, 47, 38, 21, 123, 79, 81, 123, 44, 18, 122, 69, 84, 97, 3, 41, 77, 99, 87, 40, 58, 109, 87, 90, 2, 49, 117, 80, 122, 40, 53, 119, 83, 34, 115, 20, 45 };
    }
    
    private static int nnpqjysqusysoxda(final int n, final int n2) {
        return n ^ n2;
    }
}
