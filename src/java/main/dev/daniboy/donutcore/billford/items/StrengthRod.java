package dev.daniboy.donutcore.billford.items;

import java.util.Random;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;
import org.bukkit.NamespacedKey;
import java.util.stream.Collectors;
import java.util.List;
import dev.daniboy.donutcore.utils.Hex;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.Material;
import dev.daniboy.donutcore.DonutCore;
import org.bukkit.inventory.ItemStack;

public class StrengthRod extends ItemStack
{
    private DonutCore plugin;
    private static int rGEFkLsDMz = 0;
    private transient int feboJH3aXV = 1269515011;
    private static String[] nothing_to_see_here;
    
    public StrengthRod(final DonutCore plugin, final int n) {
        super(Material.BLAZE_ROD);
        int n2 = 0x6627E7C5 ^ (0x75D3F320 ^ (Integer.parseInt("1916108226") ^ n));
    Label_0118:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                case 2004676616: {
                    continue;
                }
                default: {
                    throw new RuntimeException();
                }
                case 1608998588: {
                    break Label_0118;
                }
                case 134853289: {
                    n2 ^= 0x1B8E3D89;
                    break Label_0118;
                }
            }
        }
        this.plugin = plugin;
        final ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setDisplayName(Hex.hex(plugin.getBillfordGuiConfig$756205206(1840850862).getString("billford_gui.strenth_rod.display_name")));
        itemMeta.setLore((List)plugin.getBillfordGuiConfig$756205206(1840850862).getStringList("billford_gui.strenth_rod.lore").stream().map(Hex::hex).collect(Collectors.toList()));
        itemMeta.getPersistentDataContainer().set(new NamespacedKey((Plugin)plugin, "isStrengthRod"), PersistentDataType.STRING, (Object)"true");
        itemMeta.getPersistentDataContainer().set(new NamespacedKey((Plugin)plugin, "strength"), PersistentDataType.DOUBLE, (Object)plugin.getBillfordGuiConfig$756205206(1840850862).getDouble("billford_gui.strenth_rod.strength"));
        itemMeta.getPersistentDataContainer().set(new NamespacedKey((Plugin)plugin, "duration"), PersistentDataType.INTEGER, (Object)plugin.getBillfordGuiConfig$756205206(1840850862).getInt("billford_gui.strenth_rod.duration"));
        this.setItemMeta(itemMeta);
    }
    
    static {
        (StrengthRod.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        StrengthRod.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        StrengthRod.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        StrengthRod.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        StrengthRod.rGEFkLsDMz = (0x936577F6 ^ new Random(-1830260562922154657L).nextInt());
    }
}
