class  G
{
	int x;
	int y;
}
class H extends G
{
	void test1()
	{
	System.out.println("from test :" + x +"," + y);
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test1();
		System.out.println("done");
	}
}
/*
from test :0,0
done

*/