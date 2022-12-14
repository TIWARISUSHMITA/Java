class R
{
	int i = 10; //initializer or instance variable or non static variable
	int j =i ;  // j is assigning the value of i
	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println(r1.i+","+ r1.j);

	}
}
/*
10,10


*/
