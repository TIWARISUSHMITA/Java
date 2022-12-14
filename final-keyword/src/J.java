class J
{
	final int x = 10;;
	public static void main(String[] args) 
	{
	    J  obj = new J();
		obj.x = 10;  //compilation  error
		System.out.println("done");
	}
}
/*
J.java:7: error: cannot assign a value to final variable x
                obj.x = 10;  //compilation  error
                   ^
1 error

*/