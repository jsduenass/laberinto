package traslados;

import becker.robots.*;

public class Traslado {
    
    private Robot robot;
    private Escenario escenario;
    private boolean[]pos;
    private int j;
    
    
    public Traslado(Escenario escenario){
        this.escenario=escenario;
        robot = new Robot(this.escenario.getCiudad(),9,1,Direction.NORTH);
        j=0;
    }   
    
    public void recoleccion(){
        moveforward(5,true);
        for (int i=0;i<3;i++){
            moveright(4-i,true);
            moveright(4-i,true);
        }    
        moveright(3,true);
        moveleft(2,true);
    }
    
    public void reparticion(){
        
        moveleft(6,true);
        moveleft(3,true);
        j=0;
        moveforward(5,false);
        for (int i=0;i<3;i++){
            moveright(4-i,false);
            moveright(4-i,false);
        }    
        moveright(3,false);
        moveleft(2,false);
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public boolean[] getPos() {
        return pos;
    }

    public void setPos(boolean[] pos) {
        this.pos = pos;
    }
    
    public void moveright(int n,boolean r){
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
        for(int i=0;i<n;i++){
            if(r){
                recojer();
            }else{
            dejar();
            }
            robot.move();
        }
    }
    public void moveleft(int n,boolean r){
        robot.turnLeft();
        for(int i=0;i<n;i++){
            if(r){
                recojer();
            }else{
                dejar();
            }        
            robot.move();
        }
    }
    public void moveforward(int n,boolean r){
        for(int i=0;i<n;i++){
            if(r==true){
                recojer();
            }else{
                dejar();
            }
            robot.move();
        }
    }
    public void recojer(){
        if(robot.canPickThing()){
            robot.pickThing();
            pos[j]=true;
            j++;
        }else{
            j++;
        }     
    }
    public void dejar(){
        if(pos[j]==true){
            robot.putThing();
            j++;
        }else{
            j++;
        }
    }
}
