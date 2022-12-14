class M 
{
	public static void main(String[] args) 
	{
		int i = 32568;
		short j = i;
		System.out.println(j);
	}
}
/*
M.java:6: error: incompatible types: possible lossy conversion from int to short
                short j = i;
                          ^
1 error

require explicit 
*/