package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.manager.TeleportManager;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class AfkCommand extends Command
{
    private final DonutCore plugin;
    private final SQLiteManager sqLiteManager;
    private final TeleportManager teleportManager;
    private static int Xi600Rqq5w = 0;
    private transient int CYwzStdIfC = 1777976989;
    private static String[] nothing_to_see_here;
    
    public AfkCommand(final DonutCore plugin, final SQLiteManager sqLiteManager, final TeleportManager teleportManager, final int n) {
        super("afk");
        int n2 = 0x5FC23DEB ^ (0x3560B040 ^ (Integer.parseInt("1068484638") ^ n));
    Label_0118:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 801484882: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 1595755470: {
                    break Label_0118;
                }
                case 153655288: {
                    n2 ^= 0x3FB9B725;
                    break Label_0118;
                }
            }
        }
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
        this.teleportManager = teleportManager;
        this.setDescription("Open the AFK GUI");
        this.setPermission("donutcore.afk");
        this.setUsage("/afk");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        int n = 0xA71DEC5 ^ (0x7A93AF5 ^ (0xF61113F ^ this.CYwzStdIfC));
        if (((commandSender instanceof Player) ? 1 : 0) != (0x64318EC2 ^ n)) {
            final int n2 = 0x2FE90CF1 ^ n;
            final Player player = (Player)commandSender;
            final int syexomzmgognwfze = syexomzmgognwfze(0x4DF5035B ^ n2, 234774867);
            int n5 = 0;
            Label_0515: {
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(syexomzmgognwfze) != 116033953) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    int syexomzmgognwfze2 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(syexomzmgognwfze)) {
                        case 38385529: {
                            syexomzmgognwfze2 = syexomzmgognwfze(syexomzmgognwfze, 1577624758);
                            break;
                        }
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case 1587479000: {
                            syexomzmgognwfze2 = (0x75927262 ^ syexomzmgognwfze);
                            break;
                        }
                    }
                    final int syexomzmgognwfze3 = syexomzmgognwfze(syexomzmgognwfze2, 2008760231);
                    if ((player.hasPermission(dgapekqzqz(qmjosuunvhmekwi(), hfqjgyanxjfsmcz(), syexomzmgognwfze3)) ? 1 : 0) == (0x9FAADFE ^ syexomzmgognwfze3)) {
                        final int n3 = 0x79ED2490 ^ syexomzmgognwfze3;
                        MessagesConfig.NOPERMISSION.send((CommandSender)player);
                        final int n4 = 0x62A77557 ^ n3;
                        SoundConfig.NOPERMISSION.play(player);
                        return (byte)(0x60302182 ^ (0x7280DDBA ^ n4)) != 0;
                    }
                    n5 = (0x12AB3977 ^ syexomzmgognwfze3);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) == 82711704) {
                        break Label_0515;
                    }
                Label_0500:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                            case 1912284341: {
                                continue;
                            }
                            case 82711704: {
                                break Label_0500;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
                throw new IllegalAccessException();
            }
            final int n6 = 0x5AFE335C ^ n5;
            this.plugin.getAfkGui$1831569283(259577790).open$967512435(player, new Object[(byte)(0x41AFA7D5 ^ n6)], 1892453237);
            final int n7 = 0x6042BA92 ^ n6;
            SoundConfig.OPENINVENTORY.play(player);
            return (byte)(0x67DD1B74 ^ (0x46300632 ^ n7)) != 0;
        }
        Label_0123: {
        Label_0116:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                    case 1012632521: {
                        continue;
                    }
                    case 35676326: {
                        break Label_0116;
                    }
                    case 845379790: {
                        break Label_0123;
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
            }
            n ^= 0x10385F0A;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) == 13857402) {
            Label_0191: {
            Label_0184:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                        case 2085622481: {
                            continue;
                        }
                        case 13857402: {
                            break Label_0184;
                        }
                        case 1026302168: {
                            break Label_0191;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
                n ^= 0x34CC43AD;
            }
            MessagesConfig.ONLYPLAYERS.send(commandSender);
            return (byte)(0x77368442 ^ (0x37F31626 ^ n)) != 0;
        }
        syexomzmgognwfze(n, 1685674906);
        throw new IllegalAccessException();
    }
    
    static {
        (AfkCommand.nothing_to_see_here = new String[15])[0] = " \u2801\u287c\u280b\u2800\u28c6\u2800\u2800\u28f0\u28ff\u28eb\u28fe\u28bf\u28ff\u28ff\u280d\u28a0\u2820\u2800\u2800\u2880\u2830\u28be\u28fa\u28fb\u28ff\u28ff\u28ff\u28f7\u2840\u2800";
        AfkCommand.nothing_to_see_here[1] = "\u28e5\u2800\u2800\u2800\u2801\u2800\u2820\u28bb\u28ac\u2801\u28e0\u28fe\u281b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2810\u2831\u280f\u2849\u2819\u28ff\u28ff\u2847\u2800";
        AfkCommand.nothing_to_see_here[2] = "\u28b3\u2800\u28b0\u2856\u2800\u2800\u2808\u2800\u28fa\u28b0\u28ff\u28bb\u28fe\u28f6\u28ff\u28ff\u28f6\u28f6\u28e4\u28e4\u28f4\u28fe\u28ff\u28f7\u28fc\u2846\u28b8\u28ff\u28e7\u2800";
        AfkCommand.nothing_to_see_here[3] = "\u2808\u2800\u281c\u2808\u28c0\u28d4\u28e6\u28a8\u28ff\u28ff\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c5\u28fc\u281b\u28b9\u2800";
        AfkCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u288b\u287f\u287f\u28ef\u28ed\u285f\u28df\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2858\u2800";
        AfkCommand.nothing_to_see_here[5] = "\u2840\u2810\u2800\u2800\u2800\u28ff\u28ef\u287f\u28ff\u28ff\u28ff\u28ef\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28c9\u28bd\u28ff\u2846\u2800\u2800";
        AfkCommand.nothing_to_see_here[6] = "\u28b3\u2800\u2804\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2819\u2809\u2809\u2809\u281b\u28fb\u289b\u28ff\u281b\u2803\u2800\u2810\u281b\u283b\u28ff\u2847\u2800\u2800";
        AfkCommand.nothing_to_see_here[7] = "\u28fe\u2804\u2800\u2800\u28b8\u28ff\u28ff\u287f\u281f\u281b\u2801\u2880\u2800\u2880\u2844\u28c0\u28e0\u28fe\u28ff\u28ff\u2860\u28f4\u28ce\u28c0\u28e0\u28e0\u28ff\u2847\u2800\u2800";
        AfkCommand.nothing_to_see_here[8] = "\u28e7\u2800\u28f4\u28c4\u28fd\u28ff\u28ff\u28ff\u28f6\u28f6\u28d6\u28f6\u28ec\u28fe\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800";
        AfkCommand.nothing_to_see_here[9] = "\u28ff\u28f6\u28c8\u286f\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28f9\u28a7\u28ff\u28ff\u28ff\u28c4\u2819\u28bf\u28ff\u28ff\u28ff\u2807\u2800\u2800";
        AfkCommand.nothing_to_see_here[10] = "\u2839\u28ff\u28ff\u28e7\u288c\u28bd\u28fb\u28bf\u28ef\u28ff\u28ff\u28ff\u28ff\u281f\u28e0\u2858\u283f\u281f\u281b\u281b\u281f\u281b\u28e7\u2848\u283b\u28fe\u28ff\u2800\u2800\u2800";
        AfkCommand.nothing_to_see_here[11] = "\u2800\u2808\u2809\u28f7\u287f\u28fd\u2836\u287e\u28bf\u28ff\u28ff\u28ff\u2883\u28e4\u28ff\u28f7\u28e4\u28e4\u28c4\u28c4\u28e0\u28fc\u287f\u28b7\u2880\u28ff\u284f\u2800\u2800\u2800";
        AfkCommand.nothing_to_see_here[12] = "\u2800\u2800\u2880\u28ff\u28f7\u280c\u28c8\u28cf\u28dd\u283d\u287f\u28f7\u28fe\u28cf\u28c0\u28c9\u28c9\u28c0\u28c0\u28c0\u28e0\u28e0\u28c4\u2878\u28fe\u28ff\u2803\u2800\u2800\u2800";
        AfkCommand.nothing_to_see_here[13] = "\u2800\u28f0\u287f\u28ff\u28e7\u2850\u2804\u2831\u28ff\u28fa\u28fd\u289f\u28ff\u28ff\u28bf\u28ff\u28cd\u2809\u2880\u28c0\u28d0\u28fc\u28ef\u2857\u281f\u284f\u2800\u2800\u2800\u2800";
        AfkCommand.nothing_to_see_here[14] = "\u28f0\u28ff\u2800\u28ff\u28ff\u28f4\u2840\u2802\u2818\u28b9\u28ed\u2842\u285a\u283f\u28bf\u28ff\u28ff\u28ff\u287f\u28bf\u28bf\u287f\u283f\u2881\u28f4\u28ff\u28f7\u28f6\u28e6\u28e4";
        AfkCommand.Xi600Rqq5w = (0x1F050181 ^ new Random(1620924212545175114L).nextInt());
    }
    
    public static String dgapekqzqz(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] hfqjgyanxjfsmcz() {
        return new byte[] { 120, 59, 123, 108, 17, 4, 23, 112, 54, 41, 96, 116, 3, 86, 64, 70, 82, 57, 74, 33 };
    }
    
    private static byte[] qmjosuunvhmekwi() {
        return new byte[] { -73, -14, 76, 60, 35, 88, 35, 38, 0, 109, 86, 55, 55, 7, 115, 29, 106, 125, 123, 114, 79, 33, 73, 62, 37, 90, 33, 42 };
    }
    
    private static int syexomzmgognwfze(final int n, final int n2) {
        return n ^ n2;
    }
}
