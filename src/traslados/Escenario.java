package traslados;

import becker.robots.*;



public class Escenario {

    private City ciudad;
    private Wall[] pared;
    private Thing[] ladrillo;

    public Escenario() {
        ciudad = new City();
        ladrillo=new Thing[8];
        ladrillo[0]=new Thing(ciudad,4,2);
        ladrillo[1]=new Thing(ciudad,4,4);
        ladrillo[2]=new Thing(ciudad,5,1);
        ladrillo[3]=new Thing(ciudad,5,5);
        ladrillo[4]=new Thing(ciudad,7,1);
        ladrillo[5]=new Thing(ciudad,7,5);
        ladrillo[6]=new Thing(ciudad,8,2);
        ladrillo[7]=new Thing(ciudad,8,4);
        pared= new Wall[40];
        for(int i=0;i<5;i++){
            pared[i]=new Wall(ciudad,4+i,1,Direction.WEST);
            pared[i+6]=new Wall(ciudad,1+i,7,Direction.WEST);
            pared[i+11]=new Wall(ciudad,1+i,11,Direction.EAST);
            pared[i+16]=new Wall(ciudad,4+i,5,Direction.EAST);
            pared[i+21]=new Wall(ciudad,4,1+i,Direction.NORTH);
            pared[i+26]=new Wall(ciudad,1,7+i,Direction.NORTH);
        }
        for(int i=0;i<4;i++){
            pared[i+31]=new Wall(ciudad,8,2+i,Direction.SOUTH);
            pared[i+35]=new Wall(ciudad,5,8+i,Direction.SOUTH);            
        }
    }

    public City getCiudad() {
        return ciudad;
    }

    public void setCiudad(City ciudad) {
        this.ciudad = ciudad;
    }

    public Wall[] getPared() {
        return pared;
    }

    public void setPared(Wall[] pared) {
        this.pared = pared;
    }

    public Thing[] getLadrillo() {
        return ladrillo;
    }

    public void setLadrillo(Thing[] ladrillo) {
        this.ladrillo = ladrillo;
    }
}
