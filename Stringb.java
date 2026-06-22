import java.util.*;
public class Stringb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String str[]=new String[size];
        StringBuilder sb = new StringBuilder();
        // int total=0;
        for(int i=0;i<size;i++){
            str[i]=sc.next();
            // total+=str[i].length();

            sb.append(str[i]);
        }
        // System.out.println(total);
        System.out.println(sb.length());
    }
    
}
