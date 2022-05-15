/****************************************************************************
 * Copyleft (L) 2022 CENG - All Rights Not Reserved
 * You may use, distribute and modify this code.
 ****************************************************************************/

/**
 * @file HotWaterSource.java
 * @author Utku Oruc
 * @date 15 May 2022
 *
 * @brief <b> HotWaterSource class </b>
 *
 * @see https://utkuoruc.github.io/blog/
 *
 */
package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 60 "coffeemachine.ump"
public abstract class HotWaterSource
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HotWaterSource Attributes
  private UserInterface ui;
  private ContainmentVessel cv;
  private boolean isBrewing;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HotWaterSource()
  {
    ui = null;
    cv = null;
    isBrewing = false;
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

  public boolean setCv(ContainmentVessel aCv)
  {
    boolean wasSet = false;
    cv = aCv;
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

  public UserInterface getUi()
  {
    return ui;
  }

  public ContainmentVessel getCv()
  {
    return cv;
  }

  public boolean getIsBrewing()
  {
    return isBrewing;
  }

  // line 69 "coffeemachine.ump"
   public void init(UserInterface ui, ContainmentVessel cv){
    this.ui = ui;
		this.cv = cv;
  }

  // line 73 "coffeemachine.ump"
   public void start(){
    isBrewing = true;
      startBrewing();
  }

  // line 77 "coffeemachine.ump"
   public void done(){
    isBrewing = false;
  }

  // line 80 "coffeemachine.ump"
   protected void declareDone(){
    ui.done();
      cv.done();
      isBrewing = false;
  }

   public abstract boolean isReady();

   public abstract void startBrewing();

   public abstract void pause();

   public abstract void resume();
}