//Michael Lynch
//CS 110
//November 4, 2013

//This class contains information about a ship.
public class Ship
{
   public String shipName;     //String to hold name of Ship
   public String yearBuilt;    //String to hold the year built
   
   //This constructor takes in a string input for both the name and the year.
   public Ship(String name,String year)
   {
      shipName = name;  //sets shipName
      yearBuilt = year; //sets yearBuilt
   }
   
   //This method sets shipName with a string input
   public void setShipName(String str)
   {
      shipName = str;
   }
   
   //This method sets yearBuilt with a string input
   public void setYearBuilt(String str)
   {
      yearBuilt = str;
   }
   
   //This method returns shipName
   public String getShipName()
   {
      return shipName;
   }
   
   //This method returns yearBuilt
   public String getYearBuilt()
   {
      return yearBuilt;
   }
   
   //This method returns the name and year built in a string
   public String toString()
   {
      String str = "Ship Name: " + shipName + "\n" +
                   "Year Built: " + yearBuilt;
      return str;
   }
}