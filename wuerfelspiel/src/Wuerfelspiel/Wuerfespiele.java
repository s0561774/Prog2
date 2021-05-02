package Wuerfelspiel;

import java.awt.List;
import java.util.ArrayList;

public class Wuerfespiele {
	
private final ArrayList<Spieler> mSpielerliste;
	
	public Wuerfespiele(){
		this.mSpielerliste = new ArrayList<Spieler>();
	}
	
	public void spielerHinzufügen(Spieler neuerSpieler){
		this.mSpielerliste.add(neuerSpieler);
	}

}


