package histogramas;

import becker.robots.*;

public class Histograma {
    
    private Robot robot;
    private Patron patron;

    public Histograma(Patron patron) {
        robot= new Robot(patron.getBta(),0,1,Direction.SOUTH);
    }
    
    public void repartir(){
        do{
        robot.move();
        while (robot.canPickThing()==true){
            robot.pickThing();
        }
        robot.turnLeft();
        int n= robot.countThingsInBackpack();
        for (int i=0;i<n;i++){
            robot.putThing();
            robot.move();
        }
        robot.turnLeft();   
        robot.turnLeft();
        mover(n);
        robot.turnLeft();
        }while(robot.canPickThing()==true);
    }
    public void mover(int n){
        for (int i=0;i<n;i++){
            robot.move();
        }
    }  
}
