class K 
{
	public static void main(String[] args) 
	{
		boolean b1 = true && true;
		boolean b2 = true && false;
		boolean b3 = false && true;
		boolean b4 = false && false;
		System.out.println(b1);   //true
		System.out.println(b2);  //false
		System.out.println(b3);  //false
		System.out.println(b4);  //false
	}
}
