public class Binary {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,6,7,8,9};
        int target=10;
        int ans=binarysearch(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr,int target,int low,int high)
    {
        while(low<high)
        {
            int mid=low+(high-low)/2;

            if(target==arr[mid])
            return mid;

            else if(target>arr[mid])
            {
                return binarysearch(arr, target, mid+1, high);
            }

            else

            return binarysearch(arr, target, low, mid-1);

        }
        return 0;
        
    }
}
