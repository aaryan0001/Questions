import java.util.*;
public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols=sc.nextInt();
        int number[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            number[i][j]=sc.nextInt();
        }
    }
        int rowstart=0;
        int rowsend=rows-1;
        int colstart=0;
        int colend=cols-1;

        while(rowstart<=rowsend && colstart<=colend){
            for(int j=colstart;j<=colend;j++){
                System.out.print(number[rowstart][j]+ " ");
            }
            rowstart++;
            for(int i=rowstart;i<=rowsend;i++){
                System.out.print(number[i][colend]+ " ");
            }
            colend--;
            for(int j=colend;j>=colstart;j--){
                System.out.print(number[rowsend][j]+" ");
            }
            rowsend--;
            for(int i=rowsend;i>=rowstart;i--){
                System.out.print(number[i][colstart]+" ");
            }
            colstart++;
        }
        System.out.println();

    }
    
}
