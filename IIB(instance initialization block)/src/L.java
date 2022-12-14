class  L
{
	 static int count;  
	

	L()
	{
	
		count ++ ; 
	 
	 }

	 L(int i)
	{
		count ++;	 
	}

	L(int i , int j)
	{
	
		count ++ ;
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();
		L obj2 = new L();
		L obj3 = new L(20);
		L obj4 = new L(120);
		L obj5 = new L(20 ,0);
		L obj6 = new L(2 ,20);
		System.out.println(L.count );
	}
}
/*
6
constructor got over loaded very properly
three time constructor over loading
and there is 6 objects


*/
