import java.util.*;

public class xn {
    public static void  calFibbonaci(int number){

        int a=0 ,  b=1;
        System.out.print(a+" ");
        if(number>1){
            for(int i=2;i<=number;i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.print(b+" ");
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       calFibbonaci(number);
    }
}
