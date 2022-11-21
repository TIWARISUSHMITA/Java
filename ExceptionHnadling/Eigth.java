//NumberFormatException
class Eigth
{
    public static void main(String[] args)
    {
        int i = Integer.parseInt("ProStack");
      //  int i=Integer.parseInt("100");// int i=Integer.parseInt(100); getting error(can not converted int to String)
        System.out.println(i);
    }
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "ProStack"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Eigth.main(Eigth.java:5)
        */