package vorlesung;

import javax.swing.JOptionPane;

public class Ausnahmen {
	
	public static int division(int nr1, int nr2)
	{
		//if(nr2 == 0) return -1;
		return nr1/nr2;
	}
	
	public static int getValueIndex(int[] arr, int index)
	{
		//if(index<0 || index>arr.length-1)
		//{
		//return -1;
	//}
		return arr[index];
		
	}
	
	public static char charAt(String s, int index)
	{
		return s.charAt(index);
	}

	public static void main(String[] args) {
		int nr1 = 4;
		int nr2 = 0;
		try {
			int result = division(nr1,nr2);
			System.out.printf("%2d  /%2d = %2d %n", nr1, nr2, result);

	}
		
		
		catch(RuntimeException e)
		{
			System.out.println("Division durch 0 nicht definiert");
			
		}
		
		int[] arr = {1,2,3,4};
		try {
			int value = getValueIndex(arr, 4);
			System.out.println(value);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Division durch 0 nicht definiert");
			
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("keine Index des Arrays");
		}
		
		String s = "Hello!";
		
		try {
		char c = charAt(s, 6);
		System.out.print(c);
	}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("kein Index des String");
			
		}
		
		boolean eingabeOk = false;
		int zahl = 0;
		while(!eingabeOk)
		{
			String eingabe = JOptionPane.showInputDialog("Geben sie eine Zahl eine: ");
			try {
				zahl = Integer.valueOf(eingabe);
				eingabeOk = true;
			//System.out.println(zahl);
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("der einegabe war keine Zahl!");
				
		}
			
	}
		System.out.println(zahl);
	}

}
