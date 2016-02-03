import java.util.Arrays;
import java.util.Scanner;
//Updated Master Password

public class SortingAlgo {

	static Scanner num;
	
	static void swap(int a, int b, int [] arr){
		int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
	}


	static int[] selectionSort(int arr[]){
		for(int i=0; i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1; j<arr.length;j++)
				if(arr[j]<arr[index])
				{
					index=j;
				}
			swap(index,i,arr);
			System.out.println("Sorting: "+(i+1)+" Array "+Arrays.toString(arr));
		}
		return arr;
	}

	static void insertionSort(int [] arr)
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

	static void mergeSort(int[] arr) {
		int size = arr.length;
		if (size < 2)
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		for (int i = 0; i < mid; i++) 
		{
			left[i] = arr[i];
		}
		for (int i = mid; i < size; i++) {
			right[i - mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
	}

	static void merge(int[] left, int[] right, int[] arr) {
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0, k = 0;
		while (i < leftSize && j < rightSize) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		while (i < leftSize) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while (j < leftSize) {
			arr[k] = right[j];
			k++;
			j++;
		}
	}

	public static void main(String arg[]){
		
		int a = 1;
		int b = 2;
		int [] arr ={1,2,3};
		System.out.println("Swap: Pass by Value");
		System.out.println("x "+arr[a]);
		System.out.println("y "+arr[b]);
		System.out.println(Arrays.toString(arr));
		swap(a,b,arr);
		System.out.println("Swap between x and y ");
		System.out.println("x "+arr[a]);
		System.out.println("y "+arr[b]);
		System.out.println(Arrays.toString(arr));
		num = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		int n = num.nextInt();
/*		int []arr1 = new int[n];
		System.out.println("Enter the array for Selection Sorting");
		for (int i=0; i<n ; i++)
		{
			arr1[i] = num.nextInt();
		}
		System.out.println("Before Selection Sorting: "+Arrays.toString(arr1));
		arr1 = selectionSort(arr1);
		System.out.println("After Selection Sorting: "+Arrays.toString(arr1));
		System.out.println("-------------------------------------");
		int []arr2 = new int[n];
		System.out.println("Enter the array for Insertion Sorting");
		for (int i=0; i<n ; i++)
		{
			arr2[i] = num.nextInt();
		}
		System.out.println("Before Insertion Sorting: "+Arrays.toString(arr2));
		insertionSort(arr2);
		System.out.println("After Insertion Sorting: "+Arrays.toString(arr2));
*/		System.out.println("-------------------------------------");
		int []arr3 = new int[n];
		System.out.println("Enter the array for Merge Sorting");
		for (int i=0; i<n ; i++)
		{
			arr3[i] = num.nextInt();
		}
		System.out.println("Before Insertion Sorting: "+Arrays.toString(arr3));
		mergeSort(arr3);
		System.out.println("After Insertion Sorting: "+Arrays.toString(arr3));
	}
}
