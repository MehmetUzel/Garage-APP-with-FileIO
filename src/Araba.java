public class Araba extends Arac {

    private int arabaHacim;

    private String arabaIsim;

    public Araba(int tip, String plaka, String arabaIsim, int arabaHacim){
        super(tip,plaka);
        this.arabaIsim = arabaIsim;
        this.arabaHacim = arabaHacim;
    }

    public String toString() {

        return  getPlaka()+" plakalı "+arabaIsim;
    }

}
