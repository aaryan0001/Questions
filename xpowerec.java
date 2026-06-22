public class xpowerec {
    public static int calPower(int x ,int n){
        if(n==0){
            return 1;
        }
        if(x==0)
            return 0;
        int xPower1=calPower(x, n-1);
        int xpow=x*xPower1;
        return xpow;

    }

    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(calPower(x, n));
        
    }
    
}
