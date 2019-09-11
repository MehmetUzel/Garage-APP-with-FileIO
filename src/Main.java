import java.io.*;
import java.util.*;
import java.lang.AutoCloseable;

public class Main {

    public static void main(String[] args) throws Exception {

        int n; /*Kullanıcın belirleyeceği garaj boyutu*/
        //  Arac[] garajimiz; /*Garajımızdaki araçları tutacağımız Arac arrayı*/

        java.io.File readfile = new java.io.File("C:\\Users\\98meh\\IdeaProjects\\Garaj\\src\\garajimiz.txt");
     //   java.io.File writefile = new java.io.File("C:\\Users\\98meh\\IdeaProjects\\Garaj\\src\\garajimiz.txt");

        Scanner input = new Scanner(readfile);

        HashMap<Integer, String> aracIsim = new HashMap<Integer, String>(); /*Aracların tiplerine göre isimleri*/
        HashMap<Integer, Integer> aracHacim = new HashMap<Integer, Integer>(); /*Aracların tiplerine göre hacimleri*/

        aracIsim.put(1, "Bisiklet");
        aracIsim.put(2, "Motorsiklet");
        aracIsim.put(3, "Araba");
        aracIsim.put(4, "Kamyonet");
        aracIsim.put(5, "Otobüs");
        aracIsim.put(6, "Tır");

        aracHacim.put(1, 1);
        aracHacim.put(2, 1);
        aracHacim.put(3, 2);
        aracHacim.put(4, 3);
        aracHacim.put(5, 5);
        aracHacim.put(6, 8);


        Scanner sc = new Scanner(System.in);

        System.out.println("5 ile 50 arasında bir garaj boyutu giriniz : ");

        n = sc.nextInt();

        List<Arac> garajimiz = new ArrayList<>();

        Garaj yenigaraj = new Garaj(n, garajimiz); /*Belirlenen boyutta yeni bir garaj objesi oluşturuyoruz.*/

        while (input.hasNext() == true && input.next().equalsIgnoreCase("GIR")) {
            int tip = input.nextInt();
            String plaka = input.nextLine();
            if (yenigaraj.getGarajBoyutu() >= aracHacim.get(tip)) {
                switch (tip) {
                    case 1: {
                        yenigaraj.getGaraj().add(new Bisiklet(tip, plaka.trim(), aracIsim.get(tip), aracHacim.get(tip)));
                        break;
                    }
                    case 2: {
                        yenigaraj.getGaraj().add(new Motorsiklet(tip, plaka.trim(), aracIsim.get(tip), aracHacim.get(tip)));
                        break;
                    }
                    case 3: {
                        yenigaraj.getGaraj().add(new Araba(tip, plaka.trim(), aracIsim.get(tip), aracHacim.get(tip)));
                        break;
                    }
                    case 4: {
                        yenigaraj.getGaraj().add(new Kamyonet(tip, plaka.trim(), aracIsim.get(tip), aracHacim.get(tip)));
                        break;
                    }
                    case 5: {
                        yenigaraj.getGaraj().add(new Otobus(tip, plaka.trim(), aracIsim.get(tip), aracHacim.get(tip)));
                        break;
                    }
                    case 6: {
                        yenigaraj.getGaraj().add(new Tir(tip, plaka.trim(), aracIsim.get(tip), aracHacim.get(tip)));
                        break;
                    }
                }
                yenigaraj.setGarajBoyutu(yenigaraj.getGarajBoyutu() - aracHacim.get(tip));
                System.out.println("Yeni garaj hacmi " + yenigaraj.getGarajBoyutu());
            }
        }
        input.close();

        // java.io.PrintWriter output = new java.io.PrintWriter(file);

        System.out.println("Yapmak istediğiniz işlemi giriniz (GIR,CIK,LIST,KAPAT)");

        int loop = -1;

        try ( /** Dosya SIFIRLANIYOR BUNU HALLET!!!*/
              FileWriter f = new FileWriter("C:\\\\Users\\\\98meh\\\\IdeaProjects\\\\Garaj\\\\src\\\\garajimiz.txt", true);
              BufferedWriter write = new BufferedWriter(f);
              PrintWriter output = new PrintWriter(write);) {
//        {java.io.PrintWriter output = new java.io.PrintWriter(writefile);

            while (loop < 0) {  /*Kullanıcıdan sürekli girdi almamızı sağlayacak döngü*/

                Scanner ac = new Scanner(System.in);
                Scanner dc = new Scanner(System.in);
                Scanner plate = new Scanner(System.in);
                if (ac.hasNext("GIR")) {
                   // output.println("GIR ");
                    int tip = dc.nextInt();
                   // output.print(tip);
                    String plaka = plate.nextLine();
                    output.println("GIR " + tip + " " + plaka);
                    if (yenigaraj.getGarajBoyutu() >= aracHacim.get(tip)) {
                        switch (tip) {
                            case 1: {
                                yenigaraj.getGaraj().add(new Bisiklet(tip, plaka, aracIsim.get(tip), aracHacim.get(tip)));
                                break;
                            }
                            case 2: {
                                yenigaraj.getGaraj().add(new Motorsiklet(tip, plaka, aracIsim.get(tip), aracHacim.get(tip)));
                                break;
                            }
                            case 3: {
                                yenigaraj.getGaraj().add(new Araba(tip, plaka, aracIsim.get(tip), aracHacim.get(tip)));
                                break;
                            }
                            case 4: {
                                yenigaraj.getGaraj().add(new Kamyonet(tip, plaka, aracIsim.get(tip), aracHacim.get(tip)));
                                break;
                            }
                            case 5: {
                                yenigaraj.getGaraj().add(new Otobus(tip, plaka, aracIsim.get(tip), aracHacim.get(tip)));
                                break;
                            }
                            case 6: {
                                yenigaraj.getGaraj().add(new Tir(tip, plaka, aracIsim.get(tip), aracHacim.get(tip)));
                                break;
                            }
                        }

                        // yenigaraj.getGaraj().add(new Arac(tip, aracIsim.get(tip), aracHacim.get(tip)));
                        yenigaraj.setGarajBoyutu(yenigaraj.getGarajBoyutu() - aracHacim.get(tip));
                        System.out.println("Yeni garaj hacmi " + yenigaraj.getGarajBoyutu());
                    } else {
                        System.out.println("Garaj dolu lütfen araç çıkartın ya da daha küçük boyutlu bir araç giriniz.");
                    }
                } else if (ac.hasNext("LIST")) {
                    if (n != yenigaraj.getGarajBoyutu()) {
                        Iterator iterator = yenigaraj.getGaraj().iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    } else {
                        System.out.println("Garaj boş abi neyi göstermemi bekliyorsun.");
                    }
                } else if (ac.hasNext("CIK")) {
                    if (n != yenigaraj.getGarajBoyutu()) {
                        int tipcik = dc.nextInt();
                        String plakacik = plate.nextLine();
                        //    int index = yenigaraj.findAracByTip(tipcik);
                        int index = yenigaraj.findAracByPlaka(plakacik, tipcik);
                        yenigaraj.getGaraj().remove(index);
                        yenigaraj.setGarajBoyutu(yenigaraj.getGarajBoyutu() + aracHacim.get(tipcik));
                        System.out.println("Yeni garaj hacmi " + yenigaraj.getGarajBoyutu());
                    } else {
                        System.out.println("Garaj boş abi neyi çıkarmamı bekliyorsun.");
                    }
                } else if (ac.hasNext("KAPAT")) {
                    loop = 1;
                    //System.exit(1);
                }


            }

        } catch (IOException i){
            i.printStackTrace();
        }

    }
}
