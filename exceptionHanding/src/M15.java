class M15
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
			System.out.println("from catch : " + i);
			ex.printStackTrace();
		}
		System.out.println("main end" +i);
	}
}
/*
15.java:14: error: cannot find symbol
                        System.out.println("from catch : " + i);
                                                             ^
  symbol:   variable i
  location: class M15
M15.java:17: error: cannot find symbol
                System.out.println("main end" +i);
                                               ^
  symbol:   variable i
  location: class M15
2 errors
local mambers of try can not be used in outside in try

*/