package Basics;

import java.util.Arrays;

public class Stringmethod {
    public static void main(String[] args) {
        String s = "Shubham";
        String s2 = "Pandey";
        //concatenation
        System.out.println(s+" "+s2);
        //String to char
        char[] charArray = s.toCharArray();
        System.out.println(Arrays.toString(charArray));

        //charat

        String s4 = "Lella";
        System.out.println(s4.charAt(1));
        //compare string //equals comapre values
        String s5 = "Lella";
        System.out.println(s4.equals(s5));

        //but == it will compare the address

        String s6 = new String("jummma");
        String s7 = new String("jummma");
        System.out.println(s6==s7);
        System.out.println(s6.equals(s7));
        //indexof
        //replace
        //substrig
        //string object will go in heap and one address of scp will created
        //string literal will go in scp not in heap
        // and same value will point to same address in the scp





    }
}
