class S
{
	int i = j; //direct read
	int j =20 ; 
	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println(S1.i+","+ S1.j);

	}
}
/*
compilation error
becouse i is assigning the value of j wherever j is not initializing in line no 3 it will 
assigning in linne no 4

.java:3: error: illegal forward reference
        int i = j;


*/
