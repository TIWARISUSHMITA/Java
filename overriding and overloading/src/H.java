interface A
{
	void test();

}
class  H implements A
{
	 void test()
	{
		System.out.println("from H.test()");
		
	}
	public static void main(String[] args) 
	{
		H obj = new H();
		obj.test();
		System.out.println("done");
	}
}
/*
while overriding we can choose public to defaoult
but defolt to public should be

*/
