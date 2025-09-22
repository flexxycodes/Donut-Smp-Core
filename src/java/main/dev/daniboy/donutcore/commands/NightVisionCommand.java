package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import org.bukkit.potion.PotionEffect;
import dev.daniboy.donutcore.utils.Hex;
import org.bukkit.potion.PotionEffectType;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import java.io.IOException;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class NightVisionCommand extends Command
{
    private final DonutCore plugin;
    private static int Zi3DnHoDaK = 0;
    private transient int eZbe9Fy4AK = 642422450;
    private static String xamjwglydp;
    private static String[] nothing_to_see_here;
    
    public NightVisionCommand(final DonutCore plugin, final int n) {
        final int n2 = 0x508A3327 ^ 0x179823E4;
        super("nightvision");
        ztvggdxyidsgztyi(n2, 433302722);
        int n3 = 0x67E0984 ^ (0x13B30130 ^ (Integer.parseInt("1748599925") ^ n));
    Label_0118:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                case 254475638: {
                    continue;
                }
                default: {
                    throw new IllegalAccessException();
                }
                case 1120140037: {
                    break Label_0118;
                }
                case 127337088: {
                    n3 ^= 0x14D35E60;
                    break Label_0118;
                }
            }
        }
        this.plugin = plugin;
        this.setDescription("Toggle night vision");
        this.setUsage("/nightvision");
        this.setPermission("donutcore.nightvision");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        int n = 0x3F8AF14F ^ (0x306CBECF ^ (0x1A6C6A6D ^ this.eZbe9Fy4AK));
        if (((commandSender instanceof Player) ? 1 : 0) != (0x660F2572 ^ n)) {
            final int n2 = 0x41C47CBB ^ n;
            final Player player = (Player)commandSender;
            final int ztvggdxyidsgztyi = ztvggdxyidsgztyi(0x3BC95FEC ^ n2, 1705335144);
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(ztvggdxyidsgztyi) != 196358402) {
                    throw null;
                }
                throw new IOException();
            }
            catch (final IOException ex) {
                int ztvggdxyidsgztyi2 = 0;
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(ztvggdxyidsgztyi)) {
                    default: {
                        throw new RuntimeException("Error in hash");
                    }
                    case 1873504464: {
                        ztvggdxyidsgztyi2 = ztvggdxyidsgztyi(ztvggdxyidsgztyi, 2124394970);
                        break;
                    }
                    case -851772821: {
                        ztvggdxyidsgztyi2 = (0xACD838D ^ ztvggdxyidsgztyi);
                        break;
                    }
                }
                int n3 = 0x396D82DD ^ ztvggdxyidsgztyi2;
                if ((player.hasPermission(vmhsubgvoz(nzapelthhoaspad(), n3)) ? 1 : 0) == (0x4A075E1D ^ n3)) {
                    final int n4 = 0x6322D519 ^ n3;
                    MessagesConfig.NOPERMISSION.send((CommandSender)player);
                    final int n5 = 0x3341A1F ^ n4;
                    SoundConfig.NOPERMISSION.play(player);
                    return (byte)(0x3712B043 ^ (0x1D032159 ^ n5)) != 0;
                }
            Label_0439:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 1837325150: {
                            continue;
                        }
                        case 258870367: {
                            n3 ^= 0x262229BA;
                        }
                        case 2071909702: {
                            break Label_0439;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) == 25754614) {
                Label_0507:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 2080833764: {
                                continue;
                            }
                            case 25754614: {
                                n3 ^= 0x699743AF;
                            }
                            case 1258628518: {
                                break Label_0507;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    if ((player.hasPotionEffect(PotionEffectType.NIGHT_VISION) ? 1 : 0) != (0x5B23408 ^ n3)) {
                        final int n6 = 0x624A7D87 ^ n3;
                        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                        int n7 = 0x4EAE6836 ^ n6;
                        player.sendMessage(Hex.hex(vmhsubgvoz(nebyzdiyscghopt(), n7)));
                        Label_0655: {
                        Block_10:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                    case 1177492176: {
                                        continue;
                                    }
                                    case 1492992: {
                                        n7 ^= 0x6AFD2C30;
                                        break Block_10;
                                    }
                                    case 1283513877: {
                                        break Label_0655;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 52111762) {
                                    throw null;
                                }
                                throw new IllegalAccessException();
                            }
                            catch (final IllegalAccessException ex2) {
                                int n8 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n7)) {
                                    case -1511292496: {
                                        n8 = (0x492DB153 ^ n7);
                                        break;
                                    }
                                    case 492334154: {
                                        n8 = (0x1E3BCCEC ^ n7);
                                        break;
                                    }
                                    default: {
                                        throw new RuntimeException("Error in hash");
                                    }
                                }
                            Label_0772:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                                        case 1701155911: {
                                            continue;
                                        }
                                        case 88615715: {
                                            break Label_0772;
                                        }
                                        case 668611931: {
                                            return (byte)(0x57D51397 ^ n8) != 0;
                                        }
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                                n8 ^= 0xA45D2F3;
                                return (byte)(0x57D51397 ^ n8) != 0;
                            }
                        }
                    }
                Label_0847:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 1676570664: {
                                continue;
                            }
                            case 89593205: {
                                n3 ^= 0x2D0EAA6A;
                            }
                            case 1528395144: {
                                break Label_0847;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 250436193) {
                        throw new IOException();
                    }
                    final int n9 = 0xA26ABA6 ^ n3;
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 0x5D65CA3B ^ n9, (int)(byte)(0x229A35C5 ^ n9), (boolean)((byte)(0x229A35C4 ^ n9) != 0), (boolean)((byte)(0x229A35C4 ^ n9) != 0)));
                    final int n10 = 0x6427C559 ^ n9;
                    player.sendMessage(Hex.hex(vmhsubgvoz(bvzflphcxkizejd(), n10)));
                    int n8 = 0x1168E30B ^ n10;
                    return (byte)(0x57D51397 ^ n8) != 0;
                }
                ztvggdxyidsgztyi(n3, 1487863951);
            }
        }
        else {
            Label_0123: {
            Label_0116:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                        case 2059898409: {
                            continue;
                        }
                        case 96288387: {
                            break Label_0116;
                        }
                        case 593541282: {
                            break Label_0123;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n ^= 0x73E6D58D;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) == 175462151) {
                final int n11 = 0x4D328BB5 ^ n;
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x765ED90F ^ (0x2E85A244 ^ n11)) != 0;
            }
            ztvggdxyidsgztyi(n, 560170967);
        }
        throw new IOException();
    }
    
    static {
        (NightVisionCommand.nothing_to_see_here = new String[15])[0] = " \u2801\u287c\u280b\u2800\u28c6\u2800\u2800\u28f0\u28ff\u28eb\u28fe\u28bf\u28ff\u28ff\u280d\u28a0\u2820\u2800\u2800\u2880\u2830\u28be\u28fa\u28fb\u28ff\u28ff\u28ff\u28f7\u2840\u2800";
        NightVisionCommand.nothing_to_see_here[1] = "\u28e5\u2800\u2800\u2800\u2801\u2800\u2820\u28bb\u28ac\u2801\u28e0\u28fe\u281b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2810\u2831\u280f\u2849\u2819\u28ff\u28ff\u2847\u2800";
        NightVisionCommand.nothing_to_see_here[2] = "\u28b3\u2800\u28b0\u2856\u2800\u2800\u2808\u2800\u28fa\u28b0\u28ff\u28bb\u28fe\u28f6\u28ff\u28ff\u28f6\u28f6\u28e4\u28e4\u28f4\u28fe\u28ff\u28f7\u28fc\u2846\u28b8\u28ff\u28e7\u2800";
        NightVisionCommand.nothing_to_see_here[3] = "\u2808\u2800\u281c\u2808\u28c0\u28d4\u28e6\u28a8\u28ff\u28ff\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c5\u28fc\u281b\u28b9\u2800";
        NightVisionCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u288b\u287f\u287f\u28ef\u28ed\u285f\u28df\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2858\u2800";
        NightVisionCommand.nothing_to_see_here[5] = "\u2840\u2810\u2800\u2800\u2800\u28ff\u28ef\u287f\u28ff\u28ff\u28ff\u28ef\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28c9\u28bd\u28ff\u2846\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[6] = "\u28b3\u2800\u2804\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2819\u2809\u2809\u2809\u281b\u28fb\u289b\u28ff\u281b\u2803\u2800\u2810\u281b\u283b\u28ff\u2847\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[7] = "\u28fe\u2804\u2800\u2800\u28b8\u28ff\u28ff\u287f\u281f\u281b\u2801\u2880\u2800\u2880\u2844\u28c0\u28e0\u28fe\u28ff\u28ff\u2860\u28f4\u28ce\u28c0\u28e0\u28e0\u28ff\u2847\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[8] = "\u28e7\u2800\u28f4\u28c4\u28fd\u28ff\u28ff\u28ff\u28f6\u28f6\u28d6\u28f6\u28ec\u28fe\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[9] = "\u28ff\u28f6\u28c8\u286f\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28f9\u28a7\u28ff\u28ff\u28ff\u28c4\u2819\u28bf\u28ff\u28ff\u28ff\u2807\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[10] = "\u2839\u28ff\u28ff\u28e7\u288c\u28bd\u28fb\u28bf\u28ef\u28ff\u28ff\u28ff\u28ff\u281f\u28e0\u2858\u283f\u281f\u281b\u281b\u281f\u281b\u28e7\u2848\u283b\u28fe\u28ff\u2800\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[11] = "\u2800\u2808\u2809\u28f7\u287f\u28fd\u2836\u287e\u28bf\u28ff\u28ff\u28ff\u2883\u28e4\u28ff\u28f7\u28e4\u28e4\u28c4\u28c4\u28e0\u28fc\u287f\u28b7\u2880\u28ff\u284f\u2800\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[12] = "\u2800\u2800\u2880\u28ff\u28f7\u280c\u28c8\u28cf\u28dd\u283d\u287f\u28f7\u28fe\u28cf\u28c0\u28c9\u28c9\u28c0\u28c0\u28c0\u28e0\u28e0\u28c4\u2878\u28fe\u28ff\u2803\u2800\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[13] = "\u2800\u28f0\u287f\u28ff\u28e7\u2850\u2804\u2831\u28ff\u28fa\u28fd\u289f\u28ff\u28ff\u28bf\u28ff\u28cd\u2809\u2880\u28c0\u28d0\u28fc\u28ef\u2857\u281f\u284f\u2800\u2800\u2800\u2800";
        NightVisionCommand.nothing_to_see_here[14] = "\u28f0\u28ff\u2800\u28ff\u28ff\u28f4\u2840\u2802\u2818\u28b9\u28ed\u2842\u285a\u283f\u28bf\u28ff\u28ff\u28ff\u287f\u28bf\u28bf\u287f\u283f\u2881\u28f4\u28ff\u28f7\u28f6\u28e6\u28e4";
        NightVisionCommand.xamjwglydp = ByteBuffer.wrap(oumlinrtkjxnpkp()).asCharBuffer().toString();
        NightVisionCommand.Zi3DnHoDaK = (0xF3FB74B1 ^ new Random(1421430891845034427L).nextInt());
    }
    
    public static String vmhsubgvoz(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = NightVisionCommand.xamjwglydp.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] nzapelthhoaspad() {
        return new byte[] { 0, 0, 0, 21, 0, 0, 0, 0 };
    }
    
    private static byte[] bvzflphcxkizejd() {
        return new byte[] { 0, 0, 0, 32, 0, 0, 0, 21 };
    }
    
    private static byte[] nebyzdiyscghopt() {
        return new byte[] { 0, 0, 0, 33, 0, 0, 0, 53 };
    }
    
    private static byte[] oumlinrtkjxnpkp() {
        return new byte[] { 49, 86, 52, 94, 57, 87, 54, 77, 50, 77, 49, 81, 52, 94, 57, 75, 54, 93, 50, 23, 49, 92, 52, 88, 57, 94, 54, 80, 50, 77, 49, 68, 52, 88, 57, 74, 54, 81, 50, 86, 49, 92, 49, 23, 56, 87, 56, 123, 51, 89, 50, 86, 49, 89, 56, 66, 56, 21, 51, 102, 50, 88, 49, 66, 56, 95, 56, 90, 51, 94, 50, 17, 49, 89, 56, 87, 56, 70, 51, 16, 50, 83, 49, 84, 56, 83, 56, 91, 51, 16, 50, 84, 49, 95, 56, 87, 56, 87, 51, 92, 50, 84, 49, 85, 56, 24, 54, 31, 51, 86, 49, 126, 53, 81, 53, 81, 57, 91, 53, 69, 48, 21, 56, 99, 54, 80, 51, 70, 49, 89, 53, 87, 53, 88, 57, 19, 53, 89, 48, 84, 56, 70, 54, 25, 51, 87, 49, 85, 53, 93, 53, 88, 57, 19, 53, 85, 48, 92, 56, 70, 54, 88, 51, 87, 49, 92, 53, 93, 53, 82, 57, 29 };
    }
    
    private static int ztvggdxyidsgztyi(final int n, final int n2) {
        return n ^ n2;
    }
}
