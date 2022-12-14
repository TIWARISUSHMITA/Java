class  B
{
	B()  //construcer
	{
		System.out.println("B():" + this); //constructer body
	}
	public static void main(String[] args) 
	{
		B b1 = new B(); //object
		System.out.println("main1 : " + b1);
		B b2 = new B(); //object
		System.out.println("main2 : " + b2);
	}
}
/*
construcer should not be static
constructer it should have same name in the class neme
it is a non static difintion block
in side a constructer body
B():B@15db9742
main1 : B@15db9742
B():B@6d06d69c
main2 : B@6d06d69c

*/

