package bangun3d;

import bangun2d.*;

public class LimasApp {
    public static void main(String[] args) {

        Bangun2D kucut = new Lingkaran(6);
        Limas alasling = new Limas(kucut, 8);
        System.out.println(alasling.getLuas());
        System.out.println(alasling.getVolume());

        System.out.println("-------------------------------------");

        Persegi persegi = new Persegi(10);
        Limas alasper = new Limas(persegi, 12);
        System.out.println(alasper.getLuas());
        System.out.println(alasper.getVolume());

        System.out.println("-------------------------------------");

        PersegiPanjang pp = new PersegiPanjang(6, 5);
        Limas alaspp = new Limas(pp, 4);
        System.out.println(alaspp.getLuas());
        System.out.println(alaspp.getVolume());

        System.out.println("-------------------------------------");

        Segitiga st = new SegitigaSamaKaki(10, 15);
        Limas alasst = new Limas(st, 8);
        System.out.println(alasst.getLuas());
        System.out.println(alasst.getVolume());

        System.out.println("-------------------------------------");
    }
}
