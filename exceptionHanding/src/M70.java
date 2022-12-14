import java.util.Scanner;
class  M70
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt;
		if (age <=0)
		{
			System.out.println("plz enter age > 8");
			throw new AgeIsNegativeException("age should be possitive value");
		}
		//continue...
		System.out.println("main end");
	}
}
/*

*/

