package array;

public class Common_element 
{
//to find out common element from two array
	
	public void common_two_array()
	{
		int [] a= {2,5,6,3,98,41,10,7,2};
		int [] b= {10,52,14,7,2};

		for (int i=0; i<a.length;i++)
		{
			for (int j=0; j<b.length; j++)
			{
				if (a[i]==b[j])
				{
					System.out.println(a[i]+" ");
					System.out.println("index from first array is: " +i);
					//System.out.println(i);
					System.out.println("index from second array is: "+j);
					//System.out.println(j);
					System.out.println();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Common_element obj = new Common_element();
		obj.common_two_array();

	}

}
