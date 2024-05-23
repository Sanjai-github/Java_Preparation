package com.sanjai.arrays.questions_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> Ans = new ArrayList<>();
        for (int i = 0; i < words.length ; i++){
            if (words[i].indexOf(x) != -1){
                Ans.add(i);
            }

        }
        return Ans;
    }

    public static void main(String[] args) {
        String [] words = {"abc","def","fgh","ahij"};
        char x = 'a';
        System.out.println((findWordsContaining(words, x)));
    }
}
