//ArrayIndexOutOfBoundsException
class Six
{
    public static void main(String[] args)
    {
        int[] i = {10,20,30,40,50};
        System.out.println(i[12]);
    }
}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 12
        at Six.main(Six.java:6)
*/
/*
class Six{
    public static void main(String[] args)
    {
        int[] i = {10,20,30,40,50};
            System.out.println(i[3]);
    }
}
*/