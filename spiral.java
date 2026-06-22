import java.util.*;
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int number[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("The spiral matrix is: ");
        int rowstart=0;
        int rowend=n-1;
        int colstart=0;
        int colend=m-1;
        while (rowstart<=rowend && colstart<=colend) {
            for(int j=colstart;j<=colend;j++){
                System.out.print(number[rowstart][j]+" ");
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                System.out.print(number[i][colend]+" ");
            }
            colend--;
            if(rowstart<=rowend){
            for(int j=colend;j>=colstart;j--){
                System.out.print(number[rowend][j]+ " ");
            }
            rowend--;
        }
            if(colstart<=colend){
            for(int i=rowend;i>=rowstart;i--){
                System.out.print(number[i][colstart]+" ");
            }
            colstart++;
        }
            System.out.println();
            
        }
    }
}