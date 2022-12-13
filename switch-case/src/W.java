class  W
{
	public static void main(String[] args) 
	{
		byte i =100;
		switch (i)
		{
		case 20 :
			System.out.println("from case 20");
			break;

		case 80:
			System.out.println("from case 50");
			break;
		case 100:
			System.out.println("from case 100");
			break ; 
		case 130:
			System.out.println("from case 130");
			break ; 
			}
		System.out.println("end");
	}
}
/*
W.java:18: error: incompatible types: possible lossy conversion from int to byte
                case 130:
                     ^
1 error
*/
//becouse byte min range is  -127 &max value is 128