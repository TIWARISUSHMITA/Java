class Z10
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,400);
		System.out.println("main end");
	}	
	public static void test(int i,int i)  //both argument having same name
	{
		System.out.println("test:" +i+","+i);
	}
}
/**

                                          ^
Z10.java:11: error: cannot find symbol
                System.out.println("test:" +i+","+j);
                                                  ^
  symbol:   variable j
  location: class Z10
2 errors
two arguments are same but name is not same 
*/