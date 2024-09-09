public class singlenumber {
    public static void main(String[] args) {

        int[] nums={1};
        int ans=missingnumber(nums);
        System.out.println(ans);
        
    }

    static int  missingnumber(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            

        while(i<nums.length)
        {
            int j=i+1;

            while(j<nums.length)
            {
                if(nums[i]!=nums[j])
                {
                    j++;
                }
                else

                return j;
            }
           
        }
    }
        

        return  0;
    }
}
