package array;
import java.util.Scanner;
public class Fibonacci_series {

	public void fibonacci_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of count");
		int n = sc.nextInt();
		int [] a = new int [n];
		a [0] = 1;
		a [1] = 2;
		//fibonacci series condition
		for (int i=2; i<n;i++)
		{
			a[i] = a[i-1]+a[i-2];
		}
		//to print new fibonacci array
		for(int k:a)
		{
			System.out.print(k+" ");
		}
		sc.close();
	}
	public static void main(String[] args) {
		
		Fibonacci_series s = new Fibonacci_series();
		s.fibonacci_array();
	}

}
