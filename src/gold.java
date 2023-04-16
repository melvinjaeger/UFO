import GLOOP.*;

public class gold {
    private GLKugel gold;
    private Ufo Ufo;

public int goldmenge;

    public gold(Ufo pUfo){
       gold = new GLKugel (-300+Math.random()*600, 2000+Math.random()*12000 , -0+Math.random()*300, 10+Math.random()*5 );
       Ufo=pUfo;


    }

    public void bewegen(double speed){
        gold.verschiebe(0,-speed,0);
        gold.drehe(1,1,1);
        if (gold.gibY()<-1000){ this.respawn();}


    }

    public boolean hit(){
        double distance = Math.sqrt(
                Math.pow( gold.gibX()-Ufo.gibX(), 2 ) +
                Math.pow( gold.gibY()- Ufo.gibY(), 2 ) +
                Math.pow( gold.gibZ()- Ufo.gibZ(), 2 ));

        if (distance < 100) {
            return true;

        }
        else{
            return false;
        }

        }

    public double gibY() {
        return gold.gibY();
    }

    public void respawn(){
       gold.setzePosition (-300+Math.random()*600, 2000+Math.random()*8000 , -0+Math.random()*300 );
    }


}




