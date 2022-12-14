class  J
{
	 static int count;  
	

	J()
	{
	
		count ++ ; 
	 
	 }
	public static void main(String[] args) 
	{
		J obj1 = new J();
		J obj2 = new J();
		J obj3 = new J();
		J obj4 = new J();
		System.out.println(J.count );
	}
}
/*
4
the output is only 4 becouse the println print only one time truough the given println in line no 18
the answre is 4 becouse it depens on total nombr of object creation

*/
