class  M8
{
	public static void main(String[] args) 
	{
		double i = 10.5;
		Double obj = new Double(i);  //from of wrapper or object
		double j = obj.intValue(); // to convert the wrapper to primitive
		System.out.println("un  boxing");
	}
}
/*
un boxing

i and j is a primitive
obj is derived or reference variable

*/
