package seleniumday2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class j12242Test extends j12242 {

	@Before
	public void setUp() throws Exception {
		// System.out.println("1");
	}

	@After
	public void tearDown() throws Exception {
		// System.out.println("2");
	}

	@Test
	public void testDiv() {
		//fail("Not yet implemented");
	    // System.out.println("3");
	j12242 jun=new j12242();
	int d=jun.div(4,2);
	assertNotEquals(3, d);
		
	}

}
