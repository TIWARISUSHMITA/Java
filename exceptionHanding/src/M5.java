class  M5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] x = new int[99999999];
		System.out.println("main end");
	}
}
/*

main begin
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
									------------------//find eception
									at M5.main(M5.java:6)

exception OutOfMemoryError
it coused when there is not enough memory to allocate a new object

*/