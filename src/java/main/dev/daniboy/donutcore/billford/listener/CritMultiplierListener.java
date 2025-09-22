package dev.daniboy.donutcore.billford.listener;

import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Bukkit;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.metadata.FixedMetadataValue;
import java.io.IOException;
import dev.daniboy.donutcore.config.SoundConfig;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;
import org.bukkit.NamespacedKey;
import org.bukkit.event.player.PlayerInteractEvent;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import java.util.UUID;
import java.util.HashMap;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.event.Listener;

public class CritMultiplierListener implements Listener
{
    private DonutCore plugin;
    private HashMap<UUID, Long> cooldowns;
    private static int VWB2bN7dRE = 0;
    private transient int gGPP3Mm03c = 2027548951;
    private static byte[] mnpxjolvrb;
    private static String[] nothing_to_see_here;
    
    public CritMultiplierListener(final DonutCore plugin, final int n) {
        int n2 = 0x45700236 ^ (0x24E02CBA ^ (Integer.parseInt("260115619") ^ n));
    Label_0110:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 1825048126: {
                    continue;
                }
                default: {
                    throw new IllegalAccessException();
                }
                case 94495728: {
                    break Label_0110;
                }
                case 191324027: {
                    n2 ^= 0x742C6E78;
                    break Label_0110;
                }
            }
        }
        this.cooldowns = (HashMap<UUID, Long>)new HashMap();
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerInteract(final PlayerInteractEvent playerInteractEvent) {
        final int n = 0x614EB87D ^ (0x7AB71280 ^ (0x5CDD0926 ^ this.gGPP3Mm03c));
        final Player player = playerInteractEvent.getPlayer();
        final int n2 = 0x391D677D ^ n;
        final ItemStack item = playerInteractEvent.getItem();
        final int n3 = 0x45C76FF0 ^ n2;
        Label_1716: {
            if (item != null) {
                final int n4 = 0x61ECFE5D ^ n3;
                if ((item.hasItemMeta() ? 1 : 0) != (0x461F3A61 ^ n4)) {
                    final int n5 = 0x3EE9DCEF ^ n4;
                    if ((item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey((Plugin)this.plugin, tmvemkyftf(uopghdxwhxfnubi(), n5)), PersistentDataType.STRING) ? 1 : 0) != (0x78F6E68E ^ n5)) {
                        final int n6 = 0x7462D335 ^ n5;
                        if ((player.hasMetadata(tmvemkyftf(yjlmqgvqywsaasg(), n6)) ? 1 : 0) != (0xC9435BB ^ n6)) {
                            MessagesConfig.CRITMULTIPLERACTIVE.send((CommandSender)player);
                            SoundConfig.CRITMULTIPLIERACTIVE.play(player);
                            return;
                        }
                        int n7 = 0x63B327B8 ^ n6;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 123461058) {
                            throw new IOException();
                        }
                        Label_0351: {
                        Label_0344:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                    case 1279264188: {
                                        continue;
                                    }
                                    case 123461058: {
                                        break Label_0344;
                                    }
                                    case 595469826: {
                                        break Label_0351;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            n7 ^= 0x2F1CEC66;
                        }
                        final long n8 = this.plugin.getBillfordGuiConfig$756205206(1840850862).getLong(tmvemkyftf(grbegedszpfgmll(), n7)) * 1000L;
                        int vbmqmudythifskmq = 0x4791AC83 ^ n7;
                        Label_1174: {
                            if ((this.cooldowns.containsKey((Object)player.getUniqueId()) ? 1 : 0) != (0x7AA52E6 ^ vbmqmudythifskmq)) {
                                final int n9 = 0x4AC2BA3A ^ vbmqmudythifskmq;
                                final long n10 = (long)this.cooldowns.get((Object)player.getUniqueId()) + n8 - System.currentTimeMillis();
                                final int n11 = 0x6713F19 ^ n9;
                                if (lcmp(n10, 0L) > (0x4B19D7C5 ^ n11)) {
                                    player.sendMessage(MessagesConfig.CRITMULTIPLIERCOOLDOWN.getSingleMessage().replace((CharSequence)tmvemkyftf(idnjhtdhoftyjds(), 0x14955595 ^ n11), (CharSequence)String.valueOf(n10 / 1000L)));
                                    MessagesConfig.CRITMULTIPLIERCOOLDOWN.sendActionBar(player);
                                    SoundConfig.CRITMULTIPLIERCOOLDOWN.play(player);
                                    return;
                                }
                                final int vbmqmudythifskmq2 = vbmqmudythifskmq(n11, 250727884);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq2) != 124909465) {
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq2)) {
                                            case 1347422158: {
                                                continue;
                                            }
                                            case 124909465: {}
                                            default: {
                                                throw new IOException();
                                            }
                                        }
                                    }
                                }
                                else {
                                    vbmqmudythifskmq = vbmqmudythifskmq(vbmqmudythifskmq2, 186755110);
                                }
                            }
                            else {
                                Label_0856: {
                                Label_0848:
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq)) {
                                            case 411400150: {
                                                continue;
                                            }
                                            case 120564253: {
                                                break Label_0848;
                                            }
                                            case 1417390242: {
                                                break Label_0856;
                                            }
                                            default: {
                                                throw new IOException();
                                            }
                                        }
                                    }
                                    vbmqmudythifskmq ^= 0x2B9F0169;
                                }
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq) != 94862800) {
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq)) {
                                            case 1743145187: {
                                                continue;
                                            }
                                            case 94862800: {}
                                            default: {
                                                throw new IOException();
                                            }
                                        }
                                    }
                                }
                                else {
                                Label_0916:
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq)) {
                                            case 987130955: {
                                                continue;
                                            }
                                            case 94862800: {
                                                break Label_0916;
                                            }
                                            case 990948738: {
                                                break Label_1174;
                                            }
                                            default: {
                                                throw new IOException();
                                            }
                                        }
                                    }
                                    vbmqmudythifskmq ^= 0x62FCE1A0;
                                }
                            }
                        }
                        this.cooldowns.put((Object)player.getUniqueId(), (Object)System.currentTimeMillis());
                        final int n12 = 0x33A53054 ^ vbmqmudythifskmq;
                        item.setAmount(item.getAmount() - (byte)(0x7D6C827A ^ n12));
                        final int n13 = 0xBEB2D66 ^ n12;
                        final double doubleValue = (double)item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey((Plugin)this.plugin, tmvemkyftf(mbguqzpbnryzocw(), n13)), PersistentDataType.DOUBLE);
                        final int n14 = 0x3FDFF5AF ^ n13;
                        final int intValue = (int)item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey((Plugin)this.plugin, tmvemkyftf(dwenzlmwclajnvl(), n14)), PersistentDataType.INTEGER);
                        player.setMetadata(tmvemkyftf(yvzilmjvyptqjwt(), 0x24A7F882 ^ n14), (MetadataValue)new FixedMetadataValue((Plugin)this.plugin, (Object)doubleValue));
                        SoundConfig.CRITMULTIPLIERACTIVATED.play(player);
                        new BukkitRunnable() {
                            int remainingDuration = intValue;
                            private static int K8cgQ6JdHk = 0;
                            private transient int CbRB7Nk9VR = 1241799326;
                            private static String mimycpafqd;
                            private static String[] nothing_to_see_here;
                            
                            {
                                int n2 = 0x7B4F49B5 ^ (0x2C106937 ^ (Integer.parseInt("1512296421") ^ n));
                            Label_0143:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                                        case 939805410: {
                                            continue;
                                        }
                                        case 130037918: {
                                            n2 ^= 0x27E46232;
                                        }
                                        case 57888482: {
                                            break Label_0143;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                            }
                            
                            public void run() {
                                final int n = 0x4548ABE9 ^ (0x6E1539E8 ^ (0x3D8AF28F ^ this.CbRB7Nk9VR));
                                final int n6;
                                Label_0288: {
                                    if (this.remainingDuration <= (0x18E8E4DB ^ n)) {
                                        final int n2 = 0x217D9B18 ^ n;
                                        this.cancel();
                                        final int n3 = 0x49DFBA49 ^ n2;
                                        player.removeMetadata(epwmlfolgh(uzohkntzyysafkm(), n3), (Plugin)CritMultiplierListener.this.plugin);
                                        final int n4 = 0x5C824E3D ^ n3;
                                        try {
                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 113549946) {
                                                throw null;
                                            }
                                            throw new RuntimeException();
                                        }
                                        catch (final RuntimeException ex) {
                                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n4)) {
                                                case 639989376: {
                                                    remjxkmfpgqfotmi(n4, 1555251269);
                                                    break;
                                                }
                                                case 1715756473: {
                                                    remjxkmfpgqfotmi(n4, 1958700322);
                                                    break;
                                                }
                                                default: {
                                                    throw new RuntimeException("Error in hash");
                                                }
                                            }
                                            return;
                                        }
                                        break Label_0288;
                                    }
                                    final int n5 = 0x7FC05A8E ^ n;
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) != 132028396) {
                                    Label_0179:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5)) {
                                                case 1477804829: {
                                                    continue;
                                                }
                                                case 132028396: {}
                                                default: {
                                                    break Label_0179;
                                                }
                                            }
                                        }
                                        throw new RuntimeException();
                                    }
                                    n6 = (0x5762CC67 ^ n5);
                                }
                                final MessagesConfig critmultipler = MessagesConfig.CRITMULTIPLER;
                                final Player val$player = player;
                                final String[] array = new String[(byte)(0x304A7230 ^ n6)];
                                array[(byte)(0x304A7232 ^ n6)] = epwmlfolgh(ogkhagngpuahcea(), n6);
                                array[(byte)(0x304A7233 ^ n6)] = String.valueOf(this.remainingDuration);
                                critmultipler.sendActionBar(val$player, array);
                                this.remainingDuration -= (byte)(0x6BD6746C ^ (0x5B9C065F ^ n6));
                            }
                            
                            static {
                                (CritMultiplierListener$1.nothing_to_see_here = new String[17])[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
                                CritMultiplierListener$1.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
                                CritMultiplierListener$1.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
                                CritMultiplierListener$1.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
                                CritMultiplierListener$1.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
                                CritMultiplierListener$1.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
                                CritMultiplierListener$1.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
                                CritMultiplierListener$1.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
                                CritMultiplierListener$1.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
                                CritMultiplierListener$1.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
                                CritMultiplierListener$1.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
                                CritMultiplierListener$1.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
                                CritMultiplierListener$1.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
                                CritMultiplierListener$1.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
                                CritMultiplierListener$1.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
                                CritMultiplierListener$1.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
                                CritMultiplierListener$1.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
                                CritMultiplierListener$1.mimycpafqd = ByteBuffer.wrap(ukwogojxphomirc()).asCharBuffer().toString();
                                CritMultiplierListener$1.K8cgQ6JdHk = (0xEFCFECB1 ^ new Random(-7602760997452512877L).nextInt());
                            }
                            
                            public static String epwmlfolgh(final byte[] array, final int n) {
                                final byte[] bytes = Integer.toString(n).getBytes();
                                final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
                                final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
                                final byte[] bytes2 = CritMultiplierListener$1.mimycpafqd.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
                                for (int i = 0; i < bytes2.length; ++i) {
                                    final byte[] array2 = bytes2;
                                    final int n4 = i;
                                    array2[n4] ^= bytes[i % bytes.length];
                                }
                                return new String(bytes2, StandardCharsets.UTF_16BE);
                            }
                            
                            private static byte[] ogkhagngpuahcea() {
                                return new byte[] { 0, 0, 0, 9, 0, 0, 0, 0 };
                            }
                            
                            private static byte[] uzohkntzyysafkm() {
                                return new byte[] { 0, 0, 0, 14, 0, 0, 0, 9 };
                            }
                            
                            private static byte[] ukwogojxphomirc() {
                                return new byte[] { 56, 82, 48, 94, 56, 64, 50, 88, 54, 76, 49, 84, 49, 87, 53, 69, 54, 88, 49, 123, 56, 65, 57, 93, 56, 64, 50, 123, 49, 77, 56, 95, 57, 64, 56, 93, 50, 70, 49, 84, 56, 90, 57, 81, 56, 70 };
                            }
                            
                            private static int remjxkmfpgqfotmi(final int n, final int n2) {
                                return n ^ n2;
                            }
                        }.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                        Bukkit.getScheduler().runTaskLater((Plugin)this.plugin, () -> player.removeMetadata(tmvemkyftf(gbgiyilywaotbqg(), 0x14873FD1 ^ (0x51D4B2CD ^ (0x166111E5 ^ this.gGPP3Mm03c))), (Plugin)this.plugin), intValue * 20L);
                    }
                    else {
                        final int n15 = 0x6CC2DF30 ^ n5;
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n15) != 119880660) {
                            throw new IOException();
                        }
                        vbmqmudythifskmq(n15, 538079358);
                    }
                }
                else {
                    final int vbmqmudythifskmq3 = vbmqmudythifskmq(n4, 605831417);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq3) != 233234309) {
                        vbmqmudythifskmq(vbmqmudythifskmq3, 285164420);
                        throw new IOException();
                    }
                }
            }
            else {
                final int vbmqmudythifskmq4 = vbmqmudythifskmq(n3, 441115124);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq4) != 127304842) {
                    vbmqmudythifskmq(vbmqmudythifskmq4, 1329929428);
                    throw new IOException();
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(vbmqmudythifskmq4)) {
                        case 1794113426: {
                            continue;
                        }
                        case 127304842: {}
                        case 1376235760: {
                            break Label_1716;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }
    
    @EventHandler
    public void onEntityDamageByEntity(final EntityDamageByEntityEvent entityDamageByEntityEvent) {
        final int n = 0x204C07F2 ^ (0x2203FE2B ^ (0x2C7DF817 ^ this.gGPP3Mm03c));
        if (((entityDamageByEntityEvent.getDamager() instanceof Player) ? 1 : 0) != (0x323F6EA4 ^ n)) {
            final int n2 = 0x4D88DA29 ^ n;
            final Player player = (Player)entityDamageByEntityEvent.getDamager();
            int n3 = 0x2773D0A6 ^ n2;
            if ((player.hasMetadata(tmvemkyftf(vsydaymrtphfgko(), n3)) ? 1 : 0) != (0x58C4642B ^ n3)) {
                final int n4 = 0xF3EA4A5 ^ n3;
                entityDamageByEntityEvent.setDamage(entityDamageByEntityEvent.getDamage() * ((MetadataValue)player.getMetadata(tmvemkyftf(cdzircnujalrjqe(), n4)).get((int)(byte)(0x57FAC08E ^ n4))).asDouble());
            }
            else {
                Label_0292: {
                Label_0284:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 355271503: {
                                continue;
                            }
                            case 201120471: {
                                break Label_0284;
                            }
                            case 31870917: {
                                break Label_0292;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                    }
                    n3 ^= 0x69BD9400;
                }
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 266104874) {
                    vbmqmudythifskmq(n3, 1775940490);
                    throw new IllegalAccessException();
                }
            }
        }
        else if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(0x6ACDB5E6 ^ n) != 207015997) {
            throw new IllegalAccessException();
        }
    }
    
    static {
        (CritMultiplierListener.nothing_to_see_here = new String[17])[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
        CritMultiplierListener.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
        CritMultiplierListener.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
        CritMultiplierListener.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
        CritMultiplierListener.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
        CritMultiplierListener.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
        CritMultiplierListener.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
        CritMultiplierListener.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
        CritMultiplierListener.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
        CritMultiplierListener.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
        CritMultiplierListener.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
        CritMultiplierListener.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
        CritMultiplierListener.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
        CritMultiplierListener.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
        CritMultiplierListener.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
        CritMultiplierListener.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
        CritMultiplierListener.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
        CritMultiplierListener.mnpxjolvrb = gpjgjaplelzuipv();
        CritMultiplierListener.VWB2bN7dRE = (0xE66ACBBC ^ new Random(4393233090589274066L).nextInt());
    }
    
    public static String tmvemkyftf(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= CritMultiplierListener.mnpxjolvrb[i % CritMultiplierListener.mnpxjolvrb.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] gpjgjaplelzuipv() {
        return new byte[] { 110, 75, 99, 105, 82, 63, 32, 6, 14, 108, 55, 89, 93, 26, 72, 102, 75, 62, 123, 121, 123, 90, 69, 69, 29, 113, 5, 30, 10, 44, 119, 53, 47, 39, 34, 126, 31, 37, 64, 96, 122 };
    }
    
    private static byte[] gbgiyilywaotbqg() {
        return new byte[] { -95, -121, 81, 19, 103, 116, 17, 94, 54, 47, 6, 39, 111, 86, 125, 51, 122, 123, 67, 39, 74, 25, 119, 16, 40, 33, 52, 74, 50, 105 };
    }
    
    private static byte[] idnjhtdhoftyjds() {
        return new byte[] { -95, -126, 83, 127, 98, 104, 19, 80, 60, 51, 6, 3, 109, 77, 120, 61, 120, 112, 73, 39, 74, 73 };
    }
    
    private static byte[] yvzilmjvyptqjwt() {
        return new byte[] { -95, -116, 87, 31, 102, 123, 25, 88, 58, 44, 6, 44, 105, 90, 124, 60, 114, 125, 79, 36, 74, 18, 113, 28, 41, 46, 60, 76, 62, 106 };
    }
    
    private static byte[] yjlmqgvqywsaasg() {
        return new byte[] { -94, -123, 82, 26, 97, 116, 22, 88, 59, 42, 6, 37, 109, 92, 113, 60, 124, 127, 73, 33, 74, 26, 118, 16, 43, 47, 48, 73, 59, 111 };
    }
    
    private static byte[] uopghdxwhxfnubi() {
        return new byte[] { -94, -124, 81, 57, 102, 120, 22, 114, 55, 38, 5, 0, 111, 87, 124, 31, 125, 124, 66, 45, 73, 30, 119, 21, 41, 53, 51, 69, 51, 125, 69, 96, 29, 108 };
    }
    
    private static byte[] grbegedszpfgmll() {
        return new byte[] { -95, -124, 84, 60, 100, 97, 19, 95, 57, 51, 6, 15, 106, 66, 126, 35, 120, 111, 76, 21, 74, 13, 114, 7, 43, 47, 54, 5, 61, 124, 70, 119, 24, 121, 20, 61, 44, 79, 119, 62, 75, 43, 124, 56, 95, 17, 12, 124, 49, 77, 93, 107, 110, 3, 44, 26, 85, 12, 9, 102, 72, 40, 109, 29, 115, 69, 66, 92, 41, 93, 29, 40, 2, 111, 17, 123 };
    }
    
    private static byte[] mbguqzpbnryzocw() {
        return new byte[] { -95, -115, 91, 60, 100, 122, 19, 92, 57, 47, 6, 9, 101, 82, 126, 58, 120, 97, 76, 43, 74, 17 };
    }
    
    private static byte[] dwenzlmwclajnvl() {
        return new byte[] { -95, -122, 80, 61, 103, 120, 23, 69, 59, 57, 6, 31, 110, 67, 125, 59, 124, 97 };
    }
    
    private static byte[] cdzircnujalrjqe() {
        return new byte[] { -95, -128, 84, 28, 98, 120, 17, 95, 54, 46, 6, 32, 106, 89, 120, 63, 122, 122, 67, 38, 74, 30, 114, 31, 45, 45, 52, 75, 50, 104 };
    }
    
    private static byte[] vsydaymrtphfgko() {
        return new byte[] { -95, -128, 91, 19, 96, 123, 21, 88, 62, 47, 6, 32, 101, 86, 122, 60, 126, 125, 75, 39, 74, 30, 125, 16, 47, 46, 48, 76, 58, 105 };
    }
    
    private static int vbmqmudythifskmq(final int n, final int n2) {
        return n2 ^ n;
    }
}
