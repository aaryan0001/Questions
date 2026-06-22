import java.util.*;
public class selection {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            //smallest hoga i
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                //agr smallest zyda hai i+1 se to usko j krdenge
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //j krne ke bad ab usko swap krnge is type the phle smallest ko temp me raklenge then smallest me i ki value dalenge jo choti hoti hai
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp; 
        }
        selectionSort(arr);
        }
    }


