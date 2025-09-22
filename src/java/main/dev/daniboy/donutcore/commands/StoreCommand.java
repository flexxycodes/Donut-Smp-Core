package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.command.Command;

public class StoreCommand extends Command
{
    private static int DBntv79JSy = 0;
    private transient int rDtlBO2eVS = 694660199;
    private static String ibwxdnezfw;
    private static String[] nothing_to_see_here;
    
    public StoreCommand() {
        final int n = 0x6C0C05F7 ^ 0x34865149;
        super("store");
    Label_0082:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                case 1646733691: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 1092945885: {}
                case 193748154: {
                    break Label_0082;
                }
            }
        }
        final int n2 = 0x23ACFE12 ^ (0x229B5570 ^ Integer.parseInt("249332042"));
        this.setDescription("Provides the store link.");
        this.setUsage("/store");
        this.setPermission("donutcore.store");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        int n = 0x4B4AC26E ^ (0x6E5FD298 ^ (0x65DF1632 ^ this.rDtlBO2eVS));
        Label_0619: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x4CFC7A04 ^ n)) {
                final int n2 = 0x2F1F1257 ^ n;
                final Player player = (Player)commandSender;
                int n3 = 0x7125917E ^ n2;
                Label_0243: {
                Label_0236:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 1013964104: {
                                continue;
                            }
                            case 73502721: {
                                break Label_0236;
                            }
                            case 1322501151: {
                                break Label_0243;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n3 ^= 0x74A5AEAC;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 106962922) {
                            throw null;
                        }
                        throw new RuntimeException();
                    }
                    catch (final RuntimeException ex) {
                        int gqgkdulvxuauygmr = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case 1246040585: {
                                gqgkdulvxuauygmr = gqgkdulvxuauygmr(n3, 1765908182);
                                break;
                            }
                            case 857390091: {
                                gqgkdulvxuauygmr = (0x266A6B16 ^ n3);
                                break;
                            }
                        }
                    Label_0379:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(gqgkdulvxuauygmr)) {
                                case 460644043: {
                                    continue;
                                }
                                case 202483053: {
                                    gqgkdulvxuauygmr ^= 0x1EFC2489;
                                }
                                case 329301542: {
                                    break Label_0379;
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                        if ((player.hasPermission(mjwmyrycjh(evqxdaerxtuhuvk(), gqgkdulvxuauygmr)) ? 1 : 0) == (0x5EF5181E ^ gqgkdulvxuauygmr)) {
                            final int n4 = 0x4CA328B7 ^ gqgkdulvxuauygmr;
                            MessagesConfig.NOPERMISSION.send((CommandSender)player);
                            return (byte)(0xAFDFBF4 ^ (0x18ABCB5C ^ n4)) != 0;
                        }
                    Label_0511:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(gqgkdulvxuauygmr)) {
                                case 1599057588: {
                                    continue;
                                }
                                case 133857359: {
                                    gqgkdulvxuauygmr ^= 0x41689B59;
                                }
                                case 1517178341: {
                                    break Label_0511;
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(gqgkdulvxuauygmr) == 222376388) {
                            final int n5 = 0x1476E898 ^ gqgkdulvxuauygmr;
                            MessagesConfig.STORE.send((CommandSender)player);
                            return (byte)(0x5182BD6A ^ (0x5A69D6B4 ^ n5)) != 0;
                        }
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(gqgkdulvxuauygmr)) {
                                case 1137013224: {
                                    continue;
                                }
                                case 222376388: {}
                                default: {
                                    break Label_0619;
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
                            case 258855623: {
                                continue;
                            }
                            case 86597787: {
                                break Label_0116;
                            }
                            case 748936774: {
                                break Label_0123;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n ^= 0x1C7F2D10;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) == 201205813) {
                    final int gqgkdulvxuauygmr2 = gqgkdulvxuauygmr(n, 1939961697);
                    MessagesConfig.ONLYPLAYERS.send(commandSender);
                    return (byte)(0x4AB263A4 ^ (0x699043D0 ^ gqgkdulvxuauygmr2)) != 0;
                }
                gqgkdulvxuauygmr(n, 807439905);
            }
        }
        throw new IllegalAccessException();
    }
    
    static {
        (StoreCommand.nothing_to_see_here = new String[19])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28e4\u28e4\u28e4\u28e4\u28e4\u28f6\u28e6\u28e4\u28c4\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f4\u28ff\u287f\u281b\u2809\u2819\u281b\u281b\u281b\u281b\u283b\u28bf\u28ff\u28f7\u28e4\u2840\u2800\u2800\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28fc\u28ff\u280b\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28c0\u28c0\u2808\u28bb\u28ff\u28ff\u2844\u2800\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28f8\u28ff\u284f\u2800\u2800\u2800\u28e0\u28f6\u28fe\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28bf\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2801\u2800\u2800\u28b0\u28ff\u28ff\u28ef\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u2819\u28bf\u28f7\u2844\u2800";
        StoreCommand.nothing_to_see_here[5] = "\u2800\u2800\u28c0\u28e4\u28f4\u28f6\u28f6\u28ff\u285f\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28f7\u2800";
        StoreCommand.nothing_to_see_here[6] = "\u2800\u28b0\u28ff\u285f\u280b\u2809\u28f9\u28ff\u2847\u2800\u2800\u2800\u2818\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28e4\u28e4\u28e4\u28f6\u28f6\u28f6\u28f6\u28ff\u28ff\u28ff\u2800";
        StoreCommand.nothing_to_see_here[7] = "\u2800\u28b8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2800";
        StoreCommand.nothing_to_see_here[8] = "\u2800\u28f8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2809\u283b\u283f\u28ff\u28ff\u28ff\u28ff\u287f\u283f\u283f\u281b\u28bb\u28ff\u2847\u2800\u2800";
        StoreCommand.nothing_to_see_here[9] = "\u2800\u28ff\u28ff\u2801\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28e7\u2800\u2800";
        StoreCommand.nothing_to_see_here[10] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        StoreCommand.nothing_to_see_here[11] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        StoreCommand.nothing_to_see_here[12] = "\u2800\u28bf\u28ff\u2846\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800";
        StoreCommand.nothing_to_see_here[13] = "\u2800\u2838\u28ff\u28e7\u2840\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2803\u2800\u2800";
        StoreCommand.nothing_to_see_here[14] = "\u2800\u2800\u281b\u28bf\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u28f0\u28ff\u28ff\u28f7\u28f6\u28f6\u28f6\u28f6\u2836\u2800\u28a0\u28ff\u28ff\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28fd\u28ff\u284f\u2801\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28b9\u28ff\u2846\u2800\u2800\u2800\u28f8\u28ff\u2807\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28e6\u28c4\u28c0\u28e0\u28f4\u28ff\u28ff\u2801\u2800\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u287f\u280f\u2800\u2800\u2800\u2800";
        StoreCommand.nothing_to_see_here[18] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u281b\u283b\u283f\u283f\u283f\u283f\u280b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StoreCommand.ibwxdnezfw = ByteBuffer.wrap(xkbnmsofbsgllzv()).asCharBuffer().toString();
        StoreCommand.DBntv79JSy = (0x976F217D ^ new Random(-3544955341514160785L).nextInt());
    }
    
    public static String mjwmyrycjh(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = StoreCommand.ibwxdnezfw.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] evqxdaerxtuhuvk() {
        return new byte[] { 0, 0, 0, 15, 0, 0, 0, 0 };
    }
    
    private static byte[] xkbnmsofbsgllzv() {
        return new byte[] { 49, 81, 57, 92, 49, 92, 48, 66, 57, 76, 49, 86, 57, 92, 49, 64, 48, 82, 57, 22, 49, 70, 57, 71, 49, 93, 48, 69, 57, 93 };
    }
    
    private static int gqgkdulvxuauygmr(final int n, final int n2) {
        return n ^ n2;
    }
}
