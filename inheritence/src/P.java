class  O
{
	int x;
	int y;
}
class P
{
	O obj ; 
	P(O obj)
	{
		this.obj = obj;
	}
	void test1()
	{
		System.out.println("from test : "+ obj.x + "," + obj.y);
	}
	public static void main(String[] args) 
	{
		P ref = new P(new O());
		ref.test1();
		System.out.println("done");
	}
}
/*
from test 0,0
done
through the constructer be are supplying the object

*/