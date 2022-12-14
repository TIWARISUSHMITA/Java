class  M
{
	 static int count;  
	

	M()
	{
	
	 
	 
	 }

	 M(int i)
	 {
	 
	 }

	M(int i , int j)

	{
	
	}

	{
	
		count ++ ;
	}
	public static void main(String[] args) 
	{
		M obj1 = new M();
		M obj2 = new M();
		M obj3 = new M(20);
		M obj4 = new M(120);
		M obj5 = new M(20 ,0);
		M obj6 = new M(2 ,20);
		System.out.println(M.count );
	}
}
/*
6
constructor got over loaded very properly
three time constructor over loading
and there is 6 objects
here 6 is ouptput becouse the first step is obj is excuting then it excute all the constructor and in last add 1 by the count ++
then the secomnd step isagin it excute then in last when it is going to the count ++ then it incremented and becouming 2 ......in last it find 6


two costructor should not have a same sinature


*/
