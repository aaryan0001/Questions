public class Subbarray {
    public static void Subarray(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            // int start=i;
            for(int j=i;j<arr.length;j++){
                // int end=j;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    tp++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tp);

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        Subarray(arr);
    }
}
