public class Revarr {
    public static void revArray(int arr[]){
        // int first=0,last=arr.length-1;
        // while(first<last){
        //     int temp=arr[first];
        //     arr[first]=arr[last];
        //     arr[last]=temp;
        //     first++;
        //     last--;
        // }
        
    }
    public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5,6,7,8,6};
    //     revArray(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }
    int n=153;
    int sum=0;
    int original=n;
    while(n>0){
        int digit=n%10;
        sum=sum+(digit*digit*digit);
        n=n/10;
    }
    if(sum==original){
        System.out.println("p");

    }
    else{
        System.out.println("N");
    }
}
}
            
        
    

