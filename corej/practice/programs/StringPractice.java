package practice.programs;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringPractice {

    static void reverseInPlace(String s){
        char[] abc=s.toCharArray();
        for(int i=0;i<abc.length/2;i++){
            char temp=abc[i];
            abc[i]=abc[abc.length-1-i];
            abc[abc.length-1-i]=temp;
        }

        String st=new String(abc);// this is how to convert char array to string
        System.out.println(new String(abc));
        // or user stringBuilder
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
    }

    static String recursivereverse(String s){
        if(s.length()==1) return s;
        return recursivereverse(s.substring(1,s.length())) + s.charAt(0);
    }


    public static void main(String[] args) {
        //How do you reverse a given string in place?
        reverseInPlace("rathor");
        System.out.println(recursivereverse("rathore"));
        allPermutation("ABC");
        largetNonRepeatingSubstring("thisnotisthe");
    }

    static void largetNonRepeatingSubstring(String s){
        int sp=0;
        String max="";
        String str=String.valueOf(s.charAt(0));
        for(int i=0;i<s.length()-1;i++){
            if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))){
                if(str.length()>max.length()){
                    max=str;
                    str="";
                }
            }else{
                str=str+s.charAt(i+1);
            }
        }
    }

    public static void allPermutation(String s){

        Set<String> list=new HashSet<>();
        char[] abc=s.toCharArray();
        String firstPart="";
        for(int i=0;i<abc.length;i++){
            firstPart+=abc[i];
            if(firstPart==s) break;
            String secondPart=s.substring(i+1);

            list.add(firstPart+secondPart);
            list.add(secondPart+firstPart);
            for(int j=1;j<secondPart.length();j++){
                String middlePart=secondPart.substring(0,j)+firstPart+secondPart.substring(j,secondPart.length());
                list.add(middlePart);
            }
        }
        System.out.println(list);
    }

    //How do you print duplicate characters from a string? (solution)  use a map

    //How do you check if two strings are anagrams of each other? (solution)
    // for each character in frist string remove that from second using sb.deletecharAt or str.substring(0,id) +
    // str.substring(id+1,str.length) remember substring endindex is excluded

    //How do you find all the permutations of a string? (solution)

    //How do you check if a string contains only digits? (solution)
    //Pattern pattern = Pattern.compile(".*[^0-9].*");
    //System.out.println(pattern.matcher("1231d23").matches()); this returns false if all numbers


    //How do you count a number of vowels and consonants in a given string? (solution)
    //How do you count the occurrence of a given character in a string? (solution)
    //How do you print the first non-repeated character from a string? (solution) if indexOf and lastIndex of a
    // charcter is same

    //How do you convert a given String into int like the atoi()? (solution)
    //How do you reverse words in a given sentence without using any library method? (solution)
    //How do you check if two strings are a rotation of each other? (solution) repeat the rotated string twice and
    // check if it contains the first string

    //How do you check if a given string is a palindrome? (solution) reverse and compare or
    // check first and last character

    //How do you find the length of the longest substring without repeating characters? (solution)
    //Given string str, How do you find the longest palindromic substring in str? (solution)
    //How to convert a byte array to String? (solution)

    //how to remove the duplicate character from String? (solution)
    //for each character loop till indexOf and lastIndex are same and remove the character at last index
    //using linkedhashset is simplest
    //replace all
    //looping through each element and then checking from already unique string

    //How to find the maximum occurring character in given String? (solution)
    //sort char array use a counter and max variable

    //How do you remove a given character from String? (solution)
    //use substring
}
