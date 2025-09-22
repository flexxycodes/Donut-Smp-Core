package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Location;
import dev.daniboy.donutcore.config.MainConfig;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.gui.impl.SpawnGUI;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class SetSpawnCommand extends Command
{
    private final DonutCore plugin;
    private final SQLiteManager sqLiteManager;
    private final SpawnGUI spawnGui;
    private static int zF4m10e3sE = 0;
    private transient int UD3VsVxmfn = 2101734071;
    private static String[] nothing_to_see_here;
    
    public SetSpawnCommand(final DonutCore plugin, final SQLiteManager sqLiteManager, final SpawnGUI spawnGui, final int n) {
        final int n2 = 0x78292D29 ^ 0x56523313;
        super("setspawn");
    Label_0086:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 2083880792: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 207525875: {}
                case 168731883: {
                    break Label_0086;
                }
            }
        }
        final int n3 = 0x2110D7F1 ^ (0x68F5FC9F ^ (Integer.parseInt("2025814649") ^ n));
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
        this.spawnGui = spawnGui;
    }
    
    public String getName() {
        return gcvyhjrxiq(shaigynxwlzwekw(), wevqvqxhckcmnkd(), 0x1BAA0436 ^ (0x14273096 ^ (0x330E71D1 ^ this.UD3VsVxmfn)));
    }
    
    public String getDescription() {
        return gcvyhjrxiq(bflnvwlfbmlxofc(), wevqvqxhckcmnkd(), 0x7EB522DE ^ (0x57334C73 ^ (0x7A462B5B ^ this.UD3VsVxmfn)));
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        final int n = 0x57338713 ^ (0x275EED89 ^ (0x534C47 ^ this.UD3VsVxmfn));
        Label_1684: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x19840068 ^ n)) {
                final int n2 = 0x6D6A83A7 ^ n;
                final Player player = (Player)commandSender;
                int n3 = 0x12841312 ^ n2;
                Label_0123: {
                Label_0116:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 2006310448: {
                                continue;
                            }
                            case 107880134: {
                                break Label_0116;
                            }
                            case 2078600392: {
                                break Label_0123;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n3 ^= 0x5F50F2B7;
                    try {
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 249636759) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    }
                    catch (final IllegalAccessException ex) {
                        int kqbpcpdjwfivnavj = 0;
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                            case -908913839: {
                                kqbpcpdjwfivnavj = kqbpcpdjwfivnavj(n3, 233108685);
                                break;
                            }
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case 1071802625: {
                                kqbpcpdjwfivnavj = (0x1322DB87 ^ n3);
                                break;
                            }
                        }
                        final int kqbpcpdjwfivnavj2 = kqbpcpdjwfivnavj(kqbpcpdjwfivnavj, 1069572924);
                        if ((player.hasPermission(gcvyhjrxiq(jcputdoaisyhzmc(), wevqvqxhckcmnkd(), kqbpcpdjwfivnavj2)) ? 1 : 0) == (0xB1EF59B ^ kqbpcpdjwfivnavj2)) {
                            final int n4 = 0x5CB1A803 ^ kqbpcpdjwfivnavj2;
                            MessagesConfig.NOPERMISSION.send((CommandSender)player);
                            final int n5 = 0x7CA9EC8A ^ n4;
                            SoundConfig.NOPERMISSION.play(player);
                            return (byte)(0x651209A6 ^ (0x4E14B8B4 ^ n5)) != 0;
                        }
                        int n6 = 0x27D4351D ^ kqbpcpdjwfivnavj2;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 113834441) {
                            kqbpcpdjwfivnavj(n6, 225148865);
                            throw new IOException();
                        }
                    Label_0391:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                case 397463651: {
                                    continue;
                                }
                                case 113834441: {
                                    n6 ^= 0x1004158B;
                                }
                                case 1768200161: {
                                    break Label_0391;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        Label_1430: {
                            Label_0772: {
                                if ((MainConfig.SpawnAFK.NEW_DONUT_SPAWN_AFK ? 1 : 0) != (0x3CCED50D ^ n6)) {
                                    int n7 = 0x731589C0 ^ n6;
                                    while (true) {
                                        if (array.length == (byte)(0x4FDB5CCC ^ n7)) {
                                            n7 ^= 0x56E45EB1;
                                            int int1 = 0;
                                            Label_0950: {
                                                try {
                                                    int1 = Integer.parseInt(array[(byte)(0x193F027C ^ n7)]);
                                                    n7 ^= 0x23CBD519;
                                                    break Label_0950;
                                                    Label_0676: {
                                                        n7 ^= 0x4EDBDC9F;
                                                    }
                                                    throw new IOException();
                                                    Label_0504:
                                                    n7 = kqbpcpdjwfivnavj(n7, 1623800605);
                                                    MessagesConfig.PROVIDESPAWNNUMBER.send((CommandSender)player);
                                                    n7 = kqbpcpdjwfivnavj(n7, 1191900639);
                                                    try {
                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 216528859) {
                                                            throw null;
                                                        }
                                                        throw new IOException();
                                                    }
                                                    catch (final IOException ex2) {
                                                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n7)) {
                                                            case -2020292845: {
                                                                n7 = kqbpcpdjwfivnavj(n7, 2059247558);
                                                                break;
                                                            }
                                                            default: {
                                                                throw new RuntimeException("Error in hash");
                                                            }
                                                            case 1171089618: {
                                                                n7 ^= 0x42F6AA3E;
                                                                break;
                                                            }
                                                        }
                                                        n7 = kqbpcpdjwfivnavj(n7, 1837993456);
                                                        return (byte)(0x67C28AD5 ^ n7) != 0;
                                                    }
                                                    Label_0630: {
                                                        break Label_0630;
                                                        n7 = kqbpcpdjwfivnavj(n7, 547438357);
                                                        iftrue(Label_0504:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) == 134041096);
                                                    }
                                                    switch([Lw5.q;@e1dc3c6)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7));
                                                }
                                                catch (final NumberFormatException ex3) {
                                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n7)) {
                                                        default: {
                                                            throw new IllegalAccessException("Error in hash");
                                                        }
                                                        case -906488864: {
                                                            final int n8 = 0x67D9735D ^ (0x788E5E3A ^ n7);
                                                            MessagesConfig.INVALIDSPAWNNUMBER.send((CommandSender)player);
                                                            return (byte)(0x7375B2F9 ^ (0x751D9DE2 ^ n8)) != 0;
                                                        }
                                                    }
                                                }
                                                break Label_0772;
                                            }
                                            final int n9 = 0x6FAC13C1 ^ n7;
                                            try {
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 89893285) {
                                                    throw null;
                                                }
                                                throw new RuntimeException();
                                            }
                                            catch (final RuntimeException ex4) {
                                                int n10 = 0;
                                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n9)) {
                                                    case 402057528: {
                                                        n10 = kqbpcpdjwfivnavj(n9, 1487563353);
                                                        break;
                                                    }
                                                    case -1429854942: {
                                                        n10 = kqbpcpdjwfivnavj(n9, 252474330);
                                                        break;
                                                    }
                                                    default: {
                                                        throw new IOException("Error in hash");
                                                    }
                                                }
                                            Label_1083:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n10)) {
                                                        case 1962159721: {
                                                            continue;
                                                        }
                                                        case 251951568: {
                                                            n10 ^= 0x4D31288C;
                                                        }
                                                        case 1442438402: {
                                                            break Label_1083;
                                                        }
                                                        default: {
                                                            throw new IOException();
                                                        }
                                                    }
                                                }
                                                final Location location = player.getLocation();
                                                final int n11 = 0x4FEA9E3C ^ n10;
                                                this.sqLiteManager.setSpawn$19360209(location, int1, 319223360);
                                                final int n12 = 0x1F993DDB ^ n11;
                                                final MessagesConfig spawnpointset = MessagesConfig.SPAWNPOINTSET;
                                                final CommandSender commandSender2 = (CommandSender)player;
                                                final String[] array2 = new String[(byte)(0x47163C17 ^ n12)];
                                                array2[(byte)(0x47163C15 ^ n12)] = gcvyhjrxiq(thlhepxczilrqdr(), wevqvqxhckcmnkd(), n12);
                                                array2[(byte)(0x47163C14 ^ n12)] = String.valueOf(int1);
                                                spawnpointset.send(commandSender2, array2);
                                                final int n13 = 0x2D32658D ^ n12;
                                                SoundConfig.SPAWNSET.play(player);
                                                final int n14 = 0x33FC572B ^ n13;
                                                this.spawnGui.loadSpawnConfigValues$882403349(870176311);
                                                final int n15 = 0x63B2755A ^ (0x7E44E78A ^ n14);
                                                try {
                                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15) != 68815569) {
                                                        throw null;
                                                    }
                                                    throw new IOException();
                                                }
                                                catch (final IOException ex5) {
                                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n15)) {
                                                        case 561308442: {
                                                            n7 = (0x754EB12 ^ n15);
                                                            break;
                                                        }
                                                        default: {
                                                            throw new IllegalAccessException("Error in hash");
                                                        }
                                                        case 1289736809: {
                                                            n7 = (0x6AE18D3C ^ n15);
                                                            break;
                                                        }
                                                    }
                                                Label_1420:
                                                    while (true) {
                                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                                            case 455246855: {
                                                                continue;
                                                            }
                                                            case 45941776: {
                                                                break Label_1420;
                                                            }
                                                            case 1042310614: {
                                                                return (byte)(0x67C28AD5 ^ n7) != 0;
                                                            }
                                                            default: {
                                                                throw new IOException();
                                                            }
                                                        }
                                                    }
                                                    n7 ^= 0x24B8FDA5;
                                                }
                                            }
                                            break Label_1430;
                                        }
                                        continue;
                                    }
                                }
                            }
                        Label_0827:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                    case 908762880: {
                                        continue;
                                    }
                                    case 97550343: {
                                        n6 ^= 0x49A1FA5;
                                    }
                                    case 730073990: {
                                        break Label_0827;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 220492017) {
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                        case 1649879111: {
                                            continue;
                                        }
                                        case 220492017: {}
                                        default: {
                                            break Label_1684;
                                        }
                                    }
                                }
                                throw new IOException();
                            }
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                    case 607705709: {
                                        continue;
                                    }
                                    case 220492017: {
                                        n6 ^= 0x4E2F8497;
                                    }
                                    case 615786642: {
                                        break Label_1430;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                        final Location location2 = player.getLocation();
                        final int n16 = 0x2D395E96 ^ n6;
                        this.sqLiteManager.saveLocation$479125106(gcvyhjrxiq(ubwuqtnvfkgwaya(), wevqvqxhckcmnkd(), n16), location2, 1304033000);
                        final int n17 = 0x4698492C ^ n16;
                        MessagesConfig.SPAWNLOCATIONSET.send((CommandSender)player);
                        final int n18 = 0x36BE7806 ^ n17;
                        SoundConfig.SPAWNSET.play(player);
                        final int n19 = 0x6BED184E ^ n18;
                        this.spawnGui.loadSpawnConfigValues$882403349(870176311);
                        int n7 = 0x274BB319 ^ n19;
                        return (byte)(0x67C28AD5 ^ n7) != 0;
                    }
                }
            }
            final int kqbpcpdjwfivnavj3 = kqbpcpdjwfivnavj(n, 1460175558);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kqbpcpdjwfivnavj3) == 137393085) {
                final int kqbpcpdjwfivnavj4 = kqbpcpdjwfivnavj(kqbpcpdjwfivnavj3, 2111403150);
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x167F0919 ^ (0x252AFF39 ^ kqbpcpdjwfivnavj4)) != 0;
            }
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(kqbpcpdjwfivnavj3)) {
                    case 2100894451: {
                        continue;
                    }
                    case 137393085: {}
                    default: {
                        break Label_1684;
                    }
                }
            }
        }
        throw new IOException();
    }
    
    static {
        (SetSpawnCommand.nothing_to_see_here = new String[15])[0] = " \u2801\u287c\u280b\u2800\u28c6\u2800\u2800\u28f0\u28ff\u28eb\u28fe\u28bf\u28ff\u28ff\u280d\u28a0\u2820\u2800\u2800\u2880\u2830\u28be\u28fa\u28fb\u28ff\u28ff\u28ff\u28f7\u2840\u2800";
        SetSpawnCommand.nothing_to_see_here[1] = "\u28e5\u2800\u2800\u2800\u2801\u2800\u2820\u28bb\u28ac\u2801\u28e0\u28fe\u281b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2810\u2831\u280f\u2849\u2819\u28ff\u28ff\u2847\u2800";
        SetSpawnCommand.nothing_to_see_here[2] = "\u28b3\u2800\u28b0\u2856\u2800\u2800\u2808\u2800\u28fa\u28b0\u28ff\u28bb\u28fe\u28f6\u28ff\u28ff\u28f6\u28f6\u28e4\u28e4\u28f4\u28fe\u28ff\u28f7\u28fc\u2846\u28b8\u28ff\u28e7\u2800";
        SetSpawnCommand.nothing_to_see_here[3] = "\u2808\u2800\u281c\u2808\u28c0\u28d4\u28e6\u28a8\u28ff\u28ff\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c5\u28fc\u281b\u28b9\u2800";
        SetSpawnCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u288b\u287f\u287f\u28ef\u28ed\u285f\u28df\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2858\u2800";
        SetSpawnCommand.nothing_to_see_here[5] = "\u2840\u2810\u2800\u2800\u2800\u28ff\u28ef\u287f\u28ff\u28ff\u28ff\u28ef\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28c9\u28bd\u28ff\u2846\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[6] = "\u28b3\u2800\u2804\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2819\u2809\u2809\u2809\u281b\u28fb\u289b\u28ff\u281b\u2803\u2800\u2810\u281b\u283b\u28ff\u2847\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[7] = "\u28fe\u2804\u2800\u2800\u28b8\u28ff\u28ff\u287f\u281f\u281b\u2801\u2880\u2800\u2880\u2844\u28c0\u28e0\u28fe\u28ff\u28ff\u2860\u28f4\u28ce\u28c0\u28e0\u28e0\u28ff\u2847\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[8] = "\u28e7\u2800\u28f4\u28c4\u28fd\u28ff\u28ff\u28ff\u28f6\u28f6\u28d6\u28f6\u28ec\u28fe\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[9] = "\u28ff\u28f6\u28c8\u286f\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28f9\u28a7\u28ff\u28ff\u28ff\u28c4\u2819\u28bf\u28ff\u28ff\u28ff\u2807\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[10] = "\u2839\u28ff\u28ff\u28e7\u288c\u28bd\u28fb\u28bf\u28ef\u28ff\u28ff\u28ff\u28ff\u281f\u28e0\u2858\u283f\u281f\u281b\u281b\u281f\u281b\u28e7\u2848\u283b\u28fe\u28ff\u2800\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[11] = "\u2800\u2808\u2809\u28f7\u287f\u28fd\u2836\u287e\u28bf\u28ff\u28ff\u28ff\u2883\u28e4\u28ff\u28f7\u28e4\u28e4\u28c4\u28c4\u28e0\u28fc\u287f\u28b7\u2880\u28ff\u284f\u2800\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[12] = "\u2800\u2800\u2880\u28ff\u28f7\u280c\u28c8\u28cf\u28dd\u283d\u287f\u28f7\u28fe\u28cf\u28c0\u28c9\u28c9\u28c0\u28c0\u28c0\u28e0\u28e0\u28c4\u2878\u28fe\u28ff\u2803\u2800\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[13] = "\u2800\u28f0\u287f\u28ff\u28e7\u2850\u2804\u2831\u28ff\u28fa\u28fd\u289f\u28ff\u28ff\u28bf\u28ff\u28cd\u2809\u2880\u28c0\u28d0\u28fc\u28ef\u2857\u281f\u284f\u2800\u2800\u2800\u2800";
        SetSpawnCommand.nothing_to_see_here[14] = "\u28f0\u28ff\u2800\u28ff\u28ff\u28f4\u2840\u2802\u2818\u28b9\u28ed\u2842\u285a\u283f\u28bf\u28ff\u28ff\u28ff\u287f\u28bf\u28bf\u287f\u283f\u2881\u28f4\u28ff\u28f7\u28f6\u28e6\u28e4";
        SetSpawnCommand.zF4m10e3sE = (0xC11F870B ^ new Random(-8541337118377950880L).nextInt());
    }
    
    public static String gcvyhjrxiq(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] wevqvqxhckcmnkd() {
        return new byte[] { 105, 76, 99, 1, 52, 39, 57, 5, 75, 104, 4, 65, 1, 125, 83, 17, 83, 60, 15, 46, 9, 78, 16, 29, 101, 19, 38, 32, 79, 88, 79, 57, 57, 126, 79, 73, 12, 41, 76, 90, 109, 78, 84, 12, 111, 52, 8, 89 };
    }
    
    private static byte[] shaigynxwlzwekw() {
        return new byte[] { -90, -121, 81, 75, 12, 112, 13, 69, 126, 41, 53, 5, 51, 37, 107, 84, 103, 102 };
    }
    
    private static byte[] bflnvwlfbmlxofc() {
        return new byte[] { -82, -117, 82, 98, 13, 123, 10, 66, 122, 34, 60, 80, 49, 48, 106, 74, 96, 104, 54, 54, 56, 45, 41, 84, 86, 65, 23, 110, 119, 7, 127, 32, 0, 33, 124, 23, 53, 114, 125, 11, 84, 3, 103, 86, 94, 98, 48, 6, 89, 85, 90, 93, 7, 100, 0, 29, 122, 40, 61, 23, 50, 39, 98, 70, 107, 121, 63, 55, 48, 27, 35, 67, 92, 89, 23, 48, 118, 21, 124, 98, 8, 34, 119, 88, 60, 96, 117, 5, 94, 30, 109, 77, 94, 97, 49, 18, 90, 81 };
    }
    
    private static byte[] thlhepxczilrqdr() {
        return new byte[] { -90, -126, 90, 22, 2, 122, 0, 69, 123, 60, 53, 18, 56, 42, 101, 80, 106, 44 };
    }
    
    private static byte[] jcputdoaisyhzmc() {
        return new byte[] { -90, -117, 85, 80, 3, 112, 10, 88, 122, 44, 60, 3, 52, 41, 107, 77, 96, 127, 62, 115, 63, 85, 39, 86, 86, 69, 23, 101, 119, 29, 122, 126, 1, 44, 124, 15, 61, 127 };
    }
    
    private static byte[] ubwuqtnvfkgwaya() {
        return new byte[] { -90, -122, 80, 67, 4, 98, 15, 86, 114, 40, 53, 26 };
    }
    
    private static int kqbpcpdjwfivnavj(final int n, final int n2) {
        return n2 ^ n;
    }
}
