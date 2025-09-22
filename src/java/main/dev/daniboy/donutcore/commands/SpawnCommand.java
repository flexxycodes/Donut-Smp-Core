package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Location;
import dev.daniboy.donutcore.config.MainConfig;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.manager.TeleportManager;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class SpawnCommand extends Command
{
    private final DonutCore plugin;
    private final SQLiteManager sqLiteManager;
    private final TeleportManager teleportManager;
    private static int l1uBcDuQeF = 0;
    private transient int ErlIfEX0sM = 1521529442;
    private static String[] nothing_to_see_here;
    
    public SpawnCommand(final DonutCore plugin, final SQLiteManager sqLiteManager, final TeleportManager teleportManager, final int n) {
        super("spawn");
        final int n2 = 0x7CFF7543 ^ (0x19152F7A ^ (Integer.parseInt("976020915") ^ n));
        final int n3 = 0x68C79D8C ^ zjhjzbmkidnxhvpf(n2, 1893537200);
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
        this.teleportManager = teleportManager;
    }
    
    public String getName() {
        return uzhwgzlpho(mdvxwlrzvdwsnuf(), rjwxgraeatjaowq(), 0x3D1CDF0D ^ (0x570E0057 ^ (0x3A857CB9 ^ this.ErlIfEX0sM)));
    }
    
    public String getDescription() {
        return uzhwgzlpho(lnrnesxiyvvwzxd(), rjwxgraeatjaowq(), 0x6EA95006 ^ (0x54E0067E ^ (0x73CD2633 ^ this.ErlIfEX0sM)));
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        final int n = 0x1E92CEBF ^ (0x1FCB1468 ^ (0x9D8412F ^ this.ErlIfEX0sM));
        Label_1275: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x68B0B025 ^ n)) {
                final int n2 = 0x498340F6 ^ n;
                final Player player = (Player)commandSender;
                final int zjhjzbmkidnxhvpf = zjhjzbmkidnxhvpf(0x3DDA54D8 ^ n2, 1857975345);
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(zjhjzbmkidnxhvpf) != 227168551) {
                        throw null;
                    }
                    throw new RuntimeException();
                }
                catch (final RuntimeException ex) {
                    int n3 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(zjhjzbmkidnxhvpf)) {
                        case -1833008685: {
                            n3 = zjhjzbmkidnxhvpf(zjhjzbmkidnxhvpf, 984773590);
                            break;
                        }
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case -249438072: {
                            n3 = zjhjzbmkidnxhvpf(zjhjzbmkidnxhvpf, 1455529981);
                            break;
                        }
                    }
                    int n4 = 0x32C66D63 ^ n3;
                    if ((player.hasPermission(uzhwgzlpho(tuzfxwdxtxrbfat(), rjwxgraeatjaowq(), n4)) ? 1 : 0) == (0x7A23CE8F ^ n4)) {
                        final int n5 = 0x3751359E ^ n4;
                        MessagesConfig.NOPERMISSION.send((CommandSender)player);
                        final int n6 = 0x4B7F8F7E ^ n5;
                        SoundConfig.NOPERMISSION.play(player);
                        return (byte)(0x5A31F69C ^ (0x5C3C82F3 ^ n6)) != 0;
                    }
                Label_0399:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 499856170: {
                                continue;
                            }
                            case 212146710: {
                                n4 ^= 0x549D7590;
                            }
                            case 912966855: {
                                break Label_0399;
                            }
                            default: {
                                throw new RuntimeException();
                            }
                        }
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) == 177316914) {
                    Label_0519:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                                case 1791444211: {
                                    continue;
                                }
                                case 177316914: {
                                    n4 ^= 0x3E3AF0E9;
                                }
                                case 420611229: {
                                    break Label_0519;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        int n10 = 0;
                        Label_1208: {
                            if ((MainConfig.SpawnAFK.NEW_DONUT_SPAWN_AFK ? 1 : 0) != (0x10844BF6 ^ n4)) {
                                final int n7 = 0x5DAFCB80 ^ n4;
                                this.plugin.getSpawnGui$166485211(362522864).open$967512435(player, new Object[(byte)(0x4D2B8076 ^ n7)], 1892453237);
                                final int n8 = 0x7FEB8C18 ^ n7;
                                SoundConfig.OPENINVENTORY.play(player);
                                final int zjhjzbmkidnxhvpf2 = zjhjzbmkidnxhvpf(n8, 2051789641);
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(zjhjzbmkidnxhvpf2) != 210716880) {
                                        throw null;
                                    }
                                    throw new IOException();
                                }
                                catch (final IOException ex2) {
                                    int n9 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(zjhjzbmkidnxhvpf2)) {
                                        case 1147074874: {
                                            n9 = zjhjzbmkidnxhvpf(zjhjzbmkidnxhvpf2, 1937388945);
                                            break;
                                        }
                                        case -1176312454: {
                                            n9 = zjhjzbmkidnxhvpf(zjhjzbmkidnxhvpf2, 1825420825);
                                            break;
                                        }
                                        default: {
                                            throw new IllegalAccessException("Error in hash");
                                        }
                                    }
                                    final int zjhjzbmkidnxhvpf3 = 0x3AC78CF0 ^ n9;
                                    return (byte)(0x1366646 ^ zjhjzbmkidnxhvpf3) != 0;
                                }
                                break Label_1208;
                            }
                        Label_0671:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                                    case 206651412: {
                                        continue;
                                    }
                                    case 17320: {
                                        n4 ^= 0x6EAAD99C;
                                    }
                                    case 1602402320: {
                                        break Label_0671;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 75122051) {
                                throw new RuntimeException();
                            }
                        Label_0739:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                                    case 1474878160: {
                                        continue;
                                    }
                                    case 75122051: {
                                        n4 ^= 0x61991057;
                                    }
                                    case 2103435954: {
                                        break Label_0739;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            final Location location$107949963 = this.sqLiteManager.getLocation$107949963(uzhwgzlpho(lhrshszagaloljo(), rjwxgraeatjaowq(), n4), 1107835745);
                            n10 = (0x117C9DE ^ n4);
                            if (location$107949963 != null) {
                                final int n11 = 0x2F0BD1DD ^ n10;
                                this.teleportManager.teleportWithCountdown$168586022(player, location$107949963, 1255099300);
                                final int zjhjzbmkidnxhvpf4 = zjhjzbmkidnxhvpf(n11, 2033660216);
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(zjhjzbmkidnxhvpf4) != 212845511) {
                                        throw null;
                                    }
                                    throw new IllegalAccessException();
                                }
                                catch (final IllegalAccessException ex3) {
                                    int zjhjzbmkidnxhvpf5 = 0;
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(zjhjzbmkidnxhvpf4)) {
                                        default: {
                                            throw new RuntimeException("Error in hash");
                                        }
                                        case 1155881010: {
                                            zjhjzbmkidnxhvpf5 = (0x75621C23 ^ zjhjzbmkidnxhvpf4);
                                            break;
                                        }
                                        case 85066872: {
                                            zjhjzbmkidnxhvpf5 = zjhjzbmkidnxhvpf(zjhjzbmkidnxhvpf4, 1029502890);
                                            break;
                                        }
                                    }
                                    final int zjhjzbmkidnxhvpf3 = zjhjzbmkidnxhvpf(zjhjzbmkidnxhvpf5, 1019793763);
                                    return (byte)(0x1366646 ^ zjhjzbmkidnxhvpf3) != 0;
                                }
                            }
                        Label_0983:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                    case 1011310528: {
                                        continue;
                                    }
                                    case 190221735: {
                                        n10 ^= 0x2905A1D;
                                    }
                                    case 563690223: {
                                        break Label_0983;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10) != 110968556) {
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                        case 1450600652: {
                                            continue;
                                        }
                                        case 110968556: {}
                                        default: {
                                            break Label_1275;
                                        }
                                    }
                                }
                                throw new RuntimeException();
                            }
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                    case 1661372415: {
                                        continue;
                                    }
                                    case 110968556: {
                                        n10 ^= 0x1C16F661;
                                    }
                                    case 955841444: {
                                        break Label_1208;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                        }
                        MessagesConfig.SPAWNNOTSET.send((CommandSender)player);
                        final int n12 = 0x6943195B ^ n10;
                        SoundConfig.SPAWNNOTSET.play(player);
                        final int zjhjzbmkidnxhvpf3 = 0x68539882 ^ n12;
                        return (byte)(0x1366646 ^ zjhjzbmkidnxhvpf3) != 0;
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 1165307182: {
                                continue;
                            }
                            case 177316914: {}
                            default: {
                                break Label_1275;
                            }
                        }
                    }
                }
            }
            else {
                final int zjhjzbmkidnxhvpf6 = zjhjzbmkidnxhvpf(n, 1619080167);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(zjhjzbmkidnxhvpf6) == 128869300) {
                    final int zjhjzbmkidnxhvpf7 = zjhjzbmkidnxhvpf(zjhjzbmkidnxhvpf6, 2071893687);
                    MessagesConfig.ONLYPLAYERS.send(commandSender);
                    return (byte)(0x6D074189 ^ (0x1E4854FC ^ zjhjzbmkidnxhvpf7)) != 0;
                }
            }
        }
        throw new RuntimeException();
    }
    
    static {
        (SpawnCommand.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        SpawnCommand.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        SpawnCommand.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SpawnCommand.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        SpawnCommand.l1uBcDuQeF = (0x9EDE5838 ^ new Random(-6339243614932408393L).nextInt());
    }
    
    public static String uzhwgzlpho(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] rjwxgraeatjaowq() {
        return new byte[] { 11, 57, 50, 106, 27, 88, 57, 13, 86, 23, 53, 48, 50, 108, 55, 8, 70, 65, 4, 66, 106, 28, 81, 85, 74, 120, 111, 115, 38, 35, 118, 77, 56, 47, 86, 45, 119, 74, 77, 77, 88, 109, 99, 60, 97, 103, 109, 121, 26, 76, 56, 32, 27, 109, 30, 113, 57, 14, 12, 13, 68, 89, 113, 45, 105, 86, 15, 75, 44, 117, 7, 83, 75, 102, 106, 72, 60, 92, 13, 25, 96, 89, 5, 45, 93, 78, 39, 122, 2, 5, 29, 64, 19, 127, 36, 1, 117, 38, 4, 34, 27, 126, 72, 31, 101, 51, 53, 26, 25, 63, 27, 14, 24, 35, 85, 106, 110 };
    }
    
    private static byte[] mdvxwlrzvdwsnuf() {
        return new byte[] { -51, -9, 4, 43, 41, 24, 11, 94, 100, 88, 4, 104 };
    }
    
    private static byte[] lnrnesxiyvvwzxd() {
        return new byte[] { -61, -1, 11, 18, 46, 25, 10, 89, 110, 79, 12, 122, 5, 121, 6, 104, 119, 9, 50, 26, 83, 92, 100, 10, 121, 105, 87, 2, 31, 79, 65, 49, 9, 50 };
    }
    
    private static byte[] tuzfxwdxtxrbfat() {
        return new byte[] { -57, -10, 6, 55, 42, 1, 15, 90, 111, 83, 7, 116, 6, 54, 6, 81, 112, 10, 61, 22, 88, 2, 101, 31, 123, 62, 89, 43, 31, 101, 68, 19 };
    }
    
    private static byte[] lhrshszagaloljo() {
        return new byte[] { -64, -11, 0, 40, 41, 24, 8, 94, 99, 85, 6, 108 };
    }
    
    private static int zjhjzbmkidnxhvpf(final int n, final int n2) {
        return n ^ n2;
    }
}
