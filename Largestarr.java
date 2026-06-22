import java.util.*;
public class Largestarr {
    public static void larArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }

            if(arr[i]<smallest){
                secsmall=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secsmall && arr[i]!=smallest){
                secsmall=arr[i];
            }
        }
            
       
    System.out.println(largest);
    System.out.println(slargest);
    System.out.println(smallest);
    System.out.println(secsmall);


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,8};
        larArray(arr);
    }
}
