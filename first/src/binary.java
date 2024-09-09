public class binary {

    public static void main(String[] args) {
        int[] arr={0,1,3,4,5,7,8,4};
        int result=binarysearch(arr,5);
        System.out.println("result");
    }
    
}


/**
 * @param arr
 * @param target
 */
static int binarysearch(int[] arr,int target)
{
    int s=0;
    int e=arr.length-1;
    int m=s+(s-e)/2;

    while(s<=e)
    {
        if(target==arr[m])

            return mid;

       else if(target>arr[mid])
            s=m+1;

            else

            e=m-1;
    }

    return -1;
}
