class  Z11
{
	public static void main(String[] args) 
	{
		int i = 100;
		final int j = 100;
		switch (i)
		{
		case j:
			System.out.println("from case test");
			break;

		case 120:
			System.out.println("from case hello");
			break;
		}
		System.out.println("end");
	}
}


/*
int j becouse it declare it into final variable 
final varible can not be modify
from case test
end
final variable only value  in this code  the compiler only 
*/