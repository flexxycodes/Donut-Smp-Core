package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import java.io.IOException;
import dev.daniboy.donutcore.utils.Hex;
import dev.daniboy.donutcore.config.MainConfig;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class MessageToggleCommand extends Command
{
    private final DonutCore plugin;
    private final SQLiteManager sqLiteManager;
    private static int sixzIvU4wy = 0;
    private transient int 5Vpu6xQwsB = 676095140;
    private static byte[] jntngkeaof;
    private static String[] nothing_to_see_here;
    
    public MessageToggleCommand(final DonutCore plugin, final SQLiteManager sqLiteManager, final int n) {
        super("msgtoggle");
        final int n2 = 0x5FED3BF2 ^ (0x4E1A2E25 ^ (Integer.parseInt("305192820") ^ n));
        final int n3 = 0x4D8C1190 ^ nedheesbkpfwdilz(n2, 1852486218);
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
        this.setDescription("Toggle message reception");
        this.setUsage("/msgtoggle");
        this.setPermission("donutcore.msgtoggle");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        final int n = 0x70EB046B ^ (0x1554A6A8 ^ (0x5FF9AACF ^ this.5Vpu6xQwsB));
        if (((commandSender instanceof Player) ? 1 : 0) != (0xC56C831 ^ n)) {
            final int n2 = 0x4B83C5AB ^ n;
            final Player player = (Player)commandSender;
            int n3 = 0x280DC6E5 ^ n2;
            Label_0247: {
            Label_0240:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 473930034: {
                            continue;
                        }
                        case 146040222: {
                            break Label_0240;
                        }
                        case 372585199: {
                            break Label_0247;
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
                n3 ^= 0x4BC3160D;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 99997975) {
                        throw null;
                    }
                    throw new RuntimeException();
                }
                catch (final RuntimeException ex) {
                    int nedheesbkpfwdilz = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                        case -693319630: {
                            nedheesbkpfwdilz = (0x2F45451F ^ n3);
                            break;
                        }
                        case 551480209: {
                            nedheesbkpfwdilz = nedheesbkpfwdilz(n3, 1368064363);
                            break;
                        }
                        default: {
                            throw new RuntimeException("Error in hash");
                        }
                    }
                Label_0375:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(nedheesbkpfwdilz)) {
                            case 2044379565: {
                                continue;
                            }
                            case 63496160: {
                                nedheesbkpfwdilz ^= 0x78D40EB0;
                            }
                            case 1203710009: {
                                break Label_0375;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    if ((player.hasPermission(pultcdtzlr(sobzfkzaimdjnno(), nedheesbkpfwdilz)) ? 1 : 0) == (0xD44D2A9 ^ nedheesbkpfwdilz)) {
                        final int n4 = 0x94705A5 ^ nedheesbkpfwdilz;
                        MessagesConfig.NOPERMISSION.send((CommandSender)player);
                        final int n5 = 0x3D2B1D60 ^ n4;
                        SoundConfig.NOPERMISSION.play(player);
                        return (byte)(0x2BF24F42 ^ (0x12DA852F ^ n5)) != 0;
                    }
                    final int nedheesbkpfwdilz2 = nedheesbkpfwdilz(nedheesbkpfwdilz, 1557369816);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(nedheesbkpfwdilz2) == 236281693) {
                        final int n6 = 0x48182FF6 ^ nedheesbkpfwdilz2;
                        final UUID uniqueId = player.getUniqueId();
                        final int n7 = 0x4727EDA ^ n6;
                        int n11;
                        if ((this.sqLiteManager.getMessageToggle$1388376138(uniqueId, 884977015) ? 1 : 0) == (0x1DFD105D ^ n7)) {
                            final int n8 = 0x1870F62F ^ n7;
                            this.sqLiteManager.setMessageToggle$521809991(uniqueId, (boolean)((byte)(0x58DE673 ^ n8) != 0), 772013593);
                            final int n9 = 0x7AF98609 ^ n8;
                            player.sendMessage(Hex.hex(MainConfig.Chat.MSG_TOGGLE_ON));
                            final int nedheesbkpfwdilz3 = nedheesbkpfwdilz(n9, 1148291247);
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(nedheesbkpfwdilz3) != 39536671) {
                                    throw null;
                                }
                                throw new IOException();
                            }
                            catch (final IOException ex2) {
                                int n10 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(nedheesbkpfwdilz3)) {
                                    default: {
                                        throw new RuntimeException("Error in hash");
                                    }
                                    case -667990367: {
                                        n10 = (0x4E2F7FE ^ nedheesbkpfwdilz3);
                                        break;
                                    }
                                    case 1969035976: {
                                        n10 = (0x314CBC73 ^ nedheesbkpfwdilz3);
                                        break;
                                    }
                                }
                            Label_0812:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                        case 1260015540: {
                                            continue;
                                        }
                                        case 198177670: {
                                            break Label_0812;
                                        }
                                        case 1310989828: {
                                            return (byte)(0x6DF23B8F ^ n10) != 0;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                n10 ^= 0x521524A4;
                                return (byte)(0x6DF23B8F ^ n10) != 0;
                            }
                        }
                        else {
                            final int nedheesbkpfwdilz4 = nedheesbkpfwdilz(n7, 1564442009);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(nedheesbkpfwdilz4) != 226030697) {
                                throw new RuntimeException();
                            }
                            n11 = (0x2A442DFA ^ nedheesbkpfwdilz4);
                        }
                        this.sqLiteManager.setMessageToggle$521809991(uniqueId, (boolean)((byte)(0x6A86403E ^ n11) != 0), 772013593);
                        final int n12 = 0x7E63B29 ^ n11;
                        player.sendMessage(Hex.hex(MainConfig.Chat.MSG_TOGGLE_OFF));
                        int n10 = 0x924099 ^ n12;
                        return (byte)(0x6DF23B8F ^ n10) != 0;
                    }
                    nedheesbkpfwdilz(nedheesbkpfwdilz2, 838380146);
                }
            }
            throw new RuntimeException();
        }
        int nedheesbkpfwdilz5 = nedheesbkpfwdilz(n, 1067551998);
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(nedheesbkpfwdilz5) == 78587558) {
            Label_0147: {
            Label_0140:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(nedheesbkpfwdilz5)) {
                        case 1164504738: {
                            continue;
                        }
                        case 78587558: {
                            break Label_0140;
                        }
                        case 232267390: {
                            break Label_0147;
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
                nedheesbkpfwdilz5 ^= 0x496CC6C1;
            }
            MessagesConfig.ONLYPLAYERS.send(commandSender);
            return (byte)(0x1CADEADF ^ (0x663668D0 ^ nedheesbkpfwdilz5)) != 0;
        }
        nedheesbkpfwdilz(nedheesbkpfwdilz5, 1402515404);
        throw new RuntimeException();
    }
    
    static {
        (MessageToggleCommand.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        MessageToggleCommand.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        MessageToggleCommand.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        MessageToggleCommand.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        MessageToggleCommand.jntngkeaof = jopgjyudbyqffly();
        MessageToggleCommand.sixzIvU4wy = (0xB1F40B35 ^ new Random(7602220647211447496L).nextInt());
    }
    
    public static String pultcdtzlr(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= MessageToggleCommand.jntngkeaof[i % MessageToggleCommand.jntngkeaof.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] jopgjyudbyqffly() {
        return new byte[] { 66, 13, 122, 1, 110, 64, 18, 31, 41, 103, 25, 66, 63, 41, 60, 47, 102, 60, 100, 67, 79, 7, 78, 126, 61, 65, 118, 75, 119, 33, 65, 114, 72, 56, 81, 25, 62, 59, 1, 99, 112, 56, 126, 103, 48, 13, 127, 114, 84, 21, 80, 15, 10, 24, 50, 17, 123, 74 };
    }
    
    private static byte[] sobzfkzaimdjnno() {
        return new byte[] { -114, -64, 72, 83, 95, 27, 35, 73, 28, 32, 43, 4, 9, 123, 8, 113, 94, 123, 86, 20, 125, 31, 127, 39, 12, 10, 67, 30, 69, 103, 119, 44, 124, 110, 105, 75, 12, 101, 51, 48 };
    }
    
    private static int nedheesbkpfwdilz(final int n, final int n2) {
        return n ^ n2;
    }
}
