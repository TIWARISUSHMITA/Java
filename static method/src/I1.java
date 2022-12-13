class  I1
{
	public static int main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		System.out.println("main end");
		return 100; //return stmt with a value is not allow

	}
}

/*
Error: Main method must return a value of type void in class I1, please
define the main method as:
   public static void main(String[] args)


   in main method void is must without this is is getting cmpilation error
   */