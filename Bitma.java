import java.util.*;
public class Bitma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int decimal=0;
        int pos=0;
        while(n>0){
            if((n%10)==1){
            decimal+=1<<pos;
        }
        pos++;
        n/=10;
    }
        System.out.println(decimal);
        }

    }

        //toggle means xor
    

