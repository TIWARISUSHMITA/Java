class N 
{
	int i ;
	public void test()
	{
		System.out.println("test : " +i); //System.out.println("test : " +this.i);
		i = 30; //this .i = 30;
	}
	public static void main(String[] args) 
	{
		N obj = new N();
		System.out.println("main : " + obj.i);
		obj.test();
		System.out.println("main : " + obj.i);
	}
}
/*

main : 0
test : 0
main : 30
in every non static method this is avilable


*/