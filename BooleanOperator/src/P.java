class P 
{
	public static void main(String[] args) 
	{
		int i = 0;
		boolean b1 = false || (i++  ==  0);
		           // false ||  (0  ==  0)true
		System.out.println(b1);   //ture
		System.out.println(i);  //1
	}
}
