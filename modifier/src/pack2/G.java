package pack2;
import pack1.A;
class  G extends A
{
	public static void main(String[] args) 
	{
		A obj = new A();
	//	obj.w = 10;
     	obj.x = 10;
		obj.y = 10;
		obj.z = 10;
		System.out.println("done");
	}
}
/*
pack2\G.java:9: error: x is not public in A; cannot be accessed from outside package
        obj.x = 10;
           ^
pack2\G.java:10: error: y has protected access in A
                obj.y = 10;
                   ^

2 errors

we can not access w,x,y is not runnable becouse they are private ,defoult ,protected which is allow only one package not to another

*/