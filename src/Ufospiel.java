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
        kamera = new GLSchwenkkamera(800,600);  
        kamera.verschiebe(0,200,500);
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

            Sys.warte();
        }
        Sys.beenden(); 
    }
}
