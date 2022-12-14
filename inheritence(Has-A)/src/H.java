class  A
{
	 int i ; 
}
class H
{
	A obj = new A();
	int x = 20;
	A obj2 = new A();
	String s1 = "Hello";


	public static void main(String[] args) 
	{ 
		H ref = new H();
		System.out.println(ref.obj1.i);
		System.out.println(ref.x);
		System.out.println(ref.obj2.i);
		System.out.println(ref.s1);
		ref.obj1.x = 200;
		ref.obj2.x = 100;
		ref.x = 400;
		ref.s1 = "test";
		System.out.println(ref.obj1.x);
		System.out.println(ref.x);
		System.out.println(re.obj2.x);
		System.out.println(ref.s1);
	}
}
/*
H class obj 
H has a relation with String class
if any global attribute
skip becouse getting error
but in orignality is not 

 
*/