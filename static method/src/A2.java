class A2 
{
	public static void main(String[] args) 
	{
		int a = 11;
		int b = 12;
		double c = 12.1;
		double d = 12.5;

		int  result1 = minFunction(a,b);
		double  result2 = minFunction(c,d);
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);
	}
	public static int minFunction(int n1 ,int n2)
	{
		int min;
		if (n1 > n2)
		{
			min = n2;
		}
		else
		{
			min = n1;
		}
	
	return min;
	}
	public static double minFunction(double n1, double n2)
	{
		double min;
		if (n1 > n2)
		{
			min = n2;
		}
		else
		{
			min = n1;
		}

		return min;
	}
	}
/*
result1 :11
result2 :12.1
*/