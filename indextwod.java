import java.util.*;
public class indextwod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int number[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                number[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(number[i][j]==x){
                    System.out.println("Index is founded "+i+ "," +j+ " ");
                }
            }
        }
    }
}
