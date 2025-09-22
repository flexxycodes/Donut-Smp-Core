package dev.daniboy.donutcore;

import java.lang.reflect.Field;
import org.bukkit.command.CommandMap;
import dev.daniboy.donutcore.commands.BalanceCommand;
import dev.daniboy.donutcore.commands.PayToggleCommand;
import dev.daniboy.donutcore.commands.PayCommand;
import dev.daniboy.donutcore.commands.NightVisionCommand;
import dev.daniboy.donutcore.commands.ReplyCommand;
import dev.daniboy.donutcore.commands.MessageToggleCommand;
import dev.daniboy.donutcore.commands.MessageCommand;
import dev.daniboy.donutcore.commands.BillfordEditorCommand;
import dev.daniboy.donutcore.commands.BillfordCommand;
import dev.daniboy.donutcore.commands.RulesCommand;
import dev.daniboy.donutcore.commands.MediaCommand;
import dev.daniboy.donutcore.commands.SetAfkCommand;
import dev.daniboy.donutcore.commands.AfkCommand;
import dev.daniboy.donutcore.commands.SetSpawnCommand;
import dev.daniboy.donutcore.commands.SpawnCommand;
import dev.daniboy.donutcore.commands.HelpCommand;
import org.bukkit.plugin.RegisteredServiceProvider;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import dev.daniboy.donutcore.utils.UpperStackLicense;
import dev.daniboy.donutcore.commands.DiscordCommand;
import org.bukkit.command.Command;
import dev.daniboy.donutcore.commands.StoreCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.CommandExecutor;
import dev.daniboy.donutcore.commands.DonutCoreCommand;
import dev.daniboy.donutcore.billford.listener.StrenghRodListener;
import dev.daniboy.donutcore.billford.listener.CritMultiplierListener;
import org.bukkit.event.Listener;
import dev.daniboy.donutcore.listener.PlayerListener;
import org.bukkit.plugin.Plugin;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import dev.daniboy.donutcore.utils.License;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.net.http.HttpClient;
import org.bukkit.Bukkit;
import dev.daniboy.donutcore.config.MessagesConfig;
import dev.daniboy.donutcore.config.SoundConfig;
import dev.daniboy.donutcore.config.Config;
import dev.daniboy.donutcore.config.MainConfig;
import com.sk89q.worldguard.WorldGuard;
import java.util.HashMap;
import java.io.IOException;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import java.util.Map;
import dev.daniboy.donutcore.placeholder.BillfordTimeLeft;
import dev.daniboy.donutcore.manager.TeleportManager;
import dev.daniboy.donutcore.database.SQLiteManager;
import dev.daniboy.donutcore.config.ConfigManager;
import dev.daniboy.donutcore.gui.impl.billford.BillfordEditorItemsGUI;
import dev.daniboy.donutcore.gui.impl.billford.BillfordEditorGUI;
import dev.daniboy.donutcore.gui.impl.billford.BillfordGUI;
import net.milkbowl.vault.economy.Economy;
import dev.daniboy.donutcore.gui.impl.AfkGUI;
import dev.daniboy.donutcore.gui.impl.SpawnGUI;
import dev.daniboy.donutcore.gui.impl.RulesGUI;
import dev.daniboy.donutcore.gui.impl.MediaGUI;
import dev.daniboy.donutcore.gui.impl.HelpGUI;
import org.bukkit.plugin.java.JavaPlugin;

public final class DonutCore extends JavaPlugin
{
    private HelpGUI helpGui;
    private MediaGUI mediaGui;
    private RulesGUI rulesGui;
    private SpawnGUI spawnGui;
    private AfkGUI afkGui;
    private Economy economy;
    private BillfordGUI billfordGui;
    private BillfordEditorGUI billfordEditorGui;
    private BillfordEditorItemsGUI billfordEditorItemsGUI;
    private ConfigManager configManager;
    private SQLiteManager sqLiteManager;
    private TeleportManager teleportManager;
    private BillfordTimeLeft billfordTimeLeft;
    private final Map<Player, Player> lastMessaged;
    private FileConfiguration helpGuiConfig;
    private FileConfiguration mediaGuiConfig;
    private FileConfiguration afkSpawnGuiConfig;
    private FileConfiguration billfordGuiConfig;
    private FileConfiguration rulesGuiConfig;
    private static int soWjD6JRrA = 0;
    private transient int Jm9tEPij1G = 143268200;
    private static String[] nothing_to_see_here;
    
