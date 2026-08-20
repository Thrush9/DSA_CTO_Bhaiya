package org.training.dsa.arrays;

public class CharacterCountInString {

    public static void main(String[] args) {
        printCharacterCountInString();
        characterCountOptimized();
    }

    private static void printCharacterCountInString() {
        String input = "aabbbbeeeeffggg";
        int len = input.length();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<len){
            char current = input.charAt(i);
            int count = 0;
            int j = i;
            while ( j < len && input.charAt(j) == current){
                count++;
                j++;
            }
            sb.append(current).append(String.valueOf(count));
            i=j;
        }
        System.out.println("Final Output ::: " + sb);
    }

    private static void characterCountOptimized() {
        String input = "aabbbbeeeeffggg"; //a2b4e4f2g3
        StringBuilder compressed = new StringBuilder(input.length());
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(compressed);
    }
}
