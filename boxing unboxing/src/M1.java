class  M1
{
	public static void main(String[] args) 
	{
		int i = 10;  //primitive variable
		Integer obj1 = new Integer(i); //Integer is class
		Integer obj2 = Integer.valueOf(i);
		System.out.println("boxing done");
	}
}





/*
primitive datat type				wrapper classes
-----------------					---------------
byte									Byte
short									Short
int										Integer
long									Long
float									Float
double									Double
char									Character
boolean									Boolean


<= for every data type ther eis a wrapper class
2. java.lang
3. final
4. comparable
5. serialization
6. toString()
7. hashcode()   and    equals()
8. usege
-------
1. boxing (wrapping) purpose -> string primitive to an object or wrapper classes
2. unboxing(unwrapper) taking out the primitive value from the  object 
3. (converting)primitive to String
4. String to primitive (except char)
   char won't support to converting String 





are this wrapper classes avilable in java.lang package
if  any member is use in java.lang package we can use it without import
string and system class  is also avilable in java.lang package we can use this without import
every wrapper class is a final class
we can not develop to sub class becouse in final class we can develop  final class
every class is type of comparable
comparable is interfaces
every wrapper class is comparable interface
it is mostly part of collection class
primitive data type is comparable to its wrapper classes
similar kind of wrapper object can be compare by sorting
we can compare one wrapper object to another object
every wrapper class is  sub class to serializable class
every wrapper class implemented seralizable  
serializable is serialization it can file system or 
in every wrapper class object class toString()  method got overridded
hashcode() and equals() is object class is also fot overridded
becouse of this duplicates are identified based on the content
we can easly identified which content is same
 toString ias used for printing the content of the (s o pln)
 these methods are allready got overridded
*/