package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import org.bukkit.ChatColor;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.CommandExecutor;

public class HelpMessageCommand implements CommandExecutor
{
    private final DonutCore plugin;
    private static int mkEmrqoO0O = 0;
    private transient int Wb4mam2gc4 = 1834209170;
    private static String wajsecajoq;
    private static String[] nothing_to_see_here;
    
    public HelpMessageCommand(final DonutCore plugin, final int n) {
        int n2 = 0x48299430 ^ (0x74F264D ^ (Integer.parseInt("2052323370") ^ n));
    Label_0099:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 269220561: {
                    continue;
                }
                case 72792189: {
                    n2 ^= 0x3D36B99E;
                }
                case 162779836: {
                    break Label_0099;
                }
                default: {
                    throw new IOException();
                }
            }
        }
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender commandSender, final Command command, final String s, final String[] array) {
        int n = 0x11840C9A ^ (0x2DA86CCC ^ (0x183150D5 ^ this.Wb4mam2gc4));
        if (((commandSender instanceof Player) ? 1 : 0) == (0x71BFE5E5 ^ n)) {
            final int n2 = 0x7B0B802E ^ n;
            MessagesConfig.ONLYPLAYERS.send(commandSender);
            return (byte)(0x66A63D10 ^ (0x6C1258DA ^ n2)) != 0;
        }
        Label_0135: {
        Label_0128:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                    case 447862912: {
                        continue;
                    }
                    case 207862996: {
                        break Label_0128;
                    }
                    case 1640542051: {
                        break Label_0135;
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
            }
            n ^= 0x742EC7AF;
        }
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n) == 87561652) {
            final int n3 = 0x4575AFD7 ^ n;
            final Player player = (Player)commandSender;
            final int n4 = 0x40BAF5B6 ^ n3;
            player.sendMessage(String.valueOf((Object)ChatColor.GOLD) + "======= " + String.valueOf((Object)ChatColor.GREEN) + "DonutCore Help" + String.valueOf((Object)ChatColor.GOLD) + " =======");
            final int n5 = 0x1AA67572 ^ n4;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/donutcore reload" + String.valueOf((Object)ChatColor.WHITE) + " - Reloads the plugin configuration.");
            final int n6 = 0xD2A1BCE ^ n5;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/donutcore help" + String.valueOf((Object)ChatColor.WHITE) + " - Displays this help message.");
            final int n7 = 0x343AE72A ^ n6;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/setspawn" + String.valueOf((Object)ChatColor.WHITE) + " - Sets the spawn location.");
            final int n8 = 0x797AB8C0 ^ n7;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/setafk" + String.valueOf((Object)ChatColor.WHITE) + " - Sets the afk location.");
            final int n9 = 0x2688815F ^ n8;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/spawn" + String.valueOf((Object)ChatColor.WHITE) + " - Open the Spawn GUI or teleport to Spawn location.");
            final int n10 = 0x65F56C59 ^ n9;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/afk" + String.valueOf((Object)ChatColor.WHITE) + " - Open the AFK GUI or teleport to AFK location.");
            final int n11 = 0x27920199 ^ n10;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/msg <player> <message>" + String.valueOf((Object)ChatColor.WHITE) + " - Send a private message to a player.");
            final int n12 = 0x7152CA55 ^ n11;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/r <message>" + String.valueOf((Object)ChatColor.WHITE) + " - Reply to the last private message received.");
            final int n13 = 0x5C29F3E8 ^ n12;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/msgtoggle" + String.valueOf((Object)ChatColor.WHITE) + " - Toggle private messages on or off.");
            final int n14 = 0x3FA97268 ^ n13;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/help" + String.valueOf((Object)ChatColor.WHITE) + " - Opens the Help GUI.");
            final int n15 = 0x3AC932FC ^ n14;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/media" + String.valueOf((Object)ChatColor.WHITE) + " - Opens the Media GUI.");
            final int n16 = 0xA4B331F ^ n15;
            player.sendMessage(String.valueOf((Object)ChatColor.AQUA) + "/rules" + String.valueOf((Object)ChatColor.WHITE) + " - Opens the Rules GUI.");
            final int n17 = 0x19FCFA1E ^ n16;
            player.sendMessage(String.valueOf((Object)ChatColor.GOLD) + "====================================");
            return (byte)(0x42F5A942 ^ (0x4724BC89 ^ n17)) != 0;
        }
    Label_1011:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                case 2056472764: {
                    continue;
                }
                case 87561652: {}
                default: {
                    break Label_1011;
                }
            }
        }
        throw new RuntimeException();
    }
    
    static {
        (HelpMessageCommand.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        HelpMessageCommand.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        HelpMessageCommand.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        HelpMessageCommand.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        HelpMessageCommand.wajsecajoq = ByteBuffer.wrap(quenqlvvkmvmzrr()).asCharBuffer().toString();
        HelpMessageCommand.mkEmrqoO0O = (0x98370A4A ^ new Random(7428253483715799531L).nextInt());
    }
    
    public static String yvbbhwbfuy(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = HelpMessageCommand.wajsecajoq.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] quenqlvvkmvmzrr() {
        return new byte[0];
    }
}
