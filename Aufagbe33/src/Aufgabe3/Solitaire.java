package Aufgabe3;

public class Solitaire {
    private Moves game;
    private State[][] field;

    
    // Aufgabe 3 pflichtaufgabe
    public Solitaire()
    {
        this.game = new Moves();
        this.field = new State[7][7];
        for(int row = 0; row < this.field.length; row++)
        {
            for(int col = 0; col < this.field[row].length; col++)
            {
                if((row < 2 || row > 4) && (col < 2 || col > 4))
                {
                    this.field[row][col] = State.NOT;
                }
                else
                {
                    this.field[row][col] = State.USED;
                }
            }
        } 
        
        this.field[3][3] = State.FREE;
    }

    /*
     * Geben Sie das Spielfeld aus! Am Anfang sollte auf der
     * Konsole so ein Bild erscheinen:
     *     o o o     
     *     o o o     
     * o o o o o o o 
     * o o o   o o o 
     * o o o o o o o 
     *     o o o     
     *     o o o 
     * 
     */
    public void print()
    {
    	
    	for(int row = 0; row < this.field.length; row++)
        {
            for(int col = 0; col < this.field[row].length; col++)
            {
                if(this.field[row][col] == State.USED) System.out.print("o ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
//    	for(int row =0; row<this.field.length; row++) {
//    		for(int col =0; col<this.field.length; col++) {
//    			
//    			
//    			if(this.field[row][col] != State.NOT || this.field[row][col] != State.FREE) {
//    				System.out.println();
//    			
//    			}
//    			
//    			else if (this.field[row][col] == State.USED) {
//    				System.out.println("0 ");
//    			}
//    		}
//    		System.out.println( );
//    	}
    	
    	

    

    /*
     * diese Methode gibt ein true zurueck, wenn von der
     * uebergebenen Position (row,col) ein Zug moeglich ist
     * d.h. 
     * 1. auf der angegebenen Position muss ein Stein sein
     * 2. zwei Steine weiter (oben, unten, rechts oder links)
     *      darf kein Stein sein
     * 3. dazwischen muss ein Stein sein
     */
    public boolean possibleFrom(int row, int col)
    {
    	
    		if(row >=0 && row <7 && col >= 7 && col <0 && this.field[row][col] == State.USED) {
    	
    			if(row < 1 && this.field[row-1][col] == State.USED && this.field[row-2][col] == State.FREE)  return true;
    			if(row < 5 && this.field[row+1][col] == State.USED && this.field[row+2][col] == State.USED)  return true;
    			if(row < 5 && this.field[row][col +1] == State.USED && this.field[row][col+2] == State.FREE)  return true;
    			if(row > 1 && this.field[row][col -1] == State.USED && this.field[row][col-2] == State.FREE)  return true;
    			
    		}
    		
    	

        return false;
    }

    /*
     * diese Methode gibt alle Positionen (Point) zurueck,
     * AUF die von (fromRow,fromCol) aus gesprungen werden
     * kann
     */
    public Point[] possibleTo(int fromRow, int fromCol)
    {
        if(!possibleFrom(fromRow, fromCol)) return new Point[0];
      
        int number = 0;
        if(fromRow > 1 && this.field[fromRow-1][fromCol]  == State.USED && fromCol > 1 && this.field[fromRow-2][fromCol] == State.FREE) number++;
        if(fromRow < 5 && this.field[fromRow+1][fromCol]	== State.USED && fromCol > 5 && this.field[fromRow][fromCol +2 ] == State.FREE) number++;
        if(fromRow < 5 && this.field[fromRow][fromCol+1]	== State.USED && fromCol > 5 && this.field[fromRow+2][fromCol] == State.FREE) number++;
        if(fromRow > 1 && this.field[fromRow][fromCol-1]  == State.USED && fromCol < 1 && this.field[fromRow][fromCol -2] == State.FREE) number++;
        
        Point[] pts = new Point[number];
        int value = 0;
       
        if(fromRow > 1 && this.field[fromRow-1][fromCol] == State.USED &&  this.field[fromRow][fromCol -2] == State.FREE) pts[value++] = new Point(fromRow-2 , fromCol);
        if(fromRow < 5 && this.field[fromRow +1][fromCol] == State.USED && this.field[fromRow][fromCol +2] == State.FREE) pts[value++] = new Point (fromRow-2 , fromCol);
        if(fromRow > 5 && this.field[fromRow][fromCol-1] == State.USED && this.field[fromRow+2][fromCol ] == State.FREE) pts[value++] = new Point(fromRow, fromCol);
        if(fromRow > 1 && this.field[fromRow][fromCol+1] == State.USED &&this.field[fromRow-2][fromCol ] == State.FREE) pts[value++] = new Point(fromRow, fromCol);
        
        
    
		return pts;
        
        
        
    }

    /* 
     * diese Methode erzeugt ein Moves-Objekt
     * in dieses Moves-Objekt werden mithilfe der
     * Objektmethode addMove() (aus Moves) alle
     * moeglichen Zuege hinzugefuegt
     * (moeglich im aktuellen Zustand von field[][])
     */
    public Moves possibleMoves()
    {
    	 Moves possibleMoves = new Moves();
        for(int row = 0; row < this.field.length; row++) {
        	
        	for(int col = 0; col < this.field[row].length; row++) {
        		if(possibleFrom(row,col)) {
        			
        			Point [] pts = this.possibleTo(row, col);
        			Point from = new Point(row, col);
        			for(int value=0; value < pts.length; value++) {
        				possibleMoves.addMove(new Move (from, pts[value]));
        			}
        			
        		}
        	}
        	
        }
         
         possibleMoves.printMoves();
         return possibleMoves;
     }
    
             
         
        

    /*
     * gibt ein true zurueck, wenn im aktuellen Zustand 
     * von field[][] ueberhaupt noch ein Zug moeglich ist
     * sonst false
     */
    public boolean movePossible()
    {
    	for(int row=0; row< this.field.length; row++) {
    		for(int col = 0; col < this.field[row].length; col++) {
    			if(possibleFrom(row, col)) return true;
    		}
    	}
        return false;
    
    }

    /*
     * ruft die Methode move(Move move) auf,
     * wenn ein Zug moeglich ist (dann true zurueck)
     * sonst false
     */
    public boolean moveFirstPossible()
    {
        if(!movePossible()) return false;
        
        /*
         *  hier einen moeglichen Zug ausfuehren
         *  den ersten, den Sie finden (siehe
         *  possibleMoves() )
         */
        
        else {
            Moves possibleMoves = this.possibleMoves();
            try {
                Move move = possibleMoves.getMoveAtIndex(0);
                this.move(move);
                return true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("hier ist nicht möglich mit dem : 0");
                return false;
            }
        }
    }
       
 
    /*
     * hier wird der Zug Move move ausgefuehrt
     * nach dem Zug ist 
     * 1. die from-Position leer
     * 2. die to-Position mit einem Stein besetzt
     * 3. dazwischen leer (Stein wird "entfernt")
     * falls Zug nicht moeglich, wird eine 
     * IllegalArgumentException geworfen 
     */
    public void move(Move move) throws IllegalArgumentException
    {
    
            
    }
    
    public static void main(String[]args) {
    	
    	Solitaire solitaire = new Solitaire();
    	
    	solitaire.print();
    	solitaire.possibleFrom(7, 7);
    	solitaire.possibleTo(7,7);
    	solitaire.possibleMoves();
    	solitaire.movePossible();
    	solitaire.moveFirstPossible();
    	//solitaire.move(null );
    	
    	
    	
    	
//        int number = 110101; 
//    	String temp = Integer.toString(number);
//    	int[] numbers = new int[temp.length()];
//    	for (int i = 0; i < temp.length(); i++) {
//    	    numbers[i] = temp.charAt(i) - '0';
//    	    
//    	    System.out.println(numbers);

    
        }
}

