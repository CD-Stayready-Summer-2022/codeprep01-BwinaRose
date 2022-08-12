package com.codedifferently.problems;

import java.util.HashMap;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        input = input.toLowerCase();
        char letterChar = letter.charAt(0);
        char[] letters = input.toCharArray();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        hashmap.put(letterChar,0);
        for (char c : letters) {
            if (hashmap.containsKey(c)){
                hashmap.put(c,hashmap.get(c)+1);
            }
        }
        return hashmap.get(letterChar);
    }
}
