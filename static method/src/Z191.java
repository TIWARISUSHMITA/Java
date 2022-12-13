class Z191
{
	public static void main(String[] args) 
	{
		
		int  i = 1;
		int j = test1(i++) + i +  i++  +  test1(++i ) + i  +  ++i  + test1(i--)  + i;
			System.out.println( i+","+j);
	}	
	public static int test1(int i) 
	{
				return i++;
	}
}
/*
4,27


*/