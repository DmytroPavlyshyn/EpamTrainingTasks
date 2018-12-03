package com.pavlyshyn;

import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        new Demo().showWordInRhombForm(scanner.nextLine());
    }
    
    public void showWordInRhombForm(String s) {

        int length =  s.length();
        for (int i = length/2; i > 0; i--) {
            if(i==length/2 && s.length()%2==0){
                continue;
            }
            for (int j = 0; j < i; j++)
                System.out.print(' ');
            System.out.println(substring(s,i, s.length() - i));

        }
        for (int i = 0; i < length / 2 + 1; i++) {
            if(i==length/2 && s.length()%2==0){
                continue;
            }
            for (int j = 0; j < i; j++)
                System.out.print(' ');
            System.out.println(substring(s,i, s.length() - i));





        }
    }
    public static String substring(String s, int begin, int end){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i <s.length(); i++) {
            if(i >=begin&&i<end) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}