package dev.daniboy.donutcore.placeholder;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;
import dev.daniboy.donutcore.config.MainConfig;
import dev.daniboy.donutcore.DonutCore;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class BillfordTimeLeft extends PlaceholderExpansion
{
    private final DonutCore plugin;
    private final long intervalInTicks;
    private final long intervalInMillis;
    private static int lgE8kUUExX = 0;
    private transient int scJEpRXOuN = 1492102415;
    private static String xhzywdmgij;
    private static String[] nothing_to_see_here;
    
    public BillfordTimeLeft(final DonutCore plugin, final int n) {
        final int n2 = 0x3A404F7B ^ (0x44FEC218 ^ (Integer.parseInt("1609908519") ^ n));
        this.plugin = plugin;
        this.intervalInTicks = MainConfig.PluginSettings.BILLFORD_RESET_TIMER * 20L;
        this.intervalInMillis = MainConfig.PluginSettings.BILLFORD_RESET_TIMER * 1000L;
        this.startSwitchingTradeChoice$1555863032(815055844);
    }
    
    public boolean persist() {
        return (byte)(0x1C8DA9A5 ^ (0x5053C825 ^ (0x69938EDB ^ (0xBE8A981 ^ this.scJEpRXOuN)))) != 0;
    }
    
    public boolean canRegister() {
        return (byte)(0x63A68F68 ^ (0x45DF7F25 ^ (0x61755649 ^ (0x69A9E0DE ^ this.scJEpRXOuN)))) != 0;
    }
    
    public String getIdentifier() {
        return egnvpdbhmz(owoywcusnxaoayk(), 0x610A45DC ^ (0x319D3CAD ^ (0x4DF3C3C1 ^ this.scJEpRXOuN)));
    }
    
    public String getAuthor() {
        return String.join((CharSequence)egnvpdbhmz(freumnehswvgcai(), 0x47807AA7 ^ (0x4EA7012D ^ (0x3361960B ^ this.scJEpRXOuN))), (Iterable)this.plugin.getDescription().getAuthors());
    }
    
    public String getVersion() {
        final int n = 0x7D2E3DDB ^ (0x473D18EF ^ (0x187DF649 ^ this.scJEpRXOuN));
        return this.plugin.getDescription().getVersion();
    }
    
    private void startSwitchingTradeChoice$1555863032(final int n) {
        final int n2 = 0x62626F7E ^ (0x52AE18CE ^ (0x347DA697 ^ (this.scJEpRXOuN ^ n)));
        Bukkit.getScheduler().runTaskTimer((Plugin)this.plugin, this::switchTradeChoice, this.intervalInTicks, this.intervalInTicks);
    }
    
    public String onPlaceholderRequest(final Player player, final String s) {
        final int n = 0x1DCA06E8 ^ (0x300ABA89 ^ (0x7EECCE8C ^ this.scJEpRXOuN));
        if ((s.equals((Object)egnvpdbhmz(vgiutntckoimwnq(), n)) ? 1 : 0) != (0x7D893436 ^ n)) {
            final int n2 = 0x4F37A284 ^ n;
            final long currentTimeMillis = System.currentTimeMillis();
            final int n3 = 0xDB6457B ^ n2;
            final long n4 = currentTimeMillis % this.intervalInMillis;
            final int n5 = 0x2A53D9E7 ^ n3;
            final long n6 = this.intervalInMillis - n4;
            final int n7 = 0x339A71EF ^ n5;
            final FileConfiguration billfordGuiConfig$756205206 = this.plugin.getBillfordGuiConfig$756205206(1840850862);
            final int n8 = 0x747A536B ^ n7;
            billfordGuiConfig$756205206.getString(egnvpdbhmz(vurtullalrrmdkc(), n8), egnvpdbhmz(oappiexzxoizmzx(), n8));
            return this.formatTime$2005481180(n6, 1239936047);
        }
        final int tkpshsrnixsxkzdh = tkpshsrnixsxkzdh(n, 765646188);
        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(tkpshsrnixsxkzdh) == 190141621) {
        Label_0311:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(tkpshsrnixsxkzdh)) {
                    case 1489577542: {
                        continue;
                    }
                    case 190141621: {}
                    case 1448483923: {
                        break Label_0311;
                    }
                    default: {
                        throw new IOException();
                    }
                }
            }
            return null;
        }
        tkpshsrnixsxkzdh(tkpshsrnixsxkzdh, 689533238);
        throw new IOException();
    }
    
    private void switchTradeChoice() {
        final int n = 0x3D461AF5 ^ (0x440A7462 ^ (0x6A67DA0 ^ this.scJEpRXOuN));
        final FileConfiguration billfordGuiConfig$756205206 = this.plugin.getBillfordGuiConfig$756205206(1840850862);
        final int n2 = 0x262DD2E2 ^ n;
        final String string = billfordGuiConfig$756205206.getString(egnvpdbhmz(xgabqqyzapvfzgr(), n2));
        final int n3 = 0x32E28464 ^ n2;
        Label_0398: {
            if ((egnvpdbhmz(krdwtbqmqvzcvgi(), n3).equalsIgnoreCase(string) ? 1 : 0) != (0x4580036A ^ n3)) {
                final int n4 = 0x31F50465 ^ n3;
                billfordGuiConfig$756205206.set(egnvpdbhmz(irzcbdqcmwyokyg(), n4), (Object)egnvpdbhmz(quddiykscesiuvn(), n4));
                final int n5 = 0x3B3D45C5 ^ n4;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 161238575) {
                        throw null;
                    }
                    throw new IOException();
                }
                catch (final IOException ex) {
                    int n6 = 0;
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n5)) {
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case 2051151442: {
                            n6 = (0x2738D4C3 ^ n5);
                            break;
                        }
                        case 296174354: {
                            n6 = (0x2A447E6B ^ n5);
                            break;
                        }
                    }
                Label_0340:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                            case 50819713: {
                                continue;
                            }
                            case 173689537: {
                                break Label_0340;
                            }
                            default: {
                                throw new IOException();
                            }
                            case 1308347545: {
                                break Label_0398;
                            }
                        }
                    }
                    n6 ^= 0x247E634B;
                    break Label_0398;
                }
            }
            else {
                final int n7 = 0x6963B65C ^ n3;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) == 116982779) {
                    final int n8 = 0x78377006 ^ n7;
                    billfordGuiConfig$756205206.set(egnvpdbhmz(zgwufwoaplcwchg(), n8), (Object)egnvpdbhmz(hpqrshtntzodbqi(), n8));
                    final int n6 = 0x18DA3072 ^ n8;
                    break Label_0398;
                }
            }
            throw new IOException();
        }
        this.plugin.saveBillfordGuiConfig$978105170(1372127931);
    }
    
    private String formatTime$2005481180(final long n, final int n2) {
        final int n3 = 0x5488E3DC ^ (0x34170658 ^ (0xA7A8470 ^ (this.scJEpRXOuN ^ n2)));
        final long n4 = n / 1000L;
        final int n5 = 0x7DFC5A98 ^ n3;
        final long n6 = n4 / 60L;
        final int n7 = 0x35B515A6 ^ n5;
        final long n8 = n6 / 60L;
        final int n9 = 0xB0605EC ^ n7;
        final long n10 = n4 % 60L;
        final int n11 = 0x22070402 ^ n9;
        final long n12 = n6 % 60L;
        final int n13 = 0x4359BEA8 ^ n11;
        final StringBuilder sb = new StringBuilder();
        int n14 = 0xD05872A ^ n13;
        Label_0262: {
            if (lcmp(n8, 0L) > (0x22B3BC52 ^ n14)) {
                final int n15 = 0x112AB1C8 ^ n14;
                sb.append(n8).append(egnvpdbhmz(uxaitwznatxkyva(), n15));
                n14 = (0x610125E ^ n15);
            }
            else {
                Label_0600: {
                Label_0592:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14)) {
                            case 1113398988: {
                                continue;
                            }
                            case 54271597: {
                                break Label_0592;
                            }
                            case 1740896236: {
                                break Label_0600;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n14 ^= 0x2D6CA721;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14) != 247483121) {
                    throw new IOException();
                }
            Label_0668:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14)) {
                        case 502524172: {
                            break Label_0262;
                        }
                        case 2018942262: {
                            continue;
                        }
                        case 247483121: {
                            break Label_0668;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n14 ^= 0x3A5604B7;
            }
        }
        Label_0339: {
            if (lcmp(n12, 0L) > (0x35891FC4 ^ n14)) {
                final int n16 = 0x3E3511CB ^ n14;
                sb.append(n12).append(egnvpdbhmz(ktflyuwxvcyijnp(), n16));
                n14 = (0x71ABFA9 ^ n16);
            }
            else {
                Label_0460: {
                Label_0452:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14)) {
                            case 554698659: {
                                continue;
                            }
                            case 129603586: {
                                break Label_0452;
                            }
                            case 58758700: {
                                break Label_0460;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                    n14 ^= 0xC072EEC;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14) != 260261555) {
                    tkpshsrnixsxkzdh(n14, 83273177);
                    throw new IOException();
                }
            Label_0520:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n14)) {
                        case 339664593: {
                            break Label_0339;
                        }
                        case 313619557: {
                            continue;
                        }
                        case 260261555: {
                            break Label_0520;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n14 ^= 0x3528808E;
            }
        }
        sb.append(n10).append(egnvpdbhmz(nhpllmeogjhafyo(), n14));
        return sb.toString().trim();
    }
    
    static {
        (BillfordTimeLeft.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        BillfordTimeLeft.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
        BillfordTimeLeft.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
        BillfordTimeLeft.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        BillfordTimeLeft.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
        BillfordTimeLeft.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
        BillfordTimeLeft.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
        BillfordTimeLeft.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
        BillfordTimeLeft.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
        BillfordTimeLeft.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
        BillfordTimeLeft.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
        BillfordTimeLeft.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
        BillfordTimeLeft.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
        BillfordTimeLeft.xhzywdmgij = ByteBuffer.wrap(dmyalfihxejciez()).asCharBuffer().toString();
        BillfordTimeLeft.lgE8kUUExX = (0x101BC4B6 ^ new Random(-4061228336009199511L).nextInt());
    }
    
    public static String egnvpdbhmz(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = BillfordTimeLeft.xhzywdmgij.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] owoywcusnxaoayk() {
        return new byte[] { 0, 0, 0, 9, 0, 0, 0, 0 };
    }
    
    private static byte[] freumnehswvgcai() {
        return new byte[] { 0, 0, 0, 2, 0, 0, 0, 9 };
    }
    
    private static byte[] vurtullalrrmdkc() {
        return new byte[] { 0, 0, 0, 25, 0, 0, 0, 11 };
    }
    
    private static byte[] oappiexzxoizmzx() {
        return new byte[] { 0, 0, 0, 7, 0, 0, 0, 36 };
    }
    
    private static byte[] vgiutntckoimwnq() {
        return new byte[] { 0, 0, 0, 16, 0, 0, 0, 43 };
    }
    
    private static byte[] krdwtbqmqvzcvgi() {
        return new byte[] { 0, 0, 0, 14, 0, 0, 0, 59 };
    }
    
    private static byte[] xgabqqyzapvfzgr() {
        return new byte[] { 0, 0, 0, 25, 0, 0, 0, 73 };
    }
    
    private static byte[] zgwufwoaplcwchg() {
        return new byte[] { 0, 0, 0, 25, 0, 0, 0, 98 };
    }
    
    private static byte[] hpqrshtntzodbqi() {
        return new byte[] { 0, 0, 0, 14, 0, 0, 0, 123 };
    }
    
    private static byte[] irzcbdqcmwyokyg() {
        return new byte[] { 0, 0, 0, 25, 0, 0, 0, -119 };
    }
    
    private static byte[] quddiykscesiuvn() {
        return new byte[] { 0, 0, 0, 11, 0, 0, 0, -94 };
    }
    
    private static byte[] uxaitwznatxkyva() {
        return new byte[] { 0, 0, 0, 7, 0, 0, 0, -83 };
    }
    
    private static byte[] ktflyuwxvcyijnp() {
        return new byte[] { 0, 0, 0, 9, 0, 0, 0, -76 };
    }
    
    private static byte[] nhpllmeogjhafyo() {
        return new byte[] { 0, 0, 0, 8, 0, 0, 0, -67 };
    }
    
    private static byte[] dmyalfihxejciez() {
        return new byte[] { 56, 82, 56, 92, 53, 95, 48, 77, 51, 76, 54, 91, 51, 90, 49, 66, 56, 86, 51, 25, 48, 20, 49, 81, 56, 94, 57, 85, 55, 95, 53, 82, 49, 92, 56, 69, 57, 93, 55, 108, 53, 83, 49, 70, 56, 94, 57, 23, 55, 71, 53, 70, 49, 82, 56, 83, 57, 92, 55, 108, 53, 87, 49, 91, 56, 88, 57, 80, 55, 80, 53, 81, 49, 102, 56, 89, 57, 82, 55, 93, 53, 91, 49, 68, 56, 89, 50, 83, 48, 95, 49, 88, 51, 91, 57, 94, 50, 94, 48, 68, 49, 80, 51, 67, 57, 81, 50, 92, 48, 83, 49, 88, 51, 82, 57, 94, 50, 69, 49, 82, 54, 68, 48, 88, 55, 71, 56, 91, 49, 68, 54, 90, 48, 69, 55, 90, 56, 70, 49, 93, 54, 95, 48, 84, 55, 65, 50, 82, 48, 91, 57, 88, 53, 84, 48, 80, 50, 95, 48, 64, 57, 80, 53, 103, 48, 81, 50, 69, 48, 91, 57, 26, 53, 76, 48, 68, 50, 81, 48, 86, 57, 81, 53, 103, 48, 85, 50, 88, 48, 93, 57, 93, 53, 91, 48, 83, 49, 86, 50, 90, 50, 95, 48, 94, 53, 80, 49, 91, 50, 65, 50, 87, 48, 109, 53, 81, 49, 65, 50, 90, 50, 29, 48, 70, 53, 68, 49, 85, 50, 87, 50, 86, 48, 109, 53, 85, 49, 92, 50, 92, 50, 90, 48, 81, 53, 83, 49, 87, 50, 65, 50, 90, 48, 70, 53, 91, 49, 65, 50, 95, 50, 71, 48, 91, 53, 70, 49, 88, 50, 90, 50, 86, 48, 64, 49, 91, 53, 90, 56, 94, 54, 89, 55, 83, 49, 86, 53, 65, 56, 86, 54, 106, 55, 82, 49, 76, 53, 90, 56, 28, 54, 65, 55, 71, 49, 88, 53, 87, 56, 87, 54, 106, 55, 86, 49, 81, 53, 92, 56, 91, 54, 86, 55, 80, 49, 74, 53, 71, 56, 64, 54, 80, 55, 91, 49, 94, 53, 71, 56, 90, 54, 71, 55, 90, 49, 93, 56, 22, 53, 94, 54, 87, 53, 69, 54, 74, 54, 70, 54, 22, 49, 25, 54, 85, 55, 90, 55, 90, 51, 68, 57, 66, 56, 82, 51, 68, 52, 19, 50, 17, 50, 65, 53, 84, 48, 87, 54, 93, 49, 92, 50, 81, 49, 67 };
    }
    
    private static int tkpshsrnixsxkzdh(final int n, final int n2) {
        return n2 ^ n;
    }
}
