class D
{
	public static void main(String[] args) 
	{
		int i = 10;
		i = false ? 100 : 500;
		System.out.println(i);
	}
}
//500
/*
after ? true
after : false value
*/