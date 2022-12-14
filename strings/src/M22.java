class M22
{
	public static void main(String[] args) 
	{
		String s1 = NULL; // upper case null is not recognized
		System.out.println(s1.length());
	}
}
/*
M22.java:5: error: cannot find symbol
                String s1 = NULL;
                            ^
  symbol:   variable NULL
  location: class M22
1 error

*/