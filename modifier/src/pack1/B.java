package pack1;
class  B
{
	public static void main(String[] args) 
	{
		A obj = new A();
		//obj.w = 10; private member
		obj.x = 10; //default
		obj.y = 10; //protected
		obj.z = 10; //public
		System.out.println("done");
	}
}
/*
protected member also allows the current class
compilation error
default and protected is aloow the same package
if in line no 7 we are not adding in without comment so it will getting compilation error ]
acouse line no 7 is private member which is not allow in the  another class

*/
