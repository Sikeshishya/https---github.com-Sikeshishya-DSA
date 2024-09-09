#include <stdio.h>

void quicksort(int arr[], int low, int high)
{
    int partitionindex;
    if (low < high)
    {
         partitionindex= partition(arr, low, high);
        quicksort(arr, low, partitionindex - 1);
        quicksort(arr, partitionindex + 1, high);
    }
}

int partition(int arr[], int low, int high)
{
    int pivot = arr[low];
    int i = low + 1;
    int j = high;

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
    

        return j;

}

void printarray(int *arr,int n)
{
    for (int i = 0; i <=n; i++)
    {
        printf("%d\t",arr[i]);
    }
    printf("\n");
    
}

int main()
{
    int arr[]={5,4,3,2,1};
    printarray(arr,4);
    quicksort(arr,0,4);
    printarray(arr,4);
}