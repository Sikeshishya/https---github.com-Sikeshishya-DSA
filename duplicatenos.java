
import java.util.ArrayList;
import java.util.List;

public class duplicatenos {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans=duplicatenos(arr);
        System.out.println(ans);
        
        
    }

    static List<Integer>  duplicatenos(int[] arr)
    {
        int i=0;


        while(i<arr.length)

        {

            int correct=arr[i]-1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct])       
                {
                swap(arr,i,correct);
            }
            else
            i++;
        }

        List<Integer> ans=new ArrayList<>();

        for ( i = 0; i < arr.length; i++) {

            if(arr[i]!=i+1)
            {
                ans.add(i+1);
            }
            
        }

        return ans;
    }

   

      

        
            

    

        static void swap(int[] arr,int i,int correct)
    {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    
}


