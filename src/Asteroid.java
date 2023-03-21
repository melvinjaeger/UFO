import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel;
public Ufo Ufo;



    public Asteroid() {

        kugel = new GLKugel (-500+Math.random()*1000, 2000+Math.random()*1000 , 0+Math.random()*300, 30+Math.random()*60 , "src/img/Krater.jpg");





    }


    public double gibX() {
        return kugel.gibX();
    }

    public double gibY() {
        return kugel.gibY();
    }

    public double gibZ() {
        return kugel.gibZ();
    }















    public void bewegeDich(){
        kugel.verschiebe(0,-1,0);
        if (getroffen()) {
            Ufo.explodiere();
        }
            }

    public boolean getroffen() {
        double abstand = Math.sqrt(Math.pow(kugel.gibX() - Ufo.gibX(),2)+ Math.pow(kugel.gibY() - Ufo.gibY(),2)+ Math.pow(kugel.gibZ() - Ufo.gibZ(),2));

        if (abstand < 50 ) {
            return true;
        }
        else{
            return false;


        }

    }











    public void respawn() {
        kugel.setzePosition(-500+Math.random()*1000 , 2000+ Math.random() *1000,  0+Math.random() *300);
    }



}
