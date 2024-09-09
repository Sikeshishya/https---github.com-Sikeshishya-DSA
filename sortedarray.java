public class sortedarray {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,6};
        boolean res=ans(arr);
        System.out.println(res);
        
    }

    static boolean  ans(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            
            if(arr[i]>arr[i+1])
            {
                return false;
            }


            
        }

        return true;


    }
}
