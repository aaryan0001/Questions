public class rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //for spaces
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                //for hollow rhombus
                // if(i==1||j==1||i==n||j==n){
                System.out.print("*");}
                // else{
                    // System.out.print(" ");
                // }

            System.out.println();
        }
    }
    }
    
