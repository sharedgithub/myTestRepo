package main.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,9};
        binarySearch(arr,1);
        int[] arr2={20,8,3,5,800,9};
        bubbleSort(arr2);
        insertionSort(arr2);
        quickSort(arr2);

    }

    static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    static void quickSort(int[] arr, int li,int ri){
        if(li>=ri){
            return;
        }

        int pivot=arr[(li+ri)/2];
        int index=partition(arr,li,ri,pivot);
        quickSort(arr,li,index-1);
        quickSort(arr,index,ri);
    }

    static int partition(int[] arr,int li,int ri,int pivot){
        while(li<=ri) {
            while (arr[li] < pivot) li++;
            while (arr[ri] > pivot) ri--;
            if (li <= ri) {
                int temp = arr[ri];
                arr[ri] = arr[li];
                arr[li] = temp;
                li++;
                ri--;
            }
        }
        return li;
    }



    static void mergeSort(int[] arr){

    }


    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<=arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearch(int[] arr, int data){

        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==data){
                return mid;
            }else if(arr[mid]>data) {
                right = mid - 1;
            }else{
                left=mid+1;
            }
        }

        return -1;
    }

    public static void bubbleSort(int[] arr){
        boolean isSorted=false;
        int totalLength=arr.length-1;
        while(!isSorted){
            boolean hasSwapped=false;
            for(int i=0;i<totalLength;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    hasSwapped=true;
                }
            }
            totalLength=totalLength-1;
            if(hasSwapped==false){
                isSorted=true;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
