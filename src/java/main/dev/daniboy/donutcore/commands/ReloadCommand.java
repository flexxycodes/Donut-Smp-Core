package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.gui.impl.SpawnGUI;
import dev.daniboy.donutcore.config.ConfigManager;
import dev.daniboy.donutcore.gui.impl.HelpGUI;
import dev.daniboy.donutcore.gui.impl.MediaGUI;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.CommandExecutor;

public class ReloadCommand implements CommandExecutor
{
    private final DonutCore plugin;
    private final MediaGUI mediaGui;
    private final HelpGUI helpGui;
    private final ConfigManager configManager;
    private final SpawnGUI spawnGui;
    private static int hVUdwXn4MS = 0;
    private transient int ZF63kjl4R5 = 277825525;
    private static String[] nothing_to_see_here;
    
    public ReloadCommand(final DonutCore plugin, final ConfigManager configManager, final int n) {
        final int n2 = 0x254DEE90 ^ 0x6E3B3A67;
        bserlnpapxokhyoi(n2, 1512703871);
        final int n3 = 0x2816F61 ^ (0x7010687D ^ (Integer.parseInt("199652477") ^ n));
        final int n4 = 0x3897DBD0 ^ (0x750E9B9D ^ n3);
        this.plugin = plugin;
        final int n5 = 0x30A3E20 ^ n4;
        this.mediaGui = plugin.getMediaGui$275199606(1384060441);
        final int n6 = 0x37CB4350 ^ n5;
        this.helpGui = plugin.getHelpGui$1055651724(1578111927);
        final int n7 = 0x13B9B9FB ^ n6;
        this.spawnGui = plugin.getSpawnGui$166485211(362522864);
        int n8 = 0x6578B4F3 ^ n7;
        ConfigManager configManager2;
        if (configManager != null) {
            configManager2 = configManager;
        }
        else {
        Label_0268:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n8)) {
                    case 1209109653: {
                        continue;
                    }
                    default: {
                        throw new IOException();
                    }
                    case 1273639038: {
                        break Label_0268;
                    }
                    case 195000315: {
                        n8 ^= 0xA018115;
                        break Label_0268;
                    }
                }
            }
            configManager2 = new ConfigManager(plugin);
        }
        this.configManager = configManager2;
    }
    
    public boolean onCommand(final CommandSender commandSender, final Command command, final String s, final String[] array) {
        int n = 0x544FCFC9 ^ (0x2D2A2913 ^ (0x351DA146 ^ this.ZF63kjl4R5));
        Label_0379: {
            if (((commandSender instanceof Player) ? 1 : 0) != (0x34F66369 ^ n)) {
                final int n2 = 0x5451C1DF ^ n;
                final Player player = (Player)commandSender;
                int n3 = 0x2A87D5B2 ^ n2;
                if ((player.hasPermission(kvbvgzqczq(anizgyzhxjonrct(), pxpkkafpbngodxy(), n3)) ? 1 : 0) == (0x4A207704 ^ n3)) {
                    final int n4 = 0x7E6F41BC ^ n3;
                    MessagesConfig.NOPERMISSION.send(commandSender);
                    final int n5 = 0x603AD184 ^ n4;
                    SoundConfig.NOPERMISSION.play(player);
                    return (byte)(0x241BAF78 ^ (0x706E4845 ^ n5)) != 0;
                }
                Label_0359: {
                Label_0352:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 168644611: {
                                continue;
                            }
                            case 262057143: {
                                break Label_0352;
                            }
                            case 1233879761: {
                                break Label_0359;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n3 ^= 0x624F84C5;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 240697386) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 1831024560: {
                                continue;
                            }
                            case 240697386: {}
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
                else {
                    n = (0x4A09B2A5 ^ n3);
                }
            }
            else {
                Label_0223: {
                Label_0216:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                            case 690707919: {
                                continue;
                            }
                            case 110974061: {
                                break Label_0216;
                            }
                            case 42796475: {
                                break Label_0223;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n ^= 0x630792B;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) != 39837721) {
                    throw new IOException();
                }
            Label_0284:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                        case 336248170: {
                            continue;
                        }
                        case 39837721: {
                            break Label_0284;
                        }
                        case 1638520872: {
                            break Label_0379;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n ^= 0x50A05B26;
            }
        }
        this.configManager.reload();
        final int n6 = 0x5A050F49 ^ n;
        this.mediaGui.loadMediaConfigValues$2120577358(54860659);
        final int n7 = 0x40DF9571 ^ n6;
        this.helpGui.loadHelpConfigValues$1430792781(839749214);
        final int n8 = 0x251E8E93 ^ n7;
        this.spawnGui.loadSpawnConfigValues$882403349(870176311);
        final int n9 = 0x66E9C516 ^ n8;
        MessagesConfig.RELOAD.send(commandSender);
        return (byte)(0x77990BC4 ^ (0x4CD29B1C ^ n9)) != 0;
    }
    
    static {
        (ReloadCommand.nothing_to_see_here = new String[15])[0] = " \u2801\u287c\u280b\u2800\u28c6\u2800\u2800\u28f0\u28ff\u28eb\u28fe\u28bf\u28ff\u28ff\u280d\u28a0\u2820\u2800\u2800\u2880\u2830\u28be\u28fa\u28fb\u28ff\u28ff\u28ff\u28f7\u2840\u2800";
        ReloadCommand.nothing_to_see_here[1] = "\u28e5\u2800\u2800\u2800\u2801\u2800\u2820\u28bb\u28ac\u2801\u28e0\u28fe\u281b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2810\u2831\u280f\u2849\u2819\u28ff\u28ff\u2847\u2800";
        ReloadCommand.nothing_to_see_here[2] = "\u28b3\u2800\u28b0\u2856\u2800\u2800\u2808\u2800\u28fa\u28b0\u28ff\u28bb\u28fe\u28f6\u28ff\u28ff\u28f6\u28f6\u28e4\u28e4\u28f4\u28fe\u28ff\u28f7\u28fc\u2846\u28b8\u28ff\u28e7\u2800";
        ReloadCommand.nothing_to_see_here[3] = "\u2808\u2800\u281c\u2808\u28c0\u28d4\u28e6\u28a8\u28ff\u28ff\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c5\u28fc\u281b\u28b9\u2800";
        ReloadCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u288b\u287f\u287f\u28ef\u28ed\u285f\u28df\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2858\u2800";
        ReloadCommand.nothing_to_see_here[5] = "\u2840\u2810\u2800\u2800\u2800\u28ff\u28ef\u287f\u28ff\u28ff\u28ff\u28ef\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28c9\u28bd\u28ff\u2846\u2800\u2800";
        ReloadCommand.nothing_to_see_here[6] = "\u28b3\u2800\u2804\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2819\u2809\u2809\u2809\u281b\u28fb\u289b\u28ff\u281b\u2803\u2800\u2810\u281b\u283b\u28ff\u2847\u2800\u2800";
        ReloadCommand.nothing_to_see_here[7] = "\u28fe\u2804\u2800\u2800\u28b8\u28ff\u28ff\u287f\u281f\u281b\u2801\u2880\u2800\u2880\u2844\u28c0\u28e0\u28fe\u28ff\u28ff\u2860\u28f4\u28ce\u28c0\u28e0\u28e0\u28ff\u2847\u2800\u2800";
        ReloadCommand.nothing_to_see_here[8] = "\u28e7\u2800\u28f4\u28c4\u28fd\u28ff\u28ff\u28ff\u28f6\u28f6\u28d6\u28f6\u28ec\u28fe\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800";
        ReloadCommand.nothing_to_see_here[9] = "\u28ff\u28f6\u28c8\u286f\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28f9\u28a7\u28ff\u28ff\u28ff\u28c4\u2819\u28bf\u28ff\u28ff\u28ff\u2807\u2800\u2800";
        ReloadCommand.nothing_to_see_here[10] = "\u2839\u28ff\u28ff\u28e7\u288c\u28bd\u28fb\u28bf\u28ef\u28ff\u28ff\u28ff\u28ff\u281f\u28e0\u2858\u283f\u281f\u281b\u281b\u281f\u281b\u28e7\u2848\u283b\u28fe\u28ff\u2800\u2800\u2800";
        ReloadCommand.nothing_to_see_here[11] = "\u2800\u2808\u2809\u28f7\u287f\u28fd\u2836\u287e\u28bf\u28ff\u28ff\u28ff\u2883\u28e4\u28ff\u28f7\u28e4\u28e4\u28c4\u28c4\u28e0\u28fc\u287f\u28b7\u2880\u28ff\u284f\u2800\u2800\u2800";
        ReloadCommand.nothing_to_see_here[12] = "\u2800\u2800\u2880\u28ff\u28f7\u280c\u28c8\u28cf\u28dd\u283d\u287f\u28f7\u28fe\u28cf\u28c0\u28c9\u28c9\u28c0\u28c0\u28c0\u28e0\u28e0\u28c4\u2878\u28fe\u28ff\u2803\u2800\u2800\u2800";
        ReloadCommand.nothing_to_see_here[13] = "\u2800\u28f0\u287f\u28ff\u28e7\u2850\u2804\u2831\u28ff\u28fa\u28fd\u289f\u28ff\u28ff\u28bf\u28ff\u28cd\u2809\u2880\u28c0\u28d0\u28fc\u28ef\u2857\u281f\u284f\u2800\u2800\u2800\u2800";
        ReloadCommand.nothing_to_see_here[14] = "\u28f0\u28ff\u2800\u28ff\u28ff\u28f4\u2840\u2802\u2818\u28b9\u28ed\u2842\u285a\u283f\u28bf\u28ff\u28ff\u28ff\u287f\u28bf\u28bf\u287f\u283f\u2881\u28f4\u28ff\u28f7\u28f6\u28e6\u28e4";
        ReloadCommand.hVUdwXn4MS = (0x979ABC6C ^ new Random(5741867631813970348L).nextInt());
    }
    
    public static String kvbvgzqczq(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] pxpkkafpbngodxy() {
        return new byte[] { 105, 82, 107, 80, 69, 84, 30, 118, 8, 48, 26, 10, 7, 93, 80, 101, 80, 29, 98, 53, 89, 124, 27, 29, 18, 89, 122, 6, 24, 11, 89, 100, 71, 99, 67, 90, 27, 113, 79, 76, 77, 41, 50, 75, 103, 22, 114, 43, 64, 6, 38, 77, 58, 85, 7, 119, 121, 84, 63, 55, 25, 127, 101, 46, 112, 96, 65, 111, 46, 63, 102, 43, 26, 12, 126, 126, 71, 117, 70, 120, 78, 116, 37, 32, 95, 16, 84, 99, 95, 89, 121 };
    }
    
    private static byte[] anizgyzhxjonrct() {
        return new byte[] { -90, -97, 95, 7, 115, 15, 47, 46, 56, 113, 43, 76, 51, 13, 102, 62, 97, 89, 82, 100, 104, 96, 47, 92, 36, 8, 75, 92, 40, 80, 104, 55, 115, 52 };
    }
    
    private static int bserlnpapxokhyoi(final int n, final int n2) {
        return n2 ^ n;
    }
}
