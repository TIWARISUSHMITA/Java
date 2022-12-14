class M78 
{
	public static void main(String[] args) 
	{
		double num = 1234.5678;
		String s1 = String.format("num is %.3f" , num);
		System.out.println(s1);
	}
}
/*
num is 1234.568
 after . only 3 floating points are getting
*/