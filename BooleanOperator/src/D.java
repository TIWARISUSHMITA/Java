class D 
{
	public static void main(String[] args) 
	{
		boolean b1 = true; 
		System.out.println(b1);  //ture
		System.out.println(b1 = false);  //false
		System.out.println(b1);  //false
		System.out.println(b1 = !b1);  //true
		System.out.println(b1);  //true
	}
}
