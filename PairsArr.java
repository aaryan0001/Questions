public class PairsArr {
    public static void findPairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("(" + arr[i] + "," + arr[j]+ ")");
                tp++;
            }
        }
        System.out.println("Total pairs "+ tp);
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8,10};
        findPairs(arr);
    }
    
}
