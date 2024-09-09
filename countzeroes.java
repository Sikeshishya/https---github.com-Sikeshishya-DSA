public class countzeroes {
    public static void main(String[] args) {
        int ans=zeroes(102034);
        System.out.println(ans);
    }

    private static int zeroes(int n) {
        int count=0;

        if(n==0){
            return 0;
        }

        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;


    }
}
