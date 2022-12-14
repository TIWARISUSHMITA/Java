class K 
{
	int x;
	int y;
}
class L
{
	K obj = new K();
	void test1()
	{
		System.out.println("from test1:" + obj.x + "," + obj. y);
	}
	public static void main(String[] args) 
	{
		L ref = new L();
		ref.test1();
		System.out.println("done");
	}
}
/*
from test1:0,0
done
has-a relation
*/