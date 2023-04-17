import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel;
public Ufo Ufo;




    public Asteroid(Ufo pUfo) {
        kugel = new GLKugel (-750+Math.random()*1500, 1000+Math.random()*4000 , -500+Math.random()*1000, 50+Math.random()*20 , "src/img/Krater.jpg");
        Ufo=pUfo;

    }
    public void bewegeDich(double speed) {
        kugel.verschiebe(0,  -1-speed * 0.0003, 0);
        kugel.drehe(4.1, 2.1, 3.1);
        if (getroffen()) {
            Ufo.explodiere();

            }
        }




    public double gibX() {
        return kugel.gibX();
    }

    public double gibY() {
        return kugel.gibY();
    }

    public double gibZ() {
        return kugel.gibZ();
    }

    public boolean getroffen() {
        double abstand = Math.sqrt(
                        Math.pow(this.gibX() - Ufo.gibX(), 2) +
                        Math.pow(this.gibY() - Ufo.gibY(), 2) +
                        Math.pow(this.gibZ() - Ufo.gibZ(), 2)
        );
        if (abstand < 70) {
            return true;
        }
        else{
            return false;
        }
    }




        public void respawn() {
        kugel.setzePosition(-1000+Math.random()*2000, 2000+Math.random()*1000 , -300+Math.random()*800);
        kugel.setzeSichtbarkeit(true);

    }


    }


