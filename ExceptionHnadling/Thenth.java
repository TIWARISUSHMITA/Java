//ClassCastException
class Thenth
{
    public static void main(String[] args)
    {/*
        String s = new String("Rahul");
        Object obj= (Object) s;
        System.out.println(s);
        System.out.println(obj);
        */
        Object obj=new Object();
        String s= (String )obj;
         System.out.println(s);
        System.out.println(obj);
    }
}
/*
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
        at Thenth.main(Thenth.java:11)
*/