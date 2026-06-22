import java.util.*;
public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int calc=sc.nextInt();
        switch (calc) {
            case 1:System.out.println(a+b + "\n + Addition");
            break;
            case 2: System.out.println(a-b + "\n - Subtraction");
            break;
            case 3: System.out.println(a*b + "\n * Multiplication");
            break;
            case 4: if (b==0){
                System.out.println("Invalid");
            }
                else{
                System.out.println(a/b + "\n / Division");}
            break;
            case 5:
                if(b==0){
                    System.out.println("Invalid");
                }
                else{
                System.out.println(a%b + "\n % Modulo or remainder");
            }
            break;
        
            default:System.out.println("invalid");
            break;
        }

    }
    
}
