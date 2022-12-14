class  G
{
	int count;  //count is non static so this default value is 0 then going to the constructor and increment becouse of ++
	



	G()
	{
	
		count ++ ; 
	 
	 }
	public static void main(String[] args) 
	{
		G obj1 = new G();
		G obj2 = new G();
		G obj3 = new G();
		G obj4 = new G();
		System.out.println(obj1.count + "," + obj2.count+"," + obj3.count+ "," + obj4.count);
	}
}
/*
1,1,1,1
count is non static

*/
