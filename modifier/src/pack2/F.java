package pack2;
class F 
{
	public static void main(String[] args) 
	{
		pack1.A obj = new pack1.A();
		//obj.w = 10;  
		//obj.x = 10; 
	//	obj.y = 10; 
		obj.z = 10;
		System.out.println("done");
	}
}
/*

done
it is runnable bacouse we are adding pack1 also
here line no 7,8,9 is not commented so the current class will getting error
becouse in line no 7 it belongs to private which is working only in the currnt class and also packege
line no 8 is also if it will be commneted so it will getting error bacouse it is dafault which is working in the same package many classesz but pack is same
line no 9 is also if it will getting error if it is non commented becouse it is protected and protected id also working under the same package while class is same or another
and public is any where like any class and any package


*/