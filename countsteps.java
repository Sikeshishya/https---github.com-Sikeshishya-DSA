public class countsteps {
    public static void main(String[] args) {
        int ans=steps(14);
        System.out.println(ans);
    }


    private static int steps(int n) {

        if(n==0)
        {
            return 0;
        }

      
        if(n%2==0)
        {
            
          return 1+steps(n/2);
        }

        else{
            return 1+steps(n-1);
        }

    }
}
