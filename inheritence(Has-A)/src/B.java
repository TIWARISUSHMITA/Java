class  A
{
	static int i ; //static variable
}
class B
{
	public static void main(String[] args) 
	{ 
		//System.out.println(i); //it giving compile time error
		System.out.println(A.i);
	}
}
/*
we should refer A.i  for compiling succesfull
the ouptput is 0 becouse of static variable which is in line no 3

*/