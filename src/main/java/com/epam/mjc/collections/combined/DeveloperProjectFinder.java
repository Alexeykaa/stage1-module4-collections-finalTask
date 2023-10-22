package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        LinkedList<String> result = new LinkedList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            Set<String> developers = e.getValue();
            if (developers.contains(developer)) {
                result.add(e.getKey());
            }
        }
        result.sort(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                int cmp = o2.length() - o1.length();
                if (cmp == 0) {
                    cmp = o2.compareTo(o1);
                }
                return cmp;
            }
        });
        return result;
    }
}
