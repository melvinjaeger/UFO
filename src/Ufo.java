import GLOOP.*;
public class Ufo{
    private GLTorus Ufo;


    public Ufo(){
        Ufo = new GLTorus(0,50,-20,1,20);
        Ufo.skaliere (0.5,1,0.4);
        Ufo.setzeQualitaet(24);

    }
 
    public void bewegelinks() {Ufo.verschiebe( -1,0,0);    }

    public void bewegerechts(){
        Ufo.verschiebe( 1,0,0);
    }

    public void bewegerunter() {
        Ufo.verschiebe(0, 0, -1);
    }

    public void bewegehoch() {
            Ufo.verschiebe(0, 0, 1);
        }





    public void explodiere(){
  double z = Math.random();
  for (int i=0; i< 2000; i++) {
      Ufo.verschiebe(-z, z, z);
      Ufo.drehe(-z, z, z);
      Sys.warte();
  }
Sys.beenden();



  }








    public double gibX() {
        return Ufo.gibX();
    }
    public double gibY(){
        return Ufo.gibY();
    }

    public double gibZ() {
        return Ufo.gibZ();
    }

}
