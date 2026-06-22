import java.util.Scanner;

public class decimaltob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n&1);
            n>>=1;
        }
        System.out.println(sb.reverse().toString());
    }
}
