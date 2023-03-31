import GLOOP.*; 
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo Ufo;
    private Asteroid[] asteroiden;



    public Ufospiel(){
        kamera = new GLSchwenkkamera(1920,1020);
        kamera.verschiebe(0,-350,-300);
        kamera.setzeBlickpunkt(0,0,150);
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        Ufo = new Ufo();


        asteroiden = new  Asteroid[500];

        for (int i=0;i <asteroiden.length;i++) {
            asteroiden[i] = new Asteroid();
        }







        fuehreAus();

    }
    public void fuehreAus(){
        while(!tastatur.esc()){           



           if (tastatur.links() && Ufo.gibX() > -400)
               Ufo.bewegelinks();
            if (tastatur.rechts()&& Ufo.gibX() < 400)
                Ufo.bewegerechts();
            if (tastatur.oben()&& Ufo.gibZ() < 300)
                Ufo.bewegehoch();
            if (tastatur.unten()&& Ufo.gibZ() > -50)
                Ufo.bewegerunter();

            for (int i=0;i <asteroiden.length;i++) {
                asteroiden[i].bewegeDich(20);
                if (asteroiden[i].gibY() < -1000){
                    asteroiden[i].respawn();
                }
            }




            Sys.warte();
        }
        Sys.beenden();
    }
}
