import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel;
public Ufo Ufo;



    public Asteroid() {

        kugel = new GLKugel (-750+Math.random()*1500, 1000+Math.random()*4000 , -500+Math.random()*1000, 30+Math.random()*60 , "src/img/Krater.jpg");





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

    public boolean getroffen() {
        double abstand = Math.sqrt(
                        Math.pow(this.gibX() - Ufo.gibX(), 2) +
                        Math.pow(this.gibY() - Ufo.gibY(), 2) +
                        Math.pow(this.gibZ() - Ufo.gibZ(), 2)
        );
        if (abstand < 70) {
            return true;
        }
        else{
            return false;
        }
    }








    public void respawn() {
        kugel.setzePosition(-1000+Math.random()*2000, 2000+Math.random()*1000 , -300+Math.random()*800);

    }



}
