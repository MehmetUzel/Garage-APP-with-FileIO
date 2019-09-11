public class Kamyonet extends Arac {

    private int kamyonetHacim;

    private String kamyonetIsim;

    public Kamyonet(int tip, String plaka, String kamyonetIsim, int kamyonetHacim){
        super(tip,plaka);
        this.kamyonetHacim = kamyonetHacim;
        this.kamyonetIsim = kamyonetIsim;
    }

    public String toString() {

        return  getPlaka()+" plakalı "+kamyonetIsim;
    }
}
