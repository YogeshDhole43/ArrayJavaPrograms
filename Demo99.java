package array;

public class Demo99 {
	
	public void demo()
	{
		String name = "abc";
		name.toCharArray();
		for (int i =name.length()-1; i<0;i--)
		{
			System.out.println(name.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		
		Demo99 d= new Demo99();
		d.demo();
		
	}

}
