//error
class Five
{
    public static void main(String[] args)
    {
        StringBuffer s1= new StringBuffer("Rahul");
        s1=s1.concat("Rahul");//concat() is not for StringBuffer
        System.out.println(s1);
    }
}