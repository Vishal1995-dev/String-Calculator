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
			return Integer.parseInt(data[0])+Integer.parseInt(data[1]);
		}
		else
		{
			return Integer.parseInt(str);
		}	
	}
}
