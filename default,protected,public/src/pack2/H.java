package pack2;
import pack1.A;
class  H
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		a1.test();
		System.out.println("done");
	}
}
/*
compilation error
defoult scoped members can not e  use out side int package

pack2\H.java:8: error: i is not public in A; cannot be accessed from outside package
                a1.i = 10;
                  ^
pack2\H.java:9: error: test() is not public in A; cannot be accessed from outside package
                a1.test();
                  ^
2 errors

default scope members should we allowed in the same package
line no 7 is possible but line no 8 and 9 is not possible
default member can not use in the another class'
the default is only allow in the current package

*/