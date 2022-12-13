class O 
{
	public static void main(String[] args) 
	{
		int i = 0;
		boolean b1 = true || (i++  ==  0);
		           // true ||  (0  ==  0)true
		System.out.println(b1);   //ture
		System.out.println(i);  //0
	}
}
