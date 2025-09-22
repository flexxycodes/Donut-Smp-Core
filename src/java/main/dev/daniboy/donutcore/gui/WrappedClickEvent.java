package dev.daniboy.donutcore.gui;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.entity.Player;

public class WrappedClickEvent
{
    private Player player;
    private Inventory inventory;
    private ItemStack itemStack;
    private ClickType clickType;
    private int slot;
    private final ItemStack cursor;
    private boolean isCancelled;
    private static int y0rL9ruX4F = 0;
    private transient int lsH0cdfcDs = 2122013165;
    private static String[] nothing_to_see_here;
    
    public WrappedClickEvent(final Player player, final Inventory inventory, final ItemStack itemStack, final ClickType clickType, final int slot, final ItemStack cursor, final int n) {
        final int n2 = 0x480F7889 ^ 0x6AEC150D;
    Label_0071:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 1025868016: {
                    continue;
                }
                case 60327628: {}
                case 1695172820: {
                    break Label_0071;
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
        final int n3 = 0xCD10EC4 ^ (0x3BE19A03 ^ (Integer.parseInt("1753297985") ^ n));
        final int n4 = 0x552037EA ^ oogwbkkkuxalsifx(n3, 1491106649);
        this.isCancelled = false;
        this.player = player;
        this.inventory = inventory;
        this.itemStack = itemStack;
        this.clickType = clickType;
        this.slot = slot;
        this.cursor = cursor;
    }
    
    public Player getPlayer$624284539(final int n) {
        final int n2 = 0x7A747007 ^ (0x47DCE41 ^ (0x13C50EC3 ^ (this.lsH0cdfcDs ^ n)));
        return this.player;
    }
    
    public Inventory getInventory$1458066743(final int n) {
        final int n2 = 0x2EDBBA91 ^ (0x4BF4E40D ^ (0x500823B1 ^ (this.lsH0cdfcDs ^ n)));
        return this.inventory;
    }
    
    public ItemStack getItemStack$386585608(final int n) {
        final int n2 = 0x29B70706 ^ (0x264B5886 ^ (0x25D4D8B0 ^ (this.lsH0cdfcDs ^ n)));
        return this.itemStack;
    }
    
    public ClickType getClickType() {
        final int n = 0x78F53C5E ^ (0x40C56690 ^ (0x1410D26A ^ this.lsH0cdfcDs));
        return this.clickType;
    }
    
    public int getSlot$2125716982(final int n) {
        final int n2 = 0x212E350D ^ (0x414E60BE ^ (0x23CFFCAA ^ (this.lsH0cdfcDs ^ n)));
        return this.slot;
    }
    
    public ItemStack getCursor$1334603673(final int n) {
        final int n2 = 0x2F93B90 ^ (0x2EE68AFA ^ (0x5CAD7571 ^ (this.lsH0cdfcDs ^ n)));
        return this.cursor;
    }
    
    public boolean isRightClick$1018531030(final int n) {
        final int n2 = 0x3A09C872 ^ (0x59C3B40D ^ (0x3FCA7AEA ^ (this.lsH0cdfcDs ^ n)));
        int n3 = 0;
        Label_0224: {
            int n4;
            if (this.clickType != ClickType.RIGHT) {
                n3 = (0x5DC1AEF3 ^ n2);
                if (this.clickType != ClickType.SHIFT_RIGHT) {
                    break Label_0224;
                }
                n4 = (0x41184028 ^ n3);
            }
            else {
                final int n5 = 0x5779947D ^ n2;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 191882370) {
                    oogwbkkkuxalsifx(n5, 765626895);
                    throw new IllegalAccessException();
                }
                n4 = (0x4BA07AA6 ^ n5);
            }
            final byte b = (byte)(0x7CD3FC8D ^ n4);
            final int oogwbkkkuxalsifx = oogwbkkkuxalsifx(n4, 11029115);
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(oogwbkkkuxalsifx) != 19910149) {
                    throw null;
                }
                throw new IOException();
            }
            catch (final IOException ex) {
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(oogwbkkkuxalsifx)) {
                    default: {
                        throw new IllegalAccessException("Error in hash");
                    }
                    case -162114271: {
                        oogwbkkkuxalsifx(oogwbkkkuxalsifx, 494947722);
                        break;
                    }
                    case -472008773: {
                        break;
                    }
                }
                return b != 0;
            }
        }
        final int n6 = 0x26DE7950 ^ n3;
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) == 75117725) {
            final byte b = (byte)(0xD227921 ^ (0x1637BCD5 ^ n6));
            return b != 0;
        }
        throw new IllegalAccessException();
    }
    
    static {
        (WrappedClickEvent.nothing_to_see_here = new String[19])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28e4\u28e4\u28e4\u28e4\u28e4\u28f6\u28e6\u28e4\u28c4\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f4\u28ff\u287f\u281b\u2809\u2819\u281b\u281b\u281b\u281b\u283b\u28bf\u28ff\u28f7\u28e4\u2840\u2800\u2800\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28fc\u28ff\u280b\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28c0\u28c0\u2808\u28bb\u28ff\u28ff\u2844\u2800\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28f8\u28ff\u284f\u2800\u2800\u2800\u28e0\u28f6\u28fe\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28bf\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2801\u2800\u2800\u28b0\u28ff\u28ff\u28ef\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u2819\u28bf\u28f7\u2844\u2800";
        WrappedClickEvent.nothing_to_see_here[5] = "\u2800\u2800\u28c0\u28e4\u28f4\u28f6\u28f6\u28ff\u285f\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28f7\u2800";
        WrappedClickEvent.nothing_to_see_here[6] = "\u2800\u28b0\u28ff\u285f\u280b\u2809\u28f9\u28ff\u2847\u2800\u2800\u2800\u2818\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28e4\u28e4\u28e4\u28f6\u28f6\u28f6\u28f6\u28ff\u28ff\u28ff\u2800";
        WrappedClickEvent.nothing_to_see_here[7] = "\u2800\u28b8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2800";
        WrappedClickEvent.nothing_to_see_here[8] = "\u2800\u28f8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2809\u283b\u283f\u28ff\u28ff\u28ff\u28ff\u287f\u283f\u283f\u281b\u28bb\u28ff\u2847\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[9] = "\u2800\u28ff\u28ff\u2801\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28e7\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[10] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[11] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[12] = "\u2800\u28bf\u28ff\u2846\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[13] = "\u2800\u2838\u28ff\u28e7\u2840\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2803\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[14] = "\u2800\u2800\u281b\u28bf\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u28f0\u28ff\u28ff\u28f7\u28f6\u28f6\u28f6\u28f6\u2836\u2800\u28a0\u28ff\u28ff\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28fd\u28ff\u284f\u2801\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28b9\u28ff\u2846\u2800\u2800\u2800\u28f8\u28ff\u2807\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28e6\u28c4\u28c0\u28e0\u28f4\u28ff\u28ff\u2801\u2800\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u287f\u280f\u2800\u2800\u2800\u2800";
        WrappedClickEvent.nothing_to_see_here[18] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u281b\u283b\u283f\u283f\u283f\u283f\u280b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        WrappedClickEvent.y0rL9ruX4F = (0x40D3F9EA ^ new Random(336072192552698876L).nextInt());
    }
    
    public static String cniatvffil(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] yccdohgqfivnqop() {
        return new byte[] { 11, 87, 108, 110, 69, 56, 9, 50, 80, 106, 31, 47, 54, 54, 62, 94, 108, 103, 87, 47, 121, 54, 83, 118, 33, 92, 98, 67, 122, 114, 34, 107, 23, 114 };
    }
    
    private static int oogwbkkkuxalsifx(final int n, final int n2) {
        return n ^ n2;
    }
}
