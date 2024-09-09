

import java.util.Arrays;

public class cyclicsort
 {
    public static void main(String[] args) {

        int[] arr={2,0,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void cyclicsort(int[] arr)
    {
        int i=0;

        while(i<arr.length)
        {
            int correct=arr[i];

            if(arr[i]!=arr[correct] && arr[i]<=arr.length && arr[i]>=0)
            {
                swap(arr,i,correct);
            }
            else
            {i++;}
        }
    }

    static void swap(int[] arr,int i,int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
