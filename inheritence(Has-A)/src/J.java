class  A
{
	 int x ; 
}
class J
{
	A obj ;
	J(A obj)
	{
		this.obj = obj;
	}
	public static void main(String[] args) 
	{ 
		J ref = new J(new A());//in a main method a ref variable then it assigning the obj obj is the  object which is th e obj then it ppointing to the  A class varible which is the havwe the default vaue 0
		
		System.out.println(ref.obj.x);
		ref.obj.x = 100;
		System.out.println(ref.obj.x);
		
		ref.obj.x = 200;
		System.out.println(ref.obj.x);
	}
}
/*
0
100
200
we can not create an i 
ref.obj pointing to a obj
in the prevoius progrem in local variable into global but here no local ariable


 
*/