package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import dev.daniboy.donutcore.utils.ActionBar;
import org.bukkit.OfflinePlayer;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.database.SQLiteManager;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.command.Command;

public class PayCommand extends Command
{
    private final Economy economy;
    private final SQLiteManager sqLiteManager;
    private static int FBtUd90MAp = 0;
    private transient int Uy70tBUnkD = 527519877;
    private static String jnxthjtris;
    private static String[] nothing_to_see_here;
    
    public PayCommand(final Economy economy, final SQLiteManager sqLiteManager, final int n) {
        final int n2 = 0x318FD0C1 ^ 0x34042F5;
        super("pay");
    Label_0086:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 1800127957: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 294323079: {}
                case 41032075: {
                    break Label_0086;
                }
            }
        }
        final int n3 = 0x6214CA52 ^ (0x1BDFC469 ^ (Integer.parseInt("65463457") ^ n));
        final int n4 = 0x5867986C ^ kktrqujfhdzdkcbe(n3, 2001332146);
        this.setPermission("donutcore.pay");
        this.setUsage("/pay <player> <amount>");
        this.economy = economy;
        this.sqLiteManager = sqLiteManager;
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        final int n = 0x1B33FD34 ^ (0x51EBE500 ^ (0x5771B5E ^ this.Uy70tBUnkD));
        Label_2075: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x233172C6 ^ n)) {
                final int n2 = 0x61D6363A ^ n;
                final Player player = (Player)commandSender;
                final int n3 = 0x53E5BB18 ^ (0x5F546D74 ^ n2);
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 130545057) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    int n4 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                        case -340249149: {
                            n4 = (0x52643C30 ^ n3);
                            break;
                        }
                        case 1924437122: {
                            n4 = (0x6145A818 ^ n3);
                            break;
                        }
                        default: {
                            throw new IOException("Error in hash");
                        }
                    }
                    final int kktrqujfhdzdkcbe = kktrqujfhdzdkcbe(n4, 1089595491);
                    if (array.length != (byte)(0x6FE2D2E9 ^ kktrqujfhdzdkcbe)) {
                        final int n5 = 0x3641C4D8 ^ kktrqujfhdzdkcbe;
                        player.sendMessage(exvbgxttlj(livbqkqvtkxgmli(), n5));
                        return (byte)(0x197657CA ^ (0x40D541F9 ^ n5)) != 0;
                    }
                    int n6 = 0x587CCA97 ^ kktrqujfhdzdkcbe;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 197294318) {
                        kktrqujfhdzdkcbe(n6, 1635610816);
                        throw new IllegalAccessException();
                    }
                Label_0295:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 1247580305: {
                                continue;
                            }
                            case 197294318: {
                                n6 ^= 0x504337B;
                            }
                            case 722080330: {
                                break Label_0295;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    final Player player2 = player.getServer().getPlayer(array[(byte)(0x329A2B07 ^ n6)]);
                    final int n7 = 0xBE5C709 ^ n6;
                    if (player2 == null) {
                        final int n8 = 0x75C9D2F2 ^ n7;
                        final String singleMessage = MessagesConfig.PLAYERNOTFOUND.getSingleMessage();
                        final int n9 = 0x3276626F ^ n8;
                        player.sendMessage(this.formatMessage$1504987598(singleMessage, player.getName(), array[(byte)(0x7EC05C93 ^ n9)], 363046963));
                        return (byte)(0x3FB381DE ^ (0x4173DD4D ^ n9)) != 0;
                    }
                    final int kktrqujfhdzdkcbe2 = kktrqujfhdzdkcbe(n7, 1135974503);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe2) == 233323329) {
                        final int n10 = 0x6C516C2C ^ kktrqujfhdzdkcbe2;
                        if ((this.sqLiteManager.getPayToggle$495579768(player2.getUniqueId(), 2083576082) ? 1 : 0) == (0x169B1845 ^ n10)) {
                            final int n11 = 0x2BF587BB ^ n10;
                            MessagesConfig.PAYMENT_DISABLED_OTHER.send((CommandSender)player);
                            return (byte)(0x67242DCE ^ (0x5A4AB230 ^ n11)) != 0;
                        }
                        final int n12 = 0xA3E84ED ^ n10;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n12) != 125879072) {
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n12)) {
                                    case 1764490707: {
                                        continue;
                                    }
                                    case 125879072: {}
                                    default: {
                                        break Label_2075;
                                    }
                                }
                            }
                            throw new IllegalAccessException();
                        }
                        int n13 = 0x2A8500BE ^ n12;
                        double amount$1046020412 = 0.0;
                        try {
                            amount$1046020412 = this.parseAmount$1046020412(array[(byte)(0x36209C17 ^ n13)], 782041907);
                            n13 ^= 0x6A9DE64C;
                        }
                        catch (final NumberFormatException ex2) {
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n13)) {
                                default: {
                                    throw new IllegalAccessException("Error in hash");
                                }
                                case -1325080399: {
                                    final int n14 = 0x12219C7F ^ kktrqujfhdzdkcbe(n13, 1280170467);
                                    player.sendMessage(MessagesConfig.INVALIDAMOUNT.getSingleMessage());
                                    return (byte)(0x37C6BFA8 ^ (0x5F8A6622 ^ n14)) != 0;
                                }
                            }
                        }
                        final int kktrqujfhdzdkcbe3 = kktrqujfhdzdkcbe(n13, 1914375137);
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe3) != 174215932) {
                                throw null;
                            }
                            throw new RuntimeException();
                        }
                        catch (final RuntimeException ex3) {
                            int n15 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(kktrqujfhdzdkcbe3)) {
                                case 2023126192: {
                                    n15 = (0x66A301A0 ^ kktrqujfhdzdkcbe3);
                                    break;
                                }
                                default: {
                                    throw new RuntimeException("Error in hash");
                                }
                                case 1966312921: {
                                    n15 = (0x4717BE8D ^ kktrqujfhdzdkcbe3);
                                    break;
                                }
                            }
                            final int n16 = 0x3743E100 ^ n15;
                            if (dcmpg(amount$1046020412, 0.0) <= (0x5EF22E36 ^ n16)) {
                                final int n17 = 0x13C86033 ^ n16;
                                player.sendMessage(MessagesConfig.INVALIDAMOUNT.getSingleMessage());
                                return (byte)(0x4D80A34E ^ (0xBAED4B ^ n17)) != 0;
                            }
                            final int kktrqujfhdzdkcbe4 = kktrqujfhdzdkcbe(n16, 1035755845);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe4) != 6806176) {
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe4)) {
                                        case 1117321268: {
                                            continue;
                                        }
                                        case 6806176: {}
                                        default: {
                                            break Label_2075;
                                        }
                                    }
                                }
                                throw new IllegalAccessException();
                            }
                            int n18 = 0x7EA1A2F7 ^ kktrqujfhdzdkcbe4;
                            if (dcmpg(this.economy.getBalance((OfflinePlayer)player), amount$1046020412) < (0x1DEFED84 ^ n18)) {
                                final int n19 = 0x47477E86 ^ n18;
                                final String singleMessage2 = MessagesConfig.DONOTHAVEENOUGH.getSingleMessage();
                                final int n20 = 0x3944A86D ^ n19;
                                player.sendMessage(this.formatMessage$1504987598(singleMessage2, player.getName(), String.valueOf(amount$1046020412), 363046963));
                                final int n21 = 0x2BB004B7 ^ n20;
                                ActionBar.sendActionBar(player, this.formatMessage$1504987598(singleMessage2, player.getName(), String.valueOf(amount$1046020412), 363046963));
                                return (byte)(0x51220376 ^ (0x197E3CAE ^ n21)) != 0;
                            }
                        Label_1283:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n18)) {
                                    case 1091698671: {
                                        continue;
                                    }
                                    case 167821760: {
                                        n18 ^= 0x586F714C;
                                    }
                                    case 1866170921: {
                                        break Label_1283;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n18) != 111766083) {
                                kktrqujfhdzdkcbe(n18, 325317748);
                                throw new IllegalAccessException();
                            }
                        Label_1359:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n18)) {
                                    case 1792783232: {
                                        continue;
                                    }
                                    case 111766083: {
                                        n18 ^= 0x2441D302;
                                    }
                                    case 1566574415: {
                                        break Label_1359;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            this.economy.withdrawPlayer((OfflinePlayer)player, amount$1046020412);
                            final int n22 = 0x3DCCD0AF ^ n18;
                            this.economy.depositPlayer((OfflinePlayer)player2, amount$1046020412);
                            final int n23 = 0x4CDA32A4 ^ n22;
                            final String singleMessage3 = MessagesConfig.PAYMENTSUCCESS.getSingleMessage();
                            final int n24 = 0x13AA6508 ^ n23;
                            player.sendMessage(this.formatMessage$1504987598(singleMessage3, player2.getName(), String.valueOf(amount$1046020412), 363046963));
                            final int n25 = 0x4ECCFE6F ^ n24;
                            ActionBar.sendActionBar(player2, this.formatMessage$1504987598(singleMessage3, player2.getName(), String.valueOf(amount$1046020412), 363046963));
                            final int n26 = 0x41B894B ^ n25;
                            final String singleMessage4 = MessagesConfig.PAYMENTREICVED.getSingleMessage();
                            final int n27 = 0x36C37B37 ^ n26;
                            player2.sendMessage(this.formatMessage$1504987598(singleMessage4, player.getName(), String.valueOf(amount$1046020412), 363046963));
                            final int n28 = 0x8A81B61 ^ n27;
                            ActionBar.sendActionBar(player2, this.formatMessage$1504987598(singleMessage4, player.getName(), String.valueOf(amount$1046020412), 363046963));
                            return (byte)(0x7B6AFBDB ^ (0xCAB2461 ^ n28)) != 0;
                        }
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe2)) {
                            case 172828396: {
                                continue;
                            }
                            case 233323329: {}
                            default: {
                                break Label_2075;
                            }
                        }
                    }
                    throw new IllegalAccessException();
                }
            }
            int kktrqujfhdzdkcbe5 = kktrqujfhdzdkcbe(n, 1431594814);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe5) == 90418421) {
                Label_2040: {
                Label_2032:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe5)) {
                            case 1330930494: {
                                continue;
                            }
                            case 90418421: {
                                break Label_2032;
                            }
                            case 464221072: {
                                break Label_2040;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    kktrqujfhdzdkcbe5 ^= 0x521568E5;
                }
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x708FC2D0 ^ (0x54FFBFCD ^ kktrqujfhdzdkcbe5)) != 0;
            }
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe5)) {
                    case 1272936794: {
                        continue;
                    }
                    case 90418421: {}
                    default: {
                        break Label_2075;
                    }
                }
            }
        }
        throw new IllegalAccessException();
    }
    
    private double parseAmount$1046020412(final String s, final int n) throws NumberFormatException {
        final int n2 = 0xC0519CB ^ (0x244471B7 ^ (0x7B7B1649 ^ (this.Uy70tBUnkD ^ n)));
        final String lowerCase = s.toLowerCase();
        final int n3 = 0x24714AB4 ^ n2;
        final char char1 = lowerCase.charAt(lowerCase.length() - (byte)(0x3548461F ^ n3));
        final int n4 = 0x3E5AB61E ^ n3;
        final String substring = lowerCase.substring((int)(byte)(0xB12F000 ^ n4), lowerCase.length() - (byte)(0xB12F001 ^ n4));
        int n5 = 0x719B70AF ^ n4;
        double double1 = 0.0;
        Label_1042: {
            Label_0865: {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(char1 ^ n5)) {
                    default: {
                        kktrqujfhdzdkcbe(n5, 1701722796);
                        return Double.parseDouble(lowerCase);
                    }
                    case 225055492: {
                        final int n6 = 0x41E79ABC ^ n5;
                        double1 = Double.parseDouble(substring) * 1.0E9;
                        final int kktrqujfhdzdkcbe = kktrqujfhdzdkcbe(0xF3B7E18 ^ n6, 1347396970);
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe) != 32748209) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        }
                        catch (final IllegalAccessException ex) {
                            int n7 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(kktrqujfhdzdkcbe)) {
                                case 906005097: {
                                    n7 = kktrqujfhdzdkcbe(kktrqujfhdzdkcbe, 1827595188);
                                    break;
                                }
                                case 550898443: {
                                    n7 = kktrqujfhdzdkcbe(kktrqujfhdzdkcbe, 775173016);
                                    break;
                                }
                                default: {
                                    throw new IOException("Error in hash");
                                }
                            }
                            kktrqujfhdzdkcbe(n7, 1787957177);
                            return double1;
                        }
                    }
                    case 225055521: {
                        final int kktrqujfhdzdkcbe2 = kktrqujfhdzdkcbe(n5, 55784937);
                        double1 = Double.parseDouble(substring) * 1.0E12;
                        final int n8 = 0x10EC0775 ^ (0x29C12E1E ^ kktrqujfhdzdkcbe2);
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8) != 232783456) {
                                throw null;
                            }
                            throw new IOException();
                        }
                        catch (final IOException ex2) {
                            int n9 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n8)) {
                                case -1010634008: {
                                    n9 = (0x688A4D6F ^ n8);
                                    break;
                                }
                                default: {
                                    throw new IOException("Error in hash");
                                }
                                case 129818986: {
                                    n9 = (0x30058F1F ^ n8);
                                    break;
                                }
                            }
                        Label_0564:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                    case 748228216: {
                                        continue;
                                    }
                                    case 181761474: {
                                        break Label_0564;
                                    }
                                    default: {
                                        break Label_0865;
                                    }
                                    case 103785019: {
                                        break Label_1042;
                                    }
                                }
                            }
                            return double1;
                        }
                    }
                    case 225055730: {
                        Label_0632: {
                        Label_0624:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                                    case 476213509: {
                                        continue;
                                    }
                                    case 225055706: {
                                        break Label_0624;
                                    }
                                    case 792101373: {
                                        break Label_0632;
                                    }
                                    default: {
                                        break Label_0865;
                                    }
                                }
                            }
                            n5 ^= 0x68E561BF;
                        }
                        double1 = Double.parseDouble(substring) * 1000.0;
                        int n10 = 0x1CAE3A34 ^ n5;
                        Label_0724: {
                        Label_0716:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                    case 16674021: {
                                        continue;
                                    }
                                    case 211387991: {
                                        break Label_0716;
                                    }
                                    case 1142478613: {
                                        break Label_0724;
                                    }
                                    default: {
                                        break Label_0865;
                                    }
                                }
                            }
                            n10 ^= 0x4152C5C1;
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10) != 170357835) {
                                    throw null;
                                }
                                throw new IllegalAccessException();
                            }
                            catch (final IllegalAccessException ex3) {
                                int kktrqujfhdzdkcbe3 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n10)) {
                                    case 2088826666: {
                                        kktrqujfhdzdkcbe3 = kktrqujfhdzdkcbe(n10, 1594939260);
                                        break;
                                    }
                                    case 2066108345: {
                                        kktrqujfhdzdkcbe3 = (0x3FE4006E ^ n10);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                }
                            Label_0844:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kktrqujfhdzdkcbe3)) {
                                        case 1228095311: {
                                            continue;
                                        }
                                        case 268015128: {
                                            break Label_0844;
                                        }
                                        default: {
                                            break Label_0865;
                                        }
                                        case 1590327589: {
                                            break Label_1042;
                                        }
                                    }
                                }
                                return double1;
                            }
                        }
                        break;
                    }
                    case 225055742: {
                        final int n11 = 0x5F5500D9 ^ n5;
                        double1 = Double.parseDouble(substring) * 1000000.0;
                        final int n12 = 0x52924480 ^ (0x7F88789A ^ n11);
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n12) != 16844247) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        }
                        catch (final IllegalAccessException ex4) {
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n12)) {
                                default: {
                                    throw new RuntimeException("Error in hash");
                                }
                                case 4112872: {
                                    kktrqujfhdzdkcbe(n12, 439030971);
                                    break;
                                }
                                case 1177936736: {
                                    break;
                                }
                            }
                            return double1;
                        }
                        return Double.parseDouble(lowerCase);
                    }
                }
            }
            throw new RuntimeException();
            double1 = Double.parseDouble(lowerCase);
        }
        return double1;
    }
    
    private String formatMessage$1504987598(final String s, final String s2, final String s3, final int n) {
        final int n2 = 0x18128590 ^ (0x64C822CE ^ (0x3987E13A ^ (this.Uy70tBUnkD ^ n)));
        return s.replace((CharSequence)exvbgxttlj(msxdhugvwshnjdt(), n2), (CharSequence)s2).replace((CharSequence)exvbgxttlj(ohsnngtnwfrvtmj(), n2), (CharSequence)s3);
    }
    
    static {
        (PayCommand.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        PayCommand.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        PayCommand.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        PayCommand.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        PayCommand.jnxthjtris = ByteBuffer.wrap(gmczepehuiyycve()).asCharBuffer().toString();
        PayCommand.FBtUd90MAp = (0xFD1ACF35 ^ new Random(-5132076102418261078L).nextInt());
    }
    
    public static String exvbgxttlj(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = PayCommand.jnxthjtris.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] livbqkqvtkxgmli() {
        return new byte[] { 0, 0, 0, 22, 0, 0, 0, 0 };
    }
    
    private static byte[] msxdhugvwshnjdt() {
        return new byte[] { 0, 0, 0, 8, 0, 0, 0, 22 };
    }
    
    private static byte[] ohsnngtnwfrvtmj() {
        return new byte[] { 0, 0, 0, 8, 0, 0, 0, 30 };
    }
    
    private static byte[] gmczepehuiyycve() {
        return new byte[] { 49, 26, 48, 67, 56, 87, 48, 75, 55, 21, 49, 9, 48, 67, 56, 90, 48, 83, 55, 76, 49, 80, 48, 65, 56, 8, 48, 18, 55, 9, 49, 84, 48, 94, 56, 89, 48, 71, 55, 91, 49, 65, 48, 13, 49, 21, 49, 66, 57, 90, 53, 82, 55, 72, 49, 85, 49, 64, 57, 19, 49, 21, 49, 83, 57, 91, 53, 92, 55, 68, 49, 94, 49, 70, 57, 19 };
    }
    
    private static int kktrqujfhdzdkcbe(final int n, final int n2) {
        return n2 ^ n;
    }
}
