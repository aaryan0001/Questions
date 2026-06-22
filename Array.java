import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        int max=number[0];
        int min=number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max=number[i];
            }
        }
        boolean isAscending=true;
        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
        System.out.println("Largest is"+max);
        System.out.println("Smallest is"+min);
        
    }

       
    }

