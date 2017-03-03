package histogramas;

import becker.robots.*;

public class Patron {
    
    private City bta;
    private Thing []punto;

    public Patron() {
        bta = new City();
        punto= new Thing[15];
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

    public City getBta() {
        return bta;
    }

    public void setBta(City bta) {
        this.bta = bta;
    }

    public Thing[] getPunto() {
        return punto;
    }

    public void setPunto(Thing[] punto) {
        this.punto = punto;
    }
    
    
}
