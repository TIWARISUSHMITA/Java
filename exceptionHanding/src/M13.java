class M13
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
		System.out.println("middle");
		catch (ArithmeticException ex)
		{
			System.out.println("from catch : ");
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
/*
we should not put any stmt in middle of try and catch like line no 12
M13.java:6: error: 'try' without 'catch', 'finally' or resource declarations
                try
                ^
M13.java:13: error: 'catch' without 'try'
                catch (ArithmeticException ex)
                ^
2 errors

try  alone is possible but catch is not possible
catch is only for handling rised exception
in catch body any no of stmt any type of stmt we can create
*/