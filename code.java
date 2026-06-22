import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        int pos=0,neg=0,zero=0;
        System.out.println("press 1 to continue 0 to end");
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        while(input ==1){
            System.out.println("Enter the number");
            int number = sc.nextInt();
            if(number>0){
                pos++;
            }
            else if(number<0)
            {
                neg++;
            }
            else{
                zero++;
            }
            System.out.println("Press 1 to start 0 to end");
            input = sc.nextInt();

        }
        System.out.println("pos"+ pos);
        System.out.println("neg"+ neg);
        System.out.println("zero"+zero);
        sc.close();



    }
}
