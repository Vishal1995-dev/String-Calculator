package Calculator;

public class Calculator {
	public static int Add(String str)
	{
		if(str.isEmpty()) {
			return 0;
		}
		else if(str.contains(","))
		{
			String[] data=str.split(",");
			int ret=0;
			for(String i:data)
			{
				ret+=Integer.parseInt(i);
			}
			return ret;
		}
		else
		{
			return Integer.parseInt(str);
		}	
	}
}
