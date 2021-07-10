package test;

public class VrblLngthArgumnt {
	
	public void show(int ...a)
	{
		for(int y:a)
		{
			System.out.println(y);
		}
		
	}
	public static void main(String ...arg)
	{
		new VrblLngthArgumnt().show(10,10,10,20);
		for(String ar:arg)
		{
			System.out.println(ar);
		}
	}

}
