package com.company;

public class Main {

    public static void main(String[] args) {

        String s ="today is easter";
        int counteaster = s.length()-s.replaceAll("\\$","").length();
        long count = s.length()-s.replaceAll("e","").length();
        System.out.println(count);

    }
}
