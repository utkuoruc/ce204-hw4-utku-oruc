/****************************************************************************
 * Copyleft (L) 2022 CENG - All Rights Not Reserved
 * You may use, distribute and modify this code.
 ****************************************************************************/

/**
 * @file CoffeeMakerAPI.java
 * @author Utku Oruc
 * @date 15 May 2022
 *
 * @brief <b> Coffee Maker API </b>
 *
 * @see https://utkuoruc.github.io/blog/
 *
 */

package classes;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 201 "coffeemachine.ump"
public class CoffeeMakerAPI
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final int WARMER_EMPTY = 0;
  public static final int POT_EMPTY = 1;
  public static final int POT_NOT_EMPTY = 2;
  public static final int BOILER_EMPTY = 0;
  public static final int BOILER_NOT_EMPTY = 1;
  public static final int BREW_BUTTON_PUSHED = 0;
  public static final int BEW_BUTTON_NOT_PUSHED = 1;
  public static final int BOILER_ON = 0;
  public static final int BOILER_OFF = 1;
  public static final int WARMER_ON = 0;
  public static final int WARMER_OFF = 1;
  public static final int INDICATOR_ON = 0;
  public static final int INDICATOR_OFF = 1;
  public static final int VALVE_OPEN = 0;
  public static final int VALVE_CLOSED = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CoffeeMakerAPI Attributes
  private int warmerPlateStatus;
  private int boilerStatus;
  private int brewButtonStatus;
  private int boilerState;
  private int warmerState;
  private int indicatorState;
  private int reliefValveState;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CoffeeMakerAPI(int aWarmerPlateStatus, int aBoilerStatus, int aBrewButtonStatus, int aBoilerState, int aWarmerState, int aIndicatorState, int aReliefValveState)
  {
    warmerPlateStatus = aWarmerPlateStatus;
    boilerStatus = aBoilerStatus;
    brewButtonStatus = aBrewButtonStatus;
    boilerState = aBoilerState;
    warmerState = aWarmerState;
    indicatorState = aIndicatorState;
    reliefValveState = aReliefValveState;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setWarmerPlateStatus(int aWarmerPlateStatus)
  {
    boolean wasSet = false;
    warmerPlateStatus = aWarmerPlateStatus;
    wasSet = true;
    return wasSet;
  }

  public boolean setBoilerStatus(int aBoilerStatus)
  {
    boolean wasSet = false;
    boilerStatus = aBoilerStatus;
    wasSet = true;
    return wasSet;
  }

  public boolean setBrewButtonStatus(int aBrewButtonStatus)
  {
    boolean wasSet = false;
    brewButtonStatus = aBrewButtonStatus;
    wasSet = true;
    return wasSet;
  }

  public boolean setBoilerState(int aBoilerState)
  {
    boolean wasSet = false;
    boilerState = aBoilerState;
    wasSet = true;
    return wasSet;
  }

  public boolean setWarmerState(int aWarmerState)
  {
    boolean wasSet = false;
    warmerState = aWarmerState;
    wasSet = true;
    return wasSet;
  }

  public boolean setIndicatorState(int aIndicatorState)
  {
    boolean wasSet = false;
    indicatorState = aIndicatorState;
    wasSet = true;
    return wasSet;
  }

  public boolean setReliefValveState(int aReliefValveState)
  {
    boolean wasSet = false;
    reliefValveState = aReliefValveState;
    wasSet = true;
    return wasSet;
  }

  public int getWarmerPlateStatus()
  {
    return warmerPlateStatus;
  }

  public int getBoilerStatus()
  {
    return boilerStatus;
  }

  public int getBrewButtonStatus()
  {
    return brewButtonStatus;
  }

  public int getBoilerState()
  {
    return boilerState;
  }

  public int getWarmerState()
  {
    return warmerState;
  }

  public int getIndicatorState()
  {
    return indicatorState;
  }

  public int getReliefValveState()
  {
    return reliefValveState;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "warmerPlateStatus" + ":" + getWarmerPlateStatus()+ "," +
            "boilerStatus" + ":" + getBoilerStatus()+ "," +
            "brewButtonStatus" + ":" + getBrewButtonStatus()+ "," +
            "boilerState" + ":" + getBoilerState()+ "," +
            "warmerState" + ":" + getWarmerState()+ "," +
            "indicatorState" + ":" + getIndicatorState()+ "," +
            "reliefValveState" + ":" + getReliefValveState()+ "]";
  }
}