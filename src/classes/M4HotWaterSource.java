/****************************************************************************
 * Copyleft (L) 2022 CENG - All Rights Not Reserved
 * You may use, distribute and modify this code.
 ****************************************************************************/

/**
 * @file M4HotWaterSource.java
 * @author Utku Oruc
 * @date 15 May 2022
 *
 * @brief <b> M4HotWaterSource class </b>
 *
 * @see https://utkuoruc.github.io/blog/
 *
 */

package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 142 "coffeemachine.ump"
public class M4HotWaterSource extends HotWaterSource implements Pollable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //M4HotWaterSource Attributes
  private CoffeeMakerAPI api;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public M4HotWaterSource(CoffeeMakerAPI aApi)
  {
    super();
    api = aApi;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setApi(CoffeeMakerAPI aApi)
  {
    boolean wasSet = false;
    api = aApi;
    wasSet = true;
    return wasSet;
  }

  public CoffeeMakerAPI getApi()
  {
    return api;
  }

  // line 148 "coffeemachine.ump"
   public boolean isReady(){
    int boilerStatus = api.getBoilerStatus();
	return boilerStatus == api.BOILER_NOT_EMPTY;
  }

  // line 152 "coffeemachine.ump"
   public void startBrewing(){
    api.setReliefValveState(api.VALVE_CLOSED);
		api.setBoilerState(api.BOILER_ON);
  }

  // line 156 "coffeemachine.ump"
   public void poll(){
    int boilerStatus = api.getBoilerStatus();
			if (super.getIsBrewing()) {
			if (boilerStatus == api.BOILER_EMPTY) {
				api.setBoilerState(api.BOILER_OFF);
				api.setReliefValveState(api.VALVE_CLOSED);
				declareDone();
		}
		}
  }

  // line 166 "coffeemachine.ump"
   public void pause(){
    api.setBoilerState(api.BOILER_OFF);
		api.setReliefValveState(api.VALVE_OPEN);
  }

  // line 170 "coffeemachine.ump"
   public void resume(){
    api.setBoilerState(api.BOILER_ON);
		api.setReliefValveState(api.VALVE_CLOSED);
  }
}