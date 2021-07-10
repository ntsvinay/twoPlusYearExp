import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Vote {
	
	public static void getResult(String voteResult)
	{	
		String[] str=voteResult.split(",");
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<=str.length-1;i++)
		{
			String val[]=str[i].split(":");
			if(hm.containsKey(val[0]))
			{
				int voter=hm.get(val[0]);
				hm.put(val[0], ++voter);
			}
			else
			{
				hm.put(val[0], 1);
			}
		
		}
		
			int vote=Collections.max((hm.values()));
			for (Entry<String, Integer> entry : hm.entrySet()) {  
	            if (entry.getValue()==vote) {
	            	System.out.println("Winner--"+entry.getKey());
	            }
	            
		}
			for (Entry<String, Integer> entry : hm.entrySet()) {  
	            if (entry.getValue()==vote-1) {
	            	System.out.println("Runner Up--"+entry.getKey());
	            	break;
	            }
	            
		}
		
		
			int vote1=Collections.min((hm.values()));
			for (Entry<String, Integer> entry : hm.entrySet()) {  
	            if (entry.getValue()==vote1) {
	               System.out.println("least voter--"+entry.getKey());
	            }
		}
		
		
		
	
	}
	public static void main(String[] args) {
		String input = "modi:1,amit:2,rahul:3,amit:4,modi:5,modi:6,xyz:7,modi:8,amit:9,rahul:10";
		getResult(input);
	}

}
