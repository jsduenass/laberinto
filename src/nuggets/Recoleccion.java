package nuggets;

import becker.robots.*;



public class Recoleccion {
    
    private Wall []laberinto;
    private Robot robot;
    private City ciudad;
    private Thing []nugget;

    public Recoleccion(){
        ciudad = new City();
        Wall laberinto[]=new Wall[50];
        laberinto[0]= new Wall(ciudad,0,2,Direction.NORTH);
        laberinto[1]= new Wall(ciudad,0,3,Direction.NORTH);
        laberinto[2]= new Wall(ciudad,0,4,Direction.NORTH);
        laberinto[3]= new Wall(ciudad,0,5,Direction.NORTH);
        
        laberinto[4]= new Wall(ciudad,1,3,Direction.NORTH);
        laberinto[5]= new Wall(ciudad,1,4,Direction.NORTH);
        laberinto[6]= new Wall(ciudad,1,6,Direction.NORTH);
        
        laberinto[7]= new Wall(ciudad,2,1,Direction.NORTH);
        laberinto[8]= new Wall(ciudad,2,5,Direction.NORTH);
        laberinto[9]= new Wall(ciudad,2,7,Direction.NORTH);
        
        laberinto[10]= new Wall(ciudad,3,0,Direction.NORTH);
        laberinto[11]= new Wall(ciudad,3,2,Direction.NORTH);
        laberinto[12]= new Wall(ciudad,3,4,Direction.NORTH);
        laberinto[13]= new Wall(ciudad,3,6,Direction.NORTH);
        
        laberinto[14]= new Wall(ciudad,4,1,Direction.NORTH);
        laberinto[15]= new Wall(ciudad,4,3,Direction.NORTH);
        laberinto[16]= new Wall(ciudad,4,5,Direction.NORTH);
        laberinto[17]= new Wall(ciudad,4,6,Direction.NORTH);
        
        laberinto[18]= new Wall(ciudad,5,0,Direction.NORTH);
        laberinto[19]= new Wall(ciudad,5,4,Direction.NORTH);
        laberinto[20]= new Wall(ciudad,5,7,Direction.NORTH);
        
        laberinto[21]= new Wall(ciudad,6,1,Direction.NORTH);
        laberinto[22]= new Wall(ciudad,6,2,Direction.NORTH);
        laberinto[23]= new Wall(ciudad,6,6,Direction.NORTH);
    
        laberinto[24]= new Wall(ciudad,4,0,Direction.WEST);
        laberinto[25]= new Wall(ciudad,5,0,Direction.WEST);
        
        laberinto[26]= new Wall(ciudad,3,1,Direction.WEST);
        laberinto[27]= new Wall(ciudad,6,1,Direction.WEST);
            
        laberinto[28]= new Wall(ciudad,0,2,Direction.WEST);
        laberinto[29]= new Wall(ciudad,1,2,Direction.WEST);
        laberinto[30]= new Wall(ciudad,3,2,Direction.WEST);        
        laberinto[31]= new Wall(ciudad,4,2,Direction.WEST);
        
        laberinto[32]= new Wall(ciudad,1,3,Direction.WEST);
        laberinto[33]= new Wall(ciudad,2,3,Direction.WEST);
        laberinto[34]= new Wall(ciudad,4,3,Direction.WEST);
        laberinto[35]= new Wall(ciudad,5,3,Direction.WEST);
        
        laberinto[36]= new Wall(ciudad,2,4,Direction.WEST);
        laberinto[37]= new Wall(ciudad,3,4,Direction.WEST);
        laberinto[38]= new Wall(ciudad,5,4,Direction.WEST);
        
        laberinto[39]= new Wall(ciudad,1,5,Direction.WEST);
        laberinto[40]= new Wall(ciudad,4,5,Direction.WEST);
        
        laberinto[41]= new Wall(ciudad,0,6,Direction.WEST);
        laberinto[42]= new Wall(ciudad,2,6,Direction.WEST);
        laberinto[43]= new Wall(ciudad,4,6,Direction.WEST);
        laberinto[44]= new Wall(ciudad,5,6,Direction.WEST);

        laberinto[45]= new Wall(ciudad,1,7,Direction.WEST);
        laberinto[46]= new Wall(ciudad,5,7,Direction.WEST);
        
        laberinto[47]= new Wall(ciudad,2,8,Direction.WEST);
        laberinto[48]= new Wall(ciudad,3,8,Direction.WEST);
        laberinto[49]= new Wall(ciudad,4,8,Direction.WEST);

        robot= new Robot(ciudad,5,6,Direction.NORTH);
        nugget = new Thing [3];
        nugget[0]=new Thing(ciudad,1,6);
        nugget[1]=new Thing(ciudad,2,4);
        nugget[2]=new Thing(ciudad,4,3);
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
}
