import java.util.*;
class condition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println(age + "\nEligible");

        }
        else{
            System.out.println(age + "\nNot Eligible");
        }

    }
}