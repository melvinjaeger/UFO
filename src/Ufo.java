import GLOOP.*;
public class Ufo{
    private GLTorus Ufo;


    public Ufo(){
        Ufo = new GLTorus(0,0,0,30,10);
        Ufo.skaliere (0.5,1,0.4);
        Ufo.setzeQualitaet(24);

    }
 
    public void bewegelinks(){
       Ufo.verschiebe( -2,0,0);    }


    public void bewegerechts(){
        Ufo.verschiebe( 2,0,0);
    }

    public void bewegerunter() {
        Ufo.verschiebe(0, -2, 0);
    }

        public void bewegehoch() {
            Ufo.verschiebe(0, 2, 0);
        }





    public void explodiere(){

    }


    public double gibX() {
        return Ufo.gibX();
    }
        public double gibY(){
            return Ufo.gibY();
    }



}
