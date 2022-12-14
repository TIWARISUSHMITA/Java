class M25
{
	static void test(Integer  i) 
	{
		System.out.println("test(Integer)");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		System.out.println("done");
	}
}
/*


M25.java:10: error: incompatible types: byte cannot be converted to Integer
                test(b);
                     ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error



all wrapper classes sub classes to no 
compilation error
one wrapper can not converted into another wrapper the resion is
all wrapper class extend class into number 
all wrapper classes aresibilings
preference:
1. widning 
2. boxing with upcasting
3. var...args
*/