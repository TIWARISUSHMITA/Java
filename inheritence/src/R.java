class  Q
{
	int x;
	int y;
}
class R
{
	Q obj ; 
	void test1()
	{
		System.out.println("from test : "+ obj.x + "," + obj.y);
	}
	public static void main(String[] args) 
	{
		R ref = new R();
		ref.obj = new Q(); 
		ref.test1();
		System.out.println("done");
	}
}
/*
from test : 0,0
done

*/