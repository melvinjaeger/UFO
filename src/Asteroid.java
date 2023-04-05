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







    public void bewegeDich(double speed) {
        kugel.verschiebe(0, -1 * speed, 0);
    }








    public void respawn() {
        kugel.setzePosition(-1000+Math.random()*2000, 2000+Math.random()*1000 , -300+Math.random()*800);

    }



}
