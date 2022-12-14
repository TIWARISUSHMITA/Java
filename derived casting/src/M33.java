class  M33
{
	public static void main(String[] args) 
	{
		A b1 = new B();
		System.out.println(b1.i);
		b1.test1();
		if (b1 instanceof B)
		{
			B b2 = (B) b1;
			System.out.peirntln(b2.j);
			b2.test2();
		}
}
/*/while (going to downcathing to the should appoly instanceof
always try to avoid upcating if there is no upcasting then downcasting is working
upcasting is madaturiy to achive polymorphism
*/