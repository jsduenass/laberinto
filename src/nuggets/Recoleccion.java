package nuggets;

import becker.robots.*;



public class Recoleccion {
    
    private Robot robot;
    private Laberinto lab;

    public Recoleccion(Laberinto lab){
        this.lab=lab;
        robot= new Robot(this.lab.getCiudad(),5,6,Direction.NORTH);
    }   
    
    public void recorrido(){
        robot.move();
        moveright(1);
        moveleft(2);
        moveleft(1);
        moveright(1);
        robot.pickThing();
        robot.turnLeft();
        moveleft(1);
        moveleft(1);
        moveright(1);
        moveright(2);
        moveright(1);
        moveleft(1);
        robot.pickThing();
        robot.turnLeft();
        moveleft(1);
        moveright(1);
        moveright(1);
        moveleft(1);
        moveright(1);
        robot.pickThing();
        moveleft(2);
        
    }
    
    public void moveleft(int n){
        robot.turnLeft();
        for(int i=0;i<n;i++){
            robot.move();
        }
    }
    public void moveright(int n){
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
        for (int i=0;i<n;i++){
            robot.move();
        }
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Laberinto getLab() {
        return lab;
    }

    public void setLab(Laberinto lab) {
        this.lab = lab;
    }
    
}
