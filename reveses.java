public class reveses {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("AryanGupta");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int rear=sb.length()-i-1;
            char frontChar=sb.charAt(front);
            char rearChar=sb.charAt(rear);
            sb.setCharAt(front, rearChar);
            sb.setCharAt(rear, frontChar);
        }
        System.out.println(sb);
    }
}
