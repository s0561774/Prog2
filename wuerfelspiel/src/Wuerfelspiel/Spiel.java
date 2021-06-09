package Wuerfelspiel;

import java.util.Random;
import javax.swing.JOptionPane;

public class Spiel {
	
	public static int maxPunkte;
	public String[] name;
	public Random zufallZahl;
	public int[] sumPunkte;
	public int anzahl;
	public String eingabe = "";
	boolean ctrl = false;
	
	public void parameterEingaben() {
		while(!ctrl)
		{
			try
			{
				eingabe = JOptionPane.showInputDialog("Anzahl Spieler :");
				
				anzahl = Integer.parseInt(eingabe);
				
                eingabe = JOptionPane.showInputDialog("max punkte eingeben :");
				
				maxPunkte = Integer.parseInt(eingabe);				
				
				ctrl = true;
			}
			catch(NumberFormatException e)
			{
				ctrl = false;
			}
			
	
			for(int i=0; i<anzahl; i++)
			{
				name[i] = JOptionPane.showInputDialog("Name des Spielers " + (i+1)+" :");
			
			}
			
		}
		
	}
	
	public void spielen() {
		
		ctrl = false;
		for(int z=0; z<anzahl; z++)
		{
			while(!ctrl) {
				
				sumPunkte[z] = zufallZahl.nextInt(6) + 1;
				if(sumPunkte[z] ==6)
				{
					sumPunkte[z] = 0;
					System.out.printf("Versuch zu Ende %n Aktueller Spielstand von %s : %d Punkte %n Der naechste Spieler ist dran%n", name[z], sumPunkte[z]);
					ctrl = true;
				}
				else {
					System.out.printf("Versuch zu Ende %n Aktueller Spielstand von %s : %d Punkte %n Der naechste Spieler ist dran%n", name[z], sumPunkte[z]);
				}
				
			}
		
		}
	}
	
	
	//public static void main(String[] args)
	
	
		
	}


		