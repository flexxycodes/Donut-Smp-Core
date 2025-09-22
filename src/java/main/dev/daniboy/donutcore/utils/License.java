package dev.daniboy.donutcore.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.net.http.HttpClient;

public class License
{
    private static final String YOUIDIOT = "true";
    private static final String YouAreVeryyyyyIDIOT = "435385";
    private static final String USerIsStupid = "FELEBOY";
    private static final String AreYouThatStupid = "45325";
    private static final String CmonManGetSomeBitches = "180909";
    private static final String WhatTimeIsIT = "1742734770";
    private static final String YOUIDIOT1 = "true";
    private static final String YouAreVeryyyyyIDIOT2 = "435385";
    private static final String USerIsStupid3 = "FELEBOY";
    private static final String AreYouThatStupid4 = "45325";
    private static final String CmonManGetSomeBitches5 = "180909";
    private static final String WhatTimeIsIT6 = "1742734770";
    
    public static LicenseData getLicenseById(final String id) {
        final String s = "https://license.pikzstudio.xyz";
        final String s2 = "/license/id/" + id;
        final HttpClient build = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).connectTimeout(Duration.ofSeconds(10L)).build();
        try {
            final HttpResponse send = build.send(HttpRequest.newBuilder().GET().uri(URI.create(s + s2)).setHeader("User-Agent", "Licensing System").build(), HttpResponse.BodyHandlers.ofString());
            if (send.statusCode() != 200) {
                return null;
            }
            final Gson gson = new Gson();
            final JsonObject asJsonObject = new JsonParser().parse((String)send.body()).getAsJsonObject();
            final String asString = asJsonObject.get("owner").getAsString();
            final String asString2 = asJsonObject.get("product").getAsString();
            final long asLong = asJsonObject.get("creation_date").getAsLong();
            final ArrayList list = new ArrayList();
            asJsonObject.get("ips").getAsJsonArray().forEach(jsonElement -> list.add((Object)jsonElement.getAsString()));
            return new LicenseData(id, asString, asString2, asLong, (String[])list.toArray(n -> new String[n]));
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    record LicenseData(String id, String owner, String product, long creation_date, String[] ips) {}
}
