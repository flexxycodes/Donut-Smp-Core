package dev.daniboy.donutcore.commands;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.command.Command;

public class RulesCommand extends Command
{
    private final DonutCore plugin;
    private static int y7lDhUCL4Z = 0;
    private transient int dRfa1I3BXt = 1455587039;
    private static String syrlerkppp;
    private static String[] nothing_to_see_here;
    
    public RulesCommand(final DonutCore plugin, final int n) {
        final int n2 = 0x44F40CFC ^ 0x35866A;
        super("rules");
        vhfdzjzhpbyzqeja(n2, 2029055496);
        int n3 = 0x65BA81C4 ^ (0x6144FEE5 ^ (Integer.parseInt("1061788341") ^ n));
    Label_0118:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                case 1254018531: {
                    continue;
                }
                default: {
                    throw new IOException();
                }
                case 80941268: {
                    break Label_0118;
                }
                case 77565635: {
                    n3 ^= 0xD44D1EB;
                    break Label_0118;
                }
            }
        }
        this.plugin = plugin;
        this.setDescription("Opens the rules GUI");
        this.setUsage("/rules");
        this.setPermission("donutcore.rules");
    }
    
    public boolean execute(final CommandSender commandSender, final String s, final String[] array) {
        final int n = 0x3746D4F2 ^ (0x3BE39452 ^ (0x2A3D2F08 ^ this.dRfa1I3BXt));
        if (((commandSender instanceof Player) ? 1 : 0) != (0x654C2A52 ^ n)) {
            final int n2 = 0x2AF7F060 ^ n;
            final Player player = (Player)commandSender;
            final int n3 = 0x3C6151B4 ^ (0x473FDFC1 ^ n2);
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 108816300) {
                    throw null;
                }
                throw new IOException();
            }
            catch (final IOException ex) {
                int n4 = 0;
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                    case -1490378183: {
                        n4 = vhfdzjzhpbyzqeja(n3, 1420493769);
                        break;
                    }
                    default: {
                        throw new RuntimeException("Error in hash");
                    }
                    case 475449386: {
                        n4 = vhfdzjzhpbyzqeja(n3, 600084107);
                        break;
                    }
                }
            Label_0287:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                        case 1886304668: {
                            continue;
                        }
                        case 177711597: {
                            n4 ^= 0x9481947;
                        }
                        case 196447441: {
                            break Label_0287;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                if ((player.hasPermission(wspzbispkq(wmydjrjgyrymuax(), n4)) ? 1 : 0) == (0x69064EC9 ^ n4)) {
                    final int n5 = 0x5160571F ^ n4;
                    MessagesConfig.NOPERMISSION.send((CommandSender)player);
                    return (byte)(0x30E2B198 ^ (0x884A84F ^ n5)) != 0;
                }
            Label_0419:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                        case 469142513: {
                            continue;
                        }
                        case 192696739: {
                            n4 ^= 0x77130FE4;
                        }
                        case 487909486: {
                            break Label_0419;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) == 172568658) {
                    final int vhfdzjzhpbyzqeja = vhfdzjzhpbyzqeja(n4, 1679770545);
                    this.plugin.getRulesGui$369068666(2053000771).open$967512435(player, new Object[(byte)(0x7A0A029C ^ vhfdzjzhpbyzqeja)], 1892453237);
                    return (byte)(0x243E6D1E ^ (0x5E346F83 ^ vhfdzjzhpbyzqeja)) != 0;
                }
            }
        }
        else {
            final int vhfdzjzhpbyzqeja2 = vhfdzjzhpbyzqeja(n, 1746414607);
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vhfdzjzhpbyzqeja2) == 164806912) {
                final int n6 = 0x357B7EB3 ^ vhfdzjzhpbyzqeja2;
                MessagesConfig.ONLYPLAYERS.send(commandSender);
                return (byte)(0x2925A8F9 ^ (0x110AD016 ^ n6)) != 0;
            }
            vhfdzjzhpbyzqeja(vhfdzjzhpbyzqeja2, 1284981001);
        }
        throw new IOException();
    }
    
    static {
        (RulesCommand.nothing_to_see_here = new String[18])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        RulesCommand.syrlerkppp = ByteBuffer.wrap(ixewlpktmhsaxxn()).asCharBuffer().toString();
        RulesCommand.y7lDhUCL4Z = (0x883631D3 ^ new Random(-1147231557362976169L).nextInt());
    }
    
    public static String wspzbispkq(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = RulesCommand.syrlerkppp.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] wmydjrjgyrymuax() {
        return new byte[] { 0, 0, 0, 15, 0, 0, 0, 0 };
    }
    
    private static byte[] ixewlpktmhsaxxn() {
        return new byte[] { 49, 83, 54, 93, 48, 92, 49, 69, 54, 65, 49, 84, 54, 93, 48, 64, 49, 85, 54, 27, 49, 69, 54, 71, 48, 94, 49, 85, 54, 70 };
    }
    
    private static int vhfdzjzhpbyzqeja(final int n, final int n2) {
        return n ^ n2;
    }
}
