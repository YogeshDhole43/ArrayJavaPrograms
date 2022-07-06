package array;

import java.util.Arrays;

public class Arrays_Equality {

	public void equality()
	{
		int [] a = new int []{2,5,7,8,9};
		int [] b = new int []{2,5,7,8,9};
		
		System.out.println(Arrays.equals(a, b));
		
		for (int i=0; i<a.length;i++)
		{
			for (int j=0; j<b.length;j++)
			{
				if (a[i]==b[j])
				{
					
				}
			}
		}
		System.out.println("equal array");
		
		if (a == b)
		
			System.out.println("Arrays are equal");
		
		else
		 
			System.out.println("Not equal");
		
		
	}
	public static void main(String[] args) {
		
		Arrays_Equality j = new Arrays_Equality();
		j.equality();
	}

}
