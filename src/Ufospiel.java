import GLOOP.*; 
public class Ufospiel {
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo Ufo;
    private Asteroid[] asteroiden;

    private GLTafel punkteanzeige;
     int zahl;

    public Ufospiel() {
        kamera = new GLSchwenkkamera(1920, 1020);
        kamera.verschiebe(0, -350, -250);
        kamera.setzeBlickpunkt(0, 0, 150);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        Ufo = new Ufo();

        punkteanzeige = new GLTafel(0,100,350,0,0 );
        punkteanzeige.drehe(90,0,0);




        asteroiden = new Asteroid[200];

        for (int i = 0; i < asteroiden.length; i++) {
            asteroiden[i] = new Asteroid(Ufo);

        }


        fuehreAus();

    }

    public void fuehreAus() {



        while (!tastatur.esc()) {



            if (tastatur.links() && Ufo.gibX() > -400)
                Ufo.bewegelinks(0.7);
            Ufo.setzeDrehung(90, 0, 0);

            if (tastatur.rechts() && Ufo.gibX() < 400)
                Ufo.bewegerechts(0.7);
            Ufo.setzeDrehung(-20, 0, 0);
            if (tastatur.oben() && Ufo.gibZ() < 300)
                Ufo.bewegehoch(0.7);
            Ufo.setzeDrehung(0, 20, 0);

            if (tastatur.unten() && Ufo.gibZ() > -50)
                Ufo.bewegerunter(0.7);
            Ufo.setzeDrehung(0, -20, 0);


            for (int i = 0; i < asteroiden.length; i++) {
                asteroiden[i].bewegeDich(2);
                if (asteroiden[i].gibY() < -1000) {
                    asteroiden[i].respawn();

                }
                zahl = zahl + 1;
                if ((zahl % 10) == 0) {
                    punkteanzeige.setzeText("Deine Punktzahl ist:" + zahl, 40);

                }


            }

            Sys.warte();
        }
        Sys.beenden();
    }
}

