package bangun3d;

import bangun2d.*;
import master.Matematika;

public class Limas {
    private Bangun2D alas;
    private double tinggi;

    public Limas(Bangun2D alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
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
        return (alas.getLuas() * tinggi) / 3;
    }

    public double getLuasAlas() {
        return alas.getLuas();
    }

    public double getLuas() {
        if (alas instanceof Persegi) {
            double a = Matematika.getMiring(((Persegi) alas).getSisi() / 2, tinggi);
            double b = ((Persegi) alas).getSisi() * a / 2;
            return alas.getLuas() + b * 4;
        } else if (alas instanceof PersegiPanjang) {
            double a = Matematika.getMiring(((PersegiPanjang) alas).getPanjang() / 2, tinggi);
            double b = Matematika.getMiring(((PersegiPanjang) alas).getLebar() / 2, tinggi);
            double c = ((PersegiPanjang) alas).getLebar() * a / 2;
            double d = ((PersegiPanjang) alas).getPanjang() * b / 2;
            return alas.getLuas() + (2 * c) + (2 * d);
        } else if (alas instanceof Segitiga) {
            return alas.getLuas() * 3;
        } else if (alas instanceof Lingkaran) {
            double s = ((Lingkaran) alas).getR() * ((Lingkaran) alas).getR() + tinggi * tinggi;
            double sf = Math.sqrt(s);
            double selimut = Matematika.phi * ((Lingkaran) alas).getR() * sf;
            return alas.getLuas() + selimut;
        } else {
            return 0;
        }
    }

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
