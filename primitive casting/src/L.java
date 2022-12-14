class L
{
	public static void main(String[] args) 
	{
		int x = -130;
		byte y = 10;
		y = (byte)x; 
		System.out.println(x+", "+y);
	}
}
/*
narrowing or explicit
wider can not be converted automatically by compiler automaticlly

-130, 126


*/