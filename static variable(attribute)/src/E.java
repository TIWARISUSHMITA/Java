class E
{
	static int i =  j; //direct read becouse j is without suppling any value assigning the i 
	static int j = 10; 
	public static void main (String[] args)
	{
		System.out.println(i+","+j);
	}
}
/*
E.java:3: error: illegal forward reference
        static int i =  j;
                        ^
1 error

in line no 3 j is not notifiying  the JVM so its compile time error

*/