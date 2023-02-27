import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel, kugel2, kugel3;


    public Asteroid() {
        kugel = new GLKugel(0, 1000, 0, 50, "src/img/Krater.jpg");

        kugel2 = new GLKugel(-400, 1000, 0, 50, "src/img/Krater.jpg");

        kugel3 = new GLKugel(400, 1000, 0, 50, "src/img/Krater.jpg");
    }

    public void bewegeDich(){
        kugel.verschiebe(0,-0.5,0);



            kugel2.verschiebe(0,-0.5,0);



                kugel3.verschiebe(0,-0.5,0);
            }


}
