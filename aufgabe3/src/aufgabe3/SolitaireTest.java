package aufgabe3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolitaireTest {

	@Test
	void testconvert1amTo1() {
		
		//given (Preparation)
		Solitaire utz = new Solitaire();
		//when (Execution)
		String zeit = utz.convert("1:00 am");
		// than (Verification)
		assertEquals(zeit, "1:00");
	}
	
	@Test
	void testconvert2amTo2() {
		
		//given (Preparation)
		Solitaire utz = new Solitaire();
		//when (Execution)
		String zeit = utz.convert("2:00 am");
		// than (Verification)
		assertEquals("2:00",zeit );
	}

	@Test
	void testconvert9amTo9() {
		
		//given (Preparation)
		Solitaire utz = new Solitaire();
		//when (Execution)
		String zeit = utz.convert("9:00 am");
		// than (Verification)
		assertEquals(zeit, "9:00" );
	}
	@Test
	void testconvert10amTo10() 
{
		//given (Preparation)
		Solitaire utz = new Solitaire();
		//when (Execution)
		String zeit = utz.convert("10:00 am");
		// than (Verification)
		assertEquals("10:00", zeit);
	}
	@Test
	void testconvert1115amTo1115() {
	
	//given (Preparation)
	Solitaire utz = new Solitaire();
	//when (Execution)
	String zeit = utz.convert("11:15 am");
	// than (Verification)
	assertEquals("11:15", zeit );
}
	@Test
	void testconvert1pmTo13() {
	
	//given (Preparation)
	Solitaire utz = new Solitaire();
	//when (Execution)
	String zeit = utz.convert("1:00 pm");
	// than (Verification)
	assertEquals("13:00", zeit );
}
	
	@Test
	void testconvert11pmTo11() {
	
	//given (Preparation)
	Solitaire utz = new Solitaire();
	//when (Execution)
	String zeit = utz.convert("11:00 pm");
	// than (Verification)
	assertEquals("23:00", zeit );
}

	@Test
	void testconvert11pmTo23() {
	
	//given (Preparation)
	Solitaire utz = new Solitaire();
	//when (Execution)
	String hours = utz.getHoursStr("11:00 pm");
	// than (Verification)
	assertEquals("11", hours );
	}
	
	@Test
	void testGetHoursInt1pm() {
		
		//given (Preparation)
		Solitaire utz = new Solitaire();
		//when (Execution)
		int hours = utz.getHoursInt("11:00 pm");
		// than (Verification)
		assertEquals(11, hours );
		}
	

}
