class M33 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Class.forName("");
		System.out.println("main end");
	}
}
/*
M33.java:6: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
										-----------------------
										Class.forName("");
									       ^
1 error
*/