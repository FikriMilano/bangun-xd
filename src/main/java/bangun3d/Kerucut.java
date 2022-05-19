package bangun3d;

import master.Matematika;

public class Kerucut extends Tabung {
    private final double phi = 22.0 / 7;

    public Kerucut(double r, double tinggi) {
        super(r, tinggi);
    }

    @Override
    public double getLuas() {
        return getLuasAlas() + phi * getR() * getSisiMiring();
    }

    public double getSisiMiring() {
        return Matematika.getMiring(getR(), getTinggi());
    }

    public double getVolume() {
        return super.getVolume() / 3;
    }
}
