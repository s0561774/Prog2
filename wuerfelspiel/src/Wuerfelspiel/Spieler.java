package Wuerfelspiel;

import java.util.Random;

import javax.swing.JOptionPane;

public class Spieler {
	
	private int anzahlWuerfe;
	private int punkteStand;
	
	
	public static void Spielstart() {
		
	}
	public static void Anzahlspeiler() {
		
		String name = null;
		boolean eingabeOk = false;
		int anzahl = 0;
		int anzahlspieler = 0;
		int wurf = 6;
		boolean input = false;
		
		
		
		int start = JOptionPane.showConfirmDialog(null,"Wollen sie Spiel starten?"); 
		if (start != 1 & start !=2 ) {
			System.out.println("" + eingabeOk);
		
		
		while(!eingabeOk)
		{
			String eingabe = JOptionPane.showInputDialog("Geben sie die anzahl von Spieler: ");
			try {
				anzahl = Integer.valueOf(eingabe);
				eingabeOk = true;
			//System.out.println(zahl);
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("der einegabe war keine Zahl!");
				
		
			}

			System.out.println(anzahl);	
		}
		
		for (int i= 0; i< anzahl; i++) {
			name=JOptionPane.showInputDialog("Geben sie Ihr name ein");
			System.out.println(name + "spieler");
			
			
			while(wurf < 6)
			{
				String punkte = JOptionPane.showInputDialog(name, " kannst du jetzt spilen");
				try {
					anzahlspieler = Integer.valueOf(punkte);
					eingabeOk = true;
				//System.out.println(zahl);
				}
				
				catch(NumberFormatException e)
				{
					System.out.println("der einegabe war keine Zahl!");
				}
				}	
			
			System.out.println(wurf);
		}
	
		}

		for(int i=0; i<anzahl; i++) {
	
		Random wuerfel = new Random();
        int anzahlpunkte =1 + wuerfel.nextInt(6);
        System.out.printf(name, " " +anzahlpunkte);
        
       
        	
        	System.out.println();
        	
        	 if(anzahlpunkte < 6) {
        		 name=JOptionPane.showInputDialog("wollen sie nochmalspielen? ");
        		 if(wurf == 0) {
        			 anzahlpunkte ++; 
        		 }
        		 
        		 else if(wurf == 6) {
        			 System.out.println(name + "Hat verloren");
        			 if(wurf == 20) {
        				 
        			 }
        		 }
        		System.out.println(name + "hat gewonnen");
        	 }
        }
		
		
		}
	

	
}
	
	
	

	
	
	
	
	