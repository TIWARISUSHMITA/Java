class  L
{
	public void test()
	{
		System.out.println("test : " + this);
	}
	public static void main(String[] args) 
	{
		L obj = new L();
		System.out.println("main : " + obj);
		obj.test();
	}
}
/*
main : L@15db9742
test : L@15db9742
in the main method obj 
in the test method this

*/