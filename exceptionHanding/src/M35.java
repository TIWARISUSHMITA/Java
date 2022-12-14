class  M35
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Class.forName("");
		}
		catch (ParseException ex)
			System.out.println("try catch");
		}
		System.out.println("main end");
	}
}
/*
M35.java:10: error: '{' expected
                catch (ParseException ex)
                                         ^
1 error

parseException is also checkaed 
in place of checked Exception donn't should be another unckecked
*/
