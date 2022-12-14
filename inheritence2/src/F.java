class E 
{
	E(int i)
	{
		System.out.println("E(int)");
	}
}
class F extends E
{
	F(int i)
	{
		super(90);
		System.out.println("F(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		System.out.println("main begin!");
	}
}

/*
here class F have arugent 
it prviding super(with argument)
here stack overflow but the program is reu and the output is main begin 
main begin 
becouse in the main method we are not calling any method or contructeo


main begin!
main begin!*/
