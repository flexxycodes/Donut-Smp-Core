package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Location;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.gui.impl.AfkGUI;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class SetAfkCommand extends Command
{
    private final DonutCore plugin;
    private final SQLiteManager sqLiteManager;
    private final AfkGUI afkGui;
    private static int WenShUG6hN = 0;
    private transient int Gzy2wjTLzQ = 44312891;
    private static byte[] ijrqgxpats;
    private static String[] nothing_to_see_here;
    
    public SetAfkCommand(final DonutCore plugin, final SQLiteManager sqLiteManager, final AfkGUI afkGui, final int n) {
        super("setafk");
        final int n2 = 0x497C31A4 ^ (0x50400936 ^ (Integer.parseInt("844158533") ^ n));
        final int n3 = 0x34BA8B92 ^ vhmqrvgztwrurlub(n2, 1783434501);
        this.plugin = plugin;
        this.sqLiteManager = sqLiteManager;
        this.afkGui = afkGui;
        this.setDescription("Sets an AFK point.");
        this.setUsage("/setafk <number>");
        this.setPermission("donutcore.setafk");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        final int n = 0x3F4F9E5B ^ (0x7E65B501 ^ (0x4853A42A ^ this.Gzy2wjTLzQ));
        Label_1160: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x28C341A8 ^ n)) {
                final int n2 = 0x65E0C243 ^ n;
                final Player player = (Player)commandSender;
                final int vhmqrvgztwrurlub = vhmqrvgztwrurlub(0x7C49852C ^ n2, 1696265875);
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhmqrvgztwrurlub) != 60458450) {
                        throw null;
                    }
                    throw new IOException();
                }
                catch (final IOException ex) {
                    int vhmqrvgztwrurlub2 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(vhmqrvgztwrurlub)) {
                        case 1702992217: {
                            vhmqrvgztwrurlub2 = vhmqrvgztwrurlub(vhmqrvgztwrurlub, 502956802);
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case -1551400286: {
                            vhmqrvgztwrurlub2 = (0x653A407D ^ vhmqrvgztwrurlub);
                            break;
                        }
                    }
                    int vhmqrvgztwrurlub3 = vhmqrvgztwrurlub(vhmqrvgztwrurlub2, 496259485);
                    if ((player.hasPermission(vvknvjlmvz(amqvfwnbcnhyhju(), vhmqrvgztwrurlub3)) ? 1 : 0) == (0x2CDEE1B4 ^ vhmqrvgztwrurlub3)) {
                        final int n3 = 0x5706C8F0 ^ vhmqrvgztwrurlub3;
                        MessagesConfig.NOPERMISSION.send((CommandSender)player);
                        final int n4 = 0x326D9AD9 ^ n3;
                        SoundConfig.NOPERMISSION.play(player);
                        return (byte)(0x2C715FC4 ^ (0x65C4EC58 ^ n4)) != 0;
                    }
                Label_0439:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhmqrvgztwrurlub3)) {
                            case 624120877: {
                                continue;
                            }
                            case 116390290: {
                                vhmqrvgztwrurlub3 ^= 0x11CFE153;
                            }
                            case 1739836837: {
                                break Label_0439;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhmqrvgztwrurlub3) == 105958574) {
                        int n5 = 0x69CF06EF ^ vhmqrvgztwrurlub3;
                        final int vhmqrvgztwrurlub5;
                        Label_1126: {
                            Label_0668: {
                                if (array.length == (byte)(0x54DE0609 ^ n5)) {
                                    int n6 = 0x5F096AD9 ^ n5;
                                    int int1 = 0;
                                    Label_0758: {
                                        try {
                                            int1 = Integer.parseInt(array[(byte)(0xBD76CD1 ^ n6)]);
                                            n6 ^= 0x170D6A51;
                                            break Label_0758;
                                        }
                                        catch (final NumberFormatException ex2) {
                                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n6)) {
                                                case 1589339784: {
                                                    final int n7 = 0x4AD6F48E ^ (0x5CAA7A62 ^ n6);
                                                    MessagesConfig.INVALIDSPAWNNUMBER.send((CommandSender)player);
                                                    return (byte)(0x64B88AC1 ^ (0x791368FD ^ n7)) != 0;
                                                }
                                                default: {
                                                    throw new IOException("Error in hash");
                                                }
                                            }
                                        }
                                        break Label_0668;
                                    }
                                    Label_0811: {
                                    Block_11:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                                case 686107253: {
                                                    continue;
                                                }
                                                case 132542530: {
                                                    n6 ^= 0x37EF734F;
                                                    break Block_11;
                                                }
                                                case 803903127: {
                                                    break Label_0811;
                                                }
                                                default: {
                                                    throw new IOException();
                                                }
                                            }
                                        }
                                        try {
                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 62373748) {
                                                throw null;
                                            }
                                            throw new IllegalAccessException();
                                        }
                                        catch (final IllegalAccessException ex3) {
                                            int n8 = 0;
                                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n6)) {
                                                case 1504423545: {
                                                    n8 = (0x6F802E34 ^ n6);
                                                    break;
                                                }
                                                default: {
                                                    throw new IOException("Error in hash");
                                                }
                                                case 2121932008: {
                                                    n8 = (0x4B7A1866 ^ n6);
                                                    break;
                                                }
                                            }
                                            final int n9 = 0x375B5CB6 ^ n8;
                                            final Location location = player.getLocation();
                                            final int n10 = 0x2B7891C6 ^ n9;
                                            this.sqLiteManager.setAfk$471806796(location, int1, 1906740810);
                                            final int n11 = 0x7880B84 ^ n10;
                                            MessagesConfig.AFKPOINTSET.send((CommandSender)player);
                                            final int n12 = 0x3FF397AC ^ n11;
                                            SoundConfig.AFKSET.play(player);
                                            final int n13 = 0x64F3EB2F ^ n12;
                                            this.afkGui.loadAfkConfigValues$568738828(1586297296);
                                            final int vhmqrvgztwrurlub4 = vhmqrvgztwrurlub(0x6EE47244 ^ n13, 2078732233);
                                            try {
                                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhmqrvgztwrurlub4) != 19341661) {
                                                    throw null;
                                                }
                                                throw new IOException();
                                            }
                                            catch (final IOException ex4) {
                                                int n14 = 0;
                                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(vhmqrvgztwrurlub4)) {
                                                    case -1998331896: {
                                                        n14 = (0x171B233A ^ vhmqrvgztwrurlub4);
                                                        break;
                                                    }
                                                    default: {
                                                        throw new RuntimeException("Error in hash");
                                                    }
                                                    case 843483122: {
                                                        n14 = (0x404F8FC5 ^ vhmqrvgztwrurlub4);
                                                        break;
                                                    }
                                                }
                                                final int n15 = 0x1C3FA3DD ^ n14;
                                            }
                                        }
                                    }
                                    break Label_1126;
                                }
                            }
                        Label_0723:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                                    case 1000997846: {
                                        continue;
                                    }
                                    case 74350449: {
                                        n5 ^= 0x7BA84583;
                                    }
                                    case 1559247191: {
                                        break Label_0723;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 200609195) {
                                throw new IOException();
                            }
                            vhmqrvgztwrurlub5 = vhmqrvgztwrurlub(n5, 1537619254);
                        }
                        MessagesConfig.PROVIDEAFKNUMBER.send((CommandSender)player);
                        final int n15 = 0x6EE88A5B ^ vhmqrvgztwrurlub5;
                        return (byte)(0x1A38FCE7 ^ n15) != 0;
                    }
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhmqrvgztwrurlub3)) {
                            case 1577938742: {
                                continue;
                            }
                            case 105958574: {}
                            default: {
                                break Label_1160;
                            }
                        }
                    }
                }
            }
            else {
                final int n16 = 0x42D34BA ^ n;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16) == 118369852) {
                    final int n17 = 0x7C523604 ^ n16;
                    MessagesConfig.ONLYPLAYERS.send(commandSender);
                    return (byte)(0x35B06D04 ^ (0x650C2E13 ^ n17)) != 0;
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n16)) {
                        case 1554535776: {
                            continue;
                        }
                        case 118369852: {}
                        default: {
                            break Label_1160;
                        }
                    }
                }
            }
        }
        throw new IOException();
    }
    
    static {
        (SetAfkCommand.nothing_to_see_here = new String[17])[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
        SetAfkCommand.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
        SetAfkCommand.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
        SetAfkCommand.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
        SetAfkCommand.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
        SetAfkCommand.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
        SetAfkCommand.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
        SetAfkCommand.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
        SetAfkCommand.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
        SetAfkCommand.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
        SetAfkCommand.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
        SetAfkCommand.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
        SetAfkCommand.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
        SetAfkCommand.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
        SetAfkCommand.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
        SetAfkCommand.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
        SetAfkCommand.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
        SetAfkCommand.ijrqgxpats = zwvatnbmdfvjrpt();
        SetAfkCommand.WenShUG6hN = (0x2D639884 ^ new Random(6455330743031921930L).nextInt());
    }
    
    public static String vvknvjlmvz(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= SetAfkCommand.ijrqgxpats[i % SetAfkCommand.ijrqgxpats.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] zwvatnbmdfvjrpt() {
        return new byte[] { 106, 108, 81, 104, 30 };
    }
    
    private static byte[] amqvfwnbcnhyhju() {
        return new byte[] { -93, -90, 99, 52, 46, 49, 94, 8, 94, 92, 95, 42, 105, 59, 42, 55, 91, 21, 95, 78, 88, 122, 97, 47, 44, 56, 90, 18, 93, 77, 82, 58, 101, 49 };
    }
    
    private static int vhmqrvgztwrurlub(final int n, final int n2) {
        return n2 ^ n;
    }
}
