public class kadansopt {
    public static void kadanO(int arr[]){
        int cs=arr[0];
        int ms=arr[0];
        System.out.println(cs);
        for(int i=1;i<arr.length;i++){
            cs=Math.max(cs+arr[i], arr[i]);
            ms=Math.max(ms, cs);
            System.out.println(cs);
        }
        System.out.println(ms);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        kadanO(arr);
    }   
}
