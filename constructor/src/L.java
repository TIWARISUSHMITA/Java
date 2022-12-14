class L
{
	L(int i)
	{
		System.out.println("L(int)");
	}
	public static void main(String[] args) 
	{
		L obj1 = new L(); 
		System.out.println("----------");
		L obj2 = new L(20); 
		System.out.println("----------");
		

				
	}
}
/*
L.java:9: error: constructor L in class L cannot be applied to given types;
                L obj1 = new L();
                         ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
if class doesn't have any constructor then compiler will be generating no argument constructir


*/