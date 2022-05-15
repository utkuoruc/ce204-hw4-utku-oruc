package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.*;

public class M4ContainmentVesselTest {

	@Test
	public void testIsReady() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.isReady();
		assertEquals(cv.isReady(), false);
	}

	@Test
	public void testM4ContainmentVessel() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		assertEquals(true, cv != null);
	}

	@Test
	public void testSetApi() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		CoffeeMakerAPI api2 = new CoffeeMakerAPI(0, 0, 0, 0, 0, 0, 0);
		cv.setApi(api2);
		assertEquals(cv.getApi(), api2);
	}

	@Test
	public void testSetLastPotStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.setLastPotStatus(1);
		assertEquals(cv.getLastPotStatus(), 1);
	}

	@Test
	public void testGetApi() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		CoffeeMakerAPI api2 = new CoffeeMakerAPI(0, 0, 0, 0, 0, 0, 0);
		cv.setApi(api2);
		assertEquals(cv.getApi(), api2);
	}

	@Test
	public void testGetLastPotStatus() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.setLastPotStatus(1);
		assertEquals(cv.getLastPotStatus(), 1);
	}

	@Test
	public void testPoll() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.poll();
		assertEquals(cv.getLastPotStatus(), 1);
	}

}
