package dev.daniboy.donutcore.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Replaceable
{
    private static final String YOUIDIOT = "true";
    private static final String YouAreVeryyyyyIDIOT = "435385";
    private static final String USerIsStupid = "FELEBOY";
    private static final String AreYouThatStupid = "45325";
    private static final String CmonManGetSomeBitches = "180909";
    private static final String WhatTimeIsIT = "1742734770";
    private static final String NoMoney4 = "1a7a0449b3a5efe1fab86880a27c5029";
    private static final String YOUIDIOT1 = "true";
    private static final String YouAreVeryyyyyIDIOT2 = "435385";
    private static final String USerIsStupid3 = "FELEBOY";
    private static final String AreYouThatStupid4 = "45325";
    private static final String CmonManGetSomeBitches5 = "180909";
    private static final String WhatTimeIsIT6 = "1742734770";
    private static final String NoBalls9 = "1a7a0449b3a5efe1fab86880a27c5029";
    private Map<String, String> stringStringMap;
    
    public static Replaceable inst(final String... array) {
        return new Replaceable(array);
    }
    
    private Replaceable(final Map<String, String> stringStringMap) {
        this.stringStringMap = (Map<String, String>)new HashMap();
        this.stringStringMap = stringStringMap;
    }
    
    private Replaceable(final String... array) {
        this.stringStringMap = (Map<String, String>)new HashMap();
        if (array.length == 0) {
            return;
        }
        if (array.length % 2 != 0) {
            return;
        }
        for (int i = 0; i < array.length; i += 2) {
            this.stringStringMap.put((Object)array[i], (Object)array[i + 1]);
        }
    }
    
    public String replace(final String s) {
        String replace = s;
        for (Map.Entry entry : this.stringStringMap.entrySet()) {
            replace = replace.replace("%" + (String)entry.getKey(), (CharSequence)entry.getValue());
        }
        return replace;
    }
    
    public List<String> replaceList(final List<String> list) {
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((List)list2).add((Object)this.replace((String)iterator.next()));
        }
        return (List<String>)list2;
    }
}
