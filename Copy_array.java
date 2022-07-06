package array;

public class Copy_array
{
public void array_copy()
{
	int [] a = {1,2,3,4,5,6};
	int [] b = new int[a.length];
	for (int i=0; i<a.length; i++)
	{
		b[i] = a[i];
	}
System.out.println("The original array is.");	
for (int i=0; i<a.length; i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("The copied array is");
for (int j =0; j<b.length; j++)
{
	System.out.print(b[j]+" ");
}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy_array obj = new Copy_array();
		obj.array_copy();
		
	}

}
