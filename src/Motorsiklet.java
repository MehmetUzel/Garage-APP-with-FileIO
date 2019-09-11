public class Motorsiklet extends Arac {

    private String motorsikletIsim;

    private int motorsikletHacim;

    public Motorsiklet(int tip, String plaka, String motorsikletIsim, int motorsikletHacim){
        super(tip,plaka);
        this.motorsikletHacim = motorsikletHacim;
        this.motorsikletIsim = motorsikletIsim;
    }

    public String toString() {

        return  getPlaka()+" plakalı "+motorsikletIsim;
    }
}
