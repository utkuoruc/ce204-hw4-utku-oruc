package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.CoffeeMakerAPI;
import classes.M4ContainmentVessel;
import classes.M4HotWaterSource;
import classes.M4UserInterface;

public class PollableTest {

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
