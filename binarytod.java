import java.util.*;
public class binarytod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int decimal=0;
        int pos=0;
        while(n>0){
            //n&1==1
            if(n%10==1){
                decimal+=1<<pos;
            }
            pos++;
            // n>>1;
            n/=10;        
        }
        System.out.println(decimal);
    }
}
    

