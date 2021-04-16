package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
				int ret=getSum(data);
				return ret;
				
			}
			else
			{
				String[] data=str.split(",|\n");
				int ret=getSum(data);
				return ret;
			}
		}	
	}
	private static int getSum(String[] data)
	{
		List<String> l = new ArrayList<String>();
		int ret=0;
		for(String i:data)
		{
			int int_i=Integer.parseInt(i);
			if(int_i<0)
			{
				l.add(i);
			}
			ret+=int_i;
		}
		if(l.size()>0)
		{
			throw new RuntimeException("negatives not allowed: "+ String.join(",",l));
		}
		return ret;
	}
}

