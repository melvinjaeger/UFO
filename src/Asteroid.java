import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel, kugel2, kugel3;


    public Asteroid() {

        kugel = new GLKugel(Math.random()*500, 700+Math.random()*1000 , 0, 30+Math.random()*60 , "src/img/Krater.jpg");





    }

    public void bewegeDich(){
        kugel.verschiebe(0,-1,0);


            }
    public double gibY() {
        return kugel.gibY();
    }


    public void respawn() {
        kugel.verschiebe(0+Math.random() * 500 *-500, 700 + Math.random() * 1000,  0);
    }



}
