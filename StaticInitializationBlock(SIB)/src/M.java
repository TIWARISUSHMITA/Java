class M 
{
	int i;
	public void test()
	{
		System.out.println("test: " + this);
		System.out.println("test: " + this.i);
	}
	public static void main(String[] args) 
	{
		M obj =  new M();
		System.out.println("main : "  + obj); //print i value
		System.out.println("main : "  + obj.i); //..calling test method
		obj.test();
	}
}
/*
i and test both are non static
only one object is creating
in line no 13 we are using obj with i so it called the test method

main : M@15db9742
main : 0
test: M@15db9742
test: 0


*/