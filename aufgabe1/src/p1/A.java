package p1;

public class A {
	
	enum Weekly {MO , DI , MI, DO, FR, SA, SO};
	public static void printDay( Weekly day)
	{
		switch(day)
		{
		case MO: System.out.println("Montag"); break;
		case DI: System.out.println("Dienstag"); break;
		case MI: System.out.println("Mittwoch"); break;
		case DO: System.out.println("Donnestag"); break;
		case FR: System.out.println("Freitag"); break;
		case SA: System.out.println("Samstag"); break;
		case SO: System.out.println("Sonntag"); break;
		default : System.out.println("Kein Day"); break;
		}
	}
	
	public static void printDay(int day)
	{
		switch(day)
		{
		case 0: System.out.println("Montag"); break;
		case 1: System.out.println("Dienstag"); break;
		case 2: System.out.println("Mittwoch"); break;
		case 3: System.out.println("Donnestag"); break;
		case 4: System.out.println("Freitag"); break;
		case 5: System.out.println("Samstag"); break;
		case 6: System.out.println("Sonntag"); break;
		default: System.out.println("Kein Day");
		}
	}
	public static void main(String[] args) {
		
		String mdArray[][] = new String[3][5];
		
		for(int i=0; i<mdArray.length; i++)
		{
			for(int j=0; j<mdArray[i].length; j++)
			{
				mdArray[i][j]= "(" + i + ", " + j+")";
			}
		}
		
		for(int i=0; i<mdArray.length; i++)
		{
			for(int j=0; j<mdArray[i].length; j++)
			{
				System.out.print(mdArray[i][j] + " ");
			}
			
			System.out.println();
		}
		
		printDay(0);
	
		printDay(Weekly.MO);
	}
	
}
