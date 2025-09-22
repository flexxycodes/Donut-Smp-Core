package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.utils.ActionBar;
import org.bukkit.OfflinePlayer;
import org.bukkit.Bukkit;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.command.Command;

public class BalanceCommand extends Command
{
    private final Economy economy;
    private static int LRnAqyVjUV = 0;
    private transient int 1yWT0WZyZd = 1146345759;
    private static byte[] rvffapfrho;
    private static String[] nothing_to_see_here;
    
    public BalanceCommand(final Economy economy, final int n) {
        final int n2 = 0x666B9FC8 ^ 0x4A1B2E91;
        super("balance");
        olvcapfwpubyxtfx(n2, 1865442424);
        final int n3 = 0x499BA2CB ^ (0x2C119F60 ^ (Integer.parseInt("322241494") ^ n));
        this.economy = economy;
        this.setDescription("Check the balance of a player");
        this.setUsage("/balance <player>");
        this.setPermission("donutcore.balance");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        int n = 0x3B5FC898 ^ (0x4FAFD352 ^ (0x3E7F3BDC ^ this.1yWT0WZyZd));
        if (((commandSender instanceof Player) ? 1 : 0) == (0x1D197138 ^ n)) {
            final int n2 = 0x49E1EACB ^ n;
            MessagesConfig.ONLYPLAYERS.send(commandSender);
            return (byte)(0xB8C30BD ^ (0x5F74AB4F ^ n2)) != 0;
        }
        Label_0135: {
        Label_0128:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                    case 1469895535: {
                        continue;
                    }
                    case 140596805: {
                        break Label_0128;
                    }
                    case 955379124: {
                        break Label_0135;
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
            }
            n ^= 0x43ED3BE1;
        }
        Label_0689: {
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) != 133763056) {
                olvcapfwpubyxtfx(n, 800412114);
            }
            else {
                final int n3 = 0x586AAB31 ^ n;
                final Player player = (Player)commandSender;
                final int n4 = 0xD6C0BFA ^ n3;
                if (array.length != (byte)(0xBF2EA13 ^ n4)) {
                    final int n5 = 0x501FE155 ^ n4;
                    commandSender.sendMessage(fummlvunih(wosblvrltgpkljn(), n5));
                    return (byte)(0x71A84119 ^ (0x2A454A5E ^ n5)) != 0;
                }
                final int n6 = 0x2C968B19 ^ n4;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) == 206723937) {
                    final int n7 = 0x37D7D450 ^ n6;
                    final Player player2 = Bukkit.getPlayer(array[(byte)(0x10B3B55B ^ n7)]);
                    final int n8 = 0x617E6B00 ^ n7;
                    if (player2 == null) {
                        final int n9 = 0x5F31F3C8 ^ n8;
                        commandSender.sendMessage(MessagesConfig.PLAYERNOTFOUND.getSingleMessage());
                        return (byte)(0x73CC8AA9 ^ (0x5D30A73B ^ n9)) != 0;
                    }
                    final int olvcapfwpubyxtfx = olvcapfwpubyxtfx(n8, 1952316409);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(olvcapfwpubyxtfx) == 87500503) {
                        final int olvcapfwpubyxtfx2 = olvcapfwpubyxtfx(olvcapfwpubyxtfx, 833786073);
                        final double balance = this.economy.getBalance((OfflinePlayer)player2);
                        final int n10 = 0x765E778B ^ olvcapfwpubyxtfx2;
                        final String formatBalance$614937173 = this.formatBalance$614937173(balance, 1530229980);
                        final int n11 = 0x216BB084 ^ n10;
                        final String singleMessage = MessagesConfig.BALANCEMESSAGE.getSingleMessage();
                        final int n12 = 0x4D358796 ^ n11;
                        commandSender.sendMessage(this.formatMessage$1947399162(singleMessage, player2.getName(), formatBalance$614937173, 2113777724));
                        final int n13 = 0x70F64E12 ^ n12;
                        ActionBar.sendActionBar(player, this.formatMessage$1947399162(singleMessage, player2.getName(), formatBalance$614937173, 2113777724));
                        return (byte)(0x21D6FD70 ^ (0x7F024681 ^ n13)) != 0;
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(olvcapfwpubyxtfx)) {
                            case 863438719: {
                                continue;
                            }
                            case 87500503: {}
                            default: {
                                break Label_0689;
                            }
                        }
                    }
                }
            }
        }
        throw new IllegalAccessException();
    }
    
    private String formatBalance$614937173(final double n, final int n2) {
        int n3 = 0x771B224F ^ (0xC16BDDC ^ (0x2C867B25 ^ (this.1yWT0WZyZd ^ n2)));
        if (dcmpl(n, 1.0E9) >= (0x5B28C144 ^ n3)) {
            final int n4 = 0x437B6ECA ^ n3;
            final String fummlvunih = fummlvunih(mbqvenewyiyyttt(), n4);
            final Object[] array = new Object[(byte)(0x1853AF8F ^ n4)];
            array[(byte)(0x1853AF8E ^ n4)] = n / 1.0E9;
            return String.format(fummlvunih, array);
        }
        Label_0183: {
        Label_0176:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                    case 491381153: {
                        continue;
                    }
                    case 10399067: {
                        break Label_0176;
                    }
                    case 1679764488: {
                        break Label_0183;
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
            }
            n3 ^= 0x1095887;
        }
        Label_0699: {
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 245449672) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 897215751: {
                            continue;
                        }
                        case 245449672: {}
                        default: {
                            break Label_0699;
                        }
                    }
                }
            }
            else {
                final int n5 = 0x33975C0B ^ n3;
                if (dcmpl(n, 1000000.0) >= (0x69B6C5C8 ^ n5)) {
                    final int n6 = 0x6E49005 ^ n5;
                    final String fummlvunih2 = fummlvunih(odjsiarrrrnhoyg(), n6);
                    final Object[] array2 = new Object[(byte)(0x6F5255CC ^ n6)];
                    array2[(byte)(0x6F5255CD ^ n6)] = n / 1000000.0;
                    return String.format(fummlvunih2, array2);
                }
                final int olvcapfwpubyxtfx = olvcapfwpubyxtfx(n5, 1718258975);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(olvcapfwpubyxtfx) != 247120636) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(olvcapfwpubyxtfx)) {
                            case 2098413316: {
                                continue;
                            }
                            case 247120636: {}
                            default: {
                                break Label_0699;
                            }
                        }
                    }
                }
                else {
                    final int n7 = 0x4FBF815F ^ olvcapfwpubyxtfx;
                    if (dcmpl(n, 1000.0) >= (0x4063C988 ^ n7)) {
                        final int n8 = 0x4DA4916C ^ n7;
                        final String fummlvunih3 = fummlvunih(tvapqlllrwybubu(), n8);
                        final Object[] array3 = new Object[(byte)(0xDC758E5 ^ n8)];
                        array3[(byte)(0xDC758E4 ^ n8)] = n / 1000.0;
                        return String.format(fummlvunih3, array3);
                    }
                    final int n9 = 0x35A1053D ^ n7;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) == 69802332) {
                        final int olvcapfwpubyxtfx2 = olvcapfwpubyxtfx(n9, 1043729267);
                        final String fummlvunih4 = fummlvunih(hftnvpnbkezzvpj(), olvcapfwpubyxtfx2);
                        final Object[] array4 = new Object[(byte)(0x4BF4C7C7 ^ olvcapfwpubyxtfx2)];
                        array4[(byte)(0x4BF4C7C6 ^ olvcapfwpubyxtfx2)] = n;
                        return String.format(fummlvunih4, array4);
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                            case 1928419908: {
                                continue;
                            }
                            case 69802332: {}
                            default: {
                                break Label_0699;
                            }
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }
    
    private String formatMessage$1947399162(final String s, final String s2, final String s3, final int n) {
        final int n2 = 0x759656E5 ^ (0x7B30E1D8 ^ (0x215CE57C ^ (this.1yWT0WZyZd ^ n)));
        return s.replace((CharSequence)fummlvunih(ykbtwztnaslfaoy(), n2), (CharSequence)s2).replace((CharSequence)fummlvunih(gydbnyqaofmsoqh(), n2), (CharSequence)s3);
    }
    
    static {
        (BalanceCommand.nothing_to_see_here = new String[19])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28e4\u28e4\u28e4\u28e4\u28e4\u28f6\u28e6\u28e4\u28c4\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f4\u28ff\u287f\u281b\u2809\u2819\u281b\u281b\u281b\u281b\u283b\u28bf\u28ff\u28f7\u28e4\u2840\u2800\u2800\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28fc\u28ff\u280b\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28c0\u28c0\u2808\u28bb\u28ff\u28ff\u2844\u2800\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28f8\u28ff\u284f\u2800\u2800\u2800\u28e0\u28f6\u28fe\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28bf\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2801\u2800\u2800\u28b0\u28ff\u28ff\u28ef\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u2819\u28bf\u28f7\u2844\u2800";
        BalanceCommand.nothing_to_see_here[5] = "\u2800\u2800\u28c0\u28e4\u28f4\u28f6\u28f6\u28ff\u285f\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28f7\u2800";
        BalanceCommand.nothing_to_see_here[6] = "\u2800\u28b0\u28ff\u285f\u280b\u2809\u28f9\u28ff\u2847\u2800\u2800\u2800\u2818\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28e4\u28e4\u28e4\u28f6\u28f6\u28f6\u28f6\u28ff\u28ff\u28ff\u2800";
        BalanceCommand.nothing_to_see_here[7] = "\u2800\u28b8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2800";
        BalanceCommand.nothing_to_see_here[8] = "\u2800\u28f8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2809\u283b\u283f\u28ff\u28ff\u28ff\u28ff\u287f\u283f\u283f\u281b\u28bb\u28ff\u2847\u2800\u2800";
        BalanceCommand.nothing_to_see_here[9] = "\u2800\u28ff\u28ff\u2801\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28e7\u2800\u2800";
        BalanceCommand.nothing_to_see_here[10] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        BalanceCommand.nothing_to_see_here[11] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        BalanceCommand.nothing_to_see_here[12] = "\u2800\u28bf\u28ff\u2846\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800";
        BalanceCommand.nothing_to_see_here[13] = "\u2800\u2838\u28ff\u28e7\u2840\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2803\u2800\u2800";
        BalanceCommand.nothing_to_see_here[14] = "\u2800\u2800\u281b\u28bf\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u28f0\u28ff\u28ff\u28f7\u28f6\u28f6\u28f6\u28f6\u2836\u2800\u28a0\u28ff\u28ff\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28fd\u28ff\u284f\u2801\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28b9\u28ff\u2846\u2800\u2800\u2800\u28f8\u28ff\u2807\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28e6\u28c4\u28c0\u28e0\u28f4\u28ff\u28ff\u2801\u2800\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u287f\u280f\u2800\u2800\u2800\u2800";
        BalanceCommand.nothing_to_see_here[18] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u281b\u283b\u283f\u283f\u283f\u283f\u280b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        BalanceCommand.rvffapfrho = lrrqygvgmjhiqsz();
        BalanceCommand.LRnAqyVjUV = (0x7436E7A5 ^ new Random(1804143439860755769L).nextInt());
    }
    
    public static String fummlvunih(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= BalanceCommand.rvffapfrho[i % BalanceCommand.rvffapfrho.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] lrrqygvgmjhiqsz() {
        return new byte[] { 20, 44, 112, 77, 75, 77, 55, 30, 45, 17, 80, 69, 64, 106, 36, 48, 79, 53, 47, 33, 95, 33, 14, 71, 2, 75, 115, 64, 87, 16, 101, 114, 39, 14, 42, 33, 103, 32, 33, 72, 8, 18, 71, 126, 2, 112, 51, 29, 51, 40, 49, 16, 40, 43, 52, 21, 116, 43, 53, 114, 71, 9, 112, 65, 97, 121, 85, 90, 83, 85, 86, 58, 41 };
    }
    
    private static byte[] wosblvrltgpkljn() {
        return new byte[] { -37, -26, 68, 42, 121, 8, 6, 74, 26, 67, 97, 21, 116, 98, 22, 38, 126, 47, 24, 118, 110, 117, 58, 25, 48, 28, 66, 27, 96, 70, 84, 34, 19, 28, 24, 43, 86, 101, 22, 17, 57, 70, 115, 53, 48, 35, 2, 90, 4, 35 };
    }
    
    private static byte[] hftnvpnbkezzvpj() {
        return new byte[] { -37, -31, 71, 92, 120, 80, 4, 29, 31, 65 };
    }
    
    private static byte[] tvapqlllrwybubu() {
        return new byte[] { -40, -32, 65, 89, 125, 91, 5, 30, 21, 69, 99, 63 };
    }
    
    private static byte[] odjsiarrrrnhoyg() {
        return new byte[] { -37, -21, 70, 95, 125, 85, 1, 20, 20, 68, 97, 48 };
    }
    
    private static byte[] mbqvenewyiyyttt() {
        return new byte[] { -34, -29, 72, 89, 120, 84, 1, 29, 25, 67, 96, 63 };
    }
    
    private static byte[] ykbtwztnaslfaoy() {
        return new byte[] { -45, -32, 68, 91, 127, 10, 7, 69, 20, 67, 100, 15, 116, 56, 20, 117, 118, 35 };
    }
    
    private static byte[] gydbnyqaofmsoqh() {
        return new byte[] { -45, -32, 68, 91, 127, 27, 7, 68, 20, 77, 100, 3, 116, 51, 20, 115, 118, 35 };
    }
    
    private static int olvcapfwpubyxtfx(final int n, final int n2) {
        return n ^ n2;
    }
}
