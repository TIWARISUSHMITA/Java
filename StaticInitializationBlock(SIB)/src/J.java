class J 
{
	public static void main(String[] args) 
	{
		J obj1 = new J();
		J obj2 = obj1;
		J obj3 = obj1;
		J obj4 = obj3;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}
}
/*
in line no 6 a new object is created
line no 5 right side object created
same object can have any no of refrence variable
in this only one object created but meny no of reference varible

J@15db9742
J@15db9742
J@15db9742
J@15db9742


*/
