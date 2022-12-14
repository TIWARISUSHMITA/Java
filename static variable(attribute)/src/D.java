class D
{
	static int i =  10;
	static int j = i; //direct read but its runnable becouse it notified the compiler in kine no 3
	public static void main (String[] args)
	{
		System.out.println(i+","+j);
	}
}
/*
line no 3 is addering or notified the compiler 
then it is using directly i value in line no 4

10,10
*/