import GLOOP.*;
public class Ufo{
    private GLTorus Ufo;





    public Ufo(){
        Ufo = new GLTorus(0,0,100,2,30,"src/img/Ufofarbe.jpg");
        Ufo.skaliere (0.5,1,0.4);
        Ufo.setzeQualitaet(50);

    }
 
    public void bewegelinks(double speed){
        Ufo.verschiebe( -1* speed,0,0);
    }

    public void bewegerechts(double speed){
        Ufo.verschiebe( 1* speed,0,0);
    }

    public void bewegerunter(double speed) {
        Ufo.verschiebe(0, 0, -1* speed);
    }

    public void bewegehoch(double speed) {
            Ufo.verschiebe(0, 0, 1* speed);
        }

    public void bewegevorne(double speed) {
        Ufo.verschiebe(0, 1* speed, 0);
    }

    public void bewegehinten(double speed) {
        Ufo.verschiebe(0, -1* speed, 0);
    }

    public void setzeDrehung(double x,double y,double z){ Ufo.setzeDrehung(x,y,z);}




    public void explodiere(){
  double z = Math.random();
  for (int i=0; i< 1000; i++) {
      Ufo.verschiebe(-z, z, -z);
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
