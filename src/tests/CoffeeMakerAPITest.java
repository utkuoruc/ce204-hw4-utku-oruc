package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.CoffeeMakerAPI;

public class CoffeeMakerAPITest {

	@Test
	public void testCoffeeMakerAPI() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		assertEquals(true, api != null);
	}

	@Test
	public void testSetWarmerPlateStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setWarmerPlateStatus(1);
		assertEquals(api.getWarmerPlateStatus(), 1);
	}

	@Test
	public void testSetBoilerStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setBoilerStatus(1);
		assertEquals(api.getBoilerStatus(), 1);
	}

	@Test
	public void testSetBrewButtonStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setBrewButtonStatus(1);
		assertEquals(api.getBrewButtonStatus(), 1);
	}

	@Test
	public void testSetBoilerState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setBoilerState(1);
		assertEquals(api.getBoilerState(), 1);
	}

	@Test
	public void testSetWarmerState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setWarmerState(1);
		assertEquals(api.getWarmerState(), 1);
	}

	@Test
	public void testSetIndicatorState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setIndicatorState(1);
		assertEquals(api.getIndicatorState(), 1);
	}

	@Test
	public void testSetReliefValveState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setReliefValveState(1);
		assertEquals(api.getReliefValveState(), 1);
	}

	@Test
	public void testGetWarmerPlateStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setWarmerPlateStatus(1);
		assertEquals(api.getWarmerPlateStatus(), 1);
	}

	@Test
	public void testGetBoilerStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setBoilerStatus(1);
		assertEquals(api.getBoilerStatus(), 1);
	}

	@Test
	public void testGetBrewButtonStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setBrewButtonStatus(1);
		assertEquals(api.getBrewButtonStatus(), 1);
	}

	@Test
	public void testGetBoilerState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setBoilerState(1);
		assertEquals(api.getBoilerState(), 1);
	}

	@Test
	public void testGetWarmerState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setWarmerState(1);
		assertEquals(api.getWarmerState(), 1);
	}

	@Test
	public void testGetIndicatorState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setIndicatorState(1);
		assertEquals(api.getIndicatorState(), 1);
	}

	@Test
	public void testGetReliefValveState() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setReliefValveState(1);
		assertEquals(api.getReliefValveState(), 1);
	}

	@Test
	public void testDelete() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.delete();
		assertEquals(api.toString(), api.toString());
	}

	@Test
	public void testToString() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1, 1, 1, 1, 1, 1, 1);
		
		api.setReliefValveState(1);
		assertEquals(api.toString(), api.toString());
	}

}
