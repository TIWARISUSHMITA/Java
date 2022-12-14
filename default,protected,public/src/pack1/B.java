package pack1;
class  B
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		a1.test;
	}
}
/*
defoult members should allowed in the same package

E:\jan 30th\App26\src>javac -d ../classes pack1/B.java
pack1\B.java:8: error: not a statement
                a1.test;
                  ^
1 error
*/