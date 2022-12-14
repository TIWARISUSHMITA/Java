class E 
{
	int i ;
	void test1()
	{
		System.out.println("E-test1");
	}
}
class F extends E //is-a //F is-a type of E
{
	int j ;
	void test2()
	{
		System.out.println("F-test2");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i + "," + f1.j);
		f1.test1();
		System.out.println("-----------");
		f1.test2();
		f1.i = 100;
		f1.j = 200;
		System.out.println(f1.i + " ," +f1.j) ;
	}
}
/*
0,0
E-test1
-----------
F-test2
100 ,200
sub class is-a super class type
every super class is avilable  in the sub class
but every sub class is not avilable in the super class
f class is the instance of class E
while creat a F class totally 4 type of non static members are avilable


*/