class  M3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] elements = {10, 20,50};
		int x = elements[3];
		System.out.println("main end");
	}
}
/*
main begin
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at M3.main(M3.java:7)


getting ArrayIndexOutOfBoundsException becouse line 7
the array size is 2 but in line no 7 it putting the value 3 that is why exception
Array starts in 0,1,2,
*/