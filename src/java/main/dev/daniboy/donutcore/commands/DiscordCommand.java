package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.command.Command;

public class DiscordCommand extends Command
{
    private static int yc0D7QajYv = 0;
    private transient int uCtaEU1JsW = 440995502;
    private static byte[] mkhcyfbkqf;
    private static String[] nothing_to_see_here;
    
    public DiscordCommand() {
        final int n = 0x4FAD405F ^ 0x588DB4F5;
        super("discord");
    Label_0082:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                case 512911945: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 174258440: {}
                case 214945065: {
                    break Label_0082;
                }
            }
        }
        final int n2 = 0x58307F6E ^ (0x38A52101 ^ Integer.parseInt("350418235"));
        final int n3 = 0x71245D1C ^ mjguoxigenadawwv(n2, 1031809933);
        this.setDescription("Provides the Discord server link.");
        this.setUsage("/discord");
        this.setPermission("donutcore.discord");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        int n = 0x204F79D7 ^ (0x575CD8B ^ (0x27733DCF ^ this.uCtaEU1JsW));
        if (((commandSender instanceof Player) ? 1 : 0) != (0x4CD3DEAE ^ n)) {
            final int n2 = 0x1487B3AD ^ n;
            final Player player = (Player)commandSender;
            int n3 = 0x5CBF6800 ^ n2;
            Label_0239: {
            Label_0232:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 957351681: {
                            continue;
                        }
                        case 77353049: {
                            break Label_0232;
                        }
                        case 1114637496: {
                            break Label_0239;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
                n3 ^= 0x463C7E57;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 25246757) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    int n4 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case 381409954: {
                            n4 = mjguoxigenadawwv(n3, 1414796937);
                            break;
                        }
                        case -576693053: {
                            n4 = mjguoxigenadawwv(n3, 1832347205);
                            break;
                        }
                    }
                Label_0379:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 1811043273: {
                                continue;
                            }
                            case 194949727: {
                                n4 ^= 0x64A4F285;
                            }
                            case 725653352: {
                                break Label_0379;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    if ((player.hasPermission(stgmnbnyuc(glxpiavrkqtdlob(), n4)) ? 1 : 0) == (0x72279F58 ^ n4)) {
                        final int n5 = 0x185C8145 ^ n4;
                        MessagesConfig.NOPERMISSION.send((CommandSender)player);
                        return (byte)(0x12EF9BF0 ^ (0x789485EC ^ n5)) != 0;
                    }
                Label_0511:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                            case 180455265: {
                                continue;
                            }
                            case 221034141: {
                                n4 ^= 0x1887D323;
                            }
                            case 337693200: {
                                break Label_0511;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) == 244776590) {
                        final int n6 = 0x214DEA5E ^ n4;
                        MessagesConfig.DISCORD.send((CommandSender)player);
                        return (byte)(0x1382E1B4 ^ (0x586F4790 ^ n6)) != 0;
                    }
                }
            }
        }
        else {
            Label_0123: {
            Label_0116:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                        case 1503610594: {
                            continue;
                        }
                        case 81408930: {
                            break Label_0116;
                        }
                        case 1250793920: {
                            break Label_0123;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
                n ^= 0x1FAA9548;
            }
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) == 29053044) {
                final int n7 = 0x5C14737C ^ n;
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x4276588 ^ (0xB4A5D13 ^ n7)) != 0;
            }
            mjguoxigenadawwv(n, 1236661469);
        }
        throw new IllegalAccessException();
    }
    
    static {
        (DiscordCommand.nothing_to_see_here = new String[17])[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
        DiscordCommand.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
        DiscordCommand.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
        DiscordCommand.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
        DiscordCommand.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
        DiscordCommand.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
        DiscordCommand.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
        DiscordCommand.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
        DiscordCommand.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
        DiscordCommand.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
        DiscordCommand.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
        DiscordCommand.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
        DiscordCommand.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
        DiscordCommand.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
        DiscordCommand.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
        DiscordCommand.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
        DiscordCommand.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
        DiscordCommand.mkhcyfbkqf = glelrnihpfxoczv();
        DiscordCommand.yc0D7QajYv = (0xCC63367E ^ new Random(5593308598697382775L).nextInt());
    }
    
    public static String stgmnbnyuc(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= DiscordCommand.mkhcyfbkqf[i % DiscordCommand.mkhcyfbkqf.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] glelrnihpfxoczv() {
        return new byte[] { 48, 66, 97, 50, 76, 80, 121, 50, 10, 48, 18, 127, 74, 8, 83, 32, 15, 72, 105, 8, 109, 77, 102, 62, 15, 24, 50, 84 };
    }
    
    private static byte[] glxpiavrkqtdlob() {
        return new byte[] { -1, -124, 80, 99, 125, 6, 64, 111, 56, 117, 35, 50, 123, 94, 98, 118, 54, 9, 91, 93, 92, 90, 87, 111, 62, 72, 11, 20, 2, 17, 80, 100, 125, 23, 72, 111 };
    }
    
    private static int mjguoxigenadawwv(final int n, final int n2) {
        return n ^ n2;
    }
}
