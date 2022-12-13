class M 
{
	public static void main(String[] args) 
	{
		int i = 0;
		boolean b1 = (i++  == 1);
		//             0  ==  1
		System.out.println(b1);  //false
		System.out.println(i);  //1
	}
}
