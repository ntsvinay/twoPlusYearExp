class ConverterUtil
{
    String digits="-12345";
    Integer convertvalue;
    int value;
    public void signature()
    {
     convertvalue=Integer.valueOf(digits);
     System.out.println(convertvalue);
     value=Integer.parseInt(convertvalue.toString());
     System.out.println(value);
     
    }
    public static void main(String arg[])
    {
    new ConverterUtil().signature();	
    }
}

class B extends ConverterUtil
{
    public void signature()
    {
    	
    }
}
    