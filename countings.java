import java.util.*;
public class countings {
    public static void countSort(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[index]=i;
                index++;
                count[i]--;
            }
        }
        }
        public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
       for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
       }
        countSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
