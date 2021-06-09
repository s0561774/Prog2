package aufgabe3;

public class Solitaire {
	
	
	
	public String convert(String time) 
	{
		final int LAST_THREE_CHARS = 3; 
		if(time.endsWith("am"))
		{
		return time.substring(0,(time.length()-LAST_THREE_CHARS));
	}
		else //ends with pm
		{
			//String hourStr = time.substring(0,1);
			int hourInt = this.getHoursInt(time);
			hourInt += 12;
			String ohnepm = time.substring(0,(time.length()-LAST_THREE_CHARS));
			String rest = ohnepm.substring(1);
			
			
			String zeit = hourInt + rest;
			
			return zeit;
			
		}
	}
	
	String getHoursStr(String time) {
		
		String [] allStr = time.split(":");
		return allStr[0];
	}
	
	int getHoursInt(String time)
	{
		String hoursStr = this.getHoursStr(time);
		int hoursInt = Integer.valueOf(hoursStr);
		return hoursInt;
		
	}
	

}
