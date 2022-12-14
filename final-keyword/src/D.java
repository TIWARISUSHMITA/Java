class D 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		final D d2 = new D();
		d1 = d2;
		d2 = d1; // trying to modify d2
		System.out.println("done");
	}
}
/*

D.java:8: error: cannot assign a value to final variable d2
                d2 = d1;
                ^
1 error

*/