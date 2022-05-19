package bangun2d;

import master.Matematika;

public class SegitigaSamaSisi extends Segitiga {

    public SegitigaSamaSisi(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getTinggi() {
        return Matematika.getLurus(getAlas(), getAlas() / 2);
    }

    @Override
    public void setTinggi(double tinggi) {
        double alasBaru = Math.sqrt((4.0 / 3) * tinggi * tinggi);
        setAlas(alasBaru);
    }

    @Override
    public double getKeliling() {
        return 3 * getAlas();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
