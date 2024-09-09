
import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {

        int[] arr={5,4,3,2,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));        
    }

    static void selectionsort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            
            int lastindex=arr.length-i-1;
            int maxnumber=maxno(arr,0,lastindex+1);
            swap(arr,lastindex,maxnumber);
        }
    }

    static int maxno(int[] arr,int start,int end)
    {
        int max=start;

        for(int i=start;i<end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    
}
