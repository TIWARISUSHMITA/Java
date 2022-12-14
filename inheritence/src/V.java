class  U
{
	U() //constructor
	{
		super();
		System.out.println("U()");
	}
	
}
class V extends U // if there is class without any extends then compiler incorparating  automaticallywith object
                  //as a built in object class is avilable
{
	
	V() //constructor 
	{
	super();
	System.out.println("V()");
	}
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		V v1 = new V();
		System.out.println("main end");
	}
}
/*
main begin
U()
V()
main end


here U class constructer not inheriting but V class constructor is giving a call to susper class

static members are inheriting using sub class
initializers are not involving in the inheritence
no initializer inheriting to sub class
super class constructor not inheriting to sub class
constructer,SIB IIB	 not inheriting  to super class
in every constructor body firet stmt should be either super calling stmt or this calling stmt
if  they dont have any keyword like super or this then vcompiler auto matically incorparating super() with no args constructor
constructor chaine while object is creating the sub class chain of constructor is involving










super calling stmt :-
super();
super(20)
super (30,"hello")
super (30 "hello",45)


this()
this(30)
this(30,"hello")
this(30,"hello" ,45)

*/