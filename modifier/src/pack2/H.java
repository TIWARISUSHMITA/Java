package pack2;
import pack1.A;
class  H extends A
{
	public static void main(String[] args) 
	{
		A obj = new A();
	//	obj.w = 10;
     	//obj.x = 10;
		obj.y = 10;
		obj.z = 10;
		System.out.println("done");
	}
}
/*


we can not access w,x,y is not runnable becouse they are private ,defoult ,protected which is allow only one package not to another

*/