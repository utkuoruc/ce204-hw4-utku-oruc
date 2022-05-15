/****************************************************************************
 * Copyleft (L) 2022 CENG - All Rights Not Reserved
 * You may use, distribute and modify this code.
 ****************************************************************************/

/**
 * @file UserInterface.java
 * @author Utku Oruc
 * @date 15 May 2022
 *
 * @brief <b> UserInterface class </b>
 *
 * @see https://utkuoruc.github.io/blog/
 *
 */

package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 1 "coffeemachine.ump"
public abstract class UserInterface
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UserInterface Attributes
  private ContainmentVessel cv;
  private HotWaterSource hws;
  private boolean isComplete;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UserInterface()
  {
    cv = null;
    hws = null;
    isComplete = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCv(ContainmentVessel aCv)
  {
    boolean wasSet = false;
    cv = aCv;
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

  public boolean setIsComplete(boolean aIsComplete)
  {
    boolean wasSet = false;
    isComplete = aIsComplete;
    wasSet = true;
    return wasSet;
  }

  public ContainmentVessel getCv()
  {
    return cv;
  }

  public HotWaterSource getHws()
  {
    return hws;
  }

  public boolean getIsComplete()
  {
    return isComplete;
  }

  // line 8 "coffeemachine.ump"
   public void init(HotWaterSource hws, ContainmentVessel cv){
    this.hws = hws;
		this.cv = cv;
  }

  // line 12 "coffeemachine.ump"
   public void complete(){
    isComplete = true;
        completeCycle();
  }

  // line 16 "coffeemachine.ump"
   protected void startBrewing(){
    if (hws.isReady() && cv.isReady()) {
        isComplete = false;
        hws.start();
        cv.start();
      }
  }

   public abstract void done();

   public abstract void completeCycle();
}