    public DonutCore() {
        final int n = 0x512055F6 ^ 0x3D26087F;
    Label_0067:
        while (true) {
            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n)) {
                case 211087360: {
                    continue;
                }
                case 21772607: {}
                case 1094401866: {
                    break Label_0067;
                }
                default: {
                    throw new IOException();
                }
            }
        }
        int n2 = 0x2A09176D ^ (0x65D6606B ^ Integer.parseInt("1234285649"));
        Label_0143: {
        Label_0136:
            while (true) {
                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                    case 1793728851: {
                        continue;
                    }
                    case 99209583: {
                        break Label_0136;
                    }
                    case 1322990999: {
                        break Label_0143;
                    }
                    default: {
                        throw new IOException();
                    }
                }
            }
            n2 ^= 0x1DB37881;
        }
        this.lastMessaged = (Map<Player, Player>)new HashMap();
    }
    
    public void onEnable() {
        final int n = 0x64845CCB ^ (0x6768960 ^ (0x29FFB681 ^ this.Jm9tEPij1G));
        Label_6067: {
            if (WorldGuard.getInstance() != null) {
                int n2 = 0x57ECE798 ^ n;
                Label_6059: {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2) != 253041117) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                                case 358366877: {
                                    continue;
                                }
                                case 253041117: {}
                                default: {
                                    break Label_6059;
                                }
                            }
                        }
                    }
                    else {
                        Label_0279: {
                        Label_0268:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                                    case 2131759070: {
                                        continue;
                                    }
                                    case 253041117: {
                                        break Label_0268;
                                    }
                                    case 1450398696: {
                                        break Label_0279;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            n2 ^= 0x6A0D72A5;
                        }
                        this.helpGuiConfig = this.loadConfig$1876126984(xlnoigleho(jlthopxsenqvxco(), rmdqikusoembxnk(), n2), 1027462332);
                        final int n3 = 0x14251F52 ^ n2;
                        this.mediaGuiConfig = this.loadConfig$1876126984(xlnoigleho(tagjfuauhtrlydt(), rmdqikusoembxnk(), n3), 1027462332);
                        final int n4 = 0x490F6CE7 ^ n3;
                        this.rulesGuiConfig = this.loadConfig$1876126984(xlnoigleho(cynbffydouynyqu(), rmdqikusoembxnk(), n4), 1027462332);
                        final int n5 = 0x670CD3F9 ^ n4;
                        this.afkSpawnGuiConfig = this.loadConfig$1876126984(xlnoigleho(fxxydzmlcihogxl(), rmdqikusoembxnk(), n5), 1027462332);
                        final int n6 = 0x581C103E ^ n5;
                        this.billfordGuiConfig = this.loadConfig$1876126984(xlnoigleho(sjkermdkehqbkhm(), rmdqikusoembxnk(), n6), 1027462332);
                        final int n7 = 0x1D57789B ^ n6;
                        this.teleportManager = new TeleportManager(this, 2134981223);
                        final int n8 = 0x1C69AE26 ^ n7;
                        this.sqLiteManager = new SQLiteManager(this, 1851206422);
                        final int n9 = 0x56AEA5BD ^ n8;
                        this.helpGui = new HelpGUI(this, 1156425752);
                        final int n10 = 0x7F74BDB4 ^ n9;
                        this.spawnGui = new SpawnGUI(this, this.sqLiteManager, this.teleportManager, 588188175);
                        final int n11 = 0x96A0464 ^ n10;
                        this.afkGui = new AfkGUI(this, this.sqLiteManager, this.teleportManager, 469798925);
                        final int n12 = 0x2295AFD5 ^ n11;
                        this.mediaGui = new MediaGUI(this, 1156425752);
                        final int n13 = 0x1A7BC803 ^ n12;
                        this.rulesGui = new RulesGUI(this, 1156425752);
                        final int n14 = 0x2947D4CF ^ n13;
                        this.billfordGui = new BillfordGUI(this, this.sqLiteManager, 2049851990);
                        final int n15 = 0x1AB0FAC5 ^ n14;
                        this.billfordEditorGui = new BillfordEditorGUI(this, 1156425752);
                        final int n16 = 0x1B57F32 ^ n15;
                        this.billfordEditorItemsGUI = new BillfordEditorItemsGUI(this, this.sqLiteManager, 1474256625);
                        final int n17 = 0x509714ED ^ n16;
                        this.helpGui.loadHelpConfigValues$1430792781(839749214);
                        final int n18 = 0x4B88F167 ^ n17;
                        this.mediaGui.loadMediaConfigValues$2120577358(54860659);
                        final int n19 = 0xD348F10 ^ n18;
                        this.rulesGui.loadRulesConfigValues$113812495(476948616);
                        final int n20 = 0x3A2DA394 ^ n19;
                        this.spawnGui.loadSpawnConfigValues$882403349(870176311);
                        final int n21 = 0x2ECB8908 ^ n20;
                        this.afkGui.loadAfkConfigValues$568738828(1586297296);
                        final int n22 = 0x30C67708 ^ n21;
                        this.configManager = new ConfigManager(this);
                        final int n23 = 0x1E9C5798 ^ n22;
                        this.configManager.register(MainConfig.class);
                        final int n24 = 0xF5B0B3 ^ n23;
                        this.configManager.register(SoundConfig.class);
                        final int n25 = 0x3494E7A2 ^ n24;
                        MessagesConfig.loadAll(this);
                        final int n26 = 0x3575538C ^ n25;
                        this.configManager.reload();
                        int n27 = 0x40C2754B ^ n26;
                        if ((this.setupEconomy$1059304311(295727738) ? 1 : 0) == (0x6EDB3AFD ^ n27)) {
                            this.getLogger().severe(xlnoigleho(ijdrxefcmixajig(), rmdqikusoembxnk(), 0x7E4340F6 ^ n27));
                            break Label_6067;
                        }
                        Label_1476: {
                        Label_1464:
                            while (true) {
                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n27)) {
                                    case 1445142711: {
                                        continue;
                                    }
                                    case 113814673: {
                                        break Label_1464;
                                    }
                                    case 1180249076: {
                                        break Label_1476;
                                    }
                                    default: {
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                            n27 ^= 0x5784599;
                        }
                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n27) != 9219442) {
                            saxuwxcnfwcxyrlg(n27, 1731216976);
                        }
                        else {
                            int n28 = saxuwxcnfwcxyrlg(n27, 403050157);
                            while (true) {
                                int n29;
                                int n30;
                                String xlnoigleho;
                                int n31;
                                String xlnoigleho2 = null;
                                int n32;
                                HttpClient build;
                                int n33;
                                short n34 = 0;
                                HttpRequest build2;
                                HttpResponse send;
                                int statusCode;
                                int n35;
                                Exception ex3;
                                int n36;
                                int n37;
                                int n38;
                                int n39;
                                int n40;
                                int n41;
                                int n42;
                                int n43;
                                int saxuwxcnfwcxyrlg = 0;
                                int n44;
                                int n45;
                                License.LicenseData licenseById;
                                int n46;
                                int n47;
                                int saxuwxcnfwcxyrlg2;
                                int n48;
                                SimpleDateFormat simpleDateFormat;
                                int n49;
                                int n50;
                                int n51;
                                int n52;
                                int n53;
                                int n54;
                                int n55;
                                int n56;
                                int n57;
                                int n58;
                                int n59;
                                int n60;
                                int n61;
                                int n62;
                                int n63;
                                DonutCoreCommand donutCoreCommand;
                                int n64;
                                int n65;
                                int n66;
                                int n67;
                                int n68;
                                boolean help;
                                int n69;
                                boolean media;
                                int n70;
                                boolean rules;
                                int n71;
                                boolean spawn;
                                int n72;
                                boolean afk;
                                int n73;
                                boolean billford;
                                int n74;
                                byte b;
                                int n75;
                                boolean nightvision;
                                int n76;
                                boolean economy;
                                int n77;
                                Label_3431_Outer:Label_3620_Outer:
                                while (true) {
                                    Label_2736: {
                                    Label_3663_Outer:
                                        while (true) {
                                            Label_2663: {
                                                while (true) {
                                                    Label_2584: {
                                                    Label_3155_Outer:
                                                        while (true) {
                                                            Label_2511: {
                                                                Label_3708_Outer:Label_3337_Outer:
                                                                while (true) {
                                                                    Label_2438: {
                                                                        while (true) {
                                                                            Label_2365: {
                                                                                while (true) {
                                                                                    Label_2292: {
                                                                                        while (true) {
                                                                                            Label_2219: {
                                                                                                while (true) {
                                                                                                    Label_1637: {
                                                                                                        if (Bukkit.getPluginManager().getPlugin(xlnoigleho(ermttddynwqzdjy(), rmdqikusoembxnk(), n28)) != null) {
                                                                                                            n29 = (0x317DCF18 ^ n28);
                                                                                                            this.billfordTimeLeft = new BillfordTimeLeft(this, 1093327444);
                                                                                                            n30 = (0x2E8D8834 ^ n29);
                                                                                                            this.billfordTimeLeft.register();
                                                                                                            n28 = (0xF949EE8 ^ n30);
                                                                                                            break Label_1637;
                                                                                                        }
                                                                                                        Label_3478: {
                                                                                                            break Label_3478;
                                                                                                        Label_4018_Outer:
                                                                                                            while (true) {
                                                                                                                xlnoigleho = xlnoigleho(pntsouvishvwqwq(), rmdqikusoembxnk(), n28);
                                                                                                                n31 = (0x6F9FB794 ^ n28);
                                                                                                                xlnoigleho2 = xlnoigleho(itamgifmfgyhppz(), rmdqikusoembxnk(), n31);
                                                                                                                n32 = (0xCA05951 ^ n31);
                                                                                                                build = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).connectTimeout(Duration.ofSeconds(10L)).build();
                                                                                                                n33 = (0x50C8FF1F ^ n32);
                                                                                                                n34 = (byte)(0x7BF70772 ^ n33);
                                                                                                                n28 = (0x6FC80AAD ^ n33);
                                                                                                                try {
                                                                                                                    build2 = HttpRequest.newBuilder().GET().uri(URI.create(xlnoigleho)).setHeader(xlnoigleho(hrzglhrrfehcrkb(), rmdqikusoembxnk(), n28), xlnoigleho(lyprqlhkygpzanm(), rmdqikusoembxnk(), n28)).build();
                                                                                                                    n28 ^= 0x58C90677;
                                                                                                                    send = build.send(build2, HttpResponse.BodyHandlers.ofString());
                                                                                                                    n28 ^= 0x4F1F29C;
                                                                                                                    statusCode = send.statusCode();
                                                                                                                    n28 ^= 0x5D64A1E5;
                                                                                                                    n34 = (short)statusCode;
                                                                                                                    n28 ^= 0x3AFC5355;
                                                                                                                    Label_3860: {
                                                                                                                    Block_33:
                                                                                                                        while (true) {
                                                                                                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28)) {
                                                                                                                                case 363641633: {
                                                                                                                                    continue Label_4018_Outer;
                                                                                                                                }
                                                                                                                                case 205785552: {
                                                                                                                                    n28 ^= 0x602CC963;
                                                                                                                                    break Block_33;
                                                                                                                                }
                                                                                                                                case 1897795173: {
                                                                                                                                    break Label_3860;
                                                                                                                                }
                                                                                                                                default: {
                                                                                                                                    throw new IllegalAccessException();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) != 174851628) {
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            throw new IllegalAccessException();
                                                                                                                        }
                                                                                                                        catch (final IllegalAccessException ex) {
                                                                                                                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n28)) {
                                                                                                                                case 2107512634: {
                                                                                                                                    n28 ^= 0x3F80AF70;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                case -1270571991: {
                                                                                                                                    n28 ^= 0x46BBFE12;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                default: {
                                                                                                                                    throw new RuntimeException("Error in hash");
                                                                                                                                }
                                                                                                                            }
                                                                                                                        Label_3992:
                                                                                                                            while (true) {
                                                                                                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28)) {
                                                                                                                                    case 723276650: {
                                                                                                                                        continue Label_4018_Outer;
                                                                                                                                    }
                                                                                                                                    case 157537383: {
                                                                                                                                        break Label_3992;
                                                                                                                                    }
                                                                                                                                    case 2145068895: {
                                                                                                                                        break Label_3478;
                                                                                                                                    }
                                                                                                                                    default: {
                                                                                                                                        throw new IllegalAccessException();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n28 ^= 0x42F1E6AC;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    Block_30: {
                                                                                                                        while (true) {
                                                                                                                            Block_24: {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        Label_3540: {
                                                                                                                                            while (true) {
                                                                                                                                                while (true) {
                                                                                                                                                    Block_27: {
                                                                                                                                                        while (true) {
                                                                                                                                                        Block_29_Outer:
                                                                                                                                                            while (true) {
                                                                                                                                                            Block_23_Outer:
                                                                                                                                                                while (true) {
                                                                                                                                                                    while (true) {
                                                                                                                                                                        while (true) {
                                                                                                                                                                        Label_4068:
                                                                                                                                                                            while (true) {
                                                                                                                                                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28)) {
                                                                                                                                                                                    case 1534728081: {
                                                                                                                                                                                        continue Label_4018_Outer;
                                                                                                                                                                                    }
                                                                                                                                                                                    case 22327974: {
                                                                                                                                                                                        break Label_4068;
                                                                                                                                                                                    }
                                                                                                                                                                                    default: {
                                                                                                                                                                                        throw new IllegalAccessException();
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            n28 ^= 0x2D2B30EA;
                                                                                                                                                                            throw new IllegalAccessException();
                                                                                                                                                                            n28 = saxuwxcnfwcxyrlg(n28, 1521899126);
                                                                                                                                                                            iftrue(Label_3461:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 179833391);
                                                                                                                                                                            break Block_27;
                                                                                                                                                                            Label_3528: {
                                                                                                                                                                                n28 ^= 0x561F44C3;
                                                                                                                                                                            }
                                                                                                                                                                            break Label_3540;
                                                                                                                                                                            break Block_29_Outer;
                                                                                                                                                                            Label_3556:
                                                                                                                                                                            n28 = saxuwxcnfwcxyrlg(n28, 1182506247);
                                                                                                                                                                            break Label_1637;
                                                                                                                                                                            n28 ^= 0x6E4AB08B;
                                                                                                                                                                            iftrue(Label_3648:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 119989106);
                                                                                                                                                                            break Block_30;
                                                                                                                                                                            n28 ^= 0x29290C3E;
                                                                                                                                                                            throw new IllegalAccessException();
                                                                                                                                                                            n28 = saxuwxcnfwcxyrlg(n28, 825779795);
                                                                                                                                                                            throw new IllegalAccessException();
                                                                                                                                                                            Label_4164: {
                                                                                                                                                                                break Label_4164;
                                                                                                                                                                                switch([Lw5.q;@70f17e0)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28));
                                                                                                                                                                            }
                                                                                                                                                                            switch([Lw5.q;@1f39a99)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28));
                                                                                                                                                                            Label_3603:
                                                                                                                                                                            n28 = saxuwxcnfwcxyrlg(n28, 193106230);
                                                                                                                                                                            continue Label_4018_Outer;
                                                                                                                                                                            n28 ^= 0x4F11BEAA;
                                                                                                                                                                            throw new IllegalAccessException();
                                                                                                                                                                            continue Label_3431_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        Label_3322: {
                                                                                                                                                                            n28 ^= 0x43908EB2;
                                                                                                                                                                        }
                                                                                                                                                                        break Label_2365;
                                                                                                                                                                        n28 ^= 0x6A9CE6A9;
                                                                                                                                                                        iftrue(Label_3183:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 22327974);
                                                                                                                                                                        continue Label_3155_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    Label_3416: {
                                                                                                                                                                        n28 ^= 0x9CC5ED8;
                                                                                                                                                                    }
                                                                                                                                                                    break Label_2438;
                                                                                                                                                                    n28 = saxuwxcnfwcxyrlg(n28, 1898276079);
                                                                                                                                                                    iftrue(Label_3603:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 46966080);
                                                                                                                                                                    continue Block_23_Outer;
                                                                                                                                                                }
                                                                                                                                                                n28 = saxuwxcnfwcxyrlg(n28, 265129248);
                                                                                                                                                                throw new IllegalAccessException();
                                                                                                                                                                iftrue(Label_3416:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 140770606);
                                                                                                                                                                continue Block_29_Outer;
                                                                                                                                                            }
                                                                                                                                                            switch([Lw5.q;@929a15e)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28));
                                                                                                                                                            Label_3461: {
                                                                                                                                                                n28 = saxuwxcnfwcxyrlg(n28, 1272074844);
                                                                                                                                                            }
                                                                                                                                                            break Label_2584;
                                                                                                                                                            n28 ^= 0x448EF726;
                                                                                                                                                            iftrue(Label_3736:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 163312230);
                                                                                                                                                            continue Label_3620_Outer;
                                                                                                                                                        }
                                                                                                                                                        Label_3784: {
                                                                                                                                                            n28 ^= 0x7D890F51;
                                                                                                                                                        }
                                                                                                                                                        break Label_2292;
                                                                                                                                                        Label_4356:
                                                                                                                                                        n28 ^= 0x7CF3FE09;
                                                                                                                                                        throw new IllegalAccessException();
                                                                                                                                                        switch([Lw5.q;@298893f)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28));
                                                                                                                                                        Label_4132:
                                                                                                                                                        n28 ^= 0x38E4C454;
                                                                                                                                                        throw new IllegalAccessException();
                                                                                                                                                    }
                                                                                                                                                    n28 = saxuwxcnfwcxyrlg(n28, 868608115);
                                                                                                                                                    throw new IllegalAccessException();
                                                                                                                                                    Label_3232: {
                                                                                                                                                        n28 ^= 0x7A036694;
                                                                                                                                                    }
                                                                                                                                                    break Label_2511;
                                                                                                                                                    n28 = saxuwxcnfwcxyrlg(n28, 1060697965);
                                                                                                                                                    iftrue(Label_3277:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 94916253);
                                                                                                                                                    break Block_24;
                                                                                                                                                    Label_3648:
                                                                                                                                                    n28 ^= 0x76D20658;
                                                                                                                                                    break Label_2736;
                                                                                                                                                    Label_4212:
                                                                                                                                                    n28 ^= 0x7B6276DB;
                                                                                                                                                    throw new IllegalAccessException();
                                                                                                                                                    n28 ^= 0x51414D91;
                                                                                                                                                    iftrue(Label_3691:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 125580668);
                                                                                                                                                    continue Label_3155_Outer;
                                                                                                                                                }
                                                                                                                                                Label_3183: {
                                                                                                                                                    switch([Lw5.q;@a7dd20c)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28));
                                                                                                                                                }
                                                                                                                                                Label_3388:
                                                                                                                                                n28 ^= 0x32CB9540;
                                                                                                                                                continue Label_3708_Outer;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iftrue(Label_3556:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 152626041);
                                                                                                                                        continue Label_3155_Outer;
                                                                                                                                    }
                                                                                                                                    n28 ^= 0x46D6E1F1;
                                                                                                                                    iftrue(Label_3322:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28) == 53005196);
                                                                                                                                    continue Label_3708_Outer;
                                                                                                                                }
                                                                                                                                switch([Lw5.q;@eda4755)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28));
                                                                                                                            }
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        Label_3277: {
                                                                                                                            n28 = saxuwxcnfwcxyrlg(n28, 356264617);
                                                                                                                        }
                                                                                                                        break Label_2219;
                                                                                                                        Label_3691:
                                                                                                                        n28 = saxuwxcnfwcxyrlg(n28, 70598896);
                                                                                                                        break Label_2663;
                                                                                                                    }
                                                                                                                    n28 = saxuwxcnfwcxyrlg(n28, 673846372);
                                                                                                                    throw new IllegalAccessException();
                                                                                                                    Label_3736: {
                                                                                                                        switch([Lw5.q;@56a756a)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n28));
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (final Exception ex2) {
                                                                                                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n28)) {
                                                                                                                        case 1739611458: {
                                                                                                                            n35 = (0x68A02F90 ^ n28);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        default: {
                                                                                                                            throw new RuntimeException("Error in hash");
                                                                                                                        }
                                                                                                                        case 1077922210: {
                                                                                                                            n35 = (0x6C51DD0C ^ n28);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        case -1577554184: {
                                                                                                                            n35 = (0x306929E7 ^ n28);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        case -1424308600: {
                                                                                                                            n35 = (0x31357CE9 ^ n28);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    ex3 = ex2;
                                                                                                                    n36 = (0x2D7075EF ^ n35);
                                                                                                                    ex3.printStackTrace();
                                                                                                                    n28 = (0x3BE4DAEC ^ n36);
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        Label_5956: {
                                                                                                            if (n34 != (short)(0x32C28BF3 ^ n28)) {
                                                                                                                n37 = (0x49EBD7C5 ^ n28);
                                                                                                                log$2121372563(xlnoigleho(qlqophqofftkjdl(), rmdqikusoembxnk(), n37), 1088644123);
                                                                                                                n38 = (0x42868746 ^ n37);
                                                                                                                log$2121372563(xlnoigleho(nbgwhdjwtslkblx(), rmdqikusoembxnk(), n38), 1088644123);
                                                                                                                n39 = (0x7508E126 ^ n38);
                                                                                                                log$2121372563(xlnoigleho(ruujzauydhvwsfc(), rmdqikusoembxnk(), n39), 1088644123);
                                                                                                                n40 = (0x6914D03B ^ n39);
                                                                                                                log$2121372563(xlnoigleho(mxkzvrcnrhvjlny(), rmdqikusoembxnk(), n40), 1088644123);
                                                                                                                n41 = (0x69D2B1DA ^ n40);
                                                                                                                log$2121372563(xlnoigleho(rtslyychbnctbnm(), rmdqikusoembxnk(), n41), 1088644123);
                                                                                                                n42 = (0x53D25216 ^ n41);
                                                                                                                log$2121372563(xlnoigleho(omdmqfgkespzmdx(), rmdqikusoembxnk(), n42), 1088644123);
                                                                                                                n43 = (0x3556F507 ^ n42);
                                                                                                                try {
                                                                                                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n43) != 52278256) {
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    throw new RuntimeException();
                                                                                                                }
                                                                                                                catch (final RuntimeException ex4) {
                                                                                                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n43)) {
                                                                                                                        case 281953648: {
                                                                                                                            saxuwxcnfwcxyrlg = (0x90520CA ^ n43);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        case 1462756209: {
                                                                                                                            saxuwxcnfwcxyrlg = saxuwxcnfwcxyrlg(n43, 569971722);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        default: {
                                                                                                                            throw new RuntimeException("Error in hash");
                                                                                                                        }
                                                                                                                    }
                                                                                                                Label_4912:
                                                                                                                    while (true) {
                                                                                                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg)) {
                                                                                                                            case 1397579954: {
                                                                                                                                continue Label_3431_Outer;
                                                                                                                            }
                                                                                                                            case 92801373: {
                                                                                                                                break Label_4912;
                                                                                                                            }
                                                                                                                            case 1379283197: {
                                                                                                                                break Label_5956;
                                                                                                                            }
                                                                                                                            default: {
                                                                                                                                throw new IllegalAccessException();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    saxuwxcnfwcxyrlg ^= 0x3F15DC42;
                                                                                                                    break Label_5956;
                                                                                                                }
                                                                                                            }
                                                                                                            n44 = (0x17BAF0AF ^ n28);
                                                                                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n44) != 144263702) {
                                                                                                                throw new IllegalAccessException();
                                                                                                            }
                                                                                                            n45 = (0xE1ADE45 ^ n44);
                                                                                                            licenseById = License.getLicenseById(MainConfig.PluginSettings.LICENSE_KEY);
                                                                                                            n46 = (0x410D202A ^ n45);
                                                                                                            Label_5082: {
                                                                                                                if (licenseById != null) {
                                                                                                                    n47 = (0x56A201DA ^ n46);
                                                                                                                    if ((licenseById.product().equals((Object)xlnoigleho2) ? 1 : 0) == (0x3CCD8421 ^ n47)) {
                                                                                                                        n46 = (0x5CB7288C ^ n47);
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        saxuwxcnfwcxyrlg2 = saxuwxcnfwcxyrlg(n47, 1827411222);
                                                                                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg2) == 188832123) {
                                                                                                                            n48 = (0x20989E8F ^ saxuwxcnfwcxyrlg2);
                                                                                                                            simpleDateFormat = new SimpleDateFormat();
                                                                                                                            n49 = (0x217C0DF2 ^ n48);
                                                                                                                            log$2121372563(xlnoigleho(hddovgakuafzhrw(), rmdqikusoembxnk(), n49), 1088644123);
                                                                                                                            n50 = (0x1F198CB1 ^ n49);
                                                                                                                            log$2121372563("§fLicense Key: §b" + MainConfig.PluginSettings.LICENSE_KEY.substring((int)(byte)(0x4EDC8EFB ^ n50), MainConfig.PluginSettings.LICENSE_KEY.length() / (byte)(0x4EDC8EFE ^ n50)) + "**********", 1088644123);
                                                                                                                            n51 = (0x5CE48251 ^ n50);
                                                                                                                            log$2121372563("§fOwner: §b" + licenseById.owner(), 1088644123);
                                                                                                                            n52 = (0x17E663C8 ^ n51);
                                                                                                                            log$2121372563("§fCreation Date: §b" + simpleDateFormat.format(new Date(licenseById.creation_date())), 1088644123);
                                                                                                                            n53 = (0x44652ACD ^ n52);
                                                                                                                            log$2121372563("§fProduct: §b" + licenseById.product(), 1088644123);
                                                                                                                            n54 = (0x35183FC5 ^ n53);
                                                                                                                            log$2121372563("§fAllowed IPs: §b" + Arrays.toString((Object[])licenseById.ips()), 1088644123);
                                                                                                                            n55 = (0x309BDEC9 ^ n54);
                                                                                                                            log$2121372563(xlnoigleho(spbbwyulftrxgui(), rmdqikusoembxnk(), n55), 1088644123);
                                                                                                                            saxuwxcnfwcxyrlg = (0x70319085 ^ n55);
                                                                                                                            break Label_5956;
                                                                                                                        }
                                                                                                                        while (true) {
                                                                                                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg2)) {
                                                                                                                                case 642181722: {
                                                                                                                                    continue Label_3431_Outer;
                                                                                                                                }
                                                                                                                                case 188832123: {}
                                                                                                                                default: {
                                                                                                                                    throw new IllegalAccessException();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                else {
                                                                                                                    Label_5420: {
                                                                                                                    Label_5408:
                                                                                                                        while (true) {
                                                                                                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n46)) {
                                                                                                                                case 1883767148: {
                                                                                                                                    continue Label_3431_Outer;
                                                                                                                                }
                                                                                                                                case 238582265: {
                                                                                                                                    break Label_5408;
                                                                                                                                }
                                                                                                                                case 465419516: {
                                                                                                                                    break Label_5420;
                                                                                                                                }
                                                                                                                                default: {
                                                                                                                                    throw new IllegalAccessException();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        n46 ^= 0x474F2484;
                                                                                                                    }
                                                                                                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n46) != 124720582) {
                                                                                                                        saxuwxcnfwcxyrlg(n46, 565418059);
                                                                                                                        throw new IllegalAccessException();
                                                                                                                    }
                                                                                                                Label_5484:
                                                                                                                    while (true) {
                                                                                                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n46)) {
                                                                                                                            case 804088191: {
                                                                                                                                break Label_5082;
                                                                                                                            }
                                                                                                                            case 1201456702: {
                                                                                                                                continue Label_3431_Outer;
                                                                                                                            }
                                                                                                                            case 124720582: {
                                                                                                                                break Label_5484;
                                                                                                                            }
                                                                                                                            default: {
                                                                                                                                throw new IllegalAccessException();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    n46 ^= 0x4D5A0DD2;
                                                                                                                }
                                                                                                            }
                                                                                                            log$2121372563(xlnoigleho(tsddnpzsafepijz(), rmdqikusoembxnk(), n46), 1088644123);
                                                                                                            n56 = (0x6A613B46 ^ n46);
                                                                                                            log$2121372563(xlnoigleho(krgphgxhqctvpda(), rmdqikusoembxnk(), n56), 1088644123);
                                                                                                            n57 = (0x6546C2BE ^ n56);
                                                                                                            log$2121372563("§4INVALID LICENSE KEY '" + MainConfig.PluginSettings.LICENSE_KEY, 1088644123);
                                                                                                            n58 = (0x722BC611 ^ n57);
                                                                                                            log$2121372563(xlnoigleho(eimyrkrrrragtwx(), rmdqikusoembxnk(), n58), 1088644123);
                                                                                                            n59 = (0x6AB84A1A ^ n58);
                                                                                                            log$2121372563(xlnoigleho(jokmlzzqzjzllcr(), rmdqikusoembxnk(), n59), 1088644123);
                                                                                                            n60 = (0x3B8C91EE ^ n59);
                                                                                                            log$2121372563(xlnoigleho(omxaixkwcmdstxp(), rmdqikusoembxnk(), n60), 1088644123);
                                                                                                            log$2121372563(xlnoigleho(qrgtupbwgnkpkke(), rmdqikusoembxnk(), 0x56D33FD8 ^ n60), 1088644123);
                                                                                                            Bukkit.getPluginManager().disablePlugin((Plugin)this);
                                                                                                            break Label_6067;
                                                                                                        }
                                                                                                        this.reloadCrates$1915480240(2123490062);
                                                                                                        break Label_6067;
                                                                                                    }
                                                                                                    this.getServer().getPluginManager().registerEvents((Listener)new PlayerListener(this, this.spawnGui, this.sqLiteManager, 536216094), (Plugin)this);
                                                                                                    n61 = (0x49B8C772 ^ n28);
                                                                                                    this.getServer().getPluginManager().registerEvents((Listener)new CritMultiplierListener(this, 1891224068), (Plugin)this);
                                                                                                    n62 = (0x72C7DCCB ^ n61);
                                                                                                    this.getServer().getPluginManager().registerEvents((Listener)new StrenghRodListener(this, 941543297), (Plugin)this);
                                                                                                    n63 = (0x618FBFBD ^ n62);
                                                                                                    donutCoreCommand = new DonutCoreCommand(this, this.sqLiteManager, 2025139659);
                                                                                                    n64 = (0xB1847AB ^ n63);
                                                                                                    this.getCommand(xlnoigleho(ptynqgrcmflzlfj(), rmdqikusoembxnk(), n64)).setExecutor((CommandExecutor)donutCoreCommand);
                                                                                                    n65 = (0x6CCEB89 ^ n64);
                                                                                                    this.getCommand(xlnoigleho(oogneurwvtljopd(), rmdqikusoembxnk(), n65)).setTabCompleter((TabCompleter)donutCoreCommand);
                                                                                                    n66 = (0x4D7CD9B7 ^ n65);
                                                                                                    this.getCommandMap$1431339485(436386096).register(xlnoigleho(hrfytwxtqwcaacg(), rmdqikusoembxnk(), n66), (Command)new StoreCommand());
                                                                                                    n67 = (0x4EA5F34D ^ n66);
                                                                                                    this.getCommandMap$1431339485(436386096).register(xlnoigleho(lspttvzdvtcaehd(), rmdqikusoembxnk(), n67), (Command)new DiscordCommand());
                                                                                                    n68 = (0x662D3FCF ^ n67);
                                                                                                    help = MainConfig.Features.HELP;
                                                                                                    n28 = (0x5A5EBF13 ^ n68);
                                                                                                    if ((help ? 1 : 0) == (0xB4F0A0D ^ n28)) {
                                                                                                        continue Label_3663_Outer;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                n69 = (0x742CA44D ^ n28);
                                                                                                this.loadHelpFeature$2074084618(231613316);
                                                                                                n28 = (0x5E287989 ^ n69);
                                                                                            }
                                                                                            media = MainConfig.Features.MEDIA;
                                                                                            n28 ^= 0x15A5E7D2;
                                                                                            if ((media ? 1 : 0) == (0x34EE301B ^ n28)) {
                                                                                                continue Label_3337_Outer;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        n70 = (0x45D1BC73 ^ n28);
                                                                                        this.loadMediaFeature$658125645(873002043);
                                                                                        n28 = (0x7CD64404 ^ n70);
                                                                                    }
                                                                                    rules = MainConfig.Features.RULES;
                                                                                    n28 ^= 0x48619D89;
                                                                                    if ((rules ? 1 : 0) == (0x458855E5 ^ n28)) {
                                                                                        continue;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                n71 = (0x26BAA24A ^ n28);
                                                                                this.loadRulesFeature$424103264(1821726518);
                                                                                n28 = (0x23FCCD09 ^ n71);
                                                                            }
                                                                            spawn = MainConfig.Features.SPAWN;
                                                                            n28 ^= 0x5F4E009;
                                                                            if ((spawn ? 1 : 0) == (0x453ADAAF ^ n28)) {
                                                                                continue Label_3663_Outer;
                                                                            }
                                                                            break;
                                                                        }
                                                                        n72 = (0x723BA7CB ^ n28);
                                                                        this.loadSpawnFeature$2109479120(340058453);
                                                                        n28 = (0x493C6C53 ^ n72);
                                                                    }
                                                                    afk = MainConfig.Features.AFK;
                                                                    n28 ^= 0x3519FE40;
                                                                    if ((afk ? 1 : 0) == (0x4B24EF77 ^ n28)) {
                                                                        continue Label_3663_Outer;
                                                                    }
                                                                    break;
                                                                }
                                                                n73 = (0xEF6F0CA ^ n28);
                                                                this.loadAfkFeature$22344590(684220475);
                                                                n28 = (0x1E6970F7 ^ n73);
                                                            }
                                                            billford = MainConfig.Features.BILLFORD;
                                                            n28 ^= 0x3E5BE87B;
                                                            if ((billford ? 1 : 0) == (0x65E08731 ^ n28)) {
                                                                continue Label_3620_Outer;
                                                            }
                                                            break;
                                                        }
                                                        n74 = (0x61380109 ^ n28);
                                                        this.loadBillfordFeature$2003866414(1699244838);
                                                        n28 = (0x705C0523 ^ n74);
                                                    }
                                                    b = (byte)(0x7484831A ^ n28);
                                                    n28 ^= 0x186E91ED;
                                                    if (b == (0x6CEA12F6 ^ n28)) {
                                                        continue;
                                                    }
                                                    break;
                                                }
                                                n75 = (0x7235F290 ^ n28);
                                                this.loadChatFeature$468648758(769278616);
                                                n28 = (0x2741FFF1 ^ n75);
                                            }
                                            nightvision = MainConfig.Features.NIGHTVISION;
                                            n28 ^= 0x736D824C;
                                            if ((nightvision ? 1 : 0) == (0x4AF39DDB ^ n28)) {
                                                continue Label_3663_Outer;
                                            }
                                            break;
                                        }
                                        n76 = (0x6D18DC96 ^ n28);
                                        this.loadNightVisionFeature$1305102662(1016545307);
                                        n28 = (0x75806A45 ^ n76);
                                    }
                                    economy = MainConfig.Features.ECONOMY;
                                    n28 ^= 0x60CCC879;
                                    if ((economy ? 1 : 0) != (0x32A7E371 ^ n28)) {
                                        n77 = (0x3FCEC158 ^ n28);
                                        this.loadEconomyFeature$749298711(1728877855);
                                        n28 = (0x45693481 ^ n77);
                                        continue Label_3431_Outer;
                                    }
                                    break;
                                }
                                continue;
                            }
                        }
                    }
                }
                throw new IllegalAccessException();
            }
            this.getLogger().severe(xlnoigleho(cniexdbfyewsxht(), rmdqikusoembxnk(), 0x33EBA81E ^ n));
            this.getServer().getPluginManager().disablePlugin((Plugin)this);
        }
        UpperStackLicense.hexItem(this);
    }
    
    public static void log$2121372563(final String s, final int n) {
        final int n2 = 0x1AB8834D ^ (0x5E0EEC17 ^ (0x33FCBC16 ^ (DonutCore.soWjD6JRrA ^ n)));
        Bukkit.getConsoleSender().sendMessage(s);
    }
    
    private FileConfiguration loadConfig$1876126984(final String s, final int n) {
        final int n2 = 0x2410C6C7 ^ (0x50854C0E ^ (0x2DC43E72 ^ (this.Jm9tEPij1G ^ n)));
        final File file = new File(this.getDataFolder(), s);
        final int n3 = 0x7BF7A5E4 ^ n2;
        if ((file.exists() ? 1 : 0) == (0x23F55405 ^ n3)) {
            this.saveResource(s, (boolean)((byte)(0x12441892 ^ (0x31B14C97 ^ n3)) != 0));
        }
        else if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(0xD0E99B2 ^ n3) != 185069673) {
            throw new RuntimeException();
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public void onDisable() {
        final int n = 0x19746297 ^ (0x3595FBC5 ^ (0x552BA916 ^ this.Jm9tEPij1G));
        this.sqLiteManager.close$1371832018(414809750);
    }
    
    public void reloadCrates$1915480240(final int n) {
        final int n2 = 0xCED9979 ^ (0x3CBAEE8F ^ (0xF4BBFCA ^ (this.Jm9tEPij1G ^ n)));
        Bukkit.getScheduler().runTaskLater((Plugin)this, (Runnable)new Runnable(948210153) {
            private static int 7amdGpmnLt = 0;
            private transient int ZZqJY64ltt = 1185294448;
            private static byte[] ffxualfogu;
            private static String[] nothing_to_see_here;
            
            {
                final int n2 = 0x64B98437 ^ (0x1F80132D ^ (Integer.parseInt("774572398") ^ n));
            }
            
            public void run() {
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), kmfrzfchgf(misyqfjeelrqaed(), 0x45225EB4 ^ (0x6B4E3396 ^ (0x5D589557 ^ this.ZZqJY64ltt))));
            }
            
            static {
                (DonutCore$1.nothing_to_see_here = new String[13])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
                DonutCore$1.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u28e0\u28f6\u287e\u280f\u2809\u2819\u2833\u28a6\u2840\u2800\u2800\u2800\u28a0\u281e\u2809\u2819\u2832\u2840\u2800    ";
                DonutCore$1.nothing_to_see_here[2] = "\u2800\u2800\u2800\u28f4\u283f\u280f\u2800\u2800\u2800\u2800\u2800\u2800\u28b3\u2840\u2800\u284f\u2800\u2800\u2800\u2800\u2800\u28b7     ";
                DonutCore$1.nothing_to_see_here[3] = "\u2800\u2800\u28a0\u28df\u28cb\u2840\u2880\u28c0\u28c0\u2840\u2800\u28c0\u2840\u28e7\u2800\u28b8\u2800\u2800\u2800\u2800\u2800 \u2847    ";
                DonutCore$1.nothing_to_see_here[4] = "\u2800\u2800\u28b8\u28ef\u286d\u2801\u2838\u28db\u28df\u2806\u2874\u28fb\u2872\u28ff\u2800\u28f8\u2800\u2800OK\u2800 \u2847    ";
                DonutCore$1.nothing_to_see_here[5] = "\u2800\u2800\u28df\u28ff\u286d\u2800\u2800\u2800\u2800\u2800\u28b1\u2800\u2800\u28ff\u2800\u28b9\u2800\u2800\u2800\u2800\u2800 \u2847    ";
                DonutCore$1.nothing_to_see_here[6] = "\u2800\u2800\u2819\u28bf\u28ef\u2804\u2800\u2800\u2800\u2880\u2840\u2800\u2800\u287f\u2800\u2800\u2847\u2800\u2800\u2800\u2800\u287c     ";
                DonutCore$1.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2839\u28f6\u2806\u2800\u2800\u2800\u2800\u2800\u2874\u2803\u2800\u2800\u2818\u2824\u28c4\u28e0\u281e\u2800     ";
                DonutCore$1.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u28b8\u28f7\u2866\u28a4\u2864\u28a4\u28de\u28c1\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800    ";
                DonutCore$1.nothing_to_see_here[9] = "\u2800\u2800\u2880\u28e4\u28f4\u28ff\u28cf\u2801\u2800\u2800\u2838\u28cf\u28af\u28f7\u28d6\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800    ";
                DonutCore$1.nothing_to_see_here[10] = "\u2880\u28fe\u28fd\u28ff\u28ff\u28ff\u28ff\u281b\u28b2\u28f6\u28fe\u2889\u2877\u28ff\u28ff\u2835\u28ff\u2800\u2800\u2800\u2800\u2800\u2800    ";
                DonutCore$1.nothing_to_see_here[11] = "\u28fc\u28ff\u280d\u2809\u28ff\u286d\u2809\u2819\u28ba\u28c7\u28fc\u284f\u2800\u2800\u2800\u28c4\u28b8\u2800\u2800\u2800\u2800\u2800\u2800    ";
                DonutCore$1.nothing_to_see_here[12] = "\u28ff\u28ff\u28e7\u28c0\u28ff.........\u28c0\u28f0\u28cf\u28d8\u28c6\u28c0\u2800\u2800       ";
                DonutCore$1.ffxualfogu = gbllkvpgwtqpuea();
                DonutCore$1.7amdGpmnLt = (0xFFC98E1E ^ new Random(-719429592852278830L).nextInt());
            }
            
            public static String kmfrzfchgf(final byte[] array, final int n) {
                final byte[] bytes = Integer.toString(n).getBytes();
                for (int i = 0; i < array.length; ++i) {
                    final int n2 = i;
                    array[n2] ^= bytes[i % bytes.length];
                    final int n3 = i;
                    array[n3] ^= DonutCore$1.ffxualfogu[i % DonutCore$1.ffxualfogu.length];
                }
                return new String(array, StandardCharsets.UTF_16);
            }
            
            private static byte[] gbllkvpgwtqpuea() {
                return new byte[] { 8, 20, 1, 97, 33, 11, 20, 120, 101, 28, 12, 23, 106, 34, 94, 98, 104, 81, 105, 88, 94, 39, 38, 103, 107, 92, 32, 25, 35, 39, 31, 101, 24, 108, 61, 86, 28, 117, 41, 62, 57, 49, 39, 27, 18, 124, 11, 50, 27, 29, 124, 65, 90, 12, 43, 61, 27, 42, 95, 107, 123, 124, 43, 28, 47, 50, 68, 79, 41, 66, 113, 101, 94, 26, 123, 18, 54, 99, 50, 84, 124, 104, 13, 56, 56, 123, 26, 85, 60, 47 };
            }
            
            private static byte[] misyqfjeelrqaed() {
                return new byte[] { -62, -38, 56, 51, 22, 72, 33, 47, 81, 92, 61, 75, 91, 102, 111, 119, 94, 23, 93, 12, 103, 122, 17, 57, 94, 11, 20, 73 };
            }
        }, 1200L);
    }
    
    public void clean$2056612436(final Player player, final int n) {
        final int n2 = 0x4EF1D09E ^ (0x7C161E13 ^ (0x4A9DF4D2 ^ (this.Jm9tEPij1G ^ n)));
        this.rulesGui.remove$1734529989(player, 378968196);
        this.mediaGui.remove$1734529989(player, 378968196);
        this.helpGui.remove$1734529989(player, 378968196);
        this.spawnGui.remove$1734529989(player, 378968196);
        this.afkGui.remove$1734529989(player, 378968196);
        this.billfordGui.remove$1734529989(player, 378968196);
        this.billfordEditorGui.remove$1734529989(player, 378968196);
        this.billfordEditorItemsGUI.remove$1734529989(player, 378968196);
    }
    
    private boolean setupEconomy$1059304311(final int n) {
        final int n2 = 0x7F34FDFA ^ (0x58D5E965 ^ (0x18B9FF35 ^ (this.Jm9tEPij1G ^ n)));
        if (this.getServer().getPluginManager().getPlugin(xlnoigleho(mqiwsbpuxokvcxm(), rmdqikusoembxnk(), n2)) == null) {
            return (byte)(0x52F8E1C1 ^ (0x406EE9F7 ^ n2)) != 0;
        }
        final int saxuwxcnfwcxyrlg = saxuwxcnfwcxyrlg(n2, 318339886);
        Label_0676: {
            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg) != 6847369) {
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg)) {
                        case 372899165: {
                            continue;
                        }
                        case 6847369: {}
                        default: {
                            break Label_0676;
                        }
                    }
                }
            }
            else {
                final int saxuwxcnfwcxyrlg2 = saxuwxcnfwcxyrlg(saxuwxcnfwcxyrlg, 648884703);
                final RegisteredServiceProvider registration = this.getServer().getServicesManager().getRegistration((Class)Economy.class);
                final int n3 = 0x49BD190D ^ saxuwxcnfwcxyrlg2;
                if (registration == null) {
                    return (byte)(0x23A28403 ^ (0x4CDDDFC9 ^ n3)) != 0;
                }
                int saxuwxcnfwcxyrlg3 = saxuwxcnfwcxyrlg(n3, 2037230122);
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg3) == 180658864) {
                    Label_0276: {
                    Label_0268:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg3)) {
                                case 944222026: {
                                    continue;
                                }
                                case 180658864: {
                                    break Label_0268;
                                }
                                case 1260788005: {
                                    break Label_0276;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                        }
                        saxuwxcnfwcxyrlg3 ^= 0x66A943F7;
                    }
                    this.economy = (Economy)registration.getProvider();
                    final int n4 = 0x71B5AC6C ^ saxuwxcnfwcxyrlg3;
                    byte b = 0;
                    Label_0604: {
                        int n8;
                        if (this.economy != null) {
                            final int n5 = 0x24336A80 ^ n4;
                            b = (byte)(0x253D74FA ^ n5);
                            final int n6 = 0x75AB3A79 ^ n5;
                            try {
                                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n6) != 203647117) {
                                    throw null;
                                }
                                throw new RuntimeException();
                            }
                            catch (final RuntimeException ex) {
                                int saxuwxcnfwcxyrlg4 = 0;
                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n6)) {
                                    case -2068679662: {
                                        saxuwxcnfwcxyrlg4 = saxuwxcnfwcxyrlg(n6, 319813636);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                    case 1377415008: {
                                        saxuwxcnfwcxyrlg4 = (0x49DA836A ^ n6);
                                        break;
                                    }
                                }
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(saxuwxcnfwcxyrlg4)) {
                                        case 622860741: {
                                            continue;
                                        }
                                        case 49910330: {}
                                        case 1240474339: {
                                            break Label_0604;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                return b != 0;
                            }
                        }
                        else {
                            final int n7 = 0x6F08D6B1 ^ n4;
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7) != 86854401) {
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n7)) {
                                        case 1330637655: {
                                            continue;
                                        }
                                        case 86854401: {}
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                            }
                            else {
                                n8 = (0x5214454A ^ n7);
                            }
                        }
                        b = (byte)(0x3C128D80 ^ n8);
                    }
                    return b != 0;
                }
                saxuwxcnfwcxyrlg(saxuwxcnfwcxyrlg3, 283321477);
            }
        }
        throw new RuntimeException();
    }
    
    public void loadHelpFeature$2074084618(final int n) {
        this.getCommand(xlnoigleho(xywwagqubibiryq(), rmdqikusoembxnk(), 0x27F28D69 ^ (0x6A9746E0 ^ (0x2D2727A9 ^ (this.Jm9tEPij1G ^ n))))).setExecutor((CommandExecutor)new HelpCommand(this, 298935));
        this.helpGui.loadHelpConfigValues$1430792781(839749214);
    }
    
    public void loadSpawnFeature$2109479120(final int n) {
        final int n2 = 0x222FFCDA ^ (0x47DF441B ^ (0x110E14C2 ^ (this.Jm9tEPij1G ^ n)));
        this.teleportManager = new TeleportManager(this, 2134981223);
        final int n3 = 0x15282A38 ^ n2;
        this.spawnGui = new SpawnGUI(this, this.sqLiteManager, this.teleportManager, 588188175);
        final int n4 = 0x195C1C9D ^ n3;
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(cxbbnqpocbtkclr(), rmdqikusoembxnk(), n4), (Command)new SpawnCommand(this, this.sqLiteManager, this.teleportManager, 1548423865));
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(pdfenrhysygjrxt(), rmdqikusoembxnk(), 0x2305990F ^ n4), (Command)new SetSpawnCommand(this, this.sqLiteManager, this.spawnGui, 1796320408));
        this.spawnGui.loadSpawnConfigValues$882403349(870176311);
    }
    
    public void loadAfkFeature$22344590(final int n) {
        final int n2 = 0x10E51306 ^ (0x510F1178 ^ (0x42145B66 ^ (this.Jm9tEPij1G ^ n)));
        this.teleportManager = new TeleportManager(this, 2134981223);
        final int n3 = 0x57130263 ^ n2;
        this.afkGui = new AfkGUI(this, this.sqLiteManager, this.teleportManager, 469798925);
        final int n4 = 0x8CDDAFC ^ n3;
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(hyhkqmcwtkykysi(), rmdqikusoembxnk(), n4), (Command)new AfkCommand(this, this.sqLiteManager, this.teleportManager, 436311718));
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(vbqdjcosqbmryeb(), rmdqikusoembxnk(), 0x18AE40DB ^ n4), (Command)new SetAfkCommand(this, this.sqLiteManager, this.afkGui, 318328212));
        this.afkGui.loadAfkConfigValues$568738828(1586297296);
    }
    
    public void loadMediaFeature$658125645(final int n) {
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(nnfkdhdqsvxfnxn(), rmdqikusoembxnk(), 0x2379D563 ^ (0x96985A ^ (0x9EB293C ^ (this.Jm9tEPij1G ^ n)))), (Command)new MediaCommand(this, 1389544220));
        this.mediaGui.loadMediaConfigValues$2120577358(54860659);
    }
    
    public void loadRulesFeature$424103264(final int n) {
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(rpioetbcobamcjc(), rmdqikusoembxnk(), 0x5A79D157 ^ (0x38BF2A73 ^ (0x570067BF ^ (this.Jm9tEPij1G ^ n)))), (Command)new RulesCommand(this, 126255370));
        this.rulesGui.loadRulesConfigValues$113812495(476948616);
    }
    
    public void loadBillfordFeature$2003866414(final int n) {
        final int n2 = 0x195C7B01 ^ (0x750D45B7 ^ (0x7393B12 ^ (this.Jm9tEPij1G ^ n)));
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(xhjccugimyrvryi(), rmdqikusoembxnk(), n2), (Command)new BillfordCommand(this, 715151273));
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(xnpajxdtmlldzsc(), rmdqikusoembxnk(), 0x16E4D129 ^ n2), (Command)new BillfordEditorCommand(this, 2103557448));
    }
    
    public void loadChatFeature$468648758(final int n) {
        final int n2 = 0x71D4B993 ^ (0x5BD01DC5 ^ (0x525DB4F9 ^ (this.Jm9tEPij1G ^ n)));
        this.getCommand(xlnoigleho(mrbogjsmmxaeznj(), rmdqikusoembxnk(), n2)).setExecutor((CommandExecutor)new MessageCommand(this, this.sqLiteManager, 408042060));
        final int n3 = 0x3906A78B ^ n2;
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(uqozmorwhwouaqp(), rmdqikusoembxnk(), n3), (Command)new MessageToggleCommand(this, this.sqLiteManager, 321018589));
        this.getCommand(xlnoigleho(alytknsvgsnvspm(), rmdqikusoembxnk(), 0x2083C7AE ^ n3)).setExecutor((CommandExecutor)new ReplyCommand(this, this.sqLiteManager, 252378063));
    }
    
    public void loadNightVisionFeature$1305102662(final int n) {
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(wzakuohmknxkmph(), rmdqikusoembxnk(), 0x38778F88 ^ (0x56199EE3 ^ (0x4EEDEED1 ^ (this.Jm9tEPij1G ^ n)))), (Command)new NightVisionCommand(this, 590688448));
    }
    
    public void loadEconomyFeature$749298711(final int n) {
        final int n2 = 0x250D2A51 ^ (0x37516825 ^ (0x69C6A812 ^ (this.Jm9tEPij1G ^ n)));
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(ccrzaquyypygqyb(), rmdqikusoembxnk(), n2), (Command)new PayCommand(this.economy, this.sqLiteManager, 1403933327));
        final int n3 = 0xF130236 ^ n2;
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(klpgukhwfqklvci(), rmdqikusoembxnk(), n3), (Command)new PayToggleCommand(this.sqLiteManager, 911373974));
        this.getCommandMap$1431339485(436386096).register(xlnoigleho(cmmpfiecxvtgrfe(), rmdqikusoembxnk(), 0x487ADB4E ^ n3), (Command)new BalanceCommand(this.economy, 905964380));
    }
    
    private CommandMap getCommandMap$1431339485(final int n) {
        final int n2 = 0xFDF0C05 ^ (0x611A4EF ^ (0x6732840A ^ (this.Jm9tEPij1G ^ n)));
        CommandMap commandMap = null;
        int n3 = 0x359107A6 ^ n2;
        try {
            if (this.getServer() != null) {
                n3 ^= 0x3A541785;
                final Field declaredField = this.getServer().getClass().getDeclaredField(xlnoigleho(tqeuyusgpwtjnwq(), rmdqikusoembxnk(), n3));
                n3 ^= 0x14C1061A;
                declaredField.setAccessible((boolean)((byte)(0x5394120E ^ n3) != 0));
                n3 ^= 0x1EBB9129;
                final CommandMap commandMap2 = (CommandMap)declaredField.get((Object)this.getServer());
                n3 ^= 0x3066DD41;
                commandMap = commandMap2;
                n3 ^= 0x7E64ED5D;
            }
            else {
                n3 ^= 0x19884782;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 46765931) {
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 220262715: {
                                continue;
                            }
                            case 46765931: {
                                n3 ^= 0xBE50B65;
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                    }
                }
                else {
                    n3 = saxuwxcnfwcxyrlg(n3, 1738864424);
                }
            }
            Label_0340: {
            Label_0332:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                        case 314114480: {
                            continue;
                        }
                        case 49994539: {
                            break Label_0332;
                        }
                        case 294466972: {
                            break Label_0340;
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                }
                n3 ^= 0x6C6C5D8B;
                try {
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 126865719) {
                        throw null;
                    }
                    throw new IllegalAccessException();
                }
                catch (final IllegalAccessException ex) {
                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                        case 2047833483: {
                            n3 = saxuwxcnfwcxyrlg(n3, 342687888);
                            break;
                        }
                        case -1947618613: {
                            n3 ^= 0xA51D878;
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                    }
                Label_0460:
                    while (true) {
                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                            case 2024683180: {
                                continue;
                            }
                            case 245855859: {
                                break Label_0460;
                            }
                            default: {
                                throw new IOException();
                            }
                            case 1792591277: {
                                return commandMap;
                            }
                        }
                    }
                    n3 ^= 0x69D59617;
                    return commandMap;
                }
            }
            throw new IOException();
        }
        catch (final ReflectiveOperationException ex2) {
            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                case -364186821: {
                    break;
                }
                case 1769740594: {
                    break;
                }
                case -1667198854: {
                    saxuwxcnfwcxyrlg(n3, 1058729286);
                    break;
                }
                case -402121597: {
                    break;
                }
                case 984129706: {
                    break;
                }
                default: {
                    throw new IllegalAccessException("Error in hash");
                }
            }
            ex2.printStackTrace();
        }
        return commandMap;
    }
    
    public FileConfiguration getHelpGuiConfig$689393799(final int n) {
        final int n2 = 0x6E38E16A ^ (0x2780CAB9 ^ (0x4FE1DBAF ^ (this.Jm9tEPij1G ^ n)));
        return this.helpGuiConfig;
    }
    
    public FileConfiguration getMediaGuiConfig$1766465157(final int n) {
        final int n2 = 0x357488F6 ^ (0x3059BDA7 ^ (0x4440073D ^ (this.Jm9tEPij1G ^ n)));
        return this.mediaGuiConfig;
    }
    
    public FileConfiguration getRulesGuiConfig$546180320(final int n) {
        final int n2 = 0x53709A79 ^ (0x61234858 ^ (0x3615A83F ^ (this.Jm9tEPij1G ^ n)));
        return this.rulesGuiConfig;
    }
    
    public FileConfiguration getafkSpawnGuiConfig$23715181(final int n) {
        final int n2 = 0x2D9FF02F ^ (0x283D8493 ^ (0x1C0C1A4C ^ (this.Jm9tEPij1G ^ n)));
        return this.afkSpawnGuiConfig;
    }
    
    public FileConfiguration getBillfordGuiConfig$756205206(final int n) {
        final int n2 = 0x61AD05C7 ^ (0x11581DD ^ (0x4FC81408 ^ (this.Jm9tEPij1G ^ n)));
        return this.billfordGuiConfig;
    }
    
    public HelpGUI getHelpGui$1055651724(final int n) {
        final int n2 = 0x773F515E ^ (0x757DD6E9 ^ (0x19B2A7E7 ^ (this.Jm9tEPij1G ^ n)));
        return this.helpGui;
    }
    
    public MediaGUI getMediaGui$275199606(final int n) {
        final int n2 = 0x30F7BE17 ^ (0x2944EC79 ^ (0x202EB50C ^ (this.Jm9tEPij1G ^ n)));
        return this.mediaGui;
    }
    
    public RulesGUI getRulesGui$369068666(final int n) {
        final int n2 = 0x716432D3 ^ (0x7EEF5D33 ^ (0x48A9E2EA ^ (this.Jm9tEPij1G ^ n)));
        return this.rulesGui;
    }
    
    public SpawnGUI getSpawnGui$166485211(final int n) {
        final int n2 = 0x60B945E4 ^ (0x16BE3A4F ^ (0x3DC036E5 ^ (this.Jm9tEPij1G ^ n)));
        return this.spawnGui;
    }
    
    public AfkGUI getAfkGui$1831569283(final int n) {
        final int n2 = 0x2713CD70 ^ (0x2DA49466 ^ (0x6C907FBA ^ (this.Jm9tEPij1G ^ n)));
        return this.afkGui;
    }
    
    public Map<Player, Player> getLastMessaged$1938418975(final int n) {
        final int n2 = 0x2179F554 ^ (0x971E4DB ^ (0x2609CED ^ (this.Jm9tEPij1G ^ n)));
        return this.lastMessaged;
    }
    
    public BillfordGUI getBillfordGui$981559054(final int n) {
        final int n2 = 0x5678C8FE ^ (0x3F066D0B ^ (0xD58D82F ^ (this.Jm9tEPij1G ^ n)));
        return this.billfordGui;
    }
    
    public BillfordEditorGUI getBillfordEditorGui$1275699852(final int n) {
        final int n2 = 0x14F0A53D ^ (0x3ADE7447 ^ (0x7CB967FD ^ (this.Jm9tEPij1G ^ n)));
        return this.billfordEditorGui;
    }
    
    public BillfordEditorItemsGUI getBillfordEditorItemsGui$131132968(final int n) {
        final int n2 = 0x59F0734E ^ (0x5F7350FD ^ (0x181DF569 ^ (this.Jm9tEPij1G ^ n)));
        return this.billfordEditorItemsGUI;
    }
    
    public void saveBillfordGuiConfig$978105170(final int n) {
        int n2 = 0x1A198C13 ^ (0x76DDE0B6 ^ (0x32900B9B ^ (this.Jm9tEPij1G ^ n)));
        try {
            this.getBillfordGuiConfig$756205206(1840850862).save(new File(this.getDataFolder(), xlnoigleho(jcsxskzsyehaagj(), rmdqikusoembxnk(), n2)));
            n2 ^= 0x215331FB;
            n2 ^= 0x7E3DBFE;
            try {
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2) != 154279846) {
                    throw null;
                }
                throw new RuntimeException();
            }
            catch (final RuntimeException ex) {
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n2)) {
                    case 236969354: {
                        n2 ^= 0x743AB317;
                        break;
                    }
                    default: {
                        throw new IOException("Error in hash");
                    }
                    case -1441205456: {
                        n2 ^= 0x20BA56C0;
                        break;
                    }
                }
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n2)) {
                        case 2082740247: {
                            continue;
                        }
                        default: {
                            throw new IOException();
                        }
                        case 1827959520: {
                            return;
                        }
                        case 143837496: {
                            n2 ^= 0x2CD0991B;
                        }
                    }
                }
            }
        }
        catch (final IOException ex2) {
            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n2)) {
                default: {
                    throw new RuntimeException("Error in hash");
                }
                case -1616927975: {
                    ex2.printStackTrace();
                    break;
                }
            }
        }
    }
    
    static {
        (DonutCore.nothing_to_see_here = new String[15])[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        DonutCore.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        DonutCore.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        DonutCore.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        DonutCore.soWjD6JRrA = (0x59E4C59 ^ new Random(-1529101671205845689L).nextInt());
    }
    
    public static String xlnoigleho(final byte[] array, final byte[] array2, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        for (int i = 0; i < array.length; ++i) {
            final int n2 = i;
            array[n2] ^= bytes[i % bytes.length];
            final int n3 = i;
            array[n3] ^= array2[i % array2.length];
        }
        return new String(array, StandardCharsets.UTF_16);
    }
    
    private static byte[] rmdqikusoembxnk() {
        return new byte[] { 90, 18, 116, 71, 29, 63, 33, 115, 65, 11, 18, 63, 76, 91, 70, 4, 28, 45, 96, 13, 4, 74, 24, 37, 10, 78, 92, 94, 83, 14, 109, 116, 120, 31, 81, 17, 37, 19, 93, 39, 91, 2, 76, 118, 73, 27, 107, 92, 17, 108, 99, 94, 80, 62, 55, 71, 71, 48, 53, 60, 58, 90 };
    }
    
    private static byte[] ptynqgrcmflzlfj() {
        return new byte[] { -100, -39, 69, 22, 43, 103, 16, 46, 121, 70, 38, 122, 121, 14, 113, 90, 47, 103, 88, 92 };
    }
    
    private static byte[] fxxydzmlcihogxl() {
        return new byte[] { -107, -43, 76, 25, 37, 126, 22, 40, 115, 65, 35, 40, 116, 17, 126, 64, 43, 126, 82, 67, 53, 28, 32, 67, 50, 27, 107, 10, 97, 92, 92, 98, 64, 95, 105, 72, 18, 77 };
    }
    
    private static byte[] rtslyychbnctbnm() {
        return new byte[] { -107, -33, 76, -47, 41, 63, 25, 102, 114, 23, 35, 32, 116, 71, 114, 29, 36, 56, 83, 17, 53, 85, 32, 57, 62, 87, 100, 75, 96, 18, 92, 107, 64, 3, 101, 8, 29, 6, 110, 59, 106, 29 };
    }
    
    private static byte[] jlthopxsenqvxco() {
        return new byte[] { -107, -33, 65, 16, 45, 124, 17, 40, 118, 75, 35, 34, 121, 3, 118, 87, 44, 115, 87, 78, 53, 86, 45, 108, 58, 21, 108, 0 };
    }
    
    private static byte[] itamgifmfgyhppz() {
        return new byte[] { -110, -37, 64, 52, 42, 98, 24, 47, 117, 72, 36, 127, 123, 47, 116, 82, 46, 107, 86, 94 };
    }
    
    private static byte[] pntsouvishvwqwq() {
        return new byte[] { -107, -33, 68, 24, 36, 125, 20, 52, 116, 73, 35, 126, 124, 86, 127, 29, 41, 49, 85, 83, 53, 17, 40, 113, 51, 29, 105, 3, 102, 79, 92, 35, 72, 6, 104, 87, 16, 73, 104, 126, 106, 74, 124, 50, 112, 89, 94, 26, 36, 58, 82, 5, 96, 102, 14, 95, 114, 123, 0, 119, 11, 18 };
    }
    
    private static byte[] ruujzauydhvwsfc() {
        return new byte[] { -107, -33, 76, -42, 45, 57, 22, 26, 114, 115, 35, 72, 116, 44, 118, 101, 43, 81, 83, 25, 53, 59, 32, 92, 58, 50, 107, 51, 96, 123, 92, 5, 64, 125, 97, 3, 18, 126, 110, 91, 106, 117, 116, 96, 121, 104, 92, 48, 34, 12, 82, 36, 104, 71, 7, 39, 112, 41, 6, 71, 11, 38, 98, 4, 68, 49, 42, 79, 18, 20, 112, 122, 42, 70, 124, 59, 113, 121, 47, 55, 81, 111, 60, 53, 40, 92, 61, 45, 111, 57, 98, 104, 85, 23, 72, 105, 102, 97, 22, 104, 108, 59, 99, 108, 124, 29, 126, 120 };
    }
    
    private static byte[] mxkzvrcnrhvjlny() {
        return new byte[] { -110, -34, 70, -43, 41, 51, 17, 13, 116, 114, 33, 89, 121, 42, 126, 14, 44, 56, 86, 106, 54, 55, 44, 88, 58, 94, 105, 56, 96, 112, 88, 21, 64, 104, 97, 109, 19, 110, 111, 50, 111, 114, 124, 7, 124, 126, 88, 78, 36, 26, 91, 43, 96, 78, 1, 58, 117, 37, 1, 65, 10, 36, 111, 101, 71, 55, 40, 71, 25, 6, 113, 122, 36, 34 };
    }
    
    private static byte[] qrgtupbwgnkpkke() {
        return new byte[] { -112, -39, 65, -41, 41, 59, 24, 110, 117, 18, 38, 39, 123, 66, 118, 16, 44, 52, 84, 20, 49, 80, 44, 56, 51, 83, 104, 71, 103, 22, 90, 109, 72, 11, 97, 8, 17, 10, 104, 61, 111, 31 };
    }
    
    private static byte[] tsddnpzsafepijz() {
        return new byte[] { -107, -37, 69, -40, 43, 62, 19, 109, 114, 21, 35, 36, 125, 78, 112, 28, 46, 51, 83, 19, 53, 81, 41, 48, 60, 86, 110, 64, 96, 16, 92, 111, 73, 10, 103, 9, 23, 13, 110, 57, 106, 25 };
    }
    
    private static byte[] jokmlzzqzjzllcr() {
        return new byte[] { -106, -35, 69, -48, 45, 63, 21, 20, 119, 113, 32, 74, 125, 42, 118, 99, 40, 95, 86, 27, 54, 57, 41, 90, 58, 52, 104, 61, 101, 121, 95, 7, 73, 123, 97, 5, 17, 112, 107, 89, 105, 119, 125, 102, 121, 110, 95, 62, 39, 14, 81, 38, 97, 65, 7, 33, 115, 39, 3, 69, 8, 36, 107, 2, 68, 55, 41, 65, 23, 22, 115, 120, 35, 64, 124, 61, 114, 119, 42, 53, 82, 109, 53, 51, 40, 90, 62, 35, 106, 59, 97, 106, 92, 17, 72, 111, 101, 111, 19, 106, 111, 57, 106, 106, 124, 27, 125, 118 };
    }
    
    private static byte[] sjkermdkehqbkhm() {
        return new byte[] { -110, -43, 71, 18, 45, 120, 21, 41, 116, 78, 42, 35, 126, 9, 116, 89, 47, 116, 86, 89, 55, 30, 40, 120, 62, 15, 105, 12, 107, 19, 95, 61, 74, 70, 98, 72 };
    }
    
    private static byte[] cynbffydouynyqu() {
        return new byte[] { -105, -44, 66, 24, 36, 123, 19, 42, 117, 75, 43, 38, 116, 16, 119, 67, 44, 117, 83, 81, 50, 1, 33, 58, 56, 7, 104, 0, 106, 84 };
    }
    
    private static byte[] krgphgxhqctvpda() {
        return new byte[] { -107, -37, 77, -43, 37, 59, 20, 108, 114, 23, 36, 43, 121, 78, 118, 28, 46, 51, 81, 22, 61, 82, 32, 56, 63, 81, 111, 66, 101, 26, 88, 97, 72, 7, 99, 15, 20, 8, 100, 63, 99, 31 };
    }
    
    private static byte[] hrzglhrrfehcrkb() {
        return new byte[] { -105, -34, 77, 36, 42, 122, 23, 37, 120, 74, 33, 43, 122, 45, 112, 85, 47, 113, 83, 80, 61, 8 };
    }
    
    private static byte[] lyprqlhkygpzanm() {
        return new byte[] { -105, -34, 77, 61, 42, 96, 23, 35, 120, 93, 33, 104, 122, 31, 112, 91, 47, 122, 83, 89, 61, 92, 47, 64, 60, 4, 101, 30, 96, 67, 91, 38, 78, 68 };
    }
    
    private static byte[] eimyrkrrrragtwx() {
        return new byte[] { -112, -44, 64, -45, 44, 59 };
    }
    
    private static byte[] tagjfuauhtrlydt() {
        return new byte[] { -107, -40, 76, 24, 45, 121, 18, 44, 120, 65, 35, 37, 116, 14, 118, 82, 47, 127, 89, 93, 53, 30, 32, 51, 58, 4, 111, 5, 106, 91 };
    }
    
    private static byte[] hrfytwxtqwcaacg() {
        return new byte[] { -106, -35, 64, 19, 44, 96, 16, 47, 118, 72, 32, 123, 120, 8, 119, 91, 45, 109, 87, 94 };
    }
    
    private static byte[] ijdrxefcmixajig() {
        return new byte[] { -106, -38, 76, 37, 47, 102, 16, 49, 112, 85, 37, 115, 120, 73, 126, 81, 43, 121, 82, 74, 60, 27, 42, 115, 59, 29, 109, 9, 100, 88, 89, 37, 64, 87, 102, 0, 23, 74, 101, 124, 105, 78, 125, 97, 120, 79, 92, 11, 37, 43, 91, 1, 103, 107, 5, 81, 127, 36, 7, 65, 11, 14, 107, 79, 67, 17, 41, 98, 25, 47, 118, 67, 32, 40, 116, 24, 116, 85, 45, 118, 81, 83, 51, 82, 44, 121, 50, 16, 107, 27, 97, 25, 85, 55, 74, 72, 96, 84, 20, 74, 106, 49 };
    }
    
    private static byte[] omdmqfgkespzmdx() {
        return new byte[] { -111, -34, 69, -40, 47, 60, 17, 106, 120, 19, 33, 35, 116, 68, 113, 25, 40, 57, 85, 19, 53, 95, 42, 63, 58, 87, 101, 70, 96, 18, 85, 107, 79, 2, 101, 5, 16, 13, 108, 50, 105, 24 };
    }
    
    private static byte[] lspttvzdvtcaehd() {
        return new byte[] { -99, -33, 66, 20, 44, 100, 20, 42, 118, 71, 32, 125, 123, 9, 114, 94, 43, 104, 89, 90 };
    }
    
    private static byte[] qlqophqofftkjdl() {
        return new byte[] { -106, -35, 66, -42, 46, 59, 25, 109, 116, 22, 32, 34, 122, 64, 117, 25, 36, 51, 85, 16, 54, 87, 46, 62, 57, 83, 100, 64, 102, 19, 95, 105, 78, 4, 98, 12, 29, 13, 104, 58, 105, 31 };
    }
    
    private static byte[] hddovgakuafzhrw() {
        return new byte[] { -107, -34, 67, -47, 37, 104, 20, 104, 118, 18, 35, 33, 123, 71, 126, 31, 41, 54, 87, 20, 53, 84, 47, 57, 50, 85, 105, 69, 100, 23, 92, 106, 79, 3, 105, 10, 16, 8, 106, 62, 106, 28, 123, 106 };
    }
    
    private static byte[] omxaixkwcmdstxp() {
        return new byte[] { -107, -33, 67, -39, 41, 58, 19, 106, 113, 22, 35, 32, 123, 79, 114, 24, 46, 52, 80, 16, 53, 85, 47, 49, 62, 82, 110, 71, 99, 19, 92, 107, 79, 11, 101, 13, 23, 10, 109, 58, 106, 29 };
    }
    
    private static byte[] ermttddynwqzdjy() {
        return new byte[] { -107, -44, 64, 39, 47, 97, 19, 38, 113, 81, 35, 99, 120, 3, 116, 89, 46, 117, 80, 80, 53, 22, 44, 103, 56, 61, 110, 58, 99, 126 };
    }
    
    private static byte[] cniexdbfyewsxht() {
        return new byte[] { -107, -36, 64, 41, 42, 104, 23, 57, 114, 83, 35, 106, 120, 37, 113, 73, 42, 116, 83, 75, 53, 31, 44, 60, 61, 31, 106, 21, 96, 26, 92, 43, 76, 73, 102, 93, 19, 11, 110, 127, 106, 92, 120, 46, 126, 71, 93, 1, 34, 60, 82, 65, 100, 39, 0, 59, 113, 97, 6, 123, 11, 10, 110, 73, 67, 19, 43, 110, 18, 41, 112, 93, 38, 38, 123, 19, 112, 80, 47, 108, 81, 91, 48, 26, 47, 115, 60, 88 };
    }
    
    private static byte[] spbbwyulftrxgui() {
        return new byte[] { -107, -36, 64, -44, 40, 104, 19, 102, 116, 23, 35, 35, 120, 66, 115, 31, 46, 56, 85, 17, 53, 86, 44, 60, 63, 85, 110, 75, 102, 18, 92, 104, 76, 6, 100, 10, 23, 6, 104, 59, 106, 30, 120, 111 };
    }
    
    private static byte[] nbgwhdjwtslkblx() {
        return new byte[] { -99, -37, 67, -40, 47, 61, 18, 104, 113, 31, 36, 37, 116, 68, 112, 26, 42, 48, 89, 22, 51, 95, 42, 62, 57, 85, 108, 74, 101, 20, 85, 107, 78, 1, 103, 12, 28, 8, 106, 50, 105, 25 };
    }
    
    private static byte[] oogneurwvtljopd() {
        return new byte[] { -100, -43, 67, 23, 43, 99, 24, 42, 120, 70, 42, 124, 120, 14, 117, 82, 43, 102, 88, 80 };
    }
    
    private static byte[] mqiwsbpuxokvcxm() {
        return new byte[] { -105, -36, 69, 41, 47, 108, 18, 63, 113, 84, 35, 122 };
    }
    
    private static byte[] xywwagqubibiryq() {
        return new byte[] { -107, -34, 67, 28, 42, 98, 24, 40, 119, 73 };
    }
    
    private static byte[] cxbbnqpocbtkclr() {
        return new byte[] { -107, -34, 65, 17, 42, 98, 19, 36, 119, 75, 35, 120, 121, 10, 113, 89, 46, 102, 86, 93 };
    }
    
    private static byte[] pdfenrhysygjrxt() {
        return new byte[] { -107, -44, 64, 19, 47, 98, 19, 42, 117, 72, 35, 114, 120, 8, 116, 89, 46, 104, 84, 94 };
    }
    
    private static byte[] hyhkqmcwtkykysi() {
        return new byte[] { -107, -33, 69, 21, 42, 103, 17, 44, 114, 70, 35, 121, 125, 14, 113, 92, 44, 110, 83, 80 };
    }
    
    private static byte[] vbqdjcosqbmryeb() {
        return new byte[] { -107, -34, 64, 23, 37, 97, 16, 44, 114, 73, 35, 120, 120, 12, 126, 90, 45, 110, 83, 95 };
    }
    
    private static byte[] nnfkdhdqsvxfnxn() {
        return new byte[] { -111, -38, 66, 27, 41, 104, 18, 41, 117, 75, 37, 125, 116, 12, 126, 88, 40, 107, 85, 95 };
    }
    
    private static byte[] rpioetbcobamcjc() {
        return new byte[] { -107, -37, 77, 27, 40, 97, 24, 43, 115, 73, 35, 125, 117, 0, 115, 90, 37, 105, 82, 95 };
    }
    
    private static byte[] xhjccugimyrvryi() {
        return new byte[] { -100, -39, 64, 19, 46, 103, 24, 37, 121, 70, 38, 127, 124, 11, 113, 82, 36, 103, 88, 92 };
    }
    
    private static byte[] xnpajxdtmlldzsc() {
        return new byte[] { -110, -36, 65, 18, 46, 98, 22, 41, 120, 72, 35, 126, 125, 11, 116, 92, 40, 102, 86, 89 };
    }
    
    private static byte[] mrbogjsmmxaeznj() {
        return new byte[] { -107, -38, 67, 29, 44, 116, 24, 44 };
    }
    
    private static byte[] uqozmorwhwouaqp() {
        return new byte[] { -107, -34, 65, 20, 43, 96, 18, 36, 114, 78, 35, 120, 121, 15, 112, 91, 47, 102, 83, 88 };
    }
    
    private static byte[] alytknsvgsnvspm() {
        return new byte[] { -107, -43, 76, 0 };
    }
    
    private static byte[] wzakuohmknxkmph() {
        return new byte[] { -111, -39, 64, 27, 42, 104, 16, 40, 112, 75, 38, 127, 116, 15, 126, 90, 41, 110, 85, 92 };
    }
    
    private static byte[] ccrzaquyypygqyb() {
        return new byte[] { -111, -40, 71, 18, 37, 100, 24, 47, 118, 75, 39, 120, 125, 0, 114, 82, 46, 104, 85, 93 };
    }
    
    private static byte[] cmmpfiecxvtgrfe() {
        return new byte[] { -107, -38, 71, 20, 40, 103, 17, 47, 118, 71, 35, 124, 127, 15, 115, 92, 44, 109, 87, 81 };
    }
    
    private static byte[] klpgukhwfqklvci() {
        return new byte[] { -100, -35, 71, 26, 36, 96, 23, 36, 118, 70, 34, 120, 117, 1, 118, 93, 37, 104, 88, 88 };
    }
    
    private static byte[] tqeuyusgpwtjnwq() {
        return new byte[] { -107, -36, 77, 18, 42, 101, 25, 46, 114, 81, 35, 111, 117, 3, 113, 85, 36, 80, 83, 91, 53, 11 };
    }
    
    private static byte[] jcsxskzsyehaagj() {
        return new byte[] { -100, -38, 69, 22, 47, 127, 25, 40, 118, 64, 37, 33, 122, 11, 115, 85, 46, 118, 88, 86, 53, 26, 42, 127, 50, 14, 107, 2, 100, 17, 91, 63, 77, 74, 99, 74 };
    }
    
    private static int saxuwxcnfwcxyrlg(final int n, final int n2) {
        return n ^ n2;
    }
}
