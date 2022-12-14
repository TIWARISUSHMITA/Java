class M73
{
	public static void main(String[] args) 
	{
		int num = 123456;
		String s1 = String.format("num is (%020d)", num);
		System.out.println(s1);
	}
}
/*
num is (00000000000000123456) 

%20d means 20 is breadth (20 white spaces print )

*/