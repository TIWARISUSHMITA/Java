class  Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		String s1 = test();
		System.out.println("main end : " +s1);
	}
		public static String test()  
	{
		System.out.println("test begin");
		System.out.println("test middle");		
		System.out.println("test end"); 
		return "Sushmita";
	}
}
/*
main begin
main middle
test begin
test middle
test end
main end :Sushmita

three are most importent 1. data type is same
now here line no 7,11,16 is same which is boolean
derived means we are developing


derived data type
-----------------
1. all classes (including built -in classes like thread String etc.)
2. all interface (including built - in interface)
3. all enums (including built -in enums)
*/