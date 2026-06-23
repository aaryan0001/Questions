import java.util.*;

public class BinarySearch {
    public static int binSear(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[]={12,13,14,16,17,18};
        int key=18;
        System.out.println(binSear(arr, key));
        }
    }
