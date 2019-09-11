public class Arac {

    private String isim; /* Aracın ismi. */

    private int tip; /* Aracın tipi. */

    private int hacim; /* Aracın kapladığı alan. */

    private String plaka;

    public Arac(int tip,String plaka){
        this.tip = tip;
        this.plaka = plaka;
    }

    public int getTip(){return tip;}

    public void setTip(int newTip){tip = newTip;}

    public String getIsim(){return isim;}

    public void setIsim(String newIsim){isim = newIsim;}

    public int getHacim(){return hacim;}

    public void setHacim(int newHacim){hacim = newHacim;}

    public String getPlaka(){return plaka;}

    public void setPlaka(String newplaka){plaka = newplaka;}

    /**public Arac getArac(int tip, String isim, int hacim) {
        Arac indexArac = new Arac(tip,isim,hacim);
        return indexArac;
    } */

    public String toString() {

     return  "name";
    }
}
