import java.util.*;

public class Kadane {
    public static void Kadanes(int arr[]){
       int cs=0;
       int ms=Integer.MIN_VALUE;
       int negative=Integer.MIN_VALUE;
       boolean isneg=true;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            isneg=false;
        }
        negative=Math.max(negative,arr[i]);
        cs=cs+arr[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(ms, cs);
       }
       if(isneg){
        System.out.println(negative);
       }
       else{
        System.out.println(ms);
       }
    }
    public static void main(String[] args) {
        int arr[]={2,-3,-1,-2,-3};
        Kadanes(arr);

    }
}
