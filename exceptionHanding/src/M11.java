class M11
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
	
		System.out.println("main end");
	}
}
/*
we can not use try alone  otherwuise getting error
every try should be catch

M11.java:6: error: 'try' without 'catch', 'finally' or resource declarations
                try
                ^
M11.java:16: error: unclosed comment
/*
^
M11.java:18: error: reached end of file while parsing
every try should be catch
                         ^
3 errors
*/