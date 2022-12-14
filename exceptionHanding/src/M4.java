class  M4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj1 = new Object();
		Integer obj2 = (Integer) obj1;
		System.out.println("main end");
	}
}
/*

exception while excuting line no 7

main begin
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Integer
									-------------------//exception type
									at M4.main(M4.java:7)

*/