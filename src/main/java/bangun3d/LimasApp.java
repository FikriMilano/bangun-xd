package bangun3d;

import bangun2d.*;

public class LimasApp {
    public static void main(String[] args) {

        Bangun2D alasLingkaran = new Lingkaran(6);
        Limas limasLingkaran = new Limas(alasLingkaran, 8);
        System.out.println(limasLingkaran);
        System.out.println(limasLingkaran.getLuas());
        System.out.println(limasLingkaran.getVolume());

        System.out.println("-------------------------------------");

        Persegi alasPersegi = new Persegi(10);
        Limas limasPersegi = new Limas(alasPersegi, 12);
        System.out.println(limasPersegi);
        System.out.println(limasPersegi.getLuas());
        System.out.println(limasPersegi.getVolume());

        System.out.println("-------------------------------------");

        PersegiPanjang alasPersegiPanjang = new PersegiPanjang(6, 5);
        Limas limasPersegiPanjang = new Limas(alasPersegiPanjang, 4);
        System.out.println(limasPersegiPanjang);
        System.out.println(limasPersegiPanjang.getLuas());
        System.out.println(limasPersegiPanjang.getVolume());

        System.out.println("-------------------------------------");

        Segitiga alasSegitigaSamaKaki = new SegitigaSamaKaki(10, 15);
        Limas limasSegitigaSamaKaki = new Limas(alasSegitigaSamaKaki, 8);
        System.out.println(limasSegitigaSamaKaki);
        System.out.println(limasSegitigaSamaKaki.getLuas());
        System.out.println(limasSegitigaSamaKaki.getVolume());

        System.out.println("-------------------------------------");
    }
}
