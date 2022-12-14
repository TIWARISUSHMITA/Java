class O 
{
	int i = 10; //instance variable
	int j = 20; //instance variable
	public static void main(String[] args) 
	{
		System.out.println(i+","+j);
	}
}
/*
'
compilation error
non static member can not exist in main method
here compile time error becouse in main method the object is not created

*/
