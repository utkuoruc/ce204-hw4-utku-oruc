package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.CoffeeMakerAPI;
import classes.M4ContainmentVessel;
import classes.M4HotWaterSource;
import classes.M4UserInterface;

public class M4UserInterfaceTest {

	@Test
	public void testDone() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		ui.done();
		assertEquals(api.getIndicatorState(), api.INDICATOR_ON);
	}

	@Test
	public void testCompleteCycle() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		ui.completeCycle();
		assertEquals(api.getIndicatorState(), api.INDICATOR_OFF);
	}

	@Test
	public void testM4UserInterface() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		assertEquals(true, ui != null);
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
		ui.setApi(api2);
		assertEquals(ui.getApi(), api2);
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
		ui.setApi(api2);
		assertEquals(ui.getApi(), api2);
	}

	@Test
	public void testPoll() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,1,0,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		ui.poll();
		assertEquals(api.getBrewButtonStatus(), api.BREW_BUTTON_PUSHED);
	}

}
