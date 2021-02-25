package com.itacademy.lesson9;

import java.util.ArrayList;
import java.util.List;

public class HwTaskFirst {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("this");
        strings.add("is");
        strings.add("lots");
        strings.add("of");
        strings.add("fun");
        strings.add("for");
        strings.add("every");
        strings.add("java");
        strings.add("programmer");

        print(strings);
        System.out.println();
        markLength4(strings);
    }

    private static void markLength4 (List<String> strings) {
        String asterisks = "****";
        for (int i = 0; i < strings.size(); i++) {
            String word = strings.get(i);
                if (isLength4(word)) {
                    strings.add(i, asterisks);
                    i++;
                }
        }
        print(strings);
    }

     private static boolean isLength4 (String value) {
            char [] charsArray = value.toCharArray();
        return charsArray.length == 4;
    }

    private static void print (List<String> strings) {
        System.out.print("{");
        for (int i = 0; i < strings.size() ; i++) {
            if (i != strings.size() - 1) {
               System.out.print(strings.get(i) + ", " );
           } else {
               System.out.print(strings.get(i));
           }
        }
        System.out.print("}");
    }
}
