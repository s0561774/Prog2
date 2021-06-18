package aufgabe2;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MyInteger {

	
		public static final int MAX_VALUE = 214783647;
		public static final int MIN_VALUE = -214783647 ;
		
		private static int value;
		static Integer MyInteger;
		
		MyInteger(int value){
			this.value = value;
			
		}
		MyInteger(String s)throws IllegalArgumentException {
			this.parseInt(s);
			
		}

		 public static int parseInt(String s) throws IllegalArgumentException 
		 {
			 String c = "abcdefghijklmnopqrstuvwxyz";
			 boolean nmber = false;
			 Scanner scan = new Scanner(System.in);
			 s = scan.nextLine();
			 char b= 0;
			 int ascii = b ;
			 int asciivalue = ascii -48 ;
			// int num = Integer.parseInt(s);
			 
			 if(s.length() ==0) throw new IllegalArgumentException("Leer");
			 if(s.charAt(0) == '+') s = s.substring(1);
			 if(s.charAt(0) == '-') {
				 
				 s = s.substring(1);
				 nmber = true;
			 }
			 	
			switch (s) 
				{ 
					case "1" :
						System.out.println("1"); break;
					case "2":
						System.out.println("2"); break;
					case "3":
						System.out.println("3"); break;
					case "4":
						System.out.println("4"); break;
					case "5":
						System.out.println("4"); break;
					case "6":
						System.out.println("6"); break;
					case "7":
						System.out.println("7"); break;
					case "8":
						System.out.println("8"); break;
					case "9":
						System.out.println("9"); break;
					case "10":
						System.out.println("10"); break;
					case "-1" :
						System.out.println("-1"); break;
					case "-2":
						System.out.println("-2"); break;
					case "-3":
						System.out.println("-3"); break;
					case "-4":
						System.out.println("-4"); break;
					case "-5":
						System.out.println("-5"); break;
					case "-6":
						System.out.println("-6"); break;
					case "-7":
						System.out.println("-7"); break;
					case "-8":
						System.out.println("-8"); break;
					case "-9":
						System.out.println("-9"); break;
					case "-10":
						System.out.println("-10"); break;
						
					default:
						for(int i = 1; i< c.length(); i++) {
							 if((s.charAt(0) == 'a') || (s.charAt(0) == 'b') || s.charAt(0) == 'c' || s.charAt(0) == 'd' || 
									 (s.charAt(0) == 'e') || (s.charAt(0) == 'f') || s.charAt(0) == 'j' || s.charAt(0) == 'h') 
								 throw new IllegalArgumentException("Geben sie eine Richtige zahl");
							try {
							if(c.charAt(0) == s.length()) {
							System.out.println(s);
							}
							}
							
							catch(IllegalArgumentException e)
							{
								System.out.println("Die war keine Zahl ");
							}

								 
					 }
				}
						
		return  Integer.parseInt(s);
		
		 }
	
		        
	
		
		 
		 
		public int intValue() {
			
			return this.value;
			
		}
		
		public double doubleValue() {
			
			return value;
			
		}
		
		public static MyInteger valueOf(String s)throws IllegalArgumentException  {
			
		return new MyInteger(s);
	
		}
		
		public static void valueOf(int value) {
			
		}

		public static void main(String[]args) {
			
			
							parseInt("4");
							
							
							MyInteger obj1 = null, obj2 = null, obj3 = null,
									obj4 = null, obj5 = null, obj6 = null, obj7 = null;
				
				try {
					obj1 = new MyInteger ("214783647");
					System.out.println(obj1.intValue());
				}
				
				catch (IllegalArgumentException e) {
								e.printStackTrace();
					System.out.println("" + e);
				}
				
				try {
					obj2 = new MyInteger ("-214783647");
					System.out.println(obj1.intValue());
				}
				
				catch (IllegalArgumentException e) {
								e.printStackTrace();
					System.out.println("" + e);
				}
				
				try {
					obj3 = new MyInteger ("214783647");
					System.out.println(obj1.intValue());
				}
				
				catch (IllegalArgumentException e) {
								e.printStackTrace();
					System.out.println("" + e);
				}
				
				try {
					obj4 = new MyInteger ("214783647");
					System.out.println(obj1.intValue());
				}
				
				catch (IllegalArgumentException e) {
								e.printStackTrace();
					System.out.println("" + e);
				}
				try {
					obj5 = new MyInteger ("214783647");
					System.out.println(obj1.intValue());
				}
				
				catch (IllegalArgumentException e) {
								e.printStackTrace();
					System.out.println("" + e);
				}
				
				try {
					obj6 = new MyInteger ("214783647");
					System.out.println(obj1.intValue());
				}
				
				catch (IllegalArgumentException e) {
								e.printStackTrace();
					System.out.println("" + e);
				}
				try {
					obj7 = new MyInteger ("214783647");
					System.out.println(obj1.intValue());
				}
				
				catch (IllegalArgumentException e) {
								e.printStackTrace();
					System.out.println("" + e);
				}
				
				for(int i= 0; i< Integer.numberOfTrailingZeros(1); i++)
				{	
					
				}
				
				try {
					obj3 = new MyInteger("hallo");
					System.out.println(obj3.intValue());
				}
				catch(IllegalArgumentException e)
				{
					System.out.println(e.getMessage());
				}
				obj4 = new MyInteger(-2147483648);
				
				System.out.println("obj1 equals obj2 ? : " + obj1.equals(obj2));
				System.out.println("hashCode obj1 : " + obj1.hashCode());
				
				try {
					System.out.println("intValue obj3 : " + obj1.intValue());
				}
				catch(Exception e)
				{
					System.out.println("Objekt existiert nicht!");
				}
				
				System.out.println("doubleValue obj1 : " + obj1.doubleValue());
				System.out.println("doubleValue obj2 : " + obj2.doubleValue());
				try {
					System.out.println("doubleValue obj3 : " + obj3.doubleValue());
				}
				catch(Exception e)
				{
					System.out.println("Objekt existiert nicht in !");
				}

		}
	
		}





