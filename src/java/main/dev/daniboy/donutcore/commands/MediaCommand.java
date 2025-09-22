package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.config.MessagesConfig;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class MediaCommand extends Command
{
    private final DonutCore plugin;
    private static int nRdiFPm2Dg = 0;
    private transient int G8XrM5llzT = 830489049;
    private static byte[] rlemyjqxpe;
    private static String[] nothing_to_see_here;
    
    public MediaCommand(final DonutCore plugin, final int n) {
        super("media");
        final int n2 = 0x2EBD3D27 ^ (0x34450A7D ^ (Integer.parseInt("1404340641") ^ n));
        final int n3 = 0x45EF7FAB ^ xhehbeympemgjion(n2, 486094212);
        this.plugin = plugin;
        this.setDescription("Open the Media GUI");
        this.setUsage("/media");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        int n = 0x1102FD75 ^ (0x11AACEA3 ^ (0x1C59D4AC ^ this.G8XrM5llzT));
        Label_0650: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x69415924 ^ n)) {
                final int n2 = 0x5C3F149A ^ n;
                final Player player = (Player)commandSender;
                int n3 = 0x7F4CD396 ^ n2;
                Label_0287: {
                Label_0280:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 139112413: {
                                continue;
                            }
                            case 264394847: {
                                break Label_0280;
                            }
                            case 2094276488: {
                                break Label_0287;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n3 ^= 0x5F25CC20;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 148716536) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    }
                    catch (final IllegalAccessException ex) {
                        int xhehbeympemgjion = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                            case -1464168384: {
                                xhehbeympemgjion = xhehbeympemgjion(n3, 549467149);
                                break;
                            }
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case -288556751: {
                                xhehbeympemgjion = (0x80EF923 ^ n3);
                                break;
                            }
                        }
                    Label_0423:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xhehbeympemgjion)) {
                                case 1319367626: {
                                    continue;
                                }
                                case 139550846: {
                                    xhehbeympemgjion ^= 0x51C5B491;
                                }
                                case 1741243009: {
                                    break Label_0423;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        if ((player.hasPermission(svekrmdcol(qgqkyrvdxmtejag(), xhehbeympemgjion)) ? 1 : 0) == (0x6412D294 ^ xhehbeympemgjion)) {
                            final int n4 = 0x47A96447 ^ xhehbeympemgjion;
                            MessagesConfig.NOPERMISSION.send((CommandSender)player);
                            return (byte)(0x68F0E049 ^ (0x4B4B569B ^ n4)) != 0;
                        }
                        final int xhehbeympemgjion2 = xhehbeympemgjion(xhehbeympemgjion, 83746658);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xhehbeympemgjion2) == 198134755) {
                            final int xhehbeympemgjion3 = xhehbeympemgjion(xhehbeympemgjion2, 589727146);
                            this.plugin.getMediaGui$275199606(1384060441).open$967512435(player, new Object[(byte)(0x43C9885C ^ xhehbeympemgjion3)], 1892453237);
                            return (byte)(0x192F6EC7 ^ (0x5AE6E69A ^ xhehbeympemgjion3)) != 0;
                        }
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xhehbeympemgjion2)) {
                                case 1753884311: {
                                    continue;
                                }
                                case 198134755: {}
                                default: {
                                    break Label_0650;
                                }
                            }
                        }
                    }
                }
            }
            else {
                Label_0123: {
                Label_0116:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                            case 486628782: {
                                continue;
                            }
                            case 200209908: {
                                break Label_0116;
                            }
                            case 2072431701: {
                                break Label_0123;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n ^= 0x75C3E7D0;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) == 121458042) {
                    final int xhehbeympemgjion4 = xhehbeympemgjion(n, 113020477);
                    MessagesConfig.ONLYPLAYERS.send(commandSender);
                    return (byte)(0x6B6D379B ^ (0x71530753 ^ xhehbeympemgjion4)) != 0;
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                        case 1807603546: {
                            continue;
                        }
                        case 121458042: {}
                        default: {
                            break Label_0650;
                        }
                    }
                }
            }
        }
        throw new IOException();
    }
    
    static {
        (MediaCommand.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        MediaCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
        MediaCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
        MediaCommand.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        MediaCommand.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
        MediaCommand.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        MediaCommand.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
        MediaCommand.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
        MediaCommand.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        MediaCommand.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
        MediaCommand.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
        MediaCommand.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
        MediaCommand.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
        MediaCommand.rlemyjqxpe = dxetlshcqgegifc();
        MediaCommand.nRdiFPm2Dg = (0x4BA211F4 ^ new Random(-7153320106692676110L).nextInt());
    }
    
    public static String svekrmdcol(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= MediaCommand.rlemyjqxpe[i % MediaCommand.rlemyjqxpe.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] dxetlshcqgegifc() {
        return new byte[] { 43, 114, 5 };
    }
    
    private static byte[] qgqkyrvdxmtejag() {
        return new byte[] { -28, -69, 50, 119, 75, 95, 30, 45, 48, 104, 67, 71, 28, 41, 60, 113, 71, 70, 30, 33, 52, 51, 69, 80, 18, 34, 48, 126, 71, 90, 26, 37 };
    }
    
    private static int xhehbeympemgjion(final int n, final int n2) {
        return n2 ^ n;
    }
}
