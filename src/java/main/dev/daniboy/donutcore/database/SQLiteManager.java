package dev.daniboy.donutcore.database;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.nio.ByteBuffer;
import org.bukkit.World;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.io.IOException;
import org.bukkit.Bukkit;
import fnhndduvxgwosuvi.nqlipuvkfzlomfdg;
import java.sql.SQLException;
import java.sql.Connection;
import com.zaxxer.hikari.HikariConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import com.zaxxer.hikari.HikariDataSource;
import java.util.UUID;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Location;
import java.util.Map;
import dev.daniboy.donutcore.DonutCore;

public class SQLiteManager
{
    private final String databaseUrl;
    private final DonutCore plugin;
    private final Map<Integer, Location> spawnLocationsCache;
    private final Map<Integer, ItemStack> billfordItemsCache;
    private final Map<UUID, Boolean> payToggleCache;
    private final Map<Integer, Location> afkLocationsCache;
    private final Map<UUID, Boolean> messageToggleCache;
    private final Map<String, Location> locationCache;
    protected HikariDataSource dataSource;
    private static int 90pcN6g6mx = 0;
    private transient int c3MhCWJeLB = 1937030613;
    private static String uthonptfwb;
    private static String[] nothing_to_see_here;
    
    public SQLiteManager(final DonutCore plugin, final int n) {
        final int n2 = 0x46E05509 ^ (0x1450193D ^ (Integer.parseInt("1305751350") ^ n));
        this.spawnLocationsCache = (Map<Integer, Location>)new HashMap();
        this.billfordItemsCache = (Map<Integer, ItemStack>)new ConcurrentHashMap();
        this.payToggleCache = (Map<UUID, Boolean>)new HashMap();
        this.afkLocationsCache = (Map<Integer, Location>)new HashMap();
        this.messageToggleCache = (Map<UUID, Boolean>)new HashMap();
        this.locationCache = (Map<String, Location>)new HashMap();
        this.plugin = plugin;
        this.databaseUrl = plugin.getDataFolder().getAbsolutePath() + "/data.db";
        this.setupDatabase$2020726860(1308692239);
    }
    
    public void setupDatabase$2020726860(final int n) {
        final int n2 = 0x4978A111 ^ (0x3316AE78 ^ (0xF134255 ^ (this.c3MhCWJeLB ^ n)));
        final HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:sqlite:" + this.databaseUrl);
        this.dataSource = new HikariDataSource(hikariConfig);
        this.createTables$216841202(2077589454);
    }
    
    public Connection getConnection$1863960987(final int n) throws SQLException {
        final int n2 = 0x2ACE35CC ^ (0x110E1D78 ^ (0x1ED3CE29 ^ (this.c3MhCWJeLB ^ n)));
        return this.dataSource.getConnection();
    }
    
    public void close$1371832018(final int n) {
        final int n2 = 0x17669A22 ^ (0x210DEDD1 ^ (0x1B845371 ^ (this.c3MhCWJeLB ^ n)));
        Label_0095: {
            if (this.dataSource != null) {
                int n3 = 0x5110ECE2 ^ n2;
                if ((this.dataSource.isClosed() ? 1 : 0) == (0x2B6AADF8 ^ n3)) {
                    this.dataSource.close();
                }
                else {
                    Label_0151: {
                    Label_0144:
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                case 1132223503: {
                                    continue;
                                }
                                case 69114490: {
                                    break Label_0144;
                                }
                                case 1915980216: {
                                    break Label_0151;
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                        n3 ^= 0x545928D6;
                    }
                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 108244282) {
                        while (true) {
                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                case 557548087: {
                                    continue;
                                }
                                case 108244282: {}
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                    }
                }
            }
            else {
                final int n4 = 0x69813565 ^ n2;
                if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4) != 112665165) {
                    throw new IllegalAccessException();
                }
            Label_0304:
                while (true) {
                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n4)) {
                        case 918074459: {
                            break Label_0095;
                        }
                        case 557849404: {
                            continue;
                        }
                        case 112665165: {
                            break Label_0304;
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }
    
    private void createTables$216841202(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ldc             1454748542
        //     4: aload_0        
        //     5: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //     8: iload_1        
        //     9: ixor           
        //    10: ixor           
        //    11: ixor           
        //    12: istore          55
        //    14: ldc             1186090289
        //    16: iload           55
        //    18: ixor           
        //    19: istore          55
        //    21: aload_0        
        //    22: astore_2       
        //    23: aload_2        
        //    24: ldc             1279769918
        //    26: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    29: astore          7
        //    31: aload           7
        //    33: astore          4
        //    35: ldc             685244309
        //    37: iload           55
        //    39: ixor           
        //    40: istore          55
        //    42: aload           4
        //    44: astore          8
        //    46: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.dlfxcujapgohzzo:()[B
        //    49: iload           55
        //    51: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    54: astore_3       
        //    55: aload           8
        //    57: aload_3        
        //    58: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    63: astore          9
        //    65: aload           9
        //    67: astore          5
        //    69: ldc             1406758469
        //    71: iload           55
        //    73: ixor           
        //    74: istore          55
        //    76: aload           5
        //    78: astore          10
        //    80: aload           10
        //    82: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //    87: istore          11
        //    89: ldc             441564182
        //    91: iload           55
        //    93: ixor           
        //    94: istore          55
        //    96: aload           4
        //    98: astore          12
        //   100: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.dgcwjsdkwkroxfs:()[B
        //   103: iload           55
        //   105: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   108: astore          41
        //   110: aload           12
        //   112: aload           41
        //   114: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   119: astore          13
        //   121: aload           13
        //   123: astore          48
        //   125: ldc             1879066501
        //   127: iload           55
        //   129: ixor           
        //   130: istore          55
        //   132: aload           48
        //   134: astore          14
        //   136: aload           14
        //   138: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   143: istore          15
        //   145: ldc             911873893
        //   147: iload           55
        //   149: ixor           
        //   150: istore          55
        //   152: aload           4
        //   154: astore          16
        //   156: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.grgnfohovamhwil:()[B
        //   159: iload           55
        //   161: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   164: astore          42
        //   166: aload           16
        //   168: aload           42
        //   170: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   175: astore          17
        //   177: aload           17
        //   179: astore          49
        //   181: ldc             1055195036
        //   183: iload           55
        //   185: ixor           
        //   186: istore          55
        //   188: aload           49
        //   190: astore          18
        //   192: aload           18
        //   194: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   199: istore          19
        //   201: ldc             839325082
        //   203: iload           55
        //   205: ixor           
        //   206: istore          55
        //   208: aload           4
        //   210: astore          20
        //   212: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.fireelfwoprurwj:()[B
        //   215: iload           55
        //   217: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   220: astore          43
        //   222: aload           20
        //   224: aload           43
        //   226: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   231: astore          21
        //   233: aload           21
        //   235: astore          50
        //   237: ldc             1921119779
        //   239: iload           55
        //   241: ixor           
        //   242: istore          55
        //   244: aload           50
        //   246: astore          22
        //   248: aload           22
        //   250: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   255: istore          23
        //   257: ldc             699452808
        //   259: iload           55
        //   261: ixor           
        //   262: istore          55
        //   264: aload           4
        //   266: astore          24
        //   268: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.hawoxobejkbkijx:()[B
        //   271: iload           55
        //   273: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   276: astore          44
        //   278: aload           24
        //   280: aload           44
        //   282: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   287: astore          25
        //   289: aload           25
        //   291: astore          51
        //   293: ldc             473314098
        //   295: iload           55
        //   297: ixor           
        //   298: istore          55
        //   300: aload           51
        //   302: astore          26
        //   304: aload           26
        //   306: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   311: istore          27
        //   313: ldc             1282474794
        //   315: iload           55
        //   317: ixor           
        //   318: istore          55
        //   320: aload           4
        //   322: astore          28
        //   324: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.yzcdqtpysccnhuv:()[B
        //   327: iload           55
        //   329: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   332: astore          45
        //   334: aload           28
        //   336: aload           45
        //   338: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   343: astore          29
        //   345: aload           29
        //   347: astore          52
        //   349: ldc             135361785
        //   351: iload           55
        //   353: ixor           
        //   354: istore          55
        //   356: aload           52
        //   358: astore          30
        //   360: aload           30
        //   362: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   367: istore          31
        //   369: ldc             642194082
        //   371: iload           55
        //   373: ixor           
        //   374: istore          55
        //   376: aload           4
        //   378: astore          32
        //   380: aload           32
        //   382: ifnull          1092
        //   385: ldc             567382290
        //   387: iload           55
        //   389: ixor           
        //   390: istore          55
        //   392: aload           4
        //   394: astore          33
        //   396: aload           33
        //   398: invokeinterface java/sql/Connection.close:()V
        //   403: goto            939
        //   406: astore          35
        //   408: aload           35
        //   410: astore          53
        //   412: aload           4
        //   414: astore          36
        //   416: aload           36
        //   418: ifnull          751
        //   421: ldc             2027476132
        //   423: iload           55
        //   425: ixor           
        //   426: istore          55
        //   428: aload           4
        //   430: astore          37
        //   432: aload           37
        //   434: invokeinterface java/sql/Connection.close:()V
        //   439: ldc             586932473
        //   441: iload           55
        //   443: ixor           
        //   444: istore          55
        //   446: goto            1773
        //   449: astore          39
        //   451: aload           39
        //   453: astore          6
        //   455: aload           53
        //   457: astore          40
        //   459: aload           6
        //   461: astore          46
        //   463: aload           40
        //   465: aload           46
        //   467: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   470: ldc_w           119678267
        //   473: iload           55
        //   475: ixor           
        //   476: istore          55
        //   478: aload           53
        //   480: astore          38
        //   482: aload           38
        //   484: athrow         
        //   485: iload           55
        //   487: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   490: lookupswitch {
        //          -1838093550: 644
        //          -1640571567: 727
        //          -860290614: 716
        //          -608068967: 703
        //          -537491629: 690
        //          273247184: 668
        //          506782074: 596
        //          753297016: 740
        //          1274623560: 620
        //          1354943512: 631
        //          1383232480: 607
        //          1942057602: 657
        //          default: 679
        //        }
        //   596: ldc_w           916355276
        //   599: iload           55
        //   601: ixor           
        //   602: istore          55
        //   604: goto            406
        //   607: iload           55
        //   609: ldc_w           2132191903
        //   612: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   615: istore          55
        //   617: goto            406
        //   620: ldc_w           2082980394
        //   623: iload           55
        //   625: ixor           
        //   626: istore          55
        //   628: goto            406
        //   631: iload           55
        //   633: ldc_w           2134949216
        //   636: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   639: istore          55
        //   641: goto            406
        //   644: iload           55
        //   646: ldc_w           655817089
        //   649: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   652: istore          55
        //   654: goto            406
        //   657: ldc_w           992004787
        //   660: iload           55
        //   662: ixor           
        //   663: istore          55
        //   665: goto            406
        //   668: ldc_w           2001848729
        //   671: iload           55
        //   673: ixor           
        //   674: istore          55
        //   676: goto            406
        //   679: new             Ljava/lang/RuntimeException;
        //   682: dup            
        //   683: ldc_w           "Error in hash"
        //   686: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   689: athrow         
        //   690: iload           55
        //   692: ldc_w           245773321
        //   695: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   698: istore          55
        //   700: goto            406
        //   703: iload           55
        //   705: ldc_w           1310775216
        //   708: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   711: istore          55
        //   713: goto            406
        //   716: ldc_w           751813850
        //   719: iload           55
        //   721: ixor           
        //   722: istore          55
        //   724: goto            406
        //   727: iload           55
        //   729: ldc_w           1184776009
        //   732: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   735: istore          55
        //   737: goto            406
        //   740: ldc_w           1891903532
        //   743: iload           55
        //   745: ixor           
        //   746: istore          55
        //   748: goto            406
        //   751: iload           55
        //   753: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   756: lookupswitch {
        //          56380975: 800
        //          310949110: 751
        //          720659172: 808
        //          1298778791: 1285
        //          default: 1285
        //        }
        //   800: ldc_w           622894971
        //   803: iload           55
        //   805: ixor           
        //   806: istore          55
        //   808: iload           55
        //   810: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   813: ldc_w           199835406
        //   816: if_icmpeq       879
        //   819: iload           55
        //   821: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   824: lookupswitch {
        //          199835406: 868
        //          717208793: 1285
        //          897413175: 1285
        //          977764988: 819
        //          default: 1285
        //        }
        //   868: ldc_w           903087791
        //   871: iload           55
        //   873: ixor           
        //   874: istore          55
        //   876: goto            1285
        //   879: iload           55
        //   881: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   884: lookupswitch {
        //          199835406: 928
        //          295031741: 1285
        //          680026074: 879
        //          1720621505: 478
        //          default: 1285
        //        }
        //   928: ldc_w           1631094683
        //   931: iload           55
        //   933: ixor           
        //   934: istore          55
        //   936: goto            478
        //   939: iload           55
        //   941: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   944: lookupswitch {
        //          172276428: 988
        //          935765607: 996
        //          1217776711: 1285
        //          1855819406: 939
        //          default: 1285
        //        }
        //   988: ldc_w           1762104471
        //   991: iload           55
        //   993: ixor           
        //   994: istore          55
        //   996: iload           55
        //   998: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1001: ldc_w           46767188
        //  1004: if_icmpeq       1009
        //  1007: aconst_null    
        //  1008: athrow         
        //  1009: new             Ljava/io/IOException;
        //  1012: dup            
        //  1013: invokespecial   java/io/IOException.<init>:()V
        //  1016: athrow         
        //  1017: iload           55
        //  1019: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1022: lookupswitch {
        //          608843043: 1061
        //          1624117009: 1048
        //          default: 1081
        //        }
        //  1048: iload           55
        //  1050: ldc_w           959403430
        //  1053: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1056: istore          55
        //  1058: goto            1069
        //  1061: ldc_w           1908396768
        //  1064: iload           55
        //  1066: ixor           
        //  1067: istore          55
        //  1069: pop            
        //  1070: ldc_w           1156832417
        //  1073: iload           55
        //  1075: ixor           
        //  1076: istore          55
        //  1078: goto            1124
        //  1081: new             Ljava/lang/RuntimeException;
        //  1084: dup            
        //  1085: ldc_w           "Error in hash"
        //  1088: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1091: athrow         
        //  1092: ldc_w           1166461457
        //  1095: iload           55
        //  1097: ixor           
        //  1098: istore          55
        //  1100: iload           55
        //  1102: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1105: ldc_w           219484180
        //  1108: if_icmpeq       1114
        //  1111: goto            1275
        //  1114: iload           55
        //  1116: ldc_w           941408725
        //  1119: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1122: istore          55
        //  1124: ldc_w           1313150319
        //  1127: iload           55
        //  1129: ixor           
        //  1130: istore          55
        //  1132: iload           55
        //  1134: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1137: ldc_w           218671803
        //  1140: if_icmpeq       1145
        //  1143: aconst_null    
        //  1144: athrow         
        //  1145: new             Ljava/lang/RuntimeException;
        //  1148: dup            
        //  1149: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1152: athrow         
        //  1153: iload           55
        //  1155: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1158: lookupswitch {
        //          -66917296: 1206
        //          1789511641: 1195
        //          default: 1184
        //        }
        //  1184: new             Ljava/io/IOException;
        //  1187: dup            
        //  1188: ldc_w           "Error in hash"
        //  1191: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1194: athrow         
        //  1195: ldc_w           88762659
        //  1198: iload           55
        //  1200: ixor           
        //  1201: istore          55
        //  1203: goto            1214
        //  1206: ldc_w           933170258
        //  1209: iload           55
        //  1211: ixor           
        //  1212: istore          55
        //  1214: pop            
        //  1215: iload           55
        //  1217: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1220: lookupswitch {
        //          224841189: 1772
        //          230459021: 1264
        //          612688826: 1285
        //          1014297356: 1215
        //          default: 1285
        //        }
        //  1264: ldc_w           122353678
        //  1267: iload           55
        //  1269: ixor           
        //  1270: istore          55
        //  1272: goto            1772
        //  1275: iload           55
        //  1277: ldc_w           209056775
        //  1280: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1283: istore          55
        //  1285: new             Ljava/io/IOException;
        //  1288: dup            
        //  1289: invokespecial   java/io/IOException.<init>:()V
        //  1292: athrow         
        //  1293: iload           55
        //  1295: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1298: tableswitch {
        //          -670890896: 1327
        //          default: 1316
        //        }
        //  1316: new             Ljava/lang/RuntimeException;
        //  1319: dup            
        //  1320: ldc_w           "Error in hash"
        //  1323: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1326: athrow         
        //  1327: iload           55
        //  1329: ldc_w           1004726655
        //  1332: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1335: istore          55
        //  1337: goto            449
        //  1340: iload           55
        //  1342: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1345: lookupswitch {
        //          -1979195367: 1700
        //          -1838093550: 1612
        //          -1640571567: 1623
        //          -1429788901: 1634
        //          -1290352191: 1689
        //          -860290614: 1551
        //          -608068967: 1516
        //          -537491629: 1599
        //          273247184: 1667
        //          349015881: 1748
        //          506782074: 1540
        //          753297016: 1724
        //          1274623560: 1656
        //          1354943512: 1735
        //          1383232480: 1678
        //          1660557577: 1527
        //          1812038200: 1713
        //          1819709848: 1562
        //          1942057602: 1575
        //          2078180849: 1588
        //          default: 1645
        //        }
        //  1516: ldc_w           1584069007
        //  1519: iload           55
        //  1521: ixor           
        //  1522: istore          55
        //  1524: goto            1758
        //  1527: iload           55
        //  1529: ldc_w           1229818365
        //  1532: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1535: istore          55
        //  1537: goto            1758
        //  1540: ldc_w           651450099
        //  1543: iload           55
        //  1545: ixor           
        //  1546: istore          55
        //  1548: goto            1758
        //  1551: ldc_w           1015409381
        //  1554: iload           55
        //  1556: ixor           
        //  1557: istore          55
        //  1559: goto            1758
        //  1562: iload           55
        //  1564: ldc_w           1755060463
        //  1567: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1570: istore          55
        //  1572: goto            1758
        //  1575: iload           55
        //  1577: ldc_w           728425612
        //  1580: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1583: istore          55
        //  1585: goto            1758
        //  1588: ldc_w           1248402018
        //  1591: iload           55
        //  1593: ixor           
        //  1594: istore          55
        //  1596: goto            1758
        //  1599: iload           55
        //  1601: ldc_w           518789686
        //  1604: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1607: istore          55
        //  1609: goto            1758
        //  1612: ldc_w           928831422
        //  1615: iload           55
        //  1617: ixor           
        //  1618: istore          55
        //  1620: goto            1758
        //  1623: ldc_w           1456738678
        //  1626: iload           55
        //  1628: ixor           
        //  1629: istore          55
        //  1631: goto            1758
        //  1634: ldc_w           273296959
        //  1637: iload           55
        //  1639: ixor           
        //  1640: istore          55
        //  1642: goto            1758
        //  1645: new             Ljava/lang/IllegalAccessException;
        //  1648: dup            
        //  1649: ldc_w           "Error in hash"
        //  1652: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1655: athrow         
        //  1656: ldc_w           1819143189
        //  1659: iload           55
        //  1661: ixor           
        //  1662: istore          55
        //  1664: goto            1758
        //  1667: ldc_w           1729882022
        //  1670: iload           55
        //  1672: ixor           
        //  1673: istore          55
        //  1675: goto            1758
        //  1678: ldc_w           1868334240
        //  1681: iload           55
        //  1683: ixor           
        //  1684: istore          55
        //  1686: goto            1758
        //  1689: ldc_w           1399854052
        //  1692: iload           55
        //  1694: ixor           
        //  1695: istore          55
        //  1697: goto            1758
        //  1700: iload           55
        //  1702: ldc_w           1414674143
        //  1705: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1708: istore          55
        //  1710: goto            1758
        //  1713: ldc_w           1754462875
        //  1716: iload           55
        //  1718: ixor           
        //  1719: istore          55
        //  1721: goto            1758
        //  1724: ldc_w           1619920403
        //  1727: iload           55
        //  1729: ixor           
        //  1730: istore          55
        //  1732: goto            1758
        //  1735: iload           55
        //  1737: ldc_w           1862964063
        //  1740: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1743: istore          55
        //  1745: goto            1758
        //  1748: iload           55
        //  1750: ldc_w           1200323381
        //  1753: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1756: istore          55
        //  1758: astore          34
        //  1760: aload           34
        //  1762: astore          47
        //  1764: ldc_w           1246192394
        //  1767: iload           55
        //  1769: ixor           
        //  1770: istore          55
        //  1772: return         
        //  1773: ldc_w           437791906
        //  1776: iload           55
        //  1778: ixor           
        //  1779: istore          55
        //  1781: iload           55
        //  1783: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1786: ldc_w           124882197
        //  1789: if_icmpeq       1794
        //  1792: aconst_null    
        //  1793: athrow         
        //  1794: new             Ljava/lang/RuntimeException;
        //  1797: dup            
        //  1798: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1801: athrow         
        //  1802: iload           55
        //  1804: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1807: lookupswitch {
        //          -1423974175: 1832
        //          387814442: 1856
        //          default: 1845
        //        }
        //  1832: iload           55
        //  1834: ldc_w           1119309825
        //  1837: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1840: istore          55
        //  1842: goto            1864
        //  1845: new             Ljava/lang/RuntimeException;
        //  1848: dup            
        //  1849: ldc_w           "Error in hash"
        //  1852: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1855: athrow         
        //  1856: ldc_w           892804760
        //  1859: iload           55
        //  1861: ixor           
        //  1862: istore          55
        //  1864: pop            
        //  1865: ldc_w           1184124958
        //  1868: iload           55
        //  1870: ixor           
        //  1871: istore          55
        //  1873: goto            478
        //    StackMapTable: 00 50 FF 01 96 00 38 07 00 02 01 07 00 02 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2A 00 38 07 00 02 01 07 00 02 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C FF 00 06 00 38 07 00 02 01 07 00 02 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 6E 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 FF 00 0A 00 38 07 00 02 01 07 00 02 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 30 07 0A 30 0A 30 FF 00 0A 00 38 07 00 02 01 07 00 02 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 00 00 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 00 00 01 00 00 30 07 0C 47 07 00 C4 5E 07 00 C4 4C 07 00 C4 47 07 00 C4 4B 07 00 C4 FF 00 0A 00 38 07 00 02 01 07 00 02 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 00 00 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 00 00 01 00 00 15 09 14 47 07 00 C2 5E 07 00 C2 4A 07 00 C2 4A 07 00 C2 47 07 00 C2 00 30 0A FF 00 09 00 38 07 00 02 01 07 00 02 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 38 07 00 02 01 07 00 02 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 56 07 00 C0 4A 07 00 C0 FF 00 0C 00 38 07 00 02 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 AF 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 49 07 00 97 0D FF 00 00 00 38 07 00 02 01 07 00 02 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 14 47 07 00 C2 5D 07 00 C2 4C 07 00 C2 4A 07 00 C2 47 07 00 C2
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  42     376    485    1876   Ljava/lang/Throwable;
        //  428    446    1293   1340   Ljava/lang/Throwable;
        //  21     485    1340   1772   Ljava/sql/SQLException;
        //  1781   1802   1802   1876   Ljava/lang/RuntimeException;
        //  1132   1153   1153   1275   Ljava/lang/RuntimeException;
        //  996    1017   1017   1092   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0449:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Map<Integer, Location> getSpawnNumber$1518350224(final int n) {
        final int n2 = 0x79597953 ^ (0x6C2BFFE1 ^ (0x7DE8E7BA ^ (this.c3MhCWJeLB ^ n)));
        final HashMap hashMap = new HashMap();
        int n3 = 0x5B06AC72 ^ n2;
        Label_2362: {
            try {
                final Connection connection$1863960987 = this.getConnection$1863960987(1279769918);
                n3 ^= 0x14B77806;
                while (true) {
                    try {
                        final PreparedStatement prepareStatement = connection$1863960987.prepareStatement(rpkelfzxgl(wvplbgwhloeltrw(), n3));
                        n3 ^= 0x3342876B;
                        final ResultSet executeQuery = prepareStatement.executeQuery();
                        n3 ^= 0x41273CB3;
                        Label_1476: {
                        Label_1282:
                            while (true) {
                                if ((executeQuery.next() ? 1 : 0) != (0x3BBBA62A ^ n3)) {
                                    n3 ^= 0x17AA440F;
                                    final int int1 = executeQuery.getInt(rpkelfzxgl(abjdntqwzkjeicz(), n3));
                                    n3 ^= 0x24FEAE5E;
                                    final double double1 = executeQuery.getDouble(rpkelfzxgl(qvpnuszdapdmrhv(), n3));
                                    n3 ^= 0x3D90D433;
                                    final double double2 = executeQuery.getDouble(rpkelfzxgl(vqayblrahumhtna(), n3));
                                    n3 ^= 0x4A98994B;
                                    final double double3 = executeQuery.getDouble(rpkelfzxgl(rdcqhyqphuhluic(), n3));
                                    n3 ^= 0x42559B27;
                                    final float float1 = executeQuery.getFloat(rpkelfzxgl(unokojdhdnvsbvo(), n3));
                                    n3 ^= 0x778D0B42;
                                    final float float2 = executeQuery.getFloat(rpkelfzxgl(hxrgjjwksfaxvdp(), n3));
                                    n3 ^= 0x7F24A645;
                                    final String string = executeQuery.getString(rpkelfzxgl(yzffoedywyfxuez(), n3));
                                    n3 ^= 0x3DA43387;
                                    final World world = Bukkit.getWorld(string);
                                    n3 ^= 0x46568CDC;
                                    final Location location = new Location(world, double1, double2, double3, float1, float2);
                                    n3 ^= 0x6E405047;
                                    ((Map)hashMap).put((Object)int1, (Object)location);
                                    n3 ^= 0x3CF242A5;
                                }
                                else {
                                    Label_0654: {
                                        break Label_0654;
                                    Label_0647_Outer:
                                        while (true) {
                                            n3 ^= 0x14A9C938;
                                            Label_0542: {
                                            Label_0647:
                                                while (true) {
                                                    Label_0932: {
                                                        while (true) {
                                                            try {
                                                                connection$1863960987.close();
                                                                n3 ^= 0x7CDCC0B8;
                                                                break Label_0932;
                                                                final Throwable t;
                                                                final Throwable t2;
                                                                t.addSuppressed(t2);
                                                                n3 ^= 0x7FFADC05;
                                                                throw t;
                                                                n3 = pnzgcbkxlxxlmsti(n3, 78608550);
                                                                iftrue(Label_0678:)(nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) == 171462715);
                                                                n3 ^= 0x3BF78963;
                                                                throw new RuntimeException();
                                                                Label_0678: {
                                                                    n3 ^= 0x6A9F9919;
                                                                }
                                                                break Label_0542;
                                                            }
                                                            catch (final Throwable t2) {
                                                                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                                                                    case 1608445337: {
                                                                        n3 ^= 0x1F76F7A;
                                                                        continue Label_0647_Outer;
                                                                    }
                                                                    default: {
                                                                        throw new IOException("Error in hash");
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        Label_0800: {
                                                        Label_0792:
                                                            while (true) {
                                                                switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                                                    case 877996843: {
                                                                        continue Label_0647_Outer;
                                                                    }
                                                                    case 179255455: {
                                                                        break Label_0792;
                                                                    }
                                                                    case 1450431150: {
                                                                        break Label_0800;
                                                                    }
                                                                    default: {
                                                                        throw new RuntimeException();
                                                                    }
                                                                }
                                                            }
                                                            n3 ^= 0x1C24BD33;
                                                        }
                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 79023010) {
                                                            n3 = pnzgcbkxlxxlmsti(n3, 664141399);
                                                            throw new RuntimeException();
                                                        }
                                                    Label_0860:
                                                        while (true) {
                                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                                                case 1867309295: {
                                                                    continue Label_0647;
                                                                    continue Label_0647;
                                                                }
                                                                case 1360558037: {
                                                                    continue Label_0647_Outer;
                                                                }
                                                                case 79023010: {
                                                                    break Label_0860;
                                                                }
                                                                default: {
                                                                    throw new RuntimeException();
                                                                }
                                                            }
                                                        }
                                                        n3 ^= 0x7680C774;
                                                        continue Label_0647;
                                                    }
                                                    n3 ^= 0x6935C8CC;
                                                    try {
                                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 138690595) {
                                                            throw null;
                                                        }
                                                        throw new IOException();
                                                    }
                                                    catch (final IOException ex) {
                                                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                                                            case -271531392: {
                                                                n3 ^= 0x39CFAF71;
                                                                break;
                                                            }
                                                            default: {
                                                                throw new IllegalAccessException("Error in hash");
                                                            }
                                                            case -258560455: {
                                                                n3 = pnzgcbkxlxxlmsti(n3, 438788838);
                                                                break;
                                                            }
                                                        }
                                                    Label_1072:
                                                        while (true) {
                                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                                                case 795978297: {
                                                                    continue Label_0647;
                                                                    continue Label_0647;
                                                                }
                                                                case 1254669855: {
                                                                    continue Label_0647_Outer;
                                                                }
                                                                case 103298810: {
                                                                    break Label_1072;
                                                                }
                                                                default: {
                                                                    throw new RuntimeException();
                                                                }
                                                            }
                                                        }
                                                        n3 ^= 0x71C3D9ED;
                                                        continue Label_0647;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            if (connection$1863960987 != null) {
                                                n3 ^= 0x4EA952C;
                                                connection$1863960987.close();
                                                break Label_1282;
                                            }
                                            n3 ^= 0x1EC1BE32;
                                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 31525113) {
                                                n3 = pnzgcbkxlxxlmsti(n3, 1336520264);
                                                throw new RuntimeException();
                                            }
                                            n3 = pnzgcbkxlxxlmsti(n3, 1631848130);
                                            break Label_1476;
                                        }
                                    }
                                }
                                Label_1140: {
                                Label_1132:
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                            case 2121558482: {
                                                continue;
                                            }
                                            case 116484049: {
                                                break Label_1132;
                                            }
                                            case 1203144155: {
                                                break Label_1140;
                                            }
                                            default: {
                                                throw new RuntimeException();
                                            }
                                        }
                                    }
                                    n3 ^= 0x86EDAC6;
                                    try {
                                        if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 120010887) {
                                            throw null;
                                        }
                                        throw new IllegalAccessException();
                                    }
                                    catch (final IllegalAccessException ex2) {
                                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                                            case 617287010: {
                                                n3 = pnzgcbkxlxxlmsti(n3, 2116253789);
                                                break;
                                            }
                                            case -1582693664: {
                                                n3 ^= 0x2E8F59AD;
                                                break;
                                            }
                                            default: {
                                                throw new RuntimeException("Error in hash");
                                            }
                                        }
                                    Label_1260:
                                        while (true) {
                                            switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                                case 1739999705: {
                                                    continue Label_1476;
                                                }
                                                case 1917604558: {
                                                    continue;
                                                }
                                                case 29927672: {
                                                    break Label_1260;
                                                }
                                                default: {
                                                    throw new RuntimeException();
                                                }
                                            }
                                        }
                                        n3 ^= 0x101BFDB;
                                        continue;
                                    }
                                }
                                break;
                            }
                            Label_1336: {
                            Label_1328:
                                while (true) {
                                    switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                        case 1107829052: {
                                            continue;
                                        }
                                        case 229497127: {
                                            break Label_1328;
                                        }
                                        case 1737836952: {
                                            break Label_1336;
                                        }
                                        default: {
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                                n3 ^= 0x77C19544;
                                try {
                                    if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 181841370) {
                                        throw null;
                                    }
                                    throw new IOException();
                                }
                                catch (final IOException ex3) {
                                    switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                                        case -969405405: {
                                            n3 ^= 0x1D0F6158;
                                            break;
                                        }
                                        default: {
                                            throw new RuntimeException("Error in hash");
                                        }
                                        case 889339881: {
                                            n3 ^= 0x43682721;
                                            break;
                                        }
                                    }
                                Label_1468:
                                    while (true) {
                                        switch (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3)) {
                                            case 788609792: {
                                                continue;
                                            }
                                            case 87318114: {
                                                break Label_1468;
                                            }
                                            case 1579539457: {
                                                break Label_1476;
                                            }
                                            default: {
                                                throw new RuntimeException();
                                            }
                                        }
                                    }
                                    n3 ^= 0x4FC69FB9;
                                }
                            }
                        }
                        n3 ^= 0x65E8FDD7;
                        try {
                            if (nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik(n3) != 181267166) {
                                throw null;
                            }
                            throw new RuntimeException();
                        }
                        catch (final RuntimeException ex4) {
                            switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                                case 2046291816: {
                                    n3 = pnzgcbkxlxxlmsti(n3, 2027856734);
                                    break;
                                }
                                case 2133857682: {
                                    n3 ^= 0x38065C01;
                                    break;
                                }
                                default: {
                                    throw new IOException("Error in hash");
                                }
                            }
                            n3 = pnzgcbkxlxxlmsti(n3, 902776098);
                            break Label_2362;
                        }
                        throw new RuntimeException();
                        final Throwable t3;
                        final Throwable t = t3;
                        iftrue(Label_0746:)(connection$1863960987 == null);
                    }
                    catch (final Throwable t3) {
                        switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                            case -1409498559: {
                                n3 ^= 0xA2D8CC3;
                                continue;
                            }
                            case 1173890336: {
                                n3 = pnzgcbkxlxxlmsti(n3, 938283055);
                                continue;
                            }
                            case 1619988777: {
                                n3 = pnzgcbkxlxxlmsti(n3, 323221166);
                                continue;
                            }
                            case -1462126311: {
                                n3 ^= 0xA4923A8;
                                continue;
                            }
                            case 89047545: {
                                n3 ^= 0x1FFBCCB4;
                                continue;
                            }
                            case 1375505202: {
                                n3 = pnzgcbkxlxxlmsti(n3, 1970111981);
                                continue;
                            }
                            default: {
                                throw new RuntimeException("Error in hash");
                            }
                            case -13105125: {
                                n3 ^= 0x40B51588;
                                continue;
                            }
                            case 1199203288: {
                                n3 = pnzgcbkxlxxlmsti(n3, 935155952);
                                continue;
                            }
                            case -572706479: {
                                n3 ^= 0x4E9B2A1;
                                continue;
                            }
                            case -309014239: {
                                n3 ^= 0x2E08EAF;
                                continue;
                            }
                            case -488844080: {
                                n3 ^= 0x23098E11;
                                continue;
                            }
                            case 1324412818: {
                                n3 ^= 0x768C0979;
                                continue;
                            }
                            case -723200821: {
                                n3 ^= 0x45CE8E12;
                                continue;
                            }
                            case 2001486786: {
                                n3 ^= 0x71BB9CF3;
                                continue;
                            }
                        }
                    }
                    break;
                }
            }
            catch (final SQLException ex5) {
                int n4 = 0;
                switch (nqlipuvkfzlomfdg.lyvmtarecrvhtwki(n3)) {
                    case 2001486786: {
                        n4 = pnzgcbkxlxxlmsti(n3, 1827040267);
                        break;
                    }
                    case -1961978422: {
                        n4 = (0x736E36CA ^ n3);
                        break;
                    }
                    case -13105125: {
                        n4 = pnzgcbkxlxxlmsti(n3, 1575544176);
                        break;
                    }
                    case 89047545: {
                        n4 = (0x2A63C4C ^ n3);
                        break;
                    }
                    case 1199203288: {
                        n4 = (0x2AE0A808 ^ n3);
                        break;
                    }
                    case -309014239: {
                        n4 = (0x1FBD7E57 ^ n3);
                        break;
                    }
                    case 1324412818: {
                        n4 = pnzgcbkxlxxlmsti(n3, 1808923009);
                        break;
                    }
                    case -1187452838: {
                        n4 = (0x7528F978 ^ n3);
                        break;
                    }
                    case 1173890336: {
                        n4 = (0x2AB0E0D7 ^ n3);
                        break;
                    }
                    case 1348834889: {
                        n4 = (0x80356BA ^ n3);
                        break;
                    }
                    case -347394142: {
                        n4 = (0x7F668187 ^ n3);
                        break;
                    }
                    case -1403372374: {
                        n4 = pnzgcbkxlxxlmsti(n3, 2005181414);
                        break;
                    }
                    case 1608445337: {
                        n4 = pnzgcbkxlxxlmsti(n3, 167000512);
                        break;
                    }
                    case -723200821: {
                        n4 = (0x58937EEA ^ n3);
                        break;
                    }
                    default: {
                        throw new IOException("Error in hash");
                    }
                    case -1347193246: {
                        n4 = (0x77F98ABF ^ n3);
                        break;
                    }
                    case -488844080: {
                        n4 = pnzgcbkxlxxlmsti(n3, 1045724905);
                        break;
                    }
                    case 1375505202: {
                        n4 = pnzgcbkxlxxlmsti(n3, 1748006165);
                        break;
                    }
                    case -1409498559: {
                        n4 = (0x17707C3B ^ n3);
                        break;
                    }
                    case -1462126311: {
                        n4 = (0x1714D350 ^ n3);
                        break;
                    }
                    case 1619988777: {
                        n4 = pnzgcbkxlxxlmsti(n3, 236848726);
                        break;
                    }
                    case -572706479: {
                        n4 = pnzgcbkxlxxlmsti(n3, 431243865);
                        break;
                    }
                    case -91184039: {
                        n4 = (0x1D5DF0F8 ^ n3);
                        break;
                    }
                }
                n3 = (0x6020FFE2 ^ n4);
            }
        }
        this.spawnLocationsCache.putAll((Map)hashMap);
        return (Map<Integer, Location>)hashMap;
    }
    
    public void setSpawn$19360209(final Location p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           1995308755
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_3        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          64
        //    16: ldc_w           1170593798
        //    19: iload           64
        //    21: ixor           
        //    22: istore          64
        //    24: aload_0        
        //    25: astore          4
        //    27: aload           4
        //    29: ldc             1279769918
        //    31: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    34: astore          10
        //    36: aload           10
        //    38: astore          7
        //    40: ldc_w           429032234
        //    43: iload           64
        //    45: ixor           
        //    46: istore          64
        //    48: aload           7
        //    50: astore          11
        //    52: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.jfsbjcxcmjzhzrl:()[B
        //    55: iload           64
        //    57: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    60: astore          5
        //    62: aload           11
        //    64: aload           5
        //    66: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    71: astore          12
        //    73: aload           12
        //    75: astore          8
        //    77: ldc_w           1430540779
        //    80: iload           64
        //    82: ixor           
        //    83: istore          64
        //    85: aload           8
        //    87: astore          13
        //    89: ldc_w           123593586
        //    92: iload           64
        //    94: ixor           
        //    95: i2b            
        //    96: istore          34
        //    98: iload_2        
        //    99: istore          6
        //   101: aload           13
        //   103: iload           34
        //   105: iload           6
        //   107: invokeinterface java/sql/PreparedStatement.setInt:(II)V
        //   112: ldc_w           1909996368
        //   115: iload           64
        //   117: ixor           
        //   118: istore          64
        //   120: aload           8
        //   122: astore          14
        //   124: ldc_w           1988483105
        //   127: iload           64
        //   129: ixor           
        //   130: i2b            
        //   131: istore          35
        //   133: aload_1        
        //   134: astore          44
        //   136: aload           44
        //   138: invokevirtual   org/bukkit/Location.getX:()D
        //   141: dstore          45
        //   143: aload           14
        //   145: iload           35
        //   147: dload           45
        //   149: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   154: ldc_w           1785318113
        //   157: iload           64
        //   159: ixor           
        //   160: istore          64
        //   162: aload           8
        //   164: astore          15
        //   166: ldc_w           485233345
        //   169: iload           64
        //   171: ixor           
        //   172: i2b            
        //   173: istore          36
        //   175: aload_1        
        //   176: astore          47
        //   178: aload           47
        //   180: invokevirtual   org/bukkit/Location.getY:()D
        //   183: dstore          48
        //   185: aload           15
        //   187: iload           36
        //   189: dload           48
        //   191: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   196: ldc_w           1656997070
        //   199: iload           64
        //   201: ixor           
        //   202: istore          64
        //   204: aload           8
        //   206: astore          16
        //   208: ldc_w           2117064200
        //   211: iload           64
        //   213: ixor           
        //   214: i2b            
        //   215: istore          37
        //   217: aload_1        
        //   218: astore          50
        //   220: aload           50
        //   222: invokevirtual   org/bukkit/Location.getZ:()D
        //   225: dstore          51
        //   227: aload           16
        //   229: iload           37
        //   231: dload           51
        //   233: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   238: ldc_w           272030735
        //   241: iload           64
        //   243: ixor           
        //   244: istore          64
        //   246: aload           8
        //   248: astore          17
        //   250: ldc_w           1847134726
        //   253: iload           64
        //   255: ixor           
        //   256: i2b            
        //   257: istore          38
        //   259: aload_1        
        //   260: astore          53
        //   262: aload           53
        //   264: invokevirtual   org/bukkit/Location.getYaw:()F
        //   267: fstore          54
        //   269: aload           17
        //   271: iload           38
        //   273: fload           54
        //   275: invokeinterface java/sql/PreparedStatement.setFloat:(IF)V
        //   280: ldc_w           183340139
        //   283: iload           64
        //   285: ixor           
        //   286: istore          64
        //   288: aload           8
        //   290: astore          18
        //   292: ldc_w           1693746798
        //   295: iload           64
        //   297: ixor           
        //   298: i2b            
        //   299: istore          39
        //   301: aload_1        
        //   302: astore          55
        //   304: aload           55
        //   306: invokevirtual   org/bukkit/Location.getPitch:()F
        //   309: fstore          56
        //   311: aload           18
        //   313: iload           39
        //   315: fload           56
        //   317: invokeinterface java/sql/PreparedStatement.setFloat:(IF)V
        //   322: ldc_w           1250620967
        //   325: iload           64
        //   327: ixor           
        //   328: istore          64
        //   330: aload           8
        //   332: astore          19
        //   334: ldc_w           780038216
        //   337: iload           64
        //   339: ixor           
        //   340: i2b            
        //   341: istore          40
        //   343: aload_1        
        //   344: astore          57
        //   346: aload           57
        //   348: invokevirtual   org/bukkit/Location.getWorld:()Lorg/bukkit/World;
        //   351: astore          58
        //   353: aload           58
        //   355: invokeinterface org/bukkit/World.getName:()Ljava/lang/String;
        //   360: astore          59
        //   362: aload           19
        //   364: iload           40
        //   366: aload           59
        //   368: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   373: ldc_w           1530454487
        //   376: iload           64
        //   378: ixor           
        //   379: istore          64
        //   381: aload           8
        //   383: astore          20
        //   385: aload           20
        //   387: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   392: istore          21
        //   394: ldc_w           1651957791
        //   397: iload           64
        //   399: ixor           
        //   400: istore          64
        //   402: aload_0        
        //   403: astore          22
        //   405: aload           22
        //   407: getfield        dev/daniboy/donutcore/database/SQLiteManager.spawnLocationsCache:Ljava/util/Map;
        //   410: astore          23
        //   412: iload_2        
        //   413: istore          41
        //   415: iload           41
        //   417: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   420: astore          42
        //   422: aload_1        
        //   423: astore          60
        //   425: aload           23
        //   427: aload           42
        //   429: aload           60
        //   431: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   436: astore          24
        //   438: ldc_w           375632999
        //   441: iload           64
        //   443: ixor           
        //   444: istore          64
        //   446: aload           7
        //   448: astore          25
        //   450: aload           25
        //   452: ifnull          1593
        //   455: ldc_w           43537041
        //   458: iload           64
        //   460: ixor           
        //   461: istore          64
        //   463: aload           7
        //   465: astore          26
        //   467: aload           26
        //   469: invokeinterface java/sql/Connection.close:()V
        //   474: goto            1024
        //   477: astore          28
        //   479: aload           28
        //   481: astore          62
        //   483: aload           7
        //   485: astore          29
        //   487: aload           29
        //   489: ifnull          933
        //   492: ldc_w           1944307413
        //   495: iload           64
        //   497: ixor           
        //   498: istore          64
        //   500: aload           7
        //   502: astore          30
        //   504: aload           30
        //   506: invokeinterface java/sql/Connection.close:()V
        //   511: ldc_w           183144879
        //   514: iload           64
        //   516: ixor           
        //   517: istore          64
        //   519: goto            558
        //   522: astore          32
        //   524: aload           32
        //   526: astore          9
        //   528: aload           62
        //   530: astore          33
        //   532: aload           9
        //   534: astore          43
        //   536: aload           33
        //   538: aload           43
        //   540: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   543: ldc_w           1928152272
        //   546: iload           64
        //   548: ixor           
        //   549: istore          64
        //   551: aload           62
        //   553: astore          31
        //   555: aload           31
        //   557: athrow         
        //   558: iload           64
        //   560: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   563: lookupswitch {
        //          154924697: 558
        //          171357646: 604
        //          1423999983: 612
        //          2029408211: 1799
        //          default: 1799
        //        }
        //   604: ldc_w           840114290
        //   607: iload           64
        //   609: ixor           
        //   610: istore          64
        //   612: iload           64
        //   614: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   617: ldc_w           221768370
        //   620: if_icmpeq       625
        //   623: aconst_null    
        //   624: athrow         
        //   625: new             Ljava/io/IOException;
        //   628: dup            
        //   629: invokespecial   java/io/IOException.<init>:()V
        //   632: athrow         
        //   633: iload           64
        //   635: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   638: lookupswitch {
        //          -1248304248: 675
        //          1054205129: 688
        //          default: 664
        //        }
        //   664: new             Ljava/io/IOException;
        //   667: dup            
        //   668: ldc_w           "Error in hash"
        //   671: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   674: athrow         
        //   675: iload           64
        //   677: ldc_w           348583
        //   680: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   683: istore          64
        //   685: goto            696
        //   688: ldc_w           829219151
        //   691: iload           64
        //   693: ixor           
        //   694: istore          64
        //   696: pop            
        //   697: ldc_w           264397190
        //   700: iload           64
        //   702: ixor           
        //   703: istore          64
        //   705: goto            551
        //   708: iload           64
        //   710: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   713: lookupswitch {
        //          -1865575230: 839
        //          -1439396669: 898
        //          -1272004325: 922
        //          -1182561224: 863
        //          -413100528: 874
        //          -243355549: 852
        //          665072451: 911
        //          988748696: 804
        //          1892175899: 815
        //          1945338489: 826
        //          default: 887
        //        }
        //   804: ldc_w           1805461730
        //   807: iload           64
        //   809: ixor           
        //   810: istore          64
        //   812: goto            477
        //   815: ldc_w           47825298
        //   818: iload           64
        //   820: ixor           
        //   821: istore          64
        //   823: goto            477
        //   826: iload           64
        //   828: ldc_w           1119796190
        //   831: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   834: istore          64
        //   836: goto            477
        //   839: iload           64
        //   841: ldc_w           1054439689
        //   844: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   847: istore          64
        //   849: goto            477
        //   852: ldc_w           317660573
        //   855: iload           64
        //   857: ixor           
        //   858: istore          64
        //   860: goto            477
        //   863: ldc_w           2079373846
        //   866: iload           64
        //   868: ixor           
        //   869: istore          64
        //   871: goto            477
        //   874: iload           64
        //   876: ldc_w           1881987411
        //   879: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   882: istore          64
        //   884: goto            477
        //   887: new             Ljava/lang/IllegalAccessException;
        //   890: dup            
        //   891: ldc_w           "Error in hash"
        //   894: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   897: athrow         
        //   898: iload           64
        //   900: ldc_w           428235273
        //   903: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   906: istore          64
        //   908: goto            477
        //   911: ldc_w           137645561
        //   914: iload           64
        //   916: ixor           
        //   917: istore          64
        //   919: goto            477
        //   922: ldc_w           440734642
        //   925: iload           64
        //   927: ixor           
        //   928: istore          64
        //   930: goto            477
        //   933: iload           64
        //   935: ldc_w           71297565
        //   938: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   941: istore          64
        //   943: iload           64
        //   945: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   948: ldc_w           191772672
        //   951: if_icmpeq       1011
        //   954: iload           64
        //   956: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   959: lookupswitch {
        //          191772672: 1000
        //          216218057: 954
        //          537268445: 1799
        //          1586425442: 1799
        //          default: 1799
        //        }
        //  1000: ldc_w           390866058
        //  1003: iload           64
        //  1005: ixor           
        //  1006: istore          64
        //  1008: goto            1799
        //  1011: iload           64
        //  1013: ldc_w           1904942556
        //  1016: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1019: istore          64
        //  1021: goto            551
        //  1024: ldc_w           259074477
        //  1027: iload           64
        //  1029: ixor           
        //  1030: istore          64
        //  1032: iload           64
        //  1034: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1037: ldc_w           145350000
        //  1040: if_icmpeq       1045
        //  1043: aconst_null    
        //  1044: athrow         
        //  1045: new             Ljava/lang/IllegalAccessException;
        //  1048: dup            
        //  1049: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1052: athrow         
        //  1053: iload           64
        //  1055: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1058: lookupswitch {
        //          -1438446830: 1084
        //          1708521184: 1095
        //          default: 1163
        //        }
        //  1084: ldc_w           248566989
        //  1087: iload           64
        //  1089: ixor           
        //  1090: istore          64
        //  1092: goto            1103
        //  1095: ldc_w           1461848947
        //  1098: iload           64
        //  1100: ixor           
        //  1101: istore          64
        //  1103: pop            
        //  1104: iload           64
        //  1106: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1109: lookupswitch {
        //          24624027: 1152
        //          92555513: 1680
        //          470629867: 1104
        //          1768153480: 1799
        //          default: 1799
        //        }
        //  1152: ldc_w           1407016895
        //  1155: iload           64
        //  1157: ixor           
        //  1158: istore          64
        //  1160: goto            1680
        //  1163: new             Ljava/io/IOException;
        //  1166: dup            
        //  1167: ldc_w           "Error in hash"
        //  1170: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1173: athrow         
        //  1174: iload           64
        //  1176: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1179: tableswitch {
        //          -231680960: 1207
        //          default: 1196
        //        }
        //  1196: new             Ljava/io/IOException;
        //  1199: dup            
        //  1200: ldc_w           "Error in hash"
        //  1203: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1206: athrow         
        //  1207: ldc_w           1958376900
        //  1210: iload           64
        //  1212: ixor           
        //  1213: istore          64
        //  1215: goto            522
        //  1218: iload           64
        //  1220: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1223: lookupswitch {
        //          -1865575230: 1444
        //          -1439396669: 1433
        //          -1370691752: 1547
        //          -1272004325: 1479
        //          -1182561224: 1512
        //          -878583168: 1468
        //          -413100528: 1536
        //          -243355549: 1523
        //          -115840480: 1558
        //          178138880: 1376
        //          509393800: 1501
        //          665072451: 1389
        //          988748696: 1582
        //          1549372818: 1569
        //          1556857859: 1490
        //          1711692939: 1400
        //          1892175899: 1455
        //          1945338489: 1422
        //          default: 1411
        //        }
        //  1376: iload           64
        //  1378: ldc_w           168413389
        //  1381: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1384: istore          64
        //  1386: goto            1784
        //  1389: ldc_w           1873709893
        //  1392: iload           64
        //  1394: ixor           
        //  1395: istore          64
        //  1397: goto            1784
        //  1400: ldc_w           1738196668
        //  1403: iload           64
        //  1405: ixor           
        //  1406: istore          64
        //  1408: goto            1784
        //  1411: new             Ljava/lang/RuntimeException;
        //  1414: dup            
        //  1415: ldc_w           "Error in hash"
        //  1418: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1421: athrow         
        //  1422: ldc_w           623148386
        //  1425: iload           64
        //  1427: ixor           
        //  1428: istore          64
        //  1430: goto            1784
        //  1433: ldc_w           2115804341
        //  1436: iload           64
        //  1438: ixor           
        //  1439: istore          64
        //  1441: goto            1784
        //  1444: ldc_w           1497612213
        //  1447: iload           64
        //  1449: ixor           
        //  1450: istore          64
        //  1452: goto            1784
        //  1455: iload           64
        //  1457: ldc_w           1698891566
        //  1460: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1463: istore          64
        //  1465: goto            1784
        //  1468: ldc_w           305017213
        //  1471: iload           64
        //  1473: ixor           
        //  1474: istore          64
        //  1476: goto            1784
        //  1479: ldc_w           2111821070
        //  1482: iload           64
        //  1484: ixor           
        //  1485: istore          64
        //  1487: goto            1784
        //  1490: ldc_w           1623422381
        //  1493: iload           64
        //  1495: ixor           
        //  1496: istore          64
        //  1498: goto            1784
        //  1501: ldc_w           143759964
        //  1504: iload           64
        //  1506: ixor           
        //  1507: istore          64
        //  1509: goto            1784
        //  1512: ldc_w           476740778
        //  1515: iload           64
        //  1517: ixor           
        //  1518: istore          64
        //  1520: goto            1784
        //  1523: iload           64
        //  1525: ldc_w           1970658081
        //  1528: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1531: istore          64
        //  1533: goto            1784
        //  1536: ldc_w           397811695
        //  1539: iload           64
        //  1541: ixor           
        //  1542: istore          64
        //  1544: goto            1784
        //  1547: ldc_w           512987590
        //  1550: iload           64
        //  1552: ixor           
        //  1553: istore          64
        //  1555: goto            1784
        //  1558: ldc_w           343474281
        //  1561: iload           64
        //  1563: ixor           
        //  1564: istore          64
        //  1566: goto            1784
        //  1569: iload           64
        //  1571: ldc_w           1087454367
        //  1574: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1577: istore          64
        //  1579: goto            1784
        //  1582: ldc_w           201846366
        //  1585: iload           64
        //  1587: ixor           
        //  1588: istore          64
        //  1590: goto            1784
        //  1593: iload           64
        //  1595: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1598: lookupswitch {
        //          20875473: 1640
        //          300016354: 1593
        //          1480132442: 1648
        //          1503997298: 1799
        //          default: 1799
        //        }
        //  1640: ldc_w           1100105332
        //  1643: iload           64
        //  1645: ixor           
        //  1646: istore          64
        //  1648: iload           64
        //  1650: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1653: ldc_w           225881647
        //  1656: if_icmpeq       1670
        //  1659: ldc_w           1064470162
        //  1662: iload           64
        //  1664: ixor           
        //  1665: istore          64
        //  1667: goto            1799
        //  1670: iload           64
        //  1672: ldc_w           1216637316
        //  1675: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1678: istore          64
        //  1680: ldc_w           611499712
        //  1683: iload           64
        //  1685: ixor           
        //  1686: istore          64
        //  1688: iload           64
        //  1690: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1693: ldc_w           95098980
        //  1696: if_icmpeq       1701
        //  1699: aconst_null    
        //  1700: athrow         
        //  1701: new             Ljava/lang/IllegalAccessException;
        //  1704: dup            
        //  1705: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1708: athrow         
        //  1709: iload           64
        //  1711: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1714: lookupswitch {
        //          1639622273: 1762
        //          2029432832: 1751
        //          default: 1740
        //        }
        //  1740: new             Ljava/lang/RuntimeException;
        //  1743: dup            
        //  1744: ldc_w           "Error in hash"
        //  1747: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1750: athrow         
        //  1751: ldc_w           1417143553
        //  1754: iload           64
        //  1756: ixor           
        //  1757: istore          64
        //  1759: goto            1772
        //  1762: iload           64
        //  1764: ldc_w           2002675665
        //  1767: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1770: istore          64
        //  1772: pop            
        //  1773: ldc_w           1115630640
        //  1776: iload           64
        //  1778: ixor           
        //  1779: istore          64
        //  1781: goto            1798
        //  1784: astore          27
        //  1786: aload           27
        //  1788: astore          61
        //  1790: ldc_w           306975260
        //  1793: iload           64
        //  1795: ixor           
        //  1796: istore          64
        //  1798: return         
        //  1799: new             Ljava/lang/RuntimeException;
        //  1802: dup            
        //  1803: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1806: athrow         
        //    StackMapTable: 00 4A FF 01 DD 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C FF 00 06 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 2D 07 0C 47 07 00 C4 5E 07 00 C4 4A 07 00 C4 4C 07 00 C4 47 07 00 C4 FF 00 0B 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 5F 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 FF 00 0A 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 14 2D 0A FF 00 0C 00 3E 07 00 02 07 01 98 01 01 07 00 02 07 01 4D 01 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 D5 07 00 D5 00 00 00 00 00 00 00 01 01 01 01 01 01 01 01 07 00 31 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 07 01 98 00 00 00 01 00 00 14 47 07 00 BD 5E 07 00 BD 4A 07 00 BD 47 07 00 BD 00 2F 4A 07 00 BD FF 00 0A 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 55 07 00 C0 4A 07 00 C0 FF 00 0A 00 41 07 00 02 07 01 98 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 9D 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 FF 00 0A 00 3E 07 00 02 07 01 98 01 01 07 00 02 07 01 4D 01 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 D5 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01 01 07 00 31 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 07 01 98 00 00 00 01 00 00 2E 07 15 09 14 47 07 00 BD 5E 07 00 BD 4A 07 00 BD 4A 07 00 BD 49 07 00 BD FF 00 0B 00 41 07 00 02 07 01 98 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 0D FF 00 00 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  48     446    708    1218   Ljava/lang/Throwable;
        //  500    519    1174   1218   Ljava/lang/Throwable;
        //  24     558    1218   1593   Ljava/sql/SQLException;
        //  1032   1053   1053   1174   Ljava/lang/IllegalAccessException;
        //  612    633    633    708    Ljava/io/IOException;
        //  1688   1709   1709   1784   Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0522:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Map<Integer, Location> getAfkNumber$322438506(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           607036336
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_1        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          87
        //    16: ldc_w           1079018022
        //    19: iload           87
        //    21: ixor           
        //    22: istore          87
        //    24: new             Ljava/util/HashMap;
        //    27: astore_2       
        //    28: aload_2        
        //    29: invokespecial   java/util/HashMap.<init>:()V
        //    32: aload_2        
        //    33: astore          12
        //    35: ldc_w           245072213
        //    38: iload           87
        //    40: ixor           
        //    41: istore          87
        //    43: aload_0        
        //    44: astore          28
        //    46: aload           28
        //    48: ldc             1279769918
        //    50: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    53: astore          29
        //    55: aload           29
        //    57: astore          13
        //    59: ldc_w           1473795487
        //    62: iload           87
        //    64: ixor           
        //    65: istore          87
        //    67: aload           13
        //    69: astore          30
        //    71: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.jhtquzhkrevigrb:()[B
        //    74: iload           87
        //    76: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    79: astore          70
        //    81: aload           30
        //    83: aload           70
        //    85: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    90: astore          31
        //    92: aload           31
        //    94: astore          14
        //    96: ldc_w           2037226814
        //    99: iload           87
        //   101: ixor           
        //   102: istore          87
        //   104: aload           14
        //   106: astore          32
        //   108: aload           32
        //   110: invokeinterface java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        //   115: astore          33
        //   117: aload           33
        //   119: astore          15
        //   121: ldc_w           960402785
        //   124: iload           87
        //   126: ixor           
        //   127: istore          87
        //   129: aload           15
        //   131: astore          34
        //   133: aload           34
        //   135: invokeinterface java/sql/ResultSet.next:()Z
        //   140: istore          35
        //   142: iload           35
        //   144: ldc_w           1653046665
        //   147: iload           87
        //   149: ixor           
        //   150: if_icmpeq       1307
        //   153: ldc_w           540563387
        //   156: iload           87
        //   158: ixor           
        //   159: istore          87
        //   161: aload           15
        //   163: astore          36
        //   165: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.gccuvowazjycehv:()[B
        //   168: iload           87
        //   170: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   173: astore          71
        //   175: aload           36
        //   177: aload           71
        //   179: invokeinterface java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        //   184: istore          37
        //   186: iload           37
        //   188: istore          16
        //   190: ldc_w           66200449
        //   193: iload           87
        //   195: ixor           
        //   196: istore          87
        //   198: aload           15
        //   200: astore          38
        //   202: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.fzfqpbryrbycmod:()[B
        //   205: iload           87
        //   207: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   210: astore          72
        //   212: aload           38
        //   214: aload           72
        //   216: invokeinterface java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        //   221: dstore          39
        //   223: dload           39
        //   225: dstore          17
        //   227: ldc_w           2023808853
        //   230: iload           87
        //   232: ixor           
        //   233: istore          87
        //   235: aload           15
        //   237: astore          41
        //   239: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.mbwideocgsgrwxf:()[B
        //   242: iload           87
        //   244: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   247: astore          73
        //   249: aload           41
        //   251: aload           73
        //   253: invokeinterface java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        //   258: dstore          42
        //   260: dload           42
        //   262: dstore          19
        //   264: ldc_w           2000648665
        //   267: iload           87
        //   269: ixor           
        //   270: istore          87
        //   272: aload           15
        //   274: astore          44
        //   276: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rnepuybdeznkrig:()[B
        //   279: iload           87
        //   281: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   284: astore          74
        //   286: aload           44
        //   288: aload           74
        //   290: invokeinterface java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        //   295: dstore          45
        //   297: dload           45
        //   299: dstore          21
        //   301: ldc_w           293825518
        //   304: iload           87
        //   306: ixor           
        //   307: istore          87
        //   309: aload           15
        //   311: astore          47
        //   313: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.gmniqasvzhdhwar:()[B
        //   316: iload           87
        //   318: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   321: astore          75
        //   323: aload           47
        //   325: aload           75
        //   327: invokeinterface java/sql/ResultSet.getFloat:(Ljava/lang/String;)F
        //   332: fstore          48
        //   334: fload           48
        //   336: fstore          23
        //   338: ldc_w           1058356846
        //   341: iload           87
        //   343: ixor           
        //   344: istore          87
        //   346: aload           15
        //   348: astore          49
        //   350: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.vbzdzhoafrmurcp:()[B
        //   353: iload           87
        //   355: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   358: astore          76
        //   360: aload           49
        //   362: aload           76
        //   364: invokeinterface java/sql/ResultSet.getFloat:(Ljava/lang/String;)F
        //   369: fstore          50
        //   371: fload           50
        //   373: fstore          24
        //   375: ldc_w           1175042119
        //   378: iload           87
        //   380: ixor           
        //   381: istore          87
        //   383: aload           15
        //   385: astore          51
        //   387: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.kewbshjhwizuwsc:()[B
        //   390: iload           87
        //   392: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   395: astore          77
        //   397: aload           51
        //   399: aload           77
        //   401: invokeinterface java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   406: astore          52
        //   408: aload           52
        //   410: astore          25
        //   412: ldc_w           522371743
        //   415: iload           87
        //   417: ixor           
        //   418: istore          87
        //   420: aload           25
        //   422: astore          53
        //   424: aload           53
        //   426: invokestatic    org/bukkit/Bukkit.getWorld:(Ljava/lang/String;)Lorg/bukkit/World;
        //   429: astore          54
        //   431: aload           54
        //   433: astore          26
        //   435: ldc_w           565078316
        //   438: iload           87
        //   440: ixor           
        //   441: istore          87
        //   443: new             Lorg/bukkit/Location;
        //   446: astore          55
        //   448: aload           26
        //   450: astore_3       
        //   451: dload           17
        //   453: dstore          4
        //   455: dload           19
        //   457: dstore          6
        //   459: dload           21
        //   461: dstore          8
        //   463: fload           23
        //   465: fstore          10
        //   467: fload           24
        //   469: fstore          11
        //   471: aload           55
        //   473: aload_3        
        //   474: dload           4
        //   476: dload           6
        //   478: dload           8
        //   480: fload           10
        //   482: fload           11
        //   484: invokespecial   org/bukkit/Location.<init>:(Lorg/bukkit/World;DDDFF)V
        //   487: aload           55
        //   489: astore          27
        //   491: ldc_w           1782734918
        //   494: iload           87
        //   496: ixor           
        //   497: istore          87
        //   499: aload           12
        //   501: astore          56
        //   503: iload           16
        //   505: istore          78
        //   507: iload           78
        //   509: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   512: astore          79
        //   514: aload           27
        //   516: astore          82
        //   518: aload           56
        //   520: aload           79
        //   522: aload           82
        //   524: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   529: astore          57
        //   531: ldc_w           1397610776
        //   534: iload           87
        //   536: ixor           
        //   537: istore          87
        //   539: goto            654
        //   542: aload           13
        //   544: astore          68
        //   546: aload           68
        //   548: ifnull          804
        //   551: ldc_w           175903583
        //   554: iload           87
        //   556: ixor           
        //   557: istore          87
        //   559: aload           13
        //   561: astore          69
        //   563: aload           69
        //   565: invokeinterface java/sql/Connection.close:()V
        //   570: goto            1946
        //   573: astore          58
        //   575: aload           58
        //   577: astore          84
        //   579: aload           13
        //   581: astore          59
        //   583: aload           59
        //   585: ifnull          1903
        //   588: ldc_w           1020118786
        //   591: iload           87
        //   593: ixor           
        //   594: istore          87
        //   596: aload           13
        //   598: astore          60
        //   600: aload           60
        //   602: invokeinterface java/sql/Connection.close:()V
        //   607: ldc_w           832529901
        //   610: iload           87
        //   612: ixor           
        //   613: istore          87
        //   615: goto            1396
        //   618: astore          66
        //   620: aload           66
        //   622: astore          85
        //   624: aload           84
        //   626: astore          67
        //   628: aload           85
        //   630: astore          81
        //   632: aload           67
        //   634: aload           81
        //   636: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   639: ldc_w           2027218530
        //   642: iload           87
        //   644: ixor           
        //   645: istore          87
        //   647: aload           84
        //   649: astore          61
        //   651: aload           61
        //   653: athrow         
        //   654: iload           87
        //   656: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   659: lookupswitch {
        //          25139942: 700
        //          583065933: 654
        //          1299224683: 2247
        //          2081875695: 708
        //          default: 2247
        //        }
        //   700: ldc_w           1621690814
        //   703: iload           87
        //   705: ixor           
        //   706: istore          87
        //   708: iload           87
        //   710: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   713: ldc_w           246971612
        //   716: if_icmpeq       721
        //   719: aconst_null    
        //   720: athrow         
        //   721: new             Ljava/lang/RuntimeException;
        //   724: dup            
        //   725: invokespecial   java/lang/RuntimeException.<init>:()V
        //   728: athrow         
        //   729: iload           87
        //   731: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   734: lookupswitch {
        //          188403034: 782
        //          482195640: 760
        //          default: 771
        //        }
        //   760: ldc_w           679102561
        //   763: iload           87
        //   765: ixor           
        //   766: istore          87
        //   768: goto            792
        //   771: new             Ljava/io/IOException;
        //   774: dup            
        //   775: ldc_w           "Error in hash"
        //   778: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   781: athrow         
        //   782: iload           87
        //   784: ldc_w           1787471581
        //   787: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   790: istore          87
        //   792: pop            
        //   793: ldc_w           1231717119
        //   796: iload           87
        //   798: ixor           
        //   799: istore          87
        //   801: goto            129
        //   804: ldc_w           1069209359
        //   807: iload           87
        //   809: ixor           
        //   810: istore          87
        //   812: iload           87
        //   814: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   817: ldc_w           45250245
        //   820: if_icmpeq       826
        //   823: goto            837
        //   826: ldc_w           847960679
        //   829: iload           87
        //   831: ixor           
        //   832: istore          87
        //   834: goto            2049
        //   837: iload           87
        //   839: ldc_w           1309102819
        //   842: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   845: istore          87
        //   847: goto            2247
        //   850: iload           87
        //   852: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   855: lookupswitch {
        //          -1915640414: 1226
        //          -1810085781: 1156
        //          -1470037429: 1296
        //          -1215593277: 1145
        //          -972076456: 1064
        //          -881065159: 1167
        //          -856217368: 1272
        //          -814827727: 1259
        //          -573618366: 1075
        //          -567197862: 1191
        //          -91347318: 1180
        //          36165115: 1237
        //          173022203: 1213
        //          174607770: 1086
        //          242385065: 1248
        //          339471435: 1132
        //          368660882: 1121
        //          379825841: 1283
        //          845813697: 1110
        //          997239722: 1097
        //          1374010578: 1202
        //          1989507578: 1051
        //          default: 1040
        //        }
        //  1040: new             Ljava/lang/IllegalAccessException;
        //  1043: dup            
        //  1044: ldc_w           "Error in hash"
        //  1047: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1050: athrow         
        //  1051: iload           87
        //  1053: ldc_w           761701836
        //  1056: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1059: istore          87
        //  1061: goto            2255
        //  1064: ldc_w           2071323576
        //  1067: iload           87
        //  1069: ixor           
        //  1070: istore          87
        //  1072: goto            2255
        //  1075: ldc_w           940433947
        //  1078: iload           87
        //  1080: ixor           
        //  1081: istore          87
        //  1083: goto            2255
        //  1086: ldc_w           586744640
        //  1089: iload           87
        //  1091: ixor           
        //  1092: istore          87
        //  1094: goto            2255
        //  1097: iload           87
        //  1099: ldc_w           618274694
        //  1102: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1105: istore          87
        //  1107: goto            2255
        //  1110: ldc_w           1173964811
        //  1113: iload           87
        //  1115: ixor           
        //  1116: istore          87
        //  1118: goto            2255
        //  1121: ldc_w           554377409
        //  1124: iload           87
        //  1126: ixor           
        //  1127: istore          87
        //  1129: goto            2255
        //  1132: iload           87
        //  1134: ldc_w           20150138
        //  1137: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1140: istore          87
        //  1142: goto            2255
        //  1145: ldc_w           356874859
        //  1148: iload           87
        //  1150: ixor           
        //  1151: istore          87
        //  1153: goto            2255
        //  1156: ldc_w           288850942
        //  1159: iload           87
        //  1161: ixor           
        //  1162: istore          87
        //  1164: goto            2255
        //  1167: iload           87
        //  1169: ldc_w           1524337300
        //  1172: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1175: istore          87
        //  1177: goto            2255
        //  1180: ldc_w           1021693474
        //  1183: iload           87
        //  1185: ixor           
        //  1186: istore          87
        //  1188: goto            2255
        //  1191: ldc_w           947006744
        //  1194: iload           87
        //  1196: ixor           
        //  1197: istore          87
        //  1199: goto            2255
        //  1202: ldc_w           696827241
        //  1205: iload           87
        //  1207: ixor           
        //  1208: istore          87
        //  1210: goto            2255
        //  1213: iload           87
        //  1215: ldc_w           50203020
        //  1218: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1221: istore          87
        //  1223: goto            2255
        //  1226: ldc_w           839794247
        //  1229: iload           87
        //  1231: ixor           
        //  1232: istore          87
        //  1234: goto            2255
        //  1237: ldc_w           66121804
        //  1240: iload           87
        //  1242: ixor           
        //  1243: istore          87
        //  1245: goto            2255
        //  1248: ldc_w           1115314918
        //  1251: iload           87
        //  1253: ixor           
        //  1254: istore          87
        //  1256: goto            2255
        //  1259: iload           87
        //  1261: ldc_w           1515838485
        //  1264: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1267: istore          87
        //  1269: goto            2255
        //  1272: ldc_w           2049634286
        //  1275: iload           87
        //  1277: ixor           
        //  1278: istore          87
        //  1280: goto            2255
        //  1283: iload           87
        //  1285: ldc_w           1096843045
        //  1288: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1291: istore          87
        //  1293: goto            2255
        //  1296: ldc_w           381168314
        //  1299: iload           87
        //  1301: ixor           
        //  1302: istore          87
        //  1304: goto            2255
        //  1307: ldc_w           1334975832
        //  1310: iload           87
        //  1312: ixor           
        //  1313: istore          87
        //  1315: iload           87
        //  1317: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1320: ldc_w           123291265
        //  1323: if_icmpeq       1383
        //  1326: iload           87
        //  1328: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1331: lookupswitch {
        //          123291265: 1372
        //          677760857: 2247
        //          1434799831: 2247
        //          1771148994: 1326
        //          default: 2247
        //        }
        //  1372: ldc_w           124699350
        //  1375: iload           87
        //  1377: ixor           
        //  1378: istore          87
        //  1380: goto            2247
        //  1383: iload           87
        //  1385: ldc_w           1993557818
        //  1388: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1391: istore          87
        //  1393: goto            542
        //  1396: iload           87
        //  1398: ldc_w           30526171
        //  1401: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1404: istore          87
        //  1406: iload           87
        //  1408: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1411: ldc_w           152274910
        //  1414: if_icmpeq       1419
        //  1417: aconst_null    
        //  1418: athrow         
        //  1419: new             Ljava/lang/IllegalAccessException;
        //  1422: dup            
        //  1423: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1426: athrow         
        //  1427: iload           87
        //  1429: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1432: lookupswitch {
        //          -2048500303: 1482
        //          905903474: 1471
        //          default: 1460
        //        }
        //  1460: new             Ljava/lang/RuntimeException;
        //  1463: dup            
        //  1464: ldc_w           "Error in hash"
        //  1467: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1470: athrow         
        //  1471: ldc_w           1866224253
        //  1474: iload           87
        //  1476: ixor           
        //  1477: istore          87
        //  1479: goto            1492
        //  1482: iload           87
        //  1484: ldc_w           423577189
        //  1487: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1490: istore          87
        //  1492: pop            
        //  1493: iload           87
        //  1495: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1498: lookupswitch {
        //          7261003: 1540
        //          184815626: 2247
        //          507161178: 1493
        //          1245747212: 647
        //          default: 2247
        //        }
        //  1540: ldc_w           1221168812
        //  1543: iload           87
        //  1545: ixor           
        //  1546: istore          87
        //  1548: goto            647
        //  1551: iload           87
        //  1553: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1556: tableswitch {
        //          1863780742: 1576
        //          default: 1589
        //        }
        //  1576: iload           87
        //  1578: ldc_w           1869583749
        //  1581: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1584: istore          87
        //  1586: goto            618
        //  1589: new             Ljava/io/IOException;
        //  1592: dup            
        //  1593: ldc_w           "Error in hash"
        //  1596: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1599: athrow         
        //  1600: iload           87
        //  1602: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1605: lookupswitch {
        //          -1810085781: 1739
        //          -972076456: 1842
        //          -881065159: 1879
        //          -814827727: 1855
        //          -573618366: 1818
        //          -91347318: 1892
        //          36165115: 1772
        //          174607770: 1728
        //          242385065: 1783
        //          339471435: 1868
        //          368660882: 1807
        //          379825841: 1750
        //          845813697: 1794
        //          1989507578: 1761
        //          default: 1831
        //        }
        //  1728: ldc_w           192003625
        //  1731: iload           87
        //  1733: ixor           
        //  1734: istore          87
        //  1736: goto            573
        //  1739: ldc_w           952057495
        //  1742: iload           87
        //  1744: ixor           
        //  1745: istore          87
        //  1747: goto            573
        //  1750: ldc_w           1760084556
        //  1753: iload           87
        //  1755: ixor           
        //  1756: istore          87
        //  1758: goto            573
        //  1761: ldc_w           82712741
        //  1764: iload           87
        //  1766: ixor           
        //  1767: istore          87
        //  1769: goto            573
        //  1772: ldc_w           712527141
        //  1775: iload           87
        //  1777: ixor           
        //  1778: istore          87
        //  1780: goto            573
        //  1783: ldc_w           1811081103
        //  1786: iload           87
        //  1788: ixor           
        //  1789: istore          87
        //  1791: goto            573
        //  1794: iload           87
        //  1796: ldc_w           1819407714
        //  1799: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1802: istore          87
        //  1804: goto            573
        //  1807: ldc_w           142843304
        //  1810: iload           87
        //  1812: ixor           
        //  1813: istore          87
        //  1815: goto            573
        //  1818: iload           87
        //  1820: ldc_w           293953394
        //  1823: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1826: istore          87
        //  1828: goto            573
        //  1831: new             Ljava/io/IOException;
        //  1834: dup            
        //  1835: ldc_w           "Error in hash"
        //  1838: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1841: athrow         
        //  1842: iload           87
        //  1844: ldc_w           1392336593
        //  1847: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1850: istore          87
        //  1852: goto            573
        //  1855: iload           87
        //  1857: ldc_w           1943101820
        //  1860: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1863: istore          87
        //  1865: goto            573
        //  1868: ldc_w           683395603
        //  1871: iload           87
        //  1873: ixor           
        //  1874: istore          87
        //  1876: goto            573
        //  1879: iload           87
        //  1881: ldc_w           1934833661
        //  1884: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1887: istore          87
        //  1889: goto            573
        //  1892: ldc_w           359494475
        //  1895: iload           87
        //  1897: ixor           
        //  1898: istore          87
        //  1900: goto            573
        //  1903: ldc_w           1681684849
        //  1906: iload           87
        //  1908: ixor           
        //  1909: istore          87
        //  1911: iload           87
        //  1913: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1916: ldc_w           153206503
        //  1919: if_icmpeq       1935
        //  1922: iload           87
        //  1924: ldc_w           75197676
        //  1927: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1930: istore          87
        //  1932: goto            2247
        //  1935: ldc_w           1330302356
        //  1938: iload           87
        //  1940: ixor           
        //  1941: istore          87
        //  1943: goto            647
        //  1946: iload           87
        //  1948: ldc_w           1897836572
        //  1951: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1954: istore          87
        //  1956: iload           87
        //  1958: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1961: ldc_w           255779233
        //  1964: if_icmpeq       1969
        //  1967: aconst_null    
        //  1968: athrow         
        //  1969: new             Ljava/lang/RuntimeException;
        //  1972: dup            
        //  1973: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1976: athrow         
        //  1977: iload           87
        //  1979: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1982: lookupswitch {
        //          -39430245: 2030
        //          86254913: 2008
        //          default: 2019
        //        }
        //  2008: ldc_w           1581341556
        //  2011: iload           87
        //  2013: ixor           
        //  2014: istore          87
        //  2016: goto            2040
        //  2019: new             Ljava/lang/IllegalAccessException;
        //  2022: dup            
        //  2023: ldc_w           "Error in hash"
        //  2026: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  2029: athrow         
        //  2030: iload           87
        //  2032: ldc_w           22091055
        //  2035: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2038: istore          87
        //  2040: pop            
        //  2041: ldc_w           672396639
        //  2044: iload           87
        //  2046: ixor           
        //  2047: istore          87
        //  2049: iload           87
        //  2051: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2054: lookupswitch {
        //          142386347: 2096
        //          612718168: 2104
        //          1385568266: 2247
        //          1571034292: 2049
        //          default: 2247
        //        }
        //  2096: ldc_w           1680374810
        //  2099: iload           87
        //  2101: ixor           
        //  2102: istore          87
        //  2104: iload           87
        //  2106: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2109: ldc_w           42923286
        //  2112: if_icmpeq       2117
        //  2115: aconst_null    
        //  2116: athrow         
        //  2117: new             Ljava/lang/RuntimeException;
        //  2120: dup            
        //  2121: invokespecial   java/lang/RuntimeException.<init>:()V
        //  2124: athrow         
        //  2125: iload           87
        //  2127: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2130: lookupswitch {
        //          -1762478903: 2167
        //          -1126769542: 2180
        //          default: 2156
        //        }
        //  2156: new             Ljava/lang/IllegalAccessException;
        //  2159: dup            
        //  2160: ldc_w           "Error in hash"
        //  2163: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  2166: athrow         
        //  2167: iload           87
        //  2169: ldc_w           1033951619
        //  2172: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2175: istore          87
        //  2177: goto            2188
        //  2180: ldc_w           1491358869
        //  2183: iload           87
        //  2185: ixor           
        //  2186: istore          87
        //  2188: pop            
        //  2189: iload           87
        //  2191: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2194: lookupswitch {
        //          235223612: 2236
        //          252058032: 2189
        //          426770666: 2269
        //          1132080051: 2247
        //          default: 2247
        //        }
        //  2236: ldc_w           1167868836
        //  2239: iload           87
        //  2241: ixor           
        //  2242: istore          87
        //  2244: goto            2269
        //  2247: new             Ljava/lang/IllegalAccessException;
        //  2250: dup            
        //  2251: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  2254: athrow         
        //  2255: astore          62
        //  2257: aload           62
        //  2259: astore          83
        //  2261: ldc_w           693552717
        //  2264: iload           87
        //  2266: ixor           
        //  2267: istore          87
        //  2269: aload_0        
        //  2270: astore          63
        //  2272: aload           63
        //  2274: getfield        dev/daniboy/donutcore/database/SQLiteManager.afkLocationsCache:Ljava/util/Map;
        //  2277: astore          64
        //  2279: aload           12
        //  2281: astore          80
        //  2283: aload           64
        //  2285: aload           80
        //  2287: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //  2292: ldc_w           134106172
        //  2295: iload           87
        //  2297: ixor           
        //  2298: istore          87
        //  2300: aload           12
        //  2302: astore          65
        //  2304: aload           65
        //  2306: areturn        
        //    Signature:
        //  ()Ljava/util/Map<Ljava/lang/Integer;Lorg/bukkit/Location;>;
        //    StackMapTable: 00 60 FF 00 81 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 01 9C 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1E 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 1C FF 00 06 00 4F 07 00 02 01 07 00 3D 07 01 F8 03 03 03 02 02 07 00 3D 07 00 D5 07 00 DC 07 01 60 01 03 03 03 02 02 07 01 4D 07 01 F8 07 01 98 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 01 07 01 60 03 07 01 60 03 07 01 60 03 07 01 60 02 07 01 60 02 07 01 60 07 01 4D 07 01 4D 07 01 F8 07 01 98 07 00 3D 07 00 04 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 01 07 00 31 00 00 07 01 98 00 00 00 00 01 00 00 2D 07 0C 47 07 00 C2 5E 07 00 C2 4A 07 00 C2 4A 07 00 C2 49 07 00 C2 FF 00 0B 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 D5 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 15 0A FF 00 0C 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 BD 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 FF 00 0A 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 12 2D 0A FF 00 0C 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 16 47 07 00 BD 60 07 00 BD 4A 07 00 BD 4A 07 00 BD 49 07 00 BD 00 2E FF 00 0A 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 58 07 00 C0 4C 07 00 C0 FF 00 0A 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 7F 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 FF 00 0A 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 1F FF 00 0A 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 D5 07 00 D5 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 16 47 07 00 C2 5E 07 00 C2 4A 07 00 C2 4A 07 00 C2 49 07 00 C2 FF 00 08 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 D5 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 2E 07 0C 47 07 00 C2 5E 07 00 C2 4A 07 00 C2 4C 07 00 C2 47 07 00 C2 00 2E FF 00 0A 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 58 07 00 02 01 07 00 3D 00 00 00 00 00 00 00 00 00 07 00 3D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 0D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  67     542    1600   1946   Ljava/lang/Throwable;
        //  596    615    1551   1600   Ljava/lang/Throwable;
        //  43     654    850    1307   Ljava/sql/SQLException;
        //  1406   1427   1427   1551   Ljava/lang/IllegalAccessException;
        //  1956   1977   1977   2049   Ljava/lang/RuntimeException;
        //  708    729    729    804    Ljava/lang/RuntimeException;
        //  2104   2125   2125   2247   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0129:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setAfk$471806796(final Location p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           1452560802
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_3        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          64
        //    16: ldc_w           249752217
        //    19: iload           64
        //    21: ixor           
        //    22: istore          64
        //    24: aload_0        
        //    25: astore          4
        //    27: aload           4
        //    29: ldc             1279769918
        //    31: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    34: astore          10
        //    36: aload           10
        //    38: astore          7
        //    40: ldc_w           1677582778
        //    43: iload           64
        //    45: ixor           
        //    46: istore          64
        //    48: aload           7
        //    50: astore          11
        //    52: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pwpitevqocgjpbt:()[B
        //    55: iload           64
        //    57: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    60: astore          5
        //    62: aload           11
        //    64: aload           5
        //    66: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    71: astore          12
        //    73: aload           12
        //    75: astore          8
        //    77: ldc_w           837500394
        //    80: iload           64
        //    82: ixor           
        //    83: istore          64
        //    85: aload           8
        //    87: astore          13
        //    89: ldc_w           382655220
        //    92: iload           64
        //    94: ixor           
        //    95: i2b            
        //    96: istore          34
        //    98: iload_2        
        //    99: istore          6
        //   101: aload           13
        //   103: iload           34
        //   105: iload           6
        //   107: invokeinterface java/sql/PreparedStatement.setInt:(II)V
        //   112: ldc_w           144033934
        //   115: iload           64
        //   117: ixor           
        //   118: istore          64
        //   120: aload           8
        //   122: astore          14
        //   124: ldc_w           509284985
        //   127: iload           64
        //   129: ixor           
        //   130: i2b            
        //   131: istore          35
        //   133: aload_1        
        //   134: astore          44
        //   136: aload           44
        //   138: invokevirtual   org/bukkit/Location.getX:()D
        //   141: dstore          45
        //   143: aload           14
        //   145: iload           35
        //   147: dload           45
        //   149: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   154: ldc_w           1364606704
        //   157: iload           64
        //   159: ixor           
        //   160: istore          64
        //   162: aload           8
        //   164: astore          15
        //   166: ldc_w           1326263432
        //   169: iload           64
        //   171: ixor           
        //   172: i2b            
        //   173: istore          36
        //   175: aload_1        
        //   176: astore          47
        //   178: aload           47
        //   180: invokevirtual   org/bukkit/Location.getY:()D
        //   183: dstore          48
        //   185: aload           15
        //   187: iload           36
        //   189: dload           48
        //   191: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   196: ldc_w           779397637
        //   199: iload           64
        //   201: ixor           
        //   202: istore          64
        //   204: aload           8
        //   206: astore          16
        //   208: ldc_w           1635354250
        //   211: iload           64
        //   213: ixor           
        //   214: i2b            
        //   215: istore          37
        //   217: aload_1        
        //   218: astore          50
        //   220: aload           50
        //   222: invokevirtual   org/bukkit/Location.getZ:()D
        //   225: dstore          51
        //   227: aload           16
        //   229: iload           37
        //   231: dload           51
        //   233: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   238: ldc_w           837780524
        //   241: iload           64
        //   243: ixor           
        //   244: istore          64
        //   246: aload           8
        //   248: astore          17
        //   250: ldc_w           1352008359
        //   253: iload           64
        //   255: ixor           
        //   256: i2b            
        //   257: istore          38
        //   259: aload_1        
        //   260: astore          53
        //   262: aload           53
        //   264: invokevirtual   org/bukkit/Location.getYaw:()F
        //   267: fstore          54
        //   269: aload           17
        //   271: iload           38
        //   273: fload           54
        //   275: invokeinterface java/sql/PreparedStatement.setFloat:(IF)V
        //   280: ldc_w           375309066
        //   283: iload           64
        //   285: ixor           
        //   286: istore          64
        //   288: aload           8
        //   290: astore          18
        //   292: ldc_w           1187561902
        //   295: iload           64
        //   297: ixor           
        //   298: i2b            
        //   299: istore          39
        //   301: aload_1        
        //   302: astore          55
        //   304: aload           55
        //   306: invokevirtual   org/bukkit/Location.getPitch:()F
        //   309: fstore          56
        //   311: aload           18
        //   313: iload           39
        //   315: fload           56
        //   317: invokeinterface java/sql/PreparedStatement.setFloat:(IF)V
        //   322: ldc_w           899158913
        //   325: iload           64
        //   327: ixor           
        //   328: istore          64
        //   330: aload           8
        //   332: astore          19
        //   334: ldc_w           1934676526
        //   337: iload           64
        //   339: ixor           
        //   340: i2b            
        //   341: istore          40
        //   343: aload_1        
        //   344: astore          57
        //   346: aload           57
        //   348: invokevirtual   org/bukkit/Location.getWorld:()Lorg/bukkit/World;
        //   351: astore          58
        //   353: aload           58
        //   355: invokeinterface org/bukkit/World.getName:()Ljava/lang/String;
        //   360: astore          59
        //   362: aload           19
        //   364: iload           40
        //   366: aload           59
        //   368: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   373: ldc_w           619454337
        //   376: iload           64
        //   378: ixor           
        //   379: istore          64
        //   381: aload           8
        //   383: astore          20
        //   385: aload           20
        //   387: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   392: istore          21
        //   394: ldc_w           1039092589
        //   397: iload           64
        //   399: ixor           
        //   400: istore          64
        //   402: aload_0        
        //   403: astore          22
        //   405: aload           22
        //   407: getfield        dev/daniboy/donutcore/database/SQLiteManager.afkLocationsCache:Ljava/util/Map;
        //   410: astore          23
        //   412: iload_2        
        //   413: istore          41
        //   415: iload           41
        //   417: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   420: astore          42
        //   422: aload_1        
        //   423: astore          60
        //   425: aload           23
        //   427: aload           42
        //   429: aload           60
        //   431: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   436: astore          24
        //   438: ldc_w           781457250
        //   441: iload           64
        //   443: ixor           
        //   444: istore          64
        //   446: aload           7
        //   448: astore          25
        //   450: aload           25
        //   452: ifnull          558
        //   455: ldc_w           392180643
        //   458: iload           64
        //   460: ixor           
        //   461: istore          64
        //   463: aload           7
        //   465: astore          26
        //   467: aload           26
        //   469: invokeinterface java/sql/Connection.close:()V
        //   474: goto            879
        //   477: astore          28
        //   479: aload           28
        //   481: astore          62
        //   483: aload           7
        //   485: astore          29
        //   487: aload           29
        //   489: ifnull          1680
        //   492: ldc_w           277353550
        //   495: iload           64
        //   497: ixor           
        //   498: istore          64
        //   500: aload           7
        //   502: astore          30
        //   504: aload           30
        //   506: invokeinterface java/sql/Connection.close:()V
        //   511: ldc_w           1064052765
        //   514: iload           64
        //   516: ixor           
        //   517: istore          64
        //   519: goto            1574
        //   522: astore          32
        //   524: aload           32
        //   526: astore          9
        //   528: aload           62
        //   530: astore          33
        //   532: aload           9
        //   534: astore          43
        //   536: aload           33
        //   538: aload           43
        //   540: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   543: ldc_w           89162607
        //   546: iload           64
        //   548: ixor           
        //   549: istore          64
        //   551: aload           62
        //   553: astore          31
        //   555: aload           31
        //   557: athrow         
        //   558: iload           64
        //   560: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   563: lookupswitch {
        //          88272628: 604
        //          504991415: 1709
        //          908040920: 558
        //          985681625: 612
        //          default: 1709
        //        }
        //   604: ldc_w           934554296
        //   607: iload           64
        //   609: ixor           
        //   610: istore          64
        //   612: iload           64
        //   614: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   617: ldc_w           263211519
        //   620: if_icmpeq       626
        //   623: goto            637
        //   626: ldc_w           641207894
        //   629: iload           64
        //   631: ixor           
        //   632: istore          64
        //   634: goto            1028
        //   637: iload           64
        //   639: ldc_w           955110397
        //   642: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   645: istore          64
        //   647: goto            1709
        //   650: iload           64
        //   652: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   655: lookupswitch {
        //          -2068835054: 853
        //          -1702457013: 818
        //          -1233725528: 829
        //          -1108972222: 768
        //          -220687400: 792
        //          197932147: 805
        //          910560578: 866
        //          959396089: 840
        //          1385969195: 744
        //          2020172890: 755
        //          default: 781
        //        }
        //   744: ldc_w           1349636207
        //   747: iload           64
        //   749: ixor           
        //   750: istore          64
        //   752: goto            477
        //   755: iload           64
        //   757: ldc_w           1966045729
        //   760: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   763: istore          64
        //   765: goto            477
        //   768: iload           64
        //   770: ldc_w           1839110914
        //   773: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   776: istore          64
        //   778: goto            477
        //   781: new             Ljava/lang/IllegalAccessException;
        //   784: dup            
        //   785: ldc_w           "Error in hash"
        //   788: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   791: athrow         
        //   792: iload           64
        //   794: ldc_w           611927249
        //   797: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   800: istore          64
        //   802: goto            477
        //   805: iload           64
        //   807: ldc_w           1532743716
        //   810: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   813: istore          64
        //   815: goto            477
        //   818: ldc_w           1232241795
        //   821: iload           64
        //   823: ixor           
        //   824: istore          64
        //   826: goto            477
        //   829: ldc_w           753699935
        //   832: iload           64
        //   834: ixor           
        //   835: istore          64
        //   837: goto            477
        //   840: iload           64
        //   842: ldc_w           487043509
        //   845: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   848: istore          64
        //   850: goto            477
        //   853: iload           64
        //   855: ldc_w           1790202888
        //   858: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   861: istore          64
        //   863: goto            477
        //   866: iload           64
        //   868: ldc_w           2095748866
        //   871: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   874: istore          64
        //   876: goto            477
        //   879: ldc_w           2088099839
        //   882: iload           64
        //   884: ixor           
        //   885: istore          64
        //   887: iload           64
        //   889: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   892: ldc_w           212335556
        //   895: if_icmpeq       900
        //   898: aconst_null    
        //   899: athrow         
        //   900: new             Ljava/lang/RuntimeException;
        //   903: dup            
        //   904: invokespecial   java/lang/RuntimeException.<init>:()V
        //   907: athrow         
        //   908: iload           64
        //   910: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   913: lookupswitch {
        //          -1701678672: 951
        //          2123624409: 962
        //          default: 940
        //        }
        //   940: new             Ljava/lang/IllegalAccessException;
        //   943: dup            
        //   944: ldc_w           "Error in hash"
        //   947: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   950: athrow         
        //   951: ldc_w           2113959710
        //   954: iload           64
        //   956: ixor           
        //   957: istore          64
        //   959: goto            972
        //   962: iload           64
        //   964: ldc_w           1115702483
        //   967: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   970: istore          64
        //   972: pop            
        //   973: iload           64
        //   975: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   978: lookupswitch {
        //          63906799: 1020
        //          577342577: 1028
        //          1027293103: 1709
        //          1431300180: 973
        //          default: 1709
        //        }
        //  1020: ldc_w           941198433
        //  1023: iload           64
        //  1025: ixor           
        //  1026: istore          64
        //  1028: iload           64
        //  1030: ldc_w           928621695
        //  1033: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1036: istore          64
        //  1038: iload           64
        //  1040: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1043: ldc_w           235103050
        //  1046: if_icmpeq       1051
        //  1049: aconst_null    
        //  1050: athrow         
        //  1051: new             Ljava/lang/RuntimeException;
        //  1054: dup            
        //  1055: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1058: athrow         
        //  1059: iload           64
        //  1061: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1064: lookupswitch {
        //          -1250118766: 1103
        //          277907891: 1116
        //          default: 1092
        //        }
        //  1092: new             Ljava/lang/IllegalAccessException;
        //  1095: dup            
        //  1096: ldc_w           "Error in hash"
        //  1099: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1102: athrow         
        //  1103: iload           64
        //  1105: ldc_w           326631115
        //  1108: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1111: istore          64
        //  1113: goto            1124
        //  1116: ldc_w           667580815
        //  1119: iload           64
        //  1121: ixor           
        //  1122: istore          64
        //  1124: pop            
        //  1125: ldc_w           1038631756
        //  1128: iload           64
        //  1130: ixor           
        //  1131: istore          64
        //  1133: goto            1526
        //  1136: iload           64
        //  1138: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1141: lookupswitch {
        //          -2068835054: 1355
        //          -1702457013: 1307
        //          -1656942558: 1471
        //          -1372366904: 1493
        //          -1233725528: 1504
        //          -1108972222: 1296
        //          -828161070: 1390
        //          -787303087: 1482
        //          -467183446: 1460
        //          -220687400: 1401
        //          197932147: 1436
        //          641502522: 1423
        //          650130730: 1318
        //          910560578: 1447
        //          959396089: 1368
        //          1385969195: 1344
        //          1431443233: 1379
        //          2020172890: 1331
        //          default: 1412
        //        }
        //  1296: ldc_w           854265977
        //  1299: iload           64
        //  1301: ixor           
        //  1302: istore          64
        //  1304: goto            1512
        //  1307: ldc_w           369561592
        //  1310: iload           64
        //  1312: ixor           
        //  1313: istore          64
        //  1315: goto            1512
        //  1318: iload           64
        //  1320: ldc_w           563075956
        //  1323: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1326: istore          64
        //  1328: goto            1512
        //  1331: iload           64
        //  1333: ldc_w           710603098
        //  1336: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1339: istore          64
        //  1341: goto            1512
        //  1344: ldc_w           251943700
        //  1347: iload           64
        //  1349: ixor           
        //  1350: istore          64
        //  1352: goto            1512
        //  1355: iload           64
        //  1357: ldc_w           901898099
        //  1360: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1363: istore          64
        //  1365: goto            1512
        //  1368: ldc_w           1114782414
        //  1371: iload           64
        //  1373: ixor           
        //  1374: istore          64
        //  1376: goto            1512
        //  1379: ldc_w           1342021429
        //  1382: iload           64
        //  1384: ixor           
        //  1385: istore          64
        //  1387: goto            1512
        //  1390: ldc_w           1015264683
        //  1393: iload           64
        //  1395: ixor           
        //  1396: istore          64
        //  1398: goto            1512
        //  1401: ldc_w           2064437162
        //  1404: iload           64
        //  1406: ixor           
        //  1407: istore          64
        //  1409: goto            1512
        //  1412: new             Ljava/lang/IllegalAccessException;
        //  1415: dup            
        //  1416: ldc_w           "Error in hash"
        //  1419: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1422: athrow         
        //  1423: iload           64
        //  1425: ldc_w           563104886
        //  1428: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1431: istore          64
        //  1433: goto            1512
        //  1436: ldc_w           70146911
        //  1439: iload           64
        //  1441: ixor           
        //  1442: istore          64
        //  1444: goto            1512
        //  1447: iload           64
        //  1449: ldc_w           597630073
        //  1452: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1455: istore          64
        //  1457: goto            1512
        //  1460: ldc_w           970143428
        //  1463: iload           64
        //  1465: ixor           
        //  1466: istore          64
        //  1468: goto            1512
        //  1471: ldc_w           921731029
        //  1474: iload           64
        //  1476: ixor           
        //  1477: istore          64
        //  1479: goto            1512
        //  1482: ldc_w           1601538939
        //  1485: iload           64
        //  1487: ixor           
        //  1488: istore          64
        //  1490: goto            1512
        //  1493: ldc_w           1888597800
        //  1496: iload           64
        //  1498: ixor           
        //  1499: istore          64
        //  1501: goto            1512
        //  1504: ldc_w           1939408676
        //  1507: iload           64
        //  1509: ixor           
        //  1510: istore          64
        //  1512: astore          27
        //  1514: aload           27
        //  1516: astore          61
        //  1518: ldc_w           493352484
        //  1521: iload           64
        //  1523: ixor           
        //  1524: istore          64
        //  1526: return         
        //  1527: iload           64
        //  1529: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1532: tableswitch {
        //          -1432080830: 1563
        //          default: 1552
        //        }
        //  1552: new             Ljava/lang/IllegalAccessException;
        //  1555: dup            
        //  1556: ldc_w           "Error in hash"
        //  1559: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1562: athrow         
        //  1563: ldc_w           1937648286
        //  1566: iload           64
        //  1568: ixor           
        //  1569: istore          64
        //  1571: goto            522
        //  1574: iload           64
        //  1576: ldc_w           140478492
        //  1579: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1582: istore          64
        //  1584: iload           64
        //  1586: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1589: ldc_w           156908034
        //  1592: if_icmpeq       1597
        //  1595: aconst_null    
        //  1596: athrow         
        //  1597: new             Ljava/lang/RuntimeException;
        //  1600: dup            
        //  1601: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1604: athrow         
        //  1605: iload           64
        //  1607: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1610: lookupswitch {
        //          -321972440: 1636
        //          2023932042: 1649
        //          default: 1669
        //        }
        //  1636: iload           64
        //  1638: ldc_w           1577568341
        //  1641: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1644: istore          64
        //  1646: goto            1657
        //  1649: ldc_w           210399905
        //  1652: iload           64
        //  1654: ixor           
        //  1655: istore          64
        //  1657: pop            
        //  1658: ldc_w           521847205
        //  1661: iload           64
        //  1663: ixor           
        //  1664: istore          64
        //  1666: goto            551
        //  1669: new             Ljava/lang/IllegalAccessException;
        //  1672: dup            
        //  1673: ldc_w           "Error in hash"
        //  1676: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1679: athrow         
        //  1680: iload           64
        //  1682: ldc_w           827735381
        //  1685: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1688: istore          64
        //  1690: iload           64
        //  1692: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1695: ldc_w           103914058
        //  1698: if_icmpeq       1717
        //  1701: ldc_w           1089078045
        //  1704: iload           64
        //  1706: ixor           
        //  1707: istore          64
        //  1709: new             Ljava/io/IOException;
        //  1712: dup            
        //  1713: invokespecial   java/io/IOException.<init>:()V
        //  1716: athrow         
        //  1717: ldc_w           1475379434
        //  1720: iload           64
        //  1722: ixor           
        //  1723: istore          64
        //  1725: goto            551
        //    StackMapTable: 00 47 FF 01 DD 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C FF 00 06 00 3E 07 00 02 07 01 98 01 01 07 00 02 07 01 4D 01 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 D5 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01 01 07 00 31 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 07 01 98 00 00 00 01 00 00 2D 07 0D 0A FF 00 0C 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 5D 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 FF 00 0C 00 3E 07 00 02 07 01 98 01 01 07 00 02 07 01 4D 01 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 D5 07 00 D5 00 00 00 00 00 00 00 01 01 01 01 01 01 01 01 07 00 31 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 07 01 98 00 00 00 01 00 00 14 47 07 00 C2 5F 07 00 C2 4A 07 00 C2 4A 07 00 C2 49 07 00 C2 00 2E FF 00 07 00 3E 07 00 02 07 01 98 01 01 07 00 02 07 01 4D 01 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 D5 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01 01 07 00 31 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 07 01 98 00 00 00 01 00 00 16 47 07 00 C2 60 07 00 C2 4A 07 00 C2 4C 07 00 C2 47 07 00 C2 FF 00 0B 00 41 07 00 02 07 01 98 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 9F 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 47 07 00 97 0D FF 00 00 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 58 07 00 C0 4A 07 00 C0 FF 00 0A 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 16 47 07 00 C2 5E 07 00 C2 4C 07 00 C2 47 07 00 C2 4B 07 00 C2 FF 00 0A 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 FF 00 1C 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 41 07 00 02 07 01 98 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  48     446    650    1709   Ljava/lang/Throwable;
        //  500    519    1527   1574   Ljava/lang/Throwable;
        //  24     558    1136   1526   Ljava/sql/SQLException;
        //  1038   1059   1059   1136   Ljava/lang/RuntimeException;
        //  1584   1605   1605   1680   Ljava/lang/RuntimeException;
        //  887    908    908    1028   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 594 out of bounds for length 594
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at w5.a.o(SourceFile:31)
        //     at w5.a.j(SourceFile:218)
        //     at a6.j.j(SourceFile:23)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setMessageToggle$521809991(final UUID p0, final boolean p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           405378768
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_3        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          41
        //    16: ldc_w           1682371543
        //    19: iload           41
        //    21: ixor           
        //    22: istore          41
        //    24: aload_0        
        //    25: astore          4
        //    27: aload           4
        //    29: ldc             1279769918
        //    31: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    34: astore          10
        //    36: aload           10
        //    38: astore          7
        //    40: ldc_w           643894199
        //    43: iload           41
        //    45: ixor           
        //    46: istore          41
        //    48: aload           7
        //    50: astore          11
        //    52: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.emlejmcrisumplq:()[B
        //    55: iload           41
        //    57: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    60: astore          5
        //    62: aload           11
        //    64: aload           5
        //    66: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    71: astore          12
        //    73: aload           12
        //    75: astore          8
        //    77: ldc_w           239879266
        //    80: iload           41
        //    82: ixor           
        //    83: istore          41
        //    85: aload           8
        //    87: astore          13
        //    89: ldc_w           30414976
        //    92: iload           41
        //    94: ixor           
        //    95: i2b            
        //    96: istore          30
        //    98: aload_1        
        //    99: astore          6
        //   101: aload           6
        //   103: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   106: astore          34
        //   108: aload           13
        //   110: iload           30
        //   112: aload           34
        //   114: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   119: ldc_w           702980076
        //   122: iload           41
        //   124: ixor           
        //   125: istore          41
        //   127: aload           8
        //   129: astore          14
        //   131: ldc_w           674662255
        //   134: iload           41
        //   136: ixor           
        //   137: i2b            
        //   138: istore          31
        //   140: iload_2        
        //   141: istore          35
        //   143: aload           14
        //   145: iload           31
        //   147: iload           35
        //   149: invokeinterface java/sql/PreparedStatement.setBoolean:(IZ)V
        //   154: ldc_w           1514694473
        //   157: iload           41
        //   159: ixor           
        //   160: istore          41
        //   162: aload           8
        //   164: astore          15
        //   166: aload           15
        //   168: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   173: istore          16
        //   175: ldc_w           556135915
        //   178: iload           41
        //   180: ixor           
        //   181: istore          41
        //   183: aload           7
        //   185: astore          17
        //   187: aload           17
        //   189: ifnull          871
        //   192: ldc_w           1702223316
        //   195: iload           41
        //   197: ixor           
        //   198: istore          41
        //   200: aload           7
        //   202: astore          18
        //   204: aload           18
        //   206: invokeinterface java/sql/Connection.close:()V
        //   211: goto            712
        //   214: astore          24
        //   216: aload           24
        //   218: astore          39
        //   220: aload           7
        //   222: astore          25
        //   224: aload           25
        //   226: ifnull          664
        //   229: ldc_w           805029803
        //   232: iload           41
        //   234: ixor           
        //   235: istore          41
        //   237: aload           7
        //   239: astore          26
        //   241: aload           26
        //   243: invokeinterface java/sql/Connection.close:()V
        //   248: ldc_w           1980268973
        //   251: iload           41
        //   253: ixor           
        //   254: istore          41
        //   256: goto            559
        //   259: astore          27
        //   261: aload           27
        //   263: astore          9
        //   265: aload           39
        //   267: astore          28
        //   269: aload           9
        //   271: astore          33
        //   273: aload           28
        //   275: aload           33
        //   277: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   280: ldc_w           1164178029
        //   283: iload           41
        //   285: ixor           
        //   286: istore          41
        //   288: aload           39
        //   290: astore          29
        //   292: aload           29
        //   294: athrow         
        //   295: iload           41
        //   297: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   300: lookupswitch {
        //          -2051906616: 419
        //          -1812528861: 537
        //          -1697075590: 430
        //          -1317650215: 526
        //          -93561199: 502
        //          55683968: 441
        //          243319816: 478
        //          676215018: 515
        //          1102330729: 489
        //          1244156922: 465
        //          1340783265: 452
        //          2095245080: 408
        //          default: 548
        //        }
        //   408: ldc_w           1858334478
        //   411: iload           41
        //   413: ixor           
        //   414: istore          41
        //   416: goto            1103
        //   419: ldc_w           1911160724
        //   422: iload           41
        //   424: ixor           
        //   425: istore          41
        //   427: goto            1103
        //   430: ldc_w           839165474
        //   433: iload           41
        //   435: ixor           
        //   436: istore          41
        //   438: goto            1103
        //   441: ldc_w           1630897821
        //   444: iload           41
        //   446: ixor           
        //   447: istore          41
        //   449: goto            1103
        //   452: iload           41
        //   454: ldc_w           1218634937
        //   457: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   460: istore          41
        //   462: goto            1103
        //   465: iload           41
        //   467: ldc_w           672840082
        //   470: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   473: istore          41
        //   475: goto            1103
        //   478: ldc_w           1620028268
        //   481: iload           41
        //   483: ixor           
        //   484: istore          41
        //   486: goto            1103
        //   489: iload           41
        //   491: ldc_w           1231631488
        //   494: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   497: istore          41
        //   499: goto            1103
        //   502: iload           41
        //   504: ldc_w           1578252351
        //   507: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   510: istore          41
        //   512: goto            1103
        //   515: ldc_w           609645808
        //   518: iload           41
        //   520: ixor           
        //   521: istore          41
        //   523: goto            1103
        //   526: ldc_w           1467055094
        //   529: iload           41
        //   531: ixor           
        //   532: istore          41
        //   534: goto            1103
        //   537: ldc_w           320951241
        //   540: iload           41
        //   542: ixor           
        //   543: istore          41
        //   545: goto            1103
        //   548: new             Ljava/lang/IllegalAccessException;
        //   551: dup            
        //   552: ldc_w           "Error in hash"
        //   555: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   558: athrow         
        //   559: ldc_w           2120641602
        //   562: iload           41
        //   564: ixor           
        //   565: istore          41
        //   567: iload           41
        //   569: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   572: ldc_w           181707061
        //   575: if_icmpeq       580
        //   578: aconst_null    
        //   579: athrow         
        //   580: new             Ljava/lang/IllegalAccessException;
        //   583: dup            
        //   584: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //   587: athrow         
        //   588: iload           41
        //   590: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   593: lookupswitch {
        //          -1537423175: 642
        //          -1189400087: 631
        //          default: 620
        //        }
        //   620: new             Ljava/io/IOException;
        //   623: dup            
        //   624: ldc_w           "Error in hash"
        //   627: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   630: athrow         
        //   631: ldc_w           490880296
        //   634: iload           41
        //   636: ixor           
        //   637: istore          41
        //   639: goto            650
        //   642: ldc_w           518701570
        //   645: iload           41
        //   647: ixor           
        //   648: istore          41
        //   650: pop            
        //   651: iload           41
        //   653: ldc_w           1869126664
        //   656: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   659: istore          41
        //   661: goto            288
        //   664: iload           41
        //   666: ldc_w           967642067
        //   669: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   672: istore          41
        //   674: iload           41
        //   676: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   679: ldc_w           262468546
        //   682: if_icmpeq       688
        //   685: goto            701
        //   688: iload           41
        //   690: ldc_w           1813151927
        //   693: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   696: istore          41
        //   698: goto            288
        //   701: ldc_w           218591505
        //   704: iload           41
        //   706: ixor           
        //   707: istore          41
        //   709: goto            1190
        //   712: iload           41
        //   714: ldc_w           1820234394
        //   717: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   720: istore          41
        //   722: iload           41
        //   724: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   727: ldc_w           251393289
        //   730: if_icmpeq       735
        //   733: aconst_null    
        //   734: athrow         
        //   735: new             Ljava/io/IOException;
        //   738: dup            
        //   739: invokespecial   java/io/IOException.<init>:()V
        //   742: athrow         
        //   743: iload           41
        //   745: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   748: lookupswitch {
        //          -1048398863: 800
        //          -763177974: 787
        //          default: 776
        //        }
        //   776: new             Ljava/lang/IllegalAccessException;
        //   779: dup            
        //   780: ldc_w           "Error in hash"
        //   783: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   786: athrow         
        //   787: iload           41
        //   789: ldc_w           1308685204
        //   792: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   795: istore          41
        //   797: goto            810
        //   800: iload           41
        //   802: ldc_w           744554347
        //   805: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   808: istore          41
        //   810: pop            
        //   811: iload           41
        //   813: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   816: lookupswitch {
        //          37444417: 1190
        //          123491272: 860
        //          895661139: 811
        //          1234355867: 961
        //          default: 1190
        //        }
        //   860: ldc_w           1060992331
        //   863: iload           41
        //   865: ixor           
        //   866: istore          41
        //   868: goto            961
        //   871: iload           41
        //   873: ldc_w           224408593
        //   876: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   879: istore          41
        //   881: iload           41
        //   883: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   886: ldc_w           110284709
        //   889: if_icmpeq       951
        //   892: iload           41
        //   894: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   897: lookupswitch {
        //          110284709: 940
        //          416583947: 1190
        //          421645670: 892
        //          1271915748: 1190
        //          default: 1190
        //        }
        //   940: ldc_w           2049382245
        //   943: iload           41
        //   945: ixor           
        //   946: istore          41
        //   948: goto            1190
        //   951: iload           41
        //   953: ldc_w           1968635264
        //   956: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   959: istore          41
        //   961: iload           41
        //   963: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   966: lookupswitch {
        //          69530011: 1008
        //          461553625: 1016
        //          1492876062: 961
        //          1582478924: 1190
        //          default: 1190
        //        }
        //  1008: ldc_w           1922476055
        //  1011: iload           41
        //  1013: ixor           
        //  1014: istore          41
        //  1016: iload           41
        //  1018: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1021: ldc_w           240609462
        //  1024: if_icmpeq       1029
        //  1027: aconst_null    
        //  1028: athrow         
        //  1029: new             Ljava/lang/IllegalAccessException;
        //  1032: dup            
        //  1033: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1036: athrow         
        //  1037: iload           41
        //  1039: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1042: lookupswitch {
        //          -911309814: 1079
        //          -807689654: 1068
        //          default: 1179
        //        }
        //  1068: ldc_w           1939621543
        //  1071: iload           41
        //  1073: ixor           
        //  1074: istore          41
        //  1076: goto            1089
        //  1079: iload           41
        //  1081: ldc_w           1934811759
        //  1084: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1087: istore          41
        //  1089: pop            
        //  1090: iload           41
        //  1092: ldc_w           1409757739
        //  1095: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1098: istore          41
        //  1100: goto            1134
        //  1103: astore          22
        //  1105: aload           22
        //  1107: astore          38
        //  1109: ldc_w           1576702256
        //  1112: iload           41
        //  1114: ixor           
        //  1115: istore          41
        //  1117: aload           38
        //  1119: astore          23
        //  1121: aload           23
        //  1123: invokevirtual   java/sql/SQLException.printStackTrace:()V
        //  1126: ldc_w           1120215576
        //  1129: iload           41
        //  1131: ixor           
        //  1132: istore          41
        //  1134: aload_0        
        //  1135: astore          19
        //  1137: aload           19
        //  1139: getfield        dev/daniboy/donutcore/database/SQLiteManager.messageToggleCache:Ljava/util/Map;
        //  1142: astore          20
        //  1144: aload_1        
        //  1145: astore          32
        //  1147: iload_2        
        //  1148: istore          36
        //  1150: iload           36
        //  1152: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1155: astore          37
        //  1157: aload           20
        //  1159: aload           32
        //  1161: aload           37
        //  1163: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1168: astore          21
        //  1170: ldc_w           1928368589
        //  1173: iload           41
        //  1175: ixor           
        //  1176: istore          41
        //  1178: return         
        //  1179: new             Ljava/lang/RuntimeException;
        //  1182: dup            
        //  1183: ldc_w           "Error in hash"
        //  1186: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1189: athrow         
        //  1190: new             Ljava/lang/IllegalAccessException;
        //  1193: dup            
        //  1194: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1197: athrow         
        //  1198: iload           41
        //  1200: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1203: lookupswitch {
        //          -1812528861: 1244
        //          243319816: 1277
        //          1102330729: 1266
        //          2095245080: 1290
        //          default: 1255
        //        }
        //  1244: ldc_w           1657318493
        //  1247: iload           41
        //  1249: ixor           
        //  1250: istore          41
        //  1252: goto            214
        //  1255: new             Ljava/io/IOException;
        //  1258: dup            
        //  1259: ldc_w           "Error in hash"
        //  1262: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1265: athrow         
        //  1266: ldc_w           947964692
        //  1269: iload           41
        //  1271: ixor           
        //  1272: istore          41
        //  1274: goto            214
        //  1277: iload           41
        //  1279: ldc_w           291919096
        //  1282: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1285: istore          41
        //  1287: goto            214
        //  1290: iload           41
        //  1292: ldc_w           522850458
        //  1295: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1298: istore          41
        //  1300: goto            214
        //  1303: iload           41
        //  1305: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1308: tableswitch {
        //          -187122398: 1328
        //          default: 1339
        //        }
        //  1328: ldc_w           1059569314
        //  1331: iload           41
        //  1333: ixor           
        //  1334: istore          41
        //  1336: goto            259
        //  1339: new             Ljava/lang/RuntimeException;
        //  1342: dup            
        //  1343: ldc_w           "Error in hash"
        //  1346: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1349: athrow         
        //    StackMapTable: 00 3D FF 00 D6 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C FF 00 06 00 2A 07 00 02 07 03 48 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 70 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 FF 00 0A 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 14 47 07 00 BD 5F 07 00 BD 4A 07 00 BD 4A 07 00 BD 47 07 00 BD FF 00 0D 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 17 0C FF 00 0A 00 2A 07 00 02 07 03 48 01 01 07 00 02 07 01 4D 07 03 48 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 01 01 00 00 07 01 4D 01 00 00 00 00 00 01 00 00 16 47 07 00 C4 60 07 00 C4 4A 07 00 C4 4C 07 00 C4 49 07 00 C4 00 30 FF 00 0A 00 2A 07 00 02 07 03 48 01 01 07 00 02 07 01 4D 07 03 48 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 01 00 00 07 01 4D 01 00 00 00 00 00 01 00 00 14 2F 0A 09 2E 07 0C 47 07 00 BD 5E 07 00 BD 4A 07 00 BD 49 07 00 BD FF 00 0D 00 2A 07 00 02 07 03 48 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 1E FF 00 2C 00 2A 07 00 02 07 03 48 01 01 07 00 02 07 01 4D 07 03 48 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 01 00 00 07 01 4D 01 00 00 00 00 00 01 00 01 07 00 BD FF 00 0A 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 47 07 00 C0 6D 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 FF 00 0C 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 58 07 00 C0 4A 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  48     183    1198   1350   Ljava/lang/Throwable;
        //  237    256    1303   1350   Ljava/lang/Throwable;
        //  24     295    295    559    Ljava/sql/SQLException;
        //  722    743    743    871    Ljava/io/IOException;
        //  567    588    588    664    Ljava/lang/IllegalAccessException;
        //  1016   1037   1037   1103   Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 444 out of bounds for length 444
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at w5.a.o(SourceFile:31)
        //     at w5.a.j(SourceFile:218)
        //     at a6.j.j(SourceFile:23)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean getMessageToggle$1388376138(final UUID p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           981203558
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_2        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          60
        //    16: ldc_w           708842555
        //    19: iload           60
        //    21: ixor           
        //    22: istore          60
        //    24: aload_0        
        //    25: astore_3       
        //    26: aload_3        
        //    27: getfield        dev/daniboy/donutcore/database/SQLiteManager.messageToggleCache:Ljava/util/Map;
        //    30: astore          11
        //    32: aload_1        
        //    33: astore          4
        //    35: aload           11
        //    37: aload           4
        //    39: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    44: istore          12
        //    46: iload           12
        //    48: ldc_w           742939680
        //    51: iload           60
        //    53: ixor           
        //    54: if_icmpeq       106
        //    57: ldc_w           212301126
        //    60: iload           60
        //    62: ixor           
        //    63: istore          60
        //    65: aload_0        
        //    66: astore          13
        //    68: aload           13
        //    70: getfield        dev/daniboy/donutcore/database/SQLiteManager.messageToggleCache:Ljava/util/Map;
        //    73: astore          14
        //    75: aload_1        
        //    76: astore          47
        //    78: aload           14
        //    80: aload           47
        //    82: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    87: astore          15
        //    89: aload           15
        //    91: checkcast       Ljava/lang/Boolean;
        //    94: astore          16
        //    96: aload           16
        //    98: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   101: istore          17
        //   103: iload           17
        //   105: ireturn        
        //   106: iload           60
        //   108: ldc_w           1072046315
        //   111: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   114: istore          60
        //   116: iload           60
        //   118: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   121: ldc_w           102892135
        //   124: if_icmpeq       138
        //   127: ldc_w           2107716004
        //   130: iload           60
        //   132: ixor           
        //   133: istore          60
        //   135: goto            1888
        //   138: iload           60
        //   140: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   143: lookupswitch {
        //          102892135: 184
        //          134359533: 1888
        //          487421788: 138
        //          963878064: 192
        //          default: 1888
        //        }
        //   184: ldc_w           1047869146
        //   187: iload           60
        //   189: ixor           
        //   190: istore          60
        //   192: aload_0        
        //   193: astore          18
        //   195: aload           18
        //   197: ldc             1279769918
        //   199: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //   202: astore          19
        //   204: aload           19
        //   206: astore          6
        //   208: ldc_w           2093871365
        //   211: iload           60
        //   213: ixor           
        //   214: istore          60
        //   216: aload           6
        //   218: astore          20
        //   220: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.gmmjktywvlkbygr:()[B
        //   223: iload           60
        //   225: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   228: astore          48
        //   230: aload           20
        //   232: aload           48
        //   234: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   239: astore          21
        //   241: aload           21
        //   243: astore          7
        //   245: ldc_w           1833762778
        //   248: iload           60
        //   250: ixor           
        //   251: istore          60
        //   253: aload           7
        //   255: astore          22
        //   257: ldc_w           1012548815
        //   260: iload           60
        //   262: ixor           
        //   263: i2b            
        //   264: istore          49
        //   266: aload_1        
        //   267: astore          5
        //   269: aload           5
        //   271: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   274: astore          53
        //   276: aload           22
        //   278: iload           49
        //   280: aload           53
        //   282: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   287: ldc_w           578992238
        //   290: iload           60
        //   292: ixor           
        //   293: istore          60
        //   295: aload           7
        //   297: astore          23
        //   299: aload           23
        //   301: invokeinterface java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        //   306: astore          24
        //   308: aload           24
        //   310: astore          8
        //   312: ldc_w           717161154
        //   315: iload           60
        //   317: ixor           
        //   318: istore          60
        //   320: aload           8
        //   322: astore          25
        //   324: aload           25
        //   326: invokeinterface java/sql/ResultSet.next:()Z
        //   331: istore          26
        //   333: iload           26
        //   335: ldc_w           879230562
        //   338: iload           60
        //   340: ixor           
        //   341: if_icmpeq       922
        //   344: ldc_w           1660361109
        //   347: iload           60
        //   349: ixor           
        //   350: istore          60
        //   352: aload           8
        //   354: astore          32
        //   356: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.ptwztmaaeildhus:()[B
        //   359: iload           60
        //   361: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   364: astore          50
        //   366: aload           32
        //   368: aload           50
        //   370: invokeinterface java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
        //   375: istore          33
        //   377: iload           33
        //   379: istore          9
        //   381: ldc_w           1618952879
        //   384: iload           60
        //   386: ixor           
        //   387: istore          60
        //   389: aload_0        
        //   390: astore          34
        //   392: aload           34
        //   394: getfield        dev/daniboy/donutcore/database/SQLiteManager.messageToggleCache:Ljava/util/Map;
        //   397: astore          35
        //   399: aload_1        
        //   400: astore          51
        //   402: iload           9
        //   404: istore          54
        //   406: iload           54
        //   408: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   411: astore          55
        //   413: aload           35
        //   415: aload           51
        //   417: aload           55
        //   419: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   424: astore          36
        //   426: ldc_w           53358520
        //   429: iload           60
        //   431: ixor           
        //   432: istore          60
        //   434: iload           9
        //   436: istore          37
        //   438: iload           37
        //   440: istore          10
        //   442: ldc_w           1235177299
        //   445: iload           60
        //   447: ixor           
        //   448: istore          60
        //   450: aload           6
        //   452: astore          38
        //   454: aload           38
        //   456: ifnull          493
        //   459: ldc_w           256874831
        //   462: iload           60
        //   464: ixor           
        //   465: istore          60
        //   467: aload           6
        //   469: astore          39
        //   471: aload           39
        //   473: invokeinterface java/sql/Connection.close:()V
        //   478: ldc_w           1511547696
        //   481: iload           60
        //   483: ixor           
        //   484: istore          60
        //   486: iload           10
        //   488: istore          40
        //   490: iload           40
        //   492: ireturn        
        //   493: iload           60
        //   495: ldc_w           416867322
        //   498: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   501: istore          60
        //   503: iload           60
        //   505: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   508: ldc_w           46370475
        //   511: if_icmpeq       517
        //   514: goto            1878
        //   517: iload           60
        //   519: ldc_w           1301223813
        //   522: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   525: istore          60
        //   527: goto            486
        //   530: iload           60
        //   532: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   535: lookupswitch {
        //          -2001348446: 637
        //          -1735727133: 694
        //          -1556090095: 624
        //          -1374923007: 683
        //          -1266204742: 648
        //          -1216533823: 718
        //          -489544079: 742
        //          -487182949: 659
        //          -154671872: 731
        //          1859801225: 672
        //          default: 707
        //        }
        //   624: iload           60
        //   626: ldc_w           837641641
        //   629: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   632: istore          60
        //   634: goto            1813
        //   637: ldc_w           1419518175
        //   640: iload           60
        //   642: ixor           
        //   643: istore          60
        //   645: goto            1813
        //   648: ldc_w           1394244668
        //   651: iload           60
        //   653: ixor           
        //   654: istore          60
        //   656: goto            1813
        //   659: iload           60
        //   661: ldc_w           2043960952
        //   664: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   667: istore          60
        //   669: goto            1813
        //   672: ldc_w           676450778
        //   675: iload           60
        //   677: ixor           
        //   678: istore          60
        //   680: goto            1813
        //   683: ldc_w           810225963
        //   686: iload           60
        //   688: ixor           
        //   689: istore          60
        //   691: goto            1813
        //   694: iload           60
        //   696: ldc_w           1989920567
        //   699: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   702: istore          60
        //   704: goto            1813
        //   707: new             Ljava/lang/RuntimeException;
        //   710: dup            
        //   711: ldc_w           "Error in hash"
        //   714: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   717: athrow         
        //   718: iload           60
        //   720: ldc_w           862273171
        //   723: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   726: istore          60
        //   728: goto            1813
        //   731: ldc_w           458385259
        //   734: iload           60
        //   736: ixor           
        //   737: istore          60
        //   739: goto            1813
        //   742: ldc_w           969989893
        //   745: iload           60
        //   747: ixor           
        //   748: istore          60
        //   750: goto            1813
        //   753: iload           60
        //   755: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   758: lookupswitch {
        //          -2001348446: 885
        //          -1556090095: 872
        //          -1374923007: 909
        //          -1266204742: 859
        //          -1216533823: 896
        //          -489544079: 848
        //          -154671872: 824
        //          default: 837
        //        }
        //   824: iload           60
        //   826: ldc_w           1347986973
        //   829: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   832: istore          60
        //   834: goto            1031
        //   837: new             Ljava/lang/IllegalAccessException;
        //   840: dup            
        //   841: ldc_w           "Error in hash"
        //   844: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   847: athrow         
        //   848: ldc_w           1926897267
        //   851: iload           60
        //   853: ixor           
        //   854: istore          60
        //   856: goto            1031
        //   859: iload           60
        //   861: ldc_w           403750218
        //   864: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   867: istore          60
        //   869: goto            1031
        //   872: iload           60
        //   874: ldc_w           2062001375
        //   877: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   880: istore          60
        //   882: goto            1031
        //   885: ldc_w           529981865
        //   888: iload           60
        //   890: ixor           
        //   891: istore          60
        //   893: goto            1031
        //   896: iload           60
        //   898: ldc_w           2020605925
        //   901: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   904: istore          60
        //   906: goto            1031
        //   909: iload           60
        //   911: ldc_w           2067910749
        //   914: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   917: istore          60
        //   919: goto            1031
        //   922: iload           60
        //   924: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   927: lookupswitch {
        //          92883130: 968
        //          1170398925: 1888
        //          1617182357: 922
        //          1929039400: 976
        //          default: 1888
        //        }
        //   968: ldc_w           1367198852
        //   971: iload           60
        //   973: ixor           
        //   974: istore          60
        //   976: iload           60
        //   978: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   981: ldc_w           65185671
        //   984: if_icmpeq       990
        //   987: goto            1867
        //   990: iload           60
        //   992: ldc_w           1338520735
        //   995: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   998: istore          60
        //  1000: aload           6
        //  1002: astore          27
        //  1004: aload           27
        //  1006: ifnull          1458
        //  1009: ldc_w           213374369
        //  1012: iload           60
        //  1014: ixor           
        //  1015: istore          60
        //  1017: aload           6
        //  1019: astore          28
        //  1021: aload           28
        //  1023: invokeinterface java/sql/Connection.close:()V
        //  1028: goto            1571
        //  1031: astore          41
        //  1033: aload           41
        //  1035: astore          57
        //  1037: aload           6
        //  1039: astore          42
        //  1041: aload           42
        //  1043: ifnull          1209
        //  1046: ldc_w           506631308
        //  1049: iload           60
        //  1051: ixor           
        //  1052: istore          60
        //  1054: aload           6
        //  1056: astore          43
        //  1058: aload           43
        //  1060: invokeinterface java/sql/Connection.close:()V
        //  1065: ldc_w           651895369
        //  1068: iload           60
        //  1070: ixor           
        //  1071: istore          60
        //  1073: goto            1112
        //  1076: astore          44
        //  1078: aload           44
        //  1080: astore          58
        //  1082: aload           57
        //  1084: astore          45
        //  1086: aload           58
        //  1088: astore          52
        //  1090: aload           45
        //  1092: aload           52
        //  1094: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1097: ldc_w           1433380623
        //  1100: iload           60
        //  1102: ixor           
        //  1103: istore          60
        //  1105: aload           57
        //  1107: astore          46
        //  1109: aload           46
        //  1111: athrow         
        //  1112: ldc_w           889815582
        //  1115: iload           60
        //  1117: ixor           
        //  1118: istore          60
        //  1120: iload           60
        //  1122: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1125: ldc_w           42636933
        //  1128: if_icmpeq       1133
        //  1131: aconst_null    
        //  1132: athrow         
        //  1133: new             Ljava/io/IOException;
        //  1136: dup            
        //  1137: invokespecial   java/io/IOException.<init>:()V
        //  1140: athrow         
        //  1141: iload           60
        //  1143: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1146: lookupswitch {
        //          -61584270: 1172
        //          453210930: 1185
        //          default: 1281
        //        }
        //  1172: iload           60
        //  1174: ldc_w           614006951
        //  1177: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1180: istore          60
        //  1182: goto            1195
        //  1185: iload           60
        //  1187: ldc_w           947119951
        //  1190: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1193: istore          60
        //  1195: pop            
        //  1196: iload           60
        //  1198: ldc_w           413286023
        //  1201: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1204: istore          60
        //  1206: goto            1105
        //  1209: iload           60
        //  1211: ldc_w           595174305
        //  1214: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1217: istore          60
        //  1219: iload           60
        //  1221: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1224: ldc_w           85213023
        //  1227: if_icmpeq       1233
        //  1230: goto            1549
        //  1233: ldc_w           239619762
        //  1236: iload           60
        //  1238: ixor           
        //  1239: istore          60
        //  1241: goto            1105
        //  1244: iload           60
        //  1246: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1249: tableswitch {
        //          187491092: 1268
        //          default: 1560
        //        }
        //  1268: iload           60
        //  1270: ldc_w           1718410896
        //  1273: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1276: istore          60
        //  1278: goto            1076
        //  1281: new             Ljava/lang/IllegalAccessException;
        //  1284: dup            
        //  1285: ldc_w           "Error in hash"
        //  1288: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1291: athrow         
        //  1292: iload           60
        //  1294: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1297: lookupswitch {
        //          -2053738102: 1436
        //          -1286642749: 1377
        //          -1225751287: 1412
        //          495828339: 1399
        //          858693313: 1447
        //          1452291017: 1425
        //          1946342890: 1364
        //          default: 1388
        //        }
        //  1364: iload           60
        //  1366: ldc_w           1258996086
        //  1369: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1372: istore          60
        //  1374: goto            1813
        //  1377: ldc_w           1944287155
        //  1380: iload           60
        //  1382: ixor           
        //  1383: istore          60
        //  1385: goto            1813
        //  1388: new             Ljava/io/IOException;
        //  1391: dup            
        //  1392: ldc_w           "Error in hash"
        //  1395: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1398: athrow         
        //  1399: iload           60
        //  1401: ldc_w           1715154021
        //  1404: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1407: istore          60
        //  1409: goto            1813
        //  1412: iload           60
        //  1414: ldc_w           861178730
        //  1417: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1420: istore          60
        //  1422: goto            1813
        //  1425: ldc_w           794336690
        //  1428: iload           60
        //  1430: ixor           
        //  1431: istore          60
        //  1433: goto            1813
        //  1436: ldc_w           1429755386
        //  1439: iload           60
        //  1441: ixor           
        //  1442: istore          60
        //  1444: goto            1813
        //  1447: ldc_w           602884115
        //  1450: iload           60
        //  1452: ixor           
        //  1453: istore          60
        //  1455: goto            1813
        //  1458: iload           60
        //  1460: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1463: lookupswitch {
        //          49727064: 1504
        //          261200222: 1458
        //          1145766910: 1888
        //          1508698859: 1512
        //          default: 1888
        //        }
        //  1504: ldc_w           1211973121
        //  1507: iload           60
        //  1509: ixor           
        //  1510: istore          60
        //  1512: iload           60
        //  1514: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1517: ldc_w           263135111
        //  1520: if_icmpeq       1536
        //  1523: iload           60
        //  1525: ldc_w           216036631
        //  1528: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1531: istore          60
        //  1533: goto            1888
        //  1536: iload           60
        //  1538: ldc_w           585918587
        //  1541: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1544: istore          60
        //  1546: goto            1721
        //  1549: ldc_w           66499699
        //  1552: iload           60
        //  1554: ixor           
        //  1555: istore          60
        //  1557: goto            1888
        //  1560: new             Ljava/lang/IllegalAccessException;
        //  1563: dup            
        //  1564: ldc_w           "Error in hash"
        //  1567: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1570: athrow         
        //  1571: iload           60
        //  1573: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1576: lookupswitch {
        //          55510446: 1571
        //          174418967: 1620
        //          390333764: 1628
        //          468851054: 1888
        //          default: 1888
        //        }
        //  1620: ldc_w           1497195027
        //  1623: iload           60
        //  1625: ixor           
        //  1626: istore          60
        //  1628: iload           60
        //  1630: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1633: ldc_w           112961313
        //  1636: if_icmpeq       1641
        //  1639: aconst_null    
        //  1640: athrow         
        //  1641: new             Ljava/io/IOException;
        //  1644: dup            
        //  1645: invokespecial   java/io/IOException.<init>:()V
        //  1648: athrow         
        //  1649: iload           60
        //  1651: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1654: lookupswitch {
        //          -87716261: 1702
        //          1253268345: 1680
        //          default: 1691
        //        }
        //  1680: ldc_w           1778147975
        //  1683: iload           60
        //  1685: ixor           
        //  1686: istore          60
        //  1688: goto            1710
        //  1691: new             Ljava/io/IOException;
        //  1694: dup            
        //  1695: ldc_w           "Error in hash"
        //  1698: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1701: athrow         
        //  1702: ldc_w           1072871459
        //  1705: iload           60
        //  1707: ixor           
        //  1708: istore          60
        //  1710: pop            
        //  1711: iload           60
        //  1713: ldc_w           11098603
        //  1716: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1719: istore          60
        //  1721: ldc_w           1059797747
        //  1724: iload           60
        //  1726: ixor           
        //  1727: istore          60
        //  1729: iload           60
        //  1731: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1734: ldc_w           106835993
        //  1737: if_icmpeq       1742
        //  1740: aconst_null    
        //  1741: athrow         
        //  1742: new             Ljava/lang/IllegalAccessException;
        //  1745: dup            
        //  1746: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1749: athrow         
        //  1750: iload           60
        //  1752: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1755: lookupswitch {
        //          -505890064: 1780
        //          -113027197: 1791
        //          default: 1856
        //        }
        //  1780: ldc_w           278232864
        //  1783: iload           60
        //  1785: ixor           
        //  1786: istore          60
        //  1788: goto            1799
        //  1791: ldc_w           1938162318
        //  1794: iload           60
        //  1796: ixor           
        //  1797: istore          60
        //  1799: pop            
        //  1800: iload           60
        //  1802: ldc_w           577592615
        //  1805: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1808: istore          60
        //  1810: goto            1844
        //  1813: astore          30
        //  1815: aload           30
        //  1817: astore          56
        //  1819: ldc_w           1884946013
        //  1822: iload           60
        //  1824: ixor           
        //  1825: istore          60
        //  1827: aload           56
        //  1829: astore          31
        //  1831: aload           31
        //  1833: invokevirtual   java/sql/SQLException.printStackTrace:()V
        //  1836: ldc_w           1527795919
        //  1839: iload           60
        //  1841: ixor           
        //  1842: istore          60
        //  1844: ldc_w           784545113
        //  1847: iload           60
        //  1849: ixor           
        //  1850: i2b            
        //  1851: istore          29
        //  1853: iload           29
        //  1855: ireturn        
        //  1856: new             Ljava/lang/RuntimeException;
        //  1859: dup            
        //  1860: ldc_w           "Error in hash"
        //  1863: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1866: athrow         
        //  1867: ldc_w           185958281
        //  1870: iload           60
        //  1872: ixor           
        //  1873: istore          60
        //  1875: goto            1888
        //  1878: iload           60
        //  1880: ldc_w           176778022
        //  1883: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1886: istore          60
        //  1888: new             Ljava/lang/IllegalAccessException;
        //  1891: dup            
        //  1892: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1895: athrow         
        //    StackMapTable: 00 52 FF 00 6A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 1F 2D 07 FF 01 25 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 01 01 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 07 01 60 01 07 00 02 07 01 A2 07 00 04 01 07 00 D5 00 00 00 00 00 00 00 00 00 07 01 4D 01 07 01 4D 07 03 48 00 07 01 4D 01 07 03 81 00 00 00 00 01 00 00 06 17 FF 00 0C 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 5D 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 46 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 FF 00 0C 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 2D 07 0D FF 00 28 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 1C FF 00 06 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 14 47 07 00 C4 5E 07 00 C4 4C 07 00 C4 49 07 00 C4 FF 00 0D 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 17 4A 07 00 C0 57 07 00 C0 FF 00 0C 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C4 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 47 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 2D 07 17 FF 00 0C 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 4A 07 00 C0 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 30 07 0C 47 07 00 C4 5E 07 00 C4 4A 07 00 C4 4A 07 00 C4 47 07 00 C4 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 14 47 07 00 BD 5D 07 00 BD 4A 07 00 BD 47 07 00 BD FF 00 0D 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 1E FF 00 0B 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 01 07 00 BD FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 01 01 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 07 01 60 01 07 00 02 07 01 A2 07 00 04 01 07 00 D5 00 00 00 00 00 00 00 00 00 07 01 4D 01 07 01 4D 07 03 48 00 07 01 4D 01 07 03 81 00 00 00 00 01 00 00 FF 00 09 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  216    450    753    1571   Ljava/lang/Throwable;
        //  1054   1073   1244   1281   Ljava/lang/Throwable;
        //  192    486    530    753    Ljava/sql/SQLException;
        //  1000   1112   1292   1458   Ljava/sql/SQLException;
        //  1729   1750   1750   1813   Ljava/lang/IllegalAccessException;
        //  1120   1141   1141   1209   Ljava/io/IOException;
        //  1628   1649   1649   1721   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0486:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void saveBillfordItems$48192890(final int p0, final ItemStack p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           237158992
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_3        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          69
        //    16: ldc_w           1383744244
        //    19: iload           69
        //    21: ixor           
        //    22: istore          69
        //    24: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.nikurlmrihcstdx:()[B
        //    27: iload           69
        //    29: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    32: astore          4
        //    34: aload           4
        //    36: astore          8
        //    38: ldc_w           912595267
        //    41: iload           69
        //    43: ixor           
        //    44: istore          69
        //    46: aload_0        
        //    47: astore          13
        //    49: aload           13
        //    51: ldc             1279769918
        //    53: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    56: astore          14
        //    58: aload           14
        //    60: astore          9
        //    62: ldc_w           1238849323
        //    65: iload           69
        //    67: ixor           
        //    68: istore          69
        //    70: aload           9
        //    72: astore          15
        //    74: aload           8
        //    76: astore          5
        //    78: aload           15
        //    80: aload           5
        //    82: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    87: astore          16
        //    89: aload           16
        //    91: astore          10
        //    93: ldc_w           781899705
        //    96: iload           69
        //    98: ixor           
        //    99: istore          69
        //   101: aload_2        
        //   102: astore          17
        //   104: aload           17
        //   106: invokestatic    dev/daniboy/donutcore/utils/ItemStackSerializer.serializeItemStack:(Lorg/bukkit/inventory/ItemStack;)Ljava/lang/String;
        //   109: astore          18
        //   111: aload           18
        //   113: astore          11
        //   115: ldc_w           1259338209
        //   118: iload           69
        //   120: ixor           
        //   121: istore          69
        //   123: aload           10
        //   125: astore          19
        //   127: ldc_w           921808981
        //   130: iload           69
        //   132: ixor           
        //   133: i2b            
        //   134: istore          50
        //   136: iload_1        
        //   137: istore          6
        //   139: aload           19
        //   141: iload           50
        //   143: iload           6
        //   145: invokeinterface java/sql/PreparedStatement.setInt:(II)V
        //   150: ldc_w           1371462465
        //   153: iload           69
        //   155: ixor           
        //   156: istore          69
        //   158: aload           10
        //   160: astore          20
        //   162: ldc_w           1733258007
        //   165: iload           69
        //   167: ixor           
        //   168: i2b            
        //   169: istore          51
        //   171: aload           11
        //   173: astore          58
        //   175: aload           20
        //   177: iload           51
        //   179: aload           58
        //   181: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   186: ldc_w           1864214872
        //   189: iload           69
        //   191: ixor           
        //   192: istore          69
        //   194: aload           10
        //   196: astore          21
        //   198: aload           21
        //   200: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   205: istore          22
        //   207: ldc_w           1219264623
        //   210: iload           69
        //   212: ixor           
        //   213: istore          69
        //   215: aload_0        
        //   216: astore          23
        //   218: aload           23
        //   220: getfield        dev/daniboy/donutcore/database/SQLiteManager.billfordItemsCache:Ljava/util/Map;
        //   223: astore          24
        //   225: iload_1        
        //   226: istore          52
        //   228: iload           52
        //   230: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   233: astore          53
        //   235: aload_2        
        //   236: astore          59
        //   238: aload           24
        //   240: aload           53
        //   242: aload           59
        //   244: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   249: astore          25
        //   251: ldc_w           107484541
        //   254: iload           69
        //   256: ixor           
        //   257: istore          69
        //   259: aload           10
        //   261: astore          26
        //   263: aload           26
        //   265: ifnull          483
        //   268: ldc_w           2010742116
        //   271: iload           69
        //   273: ixor           
        //   274: istore          69
        //   276: aload           10
        //   278: astore          27
        //   280: aload           27
        //   282: invokeinterface java/sql/PreparedStatement.close:()V
        //   287: goto            2136
        //   290: astore          44
        //   292: aload           44
        //   294: astore          67
        //   296: aload           10
        //   298: astore          45
        //   300: aload           45
        //   302: ifnull          914
        //   305: ldc_w           1843826939
        //   308: iload           69
        //   310: ixor           
        //   311: istore          69
        //   313: aload           10
        //   315: astore          46
        //   317: aload           46
        //   319: invokeinterface java/sql/PreparedStatement.close:()V
        //   324: ldc_w           1953041296
        //   327: iload           69
        //   329: ixor           
        //   330: istore          69
        //   332: goto            1784
        //   335: astore          47
        //   337: aload           47
        //   339: astore          12
        //   341: aload           67
        //   343: astore          48
        //   345: aload           12
        //   347: astore          57
        //   349: aload           48
        //   351: aload           57
        //   353: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   356: ldc_w           503000052
        //   359: iload           69
        //   361: ixor           
        //   362: istore          69
        //   364: aload           67
        //   366: astore          49
        //   368: aload           49
        //   370: athrow         
        //   371: aload           9
        //   373: astore          28
        //   375: aload           28
        //   377: ifnull          1934
        //   380: ldc_w           462754815
        //   383: iload           69
        //   385: ixor           
        //   386: istore          69
        //   388: aload           9
        //   390: astore          29
        //   392: aload           29
        //   394: invokeinterface java/sql/Connection.close:()V
        //   399: goto            623
        //   402: astore          38
        //   404: aload           38
        //   406: astore          65
        //   408: aload           9
        //   410: astore          39
        //   412: aload           39
        //   414: ifnull          822
        //   417: ldc_w           563656505
        //   420: iload           69
        //   422: ixor           
        //   423: istore          69
        //   425: aload           9
        //   427: astore          40
        //   429: aload           40
        //   431: invokeinterface java/sql/Connection.close:()V
        //   436: ldc_w           708255630
        //   439: iload           69
        //   441: ixor           
        //   442: istore          69
        //   444: goto            2240
        //   447: astore          41
        //   449: aload           41
        //   451: astore          66
        //   453: aload           65
        //   455: astore          42
        //   457: aload           66
        //   459: astore          56
        //   461: aload           42
        //   463: aload           56
        //   465: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   468: ldc_w           453438786
        //   471: iload           69
        //   473: ixor           
        //   474: istore          69
        //   476: aload           65
        //   478: astore          43
        //   480: aload           43
        //   482: athrow         
        //   483: ldc_w           84290782
        //   486: iload           69
        //   488: ixor           
        //   489: istore          69
        //   491: iload           69
        //   493: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   496: ldc_w           48737497
        //   499: if_icmpeq       505
        //   502: goto            563
        //   505: iload           69
        //   507: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   510: lookupswitch {
        //          48737497: 552
        //          135218312: 2128
        //          886299711: 505
        //          1776285433: 371
        //          default: 2128
        //        }
        //   552: ldc_w           691594777
        //   555: iload           69
        //   557: ixor           
        //   558: istore          69
        //   560: goto            371
        //   563: iload           69
        //   565: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   568: lookupswitch {
        //          48737497: 612
        //          686179792: 563
        //          1117253733: 2128
        //          1988631625: 2128
        //          default: 2128
        //        }
        //   612: ldc_w           1968921453
        //   615: iload           69
        //   617: ixor           
        //   618: istore          69
        //   620: goto            2128
        //   623: iload           69
        //   625: ldc_w           1129445156
        //   628: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   631: istore          69
        //   633: iload           69
        //   635: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   638: ldc_w           28448925
        //   641: if_icmpeq       646
        //   644: aconst_null    
        //   645: athrow         
        //   646: new             Ljava/lang/RuntimeException;
        //   649: dup            
        //   650: invokespecial   java/lang/RuntimeException.<init>:()V
        //   653: athrow         
        //   654: iload           69
        //   656: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   659: lookupswitch {
        //          -1822176743: 684
        //          -965207511: 706
        //          default: 695
        //        }
        //   684: ldc_w           1078859733
        //   687: iload           69
        //   689: ixor           
        //   690: istore          69
        //   692: goto            714
        //   695: new             Ljava/lang/RuntimeException;
        //   698: dup            
        //   699: ldc_w           "Error in hash"
        //   702: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   705: athrow         
        //   706: ldc_w           1257074131
        //   709: iload           69
        //   711: ixor           
        //   712: istore          69
        //   714: pop            
        //   715: iload           69
        //   717: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   720: lookupswitch {
        //          220382304: 764
        //          1094506256: 2128
        //          1097170649: 1964
        //          1588024082: 715
        //          default: 2128
        //        }
        //   764: ldc_w           1544820019
        //   767: iload           69
        //   769: ixor           
        //   770: istore          69
        //   772: goto            1964
        //   775: iload           69
        //   777: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   780: tableswitch {
        //          -1959946064: 800
        //          default: 811
        //        }
        //   800: ldc_w           1387572453
        //   803: iload           69
        //   805: ixor           
        //   806: istore          69
        //   808: goto            335
        //   811: new             Ljava/lang/IllegalAccessException;
        //   814: dup            
        //   815: ldc_w           "Error in hash"
        //   818: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   821: athrow         
        //   822: iload           69
        //   824: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   827: lookupswitch {
        //          166948751: 868
        //          850094648: 876
        //          1107170019: 822
        //          1836785497: 2128
        //          default: 2128
        //        }
        //   868: ldc_w           1463070111
        //   871: iload           69
        //   873: ixor           
        //   874: istore          69
        //   876: iload           69
        //   878: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   881: ldc_w           203368544
        //   884: if_icmpeq       890
        //   887: goto            901
        //   890: ldc_w           540021905
        //   893: iload           69
        //   895: ixor           
        //   896: istore          69
        //   898: goto            476
        //   901: iload           69
        //   903: ldc_w           293795499
        //   906: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   909: istore          69
        //   911: goto            2128
        //   914: iload           69
        //   916: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   919: lookupswitch {
        //          72559389: 960
        //          513648052: 914
        //          1829876877: 2128
        //          2142514712: 968
        //          default: 2128
        //        }
        //   960: ldc_w           1074683710
        //   963: iload           69
        //   965: ixor           
        //   966: istore          69
        //   968: iload           69
        //   970: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   973: ldc_w           140422765
        //   976: if_icmpeq       982
        //   979: goto            995
        //   982: iload           69
        //   984: ldc_w           1655130324
        //   987: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   990: istore          69
        //   992: goto            364
        //   995: ldc_w           328283810
        //   998: iload           69
        //  1000: ixor           
        //  1001: istore          69
        //  1003: goto            2128
        //  1006: iload           69
        //  1008: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1011: lookupswitch {
        //          -2081694013: 1293
        //          -1980992709: 1328
        //          -1971760679: 1271
        //          -1892784374: 1420
        //          -1692077982: 1212
        //          -1215462751: 1199
        //          -801920142: 1339
        //          -711046856: 1383
        //          -560555141: 1223
        //          -470188896: 1372
        //          -421621541: 1361
        //          -269333077: 1282
        //          133304594: 1234
        //          715279235: 1188
        //          884128506: 1394
        //          981162155: 1350
        //          1003361968: 1407
        //          1072362706: 1315
        //          1117131368: 1304
        //          1167510616: 1433
        //          1430580419: 1247
        //          default: 1260
        //        }
        //  1188: ldc_w           461379911
        //  1191: iload           69
        //  1193: ixor           
        //  1194: istore          69
        //  1196: goto            1443
        //  1199: iload           69
        //  1201: ldc_w           1210441827
        //  1204: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1207: istore          69
        //  1209: goto            1443
        //  1212: ldc_w           766561851
        //  1215: iload           69
        //  1217: ixor           
        //  1218: istore          69
        //  1220: goto            1443
        //  1223: ldc_w           84312920
        //  1226: iload           69
        //  1228: ixor           
        //  1229: istore          69
        //  1231: goto            1443
        //  1234: iload           69
        //  1236: ldc_w           1042944533
        //  1239: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1242: istore          69
        //  1244: goto            1443
        //  1247: iload           69
        //  1249: ldc_w           343723439
        //  1252: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1255: istore          69
        //  1257: goto            1443
        //  1260: new             Ljava/lang/RuntimeException;
        //  1263: dup            
        //  1264: ldc_w           "Error in hash"
        //  1267: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1270: athrow         
        //  1271: ldc_w           1335589388
        //  1274: iload           69
        //  1276: ixor           
        //  1277: istore          69
        //  1279: goto            1443
        //  1282: ldc_w           53090690
        //  1285: iload           69
        //  1287: ixor           
        //  1288: istore          69
        //  1290: goto            1443
        //  1293: ldc_w           245967855
        //  1296: iload           69
        //  1298: ixor           
        //  1299: istore          69
        //  1301: goto            1443
        //  1304: ldc_w           1988530810
        //  1307: iload           69
        //  1309: ixor           
        //  1310: istore          69
        //  1312: goto            1443
        //  1315: iload           69
        //  1317: ldc_w           958992045
        //  1320: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1323: istore          69
        //  1325: goto            1443
        //  1328: ldc_w           266985040
        //  1331: iload           69
        //  1333: ixor           
        //  1334: istore          69
        //  1336: goto            1443
        //  1339: ldc_w           617751897
        //  1342: iload           69
        //  1344: ixor           
        //  1345: istore          69
        //  1347: goto            1443
        //  1350: ldc_w           429603618
        //  1353: iload           69
        //  1355: ixor           
        //  1356: istore          69
        //  1358: goto            1443
        //  1361: ldc_w           34570796
        //  1364: iload           69
        //  1366: ixor           
        //  1367: istore          69
        //  1369: goto            1443
        //  1372: ldc_w           1655406499
        //  1375: iload           69
        //  1377: ixor           
        //  1378: istore          69
        //  1380: goto            1443
        //  1383: ldc_w           1684510992
        //  1386: iload           69
        //  1388: ixor           
        //  1389: istore          69
        //  1391: goto            1443
        //  1394: iload           69
        //  1396: ldc_w           943851368
        //  1399: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1402: istore          69
        //  1404: goto            1443
        //  1407: iload           69
        //  1409: ldc_w           2041418465
        //  1412: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1415: istore          69
        //  1417: goto            1443
        //  1420: iload           69
        //  1422: ldc_w           791780566
        //  1425: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1428: istore          69
        //  1430: goto            1443
        //  1433: iload           69
        //  1435: ldc_w           1986431420
        //  1438: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1441: istore          69
        //  1443: astore          30
        //  1445: aload           30
        //  1447: astore          63
        //  1449: ldc_w           1639313822
        //  1452: iload           69
        //  1454: ixor           
        //  1455: istore          69
        //  1457: aload_0        
        //  1458: astore          31
        //  1460: aload           31
        //  1462: getfield        dev/daniboy/donutcore/database/SQLiteManager.plugin:Ldev/daniboy/donutcore/DonutCore;
        //  1465: astore          32
        //  1467: aload           32
        //  1469: invokevirtual   dev/daniboy/donutcore/DonutCore.getLogger:()Ljava/util/logging/Logger;
        //  1472: astore          33
        //  1474: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //  1477: astore          54
        //  1479: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.wqtrfqlsioqptqi:()[B
        //  1482: iload           69
        //  1484: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //  1487: astore          60
        //  1489: aload           63
        //  1491: astore          7
        //  1493: aload           33
        //  1495: aload           54
        //  1497: aload           60
        //  1499: aload           7
        //  1501: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1504: ldc_w           1738290677
        //  1507: iload           69
        //  1509: ixor           
        //  1510: istore          69
        //  1512: iload           69
        //  1514: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1517: lookupswitch {
        //          174798735: 1560
        //          1085713727: 1568
        //          1755830351: 2128
        //          2017071878: 1512
        //          default: 2128
        //        }
        //  1560: ldc_w           236780014
        //  1563: iload           69
        //  1565: ixor           
        //  1566: istore          69
        //  1568: iload           69
        //  1570: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1573: ldc_w           106213993
        //  1576: if_icmpeq       1581
        //  1579: aconst_null    
        //  1580: athrow         
        //  1581: new             Ljava/lang/RuntimeException;
        //  1584: dup            
        //  1585: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1588: athrow         
        //  1589: iload           69
        //  1591: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1594: lookupswitch {
        //          -1223987821: 1620
        //          -146248101: 1642
        //          default: 1631
        //        }
        //  1620: ldc_w           1441746195
        //  1623: iload           69
        //  1625: ixor           
        //  1626: istore          69
        //  1628: goto            1650
        //  1631: new             Ljava/lang/IllegalAccessException;
        //  1634: dup            
        //  1635: ldc_w           "Error in hash"
        //  1638: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1641: athrow         
        //  1642: ldc_w           1575431530
        //  1645: iload           69
        //  1647: ixor           
        //  1648: istore          69
        //  1650: pop            
        //  1651: ldc_w           17024084
        //  1654: iload           69
        //  1656: ixor           
        //  1657: istore          69
        //  1659: goto            2850
        //  1662: iload           69
        //  1664: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1667: lookupswitch {
        //          -1215462751: 1716
        //          -269333077: 1727
        //          133304594: 1749
        //          981162155: 1760
        //          1117131368: 1773
        //          default: 1738
        //        }
        //  1716: ldc_w           1403386148
        //  1719: iload           69
        //  1721: ixor           
        //  1722: istore          69
        //  1724: goto            290
        //  1727: ldc_w           413794501
        //  1730: iload           69
        //  1732: ixor           
        //  1733: istore          69
        //  1735: goto            290
        //  1738: new             Ljava/lang/IllegalAccessException;
        //  1741: dup            
        //  1742: ldc_w           "Error in hash"
        //  1745: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1748: athrow         
        //  1749: ldc_w           631901010
        //  1752: iload           69
        //  1754: ixor           
        //  1755: istore          69
        //  1757: goto            290
        //  1760: iload           69
        //  1762: ldc_w           35332709
        //  1765: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1768: istore          69
        //  1770: goto            290
        //  1773: ldc_w           1829145405
        //  1776: iload           69
        //  1778: ixor           
        //  1779: istore          69
        //  1781: goto            290
        //  1784: ldc_w           1471900482
        //  1787: iload           69
        //  1789: ixor           
        //  1790: istore          69
        //  1792: iload           69
        //  1794: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1797: ldc_w           67849340
        //  1800: if_icmpeq       1805
        //  1803: aconst_null    
        //  1804: athrow         
        //  1805: new             Ljava/io/IOException;
        //  1808: dup            
        //  1809: invokespecial   java/io/IOException.<init>:()V
        //  1812: athrow         
        //  1813: iload           69
        //  1815: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1818: lookupswitch {
        //          570469409: 1844
        //          1527106249: 1857
        //          default: 1923
        //        }
        //  1844: iload           69
        //  1846: ldc_w           2030458817
        //  1849: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1852: istore          69
        //  1854: goto            1865
        //  1857: ldc_w           1982266140
        //  1860: iload           69
        //  1862: ixor           
        //  1863: istore          69
        //  1865: pop            
        //  1866: iload           69
        //  1868: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1871: lookupswitch {
        //          79199523: 1912
        //          834889291: 2128
        //          1422444308: 364
        //          1512432398: 1866
        //          default: 2128
        //        }
        //  1912: ldc_w           448470239
        //  1915: iload           69
        //  1917: ixor           
        //  1918: istore          69
        //  1920: goto            364
        //  1923: new             Ljava/lang/IllegalAccessException;
        //  1926: dup            
        //  1927: ldc_w           "Error in hash"
        //  1930: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1933: athrow         
        //  1934: ldc_w           2136963330
        //  1937: iload           69
        //  1939: ixor           
        //  1940: istore          69
        //  1942: iload           69
        //  1944: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1947: ldc_w           177233693
        //  1950: if_icmpeq       1956
        //  1953: goto            2072
        //  1956: ldc_w           1002544959
        //  1959: iload           69
        //  1961: ixor           
        //  1962: istore          69
        //  1964: iload           69
        //  1966: ldc_w           1741357784
        //  1969: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1972: istore          69
        //  1974: iload           69
        //  1976: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1979: ldc_w           257643167
        //  1982: if_icmpeq       1987
        //  1985: aconst_null    
        //  1986: athrow         
        //  1987: new             Ljava/lang/RuntimeException;
        //  1990: dup            
        //  1991: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1994: athrow         
        //  1995: iload           69
        //  1997: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2000: lookupswitch {
        //          -1807402464: 2028
        //          1340853226: 2050
        //          default: 2039
        //        }
        //  2028: ldc_w           422797840
        //  2031: iload           69
        //  2033: ixor           
        //  2034: istore          69
        //  2036: goto            2058
        //  2039: new             Ljava/lang/RuntimeException;
        //  2042: dup            
        //  2043: ldc_w           "Error in hash"
        //  2046: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  2049: athrow         
        //  2050: ldc_w           1111931945
        //  2053: iload           69
        //  2055: ixor           
        //  2056: istore          69
        //  2058: pop            
        //  2059: iload           69
        //  2061: ldc_w           699802017
        //  2064: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2067: istore          69
        //  2069: goto            2850
        //  2072: iload           69
        //  2074: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2077: lookupswitch {
        //          177233693: 2120
        //          773971512: 2128
        //          1186821362: 2072
        //          1502825580: 2128
        //          default: 2128
        //        }
        //  2120: ldc_w           591185014
        //  2123: iload           69
        //  2125: ixor           
        //  2126: istore          69
        //  2128: new             Ljava/io/IOException;
        //  2131: dup            
        //  2132: invokespecial   java/io/IOException.<init>:()V
        //  2135: athrow         
        //  2136: ldc_w           869805429
        //  2139: iload           69
        //  2141: ixor           
        //  2142: istore          69
        //  2144: iload           69
        //  2146: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2149: ldc_w           40735822
        //  2152: if_icmpeq       2157
        //  2155: aconst_null    
        //  2156: athrow         
        //  2157: new             Ljava/lang/IllegalAccessException;
        //  2160: dup            
        //  2161: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  2164: athrow         
        //  2165: iload           69
        //  2167: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2170: lookupswitch {
        //          347617904: 2218
        //          674556336: 2207
        //          default: 2196
        //        }
        //  2196: new             Ljava/io/IOException;
        //  2199: dup            
        //  2200: ldc_w           "Error in hash"
        //  2203: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2206: athrow         
        //  2207: ldc_w           1779445753
        //  2210: iload           69
        //  2212: ixor           
        //  2213: istore          69
        //  2215: goto            2228
        //  2218: iload           69
        //  2220: ldc_w           1837217153
        //  2223: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2226: istore          69
        //  2228: pop            
        //  2229: ldc_w           96350039
        //  2232: iload           69
        //  2234: ixor           
        //  2235: istore          69
        //  2237: goto            371
        //  2240: ldc_w           699810160
        //  2243: iload           69
        //  2245: ixor           
        //  2246: istore          69
        //  2248: iload           69
        //  2250: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2253: ldc_w           262310264
        //  2256: if_icmpeq       2261
        //  2259: aconst_null    
        //  2260: athrow         
        //  2261: new             Ljava/io/IOException;
        //  2264: dup            
        //  2265: invokespecial   java/io/IOException.<init>:()V
        //  2268: athrow         
        //  2269: iload           69
        //  2271: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2274: lookupswitch {
        //          -1826320134: 2311
        //          1087982384: 2324
        //          default: 2300
        //        }
        //  2300: new             Ljava/lang/IllegalAccessException;
        //  2303: dup            
        //  2304: ldc_w           "Error in hash"
        //  2307: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  2310: athrow         
        //  2311: iload           69
        //  2313: ldc_w           974479680
        //  2316: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2319: istore          69
        //  2321: goto            2332
        //  2324: ldc_w           1617615417
        //  2327: iload           69
        //  2329: ixor           
        //  2330: istore          69
        //  2332: pop            
        //  2333: iload           69
        //  2335: ldc_w           1862807945
        //  2338: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2341: istore          69
        //  2343: goto            476
        //  2346: iload           69
        //  2348: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2351: lookupswitch {
        //          -2081694013: 2596
        //          -1980992709: 2528
        //          -1971760679: 2705
        //          -1892784374: 2583
        //          -1692077982: 2539
        //          -1215462751: 2679
        //          -801920142: 2716
        //          -711046856: 2620
        //          -560555141: 2644
        //          -470188896: 2692
        //          -421621541: 2633
        //          -269333077: 2762
        //          133304594: 2749
        //          715279235: 2561
        //          884128506: 2609
        //          981162155: 2666
        //          1003361968: 2727
        //          1072362706: 2550
        //          1117131368: 2738
        //          1167510616: 2572
        //          1430580419: 2773
        //          default: 2655
        //        }
        //  2528: ldc_w           1125633999
        //  2531: iload           69
        //  2533: ixor           
        //  2534: istore          69
        //  2536: goto            2781
        //  2539: ldc_w           1632559012
        //  2542: iload           69
        //  2544: ixor           
        //  2545: istore          69
        //  2547: goto            2781
        //  2550: ldc_w           1977032498
        //  2553: iload           69
        //  2555: ixor           
        //  2556: istore          69
        //  2558: goto            2781
        //  2561: ldc_w           1467877592
        //  2564: iload           69
        //  2566: ixor           
        //  2567: istore          69
        //  2569: goto            2781
        //  2572: ldc_w           983078947
        //  2575: iload           69
        //  2577: ixor           
        //  2578: istore          69
        //  2580: goto            2781
        //  2583: iload           69
        //  2585: ldc_w           1674546505
        //  2588: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2591: istore          69
        //  2593: goto            2781
        //  2596: iload           69
        //  2598: ldc_w           1113012848
        //  2601: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2604: istore          69
        //  2606: goto            2781
        //  2609: ldc_w           1958483703
        //  2612: iload           69
        //  2614: ixor           
        //  2615: istore          69
        //  2617: goto            2781
        //  2620: iload           69
        //  2622: ldc_w           681150607
        //  2625: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2628: istore          69
        //  2630: goto            2781
        //  2633: ldc_w           1324454835
        //  2636: iload           69
        //  2638: ixor           
        //  2639: istore          69
        //  2641: goto            2781
        //  2644: ldc_w           1241027271
        //  2647: iload           69
        //  2649: ixor           
        //  2650: istore          69
        //  2652: goto            2781
        //  2655: new             Ljava/lang/RuntimeException;
        //  2658: dup            
        //  2659: ldc_w           "Error in hash"
        //  2662: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  2665: athrow         
        //  2666: iload           69
        //  2668: ldc_w           1432693437
        //  2671: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2674: istore          69
        //  2676: goto            2781
        //  2679: iload           69
        //  2681: ldc_w           81523196
        //  2684: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2687: istore          69
        //  2689: goto            2781
        //  2692: iload           69
        //  2694: ldc_w           777350716
        //  2697: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2700: istore          69
        //  2702: goto            2781
        //  2705: ldc_w           56978323
        //  2708: iload           69
        //  2710: ixor           
        //  2711: istore          69
        //  2713: goto            2781
        //  2716: ldc_w           1747727558
        //  2719: iload           69
        //  2721: ixor           
        //  2722: istore          69
        //  2724: goto            2781
        //  2727: ldc_w           894665598
        //  2730: iload           69
        //  2732: ixor           
        //  2733: istore          69
        //  2735: goto            2781
        //  2738: ldc_w           980976613
        //  2741: iload           69
        //  2743: ixor           
        //  2744: istore          69
        //  2746: goto            2781
        //  2749: iload           69
        //  2751: ldc_w           1926497162
        //  2754: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2757: istore          69
        //  2759: goto            2781
        //  2762: ldc_w           1339295773
        //  2765: iload           69
        //  2767: ixor           
        //  2768: istore          69
        //  2770: goto            2781
        //  2773: ldc_w           1484971056
        //  2776: iload           69
        //  2778: ixor           
        //  2779: istore          69
        //  2781: astore          34
        //  2783: aload           34
        //  2785: astore          64
        //  2787: ldc_w           995065065
        //  2790: iload           69
        //  2792: ixor           
        //  2793: istore          69
        //  2795: aload_0        
        //  2796: astore          35
        //  2798: aload           35
        //  2800: getfield        dev/daniboy/donutcore/database/SQLiteManager.plugin:Ldev/daniboy/donutcore/DonutCore;
        //  2803: astore          36
        //  2805: aload           36
        //  2807: invokevirtual   dev/daniboy/donutcore/DonutCore.getLogger:()Ljava/util/logging/Logger;
        //  2810: astore          37
        //  2812: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //  2815: astore          55
        //  2817: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.cvrjissejomunnn:()[B
        //  2820: iload           69
        //  2822: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //  2825: astore          61
        //  2827: aload           64
        //  2829: astore          62
        //  2831: aload           37
        //  2833: aload           55
        //  2835: aload           61
        //  2837: aload           62
        //  2839: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2842: ldc_w           728291764
        //  2845: iload           69
        //  2847: ixor           
        //  2848: istore          69
        //  2850: return         
        //  2851: iload           69
        //  2853: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2856: tableswitch {
        //          509398548: 2887
        //          default: 2876
        //        }
        //  2876: new             Ljava/lang/IllegalAccessException;
        //  2879: dup            
        //  2880: ldc_w           "Error in hash"
        //  2883: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  2886: athrow         
        //  2887: ldc_w           1301996405
        //  2890: iload           69
        //  2892: ixor           
        //  2893: istore          69
        //  2895: goto            447
        //  2898: iload           69
        //  2900: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2903: lookupswitch {
        //          -1971760679: 3016
        //          -1692077982: 3119
        //          -1215462751: 3130
        //          -801920142: 3062
        //          -421621541: 3038
        //          -269333077: 3051
        //          133304594: 3027
        //          715279235: 3108
        //          884128506: 3084
        //          981162155: 3154
        //          1072362706: 3095
        //          1117131368: 3073
        //          1167510616: 3141
        //          default: 3167
        //        }
        //  3016: ldc_w           1093816803
        //  3019: iload           69
        //  3021: ixor           
        //  3022: istore          69
        //  3024: goto            402
        //  3027: ldc_w           813906426
        //  3030: iload           69
        //  3032: ixor           
        //  3033: istore          69
        //  3035: goto            402
        //  3038: iload           69
        //  3040: ldc_w           212249027
        //  3043: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3046: istore          69
        //  3048: goto            402
        //  3051: ldc_w           226701933
        //  3054: iload           69
        //  3056: ixor           
        //  3057: istore          69
        //  3059: goto            402
        //  3062: ldc_w           712707766
        //  3065: iload           69
        //  3067: ixor           
        //  3068: istore          69
        //  3070: goto            402
        //  3073: ldc_w           2016393621
        //  3076: iload           69
        //  3078: ixor           
        //  3079: istore          69
        //  3081: goto            402
        //  3084: ldc_w           921382023
        //  3087: iload           69
        //  3089: ixor           
        //  3090: istore          69
        //  3092: goto            402
        //  3095: iload           69
        //  3097: ldc_w           931145026
        //  3100: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3103: istore          69
        //  3105: goto            402
        //  3108: ldc_w           355021480
        //  3111: iload           69
        //  3113: ixor           
        //  3114: istore          69
        //  3116: goto            402
        //  3119: ldc_w           588899796
        //  3122: iload           69
        //  3124: ixor           
        //  3125: istore          69
        //  3127: goto            402
        //  3130: ldc_w           1183632268
        //  3133: iload           69
        //  3135: ixor           
        //  3136: istore          69
        //  3138: goto            402
        //  3141: iload           69
        //  3143: ldc_w           2026873427
        //  3146: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3149: istore          69
        //  3151: goto            402
        //  3154: iload           69
        //  3156: ldc_w           389157069
        //  3159: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3162: istore          69
        //  3164: goto            402
        //  3167: new             Ljava/lang/IllegalAccessException;
        //  3170: dup            
        //  3171: ldc_w           "Error in hash"
        //  3174: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  3177: athrow         
        //    StackMapTable: 00 98 FF 01 22 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C FF 00 06 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 01 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 07 00 31 00 00 00 00 07 01 4D 07 04 9E 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1E 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 01 07 00 C0 1C FF 00 06 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 01 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 07 00 31 00 00 00 00 07 01 4D 07 04 9E 00 00 00 00 00 00 00 00 00 01 00 00 15 2E 0A 30 FF 00 0A 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 01 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 DC 00 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 07 00 31 00 00 00 00 07 01 4D 07 04 9E 00 00 00 00 00 00 00 00 00 01 00 00 16 47 07 00 C2 5D 07 00 C2 4A 07 00 C2 4A 07 00 C2 47 07 00 C2 00 30 FF 00 0A 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 58 07 00 C0 4A 07 00 C0 FF 00 0A 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 00 2D 07 0D 0A FF 00 0C 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 2D 07 0D 0C FF 00 0A 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 B5 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4C 07 00 97 49 07 00 97 FF 00 44 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 07 00 97 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 97 07 00 02 07 00 58 07 04 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 04 44 00 00 00 00 00 07 01 4D 00 00 07 00 97 00 00 00 00 00 01 00 00 2F 07 0C 47 07 00 C2 5E 07 00 C2 4A 07 00 C2 4A 07 00 C2 47 07 00 C2 FF 00 0B 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 75 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 FF 00 0A 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 14 47 07 00 C4 5E 07 00 C4 4C 07 00 C4 47 07 00 C4 00 2D 4A 07 00 C4 FF 00 0A 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 01 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 DC 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 07 00 31 00 00 00 00 07 01 4D 07 04 9E 00 00 00 00 00 00 00 00 00 01 00 00 15 07 16 47 07 00 C2 60 07 00 C2 4A 07 00 C2 4A 07 00 C2 47 07 00 C2 0D 2F FF 00 07 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 46 07 00 02 01 07 04 9E 01 07 01 4D 07 01 4D 01 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 00 04 07 00 DC 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 07 00 31 00 00 00 00 07 01 4D 07 04 9E 00 00 00 00 00 00 00 00 00 01 00 00 14 47 07 00 BD 5E 07 00 BD 4A 07 00 BD 4A 07 00 BD 49 07 00 BD FF 00 0B 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 00 14 47 07 00 C4 5E 07 00 C4 4A 07 00 C4 4C 07 00 C4 47 07 00 C4 FF 00 0D 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C4 F7 00 B5 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4C 07 00 C4 4C 07 00 C4 4A 07 00 C4 4C 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4C 07 00 C4 4C 07 00 C4 4C 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4C 07 00 C4 4A 07 00 C4 47 07 00 C4 FB 00 44 FF 00 00 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 01 07 00 C0 58 07 00 C0 4A 07 00 C0 FF 00 0A 00 46 07 00 02 01 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 75 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  101    259    1662   1934   Ljava/lang/Throwable;
        //  313    332    775    822    Ljava/lang/Throwable;
        //  70     371    2898   3178   Ljava/lang/Throwable;
        //  425    444    2851   2898   Ljava/lang/Throwable;
        //  46     483    1006   1662   Ljava/sql/SQLException;
        //  46     483    2346   2850   Ljava/io/IOException;
        //  1792   1813   1813   1934   Ljava/io/IOException;
        //  2248   2269   2269   2346   Ljava/io/IOException;
        //  633    654    654    775    Ljava/lang/RuntimeException;
        //  2144   2165   2165   2240   Ljava/lang/IllegalAccessException;
        //  1974   1995   1995   2072   Ljava/lang/RuntimeException;
        //  1568   1589   1589   1662   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0290:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void removeBillfordItem$1762603750(final ItemStack p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           2016740368
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_2        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          65
        //    16: ldc_w           1054807002
        //    19: iload           65
        //    21: ixor           
        //    22: istore          65
        //    24: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.ekmbuftfwjxsdoq:()[B
        //    27: iload           65
        //    29: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    32: astore_3       
        //    33: aload_3        
        //    34: astore          7
        //    36: ldc_w           338148060
        //    39: iload           65
        //    41: ixor           
        //    42: istore          65
        //    44: aload_0        
        //    45: astore          12
        //    47: aload           12
        //    49: ldc             1279769918
        //    51: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    54: astore          13
        //    56: aload           13
        //    58: astore          8
        //    60: ldc_w           1606699414
        //    63: iload           65
        //    65: ixor           
        //    66: istore          65
        //    68: aload           8
        //    70: astore          14
        //    72: aload           7
        //    74: astore          4
        //    76: aload           14
        //    78: aload           4
        //    80: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    85: astore          15
        //    87: aload           15
        //    89: astore          9
        //    91: ldc_w           873567524
        //    94: iload           65
        //    96: ixor           
        //    97: istore          65
        //    99: aload_1        
        //   100: astore          16
        //   102: aload           16
        //   104: invokestatic    dev/daniboy/donutcore/utils/ItemStackSerializer.serializeItemStack:(Lorg/bukkit/inventory/ItemStack;)Ljava/lang/String;
        //   107: astore          17
        //   109: aload           17
        //   111: astore          10
        //   113: ldc_w           1915902047
        //   116: iload           65
        //   118: ixor           
        //   119: istore          65
        //   121: aload           9
        //   123: astore          18
        //   125: ldc_w           976544899
        //   128: iload           65
        //   130: ixor           
        //   131: i2b            
        //   132: istore          49
        //   134: aload           10
        //   136: astore          5
        //   138: aload           18
        //   140: iload           49
        //   142: aload           5
        //   144: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   149: ldc_w           1574309761
        //   152: iload           65
        //   154: ixor           
        //   155: istore          65
        //   157: aload           9
        //   159: astore          19
        //   161: aload           19
        //   163: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   168: istore          20
        //   170: ldc_w           171025904
        //   173: iload           65
        //   175: ixor           
        //   176: istore          65
        //   178: aload_0        
        //   179: astore          21
        //   181: aload           21
        //   183: getfield        dev/daniboy/donutcore/database/SQLiteManager.billfordItemsCache:Ljava/util/Map;
        //   186: astore          22
        //   188: aload           22
        //   190: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   195: astore          23
        //   197: aload_1        
        //   198: astore          50
        //   200: aload           50
        //   202: invokedynamic   BootstrapMethod #2, test:(Lorg/bukkit/inventory/ItemStack;)Ljava/util/function/Predicate;
        //   207: astore          51
        //   209: aload           23
        //   211: aload           51
        //   213: invokeinterface java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
        //   218: istore          24
        //   220: ldc_w           2069665443
        //   223: iload           65
        //   225: ixor           
        //   226: istore          65
        //   228: aload           9
        //   230: astore          25
        //   232: aload           25
        //   234: ifnull          452
        //   237: ldc_w           790336533
        //   240: iload           65
        //   242: ixor           
        //   243: istore          65
        //   245: aload           9
        //   247: astore          26
        //   249: aload           26
        //   251: invokeinterface java/sql/PreparedStatement.close:()V
        //   256: goto            2198
        //   259: astore          43
        //   261: aload           43
        //   263: astore          63
        //   265: aload           9
        //   267: astore          44
        //   269: aload           44
        //   271: ifnull          753
        //   274: ldc_w           1670926226
        //   277: iload           65
        //   279: ixor           
        //   280: istore          65
        //   282: aload           9
        //   284: astore          45
        //   286: aload           45
        //   288: invokeinterface java/sql/PreparedStatement.close:()V
        //   293: ldc_w           923099624
        //   296: iload           65
        //   298: ixor           
        //   299: istore          65
        //   301: goto            1190
        //   304: astore          46
        //   306: aload           46
        //   308: astore          11
        //   310: aload           63
        //   312: astore          47
        //   314: aload           11
        //   316: astore          55
        //   318: aload           47
        //   320: aload           55
        //   322: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   325: ldc_w           350422849
        //   328: iload           65
        //   330: ixor           
        //   331: istore          65
        //   333: aload           63
        //   335: astore          48
        //   337: aload           48
        //   339: athrow         
        //   340: aload           8
        //   342: astore          27
        //   344: aload           27
        //   346: ifnull          847
        //   349: ldc_w           2100775235
        //   352: iload           65
        //   354: ixor           
        //   355: istore          65
        //   357: aload           8
        //   359: astore          28
        //   361: aload           28
        //   363: invokeinterface java/sql/Connection.close:()V
        //   368: goto            938
        //   371: astore          37
        //   373: aload           37
        //   375: astore          61
        //   377: aload           8
        //   379: astore          38
        //   381: aload           38
        //   383: ifnull          2150
        //   386: ldc_w           1061026699
        //   389: iload           65
        //   391: ixor           
        //   392: istore          65
        //   394: aload           8
        //   396: astore          39
        //   398: aload           39
        //   400: invokeinterface java/sql/Connection.close:()V
        //   405: ldc_w           53217646
        //   408: iload           65
        //   410: ixor           
        //   411: istore          65
        //   413: goto            495
        //   416: astore          40
        //   418: aload           40
        //   420: astore          62
        //   422: aload           61
        //   424: astore          41
        //   426: aload           62
        //   428: astore          54
        //   430: aload           41
        //   432: aload           54
        //   434: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   437: ldc_w           1555473700
        //   440: iload           65
        //   442: ixor           
        //   443: istore          65
        //   445: aload           61
        //   447: astore          42
        //   449: aload           42
        //   451: athrow         
        //   452: ldc_w           279094235
        //   455: iload           65
        //   457: ixor           
        //   458: istore          65
        //   460: iload           65
        //   462: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   465: ldc_w           97166847
        //   468: if_icmpeq       482
        //   471: ldc_w           48962919
        //   474: iload           65
        //   476: ixor           
        //   477: istore          65
        //   479: goto            2355
        //   482: iload           65
        //   484: ldc_w           45418123
        //   487: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   490: istore          65
        //   492: goto            340
        //   495: ldc_w           1301006487
        //   498: iload           65
        //   500: ixor           
        //   501: istore          65
        //   503: iload           65
        //   505: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   508: ldc_w           130351580
        //   511: if_icmpeq       516
        //   514: aconst_null    
        //   515: athrow         
        //   516: new             Ljava/io/IOException;
        //   519: dup            
        //   520: invokespecial   java/io/IOException.<init>:()V
        //   523: athrow         
        //   524: iload           65
        //   526: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   529: lookupswitch {
        //          1500034544: 567
        //          2062361379: 578
        //          default: 556
        //        }
        //   556: new             Ljava/lang/IllegalAccessException;
        //   559: dup            
        //   560: ldc_w           "Error in hash"
        //   563: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   566: athrow         
        //   567: ldc_w           358814254
        //   570: iload           65
        //   572: ixor           
        //   573: istore          65
        //   575: goto            586
        //   578: ldc_w           1897111796
        //   581: iload           65
        //   583: ixor           
        //   584: istore          65
        //   586: pop            
        //   587: iload           65
        //   589: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   592: lookupswitch {
        //          174864093: 2355
        //          179779225: 636
        //          243921614: 587
        //          1906223885: 445
        //          default: 2355
        //        }
        //   636: ldc_w           1518282689
        //   639: iload           65
        //   641: ixor           
        //   642: istore          65
        //   644: goto            445
        //   647: iload           65
        //   649: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   652: lookupswitch {
        //          -777575407: 709
        //          1058494491: 696
        //          1077274346: 742
        //          1855616923: 731
        //          default: 720
        //        }
        //   696: iload           65
        //   698: ldc_w           247708949
        //   701: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   704: istore          65
        //   706: goto            259
        //   709: ldc_w           1393930900
        //   712: iload           65
        //   714: ixor           
        //   715: istore          65
        //   717: goto            259
        //   720: new             Ljava/lang/RuntimeException;
        //   723: dup            
        //   724: ldc_w           "Error in hash"
        //   727: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   730: athrow         
        //   731: ldc_w           82974949
        //   734: iload           65
        //   736: ixor           
        //   737: istore          65
        //   739: goto            259
        //   742: ldc_w           556264139
        //   745: iload           65
        //   747: ixor           
        //   748: istore          65
        //   750: goto            259
        //   753: ldc_w           1609239360
        //   756: iload           65
        //   758: ixor           
        //   759: istore          65
        //   761: iload           65
        //   763: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   766: ldc_w           170402332
        //   769: if_icmpeq       775
        //   772: goto            788
        //   775: iload           65
        //   777: ldc_w           638945771
        //   780: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   783: istore          65
        //   785: goto            333
        //   788: iload           65
        //   790: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   793: lookupswitch {
        //          170402332: 836
        //          492646230: 788
        //          1185730219: 2355
        //          2090711387: 2355
        //          default: 2355
        //        }
        //   836: ldc_w           839662522
        //   839: iload           65
        //   841: ixor           
        //   842: istore          65
        //   844: goto            2355
        //   847: ldc_w           1176396580
        //   850: iload           65
        //   852: ixor           
        //   853: istore          65
        //   855: iload           65
        //   857: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   860: ldc_w           14915811
        //   863: if_icmpeq       869
        //   866: goto            927
        //   869: iload           65
        //   871: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   874: lookupswitch {
        //          14915811: 916
        //          741583011: 1039
        //          1200047549: 2355
        //          1781128926: 869
        //          default: 2355
        //        }
        //   916: ldc_w           871943167
        //   919: iload           65
        //   921: ixor           
        //   922: istore          65
        //   924: goto            1039
        //   927: ldc_w           1178630344
        //   930: iload           65
        //   932: ixor           
        //   933: istore          65
        //   935: goto            2355
        //   938: iload           65
        //   940: ldc_w           1260291847
        //   943: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   946: istore          65
        //   948: iload           65
        //   950: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   953: ldc_w           37255650
        //   956: if_icmpeq       961
        //   959: aconst_null    
        //   960: athrow         
        //   961: new             Ljava/lang/IllegalAccessException;
        //   964: dup            
        //   965: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //   968: athrow         
        //   969: iload           65
        //   971: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   974: lookupswitch {
        //          -1785882079: 1022
        //          -1173410368: 1011
        //          default: 1000
        //        }
        //  1000: new             Ljava/io/IOException;
        //  1003: dup            
        //  1004: ldc_w           "Error in hash"
        //  1007: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1010: athrow         
        //  1011: ldc_w           266108656
        //  1014: iload           65
        //  1016: ixor           
        //  1017: istore          65
        //  1019: goto            1030
        //  1022: ldc_w           707536908
        //  1025: iload           65
        //  1027: ixor           
        //  1028: istore          65
        //  1030: pop            
        //  1031: ldc_w           1776504467
        //  1034: iload           65
        //  1036: ixor           
        //  1037: istore          65
        //  1039: iload           65
        //  1041: ldc_w           1950456275
        //  1044: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1047: istore          65
        //  1049: iload           65
        //  1051: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1054: ldc_w           82530936
        //  1057: if_icmpeq       1062
        //  1060: aconst_null    
        //  1061: athrow         
        //  1062: new             Ljava/lang/IllegalAccessException;
        //  1065: dup            
        //  1066: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1069: athrow         
        //  1070: iload           65
        //  1072: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1075: lookupswitch {
        //          -2135888789: 1111
        //          704274496: 1122
        //          default: 1100
        //        }
        //  1100: new             Ljava/io/IOException;
        //  1103: dup            
        //  1104: ldc_w           "Error in hash"
        //  1107: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1110: athrow         
        //  1111: ldc_w           790551117
        //  1114: iload           65
        //  1116: ixor           
        //  1117: istore          65
        //  1119: goto            1132
        //  1122: iload           65
        //  1124: ldc_w           1513589704
        //  1127: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1130: istore          65
        //  1132: pop            
        //  1133: iload           65
        //  1135: ldc_w           419689908
        //  1138: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1141: istore          65
        //  1143: goto            2901
        //  1146: iload           65
        //  1148: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1151: tableswitch {
        //          530995666: 1179
        //          default: 1168
        //        }
        //  1168: new             Ljava/lang/RuntimeException;
        //  1171: dup            
        //  1172: ldc_w           "Error in hash"
        //  1175: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1178: athrow         
        //  1179: ldc_w           964551656
        //  1182: iload           65
        //  1184: ixor           
        //  1185: istore          65
        //  1187: goto            416
        //  1190: ldc_w           783127695
        //  1193: iload           65
        //  1195: ixor           
        //  1196: istore          65
        //  1198: iload           65
        //  1200: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1203: ldc_w           83012070
        //  1206: if_icmpeq       1211
        //  1209: aconst_null    
        //  1210: athrow         
        //  1211: new             Ljava/io/IOException;
        //  1214: dup            
        //  1215: invokespecial   java/io/IOException.<init>:()V
        //  1218: athrow         
        //  1219: iload           65
        //  1221: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1224: lookupswitch {
        //          -1735432424: 1252
        //          55850816: 1263
        //          default: 1285
        //        }
        //  1252: ldc_w           1877843136
        //  1255: iload           65
        //  1257: ixor           
        //  1258: istore          65
        //  1260: goto            1273
        //  1263: iload           65
        //  1265: ldc_w           2090268363
        //  1268: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1271: istore          65
        //  1273: pop            
        //  1274: ldc_w           1814275230
        //  1277: iload           65
        //  1279: ixor           
        //  1280: istore          65
        //  1282: goto            333
        //  1285: new             Ljava/io/IOException;
        //  1288: dup            
        //  1289: ldc_w           "Error in hash"
        //  1292: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1295: athrow         
        //  1296: iload           65
        //  1298: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1301: lookupswitch {
        //          -2030131736: 1478
        //          -1266761088: 1504
        //          -861773271: 1467
        //          -777575407: 1456
        //          -524726325: 1517
        //          -303840415: 1445
        //          568762336: 1550
        //          1058494491: 1528
        //          1077274346: 1421
        //          1225437363: 1491
        //          1439222816: 1434
        //          1855616923: 1408
        //          default: 1539
        //        }
        //  1408: iload           65
        //  1410: ldc_w           1930744037
        //  1413: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1416: istore          65
        //  1418: goto            371
        //  1421: iload           65
        //  1423: ldc_w           1455497931
        //  1426: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1429: istore          65
        //  1431: goto            371
        //  1434: ldc_w           343836562
        //  1437: iload           65
        //  1439: ixor           
        //  1440: istore          65
        //  1442: goto            371
        //  1445: ldc_w           595322490
        //  1448: iload           65
        //  1450: ixor           
        //  1451: istore          65
        //  1453: goto            371
        //  1456: ldc_w           619936404
        //  1459: iload           65
        //  1461: ixor           
        //  1462: istore          65
        //  1464: goto            371
        //  1467: ldc_w           659804755
        //  1470: iload           65
        //  1472: ixor           
        //  1473: istore          65
        //  1475: goto            371
        //  1478: iload           65
        //  1480: ldc_w           236473003
        //  1483: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1486: istore          65
        //  1488: goto            371
        //  1491: iload           65
        //  1493: ldc_w           2011613184
        //  1496: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1499: istore          65
        //  1501: goto            371
        //  1504: iload           65
        //  1506: ldc_w           138954310
        //  1509: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1512: istore          65
        //  1514: goto            371
        //  1517: ldc_w           1657845743
        //  1520: iload           65
        //  1522: ixor           
        //  1523: istore          65
        //  1525: goto            371
        //  1528: ldc_w           2032497941
        //  1531: iload           65
        //  1533: ixor           
        //  1534: istore          65
        //  1536: goto            371
        //  1539: new             Ljava/lang/IllegalAccessException;
        //  1542: dup            
        //  1543: ldc_w           "Error in hash"
        //  1546: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1549: athrow         
        //  1550: ldc_w           452677098
        //  1553: iload           65
        //  1555: ixor           
        //  1556: istore          65
        //  1558: goto            371
        //  1561: iload           65
        //  1563: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1566: lookupswitch {
        //          -2030131736: 1898
        //          -1266761088: 1780
        //          -1002687576: 1920
        //          -861773271: 1863
        //          -847666661: 1850
        //          -777575407: 1966
        //          -524726325: 1769
        //          -303840415: 1747
        //          -163778384: 1791
        //          265497833: 1826
        //          380856217: 1802
        //          513475449: 1931
        //          562633354: 1909
        //          568762336: 1758
        //          616818688: 1815
        //          1058494491: 1944
        //          1077274346: 1885
        //          1225437363: 1837
        //          1439222816: 1874
        //          1855616923: 1955
        //          default: 1736
        //        }
        //  1736: new             Ljava/io/IOException;
        //  1739: dup            
        //  1740: ldc_w           "Error in hash"
        //  1743: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1746: athrow         
        //  1747: ldc_w           2054791241
        //  1750: iload           65
        //  1752: ixor           
        //  1753: istore          65
        //  1755: goto            1974
        //  1758: ldc_w           1140394969
        //  1761: iload           65
        //  1763: ixor           
        //  1764: istore          65
        //  1766: goto            1974
        //  1769: ldc_w           1003680220
        //  1772: iload           65
        //  1774: ixor           
        //  1775: istore          65
        //  1777: goto            1974
        //  1780: ldc_w           1363804277
        //  1783: iload           65
        //  1785: ixor           
        //  1786: istore          65
        //  1788: goto            1974
        //  1791: ldc_w           1493321267
        //  1794: iload           65
        //  1796: ixor           
        //  1797: istore          65
        //  1799: goto            1974
        //  1802: iload           65
        //  1804: ldc_w           1695790294
        //  1807: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1810: istore          65
        //  1812: goto            1974
        //  1815: ldc_w           1130210597
        //  1818: iload           65
        //  1820: ixor           
        //  1821: istore          65
        //  1823: goto            1974
        //  1826: ldc_w           1715453368
        //  1829: iload           65
        //  1831: ixor           
        //  1832: istore          65
        //  1834: goto            1974
        //  1837: iload           65
        //  1839: ldc_w           786730547
        //  1842: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1845: istore          65
        //  1847: goto            1974
        //  1850: iload           65
        //  1852: ldc_w           1047194726
        //  1855: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1858: istore          65
        //  1860: goto            1974
        //  1863: ldc_w           2119275616
        //  1866: iload           65
        //  1868: ixor           
        //  1869: istore          65
        //  1871: goto            1974
        //  1874: ldc_w           1300021665
        //  1877: iload           65
        //  1879: ixor           
        //  1880: istore          65
        //  1882: goto            1974
        //  1885: iload           65
        //  1887: ldc_w           264463608
        //  1890: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1893: istore          65
        //  1895: goto            1974
        //  1898: ldc_w           1461324952
        //  1901: iload           65
        //  1903: ixor           
        //  1904: istore          65
        //  1906: goto            1974
        //  1909: ldc_w           66386804
        //  1912: iload           65
        //  1914: ixor           
        //  1915: istore          65
        //  1917: goto            1974
        //  1920: ldc_w           1598185040
        //  1923: iload           65
        //  1925: ixor           
        //  1926: istore          65
        //  1928: goto            1974
        //  1931: iload           65
        //  1933: ldc_w           1679210570
        //  1936: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1939: istore          65
        //  1941: goto            1974
        //  1944: ldc_w           539439910
        //  1947: iload           65
        //  1949: ixor           
        //  1950: istore          65
        //  1952: goto            1974
        //  1955: ldc_w           706123478
        //  1958: iload           65
        //  1960: ixor           
        //  1961: istore          65
        //  1963: goto            1974
        //  1966: ldc_w           2112961703
        //  1969: iload           65
        //  1971: ixor           
        //  1972: istore          65
        //  1974: astore          29
        //  1976: aload           29
        //  1978: astore          59
        //  1980: ldc_w           827700293
        //  1983: iload           65
        //  1985: ixor           
        //  1986: istore          65
        //  1988: aload_0        
        //  1989: astore          30
        //  1991: aload           30
        //  1993: getfield        dev/daniboy/donutcore/database/SQLiteManager.plugin:Ldev/daniboy/donutcore/DonutCore;
        //  1996: astore          31
        //  1998: aload           31
        //  2000: invokevirtual   dev/daniboy/donutcore/DonutCore.getLogger:()Ljava/util/logging/Logger;
        //  2003: astore          32
        //  2005: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //  2008: astore          52
        //  2010: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.euwbrxibyahhifc:()[B
        //  2013: iload           65
        //  2015: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //  2018: astore          56
        //  2020: aload           59
        //  2022: astore          6
        //  2024: aload           32
        //  2026: aload           52
        //  2028: aload           56
        //  2030: aload           6
        //  2032: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2035: ldc_w           1499708874
        //  2038: iload           65
        //  2040: ixor           
        //  2041: istore          65
        //  2043: iload           65
        //  2045: ldc_w           2063687637
        //  2048: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2051: istore          65
        //  2053: iload           65
        //  2055: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2058: ldc_w           76914916
        //  2061: if_icmpeq       2066
        //  2064: aconst_null    
        //  2065: athrow         
        //  2066: new             Ljava/lang/RuntimeException;
        //  2069: dup            
        //  2070: invokespecial   java/lang/RuntimeException.<init>:()V
        //  2073: athrow         
        //  2074: iload           65
        //  2076: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2079: lookupswitch {
        //          -1483443206: 2126
        //          1640280688: 2115
        //          default: 2104
        //        }
        //  2104: new             Ljava/io/IOException;
        //  2107: dup            
        //  2108: ldc_w           "Error in hash"
        //  2111: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2114: athrow         
        //  2115: ldc_w           170812230
        //  2118: iload           65
        //  2120: ixor           
        //  2121: istore          65
        //  2123: goto            2136
        //  2126: iload           65
        //  2128: ldc_w           1390705527
        //  2131: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2134: istore          65
        //  2136: pop            
        //  2137: iload           65
        //  2139: ldc_w           1075693436
        //  2142: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2145: istore          65
        //  2147: goto            2901
        //  2150: ldc_w           1770257628
        //  2153: iload           65
        //  2155: ixor           
        //  2156: istore          65
        //  2158: iload           65
        //  2160: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2163: ldc_w           118753315
        //  2166: if_icmpeq       2172
        //  2169: goto            2185
        //  2172: iload           65
        //  2174: ldc_w           863322523
        //  2177: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2180: istore          65
        //  2182: goto            445
        //  2185: iload           65
        //  2187: ldc_w           1937900582
        //  2190: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2193: istore          65
        //  2195: goto            2355
        //  2198: iload           65
        //  2200: ldc_w           188635080
        //  2203: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2206: istore          65
        //  2208: iload           65
        //  2210: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2213: ldc_w           36284363
        //  2216: if_icmpeq       2221
        //  2219: aconst_null    
        //  2220: athrow         
        //  2221: new             Ljava/lang/RuntimeException;
        //  2224: dup            
        //  2225: invokespecial   java/lang/RuntimeException.<init>:()V
        //  2228: athrow         
        //  2229: iload           65
        //  2231: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2234: lookupswitch {
        //          -1789862807: 2284
        //          -616664485: 2260
        //          default: 2273
        //        }
        //  2260: iload           65
        //  2262: ldc_w           800377135
        //  2265: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2268: istore          65
        //  2270: goto            2294
        //  2273: new             Ljava/io/IOException;
        //  2276: dup            
        //  2277: ldc_w           "Error in hash"
        //  2280: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2283: athrow         
        //  2284: iload           65
        //  2286: ldc_w           1719213289
        //  2289: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2292: istore          65
        //  2294: pop            
        //  2295: iload           65
        //  2297: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2300: lookupswitch {
        //          72911490: 2344
        //          1057184801: 340
        //          1486444113: 2295
        //          1960788443: 2355
        //          default: 2355
        //        }
        //  2344: ldc_w           1347123812
        //  2347: iload           65
        //  2349: ixor           
        //  2350: istore          65
        //  2352: goto            340
        //  2355: new             Ljava/io/IOException;
        //  2358: dup            
        //  2359: invokespecial   java/io/IOException.<init>:()V
        //  2362: athrow         
        //  2363: iload           65
        //  2365: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2368: tableswitch {
        //          -1416521664: 2388
        //          default: 2401
        //        }
        //  2388: iload           65
        //  2390: ldc_w           243649144
        //  2393: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2396: istore          65
        //  2398: goto            304
        //  2401: new             Ljava/lang/IllegalAccessException;
        //  2404: dup            
        //  2405: ldc_w           "Error in hash"
        //  2408: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  2411: athrow         
        //  2412: iload           65
        //  2414: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2417: lookupswitch {
        //          -2030131736: 2798
        //          -1266761088: 2627
        //          -1002687576: 2614
        //          -861773271: 2776
        //          -847666661: 2601
        //          -777575407: 2673
        //          -524726325: 2708
        //          -303840415: 2649
        //          -163778384: 2743
        //          265497833: 2730
        //          380856217: 2824
        //          513475449: 2588
        //          562633354: 2765
        //          568762336: 2638
        //          616818688: 2811
        //          1058494491: 2686
        //          1077274346: 2787
        //          1225437363: 2754
        //          1439222816: 2719
        //          1855616923: 2697
        //          default: 2662
        //        }
        //  2588: iload           65
        //  2590: ldc_w           1681842789
        //  2593: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2596: istore          65
        //  2598: goto            2832
        //  2601: iload           65
        //  2603: ldc_w           1044559433
        //  2606: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2609: istore          65
        //  2611: goto            2832
        //  2614: iload           65
        //  2616: ldc_w           1600783487
        //  2619: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2622: istore          65
        //  2624: goto            2832
        //  2627: ldc_w           1365400154
        //  2630: iload           65
        //  2632: ixor           
        //  2633: istore          65
        //  2635: goto            2832
        //  2638: ldc_w           1137791478
        //  2641: iload           65
        //  2643: ixor           
        //  2644: istore          65
        //  2646: goto            2832
        //  2649: iload           65
        //  2651: ldc_w           2052192870
        //  2654: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2657: istore          65
        //  2659: goto            2832
        //  2662: new             Ljava/io/IOException;
        //  2665: dup            
        //  2666: ldc_w           "Error in hash"
        //  2669: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2672: athrow         
        //  2673: iload           65
        //  2675: ldc_w           2111399560
        //  2678: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2681: istore          65
        //  2683: goto            2832
        //  2686: ldc_w           537880841
        //  2689: iload           65
        //  2691: ixor           
        //  2692: istore          65
        //  2694: goto            2832
        //  2697: ldc_w           708758777
        //  2700: iload           65
        //  2702: ixor           
        //  2703: istore          65
        //  2705: goto            2832
        //  2708: ldc_w           1006283763
        //  2711: iload           65
        //  2713: ixor           
        //  2714: istore          65
        //  2716: goto            2832
        //  2719: ldc_w           1297390478
        //  2722: iload           65
        //  2724: ixor           
        //  2725: istore          65
        //  2727: goto            2832
        //  2730: iload           65
        //  2732: ldc_w           1712842647
        //  2735: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2738: istore          65
        //  2740: goto            2832
        //  2743: ldc_w           1495931932
        //  2746: iload           65
        //  2748: ixor           
        //  2749: istore          65
        //  2751: goto            2832
        //  2754: ldc_w           785175580
        //  2757: iload           65
        //  2759: ixor           
        //  2760: istore          65
        //  2762: goto            2832
        //  2765: ldc_w           64790875
        //  2768: iload           65
        //  2770: ixor           
        //  2771: istore          65
        //  2773: goto            2832
        //  2776: ldc_w           2121911887
        //  2779: iload           65
        //  2781: ixor           
        //  2782: istore          65
        //  2784: goto            2832
        //  2787: ldc_w           267075287
        //  2790: iload           65
        //  2792: ixor           
        //  2793: istore          65
        //  2795: goto            2832
        //  2798: iload           65
        //  2800: ldc_w           1462916791
        //  2803: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2806: istore          65
        //  2808: goto            2832
        //  2811: iload           65
        //  2813: ldc_w           1131806474
        //  2816: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2819: istore          65
        //  2821: goto            2832
        //  2824: ldc_w           1698426617
        //  2827: iload           65
        //  2829: ixor           
        //  2830: istore          65
        //  2832: astore          33
        //  2834: aload           33
        //  2836: astore          60
        //  2838: ldc_w           339265318
        //  2841: iload           65
        //  2843: ixor           
        //  2844: istore          65
        //  2846: aload_0        
        //  2847: astore          34
        //  2849: aload           34
        //  2851: getfield        dev/daniboy/donutcore/database/SQLiteManager.plugin:Ldev/daniboy/donutcore/DonutCore;
        //  2854: astore          35
        //  2856: aload           35
        //  2858: invokevirtual   dev/daniboy/donutcore/DonutCore.getLogger:()Ljava/util/logging/Logger;
        //  2861: astore          36
        //  2863: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //  2866: astore          53
        //  2868: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rhzqmqlgkitnsvm:()[B
        //  2871: iload           65
        //  2873: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //  2876: astore          57
        //  2878: aload           60
        //  2880: astore          58
        //  2882: aload           36
        //  2884: aload           53
        //  2886: aload           57
        //  2888: aload           58
        //  2890: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2893: ldc_w           366901080
        //  2896: iload           65
        //  2898: ixor           
        //  2899: istore          65
        //  2901: return         
        //    StackMapTable: 00 8B FF 01 03 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C FF 00 06 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 07 01 4D 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 04 C6 01 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 07 04 9E 07 05 47 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1E 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 01 07 00 C0 1C FF 00 06 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 07 01 4D 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 04 C6 01 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 07 04 9E 07 05 47 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 1D FF 00 0C 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 00 14 47 07 00 C4 5F 07 00 C4 4A 07 00 C4 4A 07 00 C4 47 07 00 C4 00 30 FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 70 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 15 0C 2F FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 07 01 4D 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 04 C6 01 07 00 DC 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 07 04 9E 07 05 47 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 15 2E 0A FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 07 01 4D 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 04 C6 01 07 00 DC 00 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 07 04 9E 07 05 47 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 16 47 07 00 BD 5E 07 00 BD 4A 07 00 BD 4A 07 00 BD 47 07 00 BD FF 00 08 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 07 01 4D 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 04 C6 01 07 00 DC 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 07 04 9E 07 05 47 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 16 47 07 00 BD 5D 07 00 BD 4A 07 00 BD 4A 07 00 BD 49 07 00 BD FF 00 0D 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 01 07 00 C0 55 07 00 C0 4A 07 00 C0 FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 14 47 07 00 C4 60 07 00 C4 4A 07 00 C4 49 07 00 C4 4B 07 00 C4 FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 6F 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 AE 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 47 07 00 97 FF 00 5B 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 07 00 97 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 97 07 00 02 07 00 58 07 04 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 04 44 00 00 00 07 01 4D 00 00 07 00 97 00 00 00 00 00 01 00 00 47 07 00 C2 5D 07 00 C2 4A 07 00 C2 4A 07 00 C2 49 07 00 C2 FF 00 0D 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 00 15 0C FF 00 0C 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 07 01 4D 00 07 01 4D 07 00 D5 07 00 DC 07 01 4D 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 04 9E 07 01 4D 07 00 DC 07 00 DC 01 07 00 02 07 01 A2 07 04 C6 01 07 00 DC 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 07 04 9E 07 05 47 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 16 47 07 00 C2 5E 07 00 C2 4C 07 00 C2 4A 07 00 C2 49 07 00 C2 00 30 FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 07 00 D5 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 42 07 00 02 07 04 9E 01 07 01 4D 07 01 4D 00 00 07 01 4D 07 00 D5 07 00 DC 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 58 07 00 C0 4C 07 00 C0 FF 00 0A 00 42 07 00 02 07 04 9E 01 07 01 4D 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C4 F7 00 AF 07 00 C4 4C 07 00 C4 4C 07 00 C4 4C 07 00 C4 4A 07 00 C4 4A 07 00 C4 4C 07 00 C4 4A 07 00 C4 4C 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4C 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4A 07 00 C4 4C 07 00 C4 4C 07 00 C4 47 07 00 C4 FB 00 44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  99     228    647    2412   Ljava/lang/Throwable;
        //  282    301    2363   2412   Ljava/lang/Throwable;
        //  68     340    1296   2198   Ljava/lang/Throwable;
        //  394    413    1146   1190   Ljava/lang/Throwable;
        //  44     452    1561   2150   Ljava/sql/SQLException;
        //  44     452    2412   2901   Ljava/io/IOException;
        //  1198   1219   1219   1296   Ljava/io/IOException;
        //  2208   2229   2229   2355   Ljava/lang/RuntimeException;
        //  2053   2074   2074   2150   Ljava/lang/RuntimeException;
        //  503    524    524    647    Ljava/io/IOException;
        //  1049   1070   1070   1146   Ljava/lang/IllegalAccessException;
        //  948    969    969    1039   Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 922 out of bounds for length 922
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at w5.a.o(SourceFile:31)
        //     at w5.a.o(SourceFile:733)
        //     at w5.a.j(SourceFile:218)
        //     at a6.j.j(SourceFile:23)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Map<Integer, ItemStack> getAllBillfordItems$1462928060(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           684790167
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_1        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          85
        //    16: ldc_w           632504624
        //    19: iload           85
        //    21: ixor           
        //    22: istore          85
        //    24: new             Ljava/util/concurrent/ConcurrentHashMap;
        //    27: astore_2       
        //    28: aload_2        
        //    29: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //    32: aload_2        
        //    33: astore          5
        //    35: ldc_w           590660549
        //    38: iload           85
        //    40: ixor           
        //    41: istore          85
        //    43: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.jnanbqrpcbrzood:()[B
        //    46: iload           85
        //    48: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    51: astore          13
        //    53: aload           13
        //    55: astore          6
        //    57: ldc_w           683339703
        //    60: iload           85
        //    62: ixor           
        //    63: istore          85
        //    65: aload_0        
        //    66: astore          14
        //    68: aload           14
        //    70: ldc             1279769918
        //    72: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    75: astore          15
        //    77: aload           15
        //    79: astore          7
        //    81: ldc_w           1309105061
        //    84: iload           85
        //    86: ixor           
        //    87: istore          85
        //    89: aload           7
        //    91: astore          16
        //    93: aload           6
        //    95: astore          63
        //    97: aload           16
        //    99: aload           63
        //   101: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   106: astore          17
        //   108: aload           17
        //   110: astore          8
        //   112: ldc_w           1682271718
        //   115: iload           85
        //   117: ixor           
        //   118: istore          85
        //   120: aload           8
        //   122: astore          18
        //   124: aload           18
        //   126: invokeinterface java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        //   131: astore          19
        //   133: aload           19
        //   135: astore          9
        //   137: ldc_w           935777258
        //   140: iload           85
        //   142: ixor           
        //   143: istore          85
        //   145: aload           9
        //   147: astore          20
        //   149: aload           20
        //   151: invokeinterface java/sql/ResultSet.next:()Z
        //   156: istore          21
        //   158: iload           21
        //   160: ldc_w           1050921585
        //   163: iload           85
        //   165: ixor           
        //   166: if_icmpeq       4235
        //   169: ldc_w           207484935
        //   172: iload           85
        //   174: ixor           
        //   175: istore          85
        //   177: aload           9
        //   179: astore          45
        //   181: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.etlhmjmznqukgcn:()[B
        //   184: iload           85
        //   186: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   189: astore          67
        //   191: aload           45
        //   193: aload           67
        //   195: invokeinterface java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        //   200: istore          46
        //   202: iload           46
        //   204: istore          80
        //   206: ldc_w           1163649546
        //   209: iload           85
        //   211: ixor           
        //   212: istore          85
        //   214: aload           9
        //   216: astore          47
        //   218: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.wkqsjulbqcybbmx:()[B
        //   221: iload           85
        //   223: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   226: astore          68
        //   228: aload           47
        //   230: aload           68
        //   232: invokeinterface java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   237: astore          48
        //   239: aload           48
        //   241: astore          11
        //   243: ldc_w           859246861
        //   246: iload           85
        //   248: ixor           
        //   249: istore          85
        //   251: aload           11
        //   253: astore          49
        //   255: aload           49
        //   257: invokestatic    dev/daniboy/donutcore/utils/ItemStackSerializer.deserializeItemStack:(Ljava/lang/String;)Lorg/bukkit/inventory/ItemStack;
        //   260: astore          50
        //   262: aload           50
        //   264: astore          12
        //   266: ldc_w           2081262952
        //   269: iload           85
        //   271: ixor           
        //   272: istore          85
        //   274: aload           5
        //   276: astore          51
        //   278: iload           80
        //   280: istore          69
        //   282: iload           69
        //   284: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   287: astore          70
        //   289: aload           12
        //   291: astore          73
        //   293: aload           51
        //   295: aload           70
        //   297: aload           73
        //   299: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   304: astore          52
        //   306: ldc_w           1459219503
        //   309: iload           85
        //   311: ixor           
        //   312: istore          85
        //   314: goto            2042
        //   317: astore          59
        //   319: aload           59
        //   321: astore          83
        //   323: ldc_w           1154563126
        //   326: iload           85
        //   328: ixor           
        //   329: istore          85
        //   331: aload_0        
        //   332: astore          60
        //   334: aload           60
        //   336: getfield        dev/daniboy/donutcore/database/SQLiteManager.plugin:Ldev/daniboy/donutcore/DonutCore;
        //   339: astore          61
        //   341: aload           61
        //   343: invokevirtual   dev/daniboy/donutcore/DonutCore.getLogger:()Ljava/util/logging/Logger;
        //   346: astore          62
        //   348: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   351: astore          72
        //   353: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.juvbzlmwvhagfdh:()[B
        //   356: iload           85
        //   358: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   361: astore          74
        //   363: aload           83
        //   365: astore          75
        //   367: aload           62
        //   369: aload           72
        //   371: aload           74
        //   373: aload           75
        //   375: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   378: ldc_w           165166671
        //   381: iload           85
        //   383: ixor           
        //   384: istore          85
        //   386: goto            4281
        //   389: aload           9
        //   391: astore          22
        //   393: aload           22
        //   395: ifnull          4190
        //   398: ldc_w           1822892333
        //   401: iload           85
        //   403: ixor           
        //   404: istore          85
        //   406: aload           9
        //   408: astore          23
        //   410: aload           23
        //   412: invokeinterface java/sql/ResultSet.close:()V
        //   417: goto            2239
        //   420: astore          53
        //   422: aload           53
        //   424: astore          81
        //   426: aload           9
        //   428: astore          54
        //   430: aload           54
        //   432: ifnull          3592
        //   435: ldc_w           548405990
        //   438: iload           85
        //   440: ixor           
        //   441: istore          85
        //   443: aload           9
        //   445: astore          55
        //   447: aload           55
        //   449: invokeinterface java/sql/ResultSet.close:()V
        //   454: ldc_w           1183908973
        //   457: iload           85
        //   459: ixor           
        //   460: istore          85
        //   462: goto            3684
        //   465: astore          56
        //   467: aload           56
        //   469: astore          82
        //   471: aload           81
        //   473: astore          57
        //   475: aload           82
        //   477: astore          71
        //   479: aload           57
        //   481: aload           71
        //   483: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   486: ldc_w           673520222
        //   489: iload           85
        //   491: ixor           
        //   492: istore          85
        //   494: aload           81
        //   496: astore          58
        //   498: aload           58
        //   500: athrow         
        //   501: aload           8
        //   503: astore          24
        //   505: aload           24
        //   507: ifnull          2981
        //   510: ldc_w           1763988746
        //   513: iload           85
        //   515: ixor           
        //   516: istore          85
        //   518: aload           8
        //   520: astore          25
        //   522: aload           25
        //   524: invokeinterface java/sql/PreparedStatement.close:()V
        //   529: goto            4435
        //   532: astore          39
        //   534: aload           39
        //   536: astore          79
        //   538: aload           8
        //   540: astore          40
        //   542: aload           40
        //   544: ifnull          725
        //   547: ldc_w           1036976531
        //   550: iload           85
        //   552: ixor           
        //   553: istore          85
        //   555: aload           8
        //   557: astore          41
        //   559: aload           41
        //   561: invokeinterface java/sql/PreparedStatement.close:()V
        //   566: ldc_w           588646823
        //   569: iload           85
        //   571: ixor           
        //   572: istore          85
        //   574: goto            3788
        //   577: astore          42
        //   579: aload           42
        //   581: astore          10
        //   583: aload           79
        //   585: astore          43
        //   587: aload           10
        //   589: astore          66
        //   591: aload           43
        //   593: aload           66
        //   595: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   598: ldc_w           1527680539
        //   601: iload           85
        //   603: ixor           
        //   604: istore          85
        //   606: aload           79
        //   608: astore          44
        //   610: aload           44
        //   612: athrow         
        //   613: aload           7
        //   615: astore          26
        //   617: aload           26
        //   619: ifnull          2752
        //   622: ldc_w           2098311083
        //   625: iload           85
        //   627: ixor           
        //   628: istore          85
        //   630: aload           7
        //   632: astore          27
        //   634: aload           27
        //   636: invokeinterface java/sql/Connection.close:()V
        //   641: goto            925
        //   644: astore          33
        //   646: aload           33
        //   648: astore          77
        //   650: aload           7
        //   652: astore          34
        //   654: aload           34
        //   656: ifnull          1079
        //   659: ldc_w           1828886172
        //   662: iload           85
        //   664: ixor           
        //   665: istore          85
        //   667: aload           7
        //   669: astore          35
        //   671: aload           35
        //   673: invokeinterface java/sql/Connection.close:()V
        //   678: ldc_w           147536499
        //   681: iload           85
        //   683: ixor           
        //   684: istore          85
        //   686: goto            1890
        //   689: astore          37
        //   691: aload           37
        //   693: astore          78
        //   695: aload           77
        //   697: astore          38
        //   699: aload           78
        //   701: astore          65
        //   703: aload           38
        //   705: aload           65
        //   707: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   710: ldc_w           474230052
        //   713: iload           85
        //   715: ixor           
        //   716: istore          85
        //   718: aload           77
        //   720: astore          36
        //   722: aload           36
        //   724: athrow         
        //   725: iload           85
        //   727: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   730: lookupswitch {
        //          84124199: 772
        //          131624234: 725
        //          1585523656: 4495
        //          1946793632: 780
        //          default: 4495
        //        }
        //   772: ldc_w           151134447
        //   775: iload           85
        //   777: ixor           
        //   778: istore          85
        //   780: iload           85
        //   782: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   785: ldc_w           42994281
        //   788: if_icmpeq       802
        //   791: ldc_w           1576952798
        //   794: iload           85
        //   796: ixor           
        //   797: istore          85
        //   799: goto            4495
        //   802: iload           85
        //   804: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   807: lookupswitch {
        //          33184218: 606
        //          42994281: 848
        //          583253600: 4495
        //          792457067: 802
        //          default: 4495
        //        }
        //   848: ldc_w           1698613495
        //   851: iload           85
        //   853: ixor           
        //   854: istore          85
        //   856: goto            606
        //   859: iload           85
        //   861: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   864: lookupswitch {
        //          -990224183: 892
        //          613813130: 903
        //          default: 914
        //        }
        //   892: ldc_w           581636888
        //   895: iload           85
        //   897: ixor           
        //   898: istore          85
        //   900: goto            317
        //   903: ldc_w           1587977840
        //   906: iload           85
        //   908: ixor           
        //   909: istore          85
        //   911: goto            317
        //   914: new             Ljava/lang/RuntimeException;
        //   917: dup            
        //   918: ldc_w           "Error in hash"
        //   921: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   924: athrow         
        //   925: iload           85
        //   927: ldc_w           1773671330
        //   930: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   933: istore          85
        //   935: iload           85
        //   937: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   940: ldc_w           55830041
        //   943: if_icmpeq       948
        //   946: aconst_null    
        //   947: athrow         
        //   948: new             Ljava/io/IOException;
        //   951: dup            
        //   952: invokespecial   java/io/IOException.<init>:()V
        //   955: athrow         
        //   956: iload           85
        //   958: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   961: lookupswitch {
        //          -739283720: 999
        //          589663946: 1010
        //          default: 988
        //        }
        //   988: new             Ljava/lang/RuntimeException;
        //   991: dup            
        //   992: ldc_w           "Error in hash"
        //   995: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   998: athrow         
        //   999: ldc_w           723526135
        //  1002: iload           85
        //  1004: ixor           
        //  1005: istore          85
        //  1007: goto            1020
        //  1010: iload           85
        //  1012: ldc_w           1966702001
        //  1015: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1018: istore          85
        //  1020: pop            
        //  1021: iload           85
        //  1023: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1026: lookupswitch {
        //          262507860: 1068
        //          1652147798: 1021
        //          1711291973: 2786
        //          1942073618: 4495
        //          default: 4495
        //        }
        //  1068: ldc_w           1464043853
        //  1071: iload           85
        //  1073: ixor           
        //  1074: istore          85
        //  1076: goto            2786
        //  1079: iload           85
        //  1081: ldc_w           271710910
        //  1084: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1087: istore          85
        //  1089: iload           85
        //  1091: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1094: ldc_w           250020226
        //  1097: if_icmpeq       1159
        //  1100: iload           85
        //  1102: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1105: lookupswitch {
        //          108027733: 4495
        //          250020226: 1148
        //          813581744: 4495
        //          1742444046: 1100
        //          default: 4495
        //        }
        //  1148: ldc_w           2056862676
        //  1151: iload           85
        //  1153: ixor           
        //  1154: istore          85
        //  1156: goto            4495
        //  1159: iload           85
        //  1161: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1164: lookupswitch {
        //          250020226: 1208
        //          445689544: 4495
        //          722811609: 1159
        //          864534585: 718
        //          default: 4495
        //        }
        //  1208: ldc_w           768148365
        //  1211: iload           85
        //  1213: ixor           
        //  1214: istore          85
        //  1216: goto            718
        //  1219: iload           85
        //  1221: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1224: lookupswitch {
        //          -1914592375: 1500
        //          -1745775695: 1805
        //          -1695317877: 1533
        //          -1641025045: 1693
        //          -1453674046: 1704
        //          -1271305598: 1546
        //          -1184268061: 1853
        //          -1175786558: 1511
        //          -1125541934: 1660
        //          -1121025053: 1737
        //          -990224183: 1781
        //          -927076095: 1818
        //          -777848824: 1671
        //          -182561911: 1748
        //          -148170310: 1581
        //          -3503648: 1759
        //          281641435: 1792
        //          423198401: 1877
        //          455031224: 1649
        //          613813130: 1570
        //          682512354: 1829
        //          870979576: 1605
        //          1193459035: 1638
        //          1260965080: 1715
        //          1444414370: 1522
        //          1513614153: 1842
        //          1543414555: 1557
        //          1603465314: 1864
        //          1636624305: 1726
        //          1761846251: 1770
        //          1932853683: 1594
        //          1974715488: 1616
        //          1990364336: 1627
        //          default: 1682
        //        }
        //  1500: ldc_w           436253638
        //  1503: iload           85
        //  1505: ixor           
        //  1506: istore          85
        //  1508: goto            2883
        //  1511: ldc_w           2088884943
        //  1514: iload           85
        //  1516: ixor           
        //  1517: istore          85
        //  1519: goto            2883
        //  1522: ldc_w           1635747779
        //  1525: iload           85
        //  1527: ixor           
        //  1528: istore          85
        //  1530: goto            2883
        //  1533: iload           85
        //  1535: ldc_w           1491269542
        //  1538: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1541: istore          85
        //  1543: goto            2883
        //  1546: ldc_w           2101062375
        //  1549: iload           85
        //  1551: ixor           
        //  1552: istore          85
        //  1554: goto            2883
        //  1557: iload           85
        //  1559: ldc_w           1086542804
        //  1562: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1565: istore          85
        //  1567: goto            2883
        //  1570: ldc_w           1865303750
        //  1573: iload           85
        //  1575: ixor           
        //  1576: istore          85
        //  1578: goto            2883
        //  1581: iload           85
        //  1583: ldc_w           1968825472
        //  1586: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1589: istore          85
        //  1591: goto            2883
        //  1594: ldc_w           1171924865
        //  1597: iload           85
        //  1599: ixor           
        //  1600: istore          85
        //  1602: goto            2883
        //  1605: ldc_w           767673672
        //  1608: iload           85
        //  1610: ixor           
        //  1611: istore          85
        //  1613: goto            2883
        //  1616: ldc_w           621477691
        //  1619: iload           85
        //  1621: ixor           
        //  1622: istore          85
        //  1624: goto            2883
        //  1627: ldc_w           627627553
        //  1630: iload           85
        //  1632: ixor           
        //  1633: istore          85
        //  1635: goto            2883
        //  1638: ldc_w           1129893916
        //  1641: iload           85
        //  1643: ixor           
        //  1644: istore          85
        //  1646: goto            2883
        //  1649: ldc_w           685727872
        //  1652: iload           85
        //  1654: ixor           
        //  1655: istore          85
        //  1657: goto            2883
        //  1660: ldc_w           2082583885
        //  1663: iload           85
        //  1665: ixor           
        //  1666: istore          85
        //  1668: goto            2883
        //  1671: ldc_w           831051958
        //  1674: iload           85
        //  1676: ixor           
        //  1677: istore          85
        //  1679: goto            2883
        //  1682: new             Ljava/lang/RuntimeException;
        //  1685: dup            
        //  1686: ldc_w           "Error in hash"
        //  1689: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1692: athrow         
        //  1693: ldc_w           1484355978
        //  1696: iload           85
        //  1698: ixor           
        //  1699: istore          85
        //  1701: goto            2883
        //  1704: ldc_w           2123878799
        //  1707: iload           85
        //  1709: ixor           
        //  1710: istore          85
        //  1712: goto            2883
        //  1715: ldc_w           584687148
        //  1718: iload           85
        //  1720: ixor           
        //  1721: istore          85
        //  1723: goto            2883
        //  1726: ldc_w           126688065
        //  1729: iload           85
        //  1731: ixor           
        //  1732: istore          85
        //  1734: goto            2883
        //  1737: ldc_w           1545164747
        //  1740: iload           85
        //  1742: ixor           
        //  1743: istore          85
        //  1745: goto            2883
        //  1748: ldc_w           354373062
        //  1751: iload           85
        //  1753: ixor           
        //  1754: istore          85
        //  1756: goto            2883
        //  1759: ldc_w           876992139
        //  1762: iload           85
        //  1764: ixor           
        //  1765: istore          85
        //  1767: goto            2883
        //  1770: ldc_w           1184691146
        //  1773: iload           85
        //  1775: ixor           
        //  1776: istore          85
        //  1778: goto            2883
        //  1781: ldc_w           321113006
        //  1784: iload           85
        //  1786: ixor           
        //  1787: istore          85
        //  1789: goto            2883
        //  1792: iload           85
        //  1794: ldc_w           1235597196
        //  1797: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1800: istore          85
        //  1802: goto            2883
        //  1805: iload           85
        //  1807: ldc_w           423802305
        //  1810: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1813: istore          85
        //  1815: goto            2883
        //  1818: ldc_w           313211287
        //  1821: iload           85
        //  1823: ixor           
        //  1824: istore          85
        //  1826: goto            2883
        //  1829: iload           85
        //  1831: ldc_w           1856589387
        //  1834: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1837: istore          85
        //  1839: goto            2883
        //  1842: ldc_w           16415454
        //  1845: iload           85
        //  1847: ixor           
        //  1848: istore          85
        //  1850: goto            2883
        //  1853: ldc_w           1553053611
        //  1856: iload           85
        //  1858: ixor           
        //  1859: istore          85
        //  1861: goto            2883
        //  1864: iload           85
        //  1866: ldc_w           1615780283
        //  1869: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1872: istore          85
        //  1874: goto            2883
        //  1877: iload           85
        //  1879: ldc_w           144418927
        //  1882: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1885: istore          85
        //  1887: goto            2883
        //  1890: ldc_w           1934834969
        //  1893: iload           85
        //  1895: ixor           
        //  1896: istore          85
        //  1898: iload           85
        //  1900: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1903: ldc_w           65817397
        //  1906: if_icmpeq       1911
        //  1909: aconst_null    
        //  1910: athrow         
        //  1911: new             Ljava/lang/RuntimeException;
        //  1914: dup            
        //  1915: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1918: athrow         
        //  1919: iload           85
        //  1921: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1924: lookupswitch {
        //          -282448725: 1952
        //          1600742442: 1976
        //          default: 1965
        //        }
        //  1952: iload           85
        //  1954: ldc_w           67823978
        //  1957: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1960: istore          85
        //  1962: goto            1984
        //  1965: new             Ljava/lang/RuntimeException;
        //  1968: dup            
        //  1969: ldc_w           "Error in hash"
        //  1972: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1975: athrow         
        //  1976: ldc_w           839024762
        //  1979: iload           85
        //  1981: ixor           
        //  1982: istore          85
        //  1984: pop            
        //  1985: ldc_w           795378095
        //  1988: iload           85
        //  1990: ixor           
        //  1991: istore          85
        //  1993: goto            718
        //  1996: iload           85
        //  1998: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2001: tableswitch {
        //          1741959152: 2020
        //          default: 2031
        //        }
        //  2020: ldc_w           1287537291
        //  2023: iload           85
        //  2025: ixor           
        //  2026: istore          85
        //  2028: goto            689
        //  2031: new             Ljava/lang/IllegalAccessException;
        //  2034: dup            
        //  2035: ldc_w           "Error in hash"
        //  2038: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  2041: athrow         
        //  2042: iload           85
        //  2044: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2047: lookupswitch {
        //          99006478: 2088
        //          484405302: 2042
        //          846936836: 4495
        //          1088503608: 2096
        //          default: 4495
        //        }
        //  2088: ldc_w           4607461
        //  2091: iload           85
        //  2093: ixor           
        //  2094: istore          85
        //  2096: iload           85
        //  2098: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2101: ldc_w           90153704
        //  2104: if_icmpeq       2109
        //  2107: aconst_null    
        //  2108: athrow         
        //  2109: new             Ljava/lang/IllegalAccessException;
        //  2112: dup            
        //  2113: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  2116: athrow         
        //  2117: iload           85
        //  2119: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2122: lookupswitch {
        //          1896312475: 2148
        //          2116153145: 2170
        //          default: 2159
        //        }
        //  2148: ldc_w           2025799601
        //  2151: iload           85
        //  2153: ixor           
        //  2154: istore          85
        //  2156: goto            2180
        //  2159: new             Ljava/io/IOException;
        //  2162: dup            
        //  2163: ldc_w           "Error in hash"
        //  2166: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2169: athrow         
        //  2170: iload           85
        //  2172: ldc_w           962326405
        //  2175: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2178: istore          85
        //  2180: pop            
        //  2181: iload           85
        //  2183: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2186: lookupswitch {
        //          198553858: 2228
        //          263271892: 4495
        //          595365173: 386
        //          1227105196: 2181
        //          default: 4495
        //        }
        //  2228: ldc_w           1101172506
        //  2231: iload           85
        //  2233: ixor           
        //  2234: istore          85
        //  2236: goto            386
        //  2239: iload           85
        //  2241: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2244: lookupswitch {
        //          182868046: 4495
        //          253366805: 2239
        //          260475518: 2288
        //          1676146488: 2296
        //          default: 4495
        //        }
        //  2288: ldc_w           817208434
        //  2291: iload           85
        //  2293: ixor           
        //  2294: istore          85
        //  2296: iload           85
        //  2298: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2301: ldc_w           60381716
        //  2304: if_icmpeq       2309
        //  2307: aconst_null    
        //  2308: athrow         
        //  2309: new             Ljava/lang/RuntimeException;
        //  2312: dup            
        //  2313: invokespecial   java/lang/RuntimeException.<init>:()V
        //  2316: athrow         
        //  2317: iload           85
        //  2319: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2322: lookupswitch {
        //          526344986: 2359
        //          1770201978: 2370
        //          default: 2348
        //        }
        //  2348: new             Ljava/lang/IllegalAccessException;
        //  2351: dup            
        //  2352: ldc_w           "Error in hash"
        //  2355: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  2358: athrow         
        //  2359: ldc_w           769009338
        //  2362: iload           85
        //  2364: ixor           
        //  2365: istore          85
        //  2367: goto            2380
        //  2370: iload           85
        //  2372: ldc_w           588099254
        //  2375: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2378: istore          85
        //  2380: pop            
        //  2381: iload           85
        //  2383: ldc_w           1108104751
        //  2386: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2389: istore          85
        //  2391: goto            501
        //  2394: iload           85
        //  2396: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2399: lookupswitch {
        //          -1914592375: 2603
        //          -1745775695: 2614
        //          -1695317877: 2706
        //          -1184268061: 2684
        //          -1175786558: 2658
        //          -1125541934: 2636
        //          -1121025053: 2647
        //          -990224183: 2592
        //          -777848824: 2579
        //          -182561911: 2555
        //          -148170310: 2719
        //          -3503648: 2568
        //          455031224: 2671
        //          613813130: 2695
        //          1260965080: 2741
        //          1513614153: 2730
        //          1932853683: 2544
        //          default: 2625
        //        }
        //  2544: ldc_w           994965006
        //  2547: iload           85
        //  2549: ixor           
        //  2550: istore          85
        //  2552: goto            532
        //  2555: iload           85
        //  2557: ldc_w           1804115017
        //  2560: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2563: istore          85
        //  2565: goto            532
        //  2568: ldc_w           1255278340
        //  2571: iload           85
        //  2573: ixor           
        //  2574: istore          85
        //  2576: goto            532
        //  2579: iload           85
        //  2581: ldc_w           1327434041
        //  2584: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2587: istore          85
        //  2589: goto            532
        //  2592: ldc_w           1840519713
        //  2595: iload           85
        //  2597: ixor           
        //  2598: istore          85
        //  2600: goto            532
        //  2603: ldc_w           1687642697
        //  2606: iload           85
        //  2608: ixor           
        //  2609: istore          85
        //  2611: goto            532
        //  2614: ldc_w           1742038094
        //  2617: iload           85
        //  2619: ixor           
        //  2620: istore          85
        //  2622: goto            532
        //  2625: new             Ljava/io/IOException;
        //  2628: dup            
        //  2629: ldc_w           "Error in hash"
        //  2632: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2635: athrow         
        //  2636: ldc_w           45507778
        //  2639: iload           85
        //  2641: ixor           
        //  2642: istore          85
        //  2644: goto            532
        //  2647: ldc_w           579765828
        //  2650: iload           85
        //  2652: ixor           
        //  2653: istore          85
        //  2655: goto            532
        //  2658: iload           85
        //  2660: ldc_w           34999104
        //  2663: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2666: istore          85
        //  2668: goto            532
        //  2671: iload           85
        //  2673: ldc_w           1447604495
        //  2676: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2679: istore          85
        //  2681: goto            532
        //  2684: ldc_w           570844708
        //  2687: iload           85
        //  2689: ixor           
        //  2690: istore          85
        //  2692: goto            532
        //  2695: ldc_w           297375561
        //  2698: iload           85
        //  2700: ixor           
        //  2701: istore          85
        //  2703: goto            532
        //  2706: iload           85
        //  2708: ldc_w           645211689
        //  2711: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2714: istore          85
        //  2716: goto            532
        //  2719: ldc_w           198063375
        //  2722: iload           85
        //  2724: ixor           
        //  2725: istore          85
        //  2727: goto            532
        //  2730: ldc_w           2121116497
        //  2733: iload           85
        //  2735: ixor           
        //  2736: istore          85
        //  2738: goto            532
        //  2741: ldc_w           1548636067
        //  2744: iload           85
        //  2746: ixor           
        //  2747: istore          85
        //  2749: goto            532
        //  2752: iload           85
        //  2754: ldc_w           87774150
        //  2757: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2760: istore          85
        //  2762: iload           85
        //  2764: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2767: ldc_w           119480212
        //  2770: if_icmpeq       2776
        //  2773: goto            2968
        //  2776: iload           85
        //  2778: ldc_w           1844529013
        //  2781: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2784: istore          85
        //  2786: ldc_w           141915676
        //  2789: iload           85
        //  2791: ixor           
        //  2792: istore          85
        //  2794: iload           85
        //  2796: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2799: ldc_w           99605845
        //  2802: if_icmpeq       2807
        //  2805: aconst_null    
        //  2806: athrow         
        //  2807: new             Ljava/lang/RuntimeException;
        //  2810: dup            
        //  2811: invokespecial   java/lang/RuntimeException.<init>:()V
        //  2814: athrow         
        //  2815: iload           85
        //  2817: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2820: lookupswitch {
        //          66975584: 2859
        //          1935251915: 2848
        //          default: 2957
        //        }
        //  2848: ldc_w           173049895
        //  2851: iload           85
        //  2853: ixor           
        //  2854: istore          85
        //  2856: goto            2869
        //  2859: iload           85
        //  2861: ldc_w           1682179570
        //  2864: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2867: istore          85
        //  2869: pop            
        //  2870: iload           85
        //  2872: ldc_w           984865522
        //  2875: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2878: istore          85
        //  2880: goto            2950
        //  2883: astore          29
        //  2885: aload           29
        //  2887: astore          76
        //  2889: ldc_w           2135348022
        //  2892: iload           85
        //  2894: ixor           
        //  2895: istore          85
        //  2897: aload_0        
        //  2898: astore          30
        //  2900: aload           30
        //  2902: getfield        dev/daniboy/donutcore/database/SQLiteManager.plugin:Ldev/daniboy/donutcore/DonutCore;
        //  2905: astore          31
        //  2907: aload           31
        //  2909: invokevirtual   dev/daniboy/donutcore/DonutCore.getLogger:()Ljava/util/logging/Logger;
        //  2912: astore          32
        //  2914: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //  2917: astore          64
        //  2919: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.phchfkbxmeuwztk:()[B
        //  2922: iload           85
        //  2924: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //  2927: astore_3       
        //  2928: aload           76
        //  2930: astore          4
        //  2932: aload           32
        //  2934: aload           64
        //  2936: aload_3        
        //  2937: aload           4
        //  2939: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  2942: ldc_w           175256941
        //  2945: iload           85
        //  2947: ixor           
        //  2948: istore          85
        //  2950: aload           5
        //  2952: astore          28
        //  2954: aload           28
        //  2956: areturn        
        //  2957: new             Ljava/io/IOException;
        //  2960: dup            
        //  2961: ldc_w           "Error in hash"
        //  2964: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2967: athrow         
        //  2968: iload           85
        //  2970: ldc_w           171448153
        //  2973: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2976: istore          85
        //  2978: goto            4495
        //  2981: iload           85
        //  2983: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2986: lookupswitch {
        //          94374957: 3028
        //          795278238: 3036
        //          1046159975: 4495
        //          1412228642: 2981
        //          default: 4495
        //        }
        //  3028: ldc_w           1464550460
        //  3031: iload           85
        //  3033: ixor           
        //  3034: istore          85
        //  3036: iload           85
        //  3038: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  3041: ldc_w           255754109
        //  3044: if_icmpeq       3060
        //  3047: iload           85
        //  3049: ldc_w           2058210755
        //  3052: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3055: istore          85
        //  3057: goto            4495
        //  3060: iload           85
        //  3062: ldc_w           1974372700
        //  3065: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3068: istore          85
        //  3070: goto            613
        //  3073: iload           85
        //  3075: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  3078: lookupswitch {
        //          -1914592375: 3402
        //          -1745775695: 3437
        //          -1695317877: 3531
        //          -1453674046: 3509
        //          -1184268061: 3555
        //          -1175786558: 3323
        //          -1125541934: 3463
        //          -1121025053: 3380
        //          -990224183: 3369
        //          -927076095: 3356
        //          -777848824: 3426
        //          -182561911: 3498
        //          -148170310: 3334
        //          -3503648: 3345
        //          281641435: 3310
        //          455031224: 3474
        //          613813130: 3391
        //          682512354: 3450
        //          1193459035: 3520
        //          1260965080: 3288
        //          1513614153: 3579
        //          1603465314: 3568
        //          1636624305: 3544
        //          1761846251: 3415
        //          1932853683: 3299
        //          default: 3487
        //        }
        //  3288: ldc_w           1645923832
        //  3291: iload           85
        //  3293: ixor           
        //  3294: istore          85
        //  3296: goto            644
        //  3299: ldc_w           85554261
        //  3302: iload           85
        //  3304: ixor           
        //  3305: istore          85
        //  3307: goto            644
        //  3310: iload           85
        //  3312: ldc_w           157738072
        //  3315: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3318: istore          85
        //  3320: goto            644
        //  3323: ldc_w           1010993435
        //  3326: iload           85
        //  3328: ixor           
        //  3329: istore          85
        //  3331: goto            644
        //  3334: ldc_w           899331924
        //  3337: iload           85
        //  3339: ixor           
        //  3340: istore          85
        //  3342: goto            644
        //  3345: ldc_w           1954973023
        //  3348: iload           85
        //  3350: ixor           
        //  3351: istore          85
        //  3353: goto            644
        //  3356: iload           85
        //  3358: ldc_w           1382574659
        //  3361: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3364: istore          85
        //  3366: goto            644
        //  3369: ldc_w           1407228026
        //  3372: iload           85
        //  3374: ixor           
        //  3375: istore          85
        //  3377: goto            644
        //  3380: ldc_w           484049951
        //  3383: iload           85
        //  3385: ixor           
        //  3386: istore          85
        //  3388: goto            644
        //  3391: ldc_w           804066578
        //  3394: iload           85
        //  3396: ixor           
        //  3397: istore          85
        //  3399: goto            644
        //  3402: iload           85
        //  3404: ldc_w           1522786322
        //  3407: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3410: istore          85
        //  3412: goto            644
        //  3415: ldc_w           106930206
        //  3418: iload           85
        //  3420: ixor           
        //  3421: istore          85
        //  3423: goto            644
        //  3426: ldc_w           1900776290
        //  3429: iload           85
        //  3431: ixor           
        //  3432: istore          85
        //  3434: goto            644
        //  3437: iload           85
        //  3439: ldc_w           1501685269
        //  3442: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3445: istore          85
        //  3447: goto            644
        //  3450: iload           85
        //  3452: ldc_w           778706335
        //  3455: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3458: istore          85
        //  3460: goto            644
        //  3463: ldc_w           1021503129
        //  3466: iload           85
        //  3468: ixor           
        //  3469: istore          85
        //  3471: goto            644
        //  3474: iload           85
        //  3476: ldc_w           1746678612
        //  3479: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3482: istore          85
        //  3484: goto            644
        //  3487: new             Ljava/lang/RuntimeException;
        //  3490: dup            
        //  3491: ldc_w           "Error in hash"
        //  3494: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  3497: athrow         
        //  3498: ldc_w           1440488978
        //  3501: iload           85
        //  3503: ixor           
        //  3504: istore          85
        //  3506: goto            644
        //  3509: ldc_w           1045725787
        //  3512: iload           85
        //  3514: ixor           
        //  3515: istore          85
        //  3517: goto            644
        //  3520: ldc_w           60523464
        //  3523: iload           85
        //  3525: ixor           
        //  3526: istore          85
        //  3528: goto            644
        //  3531: iload           85
        //  3533: ldc_w           404857970
        //  3536: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3539: istore          85
        //  3541: goto            644
        //  3544: ldc_w           1196312725
        //  3547: iload           85
        //  3549: ixor           
        //  3550: istore          85
        //  3552: goto            644
        //  3555: iload           85
        //  3557: ldc_w           475194495
        //  3560: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3563: istore          85
        //  3565: goto            644
        //  3568: ldc_w           546146927
        //  3571: iload           85
        //  3573: ixor           
        //  3574: istore          85
        //  3576: goto            644
        //  3579: iload           85
        //  3581: ldc_w           1077487882
        //  3584: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3587: istore          85
        //  3589: goto            644
        //  3592: iload           85
        //  3594: ldc_w           1057783338
        //  3597: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3600: istore          85
        //  3602: iload           85
        //  3604: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  3607: ldc_w           177859650
        //  3610: if_icmpeq       3626
        //  3613: iload           85
        //  3615: ldc_w           1766218201
        //  3618: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3621: istore          85
        //  3623: goto            4495
        //  3626: ldc_w           1811065831
        //  3629: iload           85
        //  3631: ixor           
        //  3632: istore          85
        //  3634: goto            494
        //  3637: iload           85
        //  3639: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  3642: tableswitch {
        //          -1908049226: 3671
        //          default: 3660
        //        }
        //  3660: new             Ljava/lang/IllegalAccessException;
        //  3663: dup            
        //  3664: ldc_w           "Error in hash"
        //  3667: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  3670: athrow         
        //  3671: iload           85
        //  3673: ldc_w           184379280
        //  3676: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3679: istore          85
        //  3681: goto            577
        //  3684: ldc_w           635783180
        //  3687: iload           85
        //  3689: ixor           
        //  3690: istore          85
        //  3692: iload           85
        //  3694: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  3697: ldc_w           124613995
        //  3700: if_icmpeq       3705
        //  3703: aconst_null    
        //  3704: athrow         
        //  3705: new             Ljava/io/IOException;
        //  3708: dup            
        //  3709: invokespecial   java/io/IOException.<init>:()V
        //  3712: athrow         
        //  3713: iload           85
        //  3715: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  3718: lookupswitch {
        //          -1563696152: 3755
        //          1087716057: 3768
        //          default: 3744
        //        }
        //  3744: new             Ljava/io/IOException;
        //  3747: dup            
        //  3748: ldc_w           "Error in hash"
        //  3751: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  3754: athrow         
        //  3755: iload           85
        //  3757: ldc_w           1122522502
        //  3760: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3763: istore          85
        //  3765: goto            3776
        //  3768: ldc_w           2125172384
        //  3771: iload           85
        //  3773: ixor           
        //  3774: istore          85
        //  3776: pop            
        //  3777: ldc_w           1439878860
        //  3780: iload           85
        //  3782: ixor           
        //  3783: istore          85
        //  3785: goto            494
        //  3788: iload           85
        //  3790: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  3793: lookupswitch {
        //          52813253: 3836
        //          73205767: 3788
        //          630016732: 3844
        //          2069729973: 4495
        //          default: 4495
        //        }
        //  3836: ldc_w           994663010
        //  3839: iload           85
        //  3841: ixor           
        //  3842: istore          85
        //  3844: iload           85
        //  3846: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  3849: ldc_w           174729262
        //  3852: if_icmpeq       3857
        //  3855: aconst_null    
        //  3856: athrow         
        //  3857: new             Ljava/io/IOException;
        //  3860: dup            
        //  3861: invokespecial   java/io/IOException.<init>:()V
        //  3864: athrow         
        //  3865: iload           85
        //  3867: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  3870: lookupswitch {
        //          -2049432717: 3920
        //          1682338153: 3896
        //          default: 3909
        //        }
        //  3896: iload           85
        //  3898: ldc_w           1599868241
        //  3901: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3904: istore          85
        //  3906: goto            3928
        //  3909: new             Ljava/lang/RuntimeException;
        //  3912: dup            
        //  3913: ldc_w           "Error in hash"
        //  3916: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  3919: athrow         
        //  3920: ldc_w           57657106
        //  3923: iload           85
        //  3925: ixor           
        //  3926: istore          85
        //  3928: pop            
        //  3929: iload           85
        //  3931: ldc_w           1254325596
        //  3934: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  3937: istore          85
        //  3939: goto            606
        //  3942: iload           85
        //  3944: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  3947: lookupswitch {
        //          -1745775695: 4052
        //          -1175786558: 4065
        //          -1121025053: 4089
        //          -990224183: 4111
        //          -777848824: 4041
        //          -182561911: 4028
        //          -148170310: 4122
        //          613813130: 4078
        //          1932853683: 4100
        //          default: 4135
        //        }
        //  4028: iload           85
        //  4030: ldc_w           1765734539
        //  4033: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4036: istore          85
        //  4038: goto            420
        //  4041: ldc_w           1302949371
        //  4044: iload           85
        //  4046: ixor           
        //  4047: istore          85
        //  4049: goto            420
        //  4052: iload           85
        //  4054: ldc_w           1700987020
        //  4057: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4060: istore          85
        //  4062: goto            420
        //  4065: iload           85
        //  4067: ldc_w           10514306
        //  4070: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4073: istore          85
        //  4075: goto            420
        //  4078: ldc_w           319812491
        //  4081: iload           85
        //  4083: ixor           
        //  4084: istore          85
        //  4086: goto            420
        //  4089: ldc_w           540598918
        //  4092: iload           85
        //  4094: ixor           
        //  4095: istore          85
        //  4097: goto            420
        //  4100: ldc_w           972788428
        //  4103: iload           85
        //  4105: ixor           
        //  4106: istore          85
        //  4108: goto            420
        //  4111: ldc_w           1862434531
        //  4114: iload           85
        //  4116: ixor           
        //  4117: istore          85
        //  4119: goto            420
        //  4122: iload           85
        //  4124: ldc_w           158880205
        //  4127: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4130: istore          85
        //  4132: goto            420
        //  4135: new             Ljava/io/IOException;
        //  4138: dup            
        //  4139: ldc_w           "Error in hash"
        //  4142: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  4145: athrow         
        //  4146: iload           85
        //  4148: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  4151: tableswitch {
        //          1926431174: 4168
        //          default: 4179
        //        }
        //  4168: ldc_w           1550568821
        //  4171: iload           85
        //  4173: ixor           
        //  4174: istore          85
        //  4176: goto            465
        //  4179: new             Ljava/io/IOException;
        //  4182: dup            
        //  4183: ldc_w           "Error in hash"
        //  4186: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  4189: athrow         
        //  4190: iload           85
        //  4192: ldc_w           1709714498
        //  4195: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4198: istore          85
        //  4200: iload           85
        //  4202: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  4205: ldc_w           209819957
        //  4208: if_icmpeq       4224
        //  4211: iload           85
        //  4213: ldc_w           2076600439
        //  4216: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4219: istore          85
        //  4221: goto            4495
        //  4224: ldc_w           1444995464
        //  4227: iload           85
        //  4229: ixor           
        //  4230: istore          85
        //  4232: goto            501
        //  4235: ldc_w           2005851397
        //  4238: iload           85
        //  4240: ixor           
        //  4241: istore          85
        //  4243: iload           85
        //  4245: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  4248: ldc_w           231150685
        //  4251: if_icmpeq       4257
        //  4254: goto            4268
        //  4257: ldc_w           1456752200
        //  4260: iload           85
        //  4262: ixor           
        //  4263: istore          85
        //  4265: goto            389
        //  4268: iload           85
        //  4270: ldc_w           1224344189
        //  4273: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4276: istore          85
        //  4278: goto            4495
        //  4281: ldc_w           852197555
        //  4284: iload           85
        //  4286: ixor           
        //  4287: istore          85
        //  4289: iload           85
        //  4291: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  4294: ldc_w           93202511
        //  4297: if_icmpeq       4302
        //  4300: aconst_null    
        //  4301: athrow         
        //  4302: new             Ljava/lang/IllegalAccessException;
        //  4305: dup            
        //  4306: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  4309: athrow         
        //  4310: iload           85
        //  4312: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  4315: lookupswitch {
        //          -1433163863: 4364
        //          800517723: 4351
        //          default: 4340
        //        }
        //  4340: new             Ljava/io/IOException;
        //  4343: dup            
        //  4344: ldc_w           "Error in hash"
        //  4347: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  4350: athrow         
        //  4351: iload           85
        //  4353: ldc_w           1103192209
        //  4356: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4359: istore          85
        //  4361: goto            4374
        //  4364: iload           85
        //  4366: ldc_w           291883439
        //  4369: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4372: istore          85
        //  4374: pop            
        //  4375: iload           85
        //  4377: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  4380: lookupswitch {
        //          103537385: 4424
        //          892091397: 4375
        //          1443662453: 4495
        //          1844927765: 145
        //          default: 4495
        //        }
        //  4424: ldc_w           445937451
        //  4427: iload           85
        //  4429: ixor           
        //  4430: istore          85
        //  4432: goto            145
        //  4435: iload           85
        //  4437: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  4440: lookupswitch {
        //          81427243: 4495
        //          98202189: 4484
        //          1448409449: 4435
        //          1876294639: 4503
        //          default: 4495
        //        }
        //  4484: ldc_w           692863830
        //  4487: iload           85
        //  4489: ixor           
        //  4490: istore          85
        //  4492: goto            4503
        //  4495: new             Ljava/io/IOException;
        //  4498: dup            
        //  4499: invokespecial   java/io/IOException.<init>:()V
        //  4502: athrow         
        //  4503: iload           85
        //  4505: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  4508: ldc_w           32313584
        //  4511: if_icmpeq       4516
        //  4514: aconst_null    
        //  4515: athrow         
        //  4516: new             Ljava/lang/RuntimeException;
        //  4519: dup            
        //  4520: invokespecial   java/lang/RuntimeException.<init>:()V
        //  4523: athrow         
        //  4524: iload           85
        //  4526: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  4529: lookupswitch {
        //          1622047185: 4569
        //          1657558355: 4556
        //          default: 4589
        //        }
        //  4556: iload           85
        //  4558: ldc_w           853133137
        //  4561: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  4564: istore          85
        //  4566: goto            4577
        //  4569: ldc_w           1922400961
        //  4572: iload           85
        //  4574: ixor           
        //  4575: istore          85
        //  4577: pop            
        //  4578: ldc_w           1347689581
        //  4581: iload           85
        //  4583: ixor           
        //  4584: istore          85
        //  4586: goto            613
        //  4589: new             Ljava/io/IOException;
        //  4592: dup            
        //  4593: ldc_w           "Error in hash"
        //  4596: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  4599: athrow         
        //    Signature:
        //  ()Ljava/util/Map<Ljava/lang/Integer;Lorg/bukkit/inventory/ItemStack;>;
        //    StackMapTable: 00 E0 FF 00 91 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 AB 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 07 01 4D 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 60 01 07 01 60 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 01 00 01 07 05 4B FB 00 44 FF 00 02 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1E 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 01 60 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 01 07 00 C0 1C FF 00 06 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1E 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 00 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 00 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 01 00 01 07 00 C0 1C FF 00 06 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1E 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 00 00 00 00 00 07 01 4D 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 00 00 00 00 00 07 01 4D 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 00 00 01 00 01 07 00 C0 1C FF 00 06 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 00 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 01 00 00 2E 07 15 2D FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 07 01 4D 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 60 01 07 01 60 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 01 00 01 07 05 4B 60 07 05 4B 4A 07 05 4B 4A 07 05 4B FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 07 00 DC 00 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 16 47 07 00 C4 5F 07 00 C4 4A 07 00 C4 4A 07 00 C4 49 07 00 C4 00 2E FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 00 00 00 00 00 07 01 4D 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 00 00 01 00 00 14 2F 0A 30 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 01 18 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 FF 00 0C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 00 00 00 00 00 07 01 4D 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 00 00 01 00 00 14 47 07 00 C2 60 07 00 C2 4C 07 00 C2 4A 07 00 C2 47 07 00 C2 FF 00 0B 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 00 00 00 00 00 07 01 4D 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 00 00 01 00 01 07 00 C0 57 07 00 C0 4A 07 00 C0 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 07 01 4D 07 04 9E 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 60 01 07 01 60 07 01 4D 07 01 4D 07 04 9E 07 00 43 07 00 04 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 07 01 4D 07 01 4D 01 07 00 31 00 00 07 04 9E 00 00 00 00 00 00 01 00 00 00 00 01 00 00 2D 07 0C 47 07 00 BD 5E 07 00 BD 4A 07 00 BD 4A 07 00 BD 49 07 00 BD 00 2E FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 30 07 0C 47 07 00 C2 5E 07 00 C2 4A 07 00 C2 4A 07 00 C2 49 07 00 C2 FF 00 0D 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 00 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 95 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 07 00 DC 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 17 09 14 47 07 00 C2 60 07 00 C2 4A 07 00 C2 49 07 00 C2 FF 00 0D 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 FB 00 42 FF 00 06 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 07 00 DC 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C2 0A FF 00 0C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 2E 07 17 FF 00 0C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 00 00 00 00 00 07 01 4D 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 D6 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 FF 00 0C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 01 60 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 00 21 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 00 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 01 00 01 07 00 C0 56 07 00 C0 4A 07 00 C0 FF 00 0C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 01 60 07 01 60 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 00 14 47 07 00 C4 5E 07 00 C4 4A 07 00 C4 4C 07 00 C4 47 07 00 C4 FF 00 0B 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 00 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 DC 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 00 00 01 00 00 2F 07 0C 47 07 00 C4 5E 07 00 C4 4C 07 00 C4 4A 07 00 C4 47 07 00 C4 FF 00 0D 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 55 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 01 60 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 00 01 00 01 07 00 C0 55 07 00 C0 4A 07 00 C0 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 21 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 15 0A FF 00 0C 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 07 01 4D 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 60 01 07 01 60 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 01 00 00 14 47 07 00 BD 5D 07 00 BD 4A 07 00 BD 4C 07 00 BD 49 07 00 BD 00 30 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 07 00 DC 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 30 FF 00 0A 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 00 00 00 00 00 07 01 4D 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 56 07 00 02 01 07 00 43 00 00 07 00 43 07 01 4D 07 00 D5 07 00 DC 07 01 60 00 00 00 07 01 4D 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 01 60 00 07 00 DC 07 00 DC 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 0C 47 07 00 C2 5F 07 00 C2 4C 07 00 C2 47 07 00 C2 4B 07 00 C2
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  251    314    859    925    Ljava/lang/Exception;
        //  145    389    3942   4190   Ljava/lang/Throwable;
        //  443    462    4146   4190   Ljava/lang/Throwable;
        //  120    501    2394   3942   Ljava/lang/Throwable;
        //  555    574    3637   3684   Ljava/lang/Throwable;
        //  89     613    3073   3592   Ljava/lang/Throwable;
        //  667    686    1996   2042   Ljava/lang/Throwable;
        //  65     725    1219   1890   Ljava/sql/SQLException;
        //  3844   3865   3865   3942   Ljava/io/IOException;
        //  935    956    956    1079   Ljava/io/IOException;
        //  4503   4524   4524   4600   Ljava/lang/RuntimeException;
        //  2296   2317   2317   2394   Ljava/lang/RuntimeException;
        //  1898   1919   1919   1996   Ljava/lang/RuntimeException;
        //  2794   2815   2815   2883   Ljava/lang/RuntimeException;
        //  3692   3713   3713   3788   Ljava/io/IOException;
        //  4289   4310   4310   4435   Ljava/lang/IllegalAccessException;
        //  2096   2117   2117   2239   Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 1378 out of bounds for length 1378
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at w5.a.o(SourceFile:31)
        //     at w5.a.j(SourceFile:218)
        //     at a6.j.j(SourceFile:23)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setPayToggle$1965917752(final UUID p0, final boolean p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           77469436
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_3        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          41
        //    16: ldc_w           1804016732
        //    19: iload           41
        //    21: ixor           
        //    22: istore          41
        //    24: aload_0        
        //    25: astore          4
        //    27: aload           4
        //    29: ldc             1279769918
        //    31: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    34: astore          10
        //    36: aload           10
        //    38: astore          7
        //    40: ldc_w           654952759
        //    43: iload           41
        //    45: ixor           
        //    46: istore          41
        //    48: aload           7
        //    50: astore          11
        //    52: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.xpiwmsijqfuxfca:()[B
        //    55: iload           41
        //    57: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    60: astore          5
        //    62: aload           11
        //    64: aload           5
        //    66: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    71: astore          12
        //    73: aload           12
        //    75: astore          8
        //    77: ldc_w           246755808
        //    80: iload           41
        //    82: ixor           
        //    83: istore          41
        //    85: aload           8
        //    87: astore          13
        //    89: ldc_w           244540890
        //    92: iload           41
        //    94: ixor           
        //    95: i2b            
        //    96: istore          30
        //    98: aload_1        
        //    99: astore          6
        //   101: aload           6
        //   103: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   106: astore          34
        //   108: aload           13
        //   110: iload           30
        //   112: aload           34
        //   114: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   119: ldc_w           951899333
        //   122: iload           41
        //   124: ixor           
        //   125: istore          41
        //   127: aload           8
        //   129: astore          14
        //   131: ldc_w           909095196
        //   134: iload           41
        //   136: ixor           
        //   137: i2b            
        //   138: istore          31
        //   140: iload_2        
        //   141: istore          35
        //   143: aload           14
        //   145: iload           31
        //   147: iload           35
        //   149: invokeinterface java/sql/PreparedStatement.setBoolean:(IZ)V
        //   154: ldc_w           950450848
        //   157: iload           41
        //   159: ixor           
        //   160: istore          41
        //   162: aload           8
        //   164: astore          15
        //   166: aload           15
        //   168: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   173: istore          16
        //   175: ldc_w           1064308354
        //   178: iload           41
        //   180: ixor           
        //   181: istore          41
        //   183: aload           7
        //   185: astore          17
        //   187: aload           17
        //   189: ifnull          448
        //   192: ldc_w           455445939
        //   195: iload           41
        //   197: ixor           
        //   198: istore          41
        //   200: aload           7
        //   202: astore          18
        //   204: aload           18
        //   206: invokeinterface java/sql/Connection.close:()V
        //   211: goto            295
        //   214: astore          24
        //   216: aload           24
        //   218: astore          39
        //   220: aload           7
        //   222: astore          25
        //   224: aload           25
        //   226: ifnull          890
        //   229: ldc_w           2100552028
        //   232: iload           41
        //   234: ixor           
        //   235: istore          41
        //   237: aload           7
        //   239: astore          26
        //   241: aload           26
        //   243: invokeinterface java/sql/Connection.close:()V
        //   248: ldc_w           823272678
        //   251: iload           41
        //   253: ixor           
        //   254: istore          41
        //   256: goto            786
        //   259: astore          27
        //   261: aload           27
        //   263: astore          9
        //   265: aload           39
        //   267: astore          28
        //   269: aload           9
        //   271: astore          33
        //   273: aload           28
        //   275: aload           33
        //   277: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   280: ldc_w           2013082680
        //   283: iload           41
        //   285: ixor           
        //   286: istore          41
        //   288: aload           39
        //   290: astore          29
        //   292: aload           29
        //   294: athrow         
        //   295: ldc_w           1106506991
        //   298: iload           41
        //   300: ixor           
        //   301: istore          41
        //   303: iload           41
        //   305: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   308: ldc_w           262958037
        //   311: if_icmpeq       316
        //   314: aconst_null    
        //   315: athrow         
        //   316: new             Ljava/lang/IllegalAccessException;
        //   319: dup            
        //   320: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //   323: athrow         
        //   324: iload           41
        //   326: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   329: lookupswitch {
        //          1457393696: 356
        //          1501291267: 380
        //          default: 369
        //        }
        //   356: iload           41
        //   358: ldc_w           349492675
        //   361: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   364: istore          41
        //   366: goto            388
        //   369: new             Ljava/io/IOException;
        //   372: dup            
        //   373: ldc_w           "Error in hash"
        //   376: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   379: athrow         
        //   380: ldc_w           1965058983
        //   383: iload           41
        //   385: ixor           
        //   386: istore          41
        //   388: pop            
        //   389: ldc_w           40166151
        //   392: iload           41
        //   394: ixor           
        //   395: istore          41
        //   397: goto            632
        //   400: iload           41
        //   402: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   405: tableswitch {
        //          -1200445550: 424
        //          default: 437
        //        }
        //   424: iload           41
        //   426: ldc_w           425276384
        //   429: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   432: istore          41
        //   434: goto            259
        //   437: new             Ljava/lang/IllegalAccessException;
        //   440: dup            
        //   441: ldc_w           "Error in hash"
        //   444: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   447: athrow         
        //   448: iload           41
        //   450: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   453: lookupswitch {
        //          13781981: 496
        //          1164801063: 504
        //          1525572554: 448
        //          1940509744: 964
        //          default: 964
        //        }
        //   496: ldc_w           266629340
        //   499: iload           41
        //   501: ixor           
        //   502: istore          41
        //   504: iload           41
        //   506: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   509: ldc_w           140061311
        //   512: if_icmpeq       575
        //   515: iload           41
        //   517: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   520: lookupswitch {
        //          140061311: 564
        //          334623690: 515
        //          477839363: 964
        //          823609944: 964
        //          default: 964
        //        }
        //   564: ldc_w           1751087585
        //   567: iload           41
        //   569: ixor           
        //   570: istore          41
        //   572: goto            964
        //   575: iload           41
        //   577: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   580: lookupswitch {
        //          140061311: 624
        //          336374967: 575
        //          554296932: 964
        //          1344861101: 632
        //          default: 964
        //        }
        //   624: ldc_w           578191648
        //   627: iload           41
        //   629: ixor           
        //   630: istore          41
        //   632: iload           41
        //   634: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   637: lookupswitch {
        //          118568543: 680
        //          1162982809: 964
        //          1577505011: 688
        //          1983826375: 632
        //          default: 964
        //        }
        //   680: ldc_w           1002821761
        //   683: iload           41
        //   685: ixor           
        //   686: istore          41
        //   688: iload           41
        //   690: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   693: ldc_w           216093203
        //   696: if_icmpeq       701
        //   699: aconst_null    
        //   700: athrow         
        //   701: new             Ljava/io/IOException;
        //   704: dup            
        //   705: invokespecial   java/io/IOException.<init>:()V
        //   708: athrow         
        //   709: iload           41
        //   711: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   714: lookupswitch {
        //          -1532175197: 762
        //          1030840841: 751
        //          default: 740
        //        }
        //   740: new             Ljava/io/IOException;
        //   743: dup            
        //   744: ldc_w           "Error in hash"
        //   747: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   750: athrow         
        //   751: ldc_w           1710943881
        //   754: iload           41
        //   756: ixor           
        //   757: istore          41
        //   759: goto            772
        //   762: iload           41
        //   764: ldc_w           918640988
        //   767: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   770: istore          41
        //   772: pop            
        //   773: iload           41
        //   775: ldc_w           676076011
        //   778: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   781: istore          41
        //   783: goto            1273
        //   786: iload           41
        //   788: ldc_w           309361994
        //   791: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   794: istore          41
        //   796: iload           41
        //   798: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   801: ldc_w           3967113
        //   804: if_icmpeq       809
        //   807: aconst_null    
        //   808: athrow         
        //   809: new             Ljava/lang/RuntimeException;
        //   812: dup            
        //   813: invokespecial   java/lang/RuntimeException.<init>:()V
        //   816: athrow         
        //   817: iload           41
        //   819: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   822: lookupswitch {
        //          -1624952405: 859
        //          -953442648: 848
        //          default: 879
        //        }
        //   848: ldc_w           1816680494
        //   851: iload           41
        //   853: ixor           
        //   854: istore          41
        //   856: goto            867
        //   859: ldc_w           122260942
        //   862: iload           41
        //   864: ixor           
        //   865: istore          41
        //   867: pop            
        //   868: ldc_w           562955866
        //   871: iload           41
        //   873: ixor           
        //   874: istore          41
        //   876: goto            288
        //   879: new             Ljava/lang/IllegalAccessException;
        //   882: dup            
        //   883: ldc_w           "Error in hash"
        //   886: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   889: athrow         
        //   890: ldc_w           2018840745
        //   893: iload           41
        //   895: ixor           
        //   896: istore          41
        //   898: iload           41
        //   900: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   903: ldc_w           164997054
        //   906: if_icmpeq       972
        //   909: iload           41
        //   911: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   914: lookupswitch {
        //          164997054: 956
        //          535953289: 909
        //          571102668: 964
        //          1224662777: 964
        //          default: 964
        //        }
        //   956: ldc_w           1755568013
        //   959: iload           41
        //   961: ixor           
        //   962: istore          41
        //   964: new             Ljava/io/IOException;
        //   967: dup            
        //   968: invokespecial   java/io/IOException.<init>:()V
        //   971: athrow         
        //   972: ldc_w           1807939117
        //   975: iload           41
        //   977: ixor           
        //   978: istore          41
        //   980: goto            288
        //   983: iload           41
        //   985: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   988: lookupswitch {
        //          -1882707487: 1164
        //          -1457951478: 1107
        //          -1317173007: 1186
        //          -600222775: 1096
        //          20095448: 1140
        //          384879817: 1221
        //          900094250: 1234
        //          964487265: 1129
        //          1420326136: 1197
        //          1457800313: 1175
        //          1950899696: 1118
        //          1956327128: 1208
        //          default: 1153
        //        }
        //  1096: ldc_w           926801483
        //  1099: iload           41
        //  1101: ixor           
        //  1102: istore          41
        //  1104: goto            1242
        //  1107: ldc_w           1503254931
        //  1110: iload           41
        //  1112: ixor           
        //  1113: istore          41
        //  1115: goto            1242
        //  1118: ldc_w           36962188
        //  1121: iload           41
        //  1123: ixor           
        //  1124: istore          41
        //  1126: goto            1242
        //  1129: ldc_w           731212094
        //  1132: iload           41
        //  1134: ixor           
        //  1135: istore          41
        //  1137: goto            1242
        //  1140: iload           41
        //  1142: ldc_w           211591177
        //  1145: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1148: istore          41
        //  1150: goto            1242
        //  1153: new             Ljava/lang/IllegalAccessException;
        //  1156: dup            
        //  1157: ldc_w           "Error in hash"
        //  1160: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1163: athrow         
        //  1164: ldc_w           1027862798
        //  1167: iload           41
        //  1169: ixor           
        //  1170: istore          41
        //  1172: goto            1242
        //  1175: ldc_w           644250813
        //  1178: iload           41
        //  1180: ixor           
        //  1181: istore          41
        //  1183: goto            1242
        //  1186: ldc_w           982861100
        //  1189: iload           41
        //  1191: ixor           
        //  1192: istore          41
        //  1194: goto            1242
        //  1197: ldc_w           103807661
        //  1200: iload           41
        //  1202: ixor           
        //  1203: istore          41
        //  1205: goto            1242
        //  1208: iload           41
        //  1210: ldc_w           36278761
        //  1213: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1216: istore          41
        //  1218: goto            1242
        //  1221: iload           41
        //  1223: ldc_w           778366379
        //  1226: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1229: istore          41
        //  1231: goto            1242
        //  1234: ldc_w           1242447639
        //  1237: iload           41
        //  1239: ixor           
        //  1240: istore          41
        //  1242: astore          22
        //  1244: aload           22
        //  1246: astore          38
        //  1248: ldc_w           166998390
        //  1251: iload           41
        //  1253: ixor           
        //  1254: istore          41
        //  1256: aload           38
        //  1258: astore          23
        //  1260: aload           23
        //  1262: invokevirtual   java/sql/SQLException.printStackTrace:()V
        //  1265: ldc_w           1867914855
        //  1268: iload           41
        //  1270: ixor           
        //  1271: istore          41
        //  1273: aload_0        
        //  1274: astore          19
        //  1276: aload           19
        //  1278: getfield        dev/daniboy/donutcore/database/SQLiteManager.payToggleCache:Ljava/util/Map;
        //  1281: astore          20
        //  1283: aload_1        
        //  1284: astore          32
        //  1286: iload_2        
        //  1287: istore          36
        //  1289: iload           36
        //  1291: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1294: astore          37
        //  1296: aload           20
        //  1298: aload           32
        //  1300: aload           37
        //  1302: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1307: astore          21
        //  1309: ldc_w           799388304
        //  1312: iload           41
        //  1314: ixor           
        //  1315: istore          41
        //  1317: return         
        //  1318: iload           41
        //  1320: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1323: lookupswitch {
        //          -1317173007: 1375
        //          20095448: 1364
        //          1950899696: 1410
        //          1956327128: 1388
        //          default: 1399
        //        }
        //  1364: ldc_w           1184014110
        //  1367: iload           41
        //  1369: ixor           
        //  1370: istore          41
        //  1372: goto            214
        //  1375: iload           41
        //  1377: ldc_w           1889237563
        //  1380: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1383: istore          41
        //  1385: goto            214
        //  1388: ldc_w           1210560254
        //  1391: iload           41
        //  1393: ixor           
        //  1394: istore          41
        //  1396: goto            214
        //  1399: new             Ljava/lang/RuntimeException;
        //  1402: dup            
        //  1403: ldc_w           "Error in hash"
        //  1406: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1409: athrow         
        //  1410: ldc_w           1212006555
        //  1413: iload           41
        //  1415: ixor           
        //  1416: istore          41
        //  1418: goto            214
        //    StackMapTable: 00 3F FF 00 D6 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C FF 00 06 00 2A 07 00 02 07 03 48 01 01 07 00 02 07 01 4D 07 03 48 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 01 01 00 00 07 01 4D 01 00 00 00 00 00 01 00 00 14 47 07 00 BD 5F 07 00 BD 4C 07 00 BD 4A 07 00 BD 47 07 00 BD FF 00 0B 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 57 07 00 C0 4C 07 00 C0 FF 00 0A 00 2A 07 00 02 07 03 48 01 01 07 00 02 07 01 4D 07 03 48 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 01 00 00 07 01 4D 01 00 00 00 00 00 01 00 00 2F 07 0A 30 0A 30 07 2F 07 0C 47 07 00 C4 5E 07 00 C4 4A 07 00 C4 4A 07 00 C4 49 07 00 C4 FF 00 0D 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 16 47 07 00 C2 5E 07 00 C2 4A 07 00 C2 47 07 00 C2 4B 07 00 C2 FF 00 0A 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 12 2E FF 00 07 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 FF 00 0A 00 2A 07 00 02 07 03 48 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 70 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 47 07 00 97 1E FF 00 2C 00 2A 07 00 02 07 03 48 01 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 6D 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  48     183    1318   1421   Ljava/lang/Throwable;
        //  237    256    400    448    Ljava/lang/Throwable;
        //  24     295    983    1273   Ljava/sql/SQLException;
        //  796    817    817    890    Ljava/lang/RuntimeException;
        //  303    324    324    400    Ljava/lang/IllegalAccessException;
        //  688    709    709    786    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0214:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean getPayToggle$495579768(final UUID p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           1278437825
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_2        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          60
        //    16: ldc_w           780604718
        //    19: iload           60
        //    21: ixor           
        //    22: istore          60
        //    24: aload_0        
        //    25: astore_3       
        //    26: aload_3        
        //    27: getfield        dev/daniboy/donutcore/database/SQLiteManager.payToggleCache:Ljava/util/Map;
        //    30: astore          11
        //    32: aload_1        
        //    33: astore          4
        //    35: aload           11
        //    37: aload           4
        //    39: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    44: istore          12
        //    46: iload           12
        //    48: ldc_w           404619579
        //    51: iload           60
        //    53: ixor           
        //    54: if_icmpeq       106
        //    57: ldc_w           648513082
        //    60: iload           60
        //    62: ixor           
        //    63: istore          60
        //    65: aload_0        
        //    66: astore          13
        //    68: aload           13
        //    70: getfield        dev/daniboy/donutcore/database/SQLiteManager.payToggleCache:Ljava/util/Map;
        //    73: astore          14
        //    75: aload_1        
        //    76: astore          47
        //    78: aload           14
        //    80: aload           47
        //    82: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    87: astore          15
        //    89: aload           15
        //    91: checkcast       Ljava/lang/Boolean;
        //    94: astore          16
        //    96: aload           16
        //    98: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   101: istore          17
        //   103: iload           17
        //   105: ireturn        
        //   106: ldc_w           1935456111
        //   109: iload           60
        //   111: ixor           
        //   112: istore          60
        //   114: iload           60
        //   116: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   119: ldc_w           265366016
        //   122: if_icmpeq       128
        //   125: goto            2103
        //   128: iload           60
        //   130: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   133: lookupswitch {
        //          265366016: 176
        //          391010677: 2113
        //          420534233: 128
        //          605954260: 184
        //          default: 2113
        //        }
        //   176: ldc_w           1208512828
        //   179: iload           60
        //   181: ixor           
        //   182: istore          60
        //   184: aload_0        
        //   185: astore          18
        //   187: aload           18
        //   189: ldc             1279769918
        //   191: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //   194: astore          19
        //   196: aload           19
        //   198: astore          6
        //   200: ldc_w           1651193080
        //   203: iload           60
        //   205: ixor           
        //   206: istore          60
        //   208: aload           6
        //   210: astore          20
        //   212: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.udedfrjaqufqxed:()[B
        //   215: iload           60
        //   217: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   220: astore          48
        //   222: aload           20
        //   224: aload           48
        //   226: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   231: astore          21
        //   233: aload           21
        //   235: astore          7
        //   237: ldc_w           106380194
        //   240: iload           60
        //   242: ixor           
        //   243: istore          60
        //   245: aload           7
        //   247: astore          22
        //   249: ldc_w           1198966835
        //   252: iload           60
        //   254: ixor           
        //   255: i2b            
        //   256: istore          49
        //   258: aload_1        
        //   259: astore          5
        //   261: aload           5
        //   263: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   266: astore          53
        //   268: aload           22
        //   270: iload           49
        //   272: aload           53
        //   274: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   279: ldc_w           1222909171
        //   282: iload           60
        //   284: ixor           
        //   285: istore          60
        //   287: aload           7
        //   289: astore          23
        //   291: aload           23
        //   293: invokeinterface java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        //   298: astore          24
        //   300: aload           24
        //   302: astore          8
        //   304: ldc_w           363124488
        //   307: iload           60
        //   309: ixor           
        //   310: istore          60
        //   312: aload           8
        //   314: astore          25
        //   316: aload           25
        //   318: invokeinterface java/sql/ResultSet.next:()Z
        //   323: istore          26
        //   325: iload           26
        //   327: ldc_w           439747529
        //   330: iload           60
        //   332: ixor           
        //   333: if_icmpeq       996
        //   336: ldc_w           839301422
        //   339: iload           60
        //   341: ixor           
        //   342: istore          60
        //   344: aload           8
        //   346: astore          32
        //   348: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.clqlljxpititqcp:()[B
        //   351: iload           60
        //   353: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   356: astore          50
        //   358: aload           32
        //   360: aload           50
        //   362: invokeinterface java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
        //   367: istore          33
        //   369: iload           33
        //   371: istore          9
        //   373: ldc_w           818353253
        //   376: iload           60
        //   378: ixor           
        //   379: istore          60
        //   381: aload_0        
        //   382: astore          34
        //   384: aload           34
        //   386: getfield        dev/daniboy/donutcore/database/SQLiteManager.payToggleCache:Ljava/util/Map;
        //   389: astore          35
        //   391: aload_1        
        //   392: astore          51
        //   394: iload           9
        //   396: istore          54
        //   398: iload           54
        //   400: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   403: astore          55
        //   405: aload           35
        //   407: aload           51
        //   409: aload           55
        //   411: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   416: astore          36
        //   418: ldc_w           905267609
        //   421: iload           60
        //   423: ixor           
        //   424: istore          60
        //   426: iload           9
        //   428: istore          37
        //   430: iload           37
        //   432: istore          10
        //   434: ldc_w           280341528
        //   437: iload           60
        //   439: ixor           
        //   440: istore          60
        //   442: aload           6
        //   444: astore          38
        //   446: aload           38
        //   448: ifnull          485
        //   451: ldc_w           1614207653
        //   454: iload           60
        //   456: ixor           
        //   457: istore          60
        //   459: aload           6
        //   461: astore          39
        //   463: aload           39
        //   465: invokeinterface java/sql/Connection.close:()V
        //   470: ldc_w           255830631
        //   473: iload           60
        //   475: ixor           
        //   476: istore          60
        //   478: iload           10
        //   480: istore          40
        //   482: iload           40
        //   484: ireturn        
        //   485: iload           60
        //   487: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   490: lookupswitch {
        //          127081698: 532
        //          1495008726: 2113
        //          1660800538: 485
        //          1941711572: 540
        //          default: 2113
        //        }
        //   532: ldc_w           1911635662
        //   535: iload           60
        //   537: ixor           
        //   538: istore          60
        //   540: iload           60
        //   542: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   545: ldc_w           63490171
        //   548: if_icmpeq       554
        //   551: goto            2043
        //   554: iload           60
        //   556: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   559: lookupswitch {
        //          63490171: 600
        //          185413524: 478
        //          1868944698: 554
        //          1922233498: 2113
        //          default: 2113
        //        }
        //   600: ldc_w           519589388
        //   603: iload           60
        //   605: ixor           
        //   606: istore          60
        //   608: goto            478
        //   611: iload           60
        //   613: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   616: lookupswitch {
        //          -943885296: 776
        //          -776987064: 787
        //          -334721742: 798
        //          -306554855: 730
        //          152018050: 763
        //          441858881: 741
        //          1001800082: 752
        //          1099290425: 719
        //          1746352345: 708
        //          2090247688: 822
        //          default: 811
        //        }
        //   708: ldc_w           2133689609
        //   711: iload           60
        //   713: ixor           
        //   714: istore          60
        //   716: goto            1940
        //   719: ldc_w           2048907509
        //   722: iload           60
        //   724: ixor           
        //   725: istore          60
        //   727: goto            1940
        //   730: ldc_w           1872242961
        //   733: iload           60
        //   735: ixor           
        //   736: istore          60
        //   738: goto            1940
        //   741: ldc_w           1902486906
        //   744: iload           60
        //   746: ixor           
        //   747: istore          60
        //   749: goto            1940
        //   752: ldc_w           358197792
        //   755: iload           60
        //   757: ixor           
        //   758: istore          60
        //   760: goto            1940
        //   763: iload           60
        //   765: ldc_w           319721858
        //   768: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   771: istore          60
        //   773: goto            1940
        //   776: ldc_w           1255722128
        //   779: iload           60
        //   781: ixor           
        //   782: istore          60
        //   784: goto            1940
        //   787: ldc_w           1209623003
        //   790: iload           60
        //   792: ixor           
        //   793: istore          60
        //   795: goto            1940
        //   798: iload           60
        //   800: ldc_w           263123892
        //   803: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   806: istore          60
        //   808: goto            1940
        //   811: new             Ljava/lang/IllegalAccessException;
        //   814: dup            
        //   815: ldc_w           "Error in hash"
        //   818: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   821: athrow         
        //   822: ldc_w           1572714195
        //   825: iload           60
        //   827: ixor           
        //   828: istore          60
        //   830: goto            1940
        //   833: iload           60
        //   835: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   838: lookupswitch {
        //          -943885296: 985
        //          -776987064: 963
        //          152018050: 926
        //          1001800082: 952
        //          1099290425: 904
        //          1746352345: 974
        //          2090247688: 939
        //          default: 915
        //        }
        //   904: ldc_w           250874158
        //   907: iload           60
        //   909: ixor           
        //   910: istore          60
        //   912: goto            1107
        //   915: new             Ljava/lang/RuntimeException;
        //   918: dup            
        //   919: ldc_w           "Error in hash"
        //   922: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   925: athrow         
        //   926: iload           60
        //   928: ldc_w           1743077465
        //   931: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   934: istore          60
        //   936: goto            1107
        //   939: iload           60
        //   941: ldc_w           693528328
        //   944: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   947: istore          60
        //   949: goto            1107
        //   952: ldc_w           1639087099
        //   955: iload           60
        //   957: ixor           
        //   958: istore          60
        //   960: goto            1107
        //   963: ldc_w           1022537728
        //   966: iload           60
        //   968: ixor           
        //   969: istore          60
        //   971: goto            1107
        //   974: ldc_w           197547218
        //   977: iload           60
        //   979: ixor           
        //   980: istore          60
        //   982: goto            1107
        //   985: ldc_w           1043537227
        //   988: iload           60
        //   990: ixor           
        //   991: istore          60
        //   993: goto            1107
        //   996: iload           60
        //   998: ldc_w           1559501368
        //  1001: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1004: istore          60
        //  1006: iload           60
        //  1008: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1011: ldc_w           152589440
        //  1014: if_icmpeq       1020
        //  1017: goto            1983
        //  1020: iload           60
        //  1022: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1025: lookupswitch {
        //          152589440: 1068
        //          893835256: 1076
        //          1128631987: 2113
        //          1275678908: 1020
        //          default: 2113
        //        }
        //  1068: ldc_w           1288803196
        //  1071: iload           60
        //  1073: ixor           
        //  1074: istore          60
        //  1076: aload           6
        //  1078: astore          27
        //  1080: aload           27
        //  1082: ifnull          1583
        //  1085: ldc_w           1775584220
        //  1088: iload           60
        //  1090: ixor           
        //  1091: istore          60
        //  1093: aload           6
        //  1095: astore          28
        //  1097: aload           28
        //  1099: invokeinterface java/sql/Connection.close:()V
        //  1104: goto            1687
        //  1107: astore          41
        //  1109: aload           41
        //  1111: astore          57
        //  1113: aload           6
        //  1115: astore          42
        //  1117: aload           42
        //  1119: ifnull          1188
        //  1122: ldc_w           57772777
        //  1125: iload           60
        //  1127: ixor           
        //  1128: istore          60
        //  1130: aload           6
        //  1132: astore          43
        //  1134: aload           43
        //  1136: invokeinterface java/sql/Connection.close:()V
        //  1141: ldc_w           1311598049
        //  1144: iload           60
        //  1146: ixor           
        //  1147: istore          60
        //  1149: goto            1303
        //  1152: astore          44
        //  1154: aload           44
        //  1156: astore          58
        //  1158: aload           57
        //  1160: astore          45
        //  1162: aload           58
        //  1164: astore          52
        //  1166: aload           45
        //  1168: aload           52
        //  1170: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1173: ldc_w           950446471
        //  1176: iload           60
        //  1178: ixor           
        //  1179: istore          60
        //  1181: aload           57
        //  1183: astore          46
        //  1185: aload           46
        //  1187: athrow         
        //  1188: ldc_w           1815222697
        //  1191: iload           60
        //  1193: ixor           
        //  1194: istore          60
        //  1196: iload           60
        //  1198: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1201: ldc_w           20816108
        //  1204: if_icmpeq       1210
        //  1207: goto            1399
        //  1210: iload           60
        //  1212: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1215: lookupswitch {
        //          20816108: 1256
        //          567013895: 1181
        //          973036826: 1210
        //          1763214085: 2113
        //          default: 2113
        //        }
        //  1256: ldc_w           1532908372
        //  1259: iload           60
        //  1261: ixor           
        //  1262: istore          60
        //  1264: goto            1181
        //  1267: iload           60
        //  1269: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1272: tableswitch {
        //          1532203522: 1292
        //          default: 1572
        //        }
        //  1292: ldc_w           213608851
        //  1295: iload           60
        //  1297: ixor           
        //  1298: istore          60
        //  1300: goto            1152
        //  1303: iload           60
        //  1305: ldc_w           1044927294
        //  1308: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1311: istore          60
        //  1313: iload           60
        //  1315: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1318: ldc_w           105073454
        //  1321: if_icmpeq       1326
        //  1324: aconst_null    
        //  1325: athrow         
        //  1326: new             Ljava/lang/IllegalAccessException;
        //  1329: dup            
        //  1330: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1333: athrow         
        //  1334: iload           60
        //  1336: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1339: lookupswitch {
        //          -1367310342: 1377
        //          -904561541: 1364
        //          default: 1676
        //        }
        //  1364: iload           60
        //  1366: ldc_w           1734172912
        //  1369: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1372: istore          60
        //  1374: goto            1385
        //  1377: ldc_w           1271906432
        //  1380: iload           60
        //  1382: ixor           
        //  1383: istore          60
        //  1385: pop            
        //  1386: iload           60
        //  1388: ldc_w           263665227
        //  1391: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1394: istore          60
        //  1396: goto            1181
        //  1399: ldc_w           656341847
        //  1402: iload           60
        //  1404: ixor           
        //  1405: istore          60
        //  1407: goto            2113
        //  1410: iload           60
        //  1412: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1415: lookupswitch {
        //          -1924675168: 1526
        //          506874507: 1561
        //          766101761: 1539
        //          908435017: 1491
        //          1215464857: 1504
        //          1352422504: 1550
        //          1556276747: 1515
        //          default: 1480
        //        }
        //  1480: new             Ljava/io/IOException;
        //  1483: dup            
        //  1484: ldc_w           "Error in hash"
        //  1487: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1490: athrow         
        //  1491: iload           60
        //  1493: ldc_w           1961611739
        //  1496: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1499: istore          60
        //  1501: goto            1940
        //  1504: ldc_w           2065773217
        //  1507: iload           60
        //  1509: ixor           
        //  1510: istore          60
        //  1512: goto            1940
        //  1515: ldc_w           968310483
        //  1518: iload           60
        //  1520: ixor           
        //  1521: istore          60
        //  1523: goto            1940
        //  1526: iload           60
        //  1528: ldc_w           1132960550
        //  1531: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1534: istore          60
        //  1536: goto            1940
        //  1539: ldc_w           2006604594
        //  1542: iload           60
        //  1544: ixor           
        //  1545: istore          60
        //  1547: goto            1940
        //  1550: ldc_w           1480386719
        //  1553: iload           60
        //  1555: ixor           
        //  1556: istore          60
        //  1558: goto            1940
        //  1561: ldc_w           837397315
        //  1564: iload           60
        //  1566: ixor           
        //  1567: istore          60
        //  1569: goto            1940
        //  1572: new             Ljava/lang/IllegalAccessException;
        //  1575: dup            
        //  1576: ldc_w           "Error in hash"
        //  1579: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1582: athrow         
        //  1583: iload           60
        //  1585: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1588: lookupswitch {
        //          59102818: 1632
        //          116526030: 1640
        //          464415346: 1583
        //          504137345: 2113
        //          default: 2113
        //        }
        //  1632: ldc_w           598167057
        //  1635: iload           60
        //  1637: ixor           
        //  1638: istore          60
        //  1640: iload           60
        //  1642: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1645: ldc_w           13505882
        //  1648: if_icmpeq       1654
        //  1651: goto            1665
        //  1654: ldc_w           1451504592
        //  1657: iload           60
        //  1659: ixor           
        //  1660: istore          60
        //  1662: goto            1836
        //  1665: ldc_w           1146918315
        //  1668: iload           60
        //  1670: ixor           
        //  1671: istore          60
        //  1673: goto            2113
        //  1676: new             Ljava/lang/RuntimeException;
        //  1679: dup            
        //  1680: ldc_w           "Error in hash"
        //  1683: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1686: athrow         
        //  1687: iload           60
        //  1689: ldc_w           1992567019
        //  1692: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1695: istore          60
        //  1697: iload           60
        //  1699: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1702: ldc_w           146112602
        //  1705: if_icmpeq       1710
        //  1708: aconst_null    
        //  1709: athrow         
        //  1710: new             Ljava/io/IOException;
        //  1713: dup            
        //  1714: invokespecial   java/io/IOException.<init>:()V
        //  1717: athrow         
        //  1718: iload           60
        //  1720: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1723: lookupswitch {
        //          -1474884144: 1759
        //          723576001: 1770
        //          default: 1748
        //        }
        //  1748: new             Ljava/io/IOException;
        //  1751: dup            
        //  1752: ldc_w           "Error in hash"
        //  1755: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1758: athrow         
        //  1759: ldc_w           433965615
        //  1762: iload           60
        //  1764: ixor           
        //  1765: istore          60
        //  1767: goto            1780
        //  1770: iload           60
        //  1772: ldc_w           700135181
        //  1775: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1778: istore          60
        //  1780: pop            
        //  1781: iload           60
        //  1783: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1786: lookupswitch {
        //          149973167: 1828
        //          471708487: 1781
        //          834108638: 2113
        //          1168351548: 1836
        //          default: 2113
        //        }
        //  1828: ldc_w           1945099481
        //  1831: iload           60
        //  1833: ixor           
        //  1834: istore          60
        //  1836: ldc_w           507650357
        //  1839: iload           60
        //  1841: ixor           
        //  1842: istore          60
        //  1844: iload           60
        //  1846: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1849: ldc_w           214834936
        //  1852: if_icmpeq       1857
        //  1855: aconst_null    
        //  1856: athrow         
        //  1857: new             Ljava/io/IOException;
        //  1860: dup            
        //  1861: invokespecial   java/io/IOException.<init>:()V
        //  1864: athrow         
        //  1865: iload           60
        //  1867: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1870: lookupswitch {
        //          194425803: 1918
        //          1621913419: 1907
        //          default: 1896
        //        }
        //  1896: new             Ljava/io/IOException;
        //  1899: dup            
        //  1900: ldc_w           "Error in hash"
        //  1903: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1906: athrow         
        //  1907: ldc_w           294148214
        //  1910: iload           60
        //  1912: ixor           
        //  1913: istore          60
        //  1915: goto            1928
        //  1918: iload           60
        //  1920: ldc_w           485426150
        //  1923: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1926: istore          60
        //  1928: pop            
        //  1929: ldc_w           2117938873
        //  1932: iload           60
        //  1934: ixor           
        //  1935: istore          60
        //  1937: goto            1971
        //  1940: astore          30
        //  1942: aload           30
        //  1944: astore          56
        //  1946: ldc_w           804904831
        //  1949: iload           60
        //  1951: ixor           
        //  1952: istore          60
        //  1954: aload           56
        //  1956: astore          31
        //  1958: aload           31
        //  1960: invokevirtual   java/sql/SQLException.printStackTrace:()V
        //  1963: ldc_w           2121680459
        //  1966: iload           60
        //  1968: ixor           
        //  1969: istore          60
        //  1971: ldc_w           60881703
        //  1974: iload           60
        //  1976: ixor           
        //  1977: i2b            
        //  1978: istore          29
        //  1980: iload           29
        //  1982: ireturn        
        //  1983: iload           60
        //  1985: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1988: lookupswitch {
        //          152589440: 2032
        //          1367265833: 2113
        //          1617217163: 2113
        //          1884172353: 1983
        //          default: 2113
        //        }
        //  2032: ldc_w           724191430
        //  2035: iload           60
        //  2037: ixor           
        //  2038: istore          60
        //  2040: goto            2113
        //  2043: iload           60
        //  2045: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2048: lookupswitch {
        //          28201427: 2113
        //          63490171: 2092
        //          788148511: 2113
        //          1156297749: 2043
        //          default: 2113
        //        }
        //  2092: ldc_w           565060858
        //  2095: iload           60
        //  2097: ixor           
        //  2098: istore          60
        //  2100: goto            2113
        //  2103: iload           60
        //  2105: ldc_w           111863651
        //  2108: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2111: istore          60
        //  2113: new             Ljava/lang/RuntimeException;
        //  2116: dup            
        //  2117: invokespecial   java/lang/RuntimeException.<init>:()V
        //  2120: athrow         
        //    StackMapTable: 00 5A FF 00 6A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 15 2F 07 FF 01 25 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 01 01 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 07 01 60 01 07 00 02 07 01 A2 07 00 04 01 07 00 D5 00 00 00 00 00 00 00 00 00 07 01 4D 01 07 01 4D 07 03 48 00 07 01 4D 01 07 03 81 00 00 00 00 01 00 00 06 2E 07 0D 2D FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 60 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 46 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 17 2F 07 FF 00 1E 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 1C 06 15 2D 4A 07 00 C0 58 07 00 C0 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 16 47 07 00 BD 5D 07 00 BD 4C 07 00 BD 47 07 00 BD FF 00 0D 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 45 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 30 07 0D 0A FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 07 00 D5 00 00 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 BD FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 16 47 07 00 C4 5D 07 00 C4 4A 07 00 C4 4A 07 00 C4 49 07 00 C4 00 2E FF 00 07 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 14 47 07 00 C4 5E 07 00 C4 4A 07 00 C4 4A 07 00 C4 49 07 00 C4 FF 00 0B 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 1E FF 00 0B 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 00 00 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 07 01 4D 00 00 00 00 00 00 01 00 00 30 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 07 03 48 07 00 D5 07 00 DC 07 01 60 01 01 07 01 A2 01 00 00 00 00 00 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 07 01 60 01 07 00 02 07 01 A2 07 00 04 01 07 00 D5 00 00 00 00 00 00 00 00 00 07 01 4D 01 07 01 4D 07 03 48 00 07 01 4D 01 07 03 81 00 00 00 00 01 00 00 30 FF 00 0A 00 3D 07 00 02 07 03 48 01 07 00 02 07 03 48 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 09
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  208    442    833    1687   Ljava/lang/Throwable;
        //  1130   1149   1267   1303   Ljava/lang/Throwable;
        //  184    478    611    833    Ljava/sql/SQLException;
        //  1076   1188   1410   1572   Ljava/sql/SQLException;
        //  1697   1718   1718   1836   Ljava/io/IOException;
        //  1844   1865   1865   1940   Ljava/io/IOException;
        //  1313   1334   1334   1399   Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0478:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void saveLocation$479125106(final String p0, final Location p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           2059552041
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_3        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          64
        //    16: ldc_w           892605061
        //    19: iload           64
        //    21: ixor           
        //    22: istore          64
        //    24: aload_0        
        //    25: astore          4
        //    27: aload           4
        //    29: ldc             1279769918
        //    31: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    34: astore          10
        //    36: aload           10
        //    38: astore          7
        //    40: ldc_w           2139027460
        //    43: iload           64
        //    45: ixor           
        //    46: istore          64
        //    48: aload           7
        //    50: astore          11
        //    52: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.iqubswrsirpbadz:()[B
        //    55: iload           64
        //    57: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    60: astore          5
        //    62: aload           11
        //    64: aload           5
        //    66: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    71: astore          12
        //    73: aload           12
        //    75: astore          8
        //    77: ldc_w           1731323300
        //    80: iload           64
        //    82: ixor           
        //    83: istore          64
        //    85: aload           8
        //    87: astore          13
        //    89: ldc_w           1048647232
        //    92: iload           64
        //    94: ixor           
        //    95: i2b            
        //    96: istore          35
        //    98: aload_1        
        //    99: astore          6
        //   101: aload           13
        //   103: iload           35
        //   105: aload           6
        //   107: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   112: ldc_w           1211874474
        //   115: iload           64
        //   117: ixor           
        //   118: istore          64
        //   120: aload           8
        //   122: astore          14
        //   124: ldc_w           1991944937
        //   127: iload           64
        //   129: ixor           
        //   130: i2b            
        //   131: istore          36
        //   133: aload_2        
        //   134: astore          44
        //   136: aload           44
        //   138: invokevirtual   org/bukkit/Location.getX:()D
        //   141: dstore          45
        //   143: aload           14
        //   145: iload           36
        //   147: dload           45
        //   149: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   154: ldc_w           1781125968
        //   157: iload           64
        //   159: ixor           
        //   160: istore          64
        //   162: aload           8
        //   164: astore          15
        //   166: ldc_w           479427000
        //   169: iload           64
        //   171: ixor           
        //   172: i2b            
        //   173: istore          37
        //   175: aload_2        
        //   176: astore          47
        //   178: aload           47
        //   180: invokevirtual   org/bukkit/Location.getY:()D
        //   183: dstore          48
        //   185: aload           15
        //   187: iload           37
        //   189: dload           48
        //   191: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   196: ldc_w           851500079
        //   199: iload           64
        //   201: ixor           
        //   202: istore          64
        //   204: aload           8
        //   206: astore          16
        //   208: ldc_w           777233808
        //   211: iload           64
        //   213: ixor           
        //   214: i2b            
        //   215: istore          38
        //   217: aload_2        
        //   218: astore          50
        //   220: aload           50
        //   222: invokevirtual   org/bukkit/Location.getZ:()D
        //   225: dstore          51
        //   227: aload           16
        //   229: iload           38
        //   231: dload           51
        //   233: invokeinterface java/sql/PreparedStatement.setDouble:(ID)V
        //   238: ldc_w           2096771670
        //   241: iload           64
        //   243: ixor           
        //   244: istore          64
        //   246: aload           8
        //   248: astore          17
        //   250: ldc_w           1386846151
        //   253: iload           64
        //   255: ixor           
        //   256: i2b            
        //   257: istore          39
        //   259: aload_2        
        //   260: astore          53
        //   262: aload           53
        //   264: invokevirtual   org/bukkit/Location.getYaw:()F
        //   267: fstore          54
        //   269: aload           17
        //   271: iload           39
        //   273: fload           54
        //   275: invokeinterface java/sql/PreparedStatement.setFloat:(IF)V
        //   280: ldc_w           1816387806
        //   283: iload           64
        //   285: ixor           
        //   286: istore          64
        //   288: aload           8
        //   290: astore          18
        //   292: ldc_w           1055553306
        //   295: iload           64
        //   297: ixor           
        //   298: i2b            
        //   299: istore          40
        //   301: aload_2        
        //   302: astore          55
        //   304: aload           55
        //   306: invokevirtual   org/bukkit/Location.getPitch:()F
        //   309: fstore          56
        //   311: aload           18
        //   313: iload           40
        //   315: fload           56
        //   317: invokeinterface java/sql/PreparedStatement.setFloat:(IF)V
        //   322: ldc_w           186684245
        //   325: iload           64
        //   327: ixor           
        //   328: istore          64
        //   330: aload           8
        //   332: astore          19
        //   334: ldc_w           902489166
        //   337: iload           64
        //   339: ixor           
        //   340: i2b            
        //   341: istore          41
        //   343: aload_2        
        //   344: astore          57
        //   346: aload           57
        //   348: invokevirtual   org/bukkit/Location.getWorld:()Lorg/bukkit/World;
        //   351: astore          58
        //   353: aload           58
        //   355: invokeinterface org/bukkit/World.getName:()Ljava/lang/String;
        //   360: astore          59
        //   362: aload           19
        //   364: iload           41
        //   366: aload           59
        //   368: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   373: ldc_w           1903524591
        //   376: iload           64
        //   378: ixor           
        //   379: istore          64
        //   381: aload           8
        //   383: astore          20
        //   385: aload           20
        //   387: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   392: istore          21
        //   394: ldc_w           1287285996
        //   397: iload           64
        //   399: ixor           
        //   400: istore          64
        //   402: aload           7
        //   404: astore          22
        //   406: aload           22
        //   408: ifnull          607
        //   411: ldc_w           743007268
        //   414: iload           64
        //   416: ixor           
        //   417: istore          64
        //   419: aload           7
        //   421: astore          23
        //   423: aload           23
        //   425: invokeinterface java/sql/Connection.close:()V
        //   430: goto            1268
        //   433: astore          29
        //   435: aload           29
        //   437: astore          62
        //   439: aload           7
        //   441: astore          30
        //   443: aload           30
        //   445: ifnull          514
        //   448: ldc_w           754909130
        //   451: iload           64
        //   453: ixor           
        //   454: istore          64
        //   456: aload           7
        //   458: astore          31
        //   460: aload           31
        //   462: invokeinterface java/sql/Connection.close:()V
        //   467: ldc_w           456009667
        //   470: iload           64
        //   472: ixor           
        //   473: istore          64
        //   475: goto            744
        //   478: astore          33
        //   480: aload           33
        //   482: astore          9
        //   484: aload           62
        //   486: astore          34
        //   488: aload           9
        //   490: astore          43
        //   492: aload           34
        //   494: aload           43
        //   496: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   499: ldc_w           257542548
        //   502: iload           64
        //   504: ixor           
        //   505: istore          64
        //   507: aload           62
        //   509: astore          32
        //   511: aload           32
        //   513: athrow         
        //   514: iload           64
        //   516: ldc_w           1379331735
        //   519: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   522: istore          64
        //   524: iload           64
        //   526: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   529: ldc_w           23107617
        //   532: if_icmpeq       548
        //   535: iload           64
        //   537: ldc_w           1677426509
        //   540: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   543: istore          64
        //   545: goto            803
        //   548: iload           64
        //   550: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   553: lookupswitch {
        //          23107617: 596
        //          764656959: 507
        //          1670791067: 803
        //          1957560837: 548
        //          default: 803
        //        }
        //   596: ldc_w           1003222400
        //   599: iload           64
        //   601: ixor           
        //   602: istore          64
        //   604: goto            507
        //   607: iload           64
        //   609: ldc_w           262959212
        //   612: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   615: istore          64
        //   617: iload           64
        //   619: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   622: ldc_w           120516010
        //   625: if_icmpeq       687
        //   628: iload           64
        //   630: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   633: lookupswitch {
        //          120516010: 676
        //          272929386: 803
        //          1074089737: 628
        //          1709166025: 803
        //          default: 803
        //        }
        //   676: ldc_w           127666382
        //   679: iload           64
        //   681: ixor           
        //   682: istore          64
        //   684: goto            803
        //   687: ldc_w           1516823730
        //   690: iload           64
        //   692: ixor           
        //   693: istore          64
        //   695: goto            1362
        //   698: iload           64
        //   700: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   703: tableswitch {
        //          -798077056: 720
        //          default: 733
        //        }
        //   720: iload           64
        //   722: ldc_w           1247423817
        //   725: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   728: istore          64
        //   730: goto            478
        //   733: new             Ljava/io/IOException;
        //   736: dup            
        //   737: ldc_w           "Error in hash"
        //   740: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   743: athrow         
        //   744: iload           64
        //   746: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   749: lookupswitch {
        //          96874799: 792
        //          137731375: 803
        //          1333272409: 811
        //          2049830798: 744
        //          default: 803
        //        }
        //   792: ldc_w           71764171
        //   795: iload           64
        //   797: ixor           
        //   798: istore          64
        //   800: goto            811
        //   803: new             Ljava/io/IOException;
        //   806: dup            
        //   807: invokespecial   java/io/IOException.<init>:()V
        //   810: athrow         
        //   811: iload           64
        //   813: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   816: ldc_w           38325598
        //   819: if_icmpeq       824
        //   822: aconst_null    
        //   823: athrow         
        //   824: new             Ljava/io/IOException;
        //   827: dup            
        //   828: invokespecial   java/io/IOException.<init>:()V
        //   831: athrow         
        //   832: iload           64
        //   834: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   837: lookupswitch {
        //          -1816593342: 864
        //          327049088: 875
        //          default: 895
        //        }
        //   864: ldc_w           1936150633
        //   867: iload           64
        //   869: ixor           
        //   870: istore          64
        //   872: goto            883
        //   875: ldc_w           595559441
        //   878: iload           64
        //   880: ixor           
        //   881: istore          64
        //   883: pop            
        //   884: ldc_w           2031439812
        //   887: iload           64
        //   889: ixor           
        //   890: istore          64
        //   892: goto            507
        //   895: new             Ljava/io/IOException;
        //   898: dup            
        //   899: ldc_w           "Error in hash"
        //   902: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   905: athrow         
        //   906: iload           64
        //   908: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   911: lookupswitch {
        //          -1883186799: 1196
        //          -1790132718: 1126
        //          -1370021303: 1183
        //          -1244309669: 1148
        //          -1159311990: 1244
        //          -1071120086: 1209
        //          -846749910: 1080
        //          -459551272: 1104
        //          -399038528: 1222
        //          -200756727: 1115
        //          -145508127: 1172
        //          577024881: 1159
        //          637334834: 1067
        //          826677720: 1257
        //          913334025: 1093
        //          1076859472: 1233
        //          1922903201: 1056
        //          default: 1137
        //        }
        //  1056: ldc_w           1504358354
        //  1059: iload           64
        //  1061: ixor           
        //  1062: istore          64
        //  1064: goto            1468
        //  1067: iload           64
        //  1069: ldc_w           860263648
        //  1072: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1075: istore          64
        //  1077: goto            1468
        //  1080: iload           64
        //  1082: ldc_w           776599971
        //  1085: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1088: istore          64
        //  1090: goto            1468
        //  1093: ldc_w           1362559399
        //  1096: iload           64
        //  1098: ixor           
        //  1099: istore          64
        //  1101: goto            1468
        //  1104: ldc_w           1802138621
        //  1107: iload           64
        //  1109: ixor           
        //  1110: istore          64
        //  1112: goto            1468
        //  1115: ldc_w           1232608263
        //  1118: iload           64
        //  1120: ixor           
        //  1121: istore          64
        //  1123: goto            1468
        //  1126: ldc_w           626040196
        //  1129: iload           64
        //  1131: ixor           
        //  1132: istore          64
        //  1134: goto            1468
        //  1137: new             Ljava/lang/IllegalAccessException;
        //  1140: dup            
        //  1141: ldc_w           "Error in hash"
        //  1144: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1147: athrow         
        //  1148: ldc_w           21209261
        //  1151: iload           64
        //  1153: ixor           
        //  1154: istore          64
        //  1156: goto            1468
        //  1159: iload           64
        //  1161: ldc_w           1404410920
        //  1164: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1167: istore          64
        //  1169: goto            1468
        //  1172: ldc_w           1226014042
        //  1175: iload           64
        //  1177: ixor           
        //  1178: istore          64
        //  1180: goto            1468
        //  1183: iload           64
        //  1185: ldc_w           1110699535
        //  1188: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1191: istore          64
        //  1193: goto            1468
        //  1196: iload           64
        //  1198: ldc_w           1174475124
        //  1201: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1204: istore          64
        //  1206: goto            1468
        //  1209: iload           64
        //  1211: ldc_w           805046883
        //  1214: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1217: istore          64
        //  1219: goto            1468
        //  1222: ldc_w           1795157694
        //  1225: iload           64
        //  1227: ixor           
        //  1228: istore          64
        //  1230: goto            1468
        //  1233: ldc_w           2147285004
        //  1236: iload           64
        //  1238: ixor           
        //  1239: istore          64
        //  1241: goto            1468
        //  1244: iload           64
        //  1246: ldc_w           547734519
        //  1249: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1252: istore          64
        //  1254: goto            1468
        //  1257: ldc_w           1909574013
        //  1260: iload           64
        //  1262: ixor           
        //  1263: istore          64
        //  1265: goto            1468
        //  1268: iload           64
        //  1270: ldc_w           932518669
        //  1273: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1276: istore          64
        //  1278: iload           64
        //  1280: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1283: ldc_w           108368438
        //  1286: if_icmpeq       1291
        //  1289: aconst_null    
        //  1290: athrow         
        //  1291: new             Ljava/lang/IllegalAccessException;
        //  1294: dup            
        //  1295: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1298: athrow         
        //  1299: iload           64
        //  1301: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1304: lookupswitch {
        //          -1630770408: 1332
        //          472968784: 1343
        //          default: 1537
        //        }
        //  1332: ldc_w           1573053751
        //  1335: iload           64
        //  1337: ixor           
        //  1338: istore          64
        //  1340: goto            1351
        //  1343: ldc_w           1302164894
        //  1346: iload           64
        //  1348: ixor           
        //  1349: istore          64
        //  1351: pop            
        //  1352: iload           64
        //  1354: ldc_w           333057728
        //  1357: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1360: istore          64
        //  1362: ldc_w           46636583
        //  1365: iload           64
        //  1367: ixor           
        //  1368: istore          64
        //  1370: iload           64
        //  1372: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1375: ldc_w           136175324
        //  1378: if_icmpeq       1383
        //  1381: aconst_null    
        //  1382: athrow         
        //  1383: new             Ljava/lang/RuntimeException;
        //  1386: dup            
        //  1387: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1390: athrow         
        //  1391: iload           64
        //  1393: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1396: lookupswitch {
        //          -1930786277: 1424
        //          -130562662: 1446
        //          default: 1435
        //        }
        //  1424: ldc_w           628171702
        //  1427: iload           64
        //  1429: ixor           
        //  1430: istore          64
        //  1432: goto            1454
        //  1435: new             Ljava/lang/RuntimeException;
        //  1438: dup            
        //  1439: ldc_w           "Error in hash"
        //  1442: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1445: athrow         
        //  1446: ldc_w           199920198
        //  1449: iload           64
        //  1451: ixor           
        //  1452: istore          64
        //  1454: pop            
        //  1455: iload           64
        //  1457: ldc_w           245598076
        //  1460: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1463: istore          64
        //  1465: goto            1499
        //  1468: astore          27
        //  1470: aload           27
        //  1472: astore          61
        //  1474: ldc_w           1655828085
        //  1477: iload           64
        //  1479: ixor           
        //  1480: istore          64
        //  1482: aload           61
        //  1484: astore          28
        //  1486: aload           28
        //  1488: invokevirtual   java/sql/SQLException.printStackTrace:()V
        //  1491: ldc_w           1325863354
        //  1494: iload           64
        //  1496: ixor           
        //  1497: istore          64
        //  1499: aload_0        
        //  1500: astore          24
        //  1502: aload           24
        //  1504: getfield        dev/daniboy/donutcore/database/SQLiteManager.locationCache:Ljava/util/Map;
        //  1507: astore          25
        //  1509: aload_1        
        //  1510: astore          42
        //  1512: aload_2        
        //  1513: astore          60
        //  1515: aload           25
        //  1517: aload           42
        //  1519: aload           60
        //  1521: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1526: astore          26
        //  1528: ldc_w           1745782548
        //  1531: iload           64
        //  1533: ixor           
        //  1534: istore          64
        //  1536: return         
        //  1537: new             Ljava/lang/RuntimeException;
        //  1540: dup            
        //  1541: ldc_w           "Error in hash"
        //  1544: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1547: athrow         
        //  1548: iload           64
        //  1550: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1553: lookupswitch {
        //          -1790132718: 1741
        //          -1370021303: 1730
        //          -1244309669: 1704
        //          -846749910: 1658
        //          -459551272: 1682
        //          -200756727: 1647
        //          -145508127: 1636
        //          637334834: 1669
        //          1922903201: 1717
        //          default: 1693
        //        }
        //  1636: ldc_w           252865582
        //  1639: iload           64
        //  1641: ixor           
        //  1642: istore          64
        //  1644: goto            433
        //  1647: ldc_w           259591539
        //  1650: iload           64
        //  1652: ixor           
        //  1653: istore          64
        //  1655: goto            433
        //  1658: ldc_w           1749608663
        //  1661: iload           64
        //  1663: ixor           
        //  1664: istore          64
        //  1666: goto            433
        //  1669: iload           64
        //  1671: ldc_w           1967621524
        //  1674: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1677: istore          64
        //  1679: goto            433
        //  1682: ldc_w           762012297
        //  1685: iload           64
        //  1687: ixor           
        //  1688: istore          64
        //  1690: goto            433
        //  1693: new             Ljava/io/IOException;
        //  1696: dup            
        //  1697: ldc_w           "Error in hash"
        //  1700: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1703: athrow         
        //  1704: iload           64
        //  1706: ldc_w           1195553241
        //  1709: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1712: istore          64
        //  1714: goto            433
        //  1717: iload           64
        //  1719: ldc_w           531349158
        //  1722: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1725: istore          64
        //  1727: goto            433
        //  1730: ldc_w           70451067
        //  1733: iload           64
        //  1735: ixor           
        //  1736: istore          64
        //  1738: goto            433
        //  1741: iload           64
        //  1743: ldc_w           1666288880
        //  1746: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1749: istore          64
        //  1751: goto            433
        //    StackMapTable: 00 45 FF 01 B1 00 41 07 00 02 07 01 4D 07 01 98 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 41 07 00 02 07 01 4D 07 01 98 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 1C 06 21 2F FF 00 0A 00 3E 07 00 02 07 01 4D 07 01 98 01 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01 00 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 00 00 00 00 01 00 00 14 2F 0A FF 00 0A 00 41 07 00 02 07 01 4D 07 01 98 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 01 07 00 C0 55 07 00 C0 4C 07 00 C0 FF 00 0A 00 41 07 00 02 07 01 4D 07 01 98 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 2F FF 00 0A 00 41 07 00 02 07 01 4D 07 01 98 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 41 07 00 02 07 01 4D 07 01 98 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 01 00 00 0C 47 07 00 C4 5F 07 00 C4 4A 07 00 C4 47 07 00 C4 4B 07 00 C4 FF 00 0A 00 41 07 00 02 07 01 4D 07 01 98 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 95 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 FF 00 0A 00 3E 07 00 02 07 01 4D 07 01 98 01 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01 00 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 00 00 00 00 01 00 00 16 47 07 00 BD 60 07 00 BD 4A 07 00 BD 47 07 00 BD FF 00 0A 00 3E 07 00 02 07 01 4D 07 01 98 01 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01 00 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 00 00 00 00 01 00 00 14 47 07 00 C2 60 07 00 C2 4A 07 00 C2 4A 07 00 C2 47 07 00 C2 FF 00 0D 00 41 07 00 02 07 01 4D 07 01 98 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 1E FF 00 25 00 3E 07 00 02 07 01 4D 07 01 98 01 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01 00 00 07 01 98 03 07 01 98 03 07 01 98 03 07 01 98 02 07 01 98 02 07 01 98 07 01 F8 07 01 4D 00 00 00 00 01 00 01 07 00 BD FF 00 0A 00 41 07 00 02 07 01 4D 07 01 98 01 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 57 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  48     402    1548   1754   Ljava/lang/Throwable;
        //  456    475    698    744    Ljava/lang/Throwable;
        //  24     514    906    1268   Ljava/sql/SQLException;
        //  1278   1299   1299   1362   Ljava/lang/IllegalAccessException;
        //  1370   1391   1391   1468   Ljava/lang/RuntimeException;
        //  811    832    832    906    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0433:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void deleteLocation(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           1393224939
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: ixor           
        //    11: ixor           
        //    12: istore          34
        //    14: ldc_w           1323741300
        //    17: iload           34
        //    19: ixor           
        //    20: istore          34
        //    22: aload_0        
        //    23: astore_2       
        //    24: aload_2        
        //    25: ldc             1279769918
        //    27: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //    30: astore          8
        //    32: aload           8
        //    34: astore          5
        //    36: ldc_w           1668547660
        //    39: iload           34
        //    41: ixor           
        //    42: istore          34
        //    44: aload           5
        //    46: astore          9
        //    48: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.vqxgebsrcumeqox:()[B
        //    51: iload           34
        //    53: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //    56: astore_3       
        //    57: aload           9
        //    59: aload_3        
        //    60: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //    65: astore          10
        //    67: aload           10
        //    69: astore          6
        //    71: ldc_w           1407733026
        //    74: iload           34
        //    76: ixor           
        //    77: istore          34
        //    79: aload           6
        //    81: astore          11
        //    83: ldc_w           751008729
        //    86: iload           34
        //    88: ixor           
        //    89: i2b            
        //    90: istore          27
        //    92: aload_1        
        //    93: astore          4
        //    95: aload           11
        //    97: iload           27
        //    99: aload           4
        //   101: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   106: ldc_w           542332067
        //   109: iload           34
        //   111: ixor           
        //   112: istore          34
        //   114: aload           6
        //   116: astore          12
        //   118: aload           12
        //   120: invokeinterface java/sql/PreparedStatement.executeUpdate:()I
        //   125: istore          13
        //   127: ldc_w           993660979
        //   130: iload           34
        //   132: ixor           
        //   133: istore          34
        //   135: aload           5
        //   137: astore          14
        //   139: aload           14
        //   141: ifnull          863
        //   144: ldc_w           2136972659
        //   147: iload           34
        //   149: ixor           
        //   150: istore          34
        //   152: aload           5
        //   154: astore          15
        //   156: aload           15
        //   158: invokeinterface java/sql/Connection.close:()V
        //   163: goto            999
        //   166: astore          21
        //   168: aload           21
        //   170: astore          31
        //   172: aload           5
        //   174: astore          22
        //   176: aload           22
        //   178: ifnull          772
        //   181: ldc_w           251330499
        //   184: iload           34
        //   186: ixor           
        //   187: istore          34
        //   189: aload           5
        //   191: astore          23
        //   193: aload           23
        //   195: invokeinterface java/sql/Connection.close:()V
        //   200: ldc_w           1440456444
        //   203: iload           34
        //   205: ixor           
        //   206: istore          34
        //   208: goto            247
        //   211: astore          24
        //   213: aload           24
        //   215: astore          7
        //   217: aload           31
        //   219: astore          25
        //   221: aload           7
        //   223: astore          29
        //   225: aload           25
        //   227: aload           29
        //   229: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   232: ldc_w           898043178
        //   235: iload           34
        //   237: ixor           
        //   238: istore          34
        //   240: aload           31
        //   242: astore          26
        //   244: aload           26
        //   246: athrow         
        //   247: iload           34
        //   249: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   252: lookupswitch {
        //          187458203: 296
        //          1238073223: 1059
        //          2118480029: 247
        //          2143107289: 304
        //          default: 1059
        //        }
        //   296: ldc_w           1188148888
        //   299: iload           34
        //   301: ixor           
        //   302: istore          34
        //   304: iload           34
        //   306: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   309: ldc_w           16039686
        //   312: if_icmpeq       317
        //   315: aconst_null    
        //   316: athrow         
        //   317: new             Ljava/lang/IllegalAccessException;
        //   320: dup            
        //   321: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //   324: athrow         
        //   325: iload           34
        //   327: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   330: lookupswitch {
        //          136869784: 367
        //          222688003: 378
        //          default: 356
        //        }
        //   356: new             Ljava/lang/IllegalAccessException;
        //   359: dup            
        //   360: ldc_w           "Error in hash"
        //   363: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   366: athrow         
        //   367: ldc_w           868440740
        //   370: iload           34
        //   372: ixor           
        //   373: istore          34
        //   375: goto            388
        //   378: iload           34
        //   380: ldc_w           1399777847
        //   383: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   386: istore          34
        //   388: pop            
        //   389: ldc_w           859626565
        //   392: iload           34
        //   394: ixor           
        //   395: istore          34
        //   397: goto            240
        //   400: iload           34
        //   402: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   405: tableswitch {
        //          552757616: 435
        //          default: 424
        //        }
        //   424: new             Ljava/lang/RuntimeException;
        //   427: dup            
        //   428: ldc_w           "Error in hash"
        //   431: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   434: athrow         
        //   435: ldc_w           645047215
        //   438: iload           34
        //   440: ixor           
        //   441: istore          34
        //   443: goto            211
        //   446: iload           34
        //   448: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   451: lookupswitch {
        //          -1871104840: 642
        //          -1544803903: 592
        //          -1118700991: 631
        //          -486959696: 559
        //          -407975264: 664
        //          -111560749: 548
        //          265568400: 570
        //          1051050842: 618
        //          1202524634: 605
        //          1686207448: 581
        //          1713102529: 677
        //          default: 653
        //        }
        //   548: ldc_w           442967182
        //   551: iload           34
        //   553: ixor           
        //   554: istore          34
        //   556: goto            1255
        //   559: ldc_w           2031296706
        //   562: iload           34
        //   564: ixor           
        //   565: istore          34
        //   567: goto            1255
        //   570: ldc_w           1689688678
        //   573: iload           34
        //   575: ixor           
        //   576: istore          34
        //   578: goto            1255
        //   581: ldc_w           1776041231
        //   584: iload           34
        //   586: ixor           
        //   587: istore          34
        //   589: goto            1255
        //   592: iload           34
        //   594: ldc_w           1362204492
        //   597: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   600: istore          34
        //   602: goto            1255
        //   605: iload           34
        //   607: ldc_w           767144015
        //   610: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   613: istore          34
        //   615: goto            1255
        //   618: iload           34
        //   620: ldc_w           580430367
        //   623: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   626: istore          34
        //   628: goto            1255
        //   631: ldc_w           1390816572
        //   634: iload           34
        //   636: ixor           
        //   637: istore          34
        //   639: goto            1255
        //   642: ldc_w           2000893155
        //   645: iload           34
        //   647: ixor           
        //   648: istore          34
        //   650: goto            1255
        //   653: new             Ljava/io/IOException;
        //   656: dup            
        //   657: ldc_w           "Error in hash"
        //   660: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   663: athrow         
        //   664: iload           34
        //   666: ldc_w           2042219296
        //   669: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   672: istore          34
        //   674: goto            1255
        //   677: ldc_w           1234135468
        //   680: iload           34
        //   682: ixor           
        //   683: istore          34
        //   685: goto            1255
        //   688: iload           34
        //   690: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   693: lookupswitch {
        //          -111560749: 761
        //          1686207448: 739
        //          1713102529: 750
        //          default: 728
        //        }
        //   728: new             Ljava/lang/IllegalAccessException;
        //   731: dup            
        //   732: ldc_w           "Error in hash"
        //   735: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   738: athrow         
        //   739: ldc_w           275117615
        //   742: iload           34
        //   744: ixor           
        //   745: istore          34
        //   747: goto            166
        //   750: ldc_w           808886924
        //   753: iload           34
        //   755: ixor           
        //   756: istore          34
        //   758: goto            166
        //   761: ldc_w           1675554734
        //   764: iload           34
        //   766: ixor           
        //   767: istore          34
        //   769: goto            166
        //   772: iload           34
        //   774: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   777: lookupswitch {
        //          136071655: 820
        //          150566214: 1059
        //          1025793470: 828
        //          1506184565: 772
        //          default: 1059
        //        }
        //   820: ldc_w           415629935
        //   823: iload           34
        //   825: ixor           
        //   826: istore          34
        //   828: iload           34
        //   830: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   833: ldc_w           66099636
        //   836: if_icmpeq       850
        //   839: ldc_w           39664324
        //   842: iload           34
        //   844: ixor           
        //   845: istore          34
        //   847: goto            1059
        //   850: iload           34
        //   852: ldc_w           97080105
        //   855: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   858: istore          34
        //   860: goto            240
        //   863: ldc_w           1376431151
        //   866: iload           34
        //   868: ixor           
        //   869: istore          34
        //   871: iload           34
        //   873: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   876: ldc_w           82278455
        //   879: if_icmpeq       939
        //   882: iload           34
        //   884: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   887: lookupswitch {
        //          82278455: 928
        //          192981775: 1059
        //          253987970: 882
        //          2091413840: 1059
        //          default: 1059
        //        }
        //   928: ldc_w           1674474136
        //   931: iload           34
        //   933: ixor           
        //   934: istore          34
        //   936: goto            1059
        //   939: iload           34
        //   941: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   944: lookupswitch {
        //          82278455: 988
        //          608758619: 1163
        //          1332547177: 939
        //          1653136586: 1059
        //          default: 1059
        //        }
        //   988: ldc_w           967127075
        //   991: iload           34
        //   993: ixor           
        //   994: istore          34
        //   996: goto            1163
        //   999: iload           34
        //  1001: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1004: lookupswitch {
        //          57607234: 1067
        //          62128101: 1059
        //          224109223: 1048
        //          855102548: 999
        //          default: 1059
        //        }
        //  1048: ldc_w           763461025
        //  1051: iload           34
        //  1053: ixor           
        //  1054: istore          34
        //  1056: goto            1067
        //  1059: new             Ljava/lang/IllegalAccessException;
        //  1062: dup            
        //  1063: invokespecial   java/lang/IllegalAccessException.<init>:()V
        //  1066: athrow         
        //  1067: iload           34
        //  1069: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1072: ldc_w           76682318
        //  1075: if_icmpeq       1080
        //  1078: aconst_null    
        //  1079: athrow         
        //  1080: new             Ljava/lang/RuntimeException;
        //  1083: dup            
        //  1084: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1087: athrow         
        //  1088: iload           34
        //  1090: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1093: lookupswitch {
        //          732363987: 1144
        //          1325153345: 1120
        //          default: 1133
        //        }
        //  1120: iload           34
        //  1122: ldc_w           1659585445
        //  1125: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1128: istore          34
        //  1130: goto            1152
        //  1133: new             Ljava/io/IOException;
        //  1136: dup            
        //  1137: ldc_w           "Error in hash"
        //  1140: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1143: athrow         
        //  1144: ldc_w           775953335
        //  1147: iload           34
        //  1149: ixor           
        //  1150: istore          34
        //  1152: pop            
        //  1153: iload           34
        //  1155: ldc_w           389113705
        //  1158: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1161: istore          34
        //  1163: iload           34
        //  1165: ldc_w           1232595190
        //  1168: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1171: istore          34
        //  1173: iload           34
        //  1175: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1178: ldc_w           160262106
        //  1181: if_icmpeq       1186
        //  1184: aconst_null    
        //  1185: athrow         
        //  1186: new             Ljava/io/IOException;
        //  1189: dup            
        //  1190: invokespecial   java/io/IOException.<init>:()V
        //  1193: athrow         
        //  1194: iload           34
        //  1196: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1199: lookupswitch {
        //          -1416471152: 1235
        //          -1000832719: 1224
        //          default: 1319
        //        }
        //  1224: ldc_w           549830647
        //  1227: iload           34
        //  1229: ixor           
        //  1230: istore          34
        //  1232: goto            1243
        //  1235: ldc_w           222094435
        //  1238: iload           34
        //  1240: ixor           
        //  1241: istore          34
        //  1243: pop            
        //  1244: ldc_w           931137790
        //  1247: iload           34
        //  1249: ixor           
        //  1250: istore          34
        //  1252: goto            1286
        //  1255: astore          19
        //  1257: aload           19
        //  1259: astore          30
        //  1261: ldc_w           698438822
        //  1264: iload           34
        //  1266: ixor           
        //  1267: istore          34
        //  1269: aload           30
        //  1271: astore          20
        //  1273: aload           20
        //  1275: invokevirtual   java/sql/SQLException.printStackTrace:()V
        //  1278: ldc_w           1663295997
        //  1281: iload           34
        //  1283: ixor           
        //  1284: istore          34
        //  1286: aload_0        
        //  1287: astore          16
        //  1289: aload           16
        //  1291: getfield        dev/daniboy/donutcore/database/SQLiteManager.locationCache:Ljava/util/Map;
        //  1294: astore          17
        //  1296: aload_1        
        //  1297: astore          28
        //  1299: aload           17
        //  1301: aload           28
        //  1303: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1308: astore          18
        //  1310: ldc_w           1432086644
        //  1313: iload           34
        //  1315: ixor           
        //  1316: istore          34
        //  1318: return         
        //  1319: new             Ljava/io/IOException;
        //  1322: dup            
        //  1323: ldc_w           "Error in hash"
        //  1326: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1329: athrow         
        //    StackMapTable: 00 3D FF 00 A6 00 23 07 00 02 07 01 4D 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 23 07 00 02 07 01 4D 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 1C FF 00 06 00 23 07 00 02 07 01 4D 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 30 07 0C 47 07 00 BD 5E 07 00 BD 4A 07 00 BD 4A 07 00 BD 49 07 00 BD FF 00 0B 00 23 07 00 02 07 01 4D 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 57 07 00 C0 4A 07 00 C0 FF 00 0A 00 23 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 65 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 FF 00 0A 00 23 07 00 02 07 01 4D 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 67 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 FF 00 0A 00 23 07 00 02 07 01 4D 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 2F 07 15 FF 00 0C 00 23 07 00 02 07 01 4D 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00 00 01 00 00 12 2D 0A 30 FF 00 0A 00 23 07 00 02 07 01 4D 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00 00 01 00 00 30 FF 00 0A 00 23 07 00 02 07 01 4D 07 00 02 00 00 07 00 D5 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 23 07 00 02 07 01 4D 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00 00 01 00 00 0C 47 07 00 C2 5F 07 00 C2 4C 07 00 C2 4A 07 00 C2 47 07 00 C2 FF 00 0A 00 23 07 00 02 07 01 4D 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00 00 01 00 00 16 47 07 00 C4 5D 07 00 C4 4A 07 00 C4 47 07 00 C4 FF 00 0B 00 23 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 1E FF 00 20 00 23 07 00 02 07 01 4D 07 00 02 07 01 4D 07 01 4D 07 00 D5 07 00 DC 00 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 00 00 01 00 01 07 00 C4
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  44     135    688    863    Ljava/lang/Throwable;
        //  189    208    400    446    Ljava/lang/Throwable;
        //  22     247    446    688    Ljava/sql/SQLException;
        //  1067   1088   1088   1163   Ljava/lang/RuntimeException;
        //  1173   1194   1194   1255   Ljava/io/IOException;
        //  304    325    325    400    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0166:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Location getLocation$107949963(final String p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           611647073
        //     6: aload_0        
        //     7: getfield        dev/daniboy/donutcore/database/SQLiteManager.c3MhCWJeLB:I
        //    10: iload_2        
        //    11: ixor           
        //    12: ixor           
        //    13: ixor           
        //    14: istore          97
        //    16: ldc_w           801564407
        //    19: iload           97
        //    21: ixor           
        //    22: istore          97
        //    24: aload_0        
        //    25: astore_3       
        //    26: aload_3        
        //    27: getfield        dev/daniboy/donutcore/database/SQLiteManager.locationCache:Ljava/util/Map;
        //    30: astore          29
        //    32: aload_1        
        //    33: astore          4
        //    35: aload           29
        //    37: aload           4
        //    39: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    44: istore          30
        //    46: iload           30
        //    48: ldc_w           965905797
        //    51: iload           97
        //    53: ixor           
        //    54: if_icmpeq       99
        //    57: ldc_w           1608490393
        //    60: iload           97
        //    62: ixor           
        //    63: istore          97
        //    65: aload_0        
        //    66: astore          76
        //    68: aload           76
        //    70: getfield        dev/daniboy/donutcore/database/SQLiteManager.locationCache:Ljava/util/Map;
        //    73: astore          77
        //    75: aload_1        
        //    76: astore          90
        //    78: aload           77
        //    80: aload           90
        //    82: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    87: astore          78
        //    89: aload           78
        //    91: checkcast       Lorg/bukkit/Location;
        //    94: astore          79
        //    96: aload           79
        //    98: areturn        
        //    99: ldc_w           211345454
        //   102: iload           97
        //   104: ixor           
        //   105: istore          97
        //   107: iload           97
        //   109: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   112: ldc_w           113508721
        //   115: if_icmpeq       121
        //   118: goto            2337
        //   121: ldc_w           1431507577
        //   124: iload           97
        //   126: ixor           
        //   127: istore          97
        //   129: aload_0        
        //   130: astore          31
        //   132: aload           31
        //   134: ldc             1279769918
        //   136: invokevirtual   dev/daniboy/donutcore/database/SQLiteManager.getConnection$1863960987:(I)Ljava/sql/Connection;
        //   139: astore          32
        //   141: aload           32
        //   143: astore          14
        //   145: ldc_w           2091806582
        //   148: iload           97
        //   150: ixor           
        //   151: istore          97
        //   153: aload           14
        //   155: astore          33
        //   157: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.wvqyzjsincsxist:()[B
        //   160: iload           97
        //   162: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   165: astore          80
        //   167: aload           33
        //   169: aload           80
        //   171: invokeinterface java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        //   176: astore          34
        //   178: aload           34
        //   180: astore          15
        //   182: ldc_w           108988709
        //   185: iload           97
        //   187: ixor           
        //   188: istore          97
        //   190: aload           15
        //   192: astore          35
        //   194: ldc_w           445127040
        //   197: iload           97
        //   199: ixor           
        //   200: i2b            
        //   201: istore          81
        //   203: aload_1        
        //   204: astore          5
        //   206: aload           35
        //   208: iload           81
        //   210: aload           5
        //   212: invokeinterface java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        //   217: ldc_w           216543130
        //   220: iload           97
        //   222: ixor           
        //   223: istore          97
        //   225: aload           15
        //   227: astore          36
        //   229: aload           36
        //   231: invokeinterface java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        //   236: astore          37
        //   238: aload           37
        //   240: astore          16
        //   242: ldc_w           390324002
        //   245: iload           97
        //   247: ixor           
        //   248: istore          97
        //   250: aload           16
        //   252: astore          38
        //   254: aload           38
        //   256: invokeinterface java/sql/ResultSet.next:()Z
        //   261: istore          39
        //   263: iload           39
        //   265: ldc_w           19130681
        //   268: iload           97
        //   270: ixor           
        //   271: if_icmpeq       1481
        //   274: ldc_w           1453496989
        //   277: iload           97
        //   279: ixor           
        //   280: istore          97
        //   282: aload           16
        //   284: astore          45
        //   286: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.dlhssbwsjfveluu:()[B
        //   289: iload           97
        //   291: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   294: astore          82
        //   296: aload           45
        //   298: aload           82
        //   300: invokeinterface java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        //   305: dstore          46
        //   307: dload           46
        //   309: dstore          17
        //   311: ldc_w           674360820
        //   314: iload           97
        //   316: ixor           
        //   317: istore          97
        //   319: aload           16
        //   321: astore          48
        //   323: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.omuwryfcqllchxc:()[B
        //   326: iload           97
        //   328: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   331: astore          83
        //   333: aload           48
        //   335: aload           83
        //   337: invokeinterface java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        //   342: dstore          49
        //   344: dload           49
        //   346: dstore          19
        //   348: ldc_w           921759451
        //   351: iload           97
        //   353: ixor           
        //   354: istore          97
        //   356: aload           16
        //   358: astore          51
        //   360: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.fqmtogcwfrusfjt:()[B
        //   363: iload           97
        //   365: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   368: astore          84
        //   370: aload           51
        //   372: aload           84
        //   374: invokeinterface java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
        //   379: dstore          52
        //   381: dload           52
        //   383: dstore          21
        //   385: ldc_w           391375529
        //   388: iload           97
        //   390: ixor           
        //   391: istore          97
        //   393: aload           16
        //   395: astore          54
        //   397: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.nxftorlwypatxgy:()[B
        //   400: iload           97
        //   402: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   405: astore          85
        //   407: aload           54
        //   409: aload           85
        //   411: invokeinterface java/sql/ResultSet.getFloat:(Ljava/lang/String;)F
        //   416: fstore          55
        //   418: fload           55
        //   420: fstore          23
        //   422: ldc_w           2005307008
        //   425: iload           97
        //   427: ixor           
        //   428: istore          97
        //   430: aload           16
        //   432: astore          56
        //   434: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.xhcvmkzudhrmxtl:()[B
        //   437: iload           97
        //   439: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   442: astore          86
        //   444: aload           56
        //   446: aload           86
        //   448: invokeinterface java/sql/ResultSet.getFloat:(Ljava/lang/String;)F
        //   453: fstore          57
        //   455: fload           57
        //   457: fstore          24
        //   459: ldc_w           897054498
        //   462: iload           97
        //   464: ixor           
        //   465: istore          97
        //   467: aload           16
        //   469: astore          58
        //   471: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.lzxpnvtkcgmjcdb:()[B
        //   474: iload           97
        //   476: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.rpkelfzxgl:([BI)Ljava/lang/String;
        //   479: astore          87
        //   481: aload           58
        //   483: aload           87
        //   485: invokeinterface java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   490: astore          59
        //   492: aload           59
        //   494: astore          25
        //   496: ldc_w           491139679
        //   499: iload           97
        //   501: ixor           
        //   502: istore          97
        //   504: aload           25
        //   506: astore          60
        //   508: aload           60
        //   510: invokestatic    org/bukkit/Bukkit.getWorld:(Ljava/lang/String;)Lorg/bukkit/World;
        //   513: astore          61
        //   515: aload           61
        //   517: astore          26
        //   519: ldc_w           546201423
        //   522: iload           97
        //   524: ixor           
        //   525: istore          97
        //   527: new             Lorg/bukkit/Location;
        //   530: astore          62
        //   532: aload           26
        //   534: astore          91
        //   536: dload           17
        //   538: dstore          6
        //   540: dload           19
        //   542: dstore          8
        //   544: dload           21
        //   546: dstore          10
        //   548: fload           23
        //   550: fstore          12
        //   552: fload           24
        //   554: fstore          13
        //   556: aload           62
        //   558: aload           91
        //   560: dload           6
        //   562: dload           8
        //   564: dload           10
        //   566: fload           12
        //   568: fload           13
        //   570: invokespecial   org/bukkit/Location.<init>:(Lorg/bukkit/World;DDDFF)V
        //   573: aload           62
        //   575: astore          27
        //   577: ldc_w           1876646149
        //   580: iload           97
        //   582: ixor           
        //   583: istore          97
        //   585: aload_0        
        //   586: astore          63
        //   588: aload           63
        //   590: getfield        dev/daniboy/donutcore/database/SQLiteManager.locationCache:Ljava/util/Map;
        //   593: astore          64
        //   595: aload_1        
        //   596: astore          88
        //   598: aload           27
        //   600: astore          92
        //   602: aload           64
        //   604: aload           88
        //   606: aload           92
        //   608: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   613: astore          65
        //   615: ldc_w           877572318
        //   618: iload           97
        //   620: ixor           
        //   621: istore          97
        //   623: aload           27
        //   625: astore          66
        //   627: aload           66
        //   629: astore          28
        //   631: ldc_w           587311523
        //   634: iload           97
        //   636: ixor           
        //   637: istore          97
        //   639: aload           14
        //   641: astore          67
        //   643: aload           67
        //   645: ifnull          682
        //   648: ldc_w           657941842
        //   651: iload           97
        //   653: ixor           
        //   654: istore          97
        //   656: aload           14
        //   658: astore          68
        //   660: aload           68
        //   662: invokeinterface java/sql/Connection.close:()V
        //   667: ldc_w           751090344
        //   670: iload           97
        //   672: ixor           
        //   673: istore          97
        //   675: aload           28
        //   677: astore          69
        //   679: aload           69
        //   681: areturn        
        //   682: iload           97
        //   684: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   687: lookupswitch {
        //          205774508: 2392
        //          232909151: 728
        //          907340275: 736
        //          1231990904: 682
        //          default: 2392
        //        }
        //   728: ldc_w           1455772923
        //   731: iload           97
        //   733: ixor           
        //   734: istore          97
        //   736: iload           97
        //   738: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   741: ldc_w           234845695
        //   744: if_icmpeq       750
        //   747: goto            1168
        //   750: iload           97
        //   752: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //   755: lookupswitch {
        //          234845695: 796
        //          504696387: 675
        //          1476621318: 2392
        //          1755871093: 750
        //          default: 2392
        //        }
        //   796: ldc_w           1563855617
        //   799: iload           97
        //   801: ixor           
        //   802: istore          97
        //   804: goto            675
        //   807: iload           97
        //   809: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //   812: lookupswitch {
        //          -1291734824: 1133
        //          -1140089566: 1076
        //          -839485630: 1111
        //          -733950968: 1065
        //          -704955813: 1155
        //          -417915904: 1017
        //          -407337696: 960
        //          -258158318: 973
        //          -196256301: 1054
        //          -41618813: 984
        //          46923411: 1087
        //          153045448: 1122
        //          156529793: 1043
        //          220630776: 1144
        //          1241744474: 1098
        //          1286120721: 1006
        //          2005843114: 1030
        //          default: 995
        //        }
        //   960: iload           97
        //   962: ldc_w           275011707
        //   965: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //   968: istore          97
        //   970: goto            2241
        //   973: ldc_w           1384174333
        //   976: iload           97
        //   978: ixor           
        //   979: istore          97
        //   981: goto            2241
        //   984: ldc_w           1931728527
        //   987: iload           97
        //   989: ixor           
        //   990: istore          97
        //   992: goto            2241
        //   995: new             Ljava/io/IOException;
        //   998: dup            
        //   999: ldc_w           "Error in hash"
        //  1002: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1005: athrow         
        //  1006: ldc_w           621173885
        //  1009: iload           97
        //  1011: ixor           
        //  1012: istore          97
        //  1014: goto            2241
        //  1017: iload           97
        //  1019: ldc_w           275884895
        //  1022: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1025: istore          97
        //  1027: goto            2241
        //  1030: iload           97
        //  1032: ldc_w           1113759562
        //  1035: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1038: istore          97
        //  1040: goto            2241
        //  1043: ldc_w           767149647
        //  1046: iload           97
        //  1048: ixor           
        //  1049: istore          97
        //  1051: goto            2241
        //  1054: ldc_w           1914364773
        //  1057: iload           97
        //  1059: ixor           
        //  1060: istore          97
        //  1062: goto            2241
        //  1065: ldc_w           370889054
        //  1068: iload           97
        //  1070: ixor           
        //  1071: istore          97
        //  1073: goto            2241
        //  1076: ldc_w           1527921531
        //  1079: iload           97
        //  1081: ixor           
        //  1082: istore          97
        //  1084: goto            2241
        //  1087: ldc_w           1825191693
        //  1090: iload           97
        //  1092: ixor           
        //  1093: istore          97
        //  1095: goto            2241
        //  1098: iload           97
        //  1100: ldc_w           1171470420
        //  1103: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1106: istore          97
        //  1108: goto            2241
        //  1111: ldc_w           1429046839
        //  1114: iload           97
        //  1116: ixor           
        //  1117: istore          97
        //  1119: goto            2241
        //  1122: ldc_w           229679590
        //  1125: iload           97
        //  1127: ixor           
        //  1128: istore          97
        //  1130: goto            2241
        //  1133: ldc_w           452165316
        //  1136: iload           97
        //  1138: ixor           
        //  1139: istore          97
        //  1141: goto            2241
        //  1144: ldc_w           221747456
        //  1147: iload           97
        //  1149: ixor           
        //  1150: istore          97
        //  1152: goto            2241
        //  1155: iload           97
        //  1157: ldc_w           1982607252
        //  1160: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1163: istore          97
        //  1165: goto            2241
        //  1168: ldc_w           42024363
        //  1171: iload           97
        //  1173: ixor           
        //  1174: istore          97
        //  1176: goto            2392
        //  1179: iload           97
        //  1181: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1184: lookupswitch {
        //          -1291734824: 1369
        //          -1140089566: 1391
        //          -733950968: 1345
        //          -704955813: 1358
        //          -417915904: 1459
        //          -407337696: 1413
        //          -258158318: 1402
        //          -41618813: 1470
        //          153045448: 1435
        //          156529793: 1446
        //          220630776: 1332
        //          1241744474: 1380
        //          1286120721: 1308
        //          2005843114: 1424
        //          default: 1321
        //        }
        //  1308: iload           97
        //  1310: ldc_w           254655839
        //  1313: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1316: istore          97
        //  1318: goto            1542
        //  1321: new             Ljava/lang/RuntimeException;
        //  1324: dup            
        //  1325: ldc_w           "Error in hash"
        //  1328: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  1331: athrow         
        //  1332: iload           97
        //  1334: ldc_w           656177186
        //  1337: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1340: istore          97
        //  1342: goto            1542
        //  1345: iload           97
        //  1347: ldc_w           1009823868
        //  1350: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1353: istore          97
        //  1355: goto            1542
        //  1358: ldc_w           1544015542
        //  1361: iload           97
        //  1363: ixor           
        //  1364: istore          97
        //  1366: goto            1542
        //  1369: ldc_w           819503078
        //  1372: iload           97
        //  1374: ixor           
        //  1375: istore          97
        //  1377: goto            1542
        //  1380: ldc_w           1878579574
        //  1383: iload           97
        //  1385: ixor           
        //  1386: istore          97
        //  1388: goto            1542
        //  1391: ldc_w           1899616857
        //  1394: iload           97
        //  1396: ixor           
        //  1397: istore          97
        //  1399: goto            1542
        //  1402: ldc_w           2024485855
        //  1405: iload           97
        //  1407: ixor           
        //  1408: istore          97
        //  1410: goto            1542
        //  1413: ldc_w           978303321
        //  1416: iload           97
        //  1418: ixor           
        //  1419: istore          97
        //  1421: goto            1542
        //  1424: ldc_w           1749646952
        //  1427: iload           97
        //  1429: ixor           
        //  1430: istore          97
        //  1432: goto            1542
        //  1435: ldc_w           664486084
        //  1438: iload           97
        //  1440: ixor           
        //  1441: istore          97
        //  1443: goto            1542
        //  1446: iload           97
        //  1448: ldc_w           127018861
        //  1451: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1454: istore          97
        //  1456: goto            1542
        //  1459: ldc_w           978995837
        //  1462: iload           97
        //  1464: ixor           
        //  1465: istore          97
        //  1467: goto            1542
        //  1470: ldc_w           1493710765
        //  1473: iload           97
        //  1475: ixor           
        //  1476: istore          97
        //  1478: goto            1542
        //  1481: ldc_w           1062503938
        //  1484: iload           97
        //  1486: ixor           
        //  1487: istore          97
        //  1489: iload           97
        //  1491: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1494: ldc_w           151476725
        //  1497: if_icmpeq       1503
        //  1500: goto            2324
        //  1503: ldc_w           1276979011
        //  1506: iload           97
        //  1508: ixor           
        //  1509: istore          97
        //  1511: aload           14
        //  1513: astore          40
        //  1515: aload           40
        //  1517: ifnull          2064
        //  1520: ldc_w           931093930
        //  1523: iload           97
        //  1525: ixor           
        //  1526: istore          97
        //  1528: aload           14
        //  1530: astore          41
        //  1532: aload           41
        //  1534: invokeinterface java/sql/Connection.close:()V
        //  1539: goto            1789
        //  1542: astore          70
        //  1544: aload           70
        //  1546: astore          94
        //  1548: aload           14
        //  1550: astore          71
        //  1552: aload           71
        //  1554: ifnull          1659
        //  1557: ldc_w           1274854003
        //  1560: iload           97
        //  1562: ixor           
        //  1563: istore          97
        //  1565: aload           14
        //  1567: astore          72
        //  1569: aload           72
        //  1571: invokeinterface java/sql/Connection.close:()V
        //  1576: ldc_w           2104634527
        //  1579: iload           97
        //  1581: ixor           
        //  1582: istore          97
        //  1584: goto            1694
        //  1587: astore          74
        //  1589: aload           74
        //  1591: astore          95
        //  1593: aload           94
        //  1595: astore          75
        //  1597: aload           95
        //  1599: astore          89
        //  1601: aload           75
        //  1603: aload           89
        //  1605: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1608: ldc_w           427899266
        //  1611: iload           97
        //  1613: ixor           
        //  1614: istore          97
        //  1616: aload           94
        //  1618: astore          73
        //  1620: aload           73
        //  1622: athrow         
        //  1623: iload           97
        //  1625: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1628: tableswitch {
        //          -733923098: 1648
        //          default: 1894
        //        }
        //  1648: ldc_w           85148599
        //  1651: iload           97
        //  1653: ixor           
        //  1654: istore          97
        //  1656: goto            1587
        //  1659: ldc_w           1570288541
        //  1662: iload           97
        //  1664: ixor           
        //  1665: istore          97
        //  1667: iload           97
        //  1669: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1672: ldc_w           244205626
        //  1675: if_icmpeq       1681
        //  1678: goto            2302
        //  1681: iload           97
        //  1683: ldc_w           183923675
        //  1686: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1689: istore          97
        //  1691: goto            1616
        //  1694: ldc_w           1826151509
        //  1697: iload           97
        //  1699: ixor           
        //  1700: istore          97
        //  1702: iload           97
        //  1704: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1707: ldc_w           34514109
        //  1710: if_icmpeq       1715
        //  1713: aconst_null    
        //  1714: athrow         
        //  1715: new             Ljava/lang/RuntimeException;
        //  1718: dup            
        //  1719: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1722: athrow         
        //  1723: iload           97
        //  1725: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1728: lookupswitch {
        //          -411624925: 1756
        //          892589371: 1767
        //          default: 2313
        //        }
        //  1756: ldc_w           101070488
        //  1759: iload           97
        //  1761: ixor           
        //  1762: istore          97
        //  1764: goto            1775
        //  1767: ldc_w           474918779
        //  1770: iload           97
        //  1772: ixor           
        //  1773: istore          97
        //  1775: pop            
        //  1776: iload           97
        //  1778: ldc_w           188660839
        //  1781: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1784: istore          97
        //  1786: goto            1616
        //  1789: ldc_w           1084015313
        //  1792: iload           97
        //  1794: ixor           
        //  1795: istore          97
        //  1797: iload           97
        //  1799: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  1802: ldc_w           87112731
        //  1805: if_icmpeq       1810
        //  1808: aconst_null    
        //  1809: athrow         
        //  1810: new             Ljava/lang/RuntimeException;
        //  1813: dup            
        //  1814: invokespecial   java/lang/RuntimeException.<init>:()V
        //  1817: athrow         
        //  1818: iload           97
        //  1820: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1823: lookupswitch {
        //          743356440: 1848
        //          839687946: 1870
        //          default: 1859
        //        }
        //  1848: ldc_w           2036971167
        //  1851: iload           97
        //  1853: ixor           
        //  1854: istore          97
        //  1856: goto            1880
        //  1859: new             Ljava/lang/IllegalAccessException;
        //  1862: dup            
        //  1863: ldc_w           "Error in hash"
        //  1866: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //  1869: athrow         
        //  1870: iload           97
        //  1872: ldc_w           983691901
        //  1875: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1878: istore          97
        //  1880: pop            
        //  1881: iload           97
        //  1883: ldc_w           1835994393
        //  1886: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  1889: istore          97
        //  1891: goto            2144
        //  1894: new             Ljava/io/IOException;
        //  1897: dup            
        //  1898: ldc_w           "Error in hash"
        //  1901: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1904: athrow         
        //  1905: iload           97
        //  1907: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  1910: lookupswitch {
        //          -2119042936: 2009
        //          -1900851749: 2020
        //          -1823325245: 2042
        //          682143378: 2031
        //          902123497: 1987
        //          1119519179: 1976
        //          1780522099: 2053
        //          default: 1998
        //        }
        //  1976: ldc_w           1690573030
        //  1979: iload           97
        //  1981: ixor           
        //  1982: istore          97
        //  1984: goto            2241
        //  1987: ldc_w           707518754
        //  1990: iload           97
        //  1992: ixor           
        //  1993: istore          97
        //  1995: goto            2241
        //  1998: new             Ljava/io/IOException;
        //  2001: dup            
        //  2002: ldc_w           "Error in hash"
        //  2005: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  2008: athrow         
        //  2009: ldc_w           480606158
        //  2012: iload           97
        //  2014: ixor           
        //  2015: istore          97
        //  2017: goto            2241
        //  2020: ldc_w           2101682532
        //  2023: iload           97
        //  2025: ixor           
        //  2026: istore          97
        //  2028: goto            2241
        //  2031: ldc_w           1233542413
        //  2034: iload           97
        //  2036: ixor           
        //  2037: istore          97
        //  2039: goto            2241
        //  2042: ldc_w           2130247847
        //  2045: iload           97
        //  2047: ixor           
        //  2048: istore          97
        //  2050: goto            2241
        //  2053: ldc_w           1641503569
        //  2056: iload           97
        //  2058: ixor           
        //  2059: istore          97
        //  2061: goto            2241
        //  2064: iload           97
        //  2066: ldc_w           1225722077
        //  2069: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2072: istore          97
        //  2074: iload           97
        //  2076: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2079: ldc_w           51648090
        //  2082: if_icmpeq       2088
        //  2085: goto            2289
        //  2088: iload           97
        //  2090: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2093: lookupswitch {
        //          51648090: 2136
        //          340207637: 2144
        //          872201627: 2392
        //          1950750888: 2088
        //          default: 2392
        //        }
        //  2136: ldc_w           719989792
        //  2139: iload           97
        //  2141: ixor           
        //  2142: istore          97
        //  2144: iload           97
        //  2146: ldc_w           1721280847
        //  2149: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2152: istore          97
        //  2154: iload           97
        //  2156: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2159: ldc_w           113145888
        //  2162: if_icmpeq       2167
        //  2165: aconst_null    
        //  2166: athrow         
        //  2167: new             Ljava/lang/RuntimeException;
        //  2170: dup            
        //  2171: invokespecial   java/lang/RuntimeException.<init>:()V
        //  2174: athrow         
        //  2175: iload           97
        //  2177: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.lyvmtarecrvhtwki:(I)I
        //  2180: lookupswitch {
        //          -1195495853: 2208
        //          1970484410: 2219
        //          default: 2278
        //        }
        //  2208: ldc_w           1524644062
        //  2211: iload           97
        //  2213: ixor           
        //  2214: istore          97
        //  2216: goto            2229
        //  2219: iload           97
        //  2221: ldc_w           1666816899
        //  2224: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2227: istore          97
        //  2229: pop            
        //  2230: ldc_w           623493956
        //  2233: iload           97
        //  2235: ixor           
        //  2236: istore          97
        //  2238: goto            2272
        //  2241: astore          43
        //  2243: aload           43
        //  2245: astore          93
        //  2247: ldc_w           1614181174
        //  2250: iload           97
        //  2252: ixor           
        //  2253: istore          97
        //  2255: aload           93
        //  2257: astore          44
        //  2259: aload           44
        //  2261: invokevirtual   java/sql/SQLException.printStackTrace:()V
        //  2264: ldc_w           1685783993
        //  2267: iload           97
        //  2269: ixor           
        //  2270: istore          97
        //  2272: aconst_null    
        //  2273: astore          42
        //  2275: aload           42
        //  2277: areturn        
        //  2278: new             Ljava/lang/RuntimeException;
        //  2281: dup            
        //  2282: ldc_w           "Error in hash"
        //  2285: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  2288: athrow         
        //  2289: iload           97
        //  2291: ldc_w           916449053
        //  2294: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2297: istore          97
        //  2299: goto            2392
        //  2302: ldc_w           1994046936
        //  2305: iload           97
        //  2307: ixor           
        //  2308: istore          97
        //  2310: goto            2392
        //  2313: new             Ljava/lang/RuntimeException;
        //  2316: dup            
        //  2317: ldc_w           "Error in hash"
        //  2320: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //  2323: athrow         
        //  2324: iload           97
        //  2326: ldc_w           864929923
        //  2329: invokestatic    dev/daniboy/donutcore/database/SQLiteManager.pnzgcbkxlxxlmsti:(II)I
        //  2332: istore          97
        //  2334: goto            2392
        //  2337: iload           97
        //  2339: invokestatic    fnhndduvxgwosuvi/nqlipuvkfzlomfdg.wxqhyeyxrkgiiuik:(I)I
        //  2342: lookupswitch {
        //          113508721: 2384
        //          276344473: 2337
        //          1642023292: 2392
        //          1978194936: 2392
        //          default: 2392
        //        }
        //  2384: ldc_w           955304467
        //  2387: iload           97
        //  2389: ixor           
        //  2390: istore          97
        //  2392: new             Ljava/io/IOException;
        //  2395: dup            
        //  2396: invokespecial   java/io/IOException.<init>:()V
        //  2399: athrow         
        //    StackMapTable: 00 5F FF 00 63 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 15 FF 02 29 00 59 07 00 02 07 01 4D 01 07 00 02 07 01 4D 07 01 4D 03 03 03 02 02 07 00 D5 07 00 DC 07 01 60 03 03 03 02 02 07 01 4D 07 01 F8 07 01 98 07 01 98 07 01 A2 01 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 07 01 60 03 07 01 60 03 07 01 60 03 07 01 60 02 07 01 60 02 07 01 60 07 01 4D 07 01 4D 07 01 F8 07 01 98 07 00 02 07 01 A2 07 00 04 07 01 98 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 00 00 07 01 F8 07 01 98 00 00 00 00 01 00 00 06 2D 07 0D 2D FF 00 0A 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 98 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4C 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 FF 00 0C 00 59 07 00 02 07 01 4D 01 07 00 02 07 01 4D 07 01 4D 03 03 03 02 02 07 00 D5 07 00 DC 07 01 60 03 03 03 02 02 07 01 4D 07 01 F8 07 01 98 07 01 98 07 01 A2 01 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 07 01 60 03 07 01 60 03 07 01 60 03 07 01 60 02 07 01 60 02 07 01 60 07 01 4D 07 01 4D 07 01 F8 07 01 98 07 00 02 07 01 A2 07 00 04 07 01 98 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 07 01 4D 00 00 07 01 F8 07 01 98 00 00 00 00 01 00 00 FF 00 0A 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 F7 00 80 07 00 C0 4C 07 00 C0 4A 07 00 C0 4C 07 00 C0 4C 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4A 07 00 C0 4C 07 00 C0 4A 07 00 C0 FF 00 0A 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 15 FF 00 26 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C0 FF 00 2C 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 1C 46 07 00 C0 58 07 00 C0 0A 15 FF 00 0C 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 14 47 07 00 C2 60 07 00 C2 4A 07 00 C2 47 07 00 C2 FF 00 0D 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 14 47 07 00 C2 5D 07 00 C2 4A 07 00 C2 4A 07 00 C2 49 07 00 C2 FF 00 0D 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C0 FF 00 0A 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 F7 00 46 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 4A 07 00 97 FF 00 0A 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 17 2F 07 16 47 07 00 C2 60 07 00 C2 4A 07 00 C2 49 07 00 C2 FF 00 0B 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 97 1E FF 00 05 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 C2 0A FF 00 0C 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 00 FF 00 0A 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 07 00 D5 07 00 D5 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 C0 00 00 01 00 01 07 00 C2 FF 00 0A 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 07 01 4D 00 00 00 00 00 00 00 00 07 00 D5 07 00 DC 07 01 60 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 07 00 02 07 00 D5 07 00 D5 07 00 DC 07 00 DC 07 00 DC 07 01 60 07 01 60 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 4D 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 0C 00 62 07 00 02 07 01 4D 01 07 00 02 07 01 4D 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 A2 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 2E 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  153    639    1179   2324   Ljava/lang/Throwable;
        //  1565   1584   1623   1659   Ljava/lang/Throwable;
        //  129    675    807    1168   Ljava/sql/SQLException;
        //  1511   1623   1905   2064   Ljava/sql/SQLException;
        //  1797   1818   1818   1894   Ljava/lang/RuntimeException;
        //  2154   2175   2175   2241   Ljava/lang/RuntimeException;
        //  1702   1723   1723   1789   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0675:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        (SQLiteManager.nothing_to_see_here = new String[19])[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28e4\u28e4\u28e4\u28e4\u28e4\u28f6\u28e6\u28e4\u28c4\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f4\u28ff\u287f\u281b\u2809\u2819\u281b\u281b\u281b\u281b\u283b\u28bf\u28ff\u28f7\u28e4\u2840\u2800\u2800\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28fc\u28ff\u280b\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28c0\u28c0\u2808\u28bb\u28ff\u28ff\u2844\u2800\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28f8\u28ff\u284f\u2800\u2800\u2800\u28e0\u28f6\u28fe\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28bf\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2801\u2800\u2800\u28b0\u28ff\u28ff\u28ef\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u2819\u28bf\u28f7\u2844\u2800";
        SQLiteManager.nothing_to_see_here[5] = "\u2800\u2800\u28c0\u28e4\u28f4\u28f6\u28f6\u28ff\u285f\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28f7\u2800";
        SQLiteManager.nothing_to_see_here[6] = "\u2800\u28b0\u28ff\u285f\u280b\u2809\u28f9\u28ff\u2847\u2800\u2800\u2800\u2818\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28e4\u28e4\u28e4\u28f6\u28f6\u28f6\u28f6\u28ff\u28ff\u28ff\u2800";
        SQLiteManager.nothing_to_see_here[7] = "\u2800\u28b8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2800";
        SQLiteManager.nothing_to_see_here[8] = "\u2800\u28f8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2809\u283b\u283f\u28ff\u28ff\u28ff\u28ff\u287f\u283f\u283f\u281b\u28bb\u28ff\u2847\u2800\u2800";
        SQLiteManager.nothing_to_see_here[9] = "\u2800\u28ff\u28ff\u2801\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28e7\u2800\u2800";
        SQLiteManager.nothing_to_see_here[10] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        SQLiteManager.nothing_to_see_here[11] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        SQLiteManager.nothing_to_see_here[12] = "\u2800\u28bf\u28ff\u2846\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800";
        SQLiteManager.nothing_to_see_here[13] = "\u2800\u2838\u28ff\u28e7\u2840\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2803\u2800\u2800";
        SQLiteManager.nothing_to_see_here[14] = "\u2800\u2800\u281b\u28bf\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u28f0\u28ff\u28ff\u28f7\u28f6\u28f6\u28f6\u28f6\u2836\u2800\u28a0\u28ff\u28ff\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28fd\u28ff\u284f\u2801\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28b9\u28ff\u2846\u2800\u2800\u2800\u28f8\u28ff\u2807\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28e6\u28c4\u28c0\u28e0\u28f4\u28ff\u28ff\u2801\u2800\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u287f\u280f\u2800\u2800\u2800\u2800";
        SQLiteManager.nothing_to_see_here[18] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u281b\u283b\u283f\u283f\u283f\u283f\u280b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        SQLiteManager.uthonptfwb = ByteBuffer.wrap(feykzjmmmwftlrs()).asCharBuffer().toString();
        SQLiteManager.90pcN6g6mx = (0x1B2BF401 ^ new Random(-5982595093518511147L).nextInt());
    }
    
    public static String rpkelfzxgl(final byte[] array, final int n) {
        final byte[] bytes = Integer.toString(n).getBytes();
        final int n2 = (array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        final int n3 = (array[4] & 0xFF) << 24 | (array[5] & 0xFF) << 16 | (array[6] & 0xFF) << 8 | (array[7] & 0xFF);
        final byte[] bytes2 = SQLiteManager.uthonptfwb.substring(n3, n3 + n2).getBytes(StandardCharsets.UTF_16BE);
        for (int i = 0; i < bytes2.length; ++i) {
            final byte[] array2 = bytes2;
            final int n4 = i;
            array2[n4] ^= bytes[i % bytes.length];
        }
        return new String(bytes2, StandardCharsets.UTF_16BE);
    }
    
    private static byte[] yzcdqtpysccnhuv() {
        return new byte[] { 0, 0, 0, 101, 0, 0, 0, 0 };
    }
    
    private static byte[] dlfxcujapgohzzo() {
        return new byte[] { 0, 0, 0, -64, 0, 0, 0, 101 };
    }
    
    private static byte[] grgnfohovamhwil() {
        return new byte[] { 0, 0, 0, 105, 0, 0, 1, 37 };
    }
    
    private static byte[] fireelfwoprurwj() {
        return new byte[] { 0, 0, 0, 101, 0, 0, 1, -114 };
    }
    
    private static byte[] hawoxobejkbkijx() {
        return new byte[] { 0, 0, 0, -74, 0, 0, 1, -13 };
    }
    
    private static byte[] dgcwjsdkwkroxfs() {
        return new byte[] { 0, 0, 0, -66, 0, 0, 2, -87 };
    }
    
    private static byte[] yzffoedywyfxuez() {
        return new byte[] { 0, 0, 0, 5, 0, 0, 3, 103 };
    }
    
    private static byte[] hxrgjjwksfaxvdp() {
        return new byte[] { 0, 0, 0, 5, 0, 0, 3, 108 };
    }
    
    private static byte[] rdcqhyqphuhluic() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 3, 113 };
    }
    
    private static byte[] vqayblrahumhtna() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 3, 114 };
    }
    
    private static byte[] unokojdhdnvsbvo() {
        return new byte[] { 0, 0, 0, 3, 0, 0, 3, 115 };
    }
    
    private static byte[] abjdntqwzkjeicz() {
        return new byte[] { 0, 0, 0, 6, 0, 0, 3, 118 };
    }
    
    private static byte[] qvpnuszdapdmrhv() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 3, 124 };
    }
    
    private static byte[] wvplbgwhloeltrw() {
        return new byte[] { 0, 0, 0, 26, 0, 0, 3, 125 };
    }
    
    private static byte[] jfsbjcxcmjzhzrl() {
        return new byte[] { 0, 0, 0, 99, 0, 0, 3, -105 };
    }
    
    private static byte[] mbwideocgsgrwxf() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 3, -6 };
    }
    
    private static byte[] rnepuybdeznkrig() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 3, -5 };
    }
    
    private static byte[] gccuvowazjycehv() {
        return new byte[] { 0, 0, 0, 6, 0, 0, 3, -4 };
    }
    
    private static byte[] fzfqpbryrbycmod() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 4, 2 };
    }
    
    private static byte[] jhtquzhkrevigrb() {
        return new byte[] { 0, 0, 0, 24, 0, 0, 4, 3 };
    }
    
    private static byte[] gmniqasvzhdhwar() {
        return new byte[] { 0, 0, 0, 3, 0, 0, 4, 27 };
    }
    
    private static byte[] kewbshjhwizuwsc() {
        return new byte[] { 0, 0, 0, 5, 0, 0, 4, 30 };
    }
    
    private static byte[] vbzdzhoafrmurcp() {
        return new byte[] { 0, 0, 0, 5, 0, 0, 4, 35 };
    }
    
    private static byte[] pwpitevqocgjpbt() {
        return new byte[] { 0, 0, 0, 97, 0, 0, 4, 40 };
    }
    
    private static byte[] emlejmcrisumplq() {
        return new byte[] { 0, 0, 0, 71, 0, 0, 4, -119 };
    }
    
    private static byte[] ptwztmaaeildhus() {
        return new byte[] { 0, 0, 0, 7, 0, 0, 4, -48 };
    }
    
    private static byte[] gmmjktywvlkbygr() {
        return new byte[] { 0, 0, 0, 55, 0, 0, 4, -41 };
    }
    
    private static byte[] wqtrfqlsioqptqi() {
        return new byte[] { 0, 0, 0, 40, 0, 0, 5, 14 };
    }
    
    private static byte[] nikurlmrihcstdx() {
        return new byte[] { 0, 0, 0, 67, 0, 0, 5, 54 };
    }
    
    private static byte[] cvrjissejomunnn() {
        return new byte[] { 0, 0, 0, 33, 0, 0, 5, 121 };
    }
    
    private static byte[] rhzqmqlgkitnsvm() {
        return new byte[] { 0, 0, 0, 33, 0, 0, 5, -102 };
    }
    
    private static byte[] euwbrxibyahhifc() {
        return new byte[] { 0, 0, 0, 44, 0, 0, 5, -69 };
    }
    
    private static byte[] ekmbuftfwjxsdoq() {
        return new byte[] { 0, 0, 0, 46, 0, 0, 5, -25 };
    }
    
    private static byte[] jnanbqrpcbrzood() {
        return new byte[] { 0, 0, 0, 42, 0, 0, 6, 21 };
    }
    
    private static byte[] wkqsjulbqcybbmx() {
        return new byte[] { 0, 0, 0, 9, 0, 0, 6, 63 };
    }
    
    private static byte[] phchfkbxmeuwztk() {
        return new byte[] { 0, 0, 0, 44, 0, 0, 6, 72 };
    }
    
    private static byte[] juvbzlmwvhagfdh() {
        return new byte[] { 0, 0, 0, 35, 0, 0, 6, 116 };
    }
    
    private static byte[] etlhmjmznqukgcn() {
        return new byte[] { 0, 0, 0, 4, 0, 0, 6, -105 };
    }
    
    private static byte[] xpiwmsijqfuxfca() {
        return new byte[] { 0, 0, 0, 67, 0, 0, 6, -101 };
    }
    
    private static byte[] udedfrjaqufqxed() {
        return new byte[] { 0, 0, 0, 51, 0, 0, 6, -34 };
    }
    
    private static byte[] clqlljxpititqcp() {
        return new byte[] { 0, 0, 0, 7, 0, 0, 7, 17 };
    }
    
    private static byte[] iqubswrsirpbadz() {
        return new byte[] { 0, 0, 0, 94, 0, 0, 7, 24 };
    }
    
    private static byte[] vqxgebsrcumeqox() {
        return new byte[] { 0, 0, 0, 36, 0, 0, 7, 118 };
    }
    
    private static byte[] fqmtogcwfrusfjt() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 7, -102 };
    }
    
    private static byte[] nxftorlwypatxgy() {
        return new byte[] { 0, 0, 0, 3, 0, 0, 7, -101 };
    }
    
    private static byte[] dlhssbwsjfveluu() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 7, -98 };
    }
    
    private static byte[] xhcvmkzudhrmxtl() {
        return new byte[] { 0, 0, 0, 5, 0, 0, 7, -97 };
    }
    
    private static byte[] omuwryfcqllchxc() {
        return new byte[] { 0, 0, 0, 1, 0, 0, 7, -92 };
    }
    
    private static byte[] lzxpnvtkcgmjcdb() {
        return new byte[] { 0, 0, 0, 5, 0, 0, 7, -91 };
    }
    
    private static byte[] wvqyzjsincsxist() {
        return new byte[] { 0, 0, 0, 63, 0, 0, 7, -86 };
    }
    
    private static byte[] feykzjmmmwftlrs() {
        return new byte[] { 51, 119, 49, 103, 53, 125, 57, 121, 51, 96, 49, 112, 53, 24, 57, 108, 51, 117, 49, 119, 53, 116, 57, 125, 51, 20, 49, 124, 53, 126, 57, 24, 51, 122, 49, 122, 53, 108, 57, 24, 51, 113, 49, 109, 53, 113, 57, 107, 51, 96, 49, 102, 53, 24, 57, 90, 51, 93, 49, 89, 53, 84, 57, 94, 51, 91, 49, 71, 53, 92, 57, 103, 51, 93, 49, 65, 53, 93, 57, 85, 51, 71, 49, 21, 53, 16, 57, 75, 51, 88, 49, 90, 53, 76, 57, 24, 51, 125, 49, 123, 53, 108, 57, 125, 51, 115, 49, 112, 53, 106, 57, 24, 51, 100, 49, 103, 53, 113, 57, 117, 51, 117, 49, 103, 53, 97, 57, 24, 51, 127, 49, 112, 53, 97, 57, 24, 51, 122, 49, 122, 53, 108, 57, 24, 51, 122, 49, 96, 53, 116, 57, 116, 51, 24, 49, 92, 53, 76, 57, 93, 51, 89, 49, 106, 53, 92, 57, 89, 51, 64, 49, 84, 53, 24, 57, 108, 51, 113, 49, 109, 53, 108, 57, 24, 51, 122, 49, 122, 53, 108, 57, 24, 51, 122, 49, 96, 53, 116, 57, 116, 51, 29, 49, 116, 50, 107, 48, 113, 48, 119, 48, 101, 55, 119, 57, 16, 52, 100, 54, 113, 49, 117, 50, 117, 48, 113, 48, 22, 48, 120, 55, 116, 57, 16, 52, 126, 54, 127, 49, 99, 50, 25, 48, 113, 48, 110, 48, 120, 55, 97, 57, 100, 52, 99, 54, 16, 49, 68, 50, 73, 48, 85, 48, 65, 48, 95, 55, 109, 57, 64, 52, 95, 54, 89, 49, 89, 50, 77, 48, 71, 48, 22, 48, 25, 55, 92, 57, 69, 52, 93, 54, 82, 49, 82, 50, 75, 48, 20, 48, 127, 48, 127, 55, 102, 57, 117, 52, 119, 54, 117, 49, 101, 50, 25, 48, 122, 48, 121, 48, 101, 55, 18, 57, 126, 52, 101, 54, 124, 49, 123, 50, 21, 48, 76, 48, 22, 48, 99, 55, 119, 57, 113, 52, 124, 54, 16, 49, 121, 50, 118, 48, 96, 48, 22, 48, 127, 55, 103, 57, 124, 52, 124, 54, 28, 49, 78, 50, 25, 48, 102, 48, 115, 48, 112, 55, 126, 57, 16, 52, 126, 54, 127, 49, 99, 50, 25, 48, 122, 48, 99, 48, 125, 55, 126, 57, 28, 52, 74, 54, 16, 49, 101, 50, 124, 48, 117, 48, 122, 48, 17, 55, 124, 57, 127, 52, 100, 54, 16, 49, 121, 50, 108, 48, 120, 48, 122, 48, 29, 55, 75, 57, 81, 52, 71, 54, 16, 49, 101, 50, 124, 48, 117, 48, 122, 48, 17, 55, 124, 57, 127, 52, 100, 54, 16, 49, 121, 50, 108, 48, 120, 48, 122, 48, 29, 55, 66, 57, 89, 52, 68, 54, 83, 49, 95, 50, 25, 48, 102, 48, 115, 48, 112, 55, 126, 57, 16, 52, 126, 54, 127, 49, 99, 50, 25, 48, 122, 48, 99, 48, 125, 55, 126, 57, 28, 52, 71, 54, 95, 49, 69, 50, 85, 48, 80, 48, 22, 48, 101, 55, 119, 57, 104, 52, 100, 54, 16, 49, 121, 50, 118, 48, 96, 48, 22, 48, 127, 55, 103, 57, 124, 52, 124, 54, 28, 49, 103, 50, 107, 48, 125, 48, 123, 48, 112, 55, 96, 57, 105, 52, 16, 54, 123, 49, 114, 50, 96, 48, 20, 48, 30, 48, 95, 55, 71, 57, 93, 52, 82, 54, 85, 49, 69, 50, 16, 48, 29, 57, 119, 49, 100, 50, 116, 50, 118, 57, 96, 49, 115, 50, 17, 50, 99, 57, 117, 49, 116, 50, 125, 50, 114, 57, 20, 49, 127, 50, 119, 50, 23, 57, 122, 49, 121, 50, 101, 50, 23, 57, 113, 49, 110, 50, 120, 50, 100, 57, 96, 49, 101, 50, 17, 50, 90, 57, 81, 49, 69, 50, 66, 50, 86, 57, 83, 49, 83, 50, 110, 50, 67, 57, 91, 49, 81, 50, 86, 50, 91, 57, 81, 49, 22, 50, 25, 50, 71, 57, 88, 49, 87, 50, 72, 50, 82, 57, 70, 49, 99, 50, 100, 50, 126, 57, 112, 49, 22, 50, 101, 50, 114, 57, 108, 49, 98, 50, 17, 50, 103, 57, 102, 49, 127, 50, 124, 50, 118, 57, 102, 49, 111, 50, 17, 50, 124, 57, 113, 49, 111, 50, 17, 50, 121, 57, 123, 49, 98, 50, 17, 50, 121, 57, 97, 49, 122, 50, 125, 50, 27, 57, 81, 49, 88, 50, 80, 50, 85, 57, 88, 49, 83, 50, 85, 50, 23, 57, 118, 49, 121, 50, 126, 50, 123, 57, 113, 49, 119, 50, 127, 50, 23, 57, 122, 49, 121, 50, 101, 50, 23, 57, 122, 49, 99, 50, 125, 50, 123, 57, 29, 49, 118, 57, 97, 50, 114, 57, 117, 53, 101, 53, 124, 51, 18, 55, 109, 52, 116, 49, 119, 57, 127, 50, 114, 57, 20, 53, 120, 53, 127, 51, 18, 55, 119, 52, 122, 49, 97, 57, 19, 50, 114, 57, 108, 53, 120, 53, 106, 51, 102, 55, 106, 52, 21, 49, 69, 57, 82, 50, 78, 57, 107, 53, 69, 53, 86, 51, 85, 55, 94, 52, 89, 49, 80, 57, 19, 50, 31, 57, 68, 53, 93, 53, 88, 51, 75, 55, 92, 52, 71, 49, 96, 57, 102, 50, 126, 57, 112, 53, 17, 53, 109, 51, 119, 55, 97, 52, 97, 49, 21, 57, 99, 50, 101, 57, 125, 53, 124, 53, 120, 51, 96, 55, 96, 52, 21, 49, 126, 57, 118, 50, 110, 57, 20, 53, 127, 53, 118, 51, 102, 55, 25, 52, 123, 49, 96, 57, 127, 50, 123, 57, 24, 53, 84, 53, 87, 51, 83, 55, 91, 52, 89, 49, 80, 57, 87, 50, 23, 57, 118, 53, 126, 53, 118, 51, 126, 55, 124, 52, 116, 49, 123, 57, 19, 50, 121, 57, 123, 53, 101, 53, 25, 51, 124, 55, 108, 52, 121, 49, 121, 57, 26, 49, 112, 56, 98, 56, 112, 49, 113, 52, 102, 49, 118, 56, 16, 56, 97, 49, 113, 52, 112, 49, 127, 56, 117, 56, 21, 49, 121, 52, 116, 49, 19, 56, 126, 56, 122, 49, 100, 52, 18, 49, 118, 56, 104, 56, 124, 49, 99, 52, 102, 49, 96, 56, 16, 56, 89, 49, 95, 52, 81, 49, 82, 56, 68, 56, 92, 49, 95, 52, 92, 49, 64, 56, 16, 56, 29, 49, 94, 52, 83, 49, 94, 56, 85, 56, 21, 49, 100, 52, 119, 49, 107, 56, 100, 56, 21, 49, 126, 52, 125, 49, 103, 56, 16, 56, 123, 49, 101, 52, 126, 49, 127, 56, 28, 56, 77, 49, 16, 52, 96, 49, 118, 56, 113, 56, 121, 49, 16, 52, 124, 49, 124, 56, 100, 56, 21, 49, 126, 52, 103, 49, 127, 56, 124, 56, 25, 49, 73, 52, 18, 49, 97, 56, 117, 56, 116, 49, 124, 52, 18, 49, 125, 56, 127, 56, 97, 49, 16, 52, 124, 49, 102, 56, 124, 56, 121, 49, 28, 52, 72, 49, 19, 56, 98, 56, 112, 49, 113, 52, 126, 49, 19, 56, 126, 56, 122, 49, 100, 52, 18, 49, 125, 56, 101, 56, 121, 49, 124, 52, 30, 49, 74, 56, 81, 56, 66, 49, 16, 52, 96, 49, 118, 56, 113, 56, 121, 49, 16, 52, 124, 49, 124, 56, 100, 56, 21, 49, 126, 52, 103, 49, 127, 56, 124, 56, 25, 49, 64, 52, 91, 49, 71, 56, 83, 56, 93, 49, 16, 52, 96, 49, 118, 56, 113, 56, 121, 49, 16, 52, 124, 49, 124, 56, 100, 56, 21, 49, 126, 52, 103, 49, 127, 56, 124, 56, 25, 49, 71, 52, 93, 49, 65, 56, 92, 56, 81, 49, 16, 52, 102, 49, 118, 56, 104, 56, 97, 49, 16, 52, 124, 49, 124, 56, 100, 56, 21, 49, 126, 52, 103, 49, 127, 56, 124, 56, 25, 49, 96, 52, 96, 49, 122, 56, 125, 56, 116, 49, 98, 52, 107, 49, 19, 56, 123, 56, 112, 49, 105, 52, 18, 49, 27, 56, 94, 56, 84, 49, 93, 52, 87, 49, 26, 56, 25, 49, 114, 51, 101, 48, 125, 57, 116, 56, 103, 49, 116, 51, 23, 48, 108, 57, 116, 56, 113, 49, 125, 51, 114, 48, 24, 57, 124, 56, 117, 49, 17, 51, 121, 48, 119, 57, 97, 56, 19, 49, 116, 51, 111, 48, 113, 57, 102, 56, 103, 49, 98, 51, 23, 48, 89, 57, 83, 56, 88, 49, 110, 51, 71, 48, 87, 57, 92, 56, 93, 49, 69, 51, 68, 48, 24, 57, 29, 56, 93, 49, 68, 51, 90, 48, 90, 57, 80, 56, 65, 49, 17, 51, 126, 48, 118, 57, 97, 56, 118, 49, 118, 51, 114, 48, 106, 57, 21, 56, 125, 49, 126, 51, 99, 48, 24, 57, 123, 56, 102, 49, 125, 51, 123, 48, 20, 57, 77, 56, 19, 49, 99, 51, 114, 48, 121, 57, 121, 56, 19, 49, 127, 51, 120, 48, 108, 57, 21, 56, 125, 49, 100, 51, 123, 48, 116, 57, 25, 56, 74, 49, 17, 51, 101, 48, 125, 57, 116, 56, 127, 49, 17, 51, 121, 48, 119, 57, 97, 56, 19, 49, 127, 51, 98, 48, 116, 57, 121, 56, 31, 49, 75, 51, 23, 48, 106, 57, 112, 56, 114, 49, 125, 51, 23, 48, 118, 57, 122, 56, 103, 49, 17, 51, 121, 48, 109, 57, 121, 56, 127, 49, 29, 51, 78, 48, 89, 57, 66, 56, 19, 49, 99, 51, 114, 48, 121, 57, 121, 56, 19, 49, 127, 51, 120, 48, 108, 57, 21, 56, 125, 49, 100, 51, 123, 48, 116, 57, 25, 56, 67, 49, 88, 51, 67, 48, 91, 57, 93, 56, 19, 49, 99, 51, 114, 48, 121, 57, 121, 56, 19, 49, 127, 51, 120, 48, 108, 57, 21, 56, 125, 49, 100, 51, 123, 48, 116, 57, 25, 56, 68, 49, 94, 51, 69, 48, 84, 57, 81, 56, 19, 49, 101, 51, 114, 48, 96, 57, 97, 56, 19, 49, 127, 51, 120, 48, 108, 57, 21, 56, 125, 49, 100, 51, 123, 48, 116, 57, 25, 56, 99, 49, 99, 51, 126, 48, 117, 57, 116, 56, 97, 49, 104, 51, 23, 48, 115, 57, 112, 56, 106, 49, 17, 51, 31, 48, 86, 57, 64, 56, 94, 49, 83, 51, 82, 48, 74, 57, 28, 56, 26, 56, 78, 48, 86, 55, 68, 48, 95, 53, 92, 49, 66, 52, 92, 54, 67, 57, 90, 55, 92, 50, 75, 56, 64, 49, 73, 51, 84, 49, 70, 55, 93, 57, 70, 54, 84, 53, 82, 57, 82, 51, 75, 49, 76, 49, 97, 51, 124, 50, 117, 51, 113, 50, 117, 49, 102, 51, 25, 50, 19, 51, 20, 50, 112, 49, 96, 51, 118, 50, 116, 51, 20, 50, 69, 49, 66, 51, 88, 50, 78, 51, 90, 50, 105, 49, 66, 51, 86, 50, 80, 51, 90, 50, 66, 49, 65, 49, 122, 55, 121, 52, 98, 53, 125, 51, 96, 49, 103, 55, 23, 52, 126, 53, 106, 51, 18, 49, 97, 55, 114, 52, 97, 53, 116, 51, 115, 49, 112, 55, 114, 52, 17, 53, 113, 51, 124, 49, 103, 55, 120, 52, 17, 53, 75, 51, 66, 49, 82, 55, 64, 52, 95, 53, 103, 51, 66, 49, 92, 55, 94, 52, 95, 53, 76, 51, 65, 49, 27, 55, 89, 52, 68, 53, 85, 51, 80, 49, 86, 55, 69, 52, 29, 53, 24, 51, 74, 49, 31, 55, 23, 52, 72, 53, 20, 51, 18, 49, 73, 55, 27, 52, 17, 53, 65, 51, 83, 49, 68, 55, 27, 52, 17, 53, 72, 51, 91, 49, 71, 55, 84, 52, 89, 53, 20, 51, 18, 49, 68, 55, 88, 52, 67, 53, 84, 51, 86, 49, 26, 55, 23, 52, 103, 53, 121, 51, 126, 49, 102, 55, 114, 52, 98, 53, 16, 51, 13, 49, 31, 55, 23, 52, 14, 53, 20, 51, 18, 49, 12, 55, 27, 52, 17, 53, 7, 51, 30, 49, 19, 55, 8, 52, 29, 53, 24, 51, 13, 49, 31, 55, 23, 52, 14, 53, 17, 57, 78, 49, 73, 49, 95, 49, 76, 56, 95, 52, 86, 51, 81, 49, 67, 49, 72, 53, 107, 52, 118, 52, 117, 49, 113, 50, 118, 56, 96, 51, 20, 57, 27, 52, 18, 53, 126, 52, 97, 52, 118, 49, 121, 50, 21, 56, 85, 51, 82, 57, 90, 52, 109, 53, 72, 52, 92, 52, 80, 49, 90, 50, 65, 56, 71, 49, 76, 57, 88, 49, 78, 54, 67, 50, 90, 57, 69, 54, 94, 52, 82, 49, 70, 49, 92, 49, 71, 51, 80, 55, 93, 54, 124, 54, 121, 57, 102, 52, 119, 51, 100, 53, 98, 55, 25, 53, 123, 50, 97, 54, 21, 54, 101, 57, 112, 52, 98, 51, 122, 53, 119, 55, 122, 53, 113, 50, 19, 54, 124, 54, 121, 57, 97, 52, 125, 51, 22, 53, 87, 55, 95, 53, 95, 50, 108, 54, 69, 54, 88, 57, 92, 52, 92, 51, 66, 53, 69, 55, 17, 53, 90, 50, 70, 54, 88, 54, 85, 57, 80, 52, 64, 51, 26, 53, 22, 55, 65, 53, 24, 50, 19, 54, 76, 54, 27, 57, 21, 52, 72, 51, 26, 53, 22, 55, 64, 53, 85, 50, 68, 54, 25, 54, 23, 57, 69, 52, 91, 51, 66, 53, 85, 55, 81, 53, 24, 50, 19, 54, 66, 54, 88, 57, 71, 52, 94, 51, 82, 53, 31, 55, 25, 53, 98, 50, 114, 54, 121, 54, 98, 57, 112, 52, 97, 51, 30, 53, 9, 55, 21, 53, 20, 50, 12, 54, 25, 54, 23, 57, 10, 52, 30, 51, 22, 53, 9, 55, 21, 53, 20, 50, 12, 54, 25, 54, 23, 57, 10, 52, 30, 51, 22, 53, 9, 55, 16, 50, 127, 49, 119, 48, 102, 54, 118, 53, 96, 54, 101, 57, 16, 53, 121, 51, 103, 50, 22, 49, 107, 48, 112, 54, 99, 53, 126, 54, 112, 57, 115, 53, 115, 51, 21, 50, 127, 49, 119, 48, 97, 54, 124, 53, 18, 54, 92, 57, 85, 53, 69, 51, 70, 50, 87, 49, 94, 48, 80, 54, 108, 53, 70, 54, 94, 57, 87, 53, 81, 51, 89, 50, 83, 49, 17, 48, 69, 54, 95, 53, 83, 54, 72, 57, 85, 53, 68, 51, 96, 50, 99, 49, 112, 48, 113, 54, 31, 53, 18, 54, 84, 57, 94, 53, 87, 51, 87, 50, 90, 49, 92, 48, 81, 54, 26, 53, 18, 54, 103, 57, 113, 53, 122, 51, 96, 50, 115, 49, 106, 48, 29, 54, 12, 53, 30, 54, 17, 57, 15, 53, 31, 49, 81, 53, 92, 51, 82, 55, 83, 52, 95, 49, 81, 53, 86, 49, 96, 54, 117, 52, 120, 52, 116, 56, 115, 49, 103, 54, 16, 52, 81, 52, 95, 56, 81, 49, 81, 54, 92, 52, 81, 52, 85, 56, 16, 49, 117, 54, 98, 52, 123, 52, 124, 56, 16, 49, 94, 54, 85, 52, 71, 52, 66, 56, 81, 49, 84, 54, 85, 52, 107, 52, 69, 56, 95, 49, 84, 54, 87, 52, 88, 52, 84, 56, 16, 49, 100, 54, 120, 52, 113, 52, 99, 56, 117, 49, 19, 54, 64, 52, 88, 52, 80, 56, 73, 49, 86, 54, 66, 52, 97, 52, 100, 56, 121, 49, 119, 54, 16, 52, 9, 52, 17, 56, 15, 53, 116, 54, 85, 57, 91, 48, 91, 51, 80, 50, 82, 52, 25, 50, 68, 55, 92, 53, 18, 54, 71, 57, 83, 48, 65, 51, 80, 50, 22, 52, 123, 50, 89, 55, 95, 53, 94, 54, 82, 57, 93, 48, 69, 51, 81, 50, 22, 52, 80, 50, 68, 55, 86, 53, 95, 54, 20, 57, 70, 48, 88, 51, 21, 50, 82, 52, 88, 50, 68, 55, 82, 53, 80, 54, 85, 57, 65, 48, 82, 55, 124, 50, 124, 55, 102, 53, 112, 54, 101, 53, 102, 50, 23, 53, 122, 53, 100, 55, 21, 50, 96, 55, 112, 53, 101, 54, 123, 53, 115, 50, 116, 53, 112, 53, 22, 55, 124, 50, 124, 55, 97, 53, 122, 54, 23, 53, 80, 50, 94, 53, 89, 53, 90, 55, 83, 50, 93, 55, 71, 53, 81, 54, 104, 53, 91, 50, 67, 53, 80, 53, 91, 55, 70, 50, 26, 55, 70, 53, 89, 54, 88, 53, 70, 50, 27, 53, 21, 53, 95, 55, 65, 50, 87, 55, 88, 53, 106, 54, 83, 53, 83, 50, 67, 53, 84, 53, 31, 55, 21, 50, 100, 55, 116, 53, 121, 54, 98, 53, 119, 50, 100, 53, 29, 53, 9, 55, 25, 50, 18, 55, 10, 53, 28, 49, 115, 55, 87, 50, 80, 55, 90, 49, 84, 53, 83, 54, 18, 57, 67, 54, 94, 49, 21, 55, 69, 50, 92, 55, 68, 49, 88, 53, 86, 54, 94, 57, 94, 54, 75, 49, 80, 55, 22, 50, 123, 55, 95, 49, 93, 53, 91, 54, 84, 57, 88, 54, 67, 49, 81, 55, 22, 50, 80, 55, 66, 49, 84, 53, 90, 49, 114, 48, 87, 52, 81, 53, 84, 48, 81, 49, 80, 48, 22, 52, 76, 53, 87, 48, 20, 49, 71, 48, 83, 52, 74, 53, 81, 48, 85, 49, 88, 48, 95, 52, 66, 53, 93, 48, 20, 49, 118, 48, 95, 52, 84, 53, 84, 48, 82, 49, 91, 48, 68, 52, 92, 53, 24, 48, 93, 49, 64, 48, 83, 52, 85, 49, 127, 56, 88, 49, 94, 54, 88, 49, 83, 49, 93, 56, 25, 49, 67, 54, 91, 49, 22, 49, 75, 56, 92, 49, 90, 54, 91, 49, 64, 49, 92, 56, 25, 49, 117, 54, 93, 49, 90, 49, 85, 56, 95, 49, 88, 54, 70, 49, 82, 49, 25, 56, 80, 49, 67, 54, 81, 49, 91, 49, 25, 56, 95, 49, 69, 54, 91, 49, 91, 49, 25, 56, 93, 49, 86, 54, 64, 49, 87, 49, 91, 56, 88, 49, 68, 54, 81, 57, 119, 56, 114, 57, 127, 54, 112, 49, 109, 51, 125, 55, 25, 51, 112, 53, 99, 57, 124, 56, 122, 57, 19, 54, 87, 49, 80, 51, 84, 55, 85, 51, 80, 53, 94, 57, 65, 56, 83, 57, 108, 54, 92, 49, 77, 51, 93, 55, 84, 51, 69, 53, 17, 57, 100, 56, 127, 57, 118, 54, 103, 49, 124, 51, 24, 55, 80, 51, 66, 53, 84, 57, 94, 56, 104, 57, 87, 54, 84, 49, 77, 51, 89, 55, 25, 51, 11, 53, 17, 57, 12, 49, 106, 52, 125, 56, 123, 55, 124, 49, 114, 57, 96, 56, 24, 55, 68, 57, 93, 49, 86, 52, 76, 56, 27, 55, 25, 49, 88, 57, 64, 56, 93, 55, 90, 57, 110, 49, 93, 52, 89, 56, 67, 55, 88, 49, 17, 57, 114, 56, 106, 55, 120, 57, 124, 49, 25, 52, 90, 56, 94, 55, 85, 49, 93, 57, 82, 56, 87, 55, 69, 57, 85, 49, 102, 52, 81, 56, 67, 55, 92, 49, 92, 57, 71, 50, 89, 48, 67, 51, 80, 53, 88, 49, 105, 50, 84, 48, 86, 51, 65, 53, 84, 49, 114, 50, 84, 54, 80, 49, 91, 55, 82, 49, 80, 50, 21, 54, 77, 49, 88, 55, 23, 49, 82, 50, 80, 54, 77, 49, 84, 55, 95, 49, 20, 50, 119, 54, 80, 49, 91, 55, 91, 49, 82, 50, 90, 54, 75, 49, 83, 55, 23, 49, 93, 50, 65, 54, 92, 49, 90, 55, 68, 49, 20, 50, 83, 54, 75, 49, 88, 55, 90, 49, 20, 50, 81, 54, 88, 49, 67, 55, 86, 49, 86, 50, 84, 54, 74, 49, 82, 49, 115, 57, 83, 48, 80, 49, 88, 52, 82, 49, 81, 57, 18, 48, 77, 49, 91, 52, 23, 49, 81, 57, 87, 48, 74, 49, 81, 52, 69, 49, 92, 57, 83, 48, 85, 49, 93, 52, 77, 49, 80, 57, 18, 48, 123, 49, 93, 52, 91, 49, 89, 57, 84, 48, 86, 49, 70, 52, 83, 49, 21, 57, 91, 48, 77, 49, 81, 52, 90, 56, 70, 53, 89, 49, 86, 56, 66, 50, 124, 49, 127, 57, 96, 49, 119, 53, 99, 49, 109, 51, 17, 50, 122, 49, 99, 57, 19, 49, 96, 53, 116, 49, 105, 51, 125, 50, 116, 49, 114, 57, 118, 49, 18, 53, 120, 49, 119, 51, 101, 50, 122, 49, 17, 57, 67, 49, 83, 53, 72, 49, 102, 51, 69, 50, 90, 49, 86, 57, 84, 49, 94, 53, 84, 49, 17, 51, 65, 50, 89, 49, 80, 57, 74, 49, 87, 53, 67, 49, 108, 51, 100, 50, 124, 49, 117, 57, 31, 49, 18, 53, 84, 49, 87, 51, 80, 50, 87, 49, 93, 57, 86, 49, 86, 53, 24, 49, 25, 51, 103, 50, 116, 49, 125, 57, 102, 49, 119, 53, 98, 49, 17, 51, 14, 50, 25, 49, 17, 57, 12, 49, 27, 49, 99, 57, 119, 55, 120, 52, 117, 56, 115, 49, 100, 57, 18, 55, 81, 52, 94, 56, 81, 49, 82, 57, 94, 55, 81, 52, 84, 56, 16, 49, 118, 57, 96, 55, 123, 52, 125, 56, 16, 49, 64, 57, 83, 55, 77, 52, 111, 56, 68, 49, 95, 57, 85, 55, 83, 52, 92, 56, 85, 49, 16, 57, 101, 55, 124, 52, 117, 56, 98, 49, 117, 57, 18, 55, 68, 52, 92, 56, 81, 49, 73, 57, 87, 55, 70, 52, 101, 56, 101, 49, 121, 57, 118, 55, 20, 52, 13, 56, 16, 49, 15, 54, 82, 52, 92, 56, 83, 50, 83, 53, 90, 55, 81, 50, 92, 49, 124, 48, 122, 55, 101, 56, 124, 57, 101, 49, 97, 48, 20, 55, 121, 56, 107, 57, 23, 49, 103, 48, 113, 55, 102, 56, 117, 57, 118, 49, 118, 48, 113, 55, 22, 56, 112, 57, 121, 49, 97, 48, 123, 55, 22, 56, 85, 57, 88, 49, 86, 48, 85, 55, 66, 56, 80, 57, 88, 49, 91, 48, 71, 55, 30, 56, 87, 57, 86, 49, 88, 48, 81, 55, 26, 56, 25, 57, 79, 49, 25, 48, 20, 55, 79, 56, 21, 57, 23, 49, 79, 48, 24, 55, 22, 56, 64, 57, 86, 49, 66, 48, 24, 55, 22, 56, 73, 57, 94, 49, 65, 48, 87, 55, 94, 56, 21, 57, 23, 49, 66, 48, 91, 55, 68, 56, 85, 57, 83, 49, 28, 48, 20, 55, 96, 56, 120, 57, 123, 49, 96, 48, 113, 55, 101, 56, 17, 57, 8, 49, 25, 48, 20, 55, 9, 56, 21, 57, 23, 49, 10, 48, 24, 55, 22, 56, 6, 57, 27, 49, 21, 48, 11, 55, 26, 56, 25, 57, 8, 49, 25, 48, 20, 55, 9, 56, 16, 50, 117, 51, 118, 53, 127, 56, 112, 53, 96, 50, 116, 51, 19, 53, 117, 56, 103, 53, 123, 50, 124, 51, 19, 53, 95, 56, 90, 53, 87, 50, 80, 51, 71, 53, 90, 56, 90, 53, 90, 50, 66, 51, 19, 53, 100, 56, 125, 53, 113, 50, 99, 51, 118, 53, 19, 56, 91, 53, 85, 50, 92, 51, 86, 53, 19, 56, 8, 53, 20, 50, 14, 49, 72, 49, 76, 55, 89, 51, 67, 49, 76, 54, 73, 55, 95, 51, 66, 48, 83, 50, 94, 50, 72, 52, 79, 52, 89, 51, 67, 52, 94, 52, 80, 52, 107, 53, 124, 53, 127, 55, 117, 48, 119, 56, 97, 57, 21, 51, 79, 48, 28, 52, 24, 53, 64, 53, 31, 55, 16, 48, 78, 56, 25, 57, 21, 51, 78, 48, 81, 52, 79, 53, 21, 53, 19, 55, 64, 48, 93, 56, 65, 57, 86, 51, 95, 48, 28, 52, 24, 53, 78, 53, 92, 55, 66, 48, 88, 56, 81, 57, 21, 51, 113, 48, 98, 52, 119, 53, 116, 53, 19, 55, 92, 48, 91, 56, 86, 57, 84, 51, 67, 48, 89, 52, 87, 53, 87, 53, 64, 55, 16, 48, 99, 56, 125, 57, 112, 51, 101, 48, 117, 52, 24, 53, 87, 53, 82, 55, 93, 48, 81, 56, 21, 57, 8, 51, 23, 48, 15 };
    }
    
    private static int pnzgcbkxlxxlmsti(final int n, final int n2) {
        return n2 ^ n;
    }
}
