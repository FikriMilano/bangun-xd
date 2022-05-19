package bangun2d;

import master.Matematika;

public class SegitigaSiku extends Segitiga {

    public SegitigaSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getKeliling() {
        return getAlas() + getTinggi() + getSisiMiring();
    }

    private double getSisiMiring() {
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
