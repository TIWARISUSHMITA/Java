class  Z7
{
	static int i = test1(); //40
	static int j = test1() + test2();  //  

	 static 
	{
		System.out.println("SIB1:" +i + "," +j);
		i +=1; //i = i+1;
		j += 2; //j=j + 2;
	}
	
	 public static int test1()
	{
		System.out.println("test1:" +i + "," +j); //40,18
		i += 3;  //i = i+3; //3 //43
		j += 4;  //j = j+4; //4  //22
		return i + j + test2();  //7+33 //65 +91=156
	}
	public static int test2()  
	{
		System.out.println("test 2@A:" +i + ", " +j); //3,4  //43,22
		i += 5;  //i = i+5; //8  //48
		j += 6;  //j = j+6; //10  //28
		main(null);
		System.out.println("test 2@B:" +i + ", " +j); //15,18  //55,36
		return i + j; //33 //91

	}
	public static void main(String[] args)
	{
	System.out.println("main:" +i + "," +j); //8,10  //48,28
	i +=7; //i = i+7; //15  //55
	i +=8 ;  //j = j+8 //18  //36
	}

}
/*



*/