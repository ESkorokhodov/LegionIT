package M5Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assignment3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("Steve");
        words.add("Tim");
        words.add("Lucy");
        words.add("Steve");
        words.add("Pat");
        words.add("Angela");
        words.add("Tom");
        words.add("Tim");
        words.add("Anna");
        words.add("Lucy");

        Collections.sort(words);
        for (String i : words) {
            //         System.out.println(i);
        }

        System.out.println("Before Removal Duplicate:  " + words);

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    words.remove(j);
                    j--;

                }
            }
        }
        System.out.println("After Removal Duplicate:" + words);

    }

}


