import java.util.Scanner;
class  M69
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Scanner sc = new Scanner(System.io);
		System.out.println("enter your age");
		int age = sc.nextInt;
		if (age <=0)
		{
			System.out.println("plz enter age > 0");
			throw new ArithmeticException("plz enrer age > 0");
		}
		//continue...
		System.out.println("main end");
	}
}
/*

*/

