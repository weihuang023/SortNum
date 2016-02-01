import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgo {
	
	static Scanner num;
	//Updated
	static int[] selectionSorting(int arr[]){
		for(int i=0; i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1; j<arr.length;j++)

				if(arr[j]<arr[index])
				{
					index=j;
				}
			int small = arr[index];
			arr[index] = arr[i];
			arr[i]=small;
			System.out.println("Sorting: "+(i+1)+" Array "+Arrays.toString(arr));
		}
		return arr;
	}
	
	static void insertionSorting(int [] arr)
	{
		for (int i = 1; i < arr.length; i++) {
			int valueToSort = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > valueToSort) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = valueToSort;
			System.out.println("Sorting: "+i+" Array "+Arrays.toString(arr));
		}
	}
	
	public static void main(String arg[]){
		num = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		int n = num.nextInt();
		int []arr1 = new int[n];
		System.out.println("Enter the array for Selection Sorting");
		for (int i=0; i<n ; i++)
		{
			arr1[i] = num.nextInt();
		}
		System.out.println("Before Selection Sorting: "+Arrays.toString(arr1));
		arr1 = selectionSorting(arr1);
		System.out.println("After Selection Sorting: "+Arrays.toString(arr1));
		System.out.println("-------------------------------------");
		System.out.println("Enter the array for Insertion Sorting");
		int []arr2 = new int[n];
		for (int i=0; i<n ; i++)
		{
			arr2[i] = num.nextInt();
		}
		System.out.println("Before Insertion Sorting: "+Arrays.toString(arr2));
		insertionSorting(arr2);
		System.out.println("After Insertion Sorting: "+Arrays.toString(arr2));

	}
}
