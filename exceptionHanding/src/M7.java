class M7 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0; //getting exception
			System.out.println("try end");
		}
		catch (ArithmeticException ex) // ex is object of try block
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
/*
main begin
try begin
from catch
main end

try and catch is using to handle the exception
if there is try and catch then only line no 5 is excute then occuring the exception
immediatly after try we have to catch
cath should take one argument
then argument should be throwable type
in the catch body also we can incorperate any no of stmt any type stmt in the catch body

*/