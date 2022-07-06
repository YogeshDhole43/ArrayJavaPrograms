package array;

public class Duplicate_element 
{
	public void duplicate()
	{
		int [] a = {2,54,74,2,66,74,88,41,54,88};
		
		for (int i =0; i<a.length-1;i++)
		{
			for (int j = i+1; j<a.length;j++)
			{
				if (a[i] == a[j])
				{
					System.out.println(a[i]);
				}
			}
				
		}
	}

	public static void main(String[] args) {
		
		Duplicate_element obj = new Duplicate_element();
		obj.duplicate();

	}

}
