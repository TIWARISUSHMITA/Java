package pack1;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("I am from pack1.A!");
	}
}
/*
for compiling:-
-----------------

E:\jan 30th\App24\src>javac -d ../classes pack1/A.java

E:\jan 30th\App24\src>cd ../classes

E:\jan 30th\App24\classes>javac pack1.A
error: Class names, 'pack1.A', are only accepted if annotation processing is explicitly requested
1 error

for running:-
-------------
E:\jan 30th\App24\classes>java pack1.A
I am from pack1.A!
*/