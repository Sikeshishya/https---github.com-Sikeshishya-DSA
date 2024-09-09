

public class missingnumber {

    public static void main(String[] args) {

        int[] nums={3,0,1};
        int ans=missingnumber(nums);
        System.out.println(ans);
        
    }

    static int missingnumber(int[] nums)
    {
        int i=0;

        while(i<nums.length)
        {
            int correct=nums[i];

            

            if (nums[i] >= 0 && nums[i] < nums.length && nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }

        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
            
            

            
        }

        return nums.length;
    }

    static void swap(int[] nums,int i,int correct)
    {
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}
