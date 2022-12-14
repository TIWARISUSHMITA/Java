class M16
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (NullPointerException ex)
		{
			System.out.println("from catch : ");
			ex.printStackTrace();
		}
		System.out.println("main end" +ex);
	}
}
/*
M16.java:17: error: cannot find symbol
                System.out.println("main end" +ex);
                                               ^
  symbol:   variable ex
  location: class M16
1 error
any local member of the try is use in try
any local member of the catch is use in catch
*/