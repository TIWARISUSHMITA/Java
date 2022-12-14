class K
{
	public static void main(String[] args) 
	{
		K k1 = new K(90); 
		System.out.println("----------");
		K k2 = new K(0); 
		

				
	}
}
/*

K.java:5: error: constructor K in class K cannot be applied to given types;
                K k1 = new K(90);
                       ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
K.java:7: error: constructor K in class K cannot be applied to given types;
                K k2 = new K(0);
                       ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
2 errors

if no constructor avilable in any class then compiler will generate no argument constructor as a default
but we are using here argument
so compilation error

*/