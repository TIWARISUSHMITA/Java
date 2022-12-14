package pack1;
class  C extends A
{
	public static void main(String[] args) 
	{
		C obj = new C();
		//obj.w = 10; //private within the class 
		obj.x = 10; //default  working in current pakage but it only inherit the same class
		obj.y = 10; //protected usges in the current package  it iheritng to sub class but not to another package
		obj.z = 10; //public usges anywhere
		System.out.println("done");
	}
}
/*
protected member also allows the current class
compilation error
default and protected is alow the same package
if in line no 7 we are not adding in commond so it will getting compilation error ]
acouse line no 7 is private member which is not allow in the  another class
private member is not inheriting to the another class
in line no 7 getting compile error

pack1\C.java:7: error: w has private access in A
                obj.w = 10; //private
                   ^
1 error
protected mambers are inheriting to every sub class
no matter whether the sub class or not
protected can not be use in another package but it inheriting to another package member
default and protected can be allow in any sub class
but defualt is only use in current class member whereas protected can be use any where 



*/
