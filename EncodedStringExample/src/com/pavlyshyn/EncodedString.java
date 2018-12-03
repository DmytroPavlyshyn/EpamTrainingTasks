package com.pavlyshyn;

import java.util.*;

public class EncodedString {
    private String originalString;
    private Integer indexOfOriginalString;
    private String[] encodedStrings;
    private String lastChars;
    public EncodedString(String originalString) {
        this.originalString = originalString;
        encodedStrings = createEncodedStringsArray();
        Arrays.sort(encodedStrings);
        lastChars = lastCharsInStrings();
        indexOfOriginalString = findOriginalStringInEncoded();
    }
    public String getOriginalString() {
        return originalString;
    }

    public Integer getIndexOfOriginalString() {
        return indexOfOriginalString;
    }

    public String[] getEncodedStrings() {
        return encodedStrings;
    }

    public String getLastChars() {
        return lastChars;
    }

    private String[] createEncodedStringsArray(){
        String[] strings = new String[originalString.length()];
        for(int i = 0; i < originalString.length(); i++){
            strings[i] = originalString.substring(i, originalString.length()) + originalString.substring(0,i);
        }
        return  strings;
    }

    private String lastCharsInStrings(){
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<encodedStrings.length; i++){
            temp.append(encodedStrings[i].charAt(encodedStrings[i].length()-1));
        }
        return  temp.toString();
    }
    private int findOriginalStringInEncoded(){
        for(int i=0; i<encodedStrings.length; i++){
            if(originalString.equals(encodedStrings[i])){
                return i;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "EncodedString{" +
                "originalString='" + originalString + '\'' +
                ", indexOfOriginalString=" + indexOfOriginalString +
                ", encodedStrings=" + Arrays.toString(encodedStrings) +
                ", lastChars='" + lastChars + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Enter any word:");
        EncodedString encodedString = new EncodedString(new Scanner(System.in).nextLine());
        System.out.println(encodedString);
    }
}
