package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.config.MainConfig;
import java.util.Arrays;
import org.bukkit.Bukkit;
import dev.daniboy.donutcore.utils.Hex;
import java.io.IOException;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.CommandExecutor;

public class MessageCommand implements CommandExecutor
{
    private final DonutCore plugin;
    private final SQLiteManager sqLiteManager;
    private static int lKQ2YvPYPZ = 0;
    private transient int kYO8KV5Y6F = 391840803;
    private static byte[] xytqskxkjx;
    private static String[] nothing_to_see_here;
    
    public MessageCommand(final DonutCore plugin, final SQLiteManager sqLiteManager, final int n) {
        final int n2 = 0x3B902844 ^ 0x63BA951E;
        xmpvgdtddoayhstk(n2, 175929728);
        final int n3 = 0x3DF011AC ^ (0x1825DFA5 ^ (Integer.parseInt("1875980447") ^ n));
        final int n4 = 0x7FD579D5 ^ xmpvgdtddoayhstk(n3, 1481390597);
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
    }
    
    public boolean onCommand(final CommandSender commandSender, final Command command, final String s, final String[] array) {
        final int n = 0x479CFE25 ^ (0x321AC12C ^ (0x509DCF27 ^ this.kYO8KV5Y6F));
        Label_1759: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x3815BABA ^ n)) {
                final int n2 = 0x4B2DBD30 ^ n;
                final Player player = (Player)commandSender;
                final int xmpvgdtddoayhstk = xmpvgdtddoayhstk(0x49793A15 ^ n2, 90179954);
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xmpvgdtddoayhstk) != 173042090) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    int xmpvgdtddoayhstk2 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(xmpvgdtddoayhstk)) {
                        case -1011866280: {
                            xmpvgdtddoayhstk2 = xmpvgdtddoayhstk(xmpvgdtddoayhstk, 1424311557);
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case -116807831: {
                            xmpvgdtddoayhstk2 = (0x73B27543 ^ xmpvgdtddoayhstk);
                            break;
                        }
                    }
                    int n3 = 0x711BE525 ^ xmpvgdtddoayhstk2;
                    if ((player.hasPermission(jhztnaksru(rkndxztihibcvjs(), n3)) ? 1 : 0) == (0x3D88A48B ^ n3)) {
                        final int n4 = 0x625B6C21 ^ n3;
                        MessagesConfig.NOPERMISSION.send((CommandSender)player);
                        final int n5 = 0x5129F0CF ^ n4;
                        SoundConfig.NOPERMISSION.play(player);
                        return (byte)(0x305458E5 ^ (0x3EAE6081 ^ n5)) != 0;
                    }
                Label_0319:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 1436756295: {
                                continue;
                            }
                            case 121144133: {
                                n3 ^= 0x296612C3;
                            }
                            case 1771190207: {
                                break Label_0319;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 143562181) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                case 1768630159: {
                                    continue;
                                }
                                case 143562181: {}
                                default: {
                                    break Label_1759;
                                }
                            }
                        }
                        throw new IOException();
                    }
                    final int n6 = 0x26B181E0 ^ n3;
                    if (array.length < (byte)(0x325F37AA ^ n6)) {
                        final int n7 = 0x5006F779 ^ n6;
                        commandSender.sendMessage(Hex.hex(jhztnaksru(qtwtxsigjybheap(), n7)));
                        return (byte)(0x16A7D141 ^ (0x74FE1191 ^ n7)) != 0;
                    }
                    final int n8 = 0x4D6C9A03 ^ n6;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 108289864) {
                        throw new IOException();
                    }
                    final int n9 = 0x30A5CD06 ^ n8;
                    final Player player2 = (Player)commandSender;
                    final int n10 = 0x30CFF878 ^ n9;
                    final Player player3 = Bukkit.getPlayer(array[(byte)(0x7F5998D5 ^ n10)]);
                    final int n11 = 0x6C86DB1D ^ n10;
                    if ((player2.equals((Object)player3) ? 1 : 0) != (0x13DF43C8 ^ n11)) {
                        final int n12 = 0x460F3041 ^ n11;
                        MessagesConfig.CANTMESSAGEYOURSELF.send((CommandSender)player);
                        return (byte)(0x2F8B4C5C ^ (0x7A5B3FD4 ^ n12)) != 0;
                    }
                    int xmpvgdtddoayhstk3 = xmpvgdtddoayhstk(n11, 751138914);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xmpvgdtddoayhstk3) != 172158083) {
                        xmpvgdtddoayhstk(xmpvgdtddoayhstk3, 2112314035);
                        throw new IOException();
                    }
                Label_0711:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xmpvgdtddoayhstk3)) {
                            case 524195511: {
                                continue;
                            }
                            case 172158083: {
                                xmpvgdtddoayhstk3 ^= 0x5EAF899C;
                            }
                            case 143183016: {
                                break Label_0711;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    int n14 = 0;
                    Label_0757: {
                        if (player3 != null) {
                            final int n13 = 0x5B03F89C ^ xmpvgdtddoayhstk3;
                            if ((player3.isOnline() ? 1 : 0) == (0x3AB64AAA ^ n13)) {
                                n14 = (0x1E9D6BCA ^ n13);
                            }
                            else {
                                final int xmpvgdtddoayhstk4 = xmpvgdtddoayhstk(n13, 2121930030);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xmpvgdtddoayhstk4) != 88849859) {
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xmpvgdtddoayhstk4)) {
                                            case 1305764220: {
                                                continue;
                                            }
                                            case 88849859: {}
                                            default: {
                                                break Label_1759;
                                            }
                                        }
                                    }
                                    throw new IOException();
                                }
                                final int xmpvgdtddoayhstk5 = xmpvgdtddoayhstk(xmpvgdtddoayhstk4, 836421236);
                                if ((this.sqLiteManager.getMessageToggle$1388376138(player3.getUniqueId(), 884977015) ? 1 : 0) == (0x751699F0 ^ xmpvgdtddoayhstk5)) {
                                    final int n15 = 0x96ED1F ^ xmpvgdtddoayhstk5;
                                    MessagesConfig.MESSAGEDISABLED.send(commandSender);
                                    return (byte)(0x3CD924C1 ^ (0x4959502F ^ n15)) != 0;
                                }
                                final int xmpvgdtddoayhstk6 = xmpvgdtddoayhstk(xmpvgdtddoayhstk5, 129715321);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(xmpvgdtddoayhstk6) != 238075668) {
                                    xmpvgdtddoayhstk(xmpvgdtddoayhstk6, 810595472);
                                    throw new IOException();
                                }
                                final int xmpvgdtddoayhstk7 = xmpvgdtddoayhstk(xmpvgdtddoayhstk6, 240319942);
                                final String join = String.join((CharSequence)jhztnaksru(oxmklyzoocshpmz(), xmpvgdtddoayhstk7), (CharSequence[])Arrays.copyOfRange((Object[])array, (int)(byte)(0x7CFF284E ^ xmpvgdtddoayhstk7), array.length));
                                final int n16 = 0x1EECBD4D ^ xmpvgdtddoayhstk7;
                                final String msg_FROM_FORMAT = MainConfig.Chat.MSG_FROM_FORMAT;
                                final String jhztnaksru = jhztnaksru(dqdpkowbjmjoshz(), n16);
                                final Player player4 = player2;
                                final int n17 = 0xEBEB6DD ^ n16;
                                final String replace = msg_FROM_FORMAT.replace((CharSequence)jhztnaksru, (CharSequence)player4.getName());
                                final String jhztnaksru2 = jhztnaksru(muonvhusqsaigcm(), n17);
                                final Player player5 = player3;
                                final int n18 = 0x64B86854 ^ n17;
                                final String replace2 = replace.replace((CharSequence)jhztnaksru2, (CharSequence)player5.getName());
                                final String jhztnaksru3 = jhztnaksru(lmbeqrtavqcuejt(), n18);
                                final CharSequence charSequence = (CharSequence)join;
                                final int n19 = 0x60A6E9B0 ^ n18;
                                final String replace3 = replace2.replace((CharSequence)jhztnaksru3, charSequence);
                                final int n20 = 0x3599B921 ^ n19;
                                final String hex = Hex.hex(replace3);
                                final int n21 = 0x6C018EA8 ^ n20;
                                final String msg_TO_FORMAT = MainConfig.Chat.MSG_TO_FORMAT;
                                final String jhztnaksru4 = jhztnaksru(uhuzmygoabpqcaw(), n21);
                                final Player player6 = player2;
                                final int n22 = 0x1E688F45 ^ n21;
                                final String replace4 = msg_TO_FORMAT.replace((CharSequence)jhztnaksru4, (CharSequence)player6.getName());
                                final String jhztnaksru5 = jhztnaksru(ocylatqaktdzlql(), n22);
                                final Player player7 = player3;
                                final int n23 = 0x545BBFD ^ n22;
                                final String replace5 = replace4.replace((CharSequence)jhztnaksru5, (CharSequence)player7.getName());
                                final String jhztnaksru6 = jhztnaksru(iivnellzmoxvdtp(), n23);
                                final CharSequence charSequence2 = (CharSequence)join;
                                final int n24 = 0x5A44C2E2 ^ n23;
                                final String replace6 = replace5.replace((CharSequence)jhztnaksru6, charSequence2);
                                final int n25 = 0xCCDC4CA ^ n24;
                                final String hex2 = Hex.hex(replace6);
                                final int n26 = 0x59009C06 ^ n25;
                                player3.sendMessage(hex);
                                final int n27 = 0x3D97A748 ^ n26;
                                player2.sendMessage(hex2);
                                final int n28 = 0x2D17A0D9 ^ n27;
                                this.plugin.getLastMessaged$1938418975().put((Object)player3, (Object)player2);
                                return (byte)(0xC869733 ^ (0x3989AB87 ^ n28)) != 0;
                            }
                        }
                        else {
                            n14 = (0x68FFD46E ^ xmpvgdtddoayhstk3);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14) != 33566464) {
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14)) {
                                        case 112182414: {
                                            continue;
                                        }
                                        case 33566464: {}
                                        default: {
                                            break Label_1759;
                                        }
                                    }
                                }
                                throw new IOException();
                            }
                        Label_0872:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14)) {
                                    case 1211035228: {
                                        break Label_0757;
                                    }
                                    case 2018252442: {
                                        continue;
                                    }
                                    case 33566464: {
                                        break Label_0872;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            n14 ^= 0x2D614738;
                        }
                    }
                    commandSender.sendMessage(Hex.hex(jhztnaksru(vtipzctukfrpzyf(), n14)));
                    return (byte)(0x6487754 ^ (0x22635635 ^ n14)) != 0;
                }
            }
            int n29 = 0x2FB026C9 ^ n;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n29) == 231786683) {
                Label_1724: {
                Label_1716:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n29)) {
                            case 1304034386: {
                                continue;
                            }
                            case 231786683: {
                                break Label_1716;
                            }
                            case 422732812: {
                                break Label_1724;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n29 ^= 0x39EB6F12;
                }
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x31F58C4 ^ (0x2D51ABA4 ^ n29)) != 0;
            }
            xmpvgdtddoayhstk(n29, 1431895402);
        }
        throw new IOException();
    }
    
    static {
        (MessageCommand.nothing_to_see_here = new String[19])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28e4\u28e4\u28e4\u28e4\u28e4\u28f6\u28e6\u28e4\u28c4\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f4\u28ff\u287f\u281b\u2809\u2819\u281b\u281b\u281b\u281b\u283b\u28bf\u28ff\u28f7\u28e4\u2840\u2800\u2800\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28fc\u28ff\u280b\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28c0\u28c0\u2808\u28bb\u28ff\u28ff\u2844\u2800\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28f8\u28ff\u284f\u2800\u2800\u2800\u28e0\u28f6\u28fe\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28bf\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2801\u2800\u2800\u28b0\u28ff\u28ff\u28ef\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u2819\u28bf\u28f7\u2844\u2800";
        MessageCommand.nothing_to_see_here[5] = "\u2800\u2800\u28c0\u28e4\u28f4\u28f6\u28f6\u28ff\u285f\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28f7\u2800";
        MessageCommand.nothing_to_see_here[6] = "\u2800\u28b0\u28ff\u285f\u280b\u2809\u28f9\u28ff\u2847\u2800\u2800\u2800\u2818\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28e4\u28e4\u28e4\u28f6\u28f6\u28f6\u28f6\u28ff\u28ff\u28ff\u2800";
        MessageCommand.nothing_to_see_here[7] = "\u2800\u28b8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2800";
        MessageCommand.nothing_to_see_here[8] = "\u2800\u28f8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2809\u283b\u283f\u28ff\u28ff\u28ff\u28ff\u287f\u283f\u283f\u281b\u28bb\u28ff\u2847\u2800\u2800";
        MessageCommand.nothing_to_see_here[9] = "\u2800\u28ff\u28ff\u2801\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28e7\u2800\u2800";
        MessageCommand.nothing_to_see_here[10] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        MessageCommand.nothing_to_see_here[11] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        MessageCommand.nothing_to_see_here[12] = "\u2800\u28bf\u28ff\u2846\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800";
        MessageCommand.nothing_to_see_here[13] = "\u2800\u2838\u28ff\u28e7\u2840\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2803\u2800\u2800";
        MessageCommand.nothing_to_see_here[14] = "\u2800\u2800\u281b\u28bf\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u28f0\u28ff\u28ff\u28f7\u28f6\u28f6\u28f6\u28f6\u2836\u2800\u28a0\u28ff\u28ff\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28fd\u28ff\u284f\u2801\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28b9\u28ff\u2846\u2800\u2800\u2800\u28f8\u28ff\u2807\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28e6\u28c4\u28c0\u28e0\u28f4\u28ff\u28ff\u2801\u2800\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u287f\u280f\u2800\u2800\u2800\u2800";
        MessageCommand.nothing_to_see_here[18] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u281b\u283b\u283f\u283f\u283f\u283f\u280b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageCommand.xytqskxkjx = iipuqmuqvbvoqfu();
        MessageCommand.lKQ2YvPYPZ = (0xEEBEC9B7 ^ new Random(-2282763439509466664L).nextInt());
    }
    
    public static String jhztnaksru(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= MessageCommand.xytqskxkjx[i % MessageCommand.xytqskxkjx.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] iipuqmuqvbvoqfu() {
        return new byte[] { 56, 114, 39, 4, 19, 126, 123, 40, 92, 39, 72, 102, 39, 66, 59, 56, 34, 119, 123, 87, 5, 73, 96, 59, 8, 6, 13, 61, 18, 90, 60, 125, 91, 42, 93, 83, 82, 72, 43, 86, 47, 103, 51, 31, 95, 86 };
    }
    
    private static byte[] rkndxztihibcvjs() {
        return new byte[] { -9, -67, 20, 82, 32, 39, 78, 119, 101, 103, 121, 34, 20, 19, 8, 97, 23, 52, 66, 7, 52, 87, 83, 100, 59, 67, 56, 107 };
    }
    
    private static byte[] iivnellzmoxvdtp() {
        return new byte[] { -15, -67, 18, 17, 36, 36, 78, 124, 104, 99, 120, 32, 23, 20, 12, 106, 19, 38, 76, 66 };
    }
    
    private static byte[] muonvhusqsaigcm() {
        return new byte[] { -9, -75, 21, 18, 33, 52, 77, 127, 111, 125, 121, 59, 21, 24, 9, 118, 20, 32, 72, 28, 52, 84 };
    }
    
    private static byte[] dqdpkowbjmjoshz() {
        return new byte[] { -9, -69, 19, 20, 39, 56, 75, 121, 101, 113, 121, 52, 19, 18, 15, 127, 18, 102 };
    }
    
    private static byte[] lmbeqrtavqcuejt() {
        return new byte[] { -9, -66, 18, 23, 34, 32, 72, 127, 111, 101, 123, 32, 17, 18, 8, 108, 16, 33, 74, 65 };
    }
    
    private static byte[] uhuzmygoabpqcaw() {
        return new byte[] { -2, -65, 19, 24, 32, 52, 66, 120, 104, 113, 122, 54, 30, 20, 2, 115, 23, 102 };
    }
    
    private static byte[] qtwtxsigjybheap() {
        return new byte[] { -9, -69, 18, 18, 35, 41, 66, 79, 111, 103, 121, 49, 18, 21, 11, 105, 27, 127, 72, 68, 52, 80, 85, 102, 56, 65, 52, 104, 33, 73, 13, 119, 110, 106, 109, 11, 107, 27, 24, 28, 30, 52, 6, 93, 111, 92, 1, 96, 20, 11, 34, 37, 78, 125, 108, 96, 113, 39, 20, 16, 10, 105, 23, 34, 75, 93 };
    }
    
    private static byte[] vtipzctukfrpzyf() {
        return new byte[] { -16, -67, 17, 26, 35, 43, 72, 74, 100, 121, 120, 49, 31, 6, 13, 43, 20, 63, 77, 11, 51, 16, 80, 116, 59, 85, 53, 121, 34, 76, 4, 36, 109, 106, 107, 75, 100, 22, 29, 1, 31, 37, 0, 9, 103, 15, 8, 42, 31, 88, 37, 36, 77, 126, 106, 114, 126, 112 };
    }
    
    private static byte[] ocylatqaktdzlql() {
        return new byte[] { -15, -76, 21, 24, 33, 58, 66, 123, 107, 115, 113, 49, 30, 25, 13, 119, 20, 37, 76, 28, 55, 85 };
    }
    
    private static byte[] oxmklyzoocshpmz() {
        return new byte[] { -12, -67, 30, 19 };
    }
    
    private static int xmpvgdtddoayhstk(final int n, final int n2) {
        return n2 ^ n;
    }
}
