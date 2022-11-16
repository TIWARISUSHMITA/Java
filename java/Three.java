class Three 
{
	public static void main(String[] args) 
	{
		int[] marks={10,20,30,40,50};
		System.out.println(marks[0]);
		try
		{
			System.out.println(marks[10]);
		}
		catch (Exception e)
		{
			System.out.println(marks[0]);
		}
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
	}
}
