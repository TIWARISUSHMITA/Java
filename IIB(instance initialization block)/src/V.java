class V 
{
	V()
	{
		System.out.println("V():" + i);
	}

	{
		System.out.println("IIB:"+i);
	}

	int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*V.java:9: error: illegal forward reference
                System.out.println("IIB:"+i);
                                          ^
1 error
the main initializer can not exist to the other initializer
like line no 9
canstructer is not a perfect initializer where as the IIB is perfect initializer
so it can exist the value of i

in line no 9 i is direct read in the other initializer but in initializer can not exist the direct read initializer

*/
