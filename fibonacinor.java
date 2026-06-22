import java.util.*;
public class fibonacinor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.print(b+" ");
                int next=b;
                b=a+b;
                a=next;
            }
        }
    }
}
