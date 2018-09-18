import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.nio.file.*; 
import java.io.*; 

public class assign3{  
    public static void main(String args[]) throws IOException 
	{
		final String regx = "(0x|0X)[0-9|a-f|A-F]*.?[0-9|a-f|A-F]*[p|P][+|-]?[0-9]*[f|F|l|L]?$";
		final Pattern pattern = Pattern.compile(regx);
		String filename = args[0];
		FileInputStream fis = new FileInputStream(filename);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
		List<String> data = new ArrayList<String>();
		String line = null;
		while((line = bfr.readLine()) != null)
			data.add(line);
		bfr.close();
		for(int i = 0; i < data.size(); i++)
		{
			String str = data.get(i);
			Matcher validator = pattern.matcher(str);
			if (validator.find())
				System.out.println("Matched:: " + data.get(i));
			else
				System.out.println("Not Matched:: " + data.get(i));
		} 	
	}
} 