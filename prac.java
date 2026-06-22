import java.util.*;
class prac {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int rowstart=0;
            int rowend=n-1;
            int colstart=0;
            int colend=m-1;
            while(rowstart<=rowend && colstart<=colend){
                for(int j=colstart;j<=colend;j++){
                    System.out.print(arr[rowstart][j]+" ");
                }
                rowstart++;
                for(int i=rowstart;i<=rowend;i++){
                    System.out.print(arr[i][colend]+" ");
                }
                colend--;
                if(rowstart<=rowend){
                for(int j=colend;j>=colstart;j--){
                    System.out.print(arr[rowend][j]+ " ");
                }
                rowend--;
            }
                if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    System.out.print(arr[i][colstart]+" ");
                }
                colstart++;
            }

            }
            System.out.println(); 
            }
        }
        
            
        
       

       
    

