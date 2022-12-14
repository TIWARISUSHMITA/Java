class Q1
{
	int i = 10; //instance variable
	int j = 20; //instance variable
	public static void main(String[] args) 
	{
		Q1 q1 = new Q1();
		System.out.println(q1.i+","+ q1.j);
		q1.i = 30; //it is not a initializer
		q1.j = 20;
	}
}
/*
there two non static initialixer
10,20 

*/
