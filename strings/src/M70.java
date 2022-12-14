class M70 
{
	public static void main(String[] args) 
	{
		int i = 10;
		double j = 1.5;
		System.out.printf("j value is %2$f and j vvalue is %1$d" , i,j);
	}
}
/*
j value is 1.500000 and j vvalue is 10

if we are supplying %1$d means it tkes first address which is int type
in second term if we are supplying %2$f means it takes 2nd address which is double type 
*/