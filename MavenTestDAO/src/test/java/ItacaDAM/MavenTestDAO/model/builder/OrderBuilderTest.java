package ItacaDAM.MavenTestDAO.model.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import ItacaDAM.MavenTestDAO.exceptions.DuplicatedItemException;
import ItacaDAM.MavenTestDAO.exceptions.NotTasteAtAllException;
import ItacaDAM.MavenTestDAO.model.Order;

public class OrderBuilderTest {

	@Test
	public void orderIDNegativeThrowsException_shouldNotWork() {
		try {
			OrderBuilder.build(-1, true, true, false, false, false, false);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			return;
		}	
		fail("Exception not Thrown");
	}
	
	
	@Test
	public void orderIDPositive_shouldWork() {
		Order testOrder = null;
		try {
			testOrder = OrderBuilder.build(11, true, true, false,
					false, false, false);
		} catch (Exception e) {
			fail("This must not happen");
		}
		
		assertNotNull(testOrder);
	}
	
	@Test
	public void orderIDEquals1_shouldNotWork() {
		Order testOrder = null;
		try {
			testOrder = OrderBuilder.build(1, true, true, false,
					false, false, false);
		} catch (Exception e) {
			assertTrue(e instanceof DuplicatedItemException);
			return;
		}
		
		assertNotNull(testOrder);
	}
	
	
	@Test
	public void orderWithAnchoaAndMaizThrowsException_shouldNotWork() {
		try {
			OrderBuilder.build(1, true, true, false, false, false, true);
		} catch (Exception e) {
			assertTrue(e instanceof NotTasteAtAllException);
			return;
		}	
		fail("Exception not Thrown");
	}

}
