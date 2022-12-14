class  H
{
	 static int count;  
	

	H()
	{
	
		count ++ ; 
	 
	 }
	public static void main(String[] args) 
	{
		H obj1 = new H();
		H obj2 = new H();
		H obj3 = new H();
		H obj4 = new H();
		System.out.println(obj1.count + "," + obj2.count+"," + obj3.count+ "," + obj4.count);
		//System.out.println(H.count +"," +H.count + "," + H.count + ", "+ H.count );
	}
}
/*
4,4,4,4
static members are not loading in the memory
in obj use for any purpose



*/
