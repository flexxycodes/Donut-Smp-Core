package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import java.io.IOException;
import dev.daniboy.donutcore.config.MessagesConfig;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.database.SQLiteManager;
import org.bukkit.command.Command;

public class PayToggleCommand extends Command
{
    private final SQLiteManager sqLiteManager;
    private static int DJrVbvGjVk = 0;
    private transient int rj6r5cLiYX = 927140549;
    private static String bwgmxefmeo;
    private static String[] nothing_to_see_here;
    
    public PayToggleCommand(final SQLiteManager sqLiteManager, final int n) {
        super("paytoggle");
        final int n2 = 0xE094220 ^ (0x21334AD0 ^ (Integer.parseInt("1698256933") ^ n));
        final int n3 = 0x582D404 ^ qzlzbwvlotljvobx(n2, 971949187);
        this.setPermission("donutcore.paytoggle");
        this.setUsage("paytoggle");
        this.sqLiteManager = sqLiteManager;
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        final int n = 0x262630B ^ (0x2714DB01 ^ (0x72C894FD ^ this.rj6r5cLiYX));
        Label_0786: {
            if (((commandSender instanceof Player) ? 1 : 0) == (0x4C9FD2F8 ^ n)) {
                final int n2 = 0x3E0EF756 ^ n;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2) != 234441616) {
                    break Label_0786;
                }
                final int qzlzbwvlotljvobx = qzlzbwvlotljvobx(n2, 1551300353);
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x69E7FFFB ^ (0x47002D54 ^ qzlzbwvlotljvobx)) != 0;
            }
            final int n3 = 0x489F8BD9 ^ n;
            final Player player = (Player)commandSender;
            final int qzlzbwvlotljvobx2 = qzlzbwvlotljvobx(0x19D33FCA ^ n3, 1586957520);
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qzlzbwvlotljvobx2) != 39112342) {
                    throw null;
                }
                throw new RuntimeException();
            }
            catch (final RuntimeException ex) {
                int qzlzbwvlotljvobx3 = 0;
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(qzlzbwvlotljvobx2)) {
                    default: {
                        throw new IOException("Error in hash");
                    }
                    case -821948933: {
                        qzlzbwvlotljvobx3 = qzlzbwvlotljvobx(qzlzbwvlotljvobx2, 38013241);
                        break;
                    }
                    case 438522330: {
                        qzlzbwvlotljvobx3 = (0x38E022BD ^ qzlzbwvlotljvobx2);
                        break;
                    }
                }
                final int qzlzbwvlotljvobx4 = qzlzbwvlotljvobx(qzlzbwvlotljvobx3, 109035308);
                final boolean payToggle$495579768 = this.sqLiteManager.getPayToggle$495579768(player.getUniqueId(), 2083576082);
                int n4 = 0x698A33FF ^ qzlzbwvlotljvobx4;
                byte b = 0;
                int qzlzbwvlotljvobx6 = 0;
                Label_0521: {
                    int qzlzbwvlotljvobx7;
                    if ((payToggle$495579768 ? 1 : 0) == (0x1451C455 ^ n4)) {
                        final int n5 = 0x1639D23B ^ n4;
                        b = (byte)(0x268166F ^ n5);
                        final int n6 = 0x48A265A7 ^ n5;
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 15207071) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        }
                        catch (final IllegalAccessException ex2) {
                            int qzlzbwvlotljvobx5 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n6)) {
                                default: {
                                    throw new RuntimeException("Error in hash");
                                }
                                case 1448320586: {
                                    qzlzbwvlotljvobx5 = (0x6C1D4754 ^ n6);
                                    break;
                                }
                                case 751870322: {
                                    qzlzbwvlotljvobx5 = qzlzbwvlotljvobx(n6, 1665999027);
                                    break;
                                }
                            }
                            qzlzbwvlotljvobx6 = qzlzbwvlotljvobx(qzlzbwvlotljvobx5, 34705304);
                            break Label_0521;
                        }
                    }
                    else {
                        Label_0375: {
                        Label_0368:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                                    case 2105027115: {
                                        continue;
                                    }
                                    case 123631669: {
                                        break Label_0368;
                                    }
                                    case 1153308495: {
                                        break Label_0375;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            n4 ^= 0x6244FB92;
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 80305540) {
                            throw new RuntimeException();
                        }
                        qzlzbwvlotljvobx7 = qzlzbwvlotljvobx(n4, 939484570);
                    }
                    b = (byte)(0x41EA5A5D ^ qzlzbwvlotljvobx7);
                    qzlzbwvlotljvobx6 = (0x652CE158 ^ qzlzbwvlotljvobx7);
                }
                final byte b2 = b;
                final int n7 = 0x17455462 ^ qzlzbwvlotljvobx6;
                this.sqLiteManager.setPayToggle$1965917752(player.getUniqueId(), (boolean)(b2 != 0), 583043106);
                final int n8 = 0x2DAA2DB4 ^ n7;
                if (b2 != (0x1E29C2D3 ^ n8)) {
                    int n9 = 0x1700E57B ^ n8;
                    MessagesConfig.PAYMENT_ENABLED.send((CommandSender)player);
                    Label_0667: {
                    Label_0660:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9)) {
                                case 271788881: {
                                    continue;
                                }
                                case 29341180: {
                                    break Label_0660;
                                }
                                case 1371257000: {
                                    break Label_0667;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        n9 ^= 0xB67B032;
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 36285550) {
                                throw null;
                            }
                            throw new RuntimeException();
                        }
                        catch (final RuntimeException ex3) {
                            int n10 = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n9)) {
                                default: {
                                    throw new RuntimeException("Error in hash");
                                }
                                case -563597103: {
                                    n10 = (0x157928EB ^ n9);
                                    break;
                                }
                                case 309640400: {
                                    n10 = (0x2CFAB96B ^ n9);
                                    break;
                                }
                            }
                            final int qzlzbwvlotljvobx8 = qzlzbwvlotljvobx(n10, 792982418);
                            return (byte)(0x1F7DD62 ^ qzlzbwvlotljvobx8) != 0;
                        }
                    }
                }
                final int n11 = 0x20BE27B6 ^ n8;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n11) != 155611876) {
                    qzlzbwvlotljvobx(n11, 1850088278);
                    throw new RuntimeException();
                }
                final int qzlzbwvlotljvobx9 = qzlzbwvlotljvobx(n11, 1325923497);
                MessagesConfig.PAYMENT_DISABLED.send((CommandSender)player);
                final int qzlzbwvlotljvobx8 = 0x7067C4AF ^ qzlzbwvlotljvobx9;
                return (byte)(0x1F7DD62 ^ qzlzbwvlotljvobx8) != 0;
                throw new RuntimeException();
            }
        }
    }
    
    static {
        (PayToggleCommand.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        PayToggleCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
        PayToggleCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
        PayToggleCommand.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        PayToggleCommand.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
        PayToggleCommand.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        PayToggleCommand.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
        PayToggleCommand.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
        PayToggleCommand.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        PayToggleCommand.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
        PayToggleCommand.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
        PayToggleCommand.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
        PayToggleCommand.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
        PayToggleCommand.bwgmxefmeo = ByteBuffer.wrap(xqjzeodrvuttdor()).asCharBuffer().toString();
        PayToggleCommand.DJrVbvGjVk = (0x705D6B9 ^ new Random(3891028569673267625L).nextInt());
    }
    
    public static String axipdqxejl(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = PayToggleCommand.bwgmxefmeo.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] xqjzeodrvuttdor() {
        return new byte[0];
    }
    
    private static int qzlzbwvlotljvobx(final int n, final int n2) {
        return n2 ^ n;
    }
}
