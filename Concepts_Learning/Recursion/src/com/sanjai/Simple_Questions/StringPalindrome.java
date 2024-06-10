package com.sanjai.Simple_Questions;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "malayalam";
        System.out.println(palin(word,0,word.length()-1 ));

    }
    static boolean palin(String word,int a,int b){
        if(a > word.length()/2 ) return true;
        if(word.charAt(a) == word.charAt(b)) {
            return palin(word, a + 1, b - 1);
        }
        return false;
    }

}
