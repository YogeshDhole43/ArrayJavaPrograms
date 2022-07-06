package array;

public class Addition_array 
{
public void addition()
{
	int [] a= {23,5,56,89,74,78,14,10,65,79,98,21};
	int total =0;
	
	for(int i=0; i<a.length;i++)
	{
		total = total+a[i];
	}
	System.out.println("Total is: "+total);
}
	public static void main(String[] args) {
		
		Addition_array obj = new Addition_array();
		obj.addition();
	}

}
