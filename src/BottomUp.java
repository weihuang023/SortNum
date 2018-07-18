import java.util.Scanner;

public class BottomUp {
       
	static long fibonacciNum(int n) 
	{
		// if n == 1 or n ==2
		//   	result = 1;
		// else
		//      result = fib(n-1) + fib (n-2)
		
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		
		long arr[] = new long[n+1];

		arr[0] = 0;
		arr[1] = 1;
		
		for (int i = 2; i <= n; i++)
		{
			arr[i] = arr[i-1]+ arr[i-2];
		}
		
//		for (int i = 1; i<=n; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		return arr[n];
	}
	public long fib(int n) 
	{
		if (n<=1)
			return n;
		else
			return fib(n-1) + fib(n-2);
	}
	public static void main(String arg[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Fibonacci Number: ");
		int n = s.nextInt();
		System.out.println("Dynamic Programming: Fibonacci Number("+n+") = "+fibonacciNum(n));
		//System.out.println("This is fibonacci number with Dynamic Programming  "+fibonacciNum(n));

	}
}
