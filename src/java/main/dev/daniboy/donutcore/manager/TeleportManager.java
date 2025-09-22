package dev.daniboy.donutcore.manager;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.config.SoundConfig;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.config.MessagesConfig;
import java.io.IOException;
import dev.daniboy.donutcore.config.MainConfig;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import java.util.concurrent.ConcurrentHashMap;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.scheduler.BukkitRunnable;
import java.util.UUID;
import java.util.Map;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.event.Listener;

public class TeleportManager implements Listener
{
    private final DonutCore plugin;
    private final Map<UUID, BukkitRunnable> tasks;
    private static int QFV12yhpY7 = 0;
    private transient int 2OHRem2nNh = 1949111784;
    private static String[] nothing_to_see_here;
    
    public TeleportManager(final DonutCore plugin, final int n) {
        final int n2 = 0x2F3F4C45 ^ 0x5E1197EE;
    Label_0067:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 1073495133: {
                    continue;
                }
                case 189446325: {}
                case 1573626907: {
                    break Label_0067;
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
        }
        int n3 = 0x5D09ACD7 ^ (0x2051C1E9 ^ (Integer.parseInt("64199518") ^ n));
        Label_0158: {
        Label_0140:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                    case 2134421731: {
                        continue;
                    }
                    case 28188300: {
                        break Label_0140;
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                    case 1152773266: {
                        break Label_0158;
                    }
                }
            }
            n3 ^= 0x283D2265;
        }
        this.tasks = (Map<UUID, BukkitRunnable>)new ConcurrentHashMap();
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)plugin);
    }
    
    public void teleportWithCountdown$168586022(final Player player, final Location location, final int n) {
        final int n2 = 0x106DC9D8 ^ (0x36EF89FC ^ (0x69CDF853 ^ (this.2OHRem2nNh ^ n)));
        final int countdown_DURATION = MainConfig.Teleport.COUNTDOWN_DURATION;
        this.cancelExistingTask$339589993(player, 617524192);
        final BukkitRunnable bukkitRunnable = new BukkitRunnable() {
            int countdown = countdown_DURATION;
            private static int zmTgmkgZMs = 0;
            private transient int SRM4eZ7WOr = 702382039;
            private static byte[] zsevriybgi;
            private static String[] nothing_to_see_here;
            
            {
            Label_0134:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                        case 1105604851: {
                            continue;
                        }
                        default: {
                            throw new IOException();
                        }
                        case 761802611: {}
                        case 95235251: {
                            break Label_0134;
                        }
                    }
                }
                final int n3 = 0x756AC611 ^ (0x12D7C207 ^ (Integer.parseInt("1999736320") ^ n));
                final int n4 = 0x7F031AAC ^ rpynqfmhzxtnivwl(n3, 1920355066);
            }
            
            public void run() {
                int n = 0x2B54F5F2 ^ (0x5E62EA05 ^ (0x277034DF ^ this.SRM4eZ7WOr));
                Label_0669: {
                    if (this.countdown > (0x102B8B34 ^ n)) {
                        final int n2 = 0x2B25415D ^ n;
                        final MessagesConfig teleportcountdown = MessagesConfig.TELEPORTCOUNTDOWN;
                        final Player val$player = player;
                        final String[] array = new String[(byte)(0x3B0ECA6B ^ n2)];
                        array[(byte)(0x3B0ECA69 ^ n2)] = jjbwlawcpr(aojtdqrqrfxneum(), n2);
                        array[(byte)(0x3B0ECA68 ^ n2)] = String.valueOf(this.countdown);
                        teleportcountdown.send((CommandSender)val$player, array);
                        final int n3 = 0x735FD34E ^ n2;
                        SoundConfig.TELEPORTCOUNTDOWN.play(player);
                        final int n4 = 0x3943139F ^ n3;
                        this.countdown -= (byte)(0x71120AB9 ^ n4);
                        final int n5 = 0x389C19B0 ^ n4;
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 243469649) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        }
                        catch (final IllegalAccessException ex) {
                            int rpynqfmhzxtnivwl = 0;
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n5)) {
                                default: {
                                    throw new IOException("Error in hash");
                                }
                                case 1282447426: {
                                    rpynqfmhzxtnivwl = (0x6D9461DE ^ n5);
                                    break;
                                }
                                case -334160208: {
                                    rpynqfmhzxtnivwl = rpynqfmhzxtnivwl(n5, 966316288);
                                    break;
                                }
                            }
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rpynqfmhzxtnivwl)) {
                                    case 1548023013: {
                                        continue;
                                    }
                                    case 99818084: {}
                                    case 1734728318: {
                                        break Label_0669;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            return;
                        }
                    }
                    Label_0403: {
                    Label_0396:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                                case 1411310536: {
                                    continue;
                                }
                                case 257183135: {
                                    break Label_0396;
                                }
                                case 791882089: {
                                    break Label_0403;
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                        n ^= 0x6AB24817;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) != 227119242) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                                case 2072358618: {
                                    continue;
                                }
                                case 227119242: {}
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                    }
                    else {
                        int rpynqfmhzxtnivwl2 = rpynqfmhzxtnivwl(n, 406276139);
                        if ((this.isCancelled() ? 1 : 0) == (0x62AE8B08 ^ rpynqfmhzxtnivwl2)) {
                            player.teleport(location);
                            MessagesConfig.TELEPORTING.send((CommandSender)player);
                            SoundConfig.TELEPORTCOMPLETE.play(player);
                        }
                        else {
                            Label_0723: {
                            Label_0716:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rpynqfmhzxtnivwl2)) {
                                        case 298639180: {
                                            continue;
                                        }
                                        case 254955505: {
                                            break Label_0716;
                                        }
                                        case 953332110: {
                                            break Label_0723;
                                        }
                                        default: {
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                                rpynqfmhzxtnivwl2 ^= 0x34A3F3DD;
                            }
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(rpynqfmhzxtnivwl2) != 112872465) {
                                throw new IllegalAccessException();
                            }
                            rpynqfmhzxtnivwl(rpynqfmhzxtnivwl2, 920033666);
                        }
                        TeleportManager.this.tasks.remove((Object)player.getUniqueId());
                        this.cancel();
                    }
                }
            }
            
            static {
                (TeleportManager$1.nothing_to_see_here = new String[19])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28e4\u28e4\u28e4\u28e4\u28e4\u28f6\u28e6\u28e4\u28c4\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f4\u28ff\u287f\u281b\u2809\u2819\u281b\u281b\u281b\u281b\u283b\u28bf\u28ff\u28f7\u28e4\u2840\u2800\u2800\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28fc\u28ff\u280b\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28c0\u28c0\u2808\u28bb\u28ff\u28ff\u2844\u2800\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28f8\u28ff\u284f\u2800\u2800\u2800\u28e0\u28f6\u28fe\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28bf\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2801\u2800\u2800\u28b0\u28ff\u28ff\u28ef\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u2819\u28bf\u28f7\u2844\u2800";
                TeleportManager$1.nothing_to_see_here[5] = "\u2800\u2800\u28c0\u28e4\u28f4\u28f6\u28f6\u28ff\u285f\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28f7\u2800";
                TeleportManager$1.nothing_to_see_here[6] = "\u2800\u28b0\u28ff\u285f\u280b\u2809\u28f9\u28ff\u2847\u2800\u2800\u2800\u2818\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28e4\u28e4\u28e4\u28f6\u28f6\u28f6\u28f6\u28ff\u28ff\u28ff\u2800";
                TeleportManager$1.nothing_to_see_here[7] = "\u2800\u28b8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2800";
                TeleportManager$1.nothing_to_see_here[8] = "\u2800\u28f8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2809\u283b\u283f\u28ff\u28ff\u28ff\u28ff\u287f\u283f\u283f\u281b\u28bb\u28ff\u2847\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[9] = "\u2800\u28ff\u28ff\u2801\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28e7\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[10] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[11] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[12] = "\u2800\u28bf\u28ff\u2846\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[13] = "\u2800\u2838\u28ff\u28e7\u2840\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2803\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[14] = "\u2800\u2800\u281b\u28bf\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u28f0\u28ff\u28ff\u28f7\u28f6\u28f6\u28f6\u28f6\u2836\u2800\u28a0\u28ff\u28ff\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28fd\u28ff\u284f\u2801\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28b9\u28ff\u2846\u2800\u2800\u2800\u28f8\u28ff\u2807\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28e6\u28c4\u28c0\u28e0\u28f4\u28ff\u28ff\u2801\u2800\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u287f\u280f\u2800\u2800\u2800\u2800";
                TeleportManager$1.nothing_to_see_here[18] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u281b\u283b\u283f\u283f\u283f\u283f\u280b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                TeleportManager$1.zsevriybgi = nxxcrdwebkhlhng();
                TeleportManager$1.zmTgmkgZMs = (0x28F577C1 ^ new Random(-7034240712139272L).nextInt());
            }
            
            public static String jjbwlawcpr(final byte[] array, final int n) {
                final byte[] bytes = Integer.toString(n).getBytes();
                for (int i = 0; i < array.length; ++i) {
                    final int n2 = i;
                    array[n2] ^= bytes[i % bytes.length];
                    final int n3 = i;
                    array[n3] ^= TeleportManager$1.zsevriybgi[i % TeleportManager$1.zsevriybgi.length];
                }
                return new String(array, StandardCharsets.UTF_16);
            }
            
            private static byte[] nxxcrdwebkhlhng() {
                return new byte[] { 69, 124, 63, 46, 67, 39, 99, 89, 118, 98, 18, 103, 3, 107, 63, 119, 86, 97, 24, 127, 17, 124, 71, 50, 86, 124, 25, 97, 61, 46, 47, 20, 33, 103, 41, 2, 59, 92, 71, 98, 27, 20, 92, 29, 117, 54, 126, 113, 125 };
            }
            
            private static byte[] aojtdqrqrfxneum() {
                return new byte[] { -126, -70, 15, 117, 113, 125, 83, 26, 67, 53, 43, 35, 59, 61, 10, 40, 96, 35, 33, 40 };
            }
            
            private static int rpynqfmhzxtnivwl(final int n, final int n2) {
                return n ^ n2;
            }
        };
        this.tasks.put((Object)player.getUniqueId(), (Object)bukkitRunnable);
        bukkitRunnable.runTaskTimer((Plugin)this.plugin, 0L, 20L);
    }
    
    private void cancelExistingTask$339589993(final Player player, final int n) {
        final int n2 = 0x4C70313C ^ (0x67F5D0B4 ^ (0x712454E0 ^ (this.2OHRem2nNh ^ n)));
        final BukkitRunnable bukkitRunnable = (BukkitRunnable)this.tasks.remove((Object)player.getUniqueId());
        int n3 = 0x4E8D77A7 ^ n2;
        if (bukkitRunnable == null) {
            Label_0159: {
            Label_0152:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 1034149802: {
                            continue;
                        }
                        case 61430174: {
                            break Label_0152;
                        }
                        case 1180735406: {
                            break Label_0159;
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                }
                n3 ^= 0x4EB65BAB;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) == 97366671) {
                qeimkvfehxvdmpao(n3, 1865146367);
                return;
            }
            qeimkvfehxvdmpao(n3, 784454483);
            throw new RuntimeException();
        }
        bukkitRunnable.cancel();
    }
    
    @EventHandler
    public void onPlayerMove(final PlayerMoveEvent playerMoveEvent) {
        final int n = 0x4BFE7F4C ^ (0x7CF3F7CC ^ (0x42D5566F ^ this.2OHRem2nNh));
        final Player player = playerMoveEvent.getPlayer();
        final int n2 = 0xA8A105D ^ n;
        final UUID uniqueId = player.getUniqueId();
        final int n3 = 0x20783E19 ^ n2;
        if ((this.tasks.containsKey((Object)uniqueId) ? 1 : 0) != (0x6C2F4E7D ^ n3)) {
            final int n4 = 0x5DCD4464 ^ n3;
            if ((this.hasPlayerMoved$1127470522(playerMoveEvent.getFrom(), playerMoveEvent.getTo(), 652646192) ? 1 : 0) != (0x31E20A19 ^ n4)) {
                this.cancelExistingTask$339589993(player, 617524192);
                MessagesConfig.TELEPORTCANCELLED.send((CommandSender)player);
                SoundConfig.TELEPORTCANCEL.play(player);
            }
            else {
                final int qeimkvfehxvdmpao = qeimkvfehxvdmpao(n4, 858182167);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao) != 43550793) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao)) {
                            case 1144301361: {
                                continue;
                            }
                            case 43550793: {}
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
        else {
            final int n5 = 0x6E484C31 ^ n3;
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 37785664) {
                throw new IOException();
            }
            qeimkvfehxvdmpao(n5, 2080164560);
        }
    }
    
    private boolean hasPlayerMoved$1127470522(final Location location, final Location location2, final int n) {
        int n2 = 0x7733A28C ^ (0x6F03890E ^ (0x5C756273 ^ (this.2OHRem2nNh ^ n)));
        if (location2 != null) {
            final int n3 = 0x7B260818 ^ n2;
            int qeimkvfehxvdmpao = 0;
            Label_0138: {
                if (location.getBlockX() == location2.getBlockX()) {
                    final int n4 = 0x72010E78 ^ n3;
                    if (location.getBlockY() == location2.getBlockY()) {
                        final int n5 = 0x104EE623 ^ n4;
                        if (location.getBlockZ() != location2.getBlockZ()) {
                            qeimkvfehxvdmpao = (0x7F43F156 ^ n5);
                        }
                        else {
                            final int qeimkvfehxvdmpao2 = qeimkvfehxvdmpao(n5, 699210430);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao2) != 212823367) {
                                throw new IOException();
                            }
                            final int n6 = qeimkvfehxvdmpao(qeimkvfehxvdmpao2, 779629652);
                            return (byte)(0x4F1AAEBE ^ n6) != 0;
                        }
                    }
                    else {
                        qeimkvfehxvdmpao = qeimkvfehxvdmpao(n4, 1516579044);
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao) != 45484877) {
                            qeimkvfehxvdmpao(qeimkvfehxvdmpao, 612119252);
                            throw new IOException();
                        }
                    Label_0452:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao)) {
                                case 1944722095: {
                                    break Label_0138;
                                }
                                case 881711252: {
                                    continue;
                                }
                                case 45484877: {
                                    break Label_0452;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        qeimkvfehxvdmpao ^= 0x35683F91;
                    }
                }
                else {
                    qeimkvfehxvdmpao = (0x29C55BB4 ^ n3);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao) != 51438394) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao)) {
                                case 205801802: {
                                    continue;
                                }
                                case 51438394: {}
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                    }
                    else {
                    Label_0544:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao)) {
                                case 1993779021: {
                                    break Label_0138;
                                }
                                case 456477987: {
                                    continue;
                                }
                                case 51438394: {
                                    break Label_0544;
                                }
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                        qeimkvfehxvdmpao ^= 0x34C942B9;
                    }
                }
            }
            final byte b = (byte)(0x378C7103 ^ qeimkvfehxvdmpao);
            Label_0199: {
            Label_0192:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao)) {
                        case 1485665299: {
                            continue;
                        }
                        case 195046783: {
                            break Label_0192;
                        }
                        case 776812117: {
                            break Label_0199;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                qeimkvfehxvdmpao ^= 0x6C068D82;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(qeimkvfehxvdmpao) != 22876850) {
                        throw null;
                    }
                    throw new IOException();
                }
                catch (final IOException ex) {
                    int n7 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(qeimkvfehxvdmpao)) {
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case -274566143: {
                            n7 = (0x3DDD182C ^ qeimkvfehxvdmpao);
                            break;
                        }
                        case -598219774: {
                            n7 = (0x5BA3AA2C ^ qeimkvfehxvdmpao);
                            break;
                        }
                    }
                    qeimkvfehxvdmpao(n7, 150353179);
                    return b != 0;
                }
            }
        }
        Label_0347: {
        Label_0340:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                    case 2099990695: {
                        continue;
                    }
                    case 238160778: {
                        break Label_0340;
                    }
                    case 293138017: {
                        break Label_0347;
                    }
                    default: {
                        throw new IOException();
                    }
                }
            }
            n2 ^= 0x2DE4FC70;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2) != 12677957) {
            throw new IOException();
        }
        final int n6 = qeimkvfehxvdmpao(n2, 861418201);
        final byte b = (byte)(0x4F1AAEBE ^ n6);
        return b != 0;
    }
    
    static {
        (TeleportManager.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        TeleportManager.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
        TeleportManager.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
        TeleportManager.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        TeleportManager.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
        TeleportManager.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        TeleportManager.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
        TeleportManager.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
        TeleportManager.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        TeleportManager.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
        TeleportManager.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
        TeleportManager.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
        TeleportManager.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
        TeleportManager.QFV12yhpY7 = (0x9442B297 ^ new Random(2338231151259859212L).nextInt());
    }
    
    public static String fgypqzdfgs(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] jjikrmuuvqhhkkd() {
        return new byte[] { 67, 60, 13, 31, 58, 46, 95, 19, 24, 96, 3, 37, 3, 35, 85, 10, 13, 34, 92, 60, 60, 31, 51, 121, 41 };
    }
    
    private static int qeimkvfehxvdmpao(final int n, final int n2) {
        return n ^ n2;
    }
}
