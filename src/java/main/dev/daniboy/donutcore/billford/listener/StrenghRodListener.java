package dev.daniboy.donutcore.billford.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Bukkit;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.potion.PotionEffect;
import org.bukkit.Registry;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.metadata.FixedMetadataValue;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import dev.daniboy.donutcore.config.SoundConfig;
import org.bukkit.command.CommandSender;
import dev.daniboy.donutcore.config.MessagesConfig;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;
import org.bukkit.NamespacedKey;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.UUID;
import java.util.HashMap;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.event.Listener;

public class StrenghRodListener implements Listener
{
    private DonutCore plugin;
    private HashMap<UUID, Long> cooldowns;
    private static int PVczn9O0r9 = 0;
    private transient int EzI26Y4Lfr = 1880145150;
    private static byte[] saemfzllxy;
    private static String[] nothing_to_see_here;
    
    public StrenghRodListener(final DonutCore plugin, final int n) {
        final int n2 = 0x1D2FF035 ^ 0x2062B025;
        wksnwxxltvalsibz(n2, 1940359975);
        final int n3 = 0x7367BEB6 ^ (0x3F54D9E3 ^ (Integer.parseInt("986145763") ^ n));
        final int n4 = 0x1307B3CA ^ wksnwxxltvalsibz(n3, 931685384);
        this.cooldowns = (HashMap<UUID, Long>)new HashMap();
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerInteract(final PlayerInteractEvent playerInteractEvent) {
        final int n = 0x2C657772 ^ (0x2471D7DC ^ (0x7F56F3D0 ^ this.EzI26Y4Lfr));
        final Player player = playerInteractEvent.getPlayer();
        final int n2 = 0x2B4AF838 ^ n;
        final ItemStack item = playerInteractEvent.getItem();
        final int n3 = 0x175235BD ^ n2;
        Label_1865: {
            if (item != null) {
                final int n4 = 0x7D67F382 ^ n3;
                if ((item.hasItemMeta() ? 1 : 0) != (0x1110F1E3 ^ n4)) {
                    final int n5 = 0x34CFBD67 ^ n4;
                    final ItemMeta itemMeta = item.getItemMeta();
                    int n6 = 0x739523D ^ n5;
                    if (itemMeta != null) {
                        final int n7 = 0x6442C235 ^ n6;
                        if ((itemMeta.getPersistentDataContainer().has(new NamespacedKey((Plugin)this.plugin, poeporoyzs(gudsqexelmgihvf(), n7)), PersistentDataType.STRING) ? 1 : 0) != (0x46A4DC8C ^ n7)) {
                            final int n8 = 0x7B235AC1 ^ n7;
                            if ((player.hasMetadata(poeporoyzs(goeqommusodcorx(), n8)) ? 1 : 0) != (0x3D87864D ^ n8)) {
                                MessagesConfig.STRENGHRODACTIVE.send((CommandSender)player);
                                SoundConfig.STRENGTHRODACTIVE.play(player);
                                return;
                            }
                            final int n9 = 0x56B4C4BE ^ n8;
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n9) != 263404165) {
                                wksnwxxltvalsibz(n9, 367953363);
                                throw new IOException();
                            }
                            final int wksnwxxltvalsibz = wksnwxxltvalsibz(n9, 1699993909);
                            final long n10 = this.plugin.getBillfordGuiConfig$756205206(1840850862).getLong(poeporoyzs(gedmuostredstpn(), wksnwxxltvalsibz)) * 1000L;
                            final int n11 = 0x49AB4A16 ^ wksnwxxltvalsibz;
                            int n16;
                            if ((this.cooldowns.containsKey((Object)player.getUniqueId()) ? 1 : 0) != (0x47CBD1D0 ^ n11)) {
                                final int n12 = 0x4488A519 ^ n11;
                                final long n13 = (long)this.cooldowns.get((Object)player.getUniqueId()) + n10 - System.currentTimeMillis();
                                final int n14 = 0x1DAD52BB ^ n12;
                                if (lcmp(n13, 0L) > (0x1EEE2672 ^ n14)) {
                                    final int n15 = 0x508A69D4 ^ n14;
                                    final MessagesConfig strenghrodcooldown = MessagesConfig.STRENGHRODCOOLDOWN;
                                    final CommandSender commandSender = (CommandSender)player;
                                    final String[] array = new String[(byte)(0x4E644FA4 ^ n15)];
                                    array[(byte)(0x4E644FA6 ^ n15)] = poeporoyzs(wtlzgtiitkpxphg(), n15);
                                    array[(byte)(0x4E644FA7 ^ n15)] = String.valueOf(n13 / 1000L);
                                    strenghrodcooldown.send(commandSender, array);
                                    SoundConfig.STRENGTHRODCOOLDOWN.play(player);
                                    return;
                                }
                                final int wksnwxxltvalsibz2 = wksnwxxltvalsibz(n14, 1290889512);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz2) != 253557665) {
                                    throw new IOException();
                                }
                                n16 = wksnwxxltvalsibz(wksnwxxltvalsibz2, 1417885218);
                            }
                            else {
                                final int n17 = 0x50C81EB6 ^ n11;
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n17) != 211252950) {
                                    throw new IOException();
                                }
                                n16 = wksnwxxltvalsibz(n17, 295679518);
                            }
                            this.cooldowns.put((Object)player.getUniqueId(), (Object)System.currentTimeMillis());
                            final int n18 = 0x7C056414 ^ n16;
                            item.setAmount(item.getAmount() - (byte)(0x7A991D6D ^ n18));
                            final int n19 = 0x66DB1DBA ^ n18;
                            final double doubleValue = (double)itemMeta.getPersistentDataContainer().get(new NamespacedKey((Plugin)this.plugin, poeporoyzs(kjvxpjgendhrfep(), n19)), PersistentDataType.DOUBLE);
                            final int n20 = 0x59C3197B ^ n19;
                            final int intValue = (int)itemMeta.getPersistentDataContainer().get(new NamespacedKey((Plugin)this.plugin, poeporoyzs(yjyeeoekqwbikqx(), n20)), PersistentDataType.INTEGER);
                            final int n21 = 0x25FA61D6 ^ n20;
                            player.setMetadata(poeporoyzs(ujglfilmovdxdxk(), n21), (MetadataValue)new FixedMetadataValue((Plugin)this.plugin, (Object)doubleValue));
                            final int n22 = 0xE2989AC ^ n21;
                            SoundConfig.STRENGTHRODACTIVATED.play(player);
                            final int n23 = 0x29ED1CA8 ^ n22;
                            final PotionEffectType potionEffectType = (PotionEffectType)Registry.EFFECT.match(poeporoyzs(gcznmfawvzkxaxr(), n23));
                            final int n24 = 0x708F26F7 ^ n23;
                            player.addPotionEffect(new PotionEffect(potionEffectType, intValue * (byte)(0x3730CB9C ^ n24), (int)doubleValue - (byte)(0x3730CB89 ^ n24), (boolean)((byte)(0x3730CB88 ^ n24) != 0), (boolean)((byte)(0x3730CB89 ^ n24) != 0), (boolean)((byte)(0x3730CB89 ^ n24) != 0)));
                            final int n25 = 0x337A2D7F ^ n24;
                            final BukkitRunnable bukkitRunnable = new BukkitRunnable() {
                                int remainingDuration = intValue;
                                private static int bEPRSHbNj9 = 0;
                                private transient int dNayAmSV9y = 1165450682;
                                private static String xjzscrfggf;
                                private static String[] nothing_to_see_here;
                                
                                {
                                    qclwqbzkravomozn(n2, 1676899463);
                                    final int n3 = 0x6720953 ^ (0x6197DC88 ^ (Integer.parseInt("970227816") ^ n));
                                    final int n4 = 0x41B610A8 ^ qclwqbzkravomozn(n3, 797947171);
                                }
                                
                                public void run() {
                                    final int n = 0x16EAD7C7 ^ (0x793811FB ^ (0x18C6BE4 ^ this.dNayAmSV9y));
                                    int n6 = 0;
                                    Label_0304: {
                                        if (this.remainingDuration <= (0x5C604085 ^ n)) {
                                            final int n2 = 0x4C9B621D ^ n;
                                            this.cancel();
                                            int n3 = 0x2565C908 ^ n2;
                                            player.removeMetadata(lhcvyslabi(ogvyrkifasyivjf(), n3), (Plugin)StrenghRodListener.this.plugin);
                                            Label_0210: {
                                            Label_0192:
                                                while (true) {
                                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                                        case 1542347711: {
                                                            continue;
                                                        }
                                                        case 132374009: {
                                                            break Label_0192;
                                                        }
                                                        default: {
                                                            throw new RuntimeException();
                                                        }
                                                        case 1644554681: {
                                                            break Label_0210;
                                                        }
                                                    }
                                                }
                                                n3 ^= 0x3B868C79;
                                                try {
                                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 189744971) {
                                                        throw null;
                                                    }
                                                    throw new IOException();
                                                }
                                                catch (final IOException ex) {
                                                    int n4 = 0;
                                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                                                        case 1891843912: {
                                                            n4 = qclwqbzkravomozn(n3, 2074212666);
                                                            break;
                                                        }
                                                        default: {
                                                            throw new IOException("Error in hash");
                                                        }
                                                        case -1143527789: {
                                                            n4 = qclwqbzkravomozn(n3, 46365185);
                                                            break;
                                                        }
                                                    }
                                                    qclwqbzkravomozn(n4, 252860550);
                                                    return;
                                                }
                                            }
                                            break Label_0304;
                                        }
                                        final int n5 = 0x2227BA3D ^ n;
                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n5) == 78318467) {
                                            n6 = (0xB80C5D2 ^ n5);
                                            break Label_0304;
                                        }
                                        qclwqbzkravomozn(n5, 1459201885);
                                        throw new RuntimeException();
                                    }
                                    final MessagesConfig strenghrodactionbar = MessagesConfig.STRENGHRODACTIONBAR;
                                    final Player val$player = player;
                                    final String[] array = new String[(byte)(0x75C73F68 ^ n6)];
                                    array[(byte)(0x75C73F6A ^ n6)] = lhcvyslabi(fxmsssbxktwvrrp(), n6);
                                    array[(byte)(0x75C73F6B ^ n6)] = String.valueOf(this.remainingDuration);
                                    strenghrodactionbar.send((CommandSender)val$player, array);
                                    this.remainingDuration -= (byte)(0xB2EA37C ^ (0x7EE99C17 ^ n6));
                                }
                                
                                static {
                                    (StrenghRodListener$1.nothing_to_see_here = new String[18])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
                                    StrenghRodListener$1.xjzscrfggf = ByteBuffer.wrap(uwnmdkqyzdmuxae()).asCharBuffer().toString();
                                    StrenghRodListener$1.bEPRSHbNj9 = (0x23D898A8 ^ new Random(-2894847973109027094L).nextInt());
                                }
                                
                                public static String lhcvyslabi(final byte[] array, final int n) {
                                    final byte[] bytes = Integer.toString(n).getBytes();
                                    final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
                                    final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
                                    final byte[] bytes2 = StrenghRodListener$1.xjzscrfggf.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
                                    for (int i = 0; i < bytes2.length; ++i) {
                                        final byte[] array2 = bytes2;
                                        final int n4 = i;
                                        array2[n4] ^= bytes[i % bytes.length];
                                    }
                                    return new String(bytes2, StandardCharsets.UTF_16BE);
                                }
                                
                                private static byte[] ogvyrkifasyivjf() {
                                    return new byte[] { 0, 0, 0, 11, 0, 0, 0, 0 };
                                }
                                
                                private static byte[] fxmsssbxktwvrrp() {
                                    return new byte[] { 0, 0, 0, 9, 0, 0, 0, 11 };
                                }
                                
                                private static byte[] uwnmdkqyzdmuxae() {
                                    return new byte[] { 56, 106, 57, 66, 48, 69, 52, 81, 48, 86, 57, 94, 54, 68, 55, 92, 52, 98, 56, 86, 57, 82, 49, 90, 55, 90, 57, 76, 50, 95, 55, 68, 49, 93, 55, 90, 57, 78, 50, 95 };
                                }
                                
                                private static int qclwqbzkravomozn(final int n, final int n2) {
                                    return n2 ^ n;
                                }
                            };
                            final DonutCore plugin = this.plugin;
                            final long n26 = 0L;
                            final long n27 = 20L;
                            final int n28 = 0x7FF740BC ^ n25;
                            bukkitRunnable.runTaskTimer((Plugin)plugin, n26, n27);
                            final int n29 = 0x2A3BB3E ^ n28;
                            if (intValue > (0x791E1D75 ^ n29)) {
                                Bukkit.getScheduler().runTaskLater((Plugin)this.plugin, () -> player.removeMetadata(poeporoyzs(wyxdrxkqljxtrwi(), 0x6A192C93 ^ (0x4BE21F2B ^ (0x2FE23BA7 ^ this.EzI26Y4Lfr))), (Plugin)this.plugin), intValue * 20L);
                            }
                            else {
                                final int wksnwxxltvalsibz3 = wksnwxxltvalsibz(n29, 1525472669);
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz3) != 94795315) {
                                    throw new IOException();
                                }
                            Label_1936:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz3)) {
                                        case 500747775: {
                                            break Label_1865;
                                        }
                                        case 1961198437: {
                                            continue;
                                        }
                                        case 94795315: {
                                            break Label_1936;
                                        }
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            final int wksnwxxltvalsibz4 = wksnwxxltvalsibz(n7, 558850277);
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz4) != 156818144) {
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz4)) {
                                        case 345452071: {
                                            continue;
                                        }
                                        case 156818144: {}
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        Label_1016: {
                        Label_1008:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6)) {
                                    case 495274431: {
                                        continue;
                                    }
                                    case 60684640: {
                                        break Label_1008;
                                    }
                                    case 607271673: {
                                        break Label_1016;
                                    }
                                    default: {
                                        throw new IOException();
                                    }
                                }
                            }
                            n6 ^= 0x2C4CED1;
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 239293419) {
                            wksnwxxltvalsibz(n6, 1593775944);
                            throw new IOException();
                        }
                    }
                }
                else {
                    final int wksnwxxltvalsibz5 = wksnwxxltvalsibz(n4, 590778037);
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz5) != 19571856) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz5)) {
                                case 685700422: {
                                    continue;
                                }
                                case 19571856: {}
                                default: {
                                    throw new IOException();
                                }
                            }
                        }
                    }
                    else {
                        wksnwxxltvalsibz(wksnwxxltvalsibz5, 772616986);
                    }
                }
            }
            else {
                final int wksnwxxltvalsibz6 = wksnwxxltvalsibz(n3, 381708023);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz6) != 230893653) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(wksnwxxltvalsibz6)) {
                            case 1782626371: {
                                continue;
                            }
                            case 230893653: {}
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
                else {
                    wksnwxxltvalsibz(wksnwxxltvalsibz6, 1721510106);
                }
            }
        }
    }
    
    static {
        (StrenghRodListener.nothing_to_see_here = new String[15])[0] = " \u2801\u287c\u280b\u2800\u28c6\u2800\u2800\u28f0\u28ff\u28eb\u28fe\u28bf\u28ff\u28ff\u280d\u28a0\u2820\u2800\u2800\u2880\u2830\u28be\u28fa\u28fb\u28ff\u28ff\u28ff\u28f7\u2840\u2800";
        StrenghRodListener.nothing_to_see_here[1] = "\u28e5\u2800\u2800\u2800\u2801\u2800\u2820\u28bb\u28ac\u2801\u28e0\u28fe\u281b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2810\u2831\u280f\u2849\u2819\u28ff\u28ff\u2847\u2800";
        StrenghRodListener.nothing_to_see_here[2] = "\u28b3\u2800\u28b0\u2856\u2800\u2800\u2808\u2800\u28fa\u28b0\u28ff\u28bb\u28fe\u28f6\u28ff\u28ff\u28f6\u28f6\u28e4\u28e4\u28f4\u28fe\u28ff\u28f7\u28fc\u2846\u28b8\u28ff\u28e7\u2800";
        StrenghRodListener.nothing_to_see_here[3] = "\u2808\u2800\u281c\u2808\u28c0\u28d4\u28e6\u28a8\u28ff\u28ff\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c5\u28fc\u281b\u28b9\u2800";
        StrenghRodListener.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u288b\u287f\u287f\u28ef\u28ed\u285f\u28df\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2858\u2800";
        StrenghRodListener.nothing_to_see_here[5] = "\u2840\u2810\u2800\u2800\u2800\u28ff\u28ef\u287f\u28ff\u28ff\u28ff\u28ef\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28c9\u28bd\u28ff\u2846\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[6] = "\u28b3\u2800\u2804\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2819\u2809\u2809\u2809\u281b\u28fb\u289b\u28ff\u281b\u2803\u2800\u2810\u281b\u283b\u28ff\u2847\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[7] = "\u28fe\u2804\u2800\u2800\u28b8\u28ff\u28ff\u287f\u281f\u281b\u2801\u2880\u2800\u2880\u2844\u28c0\u28e0\u28fe\u28ff\u28ff\u2860\u28f4\u28ce\u28c0\u28e0\u28e0\u28ff\u2847\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[8] = "\u28e7\u2800\u28f4\u28c4\u28fd\u28ff\u28ff\u28ff\u28f6\u28f6\u28d6\u28f6\u28ec\u28fe\u28ff\u28fe\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[9] = "\u28ff\u28f6\u28c8\u286f\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u280b\u28f9\u28a7\u28ff\u28ff\u28ff\u28c4\u2819\u28bf\u28ff\u28ff\u28ff\u2807\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[10] = "\u2839\u28ff\u28ff\u28e7\u288c\u28bd\u28fb\u28bf\u28ef\u28ff\u28ff\u28ff\u28ff\u281f\u28e0\u2858\u283f\u281f\u281b\u281b\u281f\u281b\u28e7\u2848\u283b\u28fe\u28ff\u2800\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[11] = "\u2800\u2808\u2809\u28f7\u287f\u28fd\u2836\u287e\u28bf\u28ff\u28ff\u28ff\u2883\u28e4\u28ff\u28f7\u28e4\u28e4\u28c4\u28c4\u28e0\u28fc\u287f\u28b7\u2880\u28ff\u284f\u2800\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[12] = "\u2800\u2800\u2880\u28ff\u28f7\u280c\u28c8\u28cf\u28dd\u283d\u287f\u28f7\u28fe\u28cf\u28c0\u28c9\u28c9\u28c0\u28c0\u28c0\u28e0\u28e0\u28c4\u2878\u28fe\u28ff\u2803\u2800\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[13] = "\u2800\u28f0\u287f\u28ff\u28e7\u2850\u2804\u2831\u28ff\u28fa\u28fd\u289f\u28ff\u28ff\u28bf\u28ff\u28cd\u2809\u2880\u28c0\u28d0\u28fc\u28ef\u2857\u281f\u284f\u2800\u2800\u2800\u2800";
        StrenghRodListener.nothing_to_see_here[14] = "\u28f0\u28ff\u2800\u28ff\u28ff\u28f4\u2840\u2802\u2818\u28b9\u28ed\u2842\u285a\u283f\u28bf\u28ff\u28ff\u28ff\u287f\u28bf\u28bf\u287f\u283f\u2881\u28f4\u28ff\u28f7\u28f6\u28e6\u28e4";
        StrenghRodListener.saemfzllxy = zzvetotiolygcdd();
        StrenghRodListener.PVczn9O0r9 = (0x56DCD4DB ^ new Random(5251696986285402568L).nextInt());
    }
    
    public static String poeporoyzs(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= StrenghRodListener.saemfzllxy[i % StrenghRodListener.saemfzllxy.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] zzvetotiolygcdd() {
        return new byte[] { 56, 120, 91, 106, 103, 97, 21, 81, 24, 73, 16, 115, 83, 120, 97, 68, 118, 81, 34, 88, 104, 54, 90, 101, 28, 60, 42, 37, 57, 6, 6, 56, 85, 116, 17, 57, 108, 124, 29, 112, 89, 70, 80, 23, 4, 44, 7, 98, 38, 75, 42, 28, 124, 24, 73, 17, 62, 98, 117, 80, 2, 34, 17, 89, 99, 5, 79, 30, 46, 3, 86, 16, 35 };
    }
    
    private static byte[] wyxdrxkqljxtrwi() {
        return new byte[] { -16, -66, 106, 10, 86, 36, 34, 23, 33, 26, 41, 44, 96, 46, 80, 7, 66, 0, 20, 51, 89, 106, 107, 48 };
    }
    
    private static byte[] yjyeeoekqwbikqx() {
        return new byte[] { -9, -74, 109, 56, 87, 44, 45, 21, 42, 25, 33, 54, 101, 39, 81, 19, 78, 9 };
    }
    
    private static byte[] gedmuostredstpn() {
        return new byte[] { -12, -77, 106, 58, 86, 58, 38, 8, 32, 23, 36, 36, 97, 38, 83, 5, 67, 13, 16, 51, 89, 99, 107, 34, 47, 96, 18, 57, 13, 68, 52, 125, 103, 53, 36, 100, 94, 38, 44, 54, 104, 28, 99, 125, 60, 108, 51, 60, 20, 30, 24, 1, 73, 67, 123, 74, 15, 63, 68, 14, 49, 115, 41, 4, 87, 67, 125, 65 };
    }
    
    private static byte[] gudsqexelmgihvf() {
        return new byte[] { -9, -74, 99, 54, 85, 34, 44, 54, 32, 9, 33, 48, 107, 40, 83, 26, 79, 2, 26, 24, 89, 111, 98, 2, 46, 99, 19, 117 };
    }
    
    private static byte[] goeqommusodcorx() {
        return new byte[] { -9, -73, 104, 11, 85, 44, 36, 26, 41, 27, 33, 45, 96, 45, 83, 9, 71, 0, 19, 61, 89, 105, 105, 51 };
    }
    
    private static byte[] ujglfilmovdxdxk() {
        return new byte[] { -9, -79, 106, 1, 80, 37, 33, 22, 40, 27, 33, 43, 98, 39, 86, 0, 66, 12, 18, 61, 89, 111, 107, 57 };
    }
    
    private static byte[] wtlzgtiitkpxphg() {
        return new byte[] { -9, -76, 106, 60, 86, 55, 35, 6, 43, 29, 33, 36, 98, 34, 80, 10, 64, 7 };
    }
    
    private static byte[] gcznmfawvzkxaxr() {
        return new byte[] { -9, -75, 107, 52, 80, 62, 37, 10, 41, 29, 33, 34, 99, 57, 86, 19, 70, 2, 19, 29, 89, 62, 106, 37, 43, 126, 26, 98, 8, 82, 55, 100, 101, 32, 38, 123, 92, 33 };
    }
    
    private static byte[] kjvxpjgendhrfep() {
        return new byte[] { -14, -80, 111, 41, 95, 34, 35, 16, 32, 24, 39, 41, 99, 39, 86, 6, 69, 1 };
    }
    
    private static int wksnwxxltvalsibz(final int n, final int n2) {
        return n2 ^ n;
    }
}
