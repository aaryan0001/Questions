import java.util.*;
public class Twodarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] number= new int[n][m];
        //input rows and cols
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("The spiral matrix is : ");
        int rowstart=0;
        int rowend=n-1;
        int colstart=0;
        int colend=m-1;
        //i for rows
        //j for cols
        while(rowstart<=rowend && colstart<=colend){
            //left to right isme kam hoga cols ka so j lenge
            for(int j = colstart;j<=colend;j++ ){
                System.out.print(number[rowstart][j]+" ");
            }
            rowstart++;
            //top to bottom isme row ka kam hai so i lenge
            for(int i=rowstart;i<=rowend;i++){
                System.out.print(number[i][colend]+" ");
            }
            colend--;
            //right to left chalenge ab so cols ka use hai to j lenge ulta chlna hai reverse print krwynge
            // if(rowstart<=rowend){
                for(int j=colend;j>=colstart;j--){
                    System.out.print(number[rowend][j]+" ");
                }
                rowend--;
            // }
            //bottom to top rows ka kam hai i lenge
            // if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    System.out.print(number[i][colstart]+" ");
                }
                colstart++;
            // }  
            System.out.println();
        }
    }
    }
    

