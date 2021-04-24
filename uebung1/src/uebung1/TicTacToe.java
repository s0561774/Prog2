package uebung1;

import java.util.Random;

public class TicTacToe {


	 State[][] field;

	    public TicTacToe()
	    {
	        this.field = new State[3][3];
	        for(int i=0; i<this.field.length; i++)
	        {
	            for(int j=0; j<this.field[i].length; j++)
	            {
	                field[i][j]=State.EMPTY;
	            }
	        }
	    }

	    public void makeMove(int row, int col, State player)
	    {
	        if(row>=0 && row<this.field.length 
	                && col>=0 && col<this.field[row].length 
	                && this.field[row][col] == State.EMPTY)
	        {
	            if(player!=State.EMPTY) 
	            {
	                this.field[row][col]=player;
	            }
	        }
	    }

	    public void print()
	    {
	        for(int row=0; row<this.field.length; row++)
	        {
	            for(int col=0; col<this.field[row].length; col++)
	            {
	                if(field[row][col]==State.EMPTY)
	                {
	                    System.out.print("- ");
	                }
	                else if(field[row][col]==State.RED)
	                {
	                    System.out.print("x ");
	                }
	                else // BLACK
	                {
	                    System.out.print("o ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	    
	    public boolean gewonnen(State player) {
	    
	    	if(player == State.EMPTY)return false;
	    	
	    	// Alle drei Zeilen pruefen
	    	for(int row=0; row<this.field.length; row++) 
	    	{
	    		if(this.field[row][0] == player && this.field[row][1] == player && this.field[row][2] == player)
	    		{
	    			return true;
	    		}
	    		
	    	}
	    	// alle drei Spalten pruefen
	    	for(int col=0; col<this.field.length; col++)
	    	{
	    		if(this.field[0][0] == player && this.field[1][1] == player && this.field[2][2] == player)
	    		{
	    			return true;
	    			//Diagonal von Link Oben nach rechts unten
	    	}
	    		if(this.field[0][2] == player && this.field[1][1] == player && this.field[2][0] == player)
	    		{
	    			return true;
	    		}
	    	}
	    	return false;
	    	}
	    	
	    	public void printResultat()
	    	{
	    		if(this.gewonnen(State.RED))
	    		{
	    			System.out.println("Rot Hat Gewonnen!!!");	
	    		}
	    		else if(this.gewonnen(State.BLACK))
	    		{
	    			System.out.println("schwarz hat Gewonnen!!!");
	    		}
	    		
	    		else if(this.unentschieden())
	    		{
	    			System.out.println("Unentschieden!!!");
	    		}
	}
	    	public void makeRandomMove(State player)
	    	{
	    		if(player != State.EMPTY)
	    		{
	    			Random r = new Random();
	    			int row = r.nextInt(3);
	    			int col = r.nextInt(3);
	    			while(this.field[row][col] !=State.EMPTY)
						{
	    		 row = r.nextInt(3);
    			 col = r.nextInt(3);
	    	}
			this.field[row][col]=player;
	    }
	}
	    		
	    	public void spielen() 
	    	{
	    		State player = State.RED;
	    		while (!(unentschieden() || this.gewonnen(State.RED) || this.gewonnen(State.BLACK)))
	    		{
	    			this.makeRandomMove(player);
	    			this.print();
	    			this.printResultat();
	    			if(player == State.RED)
	    			{
	    				player = State.BLACK;
	    			}
	    			else
	    			{
	    				player = State.RED;
	    			}
	    			
	    			player = (player == State.RED) ? State.BLACK : State.RED;
	    		}
	    	}
	    	
	    	public boolean voll() {
	    		for(int row=0; row<this.field.length; row++)
	    		{
	    			for(int col=0; row<this.field[row].length; col++)
	    			{
	    			if(field[row][col]==State.EMPTY)
	    			{
	    				return false;
	    			}
	    		}
	    	}
	    		return true;
}
	    	
	    	public boolean unentschieden()
	    	{
	    		return (this.voll() && !this.gewonnen(State.RED) && !this.gewonnen(State.BLACK));
	    	}
	    	
	    	
}




	   
