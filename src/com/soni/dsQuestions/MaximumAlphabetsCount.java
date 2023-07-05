package com.soni.dsQuestions;

public class MaximumAlphabetsCount {

    public static void getMaxOccurrenceAlphabetChar(String str){
        char res = ' ';
        int[] chars = new int[256];
        int countMax = -1;

        for(int i = 0 ; i < str.length(); i++){
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                chars[str.charAt(i)]++;
                if(chars[str.charAt(i)] > countMax){
                    countMax = chars[str.charAt(i)];
                    res = str.charAt(i);
                }
            }
        }
        System.out.println(res);
    }
}
