
public class FizzBizz {
	public static void main(String arg[])
	{
		
		for(int i=0;i<=10;i++)
		{
			if(i%15==0)
			{
				System.out.println("FizzBizz"+i);
			}
			else if(i%3==0)
			{
				System.out.println("Fizz"+i);
			}
			else if(i%5==0)
			{
				System.out.println("Bizz"+i);
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
