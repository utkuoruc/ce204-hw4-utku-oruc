package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.CoffeeMakerAPI;
import classes.M4ContainmentVessel;
import classes.M4HotWaterSource;
import classes.M4UserInterface;

public class ContainmentVesselTest {

	@Test
	public void testContainmentVessel() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		assertEquals(true, cv != null);
	}

	@Test
	public void testSetUi() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		M4UserInterface ui2 = new M4UserInterface(api);
		cv.setUi(ui2);
		assertEquals(cv.getUi(), ui2);
	}

	@Test
	public void testSetHws() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		M4HotWaterSource hws2 = new M4HotWaterSource(api);
		cv.setHws(hws2);
		assertEquals(cv.getHws(), hws2);
	}

	@Test
	public void testSetIsBrewing() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.setIsBrewing(false);
		assertEquals(cv.getIsBrewing(), false);
	}

	@Test
	public void testSetIsComplete() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.setIsComplete(true);
		assertEquals(cv.getIsComplete(), true);
	}

	@Test
	public void testGetUi() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		M4UserInterface ui2 = new M4UserInterface(api);
		cv.setUi(ui2);
		assertEquals(cv.getUi(), ui2);
	}

	@Test
	public void testGetHws() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		M4HotWaterSource hws2 = new M4HotWaterSource(api);
		cv.setHws(hws2);
		assertEquals(cv.getHws(), hws2);
	}

	@Test
	public void testGetIsBrewing() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.setIsBrewing(false);
		assertEquals(cv.getIsBrewing(), false);
	}

	@Test
	public void testGetIsComplete() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.setIsComplete(true);
		assertEquals(cv.getIsComplete(), true);
	}

	@Test
	public void testInit() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		assertEquals(cv.getHws(), hws);
	}

	@Test
	public void testStart() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.start();
		assertEquals(cv.getIsComplete(), false);
	}

	@Test
	public void testDone() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		cv.done();
		assertEquals(cv.getIsBrewing(), false);
	}

	@Test
	public void testDeclareComplete() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		api.setWarmerPlateStatus(1);
		cv.setLastPotStatus(0);
		cv.poll();
		assertEquals(cv.getIsBrewing(), false);
	}

	@Test
	public void testContainerAvailable() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		api.setWarmerPlateStatus(1);
		cv.setLastPotStatus(0);
		cv.setIsBrewing(true);
		cv.poll();
		api.setWarmerPlateStatus(api.POT_NOT_EMPTY);
		assertEquals(api.getBoilerState(), api.BOILER_ON);
	}

	@Test
	public void testContainerUnavailable() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		api.setWarmerPlateStatus(api.POT_NOT_EMPTY);
		cv.setLastPotStatus(0);
		cv.setIsBrewing(true);
		cv.poll();
		api.setWarmerPlateStatus(api.POT_NOT_EMPTY);
		assertEquals(api.getBoilerState(), api.BOILER_ON);
	}

	@Test
	public void testIsReady() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		api.setWarmerPlateStatus(api.POT_EMPTY);
		assertEquals(cv.isReady(), true);
	}

}
