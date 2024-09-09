
import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {

        int[] arr={5,4,3,2,1};
        quicksort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while(i<=j)
        {

        
    
        do
        {
            while (arr[i] <= pivot)
            {
                i++;
            }
    
            while (arr[j] > pivot)
            {
                j--;
            }
    
            
        } while (i < j);
    
        
                int temp = arr[low];
                arr[low] = arr[j];
                arr[j] = temp;
    }
                
        
    
            return j;
    
    }

    static void quicksort(int[] arr, int low, int high)
    {
        int partitionindex;
        if (low < high)
        {
             partitionindex= partition(arr, low, high);
            quicksort(arr, low, partitionindex - 1);
            quicksort(arr, partitionindex + 1, high);
        }
    }

    
    


}
