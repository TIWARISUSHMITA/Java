class I 
{
	public static void main(String[] args) 
	{
		int x = 1000;
		byte y = 10;
		y = x;
		System.out.println("done ");
	}
}
/*
narrowing or explicit
wider can not be converted automatically by compiler automaticlly
explict ns=arroing very much required

I.java:7: error: incompatible types: possible lossy conversion from int to byte
                y = x;
                    ^
1 error

*/