class  M6
{
	public static void main(String[] args) 
	{
		String i = "t";
		Character obj1 = new Character(i);
		Character obj2 =Character.valueOf(i);
		System.out.println("boxing done");
	}
}
/*
compilation error
String can not convert int Character
charcter built in operation doesn't have String operation
in every wrapper class we use constructor
String content we are taking as wrapper object
we can not achive any type of () to using static
java is not 100% object oriented becouse of static and primitive
but is having every features of object oriented



boxing done
*/