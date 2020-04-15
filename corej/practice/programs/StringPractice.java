package practice.programs;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringPractice {
    //How do you reverse a given string in place?
    static void reverseInPlace(String s){
        char[] abc=s.toCharArray();
        for(int i=0;i<abc.length/2;i++){ //only less than not less than and equal to
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

    static boolean isAnagram(String s1,String s2){
        if(s1==s2) return true;
        if(s1.length()!=s2.length()) return false;
        char[] arr=s1.toCharArray();
        String s3=s2;
        for(char c:arr){
            int index=s2.indexOf(c);
            if(index<0) return false;
            s3=s3.substring(0,index)+s3.substring(index+1,s3.length());
        }
        if(s3.length()>0) return false;
        else return true;
    }

    public static void main(String[] args) {
        longSumInteger();
        longRepeating();
//        System.out.println(isAnagram("anuj","Juna"));
//        reverseInPlace("rathor");
//        System.out.println(recursivereverse("rathore"));
//        allPermutation("ABC");
//        largetNonRepeatingSubstring("thisnotisthe");
        patternMathc("alskdff99sdl03lkdf494llkd993.43.4,4,,,3,.34,");
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
    //How do you check if two strings are anagrams of each other? (solution)
    public static void allPermutation(String s){
        List<String> list=new LinkedList<>();
        char[] abc=s.toCharArray();

        list.add(Character.toString(abc[0]));
        for(int i=1;i<abc.length;i++){
            List<String> list2=new LinkedList<>();
            for(String s1:list){
                String fs=""; String ss=s1;
                for(int j=0;j<=s1.length();j++){
                    list2.add(fs+abc[i]+ss);
                    if(ss.isEmpty()) break;
                    fs=fs+ss.charAt(0);
                    ss=s1.substring(fs.length(),s1.length());
                }

            }
            list=list2;
        }
    }

    //How do you print duplicate characters from a string? (solution)  use a map


    // for each character in frist string remove that from second using sb.deletecharAt or str.substring(0,id) +
    // str.substring(id+1,str.length) remember substring endindex is excluded

    //How do you find all the permutations of a string? (solution)

    //How do you check if a string contains only digits? (solution)
    //Pattern pattern = Pattern.compile(".*[^0-9].*");
    //System.out.println(pattern.matcher("1231d23").matches()); this returns false if all numbers

    static void patternMathc(String abc){




        Pattern pp=Pattern.compile("\\d\\d");
        Matcher dd=pp.matcher(abc);
        while(dd.find()){
            System.out.println(dd.group());
        }

    }

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

    //lexicographically next string or numnber
//    ……….a) Traverse from right and find the first item that is not following the descending order. For example in “abedc”, the character ‘b’ does not follow the descending order.
//            ……….b) Swap the found character with closest greater (or smallest greater) element on right side of it. In case of “abedc”, we have ‘c’ as the closest greater element. After swapping ‘b’ and ‘c’, string becomes “acedb”.
//            ……….c) After swapping, sort the string after the position of character found in step a. After sorting the substring “edb” of “acedb”, we get “acbde” which is the required next permutation.
//
//    Optimizations in step b) and c)
//    a) Since the sequence is sorted in decreasing order, we can use binary search to find the closest greater element.
//    c) Since the sequence is already sorted in decreasing order (even after swapping as we swapped with the closest greater), we can get the sequence sorted (in increasing order) after reversing it.




    static void nextPermutation(){
        char[] abc="adsfds".toCharArray();

        for(int i=abc.length-1;i>=0;i--){

            if(abc[i]>abc[i-1]){
                char temp=abc[i];
                abc[i]=abc[i-1];
                abc[i-1]=temp;

                //here reverse the string
                break;
            }
        }
    }





    //longest substrng/subarray without repeating character
    static void longRepeating(){
        String abc="thisis my string";
        String s="";String ms="";
        for(char c: abc.toCharArray()){
            if(!s.contains(Character.toString(c))){
                s=s+c;
            }else{
                if(ms.length()<s.length()) ms=s;
                s=Character.toString(c);
            }
        }
    }

    static void longSumInteger(){
        int[] abc=new int[]{1,-2,3,-3,-6,2,5};
        int s=0;int ms=0;
        for(int a:abc) {
            s = s + a;
            if(a>s) {
                s = a;
            }
            if (s > ms) {
                ms = s;
            }

        }
        }
    }


