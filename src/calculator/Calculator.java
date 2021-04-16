package Calculator;

public class Calculator {
	public static int Add(String str)
	{
		if(str.isEmpty()) {
			return 0;
		}
		else
		{
			String[] data=str.split(",|\n");
			int ret=0;
			for(String i:data)
			{
				ret+=Integer.parseInt(i);
			}
			return ret;
		}	
	}
}
