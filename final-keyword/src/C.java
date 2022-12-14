class C 
{
	public static void main(String[] args) 
	{
		C c1= null;
		final C c2 = null;

		c1 = new C();
		c2 = new C(); //getting compilation error
		System.out.println("done");
	}
}

/*
C.java:9: error: cannot assign a value to final variable c2
                c2 = new C(); //getting compilation error
                ^
1 error

*/