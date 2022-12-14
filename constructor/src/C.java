class  C
{
	int i ;
	C()
	{
		this.i = 10;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);
	}
}
/*
10
i is loading in the object
which ever object creating 
costructer excuting automatically while object is creating
*/