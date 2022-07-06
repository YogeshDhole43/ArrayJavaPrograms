package array;
public class Ascii_code
{
	public void ascii()
	{
	char [] a= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char [] b= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	for(int i=0; i<a.length;i++)
	{
		int small = a[i];
		System.out.print(small+""+a[i]+" ");
	}
	System.out.println();
	
	for(int j=0; j<b.length;j++)
	{
		int upper = b[j];
		System.out.print(upper+""+b[j]+" ");
	}
	System.out.println();
	
	}
	
	public static void main(String[] args) {
		
		Ascii_code obj = new Ascii_code();
		obj.ascii();
	}

}
