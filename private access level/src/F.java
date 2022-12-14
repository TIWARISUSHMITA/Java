class F 
{
	private F()
	{
		System.out.println("F()");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("------");
		F f2 = new F();
	}
}
/*
if constructor can be  private
F()
------
F()
*/