class  Z5
{
	enum E {CON1 , CON2 , CON3 , CON4}
	public static void main(String[] args) 
	{
		E e1 = E.CON1;
		switch (e1)
		{
		case 0:
			System.out.println("from case CON1");
			break;

		case CON2:
			System.out.println("from case CON2");
			break;
		case CON3:
			System.out.println("from case CON3");
			break ; 

		case CON4:
			System.out.println("from case CON4");
			break ; 
			}
		System.out.println("end");
	}
}

/*
Z5.java:9: error: an enum switch case label must be the unqualified name of an enumeration constant
                case 0:
                     ^
1 error
*/
