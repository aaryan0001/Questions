import java.util.Scanner;

public class primenum {
    public static void priNum(int num){
        boolean isprime=true;
        if(num<=1){
            isprime=false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        priNum(num);
        
    }
    

}
