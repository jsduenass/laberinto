
package Punto7;

import becker.robots.*;

public class Cuarto {
    
    private City city = new City();
    private Wall[] pared = new Wall[46];
    private Thing[] barriles = new Thing[100]; 

    public Cuarto() {
        for(int i = 0; i < 11; i++){
            if(i!=5){
                pared[i] = new Wall(city, 5, i+1, Direction.SOUTH);
            }
        }
        for(int j = 0; j < 11; j++){
            if(j!=5){
                pared[10+j] = new Wall(city, 7, j+1, Direction.NORTH);
            }
        }
        for(int k = 0; k < 11; k++){
            if(k!=5){
                pared[22+k] = new Wall(city, k+1, 7, Direction.WEST);
            }
        }
        for(int l = 0; l < 11; l++){
            if(l!=5){
                if(l==8){
                    pared[32+l] = new Wall(city, l+1, 4, Direction.EAST);
                    pared[44] = new Wall(city, l, 5, Direction.SOUTH);
                    pared[45] = new Wall(city, l+2, 5, Direction.NORTH);
                }else{
                    pared[32+l] = new Wall(city, l+1, 5, Direction.EAST);
                }
            }
        }
        for(int m = 0; m < 5; m++){
            for(int n = 0; n < 5; n++){
                barriles[(5*m)+n] = new Thing(city, n+1, m+1);
            }
            for(int o = 0; o < 5; o++){
                barriles[25+o+(5*m)] = new Thing(city, m+1, 7+o);
            }
            for(int p = 0; p < 5; p++){
                if((p!=4||m!=3)&&(p!=4||m!=4)&&(p!=3||m!=4)){
                barriles[50+p+(5*m)] = new Thing(city, 7+m, p+7);
                }
            }
            for (int q = 0; q < 5; q++) {
                if(q!=4||m!=2){
                barriles[75+q+(5*m)] = new Thing(city, 7+m, q+1);
                }
            }
        }
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Wall[] getPared() {
        return pared;
    }

    public void setPared(Wall[] pared) {
        this.pared = pared;
    }

    public Thing[] getBarriles() {
        return barriles;
    }

    public void setBarriles(Thing[] barriles) {
        this.barriles = barriles;
    }

    
}
