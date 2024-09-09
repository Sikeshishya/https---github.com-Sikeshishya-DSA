public class recusrion {
    

    public static void main(String[] args) {
        printnos(5);
    }

    static void  printnos(int n)
    {
        if(n==0)
        {
            return;
        }

        
        printnos(n-1);
        System.out.println(n);
    }
    
    

}

