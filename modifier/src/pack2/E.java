package pack2;
class  E
{
	public static void main(String[] args) 
	{
		A obj = new A();
		System.out.println("done");
	}
}
/*
pack2\E.java:6: error: cannot find symbol
                A obj = new A();
                ^
  symbol:   class A
  location: class E
pack2\E.java:6: error: cannot find symbol
                A obj = new A();
                            ^
  symbol:   class A
  location: class E
2 errors
A is in the another package and also another class
*/