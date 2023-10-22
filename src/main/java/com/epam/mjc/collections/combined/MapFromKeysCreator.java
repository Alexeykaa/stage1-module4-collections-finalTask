package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> result = new HashMap<>();
        for(Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            String key = e.getKey();
            int length = key.length();
            Set<String> keys = result.get(length);
            if (keys == null) {
                keys = new HashSet<>();
            }
            keys.add(key);
            result.put(length, keys);
        }
        return result;
    }
}
