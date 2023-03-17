import GLOOP.*; 
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo Ufo;
    private Asteroid asteroid1,asteroid2,asteroid3;
    //[...]

    public Ufospiel(){
        kamera = new GLSchwenkkamera(1920,1020);
        kamera.verschiebe(0,-300,-300);
        kamera.setzeBlickpunkt(0,0,150);
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        Ufo = new Ufo();

        asteroid1 = new Asteroid();
        //[...]
        
        fuehreAus();
    }

    public void fuehreAus(){
        while(!tastatur.esc()){           
            asteroid1.bewegeDich();


           if (tastatur.links() && Ufo.gibX() > -700)
               Ufo.bewegelinks();
            if (tastatur.rechts()&& Ufo.gibX() < 700)
                Ufo.bewegerechts();
            if (tastatur.oben()&& Ufo.gibY() < 700)
                Ufo.bewegehoch();
            if (tastatur.unten()&& Ufo.gibY() > -200)
                Ufo.bewegerunter();

            if  (asteroid1.gibY() <-400)
               asteroid1.respawn();




            Sys.warte();
        }
        Sys.beenden(); 
    }
}
