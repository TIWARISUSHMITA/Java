class  I
{
	int x;
	int y;
}
class j
{
	I obj = new I();
	void test()
	{
		System.out.println("from test1 : " + x + ", " + y);
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.test1();
		System.out.println("done");
	}
}
/*
compile time error
J has a I 
but i members are not avilable in the class J 
inside the J class we can not use the i members streat aways
this is a has-a relation

has-a relation mean i n the whole (total) has a part
here J has I but I hans not a J member
*/