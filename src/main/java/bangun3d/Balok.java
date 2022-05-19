package bangun3d;

import bangun2d.PersegiPanjang;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public Balok(double panjang, double lebar) {
        super(panjang, lebar);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * (getPanjang() * getLebar() + getPanjang() * tinggi + getLebar() * tinggi);
    }

    @Override
    public double getKeliling() {
        return 4 * (getPanjang() + getLebar() + tinggi);
    }

    public double getLuasAlas() {
        return super.getLuas();
    }

    public double getVolume() {
        return super.getLuas() * tinggi;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "panjang=" + getPanjang() +
                ", lebar=" + getLebar() +
                ", tinggi=" + tinggi +
                '}';
    }
}
