public class Bisiklet extends Arac {

    private int bisikletHacim;

    private String bisikletIsim;

    public Bisiklet(int tip, String plaka, String bisikletIsim, int bisikletHacim){
        super(tip,plaka);
        this.bisikletIsim = bisikletIsim;
        this.bisikletHacim = bisikletHacim;
    }
    public String toString() {

        return  getPlaka()+" plakalı "+bisikletIsim;
    }
}
