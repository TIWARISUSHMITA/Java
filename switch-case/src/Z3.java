class  Z3
{
	public static void main(String[] args) 
	{
		char i='a';
		switch (i)
		{
		case 66000 :
			System.out.println("from case 66000");
			break;

		case 'p':
			System.out.println("from case p");
			break;
		case 's':
			System.out.println("from case s");
			break ; 

			}
		System.out.println("end");
	}
}

/*
here 97 is the ASCII code of a
Z3.java:8: error: incompatible types: possible lossy conversion from int to char
                case 66000 :
                     ^
1 error
*/