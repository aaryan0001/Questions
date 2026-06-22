public class bubr {
    public static void bubble(int arr[]){
        int turns=0;
        for(int turn=0;turn<arr.length-1;turn++){
            boolean issort=true;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    turns++;
                    issort=false;
                }
            }
            if(issort){
                break;
            }
        }
        System.out.println(turns);
    }
        
        public static void main(String[] args) {
        int arr[]={1,3,2,4,5};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
