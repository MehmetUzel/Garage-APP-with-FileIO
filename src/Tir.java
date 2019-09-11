public class Tir extends Arac {

    private int tirHacim;

    private String tirIsim;

    public Tir(int tip, String plaka, String tirIsim, int tirHacim){
        super(tip,plaka);
        this.tirHacim = tirHacim;
        this.tirIsim = tirIsim;
    }
    public String toString() {

        return  getPlaka()+" plakalı "+tirIsim;
    }
}
