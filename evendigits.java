public class evendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans= findnumbers(nums);
        System.out.println(ans);
        
    }

    static int digits(int num)
    {
        int count=0;

        while(num>0)
        {
            count++;
            num=num/10;
        }

        return count;

    }

    static boolean even(int num)
    {
        int numofdigits=digits(num);

        if(numofdigits%2!=0)
        {
        } else {
            return true;
        }

        return false;
    }

    static int findnumbers(int[] nums)
    {
        int count=0;

        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }

        return count;
    }
}
