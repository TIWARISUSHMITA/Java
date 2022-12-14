class O
{
	final int i= 0 ;
	O()
	{
		i= 0; //attempting to modify
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
icompilation error
O.java:6: error: cannot assign a value to final variable i
                i= 0;
                ^
1 error
*/