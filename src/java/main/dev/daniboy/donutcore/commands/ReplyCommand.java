package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.utils.Hex;
import dev.daniboy.donutcore.config.MainConfig;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.CommandExecutor;

public class ReplyCommand implements CommandExecutor
{
    private final DonutCore plugin;
    private final SQLiteManager sqLiteManager;
    private static int gwOMOWbycm = 0;
    private transient int NEheJluVMw = 1795574256;
    private static String[] nothing_to_see_here;
    
    public ReplyCommand(final DonutCore plugin, final SQLiteManager sqLiteManager, final int n) {
        final int n2 = 0x3781BD7A ^ (0x9D64339 ^ (Integer.parseInt("71824652") ^ n));
        final int n3 = 0x3C5F3363 ^ vhawimlcyuohboxf(n2, 159582654);
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
    }
    
    public boolean onCommand(final CommandSender commandSender, final Command command, final String s, final String[] array) {
        final int n = 0x32FEE282 ^ (0xA54D8CA ^ (0x755962C6 ^ this.NEheJluVMw));
        Label_1696: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x7539BFFB ^ n)) {
                final int n2 = 0x5FB2E060 ^ n;
                final Player player = (Player)commandSender;
                final int n3 = 0x1CF318C5 ^ (0x77B919CA ^ n2);
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 258402047) {
                        throw null;
                    }
                    throw new RuntimeException();
                }
                catch (final RuntimeException ex) {
                    int n4 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                        case -2097879064: {
                            n4 = (0x2657A86F ^ n3);
                            break;
                        }
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case 235599010: {
                            n4 = (0x77C86A06 ^ n3);
                            break;
                        }
                    }
                Label_0207:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 5283144: {
                                continue;
                            }
                            case 145875923: {
                                n4 ^= 0x220543F3;
                            }
                            case 498623442: {
                                break Label_0207;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    if ((player.hasPermission(vdbmlcxfna(lbjhmimttxayqje(), dalabsrwxkdurzu(), n4)) ? 1 : 0) == (0x140C7761 ^ n4)) {
                        final int n5 = 0x70649E4B ^ n4;
                        MessagesConfig.NOPERMISSION.send((CommandSender)player);
                        final int n6 = 0x23294396 ^ n5;
                        SoundConfig.NOPERMISSION.play(player);
                        return (byte)(0x4E769637 ^ (0x9373C8A ^ n6)) != 0;
                    }
                    final int n7 = 0x1232C0B4 ^ n4;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 98224745) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                case 837442493: {
                                    continue;
                                }
                                case 98224745: {}
                                default: {
                                    break Label_1696;
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    final int vhawimlcyuohboxf = vhawimlcyuohboxf(n7, 483670661);
                    if (array.length < (byte)(0x1AEA8D51 ^ vhawimlcyuohboxf)) {
                        final int n8 = 0xD596A0F ^ vhawimlcyuohboxf;
                        commandSender.sendMessage(vdbmlcxfna(tbxhioagcenwehj(), dalabsrwxkdurzu(), n8));
                        return (byte)(0x5A199312 ^ (0x4DAA744C ^ n8)) != 0;
                    }
                    int n9 = 0x3164EEE9 ^ vhawimlcyuohboxf;
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 73648824) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                case 1869485720: {
                                    continue;
                                }
                                case 73648824: {}
                                default: {
                                    break Label_1696;
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                Label_0539:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                            case 1237845539: {
                                continue;
                            }
                            case 73648824: {
                                n9 ^= 0x1B7A40DF;
                            }
                            case 1478480931: {
                                break Label_0539;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    final Player player2 = (Player)this.plugin.getLastMessaged$1938418975().get((Object)player);
                    final int n10 = 0x2EA835F8 ^ n9;
                    int n12;
                    if (player2 != null) {
                        int n11 = 0x19DF15B0 ^ n10;
                        if ((player2.isOnline() ? 1 : 0) == (0x783032E ^ n11)) {
                            n12 = (0x649225 ^ n11);
                        }
                        else {
                        Label_0755:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11)) {
                                    case 385505482: {
                                        continue;
                                    }
                                    case 118150520: {
                                        n11 ^= 0x2D6A0265;
                                    }
                                    case 1719810545: {
                                        break Label_0755;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11) != 52648040) {
                                throw new RuntimeException();
                            }
                        Label_0831:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11)) {
                                    case 1086339379: {
                                        continue;
                                    }
                                    case 52648040: {
                                        n11 ^= 0x3BDEAE02;
                                    }
                                    case 1399730909: {
                                        break Label_0831;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            if ((this.sqLiteManager.getMessageToggle$1388376138(player2.getUniqueId(), 884977015) ? 1 : 0) == (0x1137AF49 ^ n11)) {
                                final int n13 = 0x6B5554E5 ^ n11;
                                MessagesConfig.MESSAGEDISABLED.send(commandSender);
                                return (byte)(0x30138844 ^ (0x4A7173E9 ^ n13)) != 0;
                            }
                            int vhawimlcyuohboxf2 = vhawimlcyuohboxf(n11, 2121772652);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhawimlcyuohboxf2) != 126643575) {
                                throw new RuntimeException();
                            }
                        Label_0999:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhawimlcyuohboxf2)) {
                                    case 1729419340: {
                                        continue;
                                    }
                                    case 126643575: {
                                        vhawimlcyuohboxf2 ^= 0x5BD39355;
                                    }
                                    case 445329428: {
                                        break Label_0999;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            final String join = String.join((CharSequence)vdbmlcxfna(jbjxjsexpgxwicv(), dalabsrwxkdurzu(), vhawimlcyuohboxf2), (CharSequence[])array);
                            final int n14 = 0x43C03C53 ^ vhawimlcyuohboxf2;
                            final String reply_FORMAT = MainConfig.Chat.REPLY_FORMAT;
                            final String vdbmlcxfna = vdbmlcxfna(glekwnxpkagfobb(), dalabsrwxkdurzu(), n14);
                            final Player player3 = player;
                            final int n15 = 0x52B5617B ^ n14;
                            final String replace = reply_FORMAT.replace((CharSequence)vdbmlcxfna, (CharSequence)player3.getName());
                            final String vdbmlcxfna2 = vdbmlcxfna(ecsjlggvmqymzeq(), dalabsrwxkdurzu(), n15);
                            final Player player4 = player2;
                            final int n16 = 0x2C115513 ^ n15;
                            final String replace2 = replace.replace((CharSequence)vdbmlcxfna2, (CharSequence)player4.getName());
                            final String vdbmlcxfna3 = vdbmlcxfna(vqrdyouajdetefl(), dalabsrwxkdurzu(), n16);
                            final CharSequence charSequence = (CharSequence)join;
                            final int n17 = 0x1B4582C3 ^ n16;
                            final String replace3 = replace2.replace((CharSequence)vdbmlcxfna3, charSequence);
                            final int n18 = 0x7D9265A7 ^ n17;
                            final String hex = Hex.hex(replace3);
                            final int n19 = 0x7D571B31 ^ n18;
                            final String reply_SENT = MainConfig.Chat.REPLY_SENT;
                            final String vdbmlcxfna4 = vdbmlcxfna(thapfyajywgierx(), dalabsrwxkdurzu(), n19);
                            final Player player5 = player;
                            final int n20 = 0x6D428095 ^ n19;
                            final String replace4 = reply_SENT.replace((CharSequence)vdbmlcxfna4, (CharSequence)player5.getName());
                            final String vdbmlcxfna5 = vdbmlcxfna(wqmvxcogzjopazf(), dalabsrwxkdurzu(), n20);
                            final Player player6 = player2;
                            final int n21 = 0x2D1D2C7C ^ n20;
                            final String replace5 = replace4.replace((CharSequence)vdbmlcxfna5, (CharSequence)player6.getName());
                            final String vdbmlcxfna6 = vdbmlcxfna(rwjblldgrmjnnxa(), dalabsrwxkdurzu(), n21);
                            final CharSequence charSequence2 = (CharSequence)join;
                            final int n22 = 0x1EAEA644 ^ n21;
                            final String replace6 = replace5.replace((CharSequence)vdbmlcxfna6, charSequence2);
                            final int n23 = 0x758C11DD ^ n22;
                            final String hex2 = Hex.hex(replace6);
                            final int n24 = 0x3FFEA673 ^ n23;
                            player2.sendMessage(hex);
                            final int n25 = 0x1A834626 ^ n24;
                            player.sendMessage(hex2);
                            final int n26 = 0x6D7829E8 ^ n25;
                            this.plugin.getLastMessaged$1938418975().put((Object)player2, (Object)player);
                            return (byte)(0x774BA462 ^ (0x64410B0 ^ n26)) != 0;
                        }
                    }
                    else {
                        final int n27 = 0x30DD46FD ^ n10;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n27) != 169518398) {
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n27)) {
                                    case 611199747: {
                                        continue;
                                    }
                                    case 169518398: {}
                                    default: {
                                        break Label_1696;
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                        n12 = (0x2966C168 ^ n27);
                    }
                    MessagesConfig.NOMESSAGEREICIVED.send(commandSender);
                    return (byte)(0x7E45A262 ^ (0x79A23368 ^ n12)) != 0;
                }
            }
            final int n28 = 0x2D5239F ^ n;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 140122349) {
                final int vhawimlcyuohboxf3 = vhawimlcyuohboxf(n28, 1094062192);
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x22555531 ^ (0x148FD924 ^ vhawimlcyuohboxf3)) != 0;
            }
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28)) {
                    case 1468057587: {
                        continue;
                    }
                    case 140122349: {}
                    default: {
                        break Label_1696;
                    }
                }
            }
        }
        throw new RuntimeException();
    }
    
    static {
        (ReplyCommand.nothing_to_see_here = new String[18])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        ReplyCommand.gwOMOWbycm = (0x9F198F65 ^ new Random(-3443188960377013066L).nextInt());
    }
    
    public static String vdbmlcxfna(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] dalabsrwxkdurzu() {
        return new byte[] { 33, 94, 102, 81, 52, 98, 112, 19, 71, 82, 55, 72, 99, 77, 86, 6, 49, 81, 59, 1, 77, 45, 35, 44, 119, 30, 117, 96, 20, 56, 68, 124, 16, 66, 32, 28, 95, 96, 18, 86, 19, 94, 36, 44, 64, 57, 101, 77, 121, 101, 119, 24, 123, 69, 30, 38, 21, 68, 33, 36, 7, 33, 76, 30, 31, 2, 37, 127, 50, 37, 55, 40, 85, 35, 122, 30, 18, 3, 71, 84, 93, 16, 118, 109, 77, 110, 59, 48, 119, 43, 99, 7, 15, 8, 117, 19, 50, 35, 76, 50, 98, 34, 79, 9, 55, 32, 120, 35, 4, 95, 84, 112, 12 };
    }
    
    private static byte[] ecsjlggvmqymzeq() {
        return new byte[] { -23, -110, 83, 76, 12, 35, 67, 67, 117, 7, 4, 24, 91, 28, 101, 67, 4, 6, 13, 64, 120, 48 };
    }
    
    private static byte[] glekwnxpkagfobb() {
        return new byte[] { -19, -111, 86, 69, 13, 38, 66, 65, 112, 13, 5, 28, 83, 25, 111, 67, 3, 67 };
    }
    
    private static byte[] vqrdyouajdetefl() {
        return new byte[] { -18, -105, 81, 70, 6, 62, 72, 69, 114, 16, 1, 12, 81, 30, 103, 89, 2, 1, 10, 18 };
    }
    
    private static byte[] rwjblldgrmjnnxa() {
        return new byte[] { -18, -110, 81, 76, 0, 63, 69, 71, 118, 16, 6, 8, 84, 20, 98, 81, 4, 5, 10, 21 };
    }
    
    private static byte[] jbjxjsexpgxwicv() {
        return new byte[] { -25, -103, 84, 65 };
    }
    
    private static byte[] thapfyajywgierx() {
        return new byte[] { -20, -111, 95, 76, 5, 37, 72, 71, 115, 15, 7, 21, 91, 25, 98, 76, 0, 64 };
    }
    
    private static byte[] wqmvxcogzjopazf() {
        return new byte[] { -19, -112, 85, 64, 6, 35, 72, 78, 114, 8, 5, 28, 80, 16, 100, 67, 9, 12, 14, 74, 127, 57 };
    }
    
    private static byte[] tbxhioagcenwehj() {
        return new byte[] { -20, -104, 81, 50, 2, 39, 65, 70, 116, 6, 14, 26, 85, 65, 96, 23, 5, 77, 8, 74, 122, 126, 21, 106, 70, 70, 70, 42, 45, 47, 114, 118, 38, 30, 20, 74, 108, 42, 37, 19, 37, 9, 21, 127, 115, 111, 92, 68 };
    }
    
    private static byte[] lbjhmimttxayqje() {
        return new byte[] { -20, -110, 80, 6, 2, 60, 67, 76, 116, 20, 4, 10, 80, 24, 103, 90, 0, 16, 8, 87, 123, 48, 21, 111, 68, 74, 70, 35, 39, 98, 119, 51 };
    }
    
    private static int vhawimlcyuohboxf(final int n, final int n2) {
        return n2 ^ n;
    }
}
