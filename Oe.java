import java.util.*;
class Oe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num + "\nThe number is even");
        }
        else{
            System.out.println(num + "\nThe number is odd");
        }
    }
}