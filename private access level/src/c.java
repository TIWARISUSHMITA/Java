class  B
{
	private int i;
}
class C
{
	public static void main(String[] args) 
	{
		B b1 = new B(); //B is private member in  above class
		System.out.println(b1.i); 
	}
}
/*
private member of B can not useges in the other class
it can allowed to be use in current class
compilation error
private member of one class can not use in another class
*/