package Basics;

public class CountSort {
	
	public static void sort(int[] arr,int n)
	{
		int low=0;
		int mid=0;
		int high=n-1;
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
//			else if(arr[mid]==2)
//			{
//				int temp=arr[high];
//				arr[high]=arr[mid];
//				arr[mid]=temp;
//				high--;
//			}
			else if(arr[mid]==2)
			{
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
			else
			{
				mid++;
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}	
		
	}
	
	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sort(arr,n);
	}

}
