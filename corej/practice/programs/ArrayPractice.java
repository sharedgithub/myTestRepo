package practice.programs;

import java.util.HashSet;
import java.util.Set;

public class ArrayPractice {
    public static void main(String[] args) {
        Set<Integer> abc=new HashSet<>();
        System.out.println(abc.add(2));
        System.out.println(abc.add(2));
        removeDuplicates(new String[]{"a", "A", "sd", "a", "a","d"});
        kadaneAlgorithms(new int[]{1,-3,5,-2,0,1});

    }



//    How to find the missing number in integer array of 1 to 100
    //how to find duplicate number in array
        //1 brute force //2 using a set

    //removing dublicates
    static void removeDuplicates(String[] arr){
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]) {
                arr[j]=arr[i];
                j++;
            }
        }
    }

    static void kadaneAlgorithms(int[] arr){
        int max=0,sum=0;

        for(int a:arr){
            sum=Math.max(sum,a);
            if(sum>max){
                max=sum;
            }
        }
    }
}
