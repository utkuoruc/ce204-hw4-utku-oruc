package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.CoffeeMakerAPI;
import classes.M4ContainmentVessel;
import classes.M4HotWaterSource;
import classes.M4UserInterface;

public class HotWaterSourceTest {

	@Test
	public void testHotWaterSource() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		assertEquals(true, hws != null);
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
		hws.setUi(ui2);
		assertEquals(hws.getUi(), ui2);
	}

	@Test
	public void testSetCv() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		M4ContainmentVessel cv2 = new M4ContainmentVessel(api);
		hws.setCv(cv2);
		assertEquals(hws.getCv(), cv2);
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
		
		hws.setIsBrewing(false);
		assertEquals(hws.getIsBrewing(), false);
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
		hws.setUi(ui2);
		assertEquals(hws.getUi(), ui2);
	}

	@Test
	public void testGetCv() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(0,1,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		M4ContainmentVessel cv2 = new M4ContainmentVessel(api);
		hws.setCv(cv2);
		assertEquals(hws.getCv(), cv2);
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
		
		hws.setIsBrewing(false);
		assertEquals(hws.getIsBrewing(), false);
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
		
		assertEquals(hws.getCv(), cv);
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
		
		hws.start();
		assertEquals(hws.getIsBrewing(), true);
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
		
		hws.done();
		assertEquals(hws.getIsBrewing(), false);
	}

	@Test
	public void testDeclareDone() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.setIsBrewing(true);
		hws.poll();
		assertEquals(hws.getIsBrewing(), false);
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
		
		assertEquals(hws.isReady(), false);
	}

	@Test
	public void testStartBrewing() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.startBrewing();
		assertEquals(hws.getIsBrewing(), false);
	}

	@Test
	public void testPause() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.pause();
		assertEquals(hws.getIsBrewing(), false);
	}

	@Test
	public void testResume() {
		CoffeeMakerAPI api = new CoffeeMakerAPI(1,0,1,1,1,1,1);
		
		M4UserInterface ui = new M4UserInterface(api);
		M4HotWaterSource hws = new M4HotWaterSource(api);
		M4ContainmentVessel cv = new M4ContainmentVessel(api);
		ui.init(hws,cv);
		hws.init(ui,cv);
		cv.init(ui,hws);
		
		hws.pause();
		assertEquals(hws.getIsBrewing(), false);
	}
}
