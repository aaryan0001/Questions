import java.util.*;

public class loop {
    public static void main(String[] args) {
        //counter++=> counter+1
        // for(int counter=0;counter<=10;counter++){
        //     System.out.print(counter+ " ");
        // for(int i=0;i<11;i++){
        //     System.out.println(i);

        // }
        // int i=0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i=i+1;
        // }while(i<11);
        // int i=12;
        // while(i<11){
        //     System.out.println("Hello");
        // }
        // do {
        //     System.out.println("Hello");
        //     while(i<12);
        // }
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        }
    }
    

