package bangun3d;

import bangun2d.*;

public class Limas {
    private Bangun2D alas;

//    TODO -> Fix rumus luas permukaan
//    private SegitigaSamaKaki sisiTegak;
    private double tinggi;

    public Limas(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
//        TODO -> Fix rumus luas permukaan
//        this.sisiTegak =
    }

    public Bangun2D getAlas() {
        return alas;
    }

    public void setAlas(Bangun2D alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return 3 / alas.getLuas() * tinggi;
    }

//    TODO -> Fix rumus luas permukaan
//    public double getLuasPermukaan() {
//        return alas.getLuas() + alas.getKeliling() * tinggi;
//    }

    public String getDetailAlas() {
        if (alas instanceof Persegi) {
            return "Persegi";
        } else if (alas instanceof PersegiPanjang) {
            return "PersegiPanjang";
        } else if (alas instanceof Lingkaran) {
            return "Lingkaran";
        } else if (alas instanceof SegitigaSiku) {
            return "Segitiga Siku";
        } else if (alas instanceof SegitigaSamaKaki) {
            return "Segitiga Sama Kaki";
        } else if (alas instanceof SegitigaSamaSisi) {
            return "Segitiga Sama Sisi";
        } else {
            return "Unknown";
        }
    }

    @Override
    public String toString() {
        return "Limas{" +
                "alas=" + alas +
                ", tinggi=" + tinggi +
                '}';
    }
}
