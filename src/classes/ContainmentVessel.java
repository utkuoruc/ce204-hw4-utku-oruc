/****************************************************************************
 * Copyleft (L) 2022 CENG - All Rights Not Reserved
 * You may use, distribute and modify this code.
 ****************************************************************************/

/**
 * @file ContainmentVessel.java
 * @author Utku Oruc
 * @date 15 May 2022
 *
 * @brief <b> ContainmentVessel class </b>
 *
 * @see https://utkuoruc.github.io/blog/
 *
 */
package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 26 "coffeemachine.ump"
public abstract class ContainmentVessel
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ContainmentVessel Attributes
  private UserInterface ui;
  private HotWaterSource hws;
  private boolean isBrewing;
  private boolean isComplete;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ContainmentVessel()
  {
    ui = null;
    hws = null;
    isBrewing = false;
    isComplete = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUi(UserInterface aUi)
  {
    boolean wasSet = false;
    ui = aUi;
    wasSet = true;
    return wasSet;
  }

  public boolean setHws(HotWaterSource aHws)
  {
    boolean wasSet = false;
    hws = aHws;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsBrewing(boolean aIsBrewing)
  {
    boolean wasSet = false;
    isBrewing = aIsBrewing;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsComplete(boolean aIsComplete)
  {
    boolean wasSet = false;
    isComplete = aIsComplete;
    wasSet = true;
    return wasSet;
  }

  public UserInterface getUi()
  {
    return ui;
  }

  public HotWaterSource getHws()
  {
    return hws;
  }

  public boolean getIsBrewing()
  {
    return isBrewing;
  }

  public boolean getIsComplete()
  {
    return isComplete;
  }

  // line 35 "coffeemachine.ump"
   public void init(UserInterface ui, HotWaterSource hws){
    this.ui = ui;
		this.hws = hws;
  }

  // line 39 "coffeemachine.ump"
   public void start(){
    isBrewing = true;
      isComplete = false;
  }

  // line 43 "coffeemachine.ump"
   public void done(){
    isBrewing = false;
  }

  // line 46 "coffeemachine.ump"
   protected void declareComplete(){
    isComplete = true;
      ui.complete();
  }

  // line 50 "coffeemachine.ump"
   protected void containerAvailable(){
    hws.resume();
  }

  // line 53 "coffeemachine.ump"
   protected void containerUnavailable(){
    hws.pause();
  }

   public abstract boolean isReady();
}