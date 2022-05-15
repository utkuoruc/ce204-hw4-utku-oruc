/****************************************************************************
 * Copyleft (L) 2022 CENG - All Rights Not Reserved
 * You may use, distribute and modify this code.
 ****************************************************************************/

/**
 * @file M4UserInterface.java
 * @author Utku Oruc
 * @date 15 May 2022
 *
 * @brief <b> M4UserInterface class </b>
 *
 * @see https://utkuoruc.github.io/blog/
 *
 */

package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 181 "coffeemachine.ump"
public class M4UserInterface extends UserInterface implements Pollable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //M4UserInterface Attributes
  private CoffeeMakerAPI api;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public M4UserInterface(CoffeeMakerAPI aApi)
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

  // line 188 "coffeemachine.ump"
   public void poll(){
    int buttonStatus = api.getBrewButtonStatus();
    if (buttonStatus == api.BREW_BUTTON_PUSHED) {
      startBrewing();
    }
  }

  // line 194 "coffeemachine.ump"
   public void done(){
    api.setIndicatorState(api.INDICATOR_ON);
  }

  // line 197 "coffeemachine.ump"
   public void completeCycle(){
    api.setIndicatorState(api.INDICATOR_OFF);
  }
}