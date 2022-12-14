class  M2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = null; //no variable is calling getting exceptio
		s1.length();
		System.out.println("main end");
	}
}
/*
main begin
Exception in thread "main" java.lang.NullPointerException
									---------------------//exception type
        at M2.main(M2.java:7)
from a null reference we should not call any variable (line no 6)
getting NullPointerException becouse of String

*/ 

/*
 but if in place of keeping abc then its runnable
public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = "abc"; //no variable is calling getting exceptio
		s1.length();
		System.out.println("main end");
	}
main begin
main end
*/