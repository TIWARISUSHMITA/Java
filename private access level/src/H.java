class  G
{
	private G()
	{
	
	}

}
class H
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("Hello World!");
	}
}
/*
compilation error
H.java:13: error: G() has private access in G
                G g1 = new G();
                       ^
1 error
constructer decleared in private class
orivate constructor can be access in out side of the class


*/