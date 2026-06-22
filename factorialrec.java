public class factorialrec {
    public static int printFact(int n){
        if( n==1||n==0){
            return 1;
        }
        //factn-1 as nm1
        int fact_nm1=printFact(n-1);
        //int fact_n= as n factorial
        int fact_n=n*fact_nm1;
        return fact_n;

    }
    public static void main(String[] args) {
        int n=5;
        int ans=printFact(n);
        System.out.println(ans);
        
    }
    
}
