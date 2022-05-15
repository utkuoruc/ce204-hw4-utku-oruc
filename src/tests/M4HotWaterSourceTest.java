package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.CoffeeMakerAPI;
import classes.M4ContainmentVessel;
import classes.M4HotWaterSource;
import classes.M4UserInterface;

public class M4HotWaterSourceTest {

	@Test
	public void testIsReady() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.isReady();
		assertEquals(hws.isReady(), true);
	}

	@Test
	public void testStartBrewing() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.startBrewing();
		assertEquals(api.getReliefValveState(), 1);
	}

	@Test
	public void testPause() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.pause();
		assertEquals(api.getBoilerState(), 1);
	}

	@Test
	public void testResume() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.resume();
		assertEquals(api.getBoilerState(), 0);
	}

	@Test
	public void testM4HotWaterSource() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		assertEquals(true, hws != null);
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
		hws.setApi(api2);
		assertEquals(hws.getApi(), api2);
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
		hws.setApi(api2);
		assertEquals(hws.getApi(), api2);
	}

	@Test
	public void testPoll() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.poll();
		assertEquals(api.getBoilerState(), 1);
	}

}
