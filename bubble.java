import java.util.*;
public class bubble {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();//taking size of array from user
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
        //taking array input from user
        arr[i]=sc.nextInt();
        }
        //time conplexity is O(n^2) 
        for (int i = 0; i < arr.length - 1; i++) {
        boolean swapped = false;   // 👈 step 1

    for (int j = 0; j < arr.length - i - 1; j++) {  // 👈 step 2
        if (arr[j] > arr[j + 1]) {         // 👈 step 3
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;

            swapped = true;   // 👈 step 4
        }
    }

    if (!swapped) {           // 👈 step 5
        break;
    }
}

        bubbleSort(arr);

    }
    
}
