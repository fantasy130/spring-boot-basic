package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
    public static List<String> of(String str) {
        ArrayList<String> result = new ArrayList<String>();

        if (str.length() == 1) {
            result.add(str);
        }

        if (str.length() >= 2) {
            for(int j=0; j<str.length(); j++) {
                List<String> filteredList = of(drop(str, j));
                for (int i = 0; i < filteredList.size(); i++) {
                    result.add(str.charAt(j) + filteredList.get(i));
                }
            }
        }
        return result;
    }


    static String drop(String input, int idx) {
        return new StringBuffer(input).deleteCharAt(idx).toString();
    }
}
