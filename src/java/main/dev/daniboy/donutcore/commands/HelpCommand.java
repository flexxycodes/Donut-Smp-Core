package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.config.MessagesConfig;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.CommandExecutor;

public class HelpCommand implements CommandExecutor
{
    private final DonutCore plugin;
    private static int QZ2oEba1yz = 0;
    private transient int FZx6H7ta7b = 814751389;
    private static String[] nothing_to_see_here;
    
    public HelpCommand(final DonutCore plugin, final int n) {
        final int n2 = 0x26678256 ^ (0xB72832A ^ (Integer.parseInt("626201321") ^ n));
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender commandSender, final Command command, final String s, final String[] array) {
        int n = 0x96A2B25 ^ (0x5F39FB49 ^ (0x3C36E0DA ^ this.FZx6H7ta7b));
        Label_0432: {
            Player player;
            int n3;
            if (((commandSender instanceof Player) ? 1 : 0) != (0x1BC055DF ^ n)) {
                final int n2 = 0x742A9361 ^ n;
                player = (Player)commandSender;
                n3 = (0x3619023E ^ n2);
            Label_0236:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 923796707: {
                            continue;
                        }
                        case 239605067: {
                            break Label_0236;
                        }
                        case 1045478766: {
                            break Label_0432;
                        }
                        default: {
                            break Label_0432;
                        }
                    }
                }
                n3 ^= 0x48C6E9B5;
            }
            else {
                Label_0123: {
                Label_0116:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                            case 1014468552: {
                                continue;
                            }
                            case 96779680: {
                                break Label_0116;
                            }
                            case 1012458204: {
                                break Label_0123;
                            }
                            default: {
                                break Label_0432;
                            }
                        }
                    }
                    n ^= 0x72DF2274;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) != 195862212) {
                    qonprnukzfhaulyk(n, 990355455);
                    break Label_0432;
                }
                final int qonprnukzfhaulyk = qonprnukzfhaulyk(n, 1846533000);
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x56408B02 ^ (0x51502720 ^ qonprnukzfhaulyk)) != 0;
            }
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 22484643) {
                    throw null;
                }
                throw new IllegalAccessException();
            }
            catch (final IllegalAccessException ex) {
                int n4 = 0;
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                    case 12979400: {
                        n4 = qonprnukzfhaulyk(n3, 482947429);
                        break;
                    }
                    case -1985386072: {
                        n4 = qonprnukzfhaulyk(n3, 233102793);
                        break;
                    }
                    default: {
                        throw new RuntimeException("Error in hash");
                    }
                }
                final int qonprnukzfhaulyk2 = qonprnukzfhaulyk(n4, 646297711);
                if ((player.hasPermission(svknlhbbfz(kabfbaapxhlslpn(), umsobnpnvknvocf(), qonprnukzfhaulyk2)) ? 1 : 0) == (0x3A544893 ^ qonprnukzfhaulyk2)) {
                    final int n5 = 0x1355CC2 ^ qonprnukzfhaulyk2;
                    MessagesConfig.NOPERMISSION.send((CommandSender)player);
                    return (byte)(0x75E4574E ^ (0x4E85431E ^ n5)) != 0;
                }
                final int n6 = 0xB5719E4 ^ qonprnukzfhaulyk2;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 251026645) {
                    qonprnukzfhaulyk(n6, 1662761251);
                    throw new RuntimeException();
                }
                final int qonprnukzfhaulyk3 = qonprnukzfhaulyk(n6, 1697964919);
                this.plugin.getHelpGui$1055651724(1578111927).open$967512435(player, new Object[(byte)(0x5437B200 ^ qonprnukzfhaulyk3)], 1892453237);
                return (byte)(0x6D712F53 ^ (0x39469D52 ^ qonprnukzfhaulyk3)) != 0;
            }
        }
    }
    
    static {
        (HelpCommand.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        HelpCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
        HelpCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
        HelpCommand.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        HelpCommand.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
        HelpCommand.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        HelpCommand.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
        HelpCommand.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
        HelpCommand.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        HelpCommand.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
        HelpCommand.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
        HelpCommand.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
        HelpCommand.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
        HelpCommand.QZ2oEba1yz = (0x73D90458 ^ new Random(-6685641321514903258L).nextInt());
    }
    
    public static String svknlhbbfz(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] umsobnpnvknvocf() {
        return new byte[] { 124, 43, 76, 24, 19, 26, 95 };
    }
    
    private static byte[] kabfbaapxhlslpn() {
        return new byte[] { -69, -29, 116, 74, 35, 71, 110, 33, 26, 0, 47, 95, 44, 12, 78, 117, 127, 91, 42, 72, 103, 100, 27, 22, 41, 69, 43, 10, 75, 99 };
    }
    
    private static int qonprnukzfhaulyk(final int n, final int n2) {
        return n2 ^ n;
    }
}
