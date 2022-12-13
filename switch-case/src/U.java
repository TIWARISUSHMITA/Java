class  U
{
	public static void main(String[] args) 
	{
		int i =120;
		switch (i)
		{
		case 20 :
			System.out.println("from case 20");
			break;
		default :
			System.out.println("from dafault");
			System.out.println("from dafault");
			break;

		case 80:
			System.out.println("from case 50");
			break;
		case 100:
			System.out.println("from case 100");
			break ; 
		default :
			System.out.println("from other dafault");
			System.out.println("from other dafault");
		}
		System.out.println("end");
	}
}
/*
U.java:22: error: duplicate default label
                default :
                ^
1 error
*/
// in one switch program maximam one default allow
