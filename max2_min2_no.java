package array;

public class max2_min2_no 
{
	int max;
	int min;
	int [] a= {2,3,6,7,9,14,18,45,65,78,87,98};
public void max2_no()
{
	
	
	int max2=a[0];
	for (int i=0; i<a.length; i++)
	{
		if(a[a.length-1]>max)
		{
			max = a[a.length-1];
			max2 = a[a.length-2];
			System.out.println(max+" max ");
			System.out.println(max2+" max2 ");
			
			
		}
		else if (max<a[i])
		{
			max = a[i];
			max2 = a[i+1];
			System.out.println(max+" max2");
			System.out.println(max2+" max2 ");
		}	
		
	}
	System.out.println("----------------------------------------------------------------");
	
}

public void min2_no()
{
	int min2 =a[0];
	for (int i=0; i<a.length;i++)
	{
		if(min2==a[0])
		{
			min = a[0];
			min2 = a[0+1];
			System.out.println(min+" min");
			System.out.println(min2+" min2 ");
		}
		else if(min>a[i])
		{
			min = a[i];
			min2 = a[i-1];
			System.out.println(min+" min");
			System.out.println(min2+" min2 ");
		}
	}
	
	
}

	public static void main(String[] args) {
		

		max2_min2_no obj = new max2_min2_no();
		obj.max2_no();
		obj.min2_no();
	}

}
