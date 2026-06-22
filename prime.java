import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            isprime=false;
            // System.out.println("Not");
            // return;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("Not");
                    return;
                }
            }
        }
        if(isprime){
            System.out.println("P");
        }        
        else{
            System.out.println("N");
        }
    }
}
       