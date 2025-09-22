package dev.daniboy.donutcore.utils;

import java.util.List;
import java.util.regex.Matcher;
import org.bukkit.ChatColor;
import java.util.regex.Pattern;

public class Hex
{
    private static final String Builtbybit = "true";
    private static final String YourUserID = "435385";
    private static final String YourUsername = "FELEBOY";
    private static final String ResourceID = "45325";
    private static final String Version = "180909";
    private static final String TimeWhenDownloaded = "1742734770";
    private static final String idkwhattocallthis = "1a7a0449b3a5efe1fab86880a27c5029";
    
    public static String hex(String replace) {
        if (replace == null) {
            return null;
        }
        final Pattern compile = Pattern.compile("(#[a-fA-F0-9]{6})");
        for (Matcher matcher = compile.matcher((CharSequence)replace); matcher.find(); matcher = compile.matcher((CharSequence)replace)) {
            final String substring = replace.substring(matcher.start(), matcher.end());
            final char[] charArray = substring.replace('#', 'x').toCharArray();
            final StringBuilder sb = new StringBuilder("");
            final char[] array = charArray;
            for (int length = array.length, i = 0; i < length; ++i) {
                sb.append("&" + array[i]);
            }
            replace = replace.replace((CharSequence)substring, (CharSequence)sb.toString());
        }
        return ChatColor.translateAlternateColorCodes('&', replace).replace('&', '§');
    }
    
    public static List<String> hex(final List<String> list) {
        return (List<String>)list.stream().map(Hex::hex).toList();
    }
    
    public static List<String> hex(final List<String> list, final Replaceable replaceable) {
        return hex(replaceable.replaceList(list));
    }
}
