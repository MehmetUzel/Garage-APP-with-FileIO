public class Otobus extends Arac {

    private int kamyonetHacim;

    private String kamyonetIsim;

    public Otobus(int tip, String plaka, String kamyonetIsim, int kamyonetHacim){
        super(tip,plaka);
        this.kamyonetHacim = kamyonetHacim;
        this.kamyonetIsim = kamyonetIsim;
    }

    public String toString() {

        return  getPlaka()+" plakalı "+kamyonetIsim;
    }
}
