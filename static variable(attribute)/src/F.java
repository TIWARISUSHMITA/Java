class  F
{
	static int i = F.j;
	static int j = 10;

	public static void main(String[] args) 
	{
		System.out.println(i+"," +j);
	}
}
/*
0,10

in line no 3 i is taking assign value of the j becouse it notified the JVM 
through the class and add their default value in the i
*/