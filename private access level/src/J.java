class I 
{
	private I()
	{
	
	}
}
class J extends I
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*

J.java:8: error: I() has private access in I
class J extends I
^
1 error
in the body of J class constructor  can be accessed becouse constructor is private
calling stmt to super class constructor
super class constructor is private
we can get the private class in the other class
in java every stmt should be syntactically corrrect but the super class have an error so all programm will be getting error


*/