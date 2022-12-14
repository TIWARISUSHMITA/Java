class M27
{
	public static void main(String[] args) 
	{
		String s1 = " abc xyz ";
		System.out.println(s1.length());
		s1.trim();
		System.out.println(s1.length());
		
	}
}
/*
leading whith space
any no of spaces  it is removing befor word and after byt in middle it can't remove
like before a one white space so it removes that space and after z it also remove through the trim method but in middle
whith space it can't

9
9

*/