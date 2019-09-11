import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Garaj {

    private List<Arac> garaj = new ArrayList<>(); /* Garajdaki araçlarımızı burada tutuyoruz.*/

    private int garajBoyutu;

    public Garaj(int garajBoyutu, List<Arac> garaj){
        this.garajBoyutu = garajBoyutu;
        this.garaj = garaj;
    }

    public  List<Arac> getGaraj() { return garaj; }

    public void  setGaraj(List<Arac> newGaraj) {garaj = newGaraj;}

    public int findAracByPlaka(String plaka, int tip) {
        for (Arac c : this.garaj){
            if (c.getPlaka().equalsIgnoreCase(plaka) && c.getTip() == tip){
               return this.garaj.indexOf(c);
            }
        }
        return -1;
    }

    public int getGarajBoyutu() {return garajBoyutu;}

    public void setGarajBoyutu(int newBoyut) {garajBoyutu = newBoyut;}

}
