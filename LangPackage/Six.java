class Six
{
    public static void main(String[] args)
    {
        StringBuffer s1="Rahul";//we can't implement without New In StringBuffer 
        s1.append("Gandhi");
        System.out.println(s1);

    }
}
/*
Six.java:5: error: incompatible types: String cannot be converted to StringBuffer
        StringBuffer s1="Rahul";
                        ^
1 error

*/