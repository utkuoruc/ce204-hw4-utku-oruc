/****************************************************************************
 * Copyleft (L) 2022 CENG - All Rights Not Reserved
 * You may use, distribute and modify this code.
 ****************************************************************************/

/**
 * @file M4ContainmentVessel.java
 * @author Utku Oruc
 * @date 15 May 2022
 *
 * @brief <b> M4ContainmentVessel class </b>
 *
 * @see https://utkuoruc.github.io/blog/
 *
 */
package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 90 "coffeemachine.ump"
public class M4ContainmentVessel extends ContainmentVessel implements Pollable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //M4ContainmentVessel Attributes
  private CoffeeMakerAPI api;
  private int lastPotStatus;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public M4ContainmentVessel(CoffeeMakerAPI aApi)
  {
    super();
    api = aApi;
    lastPotStatus = 1;
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

  public boolean setLastPotStatus(int aLastPotStatus)
  {
    boolean wasSet = false;
    lastPotStatus = aLastPotStatus;
    wasSet = true;
    return wasSet;
  }

  public CoffeeMakerAPI getApi()
  {
    return api;
  }

  /**
   * POT_EMPTY
   */
  public int getLastPotStatus()
  {
    return lastPotStatus;
  }

  // line 99 "coffeemachine.ump"
   public boolean isReady(){
    int plateStatus = api.getWarmerPlateStatus();
    return plateStatus == api.POT_EMPTY;
  }

  // line 103 "coffeemachine.ump"
   public void poll(){
    int potStatus = api.getWarmerPlateStatus();
    if (potStatus != lastPotStatus) {
      if (super.getIsBrewing()) {
        handleBrewingEvent(potStatus);
      } 
      else if (super.getIsComplete() == false) {
        handleIncompleteEvent(potStatus);
      }
      lastPotStatus = potStatus;
    }
  }

  // line 115 "coffeemachine.ump"
   private void handleBrewingEvent(int potStatus){
    if (potStatus == api.POT_NOT_EMPTY) {
      containerAvailable();
      api.setWarmerState(api.WARMER_ON);
    } 
    else if (potStatus == api.WARMER_EMPTY) {
      containerUnavailable();
      api.setWarmerState(api.WARMER_OFF);
    } 
    else { // potStatus == api.POT_EMPTY
      containerAvailable();
      api.setWarmerState(api.WARMER_OFF);
    }
  }

  // line 129 "coffeemachine.ump"
   private void handleIncompleteEvent(int potStatus){
    if (potStatus == api.POT_NOT_EMPTY) {
      api.setWarmerState(api.WARMER_ON);
    } 
    else if (potStatus == api.WARMER_EMPTY) {
      api.setWarmerState(api.WARMER_OFF);
    } 
    else { // potStatus == api.POT_EMPTY
      api.setWarmerState(api.WARMER_OFF);
      declareComplete();
    }
  }
}