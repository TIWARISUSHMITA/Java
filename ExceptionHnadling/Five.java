//NullPointerException
class Five{
    public static void main(String[] args)
    {
        String s = null;// in case if null will be under the semicolon that it won't show error and output will be 4 only
        System.out.println(s.length());
    }
}
/*
Exception in thread "main" java.lang.NullPointerException
        at Five.main(Five.java:5)
        */
/*
class Five
{
    public static void main(String[] args){
        String s = "Hello World";
        System.out.println(s.length());//11
    }

}
*/