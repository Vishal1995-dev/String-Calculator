package Calculator;

public class Calculator {
	public static int Add(String str)
	{
		if(str.isEmpty()) {
			return 0;
		}
		else
		{
			if(str.startsWith("//"))
			{
				Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
				m.matches();
				String delimiter = m.group(1);
				String numbers = m.group(2);
				String[] data=numbers.split(delimiter);
				int ret=0;
				for(String i:data)
				{
					ret+=Integer.parseInt(i);
				}
				return ret;
				
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
}
