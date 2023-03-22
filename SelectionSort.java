public class SelectionSort
{  
    public static void selectionSort(int[] arr)
    {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int l = i + 1; l < arr.length; l++)
            {  
                if (arr[l] < arr[index])
                {  
                    index = l;
                }  
            }  
            int smallerNum = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNum;  
        }  
    }  
       
    public static void main(String a[])
    {  
        int[] arr1 = {7,14,3,2,9,15,35,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1)
        {  
            System.out.print(i + " ");  
        }  
        
        System.out.println(" ");  
        System.out.println(" "); 
          
        selectionSort(arr1);
         
        System.out.println("After Selection Sort");  
        for(int i:arr1)
        {  
            System.out.print(i + " ");  
        }  
    }  
}  