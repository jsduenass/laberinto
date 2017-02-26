package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing parcel = new Thing(prague, 1, 2);
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,5);
      Thing punto = new Thing(prague,5,2);
    
      // Direct the robot to the final situation
      karel.move();
      karel.move();
      karel.pickThing();
      turnderecha(karel);
      mover(karel ,3);
      karel.pickThing();
     // karel.putThing();
      karel.move();
      System.out.println(karel.countThingsInBackpack());
   }
   public static void mover(Robot robot,int n){
       for (int i=0;i<n;i++){
           robot.move();
       }
   }
   
   public static void turnderecha(Robot robot){
     robot.turnLeft();
     robot.turnLeft();
     robot.turnLeft();
   }
}
