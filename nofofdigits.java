public class nofofdigits {
    
    public static void main(String[] args) {
        int n=4;
        int count=0;

        while(n>0)
        {
            n=n>>1;
            count++;
        }

        System.out.println(count);
    }
}
