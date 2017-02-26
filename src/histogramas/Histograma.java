package histogramas;

import becker.robots.*;

public class Histograma {
    
    private Robot robot;
    private City bta;
    private Thing []punto;

    public Histograma() {
        bta = new City();
        punto= new Thing[15];
        robot= new Robot(bta,0,1,Direction.SOUTH);
        punto[0]= new Thing(bta,1,1);
        punto[1]= new Thing(bta,1,1);
        punto[2]= new Thing(bta,1,1);
        punto[3]= new Thing(bta,2,1);
        punto[4]= new Thing(bta,2,1);
        punto[5]= new Thing(bta,3,1);
        punto[6]= new Thing(bta,3,1);
        punto[7]= new Thing(bta,3,1);
        punto[8]= new Thing(bta,3,1);
        punto[9]= new Thing(bta,3,1);
        punto[10]= new Thing(bta,4,1);
        punto[11]= new Thing(bta,4,1);
        punto[12]= new Thing(bta,4,1);
        punto[13]= new Thing(bta,4,1);
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
