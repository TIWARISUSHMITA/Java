class I
{
	public static void main(String[] args) 
	{
		
	int i = true ? (true ? 1 :2) :( true ? 3 : 4);
	   //    true   (1)
		System.out.println(i);  //1
	int j= false ? (true ? 1 :2) :( true ? 3 : 4);
	 //       false                     4
	 	System.out.println(j);   //4
	int k = true ? (false ? 1 :2) :( true ? 3 : 4);
	  //   true                        3
	System.out.println(k);  //3
	int l = false ? (true ? 1 :2) :( false ? 3 : 4);
	  //   false                           4
	System.out.println(l);  //4
	}
}
