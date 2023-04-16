import GLOOP.*; 
public class Ufospiel {
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo Ufo;
    private Asteroid[] asteroiden;
    private gold[] gold;
    private GLTafel goldanzeige;
    private GLTafel punkteanzeige;
    int zahl;

    int goldmenge;


    public Ufospiel() {
        kamera = new GLKamera(1920, 1020);
        kamera.verschiebe(0, -450, -300);
        kamera.setzeBlickpunkt(0, 0, 150);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        Ufo = new Ufo();

        punkteanzeige = new GLTafel(0,0,350,0,0 );
        punkteanzeige.drehe(90,0,0);

        goldanzeige = new GLTafel(0, 0, 300, 50, 25);
        goldanzeige.drehe(90, 0, 0);



        asteroiden = new Asteroid[150];

        for (int i = 0; i < asteroiden.length; i++) {
            asteroiden[i] = new Asteroid(Ufo);

        }

        gold = new gold[10];

        for (int a = 0; a < gold.length; a++) {
            gold[a] = new gold(Ufo);
        }




        fuehreAus();

    }

    public void fuehreAus() {


        while (!tastatur.esc()) {


            if (tastatur.links() && Ufo.gibX() > -400) {
                Ufo.bewegelinks(0.5);
                Ufo.setzeDrehung(0, 0, 20);
            } else if (tastatur.rechts() && Ufo.gibX() < 400) {
                Ufo.bewegerechts(0.5);
                Ufo.setzeDrehung(0, 0, -20);
            } else if (tastatur.oben() &&(!tastatur.shift()&& Ufo.gibZ() < 300)) {
                Ufo.bewegehoch(0.5);
                Ufo.setzeDrehung(0, 20, 0);
            } else if (tastatur.unten()&&(!tastatur.shift() && Ufo.gibZ() > -50)) {
                Ufo.bewegerunter(0.5);
                Ufo.setzeDrehung(0, -20, 0);

            } else if (tastatur.shift() && tastatur.unten()&& Ufo.gibY() > -200) {
                Ufo.bewegehinten(0.5);
            }else if (tastatur.shift()&& tastatur.oben() && Ufo.gibY() < 500) {
                Ufo.bewegevorne(0.5);
            }
            else Ufo.setzeDrehung(0, 0, 0);



            for (int a = 0; a < gold.length; a++) {
                gold[a].bewegen(1);
                if (gold[a].hit()) {
                    zahl = zahl + 100;
                    goldmenge = goldmenge + 1;
                    gold[a].respawn();

                }

            }


            for (int i = 0; i < asteroiden.length; i++) {
                asteroiden[i].bewegeDich(1);
                if (asteroiden[i].gibY() < Ufo.gibY()-20) {
                    asteroiden[i].respawn();
                    zahl = zahl + 1;

                }




                        {
                            punkteanzeige.setzeText("Deine Punktzahl ist:" + zahl / 1, 40);

                        }


                        {
                            goldanzeige.setzeText("gold: " + goldmenge, 25);
                        }


                    }

                    Sys.warte();
                }

                Sys.beenden();
            }
        }

