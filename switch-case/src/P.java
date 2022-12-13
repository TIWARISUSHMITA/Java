class  P
{
	public static void main(String[] args) 
	{
		int i =100;
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
		
		default :
			System.out.println("from dafault");
			System.out.println("from dafault");
			System.out.println("from dafault");
			System.out.println("from dafault");

		}
		System.out.println("end");
	}
}

/*
from case 100
from dafault
from dafault
from dafault
from dafault
end
*/
//without break it excute all the stmt like default also