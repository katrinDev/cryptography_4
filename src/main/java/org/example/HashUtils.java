package org.example;

public class HashUtils {
    public static String JOAATHash(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
            hash += hash << 10;
            hash ^= hash >> 6;
        }

        hash += hash << 3;
        hash ^= hash >> 11;
        hash += hash << 15;

        return Integer.toHexString(hash);
    }
}
